package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import defpackage.ape;
import defpackage.b87;
import defpackage.d6z;
import defpackage.gno;
import defpackage.gyc;
import defpackage.jmm;
import defpackage.lk91;
import defpackage.lno;
import defpackage.mmm;
import defpackage.mn91;
import defpackage.mno;
import defpackage.ny61;
import defpackage.oxe;
import defpackage.piv;
import defpackage.rcf;
import defpackage.tw21;
import defpackage.twy;
import defpackage.vyc0;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.player.impl.drm.MediaDrmCallbackImpl;

/* loaded from: classes10.dex */
public final class a implements jmm {
    public final List a;
    public final mno b;
    public final b c;
    public final gyc d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final ape i;
    public final twy j;
    public final vyc0 k;
    public final MediaDrmCallbackImpl l;
    public final UUID m;
    public final Looper n;
    public final DefaultDrmSession$ResponseHandler o;
    public int p;
    public int q;
    public HandlerThread r;
    public DefaultDrmSession$RequestHandler s;
    public rcf t;
    public DrmSession$DrmSessionException u;
    public byte[] v;
    public byte[] w;
    public gno x;
    public lno y;

    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.media3.exoplayer.drm.DefaultDrmSession$ResponseHandler] */
    public a(UUID uuid, mno mnoVar, b bVar, gyc gycVar, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap hashMap, MediaDrmCallbackImpl mediaDrmCallbackImpl, Looper looper, twy twyVar, vyc0 vyc0Var) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = bVar;
        this.d = gycVar;
        this.b = mnoVar;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = mediaDrmCallbackImpl;
        this.i = new ape();
        this.j = twyVar;
        this.k = vyc0Var;
        this.p = 2;
        this.n = looper;
        this.o = new Handler(looper) { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$ResponseHandler
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Set set;
                Set set2;
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i2 = message.what;
                if (i2 == 1) {
                    a aVar = a.this;
                    b bVar2 = aVar.c;
                    if (obj == aVar.y) {
                        if (aVar.p == 2 || aVar.k()) {
                            aVar.y = null;
                            if (obj2 instanceof Exception) {
                                bVar2.a((Exception) obj2, false);
                                return;
                            }
                            try {
                                aVar.b.provideProvisionResponse((byte[]) obj2);
                                bVar2.b = null;
                                HashSet hashSet = bVar2.a;
                                ImmutableList l = ImmutableList.l(hashSet);
                                hashSet.clear();
                                piv listIterator = l.listIterator(0);
                                while (listIterator.hasNext()) {
                                    a aVar2 = (a) listIterator.next();
                                    if (aVar2.n()) {
                                        aVar2.j(true);
                                    }
                                }
                                return;
                            } catch (Exception e) {
                                bVar2.a(e, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (i2 != 2) {
                    return;
                }
                a aVar3 = a.this;
                if (obj == aVar3.x && aVar3.k()) {
                    aVar3.x = null;
                    if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                        aVar3.m((Throwable) obj2, false);
                        return;
                    }
                    try {
                        byte[] bArr2 = (byte[]) obj2;
                        int i3 = aVar3.e;
                        mno mnoVar2 = aVar3.b;
                        if (i3 == 3) {
                            byte[] bArr3 = aVar3.w;
                            int i4 = tw21.a;
                            mnoVar2.provideKeyResponse(bArr3, bArr2);
                            ape apeVar = aVar3.i;
                            synchronized (apeVar.a) {
                                set2 = apeVar.c;
                            }
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                ((mmm) it.next()).b();
                            }
                            return;
                        }
                        byte[] provideKeyResponse = mnoVar2.provideKeyResponse(aVar3.v, bArr2);
                        int i5 = aVar3.e;
                        if ((i5 == 2 || (i5 == 0 && aVar3.w != null)) && provideKeyResponse != null && provideKeyResponse.length != 0) {
                            aVar3.w = provideKeyResponse;
                        }
                        aVar3.p = 4;
                        ape apeVar2 = aVar3.i;
                        synchronized (apeVar2.a) {
                            set = apeVar2.c;
                        }
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            ((mmm) it2.next()).a();
                        }
                    } catch (Exception | NoSuchMethodError e2) {
                        aVar3.m(e2, true);
                    }
                }
            }
        };
    }

    @Override // defpackage.jmm
    public final boolean a() {
        q();
        return this.f;
    }

    @Override // defpackage.jmm
    public final rcf b() {
        q();
        return this.t;
    }

    @Override // defpackage.jmm
    public final Map d() {
        q();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.b.queryKeyStatus(bArr);
    }

    @Override // defpackage.jmm
    public final void e(mmm mmmVar) {
        q();
        if (this.q < 0) {
            lk91.e("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (mmmVar != null) {
            ape apeVar = this.i;
            synchronized (apeVar.a) {
                try {
                    ArrayList arrayList = new ArrayList(apeVar.w);
                    arrayList.add(mmmVar);
                    apeVar.w = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) apeVar.b.get(mmmVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(apeVar.c);
                        hashSet.add(mmmVar);
                        apeVar.c = Collections.unmodifiableSet(hashSet);
                    }
                    apeVar.b.put(mmmVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            d6z.x(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new DefaultDrmSession$RequestHandler(this, this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (mmmVar != null && k() && this.i.a(mmmVar) == 1) {
            mmmVar.d(this.p);
        }
        c cVar = (c) this.d.a;
        if (cVar.l != -9223372036854775807L) {
            cVar.o.remove(this);
            Handler handler = cVar.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.jmm
    public final UUID f() {
        q();
        return this.m;
    }

    @Override // defpackage.jmm
    public final byte[] g() {
        q();
        return this.w;
    }

    @Override // defpackage.jmm
    public final DrmSession$DrmSessionException getError() {
        q();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // defpackage.jmm
    public final int getState() {
        q();
        return this.p;
    }

    @Override // defpackage.jmm
    public final void h(mmm mmmVar) {
        q();
        int i = this.q;
        if (i <= 0) {
            lk91.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            DefaultDrmSession$ResponseHandler defaultDrmSession$ResponseHandler = this.o;
            int i3 = tw21.a;
            defaultDrmSession$ResponseHandler.removeCallbacksAndMessages(null);
            this.s.release();
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.closeSession(bArr);
                this.v = null;
            }
        }
        if (mmmVar != null) {
            ape apeVar = this.i;
            synchronized (apeVar.a) {
                try {
                    Integer num = (Integer) apeVar.b.get(mmmVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(apeVar.w);
                        arrayList.remove(mmmVar);
                        apeVar.w = Collections.unmodifiableList(arrayList);
                        int intValue = num.intValue();
                        HashMap hashMap = apeVar.b;
                        if (intValue == 1) {
                            hashMap.remove(mmmVar);
                            HashSet hashSet = new HashSet(apeVar.c);
                            hashSet.remove(mmmVar);
                            apeVar.c = Collections.unmodifiableSet(hashSet);
                        } else {
                            hashMap.put(mmmVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.i.a(mmmVar) == 0) {
                mmmVar.f();
            }
        }
        gyc gycVar = this.d;
        int i4 = this.q;
        c cVar = (c) gycVar.a;
        if (i4 == 1 && cVar.p > 0 && cVar.l != -9223372036854775807L) {
            cVar.o.add(this);
            Handler handler = cVar.u;
            handler.getClass();
            handler.postAtTime(new oxe(20, this), this, SystemClock.uptimeMillis() + cVar.l);
        } else if (i4 == 0) {
            cVar.m.remove(this);
            if (cVar.r == this) {
                cVar.r = null;
            }
            if (cVar.s == this) {
                cVar.s = null;
            }
            b bVar = cVar.i;
            HashSet hashSet2 = bVar.a;
            hashSet2.remove(this);
            if (bVar.b == this) {
                bVar.b = null;
                if (!hashSet2.isEmpty()) {
                    a aVar = (a) hashSet2.iterator().next();
                    bVar.b = aVar;
                    lno provisionRequest = aVar.b.getProvisionRequest();
                    aVar.y = provisionRequest;
                    DefaultDrmSession$RequestHandler defaultDrmSession$RequestHandler = aVar.s;
                    int i5 = tw21.a;
                    provisionRequest.getClass();
                    defaultDrmSession$RequestHandler.post(1, provisionRequest, true);
                }
            }
            if (cVar.l != -9223372036854775807L) {
                Handler handler2 = cVar.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                cVar.o.remove(this);
            }
        }
        cVar.f();
    }

    @Override // defpackage.jmm
    public final boolean i(String str) {
        q();
        byte[] bArr = this.v;
        d6z.z(bArr);
        return this.b.requiresSecureDecoder(bArr, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:61|62|63|(6:65|66|67|68|(1:70)|72)|75|66|67|68|(0)|72) */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0087 A[Catch: NumberFormatException -> 0x008b, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x008b, blocks: (B:68:0x007f, B:70:0x0087), top: B:67:0x007f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z) {
        long j;
        Pair pair;
        String str;
        String str2;
        long min;
        Set set;
        if (this.g) {
            return;
        }
        byte[] bArr = this.v;
        int i = tw21.a;
        int i2 = this.e;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.w == null || p()) {
                    o(2, bArr, z);
                    return;
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
            this.w.getClass();
            this.v.getClass();
            o(3, this.w, z);
            return;
        }
        if (this.w == null) {
            o(1, bArr, z);
            return;
        }
        if (this.p == 4 || p()) {
            if (b87.d.equals(this.m)) {
                Map d = d();
                if (d == null) {
                    pair = null;
                } else {
                    long j2 = -9223372036854775807L;
                    try {
                        str2 = (String) d.get("LicenseDurationRemaining");
                    } catch (NumberFormatException unused) {
                    }
                    if (str2 != null) {
                        j = Long.parseLong(str2);
                        Long valueOf = Long.valueOf(j);
                        str = (String) d.get("PlaybackDurationRemaining");
                        if (str != null) {
                            j2 = Long.parseLong(str);
                        }
                        pair = new Pair(valueOf, Long.valueOf(j2));
                    }
                    j = -9223372036854775807L;
                    Long valueOf2 = Long.valueOf(j);
                    str = (String) d.get("PlaybackDurationRemaining");
                    if (str != null) {
                    }
                    pair = new Pair(valueOf2, Long.valueOf(j2));
                }
                pair.getClass();
                min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                min = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            }
            if (this.e == 0 && min <= 60) {
                lk91.d("Offline license has expired or will expire soon. Remaining seconds: " + min);
                o(2, bArr, z);
                return;
            }
            if (min <= 0) {
                l(2, new KeysExpiredException());
                return;
            }
            this.p = 4;
            ape apeVar = this.i;
            synchronized (apeVar.a) {
                set = apeVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((mmm) it.next()).c();
            }
        }
    }

    public final boolean k() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    public final void l(int i, Throwable th) {
        int i2;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = tw21.A(tw21.B(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (tw21.a < 23 || !(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !mn91.g(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof UnsupportedDrmException) {
                        i2 = 6001;
                    } else if (th instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                        i2 = 6003;
                    } else if (th instanceof KeysExpiredException) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            w511.q();
                            return;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new DrmSession$DrmSessionException(i2, th);
        lk91.f("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            ape apeVar = this.i;
            synchronized (apeVar.a) {
                set = apeVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((mmm) it.next()).e((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            ny61.h("Unexpected Throwable subclass", th);
            return;
        } else if (!mn91.h(th) && !mn91.g(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void m(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || mn91.g(th)) {
            this.c.b(this);
        } else {
            l(z ? 1 : 2, th);
        }
    }

    public final boolean n() {
        Set set;
        if (k()) {
            return true;
        }
        try {
            try {
                byte[] openSession = this.b.openSession();
                this.v = openSession;
                this.b.setPlayerIdForSession(openSession, this.k);
                this.t = this.b.createCryptoConfig(this.v);
                this.p = 3;
                ape apeVar = this.i;
                synchronized (apeVar.a) {
                    set = apeVar.c;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((mmm) it.next()).d(3);
                }
                this.v.getClass();
                return true;
            } catch (NotProvisionedException unused) {
                this.c.b(this);
                return false;
            }
        } catch (Exception | NoSuchMethodError e) {
            if (mn91.g(e)) {
                this.c.b(this);
                return false;
            }
            l(1, e);
            return false;
        }
    }

    public final void o(int i, byte[] bArr, boolean z) {
        try {
            gno keyRequest = this.b.getKeyRequest(bArr, this.a, i, this.h);
            this.x = keyRequest;
            DefaultDrmSession$RequestHandler defaultDrmSession$RequestHandler = this.s;
            int i2 = tw21.a;
            keyRequest.getClass();
            defaultDrmSession$RequestHandler.post(2, keyRequest, z);
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final boolean p() {
        try {
            this.b.restoreKeys(this.v, this.w);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            l(1, e);
            return false;
        }
    }

    public final void q() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.n;
        if (currentThread != looper.getThread()) {
            lk91.k("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
