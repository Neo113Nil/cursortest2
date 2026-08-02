package coil3.network;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil3.graphics.EnumC0136DataSource;
import coil3.request.CachePolicy;
import defpackage.b0r;
import defpackage.cvu0;
import defpackage.dai0;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.fh20;
import defpackage.fxd;
import defpackage.i3y;
import defpackage.ici0;
import defpackage.iz50;
import defpackage.jci0;
import defpackage.jev;
import defpackage.jl40;
import defpackage.lg70;
import defpackage.ljo;
import defpackage.lxj;
import defpackage.ny61;
import defpackage.oc7;
import defpackage.ojt0;
import defpackage.oo31;
import defpackage.oq90;
import defpackage.oz50;
import defpackage.pc7;
import defpackage.pci0;
import defpackage.pwq;
import defpackage.qc7;
import defpackage.qci0;
import defpackage.qv10;
import defpackage.r1r;
import defpackage.rx11;
import defpackage.s8o;
import defpackage.sci0;
import defpackage.txj;
import defpackage.uh;
import defpackage.uza;
import defpackage.w5e;
import defpackage.wu50;
import defpackage.yp6;
import defpackage.zct0;
import defpackage.zu50;
import defpackage.zy11;
import java.io.IOException;
import java.util.Locale;
import kotlin.InitializedLazyImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.ByteString;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes10.dex */
public final class b implements pwq {
    public final String a;
    public final lg70 b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final InitializedLazyImpl f;
    public final i3y g;

