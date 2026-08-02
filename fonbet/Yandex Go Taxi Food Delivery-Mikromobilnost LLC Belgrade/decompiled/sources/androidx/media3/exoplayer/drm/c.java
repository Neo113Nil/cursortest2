package androidx.media3.exoplayer.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import defpackage.aao;
import defpackage.b87;
import defpackage.d6z;
import defpackage.eh20;
import defpackage.gyc;
import defpackage.h221;
import defpackage.jmm;
import defpackage.kno;
import defpackage.lk91;
import defpackage.mmm;
import defpackage.mn91;
import defpackage.mno;
import defpackage.pfs;
import defpackage.pmm;
import defpackage.qah;
import defpackage.qmm;
import defpackage.tw21;
import defpackage.twy;
import defpackage.vyc0;
import defpackage.zgf;
import defpackage.zvg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import ru.yandex.video.m3.player.impl.drm.MediaDrmCallbackImpl;

/* loaded from: classes10.dex */
public final class c implements qmm {
    public final UUID b;
    public final kno c;
    public final MediaDrmCallbackImpl d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final b i;
    public final twy j;
    public final gyc k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public mno q;
    public a r;
    public a s;
    public Looper t;
    public Handler u;
    public int v;
    public byte[] w;
    public vyc0 x;
    public volatile DefaultDrmSessionManager$MediaDrmHandler y;

    public c(UUID uuid, kno knoVar, MediaDrmCallbackImpl mediaDrmCallbackImpl, HashMap hashMap, boolean z, int[] iArr, boolean z2, twy twyVar, long j) {
        uuid.getClass();
        d6z.k("Use C.CLEARKEY_UUID instead", !b87.b.equals(uuid));
        this.b = uuid;
        this.c = knoVar;
        this.d = mediaDrmCallbackImpl;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = twyVar;
        this.i = new b();
        this.k = new gyc(this);
        this.v = 0;
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = j;
    }

    public static boolean b(a aVar) {
        aVar.q();
        if (aVar.p != 1) {
            return false;
        }
        DrmSession$DrmSessionException error = aVar.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || mn91.h(cause);
    }

