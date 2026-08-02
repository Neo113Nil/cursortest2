package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.e790;
import xsna.izg0;
import xsna.ksr;
import xsna.lsr;
import xsna.rc6;
import xsna.s3q0;
import xsna.spj;

/* compiled from: BaseDeliveryComponent.kt */
/* loaded from: classes5.dex */
public abstract class rc6 {
    public final g790 a;
    public final hpj b;
    public final Set<String> c = Collections.synchronizedSet(new LinkedHashSet());
    public final CopyOnWriteArraySet<ewl> d = new CopyOnWriteArraySet<>();
    public final bpn0 e = new bpn0(new a());

    /* compiled from: BaseDeliveryComponent.kt */
    public static final class a extends Lambda implements gzs<ksr<? extends AppInfo>> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final ksr<? extends AppInfo> invoke() {
            final ksr l = rsr.l(rc6.this.a.getAll());
            final izg0 izg0Var = new izg0(new BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1(new ksr<List<? extends e790>>() { // from class: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;

                    /* compiled from: Emitters.kt */
                    @b6l(c = "com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$filter$1$2", f = "BaseDeliveryComponent.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                    /* renamed from: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(spj spjVar) {
                            super(spjVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(lsr lsrVar) {
                        this.b = lsrVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // xsna.lsr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, spj spjVar) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (spjVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) spjVar;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    a.a(obj2);
                                    if (!((List) obj).isEmpty()) {
                                        anonymousClass1.label = 1;
                                        if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a.a(obj2);
                                }
                                return s3q0.a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(spjVar);
                        Object obj22 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return s3q0.a;
                    }
                }

                @Override // xsna.ksr
                public final Object collect(lsr<? super List<? extends e790>> lsrVar, spj spjVar) {
                    Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            }, null, rc6.this));
            final rc6 rc6Var = rc6.this;
            final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<e790>() { // from class: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$filter$2

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$filter$2$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;
                    public final /* synthetic */ rc6 c;

                    /* compiled from: Emitters.kt */
                    @b6l(c = "com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$filter$2$2", f = "BaseDeliveryComponent.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                    /* renamed from: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$filter$2$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(spj spjVar) {
                            super(spjVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(lsr lsrVar, rc6 rc6Var) {
                        this.b = lsrVar;
                        this.c = rc6Var;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // xsna.lsr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, spj spjVar) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (spjVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) spjVar;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    a.a(obj2);
                                    if (!this.c.c.contains(((e790) obj).b)) {
                                        anonymousClass1.label = 1;
                                        if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a.a(obj2);
                                }
                                return s3q0.a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(spjVar);
                        Object obj22 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return s3q0.a;
                    }
                }

                @Override // xsna.ksr
                public final Object collect(lsr<? super e790> lsrVar, spj spjVar) {
                    Object collect = izg0.this.collect(new AnonymousClass2(lsrVar, rc6Var), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            }, new qc6(rc6Var, null));
            return new ksr<AppInfo>() { // from class: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;

                    /* compiled from: Emitters.kt */
                    @b6l(c = "com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$map$1$2", f = "BaseDeliveryComponent.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                    /* renamed from: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(spj spjVar) {
                            super(spjVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(lsr lsrVar) {
                        this.b = lsrVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // xsna.lsr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, spj spjVar) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (spjVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) spjVar;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    a.a(obj2);
                                    e790 e790Var = (e790) obj;
                                    AppInfo appInfo = new AppInfo(e790Var.b, e790Var.c);
                                    anonymousClass1.label = 1;
                                    if (this.b.emit(appInfo, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a.a(obj2);
                                }
                                return s3q0.a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(spjVar);
                        Object obj22 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return s3q0.a;
                    }
                }

                @Override // xsna.ksr
                public final Object collect(lsr<? super AppInfo> lsrVar, spj spjVar) {
                    Object collect = FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            };
        }
    }

    public rc6(g790 g790Var, ovj ovjVar) {
        this.a = g790Var;
        this.b = zvj.a(ovjVar);
    }

    public abstract void a(String str);
}
