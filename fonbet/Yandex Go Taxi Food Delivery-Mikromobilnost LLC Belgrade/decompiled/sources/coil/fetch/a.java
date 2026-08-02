package coil.fetch;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.graphics.DataSource;
import coil.graphics.c;
import coil.network.HttpException;
import coil.request.CachePolicy;
import defpackage.c0r;
import defpackage.cvj0;
import defpackage.cvu0;
import defpackage.d5j0;
import defpackage.dvw;
import defpackage.evu0;
import defpackage.hdb1;
import defpackage.i3y;
import defpackage.ici0;
import defpackage.j18;
import defpackage.jci0;
import defpackage.jl40;
import defpackage.kvj0;
import defpackage.kzo;
import defpackage.ljo;
import defpackage.m;
import defpackage.meu;
import defpackage.nc7;
import defpackage.ny61;
import defpackage.oq90;
import defpackage.pjt0;
import defpackage.qg70;
import defpackage.r1r;
import defpackage.rc7;
import defpackage.rci0;
import defpackage.rvj0;
import defpackage.rwq;
import defpackage.t4j0;
import defpackage.tci0;
import defpackage.tj;
import defpackage.uza;
import defpackage.v5c0;
import defpackage.wg10;
import defpackage.wxj;
import defpackage.xf7;
import defpackage.ya7;
import defpackage.yf7;
import defpackage.za7;
import java.io.IOException;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes10.dex */
public final class a implements rwq {
    public static final za7 f;
    public static final za7 g;
    public final String a;
    public final qg70 b;
    public final i3y c;
    public final i3y d;
    public final boolean e;

    static {
        ya7 ya7Var = new ya7();
        ya7Var.a = true;
        ya7Var.b = true;
        f = ya7Var.a();
        ya7 ya7Var2 = new ya7();
        ya7Var2.a = true;
        ya7Var2.d = true;
        g = ya7Var2.a();
    }

    public a(String str, qg70 qg70Var, i3y i3yVar, i3y i3yVar2, boolean z) {
        this.a = str;
        this.b = qg70Var;
        this.c = i3yVar;
        this.d = i3yVar2;
        this.e = z;
    }

