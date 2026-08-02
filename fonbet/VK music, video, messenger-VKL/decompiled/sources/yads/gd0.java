package yads;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import xsna.ful0;

/* loaded from: classes10.dex */
public final class gd0 implements tk0 {
    public final UUID b;
    public final nn0 c;
    public final y11 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final ed0 i;
    public final ae0 j;
    public final fd0 k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public pn0 q;
    public zc0 r;
    public zc0 s;
    public Looper t;
    public Handler u;
    public int v;
    public byte[] w;
    public zf2 x;
    public volatile bd0 y;

    public gd0(UUID uuid, nn0 nn0Var, y11 y11Var, HashMap hashMap, boolean z, int[] iArr, boolean z2, ae0 ae0Var, long j) {
        ni.a(uuid);
        ni.a("Use C.CLEARKEY_UUID instead", !jr.b.equals(uuid));
        this.b = uuid;
        this.c = nn0Var;
        this.d = y11Var;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = ae0Var;
        this.i = new ed0();
        this.k = new fd0(this);
        this.v = 0;
        this.m = new ArrayList();
        this.n = pz2.a();
        this.o = pz2.a();
        this.l = j;
    }

    public final nk0 a(Looper looper, pk0 pk0Var, nx0 nx0Var, boolean z) {
        ArrayList arrayList;
        if (this.y == null) {
            this.y = new bd0(this, looper);
        }
        lk0 lk0Var = nx0Var.p;
        int i = 0;
        zc0 zc0Var = null;
        if (lk0Var == null) {
            int d = iu1.d(nx0Var.m);
            pn0 pn0Var = this.q;
            pn0Var.getClass();
            if (pn0Var.b() != 2 || !vx0.d) {
                int[] iArr = this.g;
                while (true) {
                    if (i >= iArr.length) {
                        break;
                    }
                    if (iArr[i] != d) {
                        i++;
                    } else if (i != -1 && pn0Var.b() != 1) {
                        zc0 zc0Var2 = this.r;
                        if (zc0Var2 == null) {
                            p51 p51Var = s51.c;
                            zc0 a = a(tn2.f, true, (pk0) null, z);
                            this.m.add(a);
                            this.r = a;
                        } else {
                            zc0Var2.b(null);
                        }
                        return this.r;
                    }
                }
            }
            return null;
        }
        if (this.w == null) {
            arrayList = a(lk0Var, this.b, false);
            if (arrayList.isEmpty()) {
                cd0 cd0Var = new cd0(this.b);
                ji1.b("DefaultDrmSessionMgr", ji1.a("DRM error", cd0Var));
                if (pk0Var != null) {
                    pk0Var.a(cd0Var);
                }
                return new tm0(new mk0(cd0Var, AuthCode.StatusCode.CERT_FINGERPRINT_ERROR));
            }
        } else {
            arrayList = null;
        }
        if (this.f) {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zc0 zc0Var3 = (zc0) it.next();
                if (mc3.a(zc0Var3.a, arrayList)) {
                    zc0Var = zc0Var3;
                    break;
                }
            }
        } else {
            zc0Var = this.s;
        }
        if (zc0Var != null) {
            zc0Var.b(pk0Var);
            return zc0Var;
        }
        zc0 a2 = a((List) arrayList, false, pk0Var, z);
        if (!this.f) {
            this.s = a2;
        }
        this.m.add(a2);
        return a2;
    }

    @Override // yads.tk0
    public final nk0 b(pk0 pk0Var, nx0 nx0Var) {
        if (this.p <= 0) {
            throw new IllegalStateException();
        }
        Looper looper = this.t;
        if (looper != null) {
            return a(looper, pk0Var, nx0Var, true);
        }
        throw new IllegalStateException();
    }

    @Override // yads.tk0
    public final void prepare() {
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            nn0 nn0Var = this.c;
            UUID uuid = this.b;
            ((ful0) nn0Var).getClass();
            pn0 b = xx0.b(uuid);
            this.q = b;
            b.a(new ad0(this));
            return;
        }
        if (this.l != C.TIME_UNSET) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                ((zc0) this.m.get(i2)).b(null);
            }
        }
    }

    @Override // yads.tk0
    public final void release() {
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((zc0) arrayList.get(i2)).a((pk0) null);
            }
        }
        nb3 it = x51.a(this.n).iterator();
        while (it.hasNext()) {
            ((dd0) it.next()).release();
        }
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            pn0 pn0Var = this.q;
            pn0Var.getClass();
            pn0Var.release();
            this.q = null;
        }
    }

    public final zc0 a(List list, boolean z, pk0 pk0Var) {
        this.q.getClass();
        boolean z2 = this.h | z;
        UUID uuid = this.b;
        pn0 pn0Var = this.q;
        ed0 ed0Var = this.i;
        fd0 fd0Var = this.k;
        int i = this.v;
        byte[] bArr = this.w;
        HashMap hashMap = this.e;
        y11 y11Var = this.d;
        Looper looper = this.t;
        looper.getClass();
        ae0 ae0Var = this.j;
        zf2 zf2Var = this.x;
        zf2Var.getClass();
        zc0 zc0Var = new zc0(uuid, pn0Var, ed0Var, fd0Var, list, i, z2, z, bArr, hashMap, y11Var, looper, ae0Var, zf2Var);
        zc0Var.b(pk0Var);
        if (this.l != C.TIME_UNSET) {
            zc0Var.b(null);
        }
        return zc0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if ((r1.getCause() instanceof android.media.ResourceBusyException) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r1.getCause() instanceof android.media.ResourceBusyException) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zc0 a(List list, boolean z, pk0 pk0Var, boolean z2) {
        zc0 a = a(list, z, pk0Var);
        if (a.o == 1) {
            if (mc3.a >= 19) {
                mk0 c = a.c();
                c.getClass();
            }
            if (!this.o.isEmpty()) {
                nb3 it = x51.a(this.o).iterator();
                while (it.hasNext()) {
                    ((nk0) it.next()).a((pk0) null);
                }
                a.a(pk0Var);
                if (this.l != C.TIME_UNSET) {
                    a.a((pk0) null);
                }
                a = a(list, z, pk0Var);
            }
        }
        if (a.o == 1) {
            if (mc3.a >= 19) {
                mk0 c2 = a.c();
                c2.getClass();
            }
            if (z2 && !this.n.isEmpty()) {
                nb3 it2 = x51.a(this.n).iterator();
                while (it2.hasNext()) {
                    ((dd0) it2.next()).release();
                }
                if (!this.o.isEmpty()) {
                    nb3 it3 = x51.a(this.o).iterator();
                    while (it3.hasNext()) {
                        ((nk0) it3.next()).a((pk0) null);
                    }
                }
                a.a(pk0Var);
                if (this.l != C.TIME_UNSET) {
                    a.a((pk0) null);
                }
                return a(list, z, pk0Var);
            }
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        return 0;
     */
    @Override // yads.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(nx0 nx0Var) {
        pn0 pn0Var = this.q;
        pn0Var.getClass();
        int b = pn0Var.b();
        lk0 lk0Var = nx0Var.p;
        if (lk0Var == null) {
            int d = iu1.d(nx0Var.m);
            int[] iArr = this.g;
            int i = 0;
            while (true) {
                if (i >= iArr.length) {
                    break;
                }
                if (iArr[i] != d) {
                    i++;
                } else if (i != -1) {
                }
            }
        } else if (this.w == null) {
            if (a(lk0Var, this.b, true).isEmpty()) {
                if (lk0Var.e == 1 && lk0Var.b[0].a(jr.b)) {
                    ji1.d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.b);
                }
                return 1;
            }
            String str = lk0Var.d;
            if (str != null && !C.CENC_TYPE_cenc.equals(str) && (!C.CENC_TYPE_cbcs.equals(str) ? C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) : mc3.a < 25)) {
                return 1;
            }
        }
        return b;
    }

    @Override // yads.tk0
    public final sk0 a(pk0 pk0Var, nx0 nx0Var) {
        if (this.p > 0) {
            if (this.t != null) {
                dd0 dd0Var = new dd0(this, pk0Var);
                dd0Var.a(nx0Var);
                return dd0Var;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // yads.tk0
    public final void a(Looper looper, zf2 zf2Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else if (looper2 == looper) {
                    this.u.getClass();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.x = zf2Var;
    }

    public static ArrayList a(lk0 lk0Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(lk0Var.e);
        for (int i = 0; i < lk0Var.e; i++) {
            kk0 kk0Var = lk0Var.b[i];
            if ((kk0Var.a(uuid) || (jr.c.equals(uuid) && kk0Var.a(jr.b))) && (kk0Var.f != null || z)) {
                arrayList.add(kk0Var);
            }
        }
        return arrayList;
    }
}
