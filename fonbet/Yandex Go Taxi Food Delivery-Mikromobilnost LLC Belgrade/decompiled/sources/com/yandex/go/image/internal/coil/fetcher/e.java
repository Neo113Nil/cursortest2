package com.yandex.go.image.internal.coil.fetcher;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import coil3.graphics.EnumC0136DataSource;
import com.yandex.go.image.api.domain.models.ImageLoadPriority;
import defpackage.b0r;
import defpackage.clx;
import defpackage.cvu0;
import defpackage.dai0;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.ib5;
import defpackage.ici0;
import defpackage.iz50;
import defpackage.jci0;
import defpackage.jev;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.kbv;
import defpackage.l3f0;
import defpackage.lg70;
import defpackage.ljo;
import defpackage.lxj;
import defpackage.ny61;
import defpackage.obv;
import defpackage.oc7;
import defpackage.ojt0;
import defpackage.oq90;
import defpackage.oz50;
import defpackage.pc7;
import defpackage.pci0;
import defpackage.pwq;
import defpackage.qbv;
import defpackage.qc7;
import defpackage.qci0;
import defpackage.qlb1;
import defpackage.r1r;
import defpackage.s8o;
import defpackage.sci0;
import defpackage.txj;
import defpackage.uh;
import defpackage.uza;
import defpackage.w511;
import defpackage.w5e;
import defpackage.wls;
import defpackage.wt50;
import defpackage.xev;
import defpackage.xt50;
import defpackage.yt50;
import defpackage.zct0;
import defpackage.zu50;
import defpackage.zy11;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.ByteString;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes.dex */
public final class e implements pwq {
    public final kbv a;
    public final lg70 b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;
    public final w5e g;
    public final c h;

    public e(kbv kbvVar, lg70 lg70Var, i3y i3yVar, i3y i3yVar2, i3y i3yVar3, i3y i3yVar4, w5e w5eVar, c cVar) {
        this.a = kbvVar;
        this.b = lg70Var;
        this.c = i3yVar;
        this.d = i3yVar2;
        this.e = i3yVar3;
        this.f = i3yVar4;
        this.g = w5eVar;
        this.h = cVar;
    }

