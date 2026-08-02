package com.yandex.plus.home.api.prefetch;

import android.webkit.WebResourceResponse;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.b64;
import defpackage.ffx;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.lkd0;
import defpackage.mlc0;
import defpackage.mrj;
import defpackage.n45;
import defpackage.nkd0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.qne0;
import defpackage.rne0;
import defpackage.rvj0;
import defpackage.skd0;
import defpackage.sne0;
import defpackage.tje;
import defpackage.tne0;
import defpackage.une0;
import defpackage.unr0;
import defpackage.w3m;
import defpackage.wls;
import defpackage.xfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import retrofit2.Response;

/* loaded from: classes8.dex */
public final class a {
    public final PrefetchApi a;
    public final w3m b;
    public final nkd0 c;
    public final ike d;
    public final i3y e;
    public final i3y f = kotlin.a.a(new mlc0(29));
    public pzt0 g;

    public a(PrefetchApi prefetchApi, w3m w3mVar, nkd0 nkd0Var, String str, ike ikeVar) {
        this.a = prefetchApi;
        this.b = w3mVar;
        this.c = nkd0Var;
        this.d = ikeVar;
        this.e = kotlin.a.a(new n45(str, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0067 A[Catch: all -> 0x006b, TRY_ENTER, TryCatch #4 {all -> 0x006b, blocks: (B:7:0x0030, B:20:0x0054, B:42:0x0067, B:43:0x006a), top: B:6:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final une0 a(a aVar, rvj0 rvj0Var, String str) {
        Object obj;
        mrj mrjVar;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        Object obj2 = aVar.f().get(str);
        rne0 rne0Var = obj2 instanceof rne0 ? (rne0) obj2 : null;
        if (rne0Var == null) {
            xfo.g(g8e.o("Can't find loading state for given for file = ", str));
            return null;
        }
        aVar.f().put(str, new tne0(rne0Var.a()));
        File file = new File((File) aVar.e.getValue(), str);
        try {
            mrjVar = new mrj(file);
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        try {
            inputStream = rvj0Var.byteStream();
            try {
                try {
                    fileOutputStream = mrjVar.H();
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        mrjVar.m(fileOutputStream);
                        inputStream.close();
                        obj = file;
                        boolean z = obj instanceof Result.Failure;
                        Object obj3 = obj;
                        if (!z) {
                            skd0.b(PlusLogTag.SDK, "File saved successfully " + str);
                            obj3 = new sne0((File) obj);
                        }
                        Throwable a = Result.a(obj3);
                        Object obj4 = obj3;
                        if (a != null) {
                            PlusLogTag plusLogTag = PlusLogTag.SDK;
                            StringBuilder x = unr0.x("File write failed fileName = ", str, ", exception = ");
                            x.append(a.getMessage());
                            skd0.h(plusLogTag, x.toString(), null);
                            obj4 = qne0.a;
                        }
                        une0 une0Var = (une0) obj4;
                        aVar.f().put(str, une0Var);
                        return une0Var;
                    } catch (Exception e) {
                        e = e;
                        mrjVar.l(fileOutputStream);
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            if (inputStream != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(3:28|29|(1:31))|18|19|(1:21)|22|(1:26)(2:24|25)))|39|6|7|(0)(0)|18|19|(0)|22|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r2 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        r2 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, String str, String str2, ContinuationImpl continuationImpl) {
        PrefetchManager$loadResource$1 prefetchManager$loadResource$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof PrefetchManager$loadResource$1) {
            prefetchManager$loadResource$1 = (PrefetchManager$loadResource$1) continuationImpl;
            int i2 = prefetchManager$loadResource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                prefetchManager$loadResource$1.label = i2 - Integer.MIN_VALUE;
                obj = prefetchManager$loadResource$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = prefetchManager$loadResource$1.label;
                if (i != 0) {
                    b.b(obj);
                    prefetchManager$loadResource$1.L$0 = str;
                    prefetchManager$loadResource$1.L$1 = str2;
                    prefetchManager$loadResource$1.L$2 = null;
                    prefetchManager$loadResource$1.L$3 = null;
                    prefetchManager$loadResource$1.L$4 = null;
                    prefetchManager$loadResource$1.I$0 = 0;
                    prefetchManager$loadResource$1.I$1 = 0;
                    prefetchManager$loadResource$1.label = 1;
                    obj = aVar.c(str2, prefetchManager$loadResource$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str2 = (String) prefetchManager$loadResource$1.L$1;
                    str = (String) prefetchManager$loadResource$1.L$0;
                    b.b(obj);
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                wls prefetchManager$loadResource$2 = new PrefetchManager$loadResource$2((rvj0) obj, str2, aVar, null);
                prefetchManager$loadResource$1.L$0 = null;
                prefetchManager$loadResource$1.L$1 = null;
                prefetchManager$loadResource$1.L$2 = null;
                prefetchManager$loadResource$1.L$3 = null;
                prefetchManager$loadResource$1.L$4 = null;
                prefetchManager$loadResource$1.label = 2;
                Object e = aVar.e(str, str2, prefetchManager$loadResource$2, prefetchManager$loadResource$1);
                return e != obj2 ? obj2 : e;
            }
        }
        prefetchManager$loadResource$1 = new PrefetchManager$loadResource$1(aVar, continuationImpl);
        obj = prefetchManager$loadResource$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = prefetchManager$loadResource$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        wls prefetchManager$loadResource$22 = new PrefetchManager$loadResource$2((rvj0) obj, str2, aVar, null);
        prefetchManager$loadResource$1.L$0 = null;
        prefetchManager$loadResource$1.L$1 = null;
        prefetchManager$loadResource$1.L$2 = null;
        prefetchManager$loadResource$1.L$3 = null;
        prefetchManager$loadResource$1.L$4 = null;
        prefetchManager$loadResource$1.label = 2;
        Object e2 = aVar.e(str, str2, prefetchManager$loadResource$22, prefetchManager$loadResource$1);
        if (e2 != obj22) {
        }
    }

    public static String d(String str) {
        return b64.k("[^\\w.]+", str, "_");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        PrefetchManager$downloadFile$1 prefetchManager$downloadFile$1;
        Object obj;
        int i;
        Response response;
        rvj0 rvj0Var;
        if (continuationImpl instanceof PrefetchManager$downloadFile$1) {
            prefetchManager$downloadFile$1 = (PrefetchManager$downloadFile$1) continuationImpl;
            int i2 = prefetchManager$downloadFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                prefetchManager$downloadFile$1.label = i2 - Integer.MIN_VALUE;
                obj = prefetchManager$downloadFile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = prefetchManager$downloadFile$1.label;
                if (i != 0) {
                    b.b(obj);
                    prefetchManager$downloadFile$1.L$0 = str;
                    prefetchManager$downloadFile$1.label = 1;
                    obj = this.a.a(str, prefetchManager$downloadFile$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) prefetchManager$downloadFile$1.L$0;
                    b.b(obj);
                }
                if (!((Response) obj).a.J) {
                    obj = null;
                }
                response = (Response) obj;
                if (response != null || (rvj0Var = (rvj0) response.b) == null) {
                    String p = oyr.p("Downloading ", str, " failed");
                    skd0.h(PlusLogTag.SDK, p, null);
                    ny61.v(p);
                    return null;
                }
                skd0.b(PlusLogTag.SDK, "File successfully downloaded from url = " + str);
                return rvj0Var;
            }
        }
        prefetchManager$downloadFile$1 = new PrefetchManager$downloadFile$1(this, continuationImpl);
        obj = prefetchManager$downloadFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = prefetchManager$downloadFile$1.label;
        if (i != 0) {
        }
        if (!((Response) obj).a.J) {
        }
        response = (Response) obj;
        if (response != null) {
        }
        String p2 = oyr.p("Downloading ", str, " failed");
        skd0.h(PlusLogTag.SDK, p2, null);
        ny61.v(p2);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r10.u0(r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, wls wlsVar, ContinuationImpl continuationImpl) {
        PrefetchManager$getFromFileState$1 prefetchManager$getFromFileState$1;
        int i;
        sne0 sne0Var;
        if (continuationImpl instanceof PrefetchManager$getFromFileState$1) {
            prefetchManager$getFromFileState$1 = (PrefetchManager$getFromFileState$1) continuationImpl;
            int i2 = prefetchManager$getFromFileState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                prefetchManager$getFromFileState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = prefetchManager$getFromFileState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = prefetchManager$getFromFileState$1.label;
                if (i != 0) {
                    b.b(obj);
                    une0 une0Var = (une0) f().get(str);
                    if (une0Var instanceof tne0) {
                        l8x a = ((tne0) une0Var).a();
                        prefetchManager$getFromFileState$1.L$0 = str;
                        prefetchManager$getFromFileState$1.L$1 = null;
                        prefetchManager$getFromFileState$1.L$2 = wlsVar;
                        prefetchManager$getFromFileState$1.L$3 = null;
                        prefetchManager$getFromFileState$1.label = 1;
                    } else {
                        if (une0Var instanceof sne0) {
                            skd0.b(PlusLogTag.SDK, "Found saved file for url = " + str2);
                            return ((sne0) une0Var).a();
                        }
                        if (une0Var instanceof rne0) {
                            l8x a2 = ((rne0) une0Var).a();
                            prefetchManager$getFromFileState$1.L$0 = null;
                            prefetchManager$getFromFileState$1.L$1 = null;
                            prefetchManager$getFromFileState$1.L$2 = null;
                            prefetchManager$getFromFileState$1.L$3 = null;
                            prefetchManager$getFromFileState$1.label = 3;
                            Object invoke = wlsVar.invoke(a2, prefetchManager$getFromFileState$1);
                            if (invoke != coroutineSingletons) {
                                return invoke;
                            }
                        } else {
                            if (!jl40.l(une0Var, qne0.a)) {
                                return null;
                            }
                            prefetchManager$getFromFileState$1.L$0 = null;
                            prefetchManager$getFromFileState$1.L$1 = null;
                            prefetchManager$getFromFileState$1.L$2 = null;
                            prefetchManager$getFromFileState$1.L$3 = null;
                            prefetchManager$getFromFileState$1.label = 4;
                            Object invoke2 = wlsVar.invoke(null, prefetchManager$getFromFileState$1);
                            if (invoke2 != coroutineSingletons) {
                                return invoke2;
                            }
                        }
                    }
                }
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                wlsVar = (wls) prefetchManager$getFromFileState$1.L$2;
                str = (String) prefetchManager$getFromFileState$1.L$0;
                b.b(obj);
                Object obj2 = f().get(str);
                sne0Var = !(obj2 instanceof sne0) ? (sne0) obj2 : null;
                if (sne0Var == null) {
                    return sne0Var.a();
                }
                prefetchManager$getFromFileState$1.L$0 = null;
                prefetchManager$getFromFileState$1.L$1 = null;
                prefetchManager$getFromFileState$1.L$2 = null;
                prefetchManager$getFromFileState$1.L$3 = null;
                prefetchManager$getFromFileState$1.label = 2;
                Object invoke3 = wlsVar.invoke(null, prefetchManager$getFromFileState$1);
                return invoke3 == coroutineSingletons ? coroutineSingletons : invoke3;
            }
        }
        prefetchManager$getFromFileState$1 = new PrefetchManager$getFromFileState$1(this, continuationImpl);
        Object obj3 = prefetchManager$getFromFileState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = prefetchManager$getFromFileState$1.label;
        if (i != 0) {
        }
        Object obj22 = f().get(str);
        if (!(obj22 instanceof sne0)) {
        }
        if (sne0Var == null) {
        }
    }

    public final Map f() {
        return (Map) this.f.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(2:25|(1:(2:32|(2:34|35)(2:36|(1:38)))(1:39))(2:29|30))|12|13|(1:15)|16|(2:18|19)(1:21)))|46|6|7|(0)(0)|12|13|(0)|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0041, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        r10 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        r10 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ContinuationImpl continuationImpl) {
        PrefetchManager$getResource$1 prefetchManager$getResource$1;
        Object obj;
        int i;
        File file;
        if (continuationImpl instanceof PrefetchManager$getResource$1) {
            prefetchManager$getResource$1 = (PrefetchManager$getResource$1) continuationImpl;
            int i2 = prefetchManager$getResource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                prefetchManager$getResource$1.label = i2 - Integer.MIN_VALUE;
                obj = prefetchManager$getResource$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = prefetchManager$getResource$1.label;
                if (i != 0) {
                    b.b(obj);
                    boolean K = ffx.K(((lkd0) this.c).k);
                    if (K && this.g == null) {
                        h();
                        return null;
                    }
                    if (!K) {
                        return null;
                    }
                    String d = d(str);
                    if (!f().keySet().contains(d)) {
                        return null;
                    }
                    skd0.b(PlusLogTag.SDK, "Url found in prefetch.txt url = " + str);
                    wls prefetchManager$getResource$2$1 = new PrefetchManager$getResource$2$1(this, str, d, null);
                    prefetchManager$getResource$1.L$0 = null;
                    prefetchManager$getResource$1.L$1 = null;
                    prefetchManager$getResource$1.L$2 = null;
                    prefetchManager$getResource$1.L$3 = null;
                    prefetchManager$getResource$1.L$4 = null;
                    prefetchManager$getResource$1.Z$0 = K;
                    prefetchManager$getResource$1.I$0 = 0;
                    prefetchManager$getResource$1.I$1 = 0;
                    prefetchManager$getResource$1.label = 1;
                    obj = e(d, str, prefetchManager$getResource$2$1, prefetchManager$getResource$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                file = (File) obj;
                if (file == null) {
                    return new WebResourceResponse(URLConnection.getFileNameMap().getContentTypeFor(file.getName()), null, new FileInputStream(file));
                }
                return null;
            }
        }
        prefetchManager$getResource$1 = new PrefetchManager$getResource$1(this, continuationImpl);
        obj = prefetchManager$getResource$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = prefetchManager$getResource$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        file = (File) obj;
        if (file == null) {
        }
    }

    public final void h() {
        boolean K = ffx.K(((lkd0) this.c).k);
        skd0.b(PlusLogTag.SDK, "loadPrefetch() prefetchEnabled = " + K);
        if (K) {
            this.g = tje.N(this.d, null, null, new PrefetchManager$loadPrefetch$1(this, null), 3);
        }
    }
}