    public static ArrayList e(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i);
            if ((schemeData.matches(uuid) || (b87.c.equals(uuid) && schemeData.matches(b87.b))) && (schemeData.data != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MediaDrmHandler] */
    public final jmm a(final Looper looper, mmm mmmVar, androidx.media3.common.a aVar, boolean z) {
        ArrayList arrayList;
        if (this.y == null) {
            this.y = new Handler(looper) { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MediaDrmHandler
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    byte[] bArr = (byte[]) message.obj;
                    if (bArr == null) {
                        return;
                    }
                    Iterator it = c.this.m.iterator();
                    while (it.hasNext()) {
                        a aVar2 = (a) it.next();
                        aVar2.q();
                        if (Arrays.equals(aVar2.v, bArr)) {
                            if (message.what == 2 && aVar2.e == 0 && aVar2.p == 4) {
                                int i = tw21.a;
                                aVar2.j(false);
                                return;
                            }
                            return;
                        }
                    }
                }
            };
        }
        DrmInitData drmInitData = aVar.r;
        int i = 0;
        a aVar2 = null;
        if (drmInitData == null) {
            int i2 = eh20.i(aVar.n);
            mno mnoVar = this.q;
            mnoVar.getClass();
            if (mnoVar.getCryptoType() != 2 || !pfs.c) {
                int[] iArr = this.g;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == i2) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && mnoVar.getCryptoType() != 1) {
                    a aVar3 = this.r;
                    if (aVar3 == null) {
                        a d = d(ImmutableList.p(), true, null, z);
                        this.m.add(d);
                        this.r = d;
                    } else {
                        aVar3.e(null);
                    }
                    return this.r;
                }
            }
            return null;
        }
        if (this.w == null) {
            arrayList = e(drmInitData, this.b, false);
            if (arrayList.isEmpty()) {
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.b);
                lk91.f("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                if (mmmVar != null) {
                    mmmVar.e(defaultDrmSessionManager$MissingSchemeDataException);
                }
                return new aao(new DrmSession$DrmSessionException(6003, defaultDrmSessionManager$MissingSchemeDataException));
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
                a aVar4 = (a) it.next();
                if (Objects.equals(aVar4.a, arrayList)) {
                    aVar2 = aVar4;
                    break;
                }
            }
        } else {
            aVar2 = this.s;
        }
        if (aVar2 != null) {
            aVar2.e(mmmVar);
            return aVar2;
        }
        a d2 = d(arrayList, false, mmmVar, z);
        if (!this.f) {
            this.s = d2;
        }
        this.m.add(d2);
        return d2;
    }

    @Override // defpackage.qmm
    public final jmm acquireSession(mmm mmmVar, androidx.media3.common.a aVar) {
        g(false);
        d6z.x(this.p > 0);
        d6z.z(this.t);
        return a(this.t, mmmVar, aVar, true);
    }

    public final a c(List list, boolean z, mmm mmmVar) {
        this.q.getClass();
        boolean z2 = this.h | z;
        mno mnoVar = this.q;
        int i = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        vyc0 vyc0Var = this.x;
        vyc0Var.getClass();
        a aVar = new a(this.b, mnoVar, this.i, this.k, list, i, z2, z, bArr, this.e, this.d, looper, this.j, vyc0Var);
        aVar.e(mmmVar);
        if (this.l != -9223372036854775807L) {
            aVar.e(null);
        }
        return aVar;
    }

    public final a d(List list, boolean z, mmm mmmVar, boolean z2) {
        a c = c(list, z, mmmVar);
        boolean b = b(c);
        long j = this.l;
        Set set = this.o;
        if (b && !set.isEmpty()) {
            h221 it = ImmutableSet.m(set).iterator();
            while (it.hasNext()) {
                ((jmm) it.next()).h(null);
            }
            c.h(mmmVar);
            if (j != -9223372036854775807L) {
                c.h(null);
            }
            c = c(list, z, mmmVar);
        }
        if (b(c) && z2) {
            Set set2 = this.n;
            if (!set2.isEmpty()) {
                h221 it2 = ImmutableSet.m(set2).iterator();
                while (it2.hasNext()) {
                    ((qah) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    h221 it3 = ImmutableSet.m(set).iterator();
                    while (it3.hasNext()) {
                        ((jmm) it3.next()).h(null);
                    }
                }
                c.h(mmmVar);
                if (j != -9223372036854775807L) {
                    c.h(null);
                }
                return c(list, z, mmmVar);
            }
        }
        return c;
    }

    public final void f() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            mno mnoVar = this.q;
            mnoVar.getClass();
            mnoVar.release();
            this.q = null;
        }
    }

    public final void g(boolean z) {
        if (z && this.t == null) {
            lk91.k("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            lk91.k("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.qmm
    public final int getCryptoType(androidx.media3.common.a aVar) {
        g(false);
        mno mnoVar = this.q;
        mnoVar.getClass();
        int cryptoType = mnoVar.getCryptoType();
        DrmInitData drmInitData = aVar.r;
        if (drmInitData == null) {
            int i = eh20.i(aVar.n);
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return 0;
            }
        } else if (this.w == null) {
            UUID uuid = this.b;
            if (e(drmInitData, uuid, true).isEmpty()) {
                if (drmInitData.schemeDataCount == 1 && drmInitData.get(0).matches(b87.b)) {
                    lk91.j("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = drmInitData.schemeType;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : tw21.a < 25)) {
                return 1;
            }
        }
        return cryptoType;
    }

    @Override // defpackage.qmm
    public final pmm preacquireSession(mmm mmmVar, androidx.media3.common.a aVar) {
        d6z.x(this.p > 0);
        d6z.z(this.t);
        qah qahVar = new qah(this, mmmVar);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new zvg(4, qahVar, aVar));
        return qahVar;
    }

    @Override // defpackage.qmm
    public final void prepare() {
        g(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            mno acquireExoMediaDrm = this.c.acquireExoMediaDrm(this.b);
            this.q = acquireExoMediaDrm;
            acquireExoMediaDrm.setOnEventListener(new zgf(17, this));
        } else {
            if (this.l == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.m;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((a) arrayList.get(i2)).e(null);
                i2++;
            }
        }
    }

    @Override // defpackage.qmm
    public final void release() {
        g(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((a) arrayList.get(i2)).h(null);
            }
        }
        h221 it = ImmutableSet.m(this.n).iterator();
        while (it.hasNext()) {
            ((qah) it.next()).release();
        }
        f();
    }

    @Override // defpackage.qmm
    public final void setPlayer(Looper looper, vyc0 vyc0Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    d6z.x(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.x = vyc0Var;
    }
}