    public static String d(String str, wg10 wg10Var) {
        String b;
        String str2 = wg10Var != null ? wg10Var.a : null;
        if ((str2 == null || cvu0.x(str2, "text/plain", false)) && (b = m.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b;
        }
        if (str2 != null) {
            return evu0.f0(';', str2, str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0137 A[Catch: Exception -> 0x005c, TryCatch #2 {Exception -> 0x005c, blocks: (B:43:0x0053, B:45:0x0156, B:47:0x021c, B:48:0x0221, B:89:0x00a5, B:91:0x00af, B:94:0x00db, B:96:0x00df, B:99:0x00f8, B:101:0x0144, B:104:0x0110, B:106:0x011c, B:107:0x0125, B:109:0x00c3, B:111:0x00cb, B:113:0x012f, B:114:0x0136, B:115:0x0137), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01de A[Catch: Exception -> 0x0206, TryCatch #4 {Exception -> 0x0206, blocks: (B:17:0x01d8, B:19:0x01de, B:21:0x01fd, B:22:0x0202, B:25:0x0200, B:26:0x020b, B:27:0x0210), top: B:16:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020b A[Catch: Exception -> 0x0206, TryCatch #4 {Exception -> 0x0206, blocks: (B:17:0x01d8, B:19:0x01de, B:21:0x01fd, B:22:0x0202, B:25:0x0200, B:26:0x020b, B:27:0x0210), top: B:16:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021c A[Catch: Exception -> 0x005c, TRY_ENTER, TryCatch #2 {Exception -> 0x005c, blocks: (B:43:0x0053, B:45:0x0156, B:47:0x021c, B:48:0x0221, B:89:0x00a5, B:91:0x00af, B:94:0x00db, B:96:0x00df, B:99:0x00f8, B:101:0x0144, B:104:0x0110, B:106:0x011c, B:107:0x0125, B:109:0x00c3, B:111:0x00cb, B:113:0x012f, B:114:0x0136, B:115:0x0137), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a5 A[Catch: Exception -> 0x005c, TRY_ENTER, TryCatch #2 {Exception -> 0x005c, blocks: (B:43:0x0053, B:45:0x0156, B:47:0x021c, B:48:0x0221, B:89:0x00a5, B:91:0x00af, B:94:0x00db, B:96:0x00df, B:99:0x00f8, B:101:0x0144, B:104:0x0110, B:106:0x011c, B:107:0x0125, B:109:0x00c3, B:111:0x00cb, B:113:0x012f, B:114:0x0136, B:115:0x0137), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    @Override // defpackage.rwq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        HttpUriFetcher$fetch$1 httpUriFetcher$fetch$1;
        ?? r2;
        rci0 rci0Var;
        rc7 a;
        Object b;
        tci0 tci0Var;
        rvj0 rvj0Var;
        rci0 rci0Var2;
        kvj0 kvj0Var;
        a aVar;
        kvj0 kvj0Var2;
        rvj0 rvj0Var2;
        try {
            if (continuation instanceof HttpUriFetcher$fetch$1) {
                httpUriFetcher$fetch$1 = (HttpUriFetcher$fetch$1) continuation;
                int i = httpUriFetcher$fetch$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    httpUriFetcher$fetch$1.label = i - Integer.MIN_VALUE;
                    Object obj = httpUriFetcher$fetch$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = httpUriFetcher$fetch$1.label;
                    if (r2 != 0) {
                        b.b(obj);
                        qg70 qg70Var = this.b;
                        boolean readEnabled = qg70Var.n.getReadEnabled();
                        String str = this.a;
                        if (readEnabled && (tci0Var = (tci0) this.d.getValue()) != null) {
                            String str2 = qg70Var.i;
                            if (str2 == null) {
                                str2 = str;
                            }
                            coil.disk.a aVar2 = tci0Var.b;
                            ByteString byteString = new ByteString(str2.getBytes(uza.a));
                            byteString.b = str2;
                            wxj d = aVar2.d(byteString.f(JCP.DIGEST_SHA_256).i());
                            if (d != null) {
                                rci0Var = new rci0(d);
                                if (rci0Var == null) {
                                    r1r c = c();
                                    wxj wxjVar = rci0Var.a;
                                    if (wxjVar.b) {
                                        throw new IllegalStateException("snapshot is closed");
                                    }
                                    Long l = c.v((oq90) wxjVar.a.c.get(0)).d;
                                    if (l != null && l.longValue() == 0) {
                                        return new pjt0(g(rci0Var), d(str, null), DataSource.DISK);
                                    }
                                    if (!this.e) {
                                        c0r g2 = g(rci0Var);
                                        coil.network.a f2 = f(rci0Var);
                                        return new pjt0(g2, d(str, f2 != null ? (wg10) f2.b.getValue() : null), DataSource.DISK);
                                    }
                                    a = new nc7(e(), f(rci0Var)).a();
                                    coil.network.a aVar3 = a.b;
                                    if (a.a == null && aVar3 != null) {
                                        return new pjt0(g(rci0Var), d(str, (wg10) aVar3.b.getValue()), DataSource.DISK);
                                    }
                                } else {
                                    a = new nc7(e(), null).a();
                                }
                                d5j0 d5j0Var = a.a;
                                httpUriFetcher$fetch$1.L$0 = this;
                                httpUriFetcher$fetch$1.L$1 = rci0Var;
                                httpUriFetcher$fetch$1.L$2 = a;
                                httpUriFetcher$fetch$1.label = 1;
                                b = b(d5j0Var, httpUriFetcher$fetch$1);
                                if (b == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                        rci0Var = null;
                        if (rci0Var == null) {
                        }
                        d5j0 d5j0Var2 = a.a;
                        httpUriFetcher$fetch$1.L$0 = this;
                        httpUriFetcher$fetch$1.L$1 = rci0Var;
                        httpUriFetcher$fetch$1.L$2 = a;
                        httpUriFetcher$fetch$1.label = 1;
                        b = b(d5j0Var2, httpUriFetcher$fetch$1);
                        if (b == coroutineSingletons) {
                        }
                    } else {
                        if (r2 != 1) {
                            if (r2 != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kvj0Var = (kvj0) httpUriFetcher$fetch$1.L$2;
                            rci0Var2 = (rci0) httpUriFetcher$fetch$1.L$1;
                            aVar = (a) httpUriFetcher$fetch$1.L$0;
                            try {
                                b.b(obj);
                                kvj0Var2 = (kvj0) obj;
                            } catch (Exception e) {
                                e = e;
                                try {
                                    m.a(kvj0Var);
                                    throw e;
                                } catch (Exception e2) {
                                    e = e2;
                                    r2 = rci0Var2;
                                    if (r2 != 0) {
                                        m.a(r2);
                                    }
                                    throw e;
                                }
                            }
                            try {
                                Bitmap.Config[] configArr = m.a;
                                rvj0Var2 = kvj0Var2.z;
                                if (rvj0Var2 != null) {
                                    throw new IllegalStateException("response body == null");
                                }
                                aVar.getClass();
                                return new pjt0(c.a(rvj0Var2.source(), aVar.b.a), d(aVar.a, rvj0Var2.contentType()), kvj0Var2.B != null ? DataSource.NETWORK : DataSource.DISK);
                            } catch (Exception e3) {
                                e = e3;
                                kvj0Var = kvj0Var2;
                                m.a(kvj0Var);
                                throw e;
                            }
                        }
                        rc7 rc7Var = (rc7) httpUriFetcher$fetch$1.L$2;
                        rci0Var = (rci0) httpUriFetcher$fetch$1.L$1;
                        a aVar4 = (a) httpUriFetcher$fetch$1.L$0;
                        b.b(obj);
                        a = rc7Var;
                        this = aVar4;
                        b = obj;
                    }
                    kvj0 kvj0Var3 = (kvj0) b;
                    Bitmap.Config[] configArr2 = m.a;
                    rvj0Var = kvj0Var3.z;
                    if (rvj0Var != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    try {
                        rci0 h = this.h(rci0Var, a.a, kvj0Var3, a.b);
                        String str3 = this.a;
                        try {
                            if (h != null) {
                                c0r g3 = this.g(h);
                                coil.network.a f3 = this.f(h);
                                return new pjt0(g3, d(str3, f3 != null ? (wg10) f3.b.getValue() : null), DataSource.NETWORK);
                            }
                            if (rvj0Var.contentLength() > 0) {
                                return new pjt0(c.a(rvj0Var.source(), this.b.a), d(str3, rvj0Var.contentType()), kvj0Var3.B != null ? DataSource.NETWORK : DataSource.DISK);
                            }
                            m.a(kvj0Var3);
                            d5j0 e4 = this.e();
                            httpUriFetcher$fetch$1.L$0 = this;
                            httpUriFetcher$fetch$1.L$1 = h;
                            httpUriFetcher$fetch$1.L$2 = kvj0Var3;
                            httpUriFetcher$fetch$1.label = 2;
                            Object b2 = this.b(e4, httpUriFetcher$fetch$1);
                            if (b2 != coroutineSingletons) {
                                rci0Var2 = h;
                                obj = b2;
                                aVar = this;
                                kvj0Var = kvj0Var3;
                                kvj0Var2 = (kvj0) obj;
                                Bitmap.Config[] configArr3 = m.a;
                                rvj0Var2 = kvj0Var2.z;
                                if (rvj0Var2 != null) {
                                }
                            }
                            return coroutineSingletons;
                        } catch (Exception e5) {
                            rci0Var2 = h;
                            e = e5;
                            kvj0Var = kvj0Var3;
                            m.a(kvj0Var);
                            throw e;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        rci0Var2 = rci0Var;
                    }
                }
            }
            if (r2 != 0) {
            }
            kvj0 kvj0Var32 = (kvj0) b;
            Bitmap.Config[] configArr22 = m.a;
            rvj0Var = kvj0Var32.z;
            if (rvj0Var != null) {
            }
        } catch (Exception e7) {
            e = e7;
        }
        httpUriFetcher$fetch$1 = new HttpUriFetcher$fetch$1(this, (ContinuationImpl) continuation);
        Object obj2 = httpUriFetcher$fetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = httpUriFetcher$fetch$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d5j0 d5j0Var, ContinuationImpl continuationImpl) {
        HttpUriFetcher$executeNetworkRequest$1 httpUriFetcher$executeNetworkRequest$1;
        int i;
        kvj0 execute;
        if (continuationImpl instanceof HttpUriFetcher$executeNetworkRequest$1) {
            httpUriFetcher$executeNetworkRequest$1 = (HttpUriFetcher$executeNetworkRequest$1) continuationImpl;
            int i2 = httpUriFetcher$executeNetworkRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpUriFetcher$executeNetworkRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = httpUriFetcher$executeNetworkRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = httpUriFetcher$executeNetworkRequest$1.label;
                if (i != 0) {
                    b.b(obj);
                    Bitmap.Config[] configArr = m.a;
                    boolean l = jl40.l(Looper.myLooper(), Looper.getMainLooper());
                    i3y i3yVar = this.c;
                    if (l) {
                        if (this.b.o.getReadEnabled()) {
                            throw new NetworkOnMainThreadException();
                        }
                        execute = ((xf7) i3yVar.getValue()).newCall(d5j0Var).execute();
                        if (!execute.J || execute.w == 304) {
                            return execute;
                        }
                        rvj0 rvj0Var = execute.z;
                        if (rvj0Var != null) {
                            m.a(rvj0Var);
                        }
                        throw new HttpException(execute);
                    }
                    yf7 newCall = ((xf7) i3yVar.getValue()).newCall(d5j0Var);
                    httpUriFetcher$executeNetworkRequest$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(httpUriFetcher$executeNetworkRequest$1));
                    j18Var.u();
                    tj tjVar = new tj(9, newCall, j18Var);
                    newCall.I(tjVar);
                    j18Var.w(tjVar);
                    obj = j18Var.s();
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                execute = (kvj0) obj;
                if (execute.J) {
                }
                return execute;
            }
        }
        httpUriFetcher$executeNetworkRequest$1 = new HttpUriFetcher$executeNetworkRequest$1(this, continuationImpl);
        Object obj2 = httpUriFetcher$executeNetworkRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = httpUriFetcher$executeNetworkRequest$1.label;
        if (i != 0) {
        }
        execute = (kvj0) obj2;
        if (execute.J) {
        }
        return execute;
    }

    public final r1r c() {
        return ((tci0) this.d.getValue()).a;
    }

    public final d5j0 e() {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(this.a);
        qg70 qg70Var = this.b;
        meu meuVar = qg70Var.j;
        CachePolicy cachePolicy = qg70Var.n;
        t4j0Var.c = meuVar.d();
        for (Map.Entry entry : qg70Var.k.a.entrySet()) {
            t4j0Var.g((Class) entry.getKey(), entry.getValue());
        }
        boolean readEnabled = cachePolicy.getReadEnabled();
        boolean readEnabled2 = qg70Var.o.getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            t4j0Var.b(za7.o);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                t4j0Var.b(g);
            }
        } else if (cachePolicy.getWriteEnabled()) {
            t4j0Var.b(za7.n);
        } else {
            t4j0Var.b(f);
        }
        return new d5j0(t4j0Var);
    }

    public final coil.network.a f(rci0 rci0Var) {
        Throwable th;
        coil.network.a aVar;
        try {
            r1r c = c();
            wxj wxjVar = rci0Var.a;
            if (wxjVar.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            jci0 jci0Var = new jci0(c.G((oq90) wxjVar.a.c.get(0)));
            try {
                aVar = new coil.network.a(jci0Var);
                try {
                    jci0Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    jci0Var.close();
                } catch (Throwable th4) {
                    ljo.a(th3, th4);
                }
                th = th3;
                aVar = null;
            }
            if (th == null) {
                return aVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final c0r g(rci0 rci0Var) {
        wxj wxjVar = rci0Var.a;
        if (wxjVar.b) {
            ny61.r("snapshot is closed");
            return null;
        }
        oq90 oq90Var = (oq90) wxjVar.a.c.get(1);
        r1r c = c();
        String str = this.b.i;
        if (str == null) {
            str = this.a;
        }
        return new c0r(oq90Var, c, str, rci0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rci0 h(rci0 rci0Var, d5j0 d5j0Var, kvj0 kvj0Var, coil.network.a aVar) {
        v5c0 v5c0Var;
        kzo c;
        Throwable th = null;
        if (this.b.n.getWriteEnabled() && (!this.e || (!d5j0Var.a().b && !kvj0Var.a().b && !jl40.l(kvj0Var.y.a("Vary"), "*")))) {
            int i = 21;
            if (rci0Var != null) {
                wxj wxjVar = rci0Var.a;
                coil.disk.a aVar2 = wxjVar.c;
                synchronized (aVar2) {
                    wxjVar.close();
                    c = aVar2.c(wxjVar.a.a);
                }
                if (c != null) {
                    v5c0Var = new v5c0(i, c);
                    if (v5c0Var != null) {
                        try {
                            try {
                                if (kvj0Var.w != 304 || aVar == null) {
                                    ici0 ici0Var = new ici0(c().D(((kzo) v5c0Var.b).q(0), false));
                                    try {
                                        new coil.network.a(kvj0Var).a(ici0Var);
                                        try {
                                            ici0Var.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            ici0Var.close();
                                        } catch (Throwable th4) {
                                            ljo.a(th, th4);
                                        }
                                    }
                                    if (th != null) {
                                        throw th;
                                    }
                                    ici0 ici0Var2 = new ici0(c().D(((kzo) v5c0Var.b).q(1), false));
                                    try {
                                        kvj0Var.z.source().y0(ici0Var2);
                                        try {
                                            ici0Var2.close();
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        try {
                                            ici0Var2.close();
                                        } catch (Throwable th7) {
                                            ljo.a(th, th7);
                                        }
                                    }
                                    if (th != null) {
                                        throw th;
                                    }
                                } else {
                                    cvj0 c2 = kvj0Var.c();
                                    c2.f = hdb1.b(aVar.f, kvj0Var.y).d();
                                    kvj0 a = c2.a();
                                    ici0 ici0Var3 = new ici0(c().D(((kzo) v5c0Var.b).q(0), false));
                                    try {
                                        new coil.network.a(a).a(ici0Var3);
                                        try {
                                            ici0Var3.close();
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        try {
                                            ici0Var3.close();
                                        } catch (Throwable th10) {
                                            ljo.a(th, th10);
                                        }
                                    }
                                    if (th != null) {
                                        throw th;
                                    }
                                }
                                rci0 z = v5c0Var.z();
                                m.a(kvj0Var);
                                return z;
                            } catch (Exception e) {
                                Bitmap.Config[] configArr = m.a;
                                try {
                                    ((kzo) v5c0Var.b).o(false);
                                } catch (Exception unused) {
                                }
                                throw e;
                            }
                        } catch (Throwable th11) {
                            m.a(kvj0Var);
                            throw th11;
                        }
                    }
                }
                v5c0Var = null;
                if (v5c0Var != null) {
                }
            } else {
                tci0 tci0Var = (tci0) this.d.getValue();
                if (tci0Var != null) {
                    String str = this.b.i;
                    if (str == null) {
                        str = this.a;
                    }
                    coil.disk.a aVar3 = tci0Var.b;
                    ByteString byteString = new ByteString(str.getBytes(uza.a));
                    byteString.b = str;
                    kzo c3 = aVar3.c(byteString.f(JCP.DIGEST_SHA_256).i());
                    if (c3 != null) {
                        v5c0Var = new v5c0(i, c3);
                        if (v5c0Var != null) {
                        }
                    }
                }
                v5c0Var = null;
                if (v5c0Var != null) {
                }
            }
        } else if (rci0Var != null) {
            m.a(rci0Var);
        }
        return null;
    }
}