    public b(String str, lg70 lg70Var, i3y i3yVar, i3y i3yVar2, i3y i3yVar3, InitializedLazyImpl initializedLazyImpl, i3y i3yVar4) {
        this.a = str;
        this.b = lg70Var;
        this.c = i3yVar;
        this.d = i3yVar2;
        this.e = i3yVar3;
        this.f = initializedLazyImpl;
        this.g = i3yVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01af, code lost:
    
        if (r0 == r8) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0169, code lost:
    
        r0 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016b, code lost:
    
        if (r0 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0196 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x01b2, B:21:0x004c, B:22:0x0192, B:24:0x0196, B:37:0x014a, B:39:0x0152, B:42:0x0161, B:43:0x0166, B:45:0x0169, B:49:0x0175, B:52:0x0170), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119 A[Catch: Exception -> 0x00d1, TryCatch #3 {Exception -> 0x00d1, blocks: (B:32:0x0113, B:34:0x0119, B:72:0x0088, B:74:0x0091, B:76:0x009f, B:79:0x00d5, B:81:0x00e1, B:86:0x00f0, B:92:0x0139, B:93:0x013e, B:94:0x00b3, B:96:0x00bd, B:98:0x013f, B:99:0x0146), top: B:71:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x01b2, B:21:0x004c, B:22:0x0192, B:24:0x0196, B:37:0x014a, B:39:0x0152, B:42:0x0161, B:43:0x0166, B:45:0x0169, B:49:0x0175, B:52:0x0170), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0067  */
    /* JADX WARN: Type inference failed for: r12v8, types: [T, oz50] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, Continuation continuation) {
        NetworkFetcher$doFetch$1 networkFetcher$doFetch$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        qci0 qci0Var;
        Ref$ObjectRef z;
        T t;
        Ref$ObjectRef ref$ObjectRef;
        oc7 oc7Var;
        sci0 sci0Var;
        Ref$ObjectRef ref$ObjectRef2;
        zct0 zct0Var;
        i3y i3yVar = bVar.c;
        Ref$ObjectRef ref$ObjectRef3 = bVar.a;
        lg70 lg70Var = bVar.b;
        try {
            if (continuation instanceof NetworkFetcher$doFetch$1) {
                networkFetcher$doFetch$1 = (NetworkFetcher$doFetch$1) continuation;
                int i2 = networkFetcher$doFetch$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    networkFetcher$doFetch$1.label = i2 - Integer.MIN_VALUE;
                    NetworkFetcher$doFetch$1 networkFetcher$doFetch$12 = networkFetcher$doFetch$1;
                    obj = networkFetcher$doFetch$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = networkFetcher$doFetch$12.label;
                    if (i != 0) {
                        z = qv10.z(obj);
                        if (!lg70Var.g.getReadEnabled() || (sci0Var = (sci0) bVar.d.getValue()) == 0) {
                            t = 0;
                        } else {
                            lg70Var.getClass();
                            t = sci0Var.a(ref$ObjectRef3);
                        }
                        z.element = t;
                        try {
                            Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                            if (z.element != 0) {
                                r1r e = bVar.e();
                                txj txjVar = ((qci0) z.element).a;
                                if (txjVar.b) {
                                    throw new IllegalStateException("snapshot is closed");
                                }
                                Long l = e.v((oq90) txjVar.a.c.get(0)).d;
                                if (l != null && l.longValue() == 0) {
                                    return new zct0(bVar.h((qci0) z.element), bVar.f(ref$ObjectRef3, null), EnumC0136DataSource.DISK);
                                }
                                ?? i3 = bVar.i((qci0) z.element);
                                ref$ObjectRef4.element = i3;
                                if (i3 != 0) {
                                    int i4 = i3.a;
                                    if ((200 > i4 || i4 >= 300) && i4 != 304) {
                                        throw new HttpException(i3);
                                    }
                                    qc7 qc7Var = (qc7) bVar.e.getValue();
                                    oz50 oz50Var = (oz50) ref$ObjectRef4.element;
                                    iz50 g = bVar.g();
                                    networkFetcher$doFetch$12.L$0 = z;
                                    networkFetcher$doFetch$12.L$1 = ref$ObjectRef4;
                                    networkFetcher$doFetch$12.label = 1;
                                    Object a = qc7Var.a(oz50Var, g, lg70Var, networkFetcher$doFetch$12);
                                    if (a == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    ref$ObjectRef = ref$ObjectRef4;
                                    obj = a;
                                }
                            }
                            ref$ObjectRef = ref$ObjectRef4;
                            oc7Var = null;
                            ref$ObjectRef2 = z;
                            if (lg70Var.h.getReadEnabled() && jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
                                throw new NetworkOnMainThreadException();
                            }
                            iz50 g2 = bVar.g();
                            iz50 iz50Var = g2;
                            coil3.network.okhttp.internal.a aVar = (coil3.network.okhttp.internal.a) i3yVar.getValue();
                            NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(ref$ObjectRef2, bVar, ref$ObjectRef, iz50Var, null);
                            networkFetcher$doFetch$12.L$0 = ref$ObjectRef2;
                            networkFetcher$doFetch$12.L$1 = null;
                            networkFetcher$doFetch$12.label = 2;
                            obj = coil3.network.okhttp.internal.a.a(aVar.a, iz50Var, networkFetcher$doFetch$fetchResult$1, networkFetcher$doFetch$12);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            zct0Var = (zct0) obj;
                            if (zct0Var == null) {
                            }
                        } catch (Exception e2) {
                            e = e2;
                            ref$ObjectRef3 = z;
                            qci0Var = (qci0) ref$ObjectRef3.element;
                            if (qci0Var != null) {
                            }
                            throw e;
                        }
                    } else if (i == 1) {
                        Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) networkFetcher$doFetch$12.L$1;
                        Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) networkFetcher$doFetch$12.L$0;
                        try {
                            kotlin.b.b(obj);
                            ref$ObjectRef = ref$ObjectRef5;
                            z = ref$ObjectRef6;
                        } catch (Exception e3) {
                            e = e3;
                            ref$ObjectRef3 = ref$ObjectRef6;
                            qci0Var = (qci0) ref$ObjectRef3.element;
                            if (qci0Var != null) {
                                try {
                                    oo31.o(qci0Var);
                                } catch (RuntimeException e4) {
                                    throw e4;
                                } catch (Exception unused) {
                                }
                            }
                            throw e;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return (zct0) obj;
                        }
                        ref$ObjectRef2 = (Ref$ObjectRef) networkFetcher$doFetch$12.L$0;
                        kotlin.b.b(obj);
                        zct0Var = (zct0) obj;
                        if (zct0Var == null) {
                            return zct0Var;
                        }
                        coil3.network.okhttp.internal.a aVar2 = (coil3.network.okhttp.internal.a) i3yVar.getValue();
                        iz50 g3 = bVar.g();
                        NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(bVar, null);
                        networkFetcher$doFetch$12.L$0 = ref$ObjectRef2;
                        networkFetcher$doFetch$12.label = 3;
                        obj = coil3.network.okhttp.internal.a.a(aVar2.a, g3, networkFetcher$doFetch$2, networkFetcher$doFetch$12);
                    }
                    oc7Var = (oc7) obj;
                    if (oc7Var.b != null) {
                        return new zct0(bVar.h((qci0) z.element), bVar.f(ref$ObjectRef3, oc7Var.b.d.a("Content-Type")), EnumC0136DataSource.DISK);
                    }
                    ref$ObjectRef2 = z;
                    if (lg70Var.h.getReadEnabled()) {
                        throw new NetworkOnMainThreadException();
                    }
                    iz50 g22 = bVar.g();
                    iz50 iz50Var2 = g22;
                    coil3.network.okhttp.internal.a aVar3 = (coil3.network.okhttp.internal.a) i3yVar.getValue();
                    NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$12 = new NetworkFetcher$doFetch$fetchResult$1(ref$ObjectRef2, bVar, ref$ObjectRef, iz50Var2, null);
                    networkFetcher$doFetch$12.L$0 = ref$ObjectRef2;
                    networkFetcher$doFetch$12.L$1 = null;
                    networkFetcher$doFetch$12.label = 2;
                    obj = coil3.network.okhttp.internal.a.a(aVar3.a, iz50Var2, networkFetcher$doFetch$fetchResult$12, networkFetcher$doFetch$12);
                    if (obj == coroutineSingletons) {
                    }
                    zct0Var = (zct0) obj;
                    if (zct0Var == null) {
                    }
                }
            }
            if (i != 0) {
            }
            oc7Var = (oc7) obj;
            if (oc7Var.b != null) {
            }
            ref$ObjectRef2 = z;
            if (lg70Var.h.getReadEnabled()) {
            }
            iz50 g222 = bVar.g();
            iz50 iz50Var22 = g222;
            coil3.network.okhttp.internal.a aVar32 = (coil3.network.okhttp.internal.a) i3yVar.getValue();
            NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$122 = new NetworkFetcher$doFetch$fetchResult$1(ref$ObjectRef2, bVar, ref$ObjectRef, iz50Var22, null);
            networkFetcher$doFetch$12.L$0 = ref$ObjectRef2;
            networkFetcher$doFetch$12.L$1 = null;
            networkFetcher$doFetch$12.label = 2;
            obj = coil3.network.okhttp.internal.a.a(aVar32.a, iz50Var22, networkFetcher$doFetch$fetchResult$122, networkFetcher$doFetch$12);
            if (obj == coroutineSingletons) {
            }
            zct0Var = (zct0) obj;
            if (zct0Var == null) {
            }
        } catch (Exception e5) {
            e = e5;
        }
        networkFetcher$doFetch$1 = new NetworkFetcher$doFetch$1(bVar, continuation);
        NetworkFetcher$doFetch$1 networkFetcher$doFetch$122 = networkFetcher$doFetch$1;
        obj = networkFetcher$doFetch$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkFetcher$doFetch$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b bVar, ojt0 ojt0Var, ContinuationImpl continuationImpl) {
        NetworkFetcher$toImageSource$1 networkFetcher$toImageSource$1;
        int i;
        yp6 yp6Var;
        bVar.getClass();
        if (continuationImpl instanceof NetworkFetcher$toImageSource$1) {
            networkFetcher$toImageSource$1 = (NetworkFetcher$toImageSource$1) continuationImpl;
            int i2 = networkFetcher$toImageSource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkFetcher$toImageSource$1.label = i2 - Integer.MIN_VALUE;
                Object obj = networkFetcher$toImageSource$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkFetcher$toImageSource$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yp6 yp6Var2 = new yp6();
                    networkFetcher$toImageSource$1.L$0 = yp6Var2;
                    networkFetcher$toImageSource$1.label = 1;
                    ojt0Var.a.y0(yp6Var2);
                    if (zy11.a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    yp6Var = yp6Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yp6Var = (yp6) networkFetcher$toImageSource$1.L$0;
                    kotlin.b.b(obj);
                }
                return eja1.b(yp6Var, bVar.e());
            }
        }
        networkFetcher$toImageSource$1 = new NetworkFetcher$toImageSource$1(bVar, continuationImpl);
        Object obj2 = networkFetcher$toImageSource$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkFetcher$toImageSource$1.label;
        if (i != 0) {
        }
        return eja1.b(yp6Var, bVar.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, qci0 qci0Var, oz50 oz50Var, iz50 iz50Var, oz50 oz50Var2, ContinuationImpl continuationImpl) {
        NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$1;
        int i;
        Object obj;
        oz50 oz50Var3;
        oz50 oz50Var4;
        pci0 pci0Var;
        oz50 oz50Var5;
        pci0 pci0Var2;
        oz50 oz50Var6;
        ojt0 ojt0Var;
        ojt0 ojt0Var2;
        qci0 qci0Var2 = qci0Var;
        bVar.getClass();
        lg70 lg70Var = bVar.b;
        if (continuationImpl instanceof NetworkFetcher$writeToDiskCache$1) {
            networkFetcher$writeToDiskCache$1 = (NetworkFetcher$writeToDiskCache$1) continuationImpl;
            int i2 = networkFetcher$writeToDiskCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkFetcher$writeToDiskCache$1.label = i2 - Integer.MIN_VALUE;
                NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$12 = networkFetcher$writeToDiskCache$1;
                Object obj2 = networkFetcher$writeToDiskCache$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkFetcher$writeToDiskCache$12.label;
                Throwable th = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!lg70Var.g.getWriteEnabled()) {
                        if (qci0Var2 != null) {
                            try {
                                oo31.o(qci0Var2);
                                return null;
                            } catch (RuntimeException e) {
                                throw e;
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    }
                    qc7 qc7Var = (qc7) bVar.e.getValue();
                    lg70 lg70Var2 = bVar.b;
                    networkFetcher$writeToDiskCache$12.L$0 = qci0Var2;
                    networkFetcher$writeToDiskCache$12.L$1 = oz50Var2;
                    networkFetcher$writeToDiskCache$12.label = 1;
                    Object b = qc7Var.b(oz50Var, iz50Var, oz50Var2, lg70Var2, networkFetcher$writeToDiskCache$12);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    oz50Var3 = oz50Var2;
                } else if (i == 1) {
                    oz50 oz50Var7 = (oz50) networkFetcher$writeToDiskCache$12.L$1;
                    qci0 qci0Var3 = (qci0) networkFetcher$writeToDiskCache$12.L$0;
                    kotlin.b.b(obj2);
                    oz50Var3 = oz50Var7;
                    qci0Var2 = qci0Var3;
                    obj = obj2;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pci0Var2 = (pci0) networkFetcher$writeToDiskCache$12.L$2;
                    oz50Var6 = (oz50) networkFetcher$writeToDiskCache$12.L$1;
                    oz50Var5 = (oz50) networkFetcher$writeToDiskCache$12.L$0;
                    try {
                        kotlin.b.b(obj2);
                        return pci0Var2.a();
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            pci0Var2.a.c(false);
                        } catch (Exception unused2) {
                        }
                        ojt0Var = oz50Var5.e;
                        if (ojt0Var != null) {
                        }
                        ojt0Var2 = oz50Var6.e;
                        if (ojt0Var2 != null) {
                        }
                    }
                }
                oz50Var4 = ((pc7) obj).a;
                if (oz50Var4 != null) {
                    if (qci0Var2 != null) {
                        pci0Var = qci0Var2.a();
                    } else {
                        sci0 sci0Var = (sci0) bVar.d.getValue();
                        if (sci0Var != null) {
                            lg70Var.getClass();
                            String str = bVar.a;
                            coil3.disk.a aVar = sci0Var.b;
                            ByteString byteString = new ByteString(str.getBytes(uza.a));
                            byteString.b = str;
                            lxj c = aVar.c(byteString.f(JCP.DIGEST_SHA_256).i());
                            if (c != null) {
                                pci0Var = new pci0(c);
                            }
                        }
                        pci0Var = null;
                    }
                    if (pci0Var != null) {
                        try {
                            ici0 ici0Var = new ici0(bVar.e().D(pci0Var.a.e(0), false));
                            try {
                                dai0.R(oz50Var4, ici0Var);
                                try {
                                    ici0Var.close();
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
                            ojt0 ojt0Var3 = oz50Var4.e;
                            if (ojt0Var3 != null) {
                                r1r e3 = bVar.e();
                                oq90 e4 = pci0Var.a.e(1);
                                networkFetcher$writeToDiskCache$12.L$0 = oz50Var3;
                                networkFetcher$writeToDiskCache$12.L$1 = oz50Var4;
                                networkFetcher$writeToDiskCache$12.L$2 = pci0Var;
                                networkFetcher$writeToDiskCache$12.label = 2;
                                ojt0Var3.a(e3, e4);
                                if (zy11.a == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            pci0Var2 = pci0Var;
                            oz50Var6 = oz50Var4;
                            return pci0Var2.a();
                        } catch (Exception e5) {
                            e = e5;
                            oz50Var5 = oz50Var3;
                            pci0Var2 = pci0Var;
                            oz50Var6 = oz50Var4;
                            pci0Var2.a.c(false);
                            ojt0Var = oz50Var5.e;
                            if (ojt0Var != null) {
                                try {
                                    oo31.o(ojt0Var);
                                } catch (RuntimeException e6) {
                                    throw e6;
                                } catch (Exception unused3) {
                                }
                            }
                            ojt0Var2 = oz50Var6.e;
                            if (ojt0Var2 != null) {
                                throw e;
                            }
                            try {
                                oo31.o(ojt0Var2);
                                throw e;
                            } catch (RuntimeException e7) {
                                throw e7;
                            } catch (Exception unused4) {
                                throw e;
                            }
                        }
                    }
                }
                return null;
            }
        }
        networkFetcher$writeToDiskCache$1 = new NetworkFetcher$writeToDiskCache$1(bVar, continuationImpl);
        NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$122 = networkFetcher$writeToDiskCache$1;
        Object obj22 = networkFetcher$writeToDiskCache$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkFetcher$writeToDiskCache$122.label;
        Throwable th5 = null;
        if (i != 0) {
        }
        oz50Var4 = ((pc7) obj).a;
        if (oz50Var4 != null) {
        }
        return null;
    }

    @Override // defpackage.pwq
    public final Object a(Continuation continuation) {
        fxd fxdVar = (fxd) this.g.getValue();
        this.b.getClass();
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(1, this, b.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        ((rx11) fxdVar).getClass();
        return networkFetcher$fetch$2.invoke(continuation);
    }

    public final r1r e() {
        r1r r1rVar;
        sci0 sci0Var = (sci0) this.d.getValue();
        return (sci0Var == null || (r1rVar = sci0Var.a) == null) ? this.b.e : r1rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(String str, String str2) {
        String str3;
        if (str2 == null || cvu0.x(str2, "text/plain", false)) {
            if (!evu0.J(str)) {
                String h0 = evu0.h0('#', str, str);
                String h02 = evu0.h0('?', h0, h0);
                String e0 = evu0.e0('.', evu0.e0('/', h02, h02), "");
                if (!evu0.J(e0)) {
                    String lowerCase = e0.toLowerCase(Locale.ROOT);
                    str3 = (String) fh20.a.get(lowerCase);
                    if (str3 == null) {
                        str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                    if (str3 != null) {
                        return str3;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
            }
        }
        if (str2 != null) {
            return evu0.f0(';', str2, str2);
        }
        return null;
    }

    public final iz50 g() {
        uh uhVar = jev.b;
        lg70 lg70Var = this.b;
        zu50 zu50Var = (zu50) s8o.p(lg70Var, uhVar);
        zu50Var.getClass();
        wu50 wu50Var = new wu50(zu50Var);
        CachePolicy cachePolicy = lg70Var.g;
        boolean readEnabled = cachePolicy.getReadEnabled();
        boolean z = lg70Var.h.getReadEnabled() && ((w5e) this.f.getValue()).a();
        if (!z && readEnabled) {
            wu50Var.c("only-if-cached, max-stale=2147483647");
        } else if (!z || readEnabled) {
            if (!z && !readEnabled) {
                wu50Var.c("no-cache, only-if-cached");
            }
        } else if (cachePolicy.getWriteEnabled()) {
            wu50Var.c("no-cache");
        } else {
            wu50Var.c("no-cache, no-store");
        }
        String str = (String) s8o.p(lg70Var, jev.a);
        zu50 b = wu50Var.b();
        if (s8o.p(lg70Var, jev.c) == null) {
            return new iz50(this.a, str, b, lg70Var.i);
        }
        ny61.u();
        return null;
    }

    public final b0r h(qci0 qci0Var) {
        oq90 c = qci0Var.c();
        r1r e = e();
        this.b.getClass();
        return eja1.a(c, e, this.a, qci0Var, 16);
    }

    public final oz50 i(qci0 qci0Var) {
        Throwable th;
        oz50 oz50Var;
        try {
            r1r e = e();
            txj txjVar = qci0Var.a;
            if (txjVar.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            jci0 jci0Var = new jci0(e.G((oq90) txjVar.a.c.get(0)));
            try {
                oz50Var = dai0.F(jci0Var);
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
                oz50Var = null;
            }
            if (th == null) {
                return oz50Var;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
