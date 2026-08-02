package xsna;

import android.os.SystemClock;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.utils.MessageIdUtilsKt;
import com.vk.push.pushsdk.client.ipc.AppNotInstalledException;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.nm8;
import xsna.uje0;

/* compiled from: CachingPushMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class bz8 implements zje0 {
    public final f920 a;
    public final vie0 b;
    public final ske0 c;
    public final don0 d;
    public final AnalyticsSender e;
    public final sul f;
    public final dqz0 g;
    public final ly1 h;
    public final tje0 i;
    public final FeatureManager j;
    public final AtomicBoolean k;
    public final hpj l;
    public final wi50 m;
    public final Logger n;
    public final LinkedHashMap o;

    /* compiled from: CachingPushMessagesReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.receiver.CachingPushMessagesReceiver$startReceiveMessages$1", f = "CachingPushMessagesReceiver.kt", l = {63}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return bz8.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                bz8 bz8Var = bz8.this;
                this.label = 1;
                if (bz8.j(bz8Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CachingPushMessagesReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.receiver.CachingPushMessagesReceiver$startReceiveMessages$2", f = "CachingPushMessagesReceiver.kt", l = {64}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return bz8.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                bz8 bz8Var = bz8.this;
                this.label = 1;
                Object collect = atr.a(bz8Var.c.j(), ty8.i, atr.c).collect(new uy8(bz8Var), this);
                if (collect != coroutineSingletons) {
                    collect = s3q0.a;
                }
                if (collect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public bz8(f920 f920Var, vie0 vie0Var, ske0 ske0Var, don0 don0Var, AnalyticsSender analyticsSender, sul sulVar, dqz0 dqz0Var, ly1 ly1Var, tje0 tje0Var, FeatureManager featureManager, Logger logger) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = f920Var;
        this.b = vie0Var;
        this.c = ske0Var;
        this.d = don0Var;
        this.e = analyticsSender;
        this.f = sulVar;
        this.g = dqz0Var;
        this.h = ly1Var;
        this.i = tje0Var;
        this.j = featureManager;
        this.k = atomicBoolean;
        this.l = zvj.a(wglVar);
        this.m = bay.a();
        this.n = logger.createLogger("CachingPushMessagesReceiver");
        this.o = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        if (r9.a(r8, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0107, code lost:
    
        if (r9.a(r8, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0069, code lost:
    
        if (r10 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(bz8 bz8Var, String str, ContinuationImpl continuationImpl) {
        vy8 vy8Var;
        int i;
        e790 e790Var;
        Object c;
        bz8 bz8Var2;
        AppInfo appInfo;
        bz8Var.getClass();
        if (continuationImpl instanceof vy8) {
            vy8Var = (vy8) continuationImpl;
            int i2 = vy8Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vy8Var.label = i2 - Integer.MIN_VALUE;
                Object obj = vy8Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vy8Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ske0 ske0Var = bz8Var.c;
                    vy8Var.L$0 = bz8Var;
                    vy8Var.label = 1;
                    obj = ske0Var.h(str, vy8Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.a.a(obj);
                                return s3q0.a;
                            }
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return s3q0.a;
                        }
                        appInfo = (AppInfo) vy8Var.L$1;
                        bz8Var2 = (bz8) vy8Var.L$0;
                        kotlin.a.a(obj);
                        c = ((Result) obj).d();
                        if (!(Result.a(c) instanceof HostIsNotMasterException)) {
                            Logger.DefaultImpls.error$default(bz8Var2.n, "Delete messages by token failed to " + appInfo.getPackageName() + ", this host is not a master", null, 2, null);
                            sul sulVar = bz8Var2.f;
                            String packageName = appInfo.getPackageName();
                            vy8Var.L$0 = null;
                            vy8Var.L$1 = null;
                            vy8Var.label = 3;
                        } else {
                            if (!(Result.a(c) instanceof AppNotInstalledException)) {
                                return s3q0.a;
                            }
                            Logger.DefaultImpls.error$default(bz8Var2.n, "Delete messages by token failed to " + appInfo.getPackageName(), null, 2, null);
                            sul sulVar2 = bz8Var2.f;
                            String packageName2 = appInfo.getPackageName();
                            vy8Var.L$0 = null;
                            vy8Var.L$1 = null;
                            vy8Var.label = 4;
                        }
                        return coroutineSingletons;
                    }
                    bz8Var = (bz8) vy8Var.L$0;
                    kotlin.a.a(obj);
                }
                e790Var = (e790) obj;
                if (e790Var != null) {
                    Logger.DefaultImpls.warn$default(bz8Var.n, "There is no package info!", null, 2, null);
                    return s3q0.a;
                }
                String str2 = e790Var.b;
                AppInfo appInfo2 = new AppInfo(str2, e790Var.c);
                Logger.DefaultImpls.debug$default(bz8Var.n, go9.b("Received syn is not continuous chain, calling on delete message to ", str2), null, 2, null);
                vie0 vie0Var = bz8Var.b;
                vy8Var.L$0 = bz8Var;
                vy8Var.L$1 = appInfo2;
                vy8Var.label = 2;
                c = vie0Var.c(appInfo2, vy8Var);
                if (c != coroutineSingletons) {
                    bz8Var2 = bz8Var;
                    appInfo = appInfo2;
                    if (!(Result.a(c) instanceof HostIsNotMasterException)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        vy8Var = new vy8(bz8Var, continuationImpl);
        Object obj2 = vy8Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vy8Var.label;
        if (i != 0) {
        }
        e790Var = (e790) obj2;
        if (e790Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e8, code lost:
    
        r2.L$0 = r0;
        r2.L$1 = r4;
        r2.L$2 = r1;
        r2.L$3 = r9;
        r2.L$4 = r12;
        r2.L$5 = r11;
        r2.Z$0 = r10;
        r2.label = 2;
        r13 = r0.n(r12, r1, r11, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fc, code lost:
    
        if (r13 != r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ff, code lost:
    
        r13 = r0;
        r0 = r10;
        r10 = r4;
        r4 = r11;
        r11 = r1;
        r1 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v13, types: [xsna.o0b] */
    /* JADX WARN: Type inference failed for: r10v11, types: [xsna.o0b] */
    /* JADX WARN: Type inference failed for: r12v4, types: [xsna.o0b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0146 -> B:12:0x0149). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0150 -> B:13:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b3 -> B:13:0x00ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(bz8 bz8Var, ContinuationImpl continuationImpl) {
        wy8 wy8Var;
        int i;
        nm8.a aVar;
        bz8 bz8Var2;
        nm8.a aVar2;
        boolean z;
        ReceivedBy receivedBy;
        Iterator it;
        String str;
        boolean z2;
        Iterator it2;
        ReceivedBy receivedBy2;
        bz8 bz8Var3;
        nm8.a aVar3;
        bz8 bz8Var4 = bz8Var;
        bz8Var4.getClass();
        if (continuationImpl instanceof wy8) {
            wy8Var = (wy8) continuationImpl;
            int i2 = wy8Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wy8Var.label = i2 - Integer.MIN_VALUE;
                Object obj = wy8Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wy8Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    nm8 nm8Var = bz8Var4.a.d;
                    nm8Var.getClass();
                    aVar = new nm8.a();
                    wy8Var.L$0 = bz8Var4;
                    wy8Var.L$1 = aVar;
                    wy8Var.L$2 = null;
                    wy8Var.L$3 = null;
                    wy8Var.L$4 = null;
                    wy8Var.L$5 = null;
                    wy8Var.label = 1;
                    obj = aVar.a(wy8Var);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = wy8Var.Z$0;
                        it2 = (Iterator) wy8Var.L$3;
                        receivedBy2 = (ReceivedBy) wy8Var.L$2;
                        ?? r10 = (o0b) wy8Var.L$1;
                        bz8Var3 = (bz8) wy8Var.L$0;
                        kotlin.a.a(obj);
                        aVar3 = r10;
                        receivedBy = receivedBy2;
                        it = it2;
                        aVar = aVar3;
                        z = z2;
                        bz8Var4 = bz8Var3;
                        while (it.hasNext()) {
                            uje0.b bVar = (uje0.b) it.next();
                            str = bVar.a;
                            List<eje0> list = bVar.c;
                            if (!list.isEmpty()) {
                                break;
                            }
                            Logger.DefaultImpls.warn$default(bz8Var4.n, "You are trying to save empty messages", null, 2, null);
                        }
                        myc0.h(bz8Var4.l, null, null, new xy8(bz8Var4, null), 3);
                        wy8Var.L$0 = bz8Var4;
                        wy8Var.L$1 = aVar;
                        wy8Var.L$2 = null;
                        wy8Var.L$3 = null;
                        wy8Var.L$4 = null;
                        wy8Var.L$5 = null;
                        wy8Var.label = 1;
                        obj = aVar.a(wy8Var);
                        if (obj != coroutineSingletons) {
                            nm8.a aVar4 = aVar;
                            bz8Var2 = bz8Var4;
                            aVar2 = aVar4;
                            if (((Boolean) obj).booleanValue()) {
                                return s3q0.a;
                            }
                            wje0 wje0Var = (wje0) aVar2.next();
                            List<uje0.b> list2 = wje0Var.a;
                            z = wje0Var.b;
                            receivedBy = wje0Var.c;
                            it = list2.iterator();
                            bz8 bz8Var5 = bz8Var2;
                            aVar = aVar2;
                            bz8Var4 = bz8Var5;
                            while (it.hasNext()) {
                            }
                            myc0.h(bz8Var4.l, null, null, new xy8(bz8Var4, null), 3);
                            wy8Var.L$0 = bz8Var4;
                            wy8Var.L$1 = aVar;
                            wy8Var.L$2 = null;
                            wy8Var.L$3 = null;
                            wy8Var.L$4 = null;
                            wy8Var.L$5 = null;
                            wy8Var.label = 1;
                            obj = aVar.a(wy8Var);
                            if (obj != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    z2 = wy8Var.Z$0;
                    List<eje0> list3 = (List) wy8Var.L$5;
                    String str2 = (String) wy8Var.L$4;
                    Iterator it3 = (Iterator) wy8Var.L$3;
                    ReceivedBy receivedBy3 = (ReceivedBy) wy8Var.L$2;
                    ?? r12 = (o0b) wy8Var.L$1;
                    bz8 bz8Var6 = (bz8) wy8Var.L$0;
                    kotlin.a.a(obj);
                    str = str2;
                    it = it3;
                    nm8.a aVar5 = r12;
                    if (!((Boolean) obj).booleanValue()) {
                        aVar = aVar5;
                        receivedBy = receivedBy3;
                        z = z2;
                        bz8Var4 = bz8Var6;
                        while (it.hasNext()) {
                        }
                        myc0.h(bz8Var4.l, null, null, new xy8(bz8Var4, null), 3);
                        wy8Var.L$0 = bz8Var4;
                        wy8Var.L$1 = aVar;
                        wy8Var.L$2 = null;
                        wy8Var.L$3 = null;
                        wy8Var.L$4 = null;
                        wy8Var.L$5 = null;
                        wy8Var.label = 1;
                        obj = aVar.a(wy8Var);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    Logger.DefaultImpls.info$default(bz8Var6.n, "Saved " + list3.size() + " messages, received by route " + receivedBy3, null, 2, null);
                    wy8Var.L$0 = bz8Var6;
                    wy8Var.L$1 = aVar5;
                    wy8Var.L$2 = receivedBy3;
                    wy8Var.L$3 = it;
                    wy8Var.L$4 = null;
                    wy8Var.L$5 = null;
                    wy8Var.Z$0 = z2;
                    wy8Var.label = 3;
                    if (bz8Var6.o(str, list3, z2, wy8Var) != coroutineSingletons) {
                        it2 = it;
                        receivedBy2 = receivedBy3;
                        bz8Var3 = bz8Var6;
                        aVar3 = aVar5;
                        receivedBy = receivedBy2;
                        it = it2;
                        aVar = aVar3;
                        z = z2;
                        bz8Var4 = bz8Var3;
                        while (it.hasNext()) {
                        }
                        myc0.h(bz8Var4.l, null, null, new xy8(bz8Var4, null), 3);
                        wy8Var.L$0 = bz8Var4;
                        wy8Var.L$1 = aVar;
                        wy8Var.L$2 = null;
                        wy8Var.L$3 = null;
                        wy8Var.L$4 = null;
                        wy8Var.L$5 = null;
                        wy8Var.label = 1;
                        obj = aVar.a(wy8Var);
                        if (obj != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                ?? r0 = (o0b) wy8Var.L$1;
                bz8Var2 = (bz8) wy8Var.L$0;
                kotlin.a.a(obj);
                aVar2 = r0;
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        wy8Var = new wy8(bz8Var4, continuationImpl);
        Object obj2 = wy8Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wy8Var.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x012f, code lost:
    
        if (r0.b(r2) == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        if (r1 != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0084, code lost:
    
        if (r1 == r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(bz8 bz8Var, ContinuationImpl continuationImpl) {
        az8 az8Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        long longValue;
        long elapsedRealtime;
        Object featureValue;
        bz8 bz8Var2;
        TimeUnit timeUnit;
        bz8 bz8Var3;
        bz8 bz8Var4 = bz8Var;
        bz8Var4.getClass();
        if (continuationImpl instanceof az8) {
            az8Var = (az8) continuationImpl;
            int i2 = az8Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                az8Var.label = i2 - Integer.MIN_VALUE;
                Object obj = az8Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = az8Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (bz8Var4.k.compareAndSet(false, true)) {
                        ly1 ly1Var = bz8Var4.h;
                        az8Var.L$0 = bz8Var4;
                        az8Var.label = 1;
                        obj = ly1Var.a(az8Var);
                    }
                    return s3q0.a;
                }
                if (i == 1) {
                    bz8Var4 = (bz8) az8Var.L$0;
                    kotlin.a.a(obj);
                } else {
                    if (i == 2) {
                        elapsedRealtime = az8Var.J$1;
                        longValue = az8Var.J$0;
                        timeUnit = (TimeUnit) az8Var.L$1;
                        bz8Var2 = (bz8) az8Var.L$0;
                        kotlin.a.a(obj);
                        long millis = timeUnit.toMillis(((Number) obj).intValue());
                        if (longValue != 0 || longValue - elapsedRealtime >= 0 || elapsedRealtime - longValue >= millis) {
                            FeatureManager featureManager = bz8Var2.j;
                            Feature.IntFeature pushCountThreshold = CommonFeaturesKt.getPushCountThreshold();
                            az8Var.L$0 = bz8Var2;
                            az8Var.L$1 = null;
                            az8Var.label = 3;
                            obj = featureManager.getFeatureValue(pushCountThreshold, az8Var);
                            if (obj != coroutineSingletons) {
                                bz8Var3 = bz8Var2;
                                int intValue = ((Number) obj).intValue();
                                dqz0 dqz0Var = bz8Var3.g;
                                az8Var.L$0 = bz8Var3;
                                az8Var.label = 4;
                                obj = ((fje0) dqz0Var.b).f(intValue, az8Var);
                            }
                            return coroutineSingletons;
                        }
                        return s3q0.a;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return s3q0.a;
                        }
                        bz8Var3 = (bz8) az8Var.L$0;
                        kotlin.a.a(obj);
                        List<xje0> list = (List) obj;
                        for (xje0 xje0Var : list) {
                            bz8Var3.e.send(new o2p0(xje0Var.a, xje0Var.b));
                        }
                        if (!list.isEmpty()) {
                            ly1 ly1Var2 = bz8Var3.h;
                            az8Var.L$0 = null;
                            az8Var.label = 5;
                        }
                        return s3q0.a;
                    }
                    bz8Var3 = (bz8) az8Var.L$0;
                    kotlin.a.a(obj);
                    int intValue2 = ((Number) obj).intValue();
                    dqz0 dqz0Var2 = bz8Var3.g;
                    az8Var.L$0 = bz8Var3;
                    az8Var.label = 4;
                    obj = ((fje0) dqz0Var2.b).f(intValue2, az8Var);
                }
                longValue = ((Number) obj).longValue();
                elapsedRealtime = SystemClock.elapsedRealtime();
                TimeUnit timeUnit2 = TimeUnit.HOURS;
                FeatureManager featureManager2 = bz8Var4.j;
                Feature.IntFeature sendingPushCountAnalyticsIntervalHours = CommonFeaturesKt.getSendingPushCountAnalyticsIntervalHours();
                az8Var.L$0 = bz8Var4;
                az8Var.L$1 = timeUnit2;
                az8Var.J$0 = longValue;
                az8Var.J$1 = elapsedRealtime;
                az8Var.label = 2;
                featureValue = featureManager2.getFeatureValue(sendingPushCountAnalyticsIntervalHours, az8Var);
                if (featureValue != coroutineSingletons) {
                    bz8Var2 = bz8Var4;
                    timeUnit = timeUnit2;
                    obj = featureValue;
                    long millis2 = timeUnit.toMillis(((Number) obj).intValue());
                    if (longValue != 0) {
                    }
                    FeatureManager featureManager3 = bz8Var2.j;
                    Feature.IntFeature pushCountThreshold2 = CommonFeaturesKt.getPushCountThreshold();
                    az8Var.L$0 = bz8Var2;
                    az8Var.L$1 = null;
                    az8Var.label = 3;
                    obj = featureManager3.getFeatureValue(pushCountThreshold2, az8Var);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        az8Var = new az8(bz8Var4, continuationImpl);
        Object obj2 = az8Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = az8Var.label;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        elapsedRealtime = SystemClock.elapsedRealtime();
        TimeUnit timeUnit22 = TimeUnit.HOURS;
        FeatureManager featureManager22 = bz8Var4.j;
        Feature.IntFeature sendingPushCountAnalyticsIntervalHours2 = CommonFeaturesKt.getSendingPushCountAnalyticsIntervalHours();
        az8Var.L$0 = bz8Var4;
        az8Var.L$1 = timeUnit22;
        az8Var.J$0 = longValue;
        az8Var.J$1 = elapsedRealtime;
        az8Var.label = 2;
        featureValue = featureManager22.getFeatureValue(sendingPushCountAnalyticsIntervalHours2, az8Var);
        if (featureValue != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // xsna.zje0
    public final void a() {
        Logger.DefaultImpls.debug$default(this.n, "Pause receive messages", null, 2, null);
        this.a.a();
    }

    @Override // xsna.zje0
    public final void b(sj80 sj80Var) {
        this.a.b(sj80Var);
    }

    @Override // xsna.zje0
    public final b9f0<wje0> d() {
        return this.a.d;
    }

    @Override // xsna.zje0
    public final void e() {
        Logger.DefaultImpls.debug$default(this.n, "Stop receive messages", null, 2, null);
        this.a.e();
        zvj.c(this.l, null);
    }

    @Override // xsna.zje0
    public final void g() {
        a aVar = new a(null);
        hpj hpjVar = this.l;
        myc0.h(hpjVar, null, null, aVar, 3);
        myc0.h(hpjVar, null, null, new b(null), 3);
        Logger.DefaultImpls.debug$default(this.n, "Start receive messages", null, 2, null);
        this.a.g();
    }

    @Override // xsna.zje0
    public final void h(sj80 sj80Var) {
        this.a.h(sj80Var);
    }

    public final boolean l(Collection<Long> collection) {
        Collection<Long> collection2 = collection;
        boolean z = (((Number) j5g.h0(collection2)).longValue() - ((Number) j5g.X(collection2)).longValue()) + 1 == ((long) collection.size());
        Logger.DefaultImpls.debug$default(this.n, "Is " + collection + " continuous chain: " + z, null, 2, null);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, Collection collection, ContinuationImpl continuationImpl) {
        yy8 yy8Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        bz8 bz8Var;
        Long l;
        long longValue;
        don0 don0Var;
        bz8 bz8Var2;
        long j;
        if (continuationImpl instanceof yy8) {
            yy8Var = (yy8) continuationImpl;
            int i2 = yy8Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yy8Var.label = i2 - Integer.MIN_VALUE;
                Object obj = yy8Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yy8Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!l(collection)) {
                        Logger.DefaultImpls.debug$default(this.n, "Finished updating syn because the chain is not continuous", null, 2, null);
                        return s3q0.a;
                    }
                    yy8Var.L$0 = this;
                    yy8Var.L$1 = str;
                    yy8Var.L$2 = collection;
                    yy8Var.label = 1;
                    obj = this.d.c(str, yy8Var);
                    if (obj != coroutineSingletons) {
                        bz8Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = yy8Var.J$0;
                    bz8Var2 = (bz8) yy8Var.L$0;
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.debug$default(bz8Var2.n, defpackage.k0.a(j, "Finished updating last syn: "), null, 2, null);
                    return s3q0.a;
                }
                collection = (Collection) yy8Var.L$2;
                str = (String) yy8Var.L$1;
                bz8Var = (bz8) yy8Var.L$0;
                kotlin.a.a(obj);
                l = (Long) obj;
                longValue = ((Number) j5g.h0(collection)).longValue();
                bz8Var.getClass();
                if (l != null || longValue > l.longValue()) {
                    don0Var = bz8Var.d;
                    yy8Var.L$0 = bz8Var;
                    yy8Var.L$1 = null;
                    yy8Var.L$2 = null;
                    yy8Var.J$0 = longValue;
                    yy8Var.label = 2;
                    if (don0Var.b(str, longValue, yy8Var) != coroutineSingletons) {
                        bz8Var2 = bz8Var;
                        j = longValue;
                        Logger.DefaultImpls.debug$default(bz8Var2.n, defpackage.k0.a(j, "Finished updating last syn: "), null, 2, null);
                    }
                    return coroutineSingletons;
                }
                return s3q0.a;
            }
        }
        yy8Var = new yy8(this, continuationImpl);
        Object obj2 = yy8Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yy8Var.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        longValue = ((Number) j5g.h0(collection)).longValue();
        bz8Var.getClass();
        if (l != null) {
        }
        don0Var = bz8Var.d;
        yy8Var.L$0 = bz8Var;
        yy8Var.L$1 = null;
        yy8Var.L$2 = null;
        yy8Var.J$0 = longValue;
        yy8Var.label = 2;
        if (don0Var.b(str, longValue, yy8Var) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, ReceivedBy receivedBy, List list, ContinuationImpl continuationImpl) {
        zy8 zy8Var;
        int i;
        bz8 bz8Var;
        String str2;
        List<eje0> list2;
        ReceivedBy receivedBy2;
        e790 e790Var;
        if (continuationImpl instanceof zy8) {
            zy8Var = (zy8) continuationImpl;
            int i2 = zy8Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zy8Var.label = i2 - Integer.MIN_VALUE;
                Object obj = zy8Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zy8Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zy8Var.L$0 = this;
                    zy8Var.L$1 = str;
                    zy8Var.L$2 = receivedBy;
                    zy8Var.L$3 = list;
                    zy8Var.label = 1;
                    tje0 tje0Var = this.i;
                    obj = tje0Var.a.a(new sje0(tje0Var, str, list, receivedBy, null), zy8Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bz8Var = this;
                    str2 = str;
                    list2 = list;
                    receivedBy2 = receivedBy;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) zy8Var.L$3;
                    receivedBy2 = (ReceivedBy) zy8Var.L$2;
                    str2 = (String) zy8Var.L$1;
                    bz8Var = (bz8) zy8Var.L$0;
                    kotlin.a.a(obj);
                }
                e790Var = (e790) obj;
                if (e790Var != null) {
                    return Boolean.FALSE;
                }
                for (eje0 eje0Var : list2) {
                    bz8Var.e.send(new gke0(str2, receivedBy2, MessageIdUtilsKt.formMessageId(e790Var.a, eje0Var.a), e790Var.b));
                }
                return Boolean.TRUE;
            }
        }
        zy8Var = new zy8(this, continuationImpl);
        Object obj2 = zy8Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zy8Var.label;
        if (i != 0) {
        }
        e790Var = (e790) obj2;
        if (e790Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
    
        if (r5.m(r8, r14, r9) == r2) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[Catch: all -> 0x00bb, LOOP:0: B:37:0x00a4->B:39:0x00aa, LOOP_END, TryCatch #2 {all -> 0x00bb, blocks: (B:29:0x011a, B:36:0x0093, B:37:0x00a4, B:39:0x00aa, B:41:0x00bf, B:43:0x00ef, B:44:0x00f7, B:46:0x00fc, B:51:0x011f), top: B:35:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:29:0x011a, B:36:0x0093, B:37:0x00a4, B:39:0x00aa, B:41:0x00bf, B:43:0x00ef, B:44:0x00f7, B:46:0x00fc, B:51:0x011f), top: B:35:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:29:0x011a, B:36:0x0093, B:37:0x00a4, B:39:0x00aa, B:41:0x00bf, B:43:0x00ef, B:44:0x00f7, B:46:0x00fc, B:51:0x011f), top: B:35:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #2 {all -> 0x00bb, blocks: (B:29:0x011a, B:36:0x0093, B:37:0x00a4, B:39:0x00aa, B:41:0x00bf, B:43:0x00ef, B:44:0x00f7, B:46:0x00fc, B:51:0x011f), top: B:35:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r3v10, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r5v7, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, List list, boolean z, ContinuationImpl continuationImpl) {
        cz8 cz8Var;
        int i;
        String str2;
        List list2;
        boolean z2;
        bz8 bz8Var;
        wi50 wi50Var;
        ui50 ui50Var;
        Iterator it;
        Object obj;
        Set set;
        try {
            if (continuationImpl instanceof cz8) {
                cz8Var = (cz8) continuationImpl;
                int i2 = cz8Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cz8Var.label = i2 - Integer.MIN_VALUE;
                    cz8 cz8Var2 = cz8Var;
                    Object obj2 = cz8Var2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cz8Var2.label;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        cz8Var2.L$0 = this;
                        str2 = str;
                        cz8Var2.L$1 = str2;
                        list2 = list;
                        cz8Var2.L$2 = list2;
                        wi50 wi50Var2 = this.m;
                        cz8Var2.L$3 = wi50Var2;
                        z2 = z;
                        cz8Var2.Z$0 = z2;
                        cz8Var2.label = 1;
                        if (wi50Var2.b(cz8Var2) != coroutineSingletons) {
                            bz8Var = this;
                            wi50Var = wi50Var2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ui50Var = (ui50) cz8Var2.L$0;
                            try {
                                kotlin.a.a(obj2);
                                s3q0 s3q0Var = s3q0.a;
                                ui50Var.c(null);
                                return s3q0.a;
                            } catch (Throwable th) {
                                th = th;
                                ui50Var.c(null);
                                throw th;
                            }
                        }
                        set = (Set) cz8Var2.L$1;
                        ?? r3 = (ui50) cz8Var2.L$0;
                        try {
                            kotlin.a.a(obj2);
                            wi50Var = r3;
                            set.clear();
                            ui50Var = wi50Var;
                            s3q0 s3q0Var2 = s3q0.a;
                            ui50Var.c(null);
                            return s3q0.a;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var = r3;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    boolean z3 = cz8Var2.Z$0;
                    ?? r5 = (ui50) cz8Var2.L$3;
                    List list3 = (List) cz8Var2.L$2;
                    String str3 = (String) cz8Var2.L$1;
                    bz8 bz8Var2 = (bz8) cz8Var2.L$0;
                    kotlin.a.a(obj2);
                    wi50Var = r5;
                    bz8Var = bz8Var2;
                    str2 = str3;
                    z2 = z3;
                    list2 = list3;
                    List list4 = list2;
                    ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Long(((eje0) it.next()).a));
                    }
                    Logger logger = bz8Var.n;
                    Logger.DefaultImpls.info$default(logger, "Processing syn list: " + arrayList + ", is order guaranteed: " + z2, null, 2, null);
                    long longValue = ((Number) j5g.l0(arrayList)).longValue();
                    LinkedHashMap linkedHashMap = bz8Var.o;
                    obj = linkedHashMap.get(str2);
                    if (obj == null) {
                        obj = new TreeSet();
                        linkedHashMap.put(str2, obj);
                    }
                    Set set2 = (Set) obj;
                    if (z2) {
                        String str4 = str2;
                        Logger.DefaultImpls.debug$default(logger, "Start safe update of last saved syn", null, 2, null);
                        set2.addAll(arrayList);
                        cz8Var2.L$0 = wi50Var;
                        cz8Var2.L$1 = null;
                        cz8Var2.L$2 = null;
                        cz8Var2.L$3 = null;
                        cz8Var2.label = 3;
                    } else {
                        Logger.DefaultImpls.debug$default(logger, "Start update of last saved syn", null, 2, null);
                        cz8Var2.L$0 = wi50Var;
                        cz8Var2.L$1 = set2;
                        cz8Var2.L$2 = null;
                        cz8Var2.L$3 = null;
                        cz8Var2.label = 2;
                        if (bz8Var.p(str2, longValue, set2, arrayList, cz8Var2) != coroutineSingletons) {
                            set = set2;
                            set.clear();
                            ui50Var = wi50Var;
                            s3q0 s3q0Var22 = s3q0.a;
                            ui50Var.c(null);
                            return s3q0.a;
                        }
                    }
                    return coroutineSingletons;
                }
            }
            List list42 = list2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list42, 10));
            it = list42.iterator();
            while (it.hasNext()) {
            }
            Logger logger2 = bz8Var.n;
            Logger.DefaultImpls.info$default(logger2, "Processing syn list: " + arrayList2 + ", is order guaranteed: " + z2, null, 2, null);
            long longValue2 = ((Number) j5g.l0(arrayList2)).longValue();
            LinkedHashMap linkedHashMap2 = bz8Var.o;
            obj = linkedHashMap2.get(str2);
            if (obj == null) {
            }
            Set set22 = (Set) obj;
            if (z2) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            ui50Var = wi50Var;
            ui50Var.c(null);
            throw th;
        }
        cz8Var = new cz8(this, continuationImpl);
        cz8 cz8Var22 = cz8Var;
        Object obj22 = cz8Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cz8Var22.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, long j, Collection collection, ArrayList arrayList, ContinuationImpl continuationImpl) {
        dz8 dz8Var;
        int i;
        bz8 bz8Var;
        if (continuationImpl instanceof dz8) {
            dz8Var = (dz8) continuationImpl;
            int i2 = dz8Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dz8Var.label = i2 - Integer.MIN_VALUE;
                Object obj = dz8Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dz8Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!collection.isEmpty()) {
                        ArrayList u0 = j5g.u0(arrayList, collection);
                        TreeSet treeSet = new TreeSet();
                        j5g.K0(u0, treeSet);
                        if (!l(treeSet)) {
                            myc0.h(this.l, null, null, new ez8(this, str, null), 3);
                        }
                    }
                    dz8Var.L$0 = this;
                    dz8Var.J$0 = j;
                    dz8Var.label = 1;
                    if (this.d.b(str, j, dz8Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bz8Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = dz8Var.J$0;
                    bz8Var = (bz8) dz8Var.L$0;
                    kotlin.a.a(obj);
                }
                Logger.DefaultImpls.debug$default(bz8Var.n, defpackage.k0.a(j, "Finished updating last syn: "), null, 2, null);
                return s3q0.a;
            }
        }
        dz8Var = new dz8(this, continuationImpl);
        Object obj2 = dz8Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dz8Var.label;
        if (i != 0) {
        }
        Logger.DefaultImpls.debug$default(bz8Var.n, defpackage.k0.a(j, "Finished updating last syn: "), null, 2, null);
        return s3q0.a;
    }
}