    public static final Object b(e eVar, iz50 iz50Var, wls wlsVar, Continuation continuation) {
        if (eVar.b.h.getReadEnabled() && jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        coil3.network.okhttp.internal.a aVar = (coil3.network.okhttp.internal.a) eVar.c.getValue();
        return coil3.network.okhttp.internal.a.a(aVar.a, iz50Var, new RemoteImageNetworkFetcher$executeNetworkRequest$2(wlsVar, null), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, qci0 qci0Var, oz50 oz50Var, iz50 iz50Var, oz50 oz50Var2, qc7 qc7Var, ContinuationImpl continuationImpl) {
        RemoteImageNetworkFetcher$writeToDiskCache$1 remoteImageNetworkFetcher$writeToDiskCache$1;
        int i;
        Object obj;
        oz50 oz50Var3;
        oz50 oz50Var4;
        pci0 pci0Var;
        oz50 oz50Var5;
        pci0 pci0Var2;
        oz50 oz50Var6;
        Throwable th;
        ojt0 ojt0Var;
        ojt0 ojt0Var2;
        qci0 qci0Var2 = qci0Var;
        eVar.getClass();
        lg70 lg70Var = eVar.b;
        if (continuationImpl instanceof RemoteImageNetworkFetcher$writeToDiskCache$1) {
            remoteImageNetworkFetcher$writeToDiskCache$1 = (RemoteImageNetworkFetcher$writeToDiskCache$1) continuationImpl;
            int i2 = remoteImageNetworkFetcher$writeToDiskCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteImageNetworkFetcher$writeToDiskCache$1.label = i2 - Integer.MIN_VALUE;
                RemoteImageNetworkFetcher$writeToDiskCache$1 remoteImageNetworkFetcher$writeToDiskCache$12 = remoteImageNetworkFetcher$writeToDiskCache$1;
                Object obj2 = remoteImageNetworkFetcher$writeToDiskCache$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteImageNetworkFetcher$writeToDiskCache$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!lg70Var.g.getWriteEnabled()) {
                        if (qci0Var2 != null) {
                            com.yandex.go.image.internal.coil.utils.a.a(qci0Var2);
                            return null;
                        }
                        return null;
                    }
                    lg70 lg70Var2 = eVar.b;
                    remoteImageNetworkFetcher$writeToDiskCache$12.L$0 = qci0Var2;
                    remoteImageNetworkFetcher$writeToDiskCache$12.L$1 = null;
                    remoteImageNetworkFetcher$writeToDiskCache$12.L$2 = null;
                    remoteImageNetworkFetcher$writeToDiskCache$12.L$3 = oz50Var2;
                    remoteImageNetworkFetcher$writeToDiskCache$12.L$4 = null;
                    remoteImageNetworkFetcher$writeToDiskCache$12.label = 1;
                    Object b = qc7Var.b(oz50Var, iz50Var, oz50Var2, lg70Var2, remoteImageNetworkFetcher$writeToDiskCache$12);
                    if (b == obj3) {
                        return obj3;
                    }
                    obj = b;
                    oz50Var3 = oz50Var2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pci0Var2 = (pci0) remoteImageNetworkFetcher$writeToDiskCache$12.L$7;
                        oz50Var6 = (oz50) remoteImageNetworkFetcher$writeToDiskCache$12.L$6;
                        oz50Var5 = (oz50) remoteImageNetworkFetcher$writeToDiskCache$12.L$3;
                        try {
                            kotlin.b.b(obj2);
                            return pci0Var2.a();
                        } catch (Exception e) {
                            e = e;
                            try {
                                pci0Var2.a.c(false);
                            } catch (Exception unused) {
                            }
                            ojt0Var = oz50Var5.e;
                            if (ojt0Var != null) {
                                com.yandex.go.image.internal.coil.utils.a.a(ojt0Var);
                            }
                            ojt0Var2 = oz50Var6.e;
                            if (ojt0Var2 != null) {
                                throw e;
                            }
                            com.yandex.go.image.internal.coil.utils.a.a(ojt0Var2);
                            throw e;
                        }
                    }
                    oz50 oz50Var7 = (oz50) remoteImageNetworkFetcher$writeToDiskCache$12.L$3;
                    qci0 qci0Var3 = (qci0) remoteImageNetworkFetcher$writeToDiskCache$12.L$0;
                    kotlin.b.b(obj2);
                    oz50Var3 = oz50Var7;
                    qci0Var2 = qci0Var3;
                    obj = obj2;
                }
                oz50Var4 = ((pc7) obj).a;
                if (oz50Var4 != null) {
                    if (qci0Var2 != null) {
                        pci0Var = qci0Var2.a();
                    } else {
                        sci0 sci0Var = (sci0) eVar.d.getValue();
                        if (sci0Var != null) {
                            lg70Var.getClass();
                            String key = eVar.a.getKey();
                            coil3.disk.a aVar = sci0Var.b;
                            ByteString byteString = new ByteString(key.getBytes(uza.a));
                            byteString.b = key;
                            lxj c = aVar.c(byteString.f(JCP.DIGEST_SHA_256).i());
                            if (c != null) {
                                pci0Var = new pci0(c);
                            }
                        }
                        pci0Var = null;
                    }
                    if (pci0Var != null) {
                        try {
                            ici0 ici0Var = new ici0(eVar.d().D(pci0Var.a.e(0), false));
                            try {
                                dai0.R(oz50Var4, ici0Var);
                                try {
                                    ici0Var.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                try {
                                    ici0Var.close();
                                } catch (Throwable th4) {
                                    ljo.a(th3, th4);
                                }
                                th = th3;
                            }
                            if (th != null) {
                                throw th;
                            }
                            ojt0 ojt0Var3 = oz50Var4.e;
                            if (ojt0Var3 == null) {
                                pci0Var2 = pci0Var;
                                oz50Var6 = oz50Var4;
                                return pci0Var2.a();
                            }
                            r1r d = eVar.d();
                            oq90 e2 = pci0Var.a.e(1);
                            remoteImageNetworkFetcher$writeToDiskCache$12.L$0 = null;
                            remoteImageNetworkFetcher$writeToDiskCache$12.L$1 = null;
                            remoteImageNetworkFetcher$writeToDiskCache$12.L$2 = null;
                            remoteImageNetworkFetcher$writeToDiskCache$12.L$3 = oz50Var3;
                            remoteImageNetworkFetcher$writeToDiskCache$12.L$4 = null;
                            remoteImageNetworkFetcher$writeToDiskCache$12.L$5 = null;
                            remoteImageNetworkFetcher$writeToDiskCache$12.L$6 = oz50Var4;
                            remoteImageNetworkFetcher$writeToDiskCache$12.L$7 = pci0Var;
                            remoteImageNetworkFetcher$writeToDiskCache$12.label = 2;
                            ojt0Var3.a(d, e2);
                            Object obj4 = zy11.a;
                            if (obj4 == obj3) {
                                return obj3;
                            }
                            pci0Var2 = pci0Var;
                            oz50Var6 = oz50Var4;
                            obj2 = obj4;
                            return pci0Var2.a();
                        } catch (Exception e3) {
                            e = e3;
                            oz50Var5 = oz50Var3;
                            pci0Var2 = pci0Var;
                            oz50Var6 = oz50Var4;
                            pci0Var2.a.c(false);
                            ojt0Var = oz50Var5.e;
                            if (ojt0Var != null) {
                            }
                            ojt0Var2 = oz50Var6.e;
                            if (ojt0Var2 != null) {
                            }
                        }
                    }
                }
                return null;
            }
        }
        remoteImageNetworkFetcher$writeToDiskCache$1 = new RemoteImageNetworkFetcher$writeToDiskCache$1(eVar, continuationImpl);
        RemoteImageNetworkFetcher$writeToDiskCache$1 remoteImageNetworkFetcher$writeToDiskCache$122 = remoteImageNetworkFetcher$writeToDiskCache$1;
        Object obj22 = remoteImageNetworkFetcher$writeToDiskCache$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteImageNetworkFetcher$writeToDiskCache$122.label;
        if (i != 0) {
        }
        oz50Var4 = ((pc7) obj).a;
        if (oz50Var4 != null) {
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:3|(17:5|6|7|8|(1:(1:(3:(1:(1:(4:15|16|17|18)(2:25|26))(9:27|28|29|30|(1:(1:33)(1:56))(2:57|(2:(1:60)(1:62)|61)(2:63|64))|(1:55)(1:37)|38|(4:40|(2:42|(1:44)(1:48))(2:49|(1:51)(2:52|53))|45|(1:47))|54))(6:65|66|67|68|69|70)|(1:23)|24)(4:74|75|76|(6:78|(1:80)(1:84)|81|(2:83|47)|69|70)(4:85|86|87|(2:96|97)(4:(1:92)|93|(8:95|30|(0)(0)|(1:35)|55|38|(0)|54)|47))))(1:100))(1:135)|101|(1:103)(2:127|(2:129|(1:131)(1:132))(2:133|134))|104|105|106|(2:108|(4:110|(2:120|121)|113|(3:115|(3:117|76|(0)(0))|47))(2:122|123))|124|86|87|(1:89)|96|97))|139|6|7|8|(0)(0)|101|(0)(0)|104|105|106|(0)|124|86|87|(0)|96|97) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x016a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x016b, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00ea, code lost:
    
        if (r0 == r8) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0094, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0095, code lost:
    
        r2 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020d, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0133 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:106:0x0127, B:108:0x0133, B:110:0x013d, B:113:0x016e, B:115:0x0176, B:118:0x0151, B:120:0x0159, B:122:0x01eb, B:123:0x01f2), top: B:105:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02b1 A[Catch: Exception -> 0x0094, TryCatch #4 {Exception -> 0x0094, blocks: (B:28:0x008d, B:30:0x023e, B:33:0x0252, B:35:0x029c, B:37:0x02a0, B:38:0x02a6, B:40:0x02b1, B:42:0x02b5, B:44:0x02c9, B:45:0x02db, B:49:0x02d1, B:51:0x02d5, B:52:0x02fb, B:53:0x0300, B:56:0x0261, B:57:0x027d, B:60:0x0283, B:61:0x0292, B:62:0x0289, B:63:0x0302, B:64:0x0307, B:69:0x01d0, B:75:0x00d3, B:76:0x0196, B:78:0x01a0, B:80:0x01b0, B:81:0x01b7), top: B:8:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027d A[Catch: Exception -> 0x0094, TryCatch #4 {Exception -> 0x0094, blocks: (B:28:0x008d, B:30:0x023e, B:33:0x0252, B:35:0x029c, B:37:0x02a0, B:38:0x02a6, B:40:0x02b1, B:42:0x02b5, B:44:0x02c9, B:45:0x02db, B:49:0x02d1, B:51:0x02d5, B:52:0x02fb, B:53:0x0300, B:56:0x0261, B:57:0x027d, B:60:0x0283, B:61:0x0292, B:62:0x0289, B:63:0x0302, B:64:0x0307, B:69:0x01d0, B:75:0x00d3, B:76:0x0196, B:78:0x01a0, B:80:0x01b0, B:81:0x01b7), top: B:8:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a0 A[Catch: Exception -> 0x0094, TryCatch #4 {Exception -> 0x0094, blocks: (B:28:0x008d, B:30:0x023e, B:33:0x0252, B:35:0x029c, B:37:0x02a0, B:38:0x02a6, B:40:0x02b1, B:42:0x02b5, B:44:0x02c9, B:45:0x02db, B:49:0x02d1, B:51:0x02d5, B:52:0x02fb, B:53:0x0300, B:56:0x0261, B:57:0x027d, B:60:0x0283, B:61:0x0292, B:62:0x0289, B:63:0x0302, B:64:0x0307, B:69:0x01d0, B:75:0x00d3, B:76:0x0196, B:78:0x01a0, B:80:0x01b0, B:81:0x01b7), top: B:8:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fe A[Catch: Exception -> 0x020c, TryCatch #1 {Exception -> 0x020c, blocks: (B:87:0x01f6, B:89:0x01fe, B:92:0x0208, B:93:0x0210, B:96:0x0308, B:97:0x030f), top: B:86:0x01f6 }] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [T] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, qc7] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, oz50] */
    @Override // defpackage.pwq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        RemoteImageNetworkFetcher$fetch$1 remoteImageNetworkFetcher$fetch$1;
        int i;
        lg70 lg70Var;
        kbv kbvVar;
        qci0 qci0Var;
        qci0 qci0Var2;
        qci0 qci0Var3;
        String a;
        Object obj;
        Ref$ObjectRef ref$ObjectRef;
        qci0 qci0Var4;
        Ref$ObjectRef ref$ObjectRef2;
        String str;
        String str2;
        ?? r0;
        Ref$ObjectRef ref$ObjectRef3;
        qci0 qci0Var5;
        Ref$ObjectRef ref$ObjectRef4;
        qc7 qc7Var;
        lg70 lg70Var2;
        String str3;
        qci0 qci0Var6;
        qc7 qc7Var2;
        oz50 oz50Var;
        Object obj2;
        yt50 yt50Var;
        oz50 M0;
        xev b;
        long j;
        zu50 zu50Var;
        if (continuation instanceof RemoteImageNetworkFetcher$fetch$1) {
            remoteImageNetworkFetcher$fetch$1 = (RemoteImageNetworkFetcher$fetch$1) continuation;
            int i2 = remoteImageNetworkFetcher$fetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteImageNetworkFetcher$fetch$1.label = i2 - Integer.MIN_VALUE;
                RemoteImageNetworkFetcher$fetch$1 remoteImageNetworkFetcher$fetch$12 = remoteImageNetworkFetcher$fetch$1;
                ?? r02 = remoteImageNetworkFetcher$fetch$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteImageNetworkFetcher$fetch$12.label;
                zy11 zy11Var = zy11.a;
                c cVar = this.h;
                lg70Var = this.b;
                kbvVar = this.a;
                if (i != 0) {
                    kotlin.b.b(r02);
                    RemoteImageNetworkFetcher$fetch$snapshot$1 remoteImageNetworkFetcher$fetch$snapshot$1 = new RemoteImageNetworkFetcher$fetch$snapshot$1(this, null);
                    remoteImageNetworkFetcher$fetch$12.label = 1;
                    ?? e = cVar.e(kbvVar, remoteImageNetworkFetcher$fetch$snapshot$1, remoteImageNetworkFetcher$fetch$12);
                    qci0Var2 = e;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ref$ObjectRef4 = (Ref$ObjectRef) remoteImageNetworkFetcher$fetch$12.L$5;
                            ref$ObjectRef = (Ref$ObjectRef) remoteImageNetworkFetcher$fetch$12.L$4;
                            ref$ObjectRef3 = (Ref$ObjectRef) remoteImageNetworkFetcher$fetch$12.L$3;
                            qc7 qc7Var3 = (qc7) remoteImageNetworkFetcher$fetch$12.L$2;
                            str2 = (String) remoteImageNetworkFetcher$fetch$12.L$1;
                            qci0Var5 = (qci0) remoteImageNetworkFetcher$fetch$12.L$0;
                            kotlin.b.b(r02);
                            r0 = r02;
                            qc7Var2 = qc7Var3;
                            ref$ObjectRef4.element = r0;
                            oz50Var = ((oc7) ref$ObjectRef3.element).b;
                            if (oz50Var == null) {
                                Long l = d().v(qci0Var5.c()).d;
                                long longValue = l != null ? l.longValue() : 0L;
                                remoteImageNetworkFetcher$fetch$12.L$0 = qci0Var5;
                                remoteImageNetworkFetcher$fetch$12.L$1 = str2;
                                remoteImageNetworkFetcher$fetch$12.L$2 = null;
                                remoteImageNetworkFetcher$fetch$12.L$3 = null;
                                remoteImageNetworkFetcher$fetch$12.L$4 = null;
                                remoteImageNetworkFetcher$fetch$12.L$5 = oz50Var;
                                remoteImageNetworkFetcher$fetch$12.J$0 = longValue;
                                remoteImageNetworkFetcher$fetch$12.label = 3;
                                jx81.l(oz50Var, longValue, remoteImageNetworkFetcher$fetch$12);
                                if (zy11Var == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return new zct0(g(qci0Var5), e(str2, oz50Var.d.a("Content-Type")), EnumC0136DataSource.DISK);
                            }
                            String str4 = str2;
                            qci0Var4 = qci0Var5;
                            str = str4;
                            ref$ObjectRef2 = ref$ObjectRef3;
                            qc7Var = qc7Var2;
                            if (lg70Var.h.getReadEnabled() || !this.g.a()) {
                                throw new IOException("Image cache miss, network request not allowed");
                            }
                            if (qci0Var4 != null) {
                                com.yandex.go.image.internal.coil.utils.a.a(qci0Var4);
                            }
                            int priority = ((ImageLoadPriority) s8o.p(lg70Var, clx.d)).getPriority();
                            lg70Var2 = lg70Var;
                            RemoteImageNetworkFetcher$fetch$calculation$1 remoteImageNetworkFetcher$fetch$calculation$1 = new RemoteImageNetworkFetcher$fetch$calculation$1(ref$ObjectRef2, this, str, ref$ObjectRef, qc7Var, null);
                            remoteImageNetworkFetcher$fetch$12.L$0 = qci0Var4;
                            remoteImageNetworkFetcher$fetch$12.L$1 = str;
                            remoteImageNetworkFetcher$fetch$12.L$2 = null;
                            remoteImageNetworkFetcher$fetch$12.L$3 = null;
                            remoteImageNetworkFetcher$fetch$12.L$4 = null;
                            remoteImageNetworkFetcher$fetch$12.L$5 = null;
                            remoteImageNetworkFetcher$fetch$12.label = 4;
                            Object b2 = cVar.b(priority, kbvVar, remoteImageNetworkFetcher$fetch$calculation$1, remoteImageNetworkFetcher$fetch$12);
                            if (b2 != coroutineSingletons) {
                                str3 = str;
                                qci0Var6 = qci0Var4;
                                obj2 = b2;
                                l3f0 l3f0Var = (l3f0) obj2;
                                Object obj3 = l3f0Var.a;
                                boolean z = l3f0Var.b;
                                yt50Var = (yt50) obj3;
                                M0 = yt50Var.M0();
                                if (yt50Var instanceof wt50) {
                                }
                                zct0 zct0Var = new zct0(b, e(str3, (M0 != null || (zu50Var = M0.d) == null) ? null : zu50Var.a("Content-Type")), EnumC0136DataSource.NETWORK);
                                if (M0 != null) {
                                }
                                return zct0Var;
                            }
                            return coroutineSingletons;
                        }
                        if (i == 3) {
                            oz50Var = (oz50) remoteImageNetworkFetcher$fetch$12.L$5;
                            String str5 = (String) remoteImageNetworkFetcher$fetch$12.L$1;
                            qci0 qci0Var7 = (qci0) remoteImageNetworkFetcher$fetch$12.L$0;
                            try {
                                kotlin.b.b(r02);
                                str2 = str5;
                                qci0Var5 = qci0Var7;
                                return new zct0(g(qci0Var5), e(str2, oz50Var.d.a("Content-Type")), EnumC0136DataSource.DISK);
                            } catch (Exception e2) {
                                e = e2;
                                qci0Var = qci0Var7;
                            }
                        } else {
                            if (i == 4) {
                                str3 = (String) remoteImageNetworkFetcher$fetch$12.L$1;
                                qci0Var6 = (qci0) remoteImageNetworkFetcher$fetch$12.L$0;
                                kotlin.b.b(r02);
                                lg70Var2 = lg70Var;
                                obj2 = r02;
                                l3f0 l3f0Var2 = (l3f0) obj2;
                                Object obj32 = l3f0Var2.a;
                                boolean z2 = l3f0Var2.b;
                                yt50Var = (yt50) obj32;
                                M0 = yt50Var.M0();
                                if (yt50Var instanceof wt50) {
                                    if (!(yt50Var instanceof xt50)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    b = eja1.b(z2 ? ((xt50) yt50Var).a : ((xt50) yt50Var).a.c(), d());
                                } else if (z2) {
                                    qci0Var6 = ((wt50) yt50Var).a;
                                    b = g(((wt50) yt50Var).a);
                                } else {
                                    oq90 c = ((wt50) yt50Var).a.c();
                                    r1r d = d();
                                    lg70Var2.getClass();
                                    b = eja1.a(c, d, kbvVar.getKey(), null, 24);
                                }
                                zct0 zct0Var2 = new zct0(b, e(str3, (M0 != null || (zu50Var = M0.d) == null) ? null : zu50Var.a("Content-Type")), EnumC0136DataSource.NETWORK);
                                if (M0 != null) {
                                    if (yt50Var instanceof wt50) {
                                        Long l2 = d().v(((wt50) yt50Var).a.c()).d;
                                        j = l2 != null ? l2.longValue() : 0L;
                                    } else {
                                        if (!(yt50Var instanceof xt50)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        j = ((xt50) yt50Var).a.b;
                                    }
                                    remoteImageNetworkFetcher$fetch$12.L$0 = qci0Var6;
                                    remoteImageNetworkFetcher$fetch$12.L$1 = null;
                                    remoteImageNetworkFetcher$fetch$12.L$2 = null;
                                    remoteImageNetworkFetcher$fetch$12.L$3 = null;
                                    remoteImageNetworkFetcher$fetch$12.L$4 = null;
                                    remoteImageNetworkFetcher$fetch$12.L$5 = null;
                                    remoteImageNetworkFetcher$fetch$12.L$6 = null;
                                    remoteImageNetworkFetcher$fetch$12.L$7 = null;
                                    remoteImageNetworkFetcher$fetch$12.L$8 = zct0Var2;
                                    remoteImageNetworkFetcher$fetch$12.L$9 = null;
                                    remoteImageNetworkFetcher$fetch$12.J$0 = j;
                                    remoteImageNetworkFetcher$fetch$12.label = 5;
                                    jx81.l(M0, j, remoteImageNetworkFetcher$fetch$12);
                                    if (zy11Var == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return zct0Var2;
                            }
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            zct0 zct0Var3 = (zct0) remoteImageNetworkFetcher$fetch$12.L$8;
                            qci0Var = (qci0) remoteImageNetworkFetcher$fetch$12.L$0;
                            try {
                                kotlin.b.b(r02);
                                return zct0Var3;
                            } catch (Exception e3) {
                                e = e3;
                            }
                        }
                        if (qci0Var != null) {
                            com.yandex.go.image.internal.coil.utils.a.a(qci0Var);
                        }
                        throw e;
                    }
                    kotlin.b.b(r02);
                    qci0Var2 = r02;
                }
                qci0Var3 = qci0Var2;
                if (!(kbvVar instanceof qbv)) {
                    a = ((qbv) kbvVar).b;
                    obj = qc7.a;
                } else {
                    if (!(kbvVar instanceof obv)) {
                        w511.b();
                        return null;
                    }
                    obv obvVar = (obv) kbvVar;
                    a = ((ib5) this.e.getValue()).a(obvVar);
                    obj = evu0.z(obvVar.b, ':') ? qc7.a : (qc7) this.f.getValue();
                }
                ?? r5 = obj;
                Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                ref$ObjectRef = new Ref$ObjectRef();
                if (qci0Var3 != null) {
                    r1r d2 = d();
                    txj txjVar = qci0Var3.a;
                    if (txjVar.b) {
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long l3 = d2.v((oq90) txjVar.a.c.get(0)).d;
                    if (l3 != null && l3.longValue() == 0) {
                        return new zct0(g(qci0Var3), e(a, null), EnumC0136DataSource.DISK);
                    }
                    ?? h = h(qci0Var3);
                    ref$ObjectRef.element = h;
                    if (h != 0) {
                        iz50 f = f(a);
                        remoteImageNetworkFetcher$fetch$12.L$0 = qci0Var3;
                        remoteImageNetworkFetcher$fetch$12.L$1 = a;
                        remoteImageNetworkFetcher$fetch$12.L$2 = r5;
                        remoteImageNetworkFetcher$fetch$12.L$3 = ref$ObjectRef5;
                        remoteImageNetworkFetcher$fetch$12.L$4 = ref$ObjectRef;
                        remoteImageNetworkFetcher$fetch$12.L$5 = ref$ObjectRef5;
                        remoteImageNetworkFetcher$fetch$12.label = 2;
                        Object a2 = r5.a(h, f, lg70Var, remoteImageNetworkFetcher$fetch$12);
                        if (a2 != coroutineSingletons) {
                            str2 = a;
                            r0 = a2;
                            ref$ObjectRef3 = ref$ObjectRef5;
                            qci0Var5 = qci0Var3;
                            ref$ObjectRef4 = ref$ObjectRef3;
                            qc7Var2 = r5;
                            ref$ObjectRef4.element = r0;
                            oz50Var = ((oc7) ref$ObjectRef3.element).b;
                            if (oz50Var == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                qci0Var4 = qci0Var3;
                ref$ObjectRef2 = ref$ObjectRef5;
                str = a;
                qc7Var = r5;
                if (lg70Var.h.getReadEnabled()) {
                }
                throw new IOException("Image cache miss, network request not allowed");
            }
        }
        remoteImageNetworkFetcher$fetch$1 = new RemoteImageNetworkFetcher$fetch$1(this, (ContinuationImpl) continuation);
        RemoteImageNetworkFetcher$fetch$1 remoteImageNetworkFetcher$fetch$122 = remoteImageNetworkFetcher$fetch$1;
        ?? r022 = remoteImageNetworkFetcher$fetch$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteImageNetworkFetcher$fetch$122.label;
        zy11 zy11Var2 = zy11.a;
        c cVar2 = this.h;
        lg70Var = this.b;
        kbvVar = this.a;
        if (i != 0) {
        }
        qci0Var3 = qci0Var2;
        if (!(kbvVar instanceof qbv)) {
        }
        ?? r52 = obj;
        Ref$ObjectRef ref$ObjectRef52 = new Ref$ObjectRef();
        ref$ObjectRef = new Ref$ObjectRef();
        if (qci0Var3 != null) {
        }
        qci0Var4 = qci0Var3;
        ref$ObjectRef2 = ref$ObjectRef52;
        str = a;
        qc7Var = r52;
        if (lg70Var.h.getReadEnabled()) {
        }
        throw new IOException("Image cache miss, network request not allowed");
    }

    public final r1r d() {
        r1r r1rVar;
        sci0 sci0Var = (sci0) this.d.getValue();
        return (sci0Var == null || (r1rVar = sci0Var.a) == null) ? this.b.e : r1rVar;
    }

    public final String e(String str, String str2) {
        String c;
        if ((str2 == null || cvu0.x(str2, "text/plain", false)) && (c = qlb1.c(str)) != null) {
            return c;
        }
        if (str2 != null) {
            return evu0.f0(';', str2, str2);
        }
        return null;
    }

    public final iz50 f(String str) {
        uh uhVar = jev.a;
        lg70 lg70Var = this.b;
        String str2 = (String) s8o.p(lg70Var, uhVar);
        zu50 zu50Var = (zu50) s8o.p(lg70Var, jev.b);
        if (s8o.p(lg70Var, jev.c) == null) {
            return new iz50(str, str2, zu50Var, lg70Var.i);
        }
        ny61.u();
        return null;
    }

    public final b0r g(qci0 qci0Var) {
        oq90 c = qci0Var.c();
        r1r d = d();
        this.b.getClass();
        return eja1.a(c, d, this.a.getKey(), qci0Var, 16);
    }

    public final oz50 h(qci0 qci0Var) {
        Throwable th;
        oz50 oz50Var;
        try {
            r1r d = d();
            txj txjVar = qci0Var.a;
            if (txjVar.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            jci0 jci0Var = new jci0(d.G((oq90) txjVar.a.c.get(0)));
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
