package yads;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.WidevineUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import xsna.ac20;
import xsna.bjn0;
import xsna.rft0;
import xsna.s7o0;
import xsna.xul0;

/* loaded from: classes10.dex */
public final class zc0 implements nk0 {
    public final List a;
    public final pn0 b;
    public final tc0 c;
    public final uc0 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final a00 i;
    public final ae0 j;
    public final zf2 k;
    public final y11 l;
    public final UUID m;
    public final xc0 n;
    public int o;
    public int p;
    public HandlerThread q;
    public vc0 r;
    public k20 s;
    public mk0 t;
    public byte[] u;
    public byte[] v;
    public ln0 w;
    public on0 x;

    public zc0(UUID uuid, pn0 pn0Var, ed0 ed0Var, fd0 fd0Var, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap hashMap, y11 y11Var, Looper looper, ae0 ae0Var, zf2 zf2Var) {
        if (i == 1 || i == 3) {
            ni.a(bArr);
        }
        this.m = uuid;
        this.c = ed0Var;
        this.d = fd0Var;
        this.b = pn0Var;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            this.a = Collections.unmodifiableList((List) ni.a(list));
        }
        this.h = hashMap;
        this.l = y11Var;
        this.i = new a00();
        this.j = ae0Var;
        this.k = zf2Var;
        this.o = 2;
        this.n = new xc0(this, looper);
    }

    public final void a(iz izVar) {
        Set set;
        a00 a00Var = this.i;
        synchronized (a00Var.b) {
            set = a00Var.d;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            izVar.accept((pk0) it.next());
        }
    }

    @Override // yads.nk0
    public final void b(pk0 pk0Var) {
        if (this.p < 0) {
            ji1.b("DefaultDrmSession", "Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        if (pk0Var != null) {
            a00 a00Var = this.i;
            synchronized (a00Var.b) {
                try {
                    ArrayList arrayList = new ArrayList(a00Var.e);
                    arrayList.add(pk0Var);
                    a00Var.e = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) a00Var.c.get(pk0Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(a00Var.d);
                        hashSet.add(pk0Var);
                        a00Var.d = Collections.unmodifiableSet(hashSet);
                    }
                    a00Var.c.put(pk0Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.p + 1;
        this.p = i;
        if (i == 1) {
            if (this.o != 2) {
                throw new IllegalStateException();
            }
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new vc0(this, this.q.getLooper());
            if (f()) {
                a(true);
            }
        } else if (pk0Var != null && e() && this.i.a(pk0Var) == 1) {
            pk0Var.a(this.o);
        }
        fd0 fd0Var = (fd0) this.d;
        gd0 gd0Var = fd0Var.a;
        if (gd0Var.l != C.TIME_UNSET) {
            gd0Var.o.remove(this);
            Handler handler = fd0Var.a.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // yads.nk0
    public final mk0 c() {
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // yads.nk0
    public final k20 d() {
        return this.s;
    }

    public final boolean e() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    public final boolean f() {
        if (e()) {
            return true;
        }
        try {
            byte[] c = this.b.c();
            this.u = c;
            this.b.a(c, this.k);
            this.s = this.b.d(this.u);
            this.o = 3;
            a(new rft0(4));
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ed0 ed0Var = (ed0) this.c;
            ed0Var.a.add(this);
            if (ed0Var.b == null) {
                ed0Var.b = this;
                on0 a = this.b.a();
                this.x = a;
                vc0 vc0Var = this.r;
                int i = mc3.a;
                a.getClass();
                vc0Var.getClass();
                vc0Var.obtainMessage(0, new wc0(wg1.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), a)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            a(1, e);
            return false;
        }
    }

    public final Map g() {
        byte[] bArr = this.u;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }

    @Override // yads.nk0
    public final int getState() {
        return this.o;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:48|(2:49|50)|(6:52|53|54|55|(1:57)|59)|62|53|54|55|(0)|59) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093 A[Catch: NumberFormatException -> 0x0097, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0097, blocks: (B:55:0x008b, B:57:0x0093), top: B:54:0x008b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        long j;
        Pair pair;
        String str;
        String str2;
        long min;
        if (this.g) {
            return;
        }
        byte[] bArr = this.u;
        int i = mc3.a;
        int i2 = this.e;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.v.getClass();
                this.u.getClass();
                a(this.v, 3, z);
                return;
            }
            byte[] bArr2 = this.v;
            if (bArr2 != null) {
                try {
                    this.b.a(bArr, bArr2);
                } catch (Exception e) {
                    a(1, e);
                    return;
                }
            }
            a(bArr, 2, z);
            return;
        }
        byte[] bArr3 = this.v;
        if (bArr3 == null) {
            a(bArr, 1, z);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.a(bArr, bArr3);
            } catch (Exception e2) {
                a(1, e2);
                return;
            }
        }
        if (jr.d.equals(this.m)) {
            Map g = g();
            if (g == null) {
                pair = null;
            } else {
                long j2 = C.TIME_UNSET;
                try {
                    str2 = (String) g.get(WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING);
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j);
                    str = (String) g.get(WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING);
                    if (str != null) {
                        j2 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j2));
                }
                j = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j);
                str = (String) g.get(WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING);
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j2));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (this.e == 0 && min <= 60) {
            ji1.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            a(bArr, 2, z);
            return;
        }
        if (min <= 0) {
            a(2, new oe1());
        } else {
            this.o = 4;
            a(new s7o0(6));
        }
    }

    @Override // yads.nk0
    public final UUID b() {
        return this.m;
    }

    public final void a(Object obj, Object obj2) {
        if (obj == this.w && e()) {
            this.w = null;
            if (obj2 instanceof Exception) {
                Exception exc = (Exception) obj2;
                if (exc instanceof NotProvisionedException) {
                    ed0 ed0Var = (ed0) this.c;
                    ed0Var.a.add(this);
                    if (ed0Var.b != null) {
                        return;
                    }
                    ed0Var.b = this;
                    on0 a = this.b.a();
                    this.x = a;
                    vc0 vc0Var = this.r;
                    int i = mc3.a;
                    a.getClass();
                    vc0Var.getClass();
                    vc0Var.obtainMessage(0, new wc0(wg1.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), a)).sendToTarget();
                    return;
                }
                a(2, exc);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.e == 3) {
                    pn0 pn0Var = this.b;
                    byte[] bArr2 = this.v;
                    int i2 = mc3.a;
                    pn0Var.b(bArr2, bArr);
                    a(new xul0(10));
                    return;
                }
                byte[] b = this.b.b(this.u, bArr);
                int i3 = this.e;
                if ((i3 == 2 || (i3 == 0 && this.v != null)) && b != null && b.length != 0) {
                    this.v = b;
                }
                this.o = 4;
                a(new bjn0(8));
            } catch (Exception e) {
                if (e instanceof NotProvisionedException) {
                    ed0 ed0Var2 = (ed0) this.c;
                    ed0Var2.a.add(this);
                    if (ed0Var2.b != null) {
                        return;
                    }
                    ed0Var2.b = this;
                    on0 a2 = this.b.a();
                    this.x = a2;
                    vc0 vc0Var2 = this.r;
                    int i4 = mc3.a;
                    a2.getClass();
                    vc0Var2.getClass();
                    vc0Var2.obtainMessage(0, new wc0(wg1.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), a2)).sendToTarget();
                    return;
                }
                a(1, e);
            }
        }
    }

    @Override // yads.nk0
    public final boolean a() {
        return this.f;
    }

    public final void a(byte[] bArr, int i, boolean z) {
        try {
            ln0 a = this.b.a(bArr, this.a, i, this.h);
            this.w = a;
            vc0 vc0Var = this.r;
            int i2 = mc3.a;
            a.getClass();
            vc0Var.getClass();
            vc0Var.obtainMessage(1, new wc0(wg1.a.getAndIncrement(), z, SystemClock.elapsedRealtime(), a)).sendToTarget();
        } catch (Exception e) {
            if (e instanceof NotProvisionedException) {
                ed0 ed0Var = (ed0) this.c;
                ed0Var.a.add(this);
                if (ed0Var.b != null) {
                    return;
                }
                ed0Var.b = this;
                on0 a2 = this.b.a();
                this.x = a2;
                vc0 vc0Var2 = this.r;
                int i3 = mc3.a;
                a2.getClass();
                vc0Var2.getClass();
                vc0Var2.obtainMessage(0, new wc0(wg1.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), a2)).sendToTarget();
                return;
            }
            a(1, e);
        }
    }

    @Override // yads.nk0
    public final void a(pk0 pk0Var) {
        int i = this.p;
        if (i <= 0) {
            ji1.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.o = 0;
            xc0 xc0Var = this.n;
            int i3 = mc3.a;
            xc0Var.removeCallbacksAndMessages(null);
            vc0 vc0Var = this.r;
            synchronized (vc0Var) {
                vc0Var.removeCallbacksAndMessages(null);
                vc0Var.a = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.b(bArr);
                this.u = null;
            }
        }
        if (pk0Var != null) {
            this.i.b(pk0Var);
            if (this.i.a(pk0Var) == 0) {
                pk0Var.d();
            }
        }
        ((fd0) this.d).a(this, this.p);
    }

    @Override // yads.nk0
    public final boolean a(String str) {
        pn0 pn0Var = this.b;
        byte[] bArr = this.u;
        if (bArr != null) {
            return pn0Var.a(str, bArr);
        }
        throw new IllegalStateException();
    }

    public final void a(int i, Exception exc) {
        int i2;
        int i3 = mc3.a;
        if (i3 >= 21 && vk0.a(exc)) {
            i2 = vk0.b(exc);
        } else {
            if (i3 < 23 || !wk0.a(exc)) {
                if (i3 < 18 || !uk0.b(exc)) {
                    if (i3 >= 18 && uk0.a(exc)) {
                        i2 = 6007;
                    } else if (exc instanceof pb3) {
                        i2 = AuthCode.StatusCode.WAITING_CONNECT;
                    } else if (exc instanceof cd0) {
                        i2 = AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
                    } else if (exc instanceof oe1) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = AuthCode.StatusCode.PERMISSION_NOT_EXIST;
                        } else if (i != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i2 = AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
            }
            i2 = AuthCode.StatusCode.PERMISSION_EXPIRED;
        }
        this.t = new mk0(exc, i2);
        ji1.b("DefaultDrmSession", ji1.a("DRM session error", exc));
        a(new ac20(exc, 29));
        if (this.o != 4) {
            this.o = 1;
        }
    }
}
