package xsna;

import android.webkit.JavascriptInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonAlreadyInProgress;
import com.vk.superapp.base.js.bridge.Responses$ReasonConnectionLost;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonMissingParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonNeedUserPermission;
import com.vk.superapp.base.js.bridge.Responses$ReasonNoAds;
import com.vk.superapp.base.js.bridge.Responses$ReasonNoDevicePermission;
import com.vk.superapp.base.js.bridge.Responses$ReasonRequestsLimitReached;
import com.vk.superapp.base.js.bridge.Responses$ReasonUninitializedApp;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.local.storage.js.bridge.impl.AllowedMiniAppIds;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageDelete$Error;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageDelete$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetMeta$Error;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetMeta$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetState$Error;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetState$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageRead$Error;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageRead$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageWrite$Error;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageWrite$Parameters;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.chromium.base.version_info.VersionConstants;
import xsna.ox8;
import xsna.x4y;

/* compiled from: JsLocalStorageDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class z4y implements x4y {
    public static final Set<Long> h = rl3.y0(new Long[]{Long.valueOf(AllowedMiniAppIds.APP_ID_STEPS.h()), Long.valueOf(AllowedMiniAppIds.APP_ID_WORKOUT.h()), Long.valueOf(AllowedMiniAppIds.APP_ID_ACTIVITY_BANK.h()), Long.valueOf(AllowedMiniAppIds.APP_ID_SANDBOX.h()), Long.valueOf(AllowedMiniAppIds.APP_ID_INTERNAL_SANDBOX.h()), Long.valueOf(AllowedMiniAppIds.APP_ID_PETS.h())});
    public final com.vk.superapp.base.js.bridge.b b;
    public final pp20 c;
    public xwv0 d;
    public final maj e;
    public final bpn0 f = new bpn0(new btm(this, 17));
    public final bpn0 g = new bpn0(new tbh(this, 26));

    /* compiled from: JsLocalStorageDelegateImpl.kt */
    @b6l(c = "com.vk.superapp.local.storage.js.bridge.impl.JsLocalStorageDelegateImpl$VKWebAppLocalStorageDeleteInternal$1", f = "JsLocalStorageDelegateImpl.kt", l = {VersionConstants.PRODUCT_MAJOR_VERSION}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ p2y<LocalStorageDelete$Parameters> $parametersResult;
        Object L$0;
        int label;
        final /* synthetic */ z4y this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(spj spjVar, p2y p2yVar, z4y z4yVar) {
            super(1, spjVar);
            this.$parametersResult = p2yVar;
            this.this$0 = z4yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new a(spjVar, this.$parametersResult, this.this$0);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LocalStorageDelete$Parameters localStorageDelete$Parameters;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    LocalStorageDelete$Parameters a = this.$parametersResult.a();
                    z4y z4yVar = this.this$0;
                    pp20 pp20Var = z4yVar.c;
                    long h = z4yVar.h();
                    List<String> c = a.c();
                    this.L$0 = a;
                    this.label = 1;
                    Object c2 = pp20Var.c(h, c, this);
                    if (c2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    localStorageDelete$Parameters = a;
                    obj = c2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    localStorageDelete$Parameters = (LocalStorageDelete$Parameters) this.L$0;
                    kotlin.a.a(obj);
                }
                ox8 ox8Var = (ox8) obj;
                if (ox8Var instanceof ox8.b) {
                    z4y.c(this.this$0).a(((evl) ((ox8.b) ox8Var).a).a, ((evl) ((ox8.b) ox8Var).a).b, localStorageDelete$Parameters.d());
                } else if (ox8Var instanceof ox8.a) {
                    z4y z4yVar2 = this.this$0;
                    Set<Long> set = z4y.h;
                    z4yVar2.j().b(localStorageDelete$Parameters.d(), new JsMethod("VKWebAppLocalStorageDelete"), ((ox8.a) ox8Var).b, ((ox8.a) ox8Var).a);
                } else {
                    if (!(ox8Var instanceof ox8.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z4y z4yVar3 = this.this$0;
                    Set<Long> set2 = z4y.h;
                    z4yVar3.j().c(localStorageDelete$Parameters.d());
                }
            } catch (CancellationException unused) {
            } catch (Exception e) {
                z4y z4yVar4 = this.this$0;
                Set<Long> set3 = z4y.h;
                z4yVar4.j().b(this.$parametersResult.b(), new JsMethod("VKWebAppLocalStorageDelete"), e, null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: JsLocalStorageDelegateImpl.kt */
    @b6l(c = "com.vk.superapp.local.storage.js.bridge.impl.JsLocalStorageDelegateImpl$VKWebAppLocalStorageGetMetaInternal$1", f = "JsLocalStorageDelegateImpl.kt", l = {194}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ p2y<LocalStorageGetMeta$Parameters> $parametersResult;
        Object L$0;
        int label;
        final /* synthetic */ z4y this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(spj spjVar, p2y p2yVar, z4y z4yVar) {
            super(1, spjVar);
            this.$parametersResult = p2yVar;
            this.this$0 = z4yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new b(spjVar, this.$parametersResult, this.this$0);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((b) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LocalStorageGetMeta$Parameters localStorageGetMeta$Parameters;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    LocalStorageGetMeta$Parameters a = this.$parametersResult.a();
                    z4y z4yVar = this.this$0;
                    pp20 pp20Var = z4yVar.c;
                    long h = z4yVar.h();
                    List<String> c = a.c();
                    this.L$0 = a;
                    this.label = 1;
                    Object b = pp20Var.b(h, c, this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    localStorageGetMeta$Parameters = a;
                    obj = b;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    localStorageGetMeta$Parameters = (LocalStorageGetMeta$Parameters) this.L$0;
                    kotlin.a.a(obj);
                }
                ox8 ox8Var = (ox8) obj;
                if (ox8Var instanceof ox8.b) {
                    z4y.c(this.this$0).b(localStorageGetMeta$Parameters.d(), (List) ((ox8.b) ox8Var).a);
                } else if (ox8Var instanceof ox8.a) {
                    z4y z4yVar2 = this.this$0;
                    Set<Long> set = z4y.h;
                    z4yVar2.j().b(localStorageGetMeta$Parameters.d(), new JsMethod("VKWebAppLocalStorageGetMeta"), ((ox8.a) ox8Var).b, ((ox8.a) ox8Var).a);
                } else {
                    if (!(ox8Var instanceof ox8.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z4y z4yVar3 = this.this$0;
                    Set<Long> set2 = z4y.h;
                    z4yVar3.j().d(localStorageGetMeta$Parameters.d());
                }
            } catch (CancellationException unused) {
            } catch (Exception e) {
                z4y z4yVar4 = this.this$0;
                Set<Long> set3 = z4y.h;
                z4yVar4.j().b(this.$parametersResult.b(), new JsMethod("VKWebAppLocalStorageGetMeta"), e, null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: JsLocalStorageDelegateImpl.kt */
    @b6l(c = "com.vk.superapp.local.storage.js.bridge.impl.JsLocalStorageDelegateImpl$VKWebAppLocalStorageGetStateInternal$1", f = "JsLocalStorageDelegateImpl.kt", l = {87}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ p2y<LocalStorageGetState$Parameters> $parametersResult;
        int label;
        final /* synthetic */ z4y this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(spj spjVar, p2y p2yVar, z4y z4yVar) {
            super(1, spjVar);
            this.this$0 = z4yVar;
            this.$parametersResult = p2yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new c(spjVar, this.$parametersResult, this.this$0);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((c) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    z4y z4yVar = this.this$0;
                    pp20 pp20Var = z4yVar.c;
                    long h = z4yVar.h();
                    this.label = 1;
                    obj = pp20Var.e(h, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ox8 ox8Var = (ox8) obj;
                if (ox8Var instanceof ox8.b) {
                    z4y.c(this.this$0).c((v13) ((ox8.b) ox8Var).a, this.$parametersResult.b());
                } else if (ox8Var instanceof ox8.a) {
                    z4y z4yVar2 = this.this$0;
                    Set<Long> set = z4y.h;
                    z4yVar2.j().b(this.$parametersResult.b(), new JsMethod("VKWebAppLocalStorageGetState"), ((ox8.a) ox8Var).b, ((ox8.a) ox8Var).a);
                } else {
                    if (!(ox8Var instanceof ox8.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z4y z4yVar3 = this.this$0;
                    Set<Long> set2 = z4y.h;
                    z4yVar3.j().e(this.$parametersResult.b());
                }
            } catch (CancellationException unused) {
            } catch (Exception e) {
                z4y z4yVar4 = this.this$0;
                Set<Long> set3 = z4y.h;
                z4yVar4.j().b(this.$parametersResult.b(), new JsMethod("VKWebAppLocalStorageGetState"), e, null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: JsLocalStorageDelegateImpl.kt */
    @b6l(c = "com.vk.superapp.local.storage.js.bridge.impl.JsLocalStorageDelegateImpl$VKWebAppLocalStorageReadInternal$1", f = "JsLocalStorageDelegateImpl.kt", l = {301}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ p2y<LocalStorageRead$Parameters> $parametersResult;
        Object L$0;
        int label;
        final /* synthetic */ z4y this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(spj spjVar, p2y p2yVar, z4y z4yVar) {
            super(1, spjVar);
            this.$parametersResult = p2yVar;
            this.this$0 = z4yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new d(spjVar, this.$parametersResult, this.this$0);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((d) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LocalStorageRead$Parameters localStorageRead$Parameters;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    LocalStorageRead$Parameters a = this.$parametersResult.a();
                    z4y z4yVar = this.this$0;
                    pp20 pp20Var = z4yVar.c;
                    long h = z4yVar.h();
                    String c = a.c();
                    this.L$0 = a;
                    this.label = 1;
                    Object f = pp20Var.f(h, c, this);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    localStorageRead$Parameters = a;
                    obj = f;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    localStorageRead$Parameters = (LocalStorageRead$Parameters) this.L$0;
                    kotlin.a.a(obj);
                }
                ox8 ox8Var = (ox8) obj;
                if (ox8Var instanceof ox8.b) {
                    z4y.c(this.this$0).d((String) ((ox8.b) ox8Var).a, localStorageRead$Parameters.d());
                } else if (ox8Var instanceof ox8.a) {
                    z4y z4yVar2 = this.this$0;
                    Set<Long> set = z4y.h;
                    z4yVar2.j().b(localStorageRead$Parameters.d(), new JsMethod("VKWebAppLocalStorageRead"), ((ox8.a) ox8Var).b, ((ox8.a) ox8Var).a);
                } else {
                    if (!epx.f(ox8Var, ox8.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z4y.c(this.this$0).d(null, localStorageRead$Parameters.d());
                }
            } catch (CancellationException unused) {
            } catch (Exception e) {
                z4y z4yVar3 = this.this$0;
                Set<Long> set2 = z4y.h;
                z4yVar3.j().b(this.$parametersResult.b(), new JsMethod("VKWebAppLocalStorageRead"), e, null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: JsLocalStorageDelegateImpl.kt */
    @b6l(c = "com.vk.superapp.local.storage.js.bridge.impl.JsLocalStorageDelegateImpl$VKWebAppLocalStorageWriteInternal$1", f = "JsLocalStorageDelegateImpl.kt", l = {247}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ p2y<LocalStorageWrite$Parameters> $parametersResult;
        Object L$0;
        int label;
        final /* synthetic */ z4y this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(spj spjVar, p2y p2yVar, z4y z4yVar) {
            super(1, spjVar);
            this.$parametersResult = p2yVar;
            this.this$0 = z4yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new e(spjVar, this.$parametersResult, this.this$0);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((e) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Exception exc;
            LocalStorageWrite$Parameters localStorageWrite$Parameters;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                try {
                    LocalStorageWrite$Parameters a = this.$parametersResult.a();
                    z4y z4yVar = this.this$0;
                    pp20 pp20Var = z4yVar.c;
                    long h = z4yVar.h();
                    String d = a.d();
                    String c = a.c();
                    this.L$0 = a;
                    this.label = 1;
                    eVar = this;
                    try {
                        Object d2 = pp20Var.d(h, d, c, eVar);
                        if (d2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        localStorageWrite$Parameters = a;
                        obj = d2;
                    } catch (CancellationException e) {
                        e = e;
                        throw e;
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        z4y z4yVar2 = eVar.this$0;
                        Set<Long> set = z4y.h;
                        z4yVar2.j().b(eVar.$parametersResult.b(), new JsMethod("VKWebAppLocalStorageWrite"), exc, null);
                        return s3q0.a;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                    eVar = this;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                localStorageWrite$Parameters = (LocalStorageWrite$Parameters) this.L$0;
                try {
                    kotlin.a.a(obj);
                    eVar = this;
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Exception e6) {
                    exc = e6;
                    eVar = this;
                    z4y z4yVar22 = eVar.this$0;
                    Set<Long> set2 = z4y.h;
                    z4yVar22.j().b(eVar.$parametersResult.b(), new JsMethod("VKWebAppLocalStorageWrite"), exc, null);
                    return s3q0.a;
                }
            }
            ox8 ox8Var = (ox8) obj;
            if (ox8Var instanceof ox8.b) {
                z4y.c(eVar.this$0).e(localStorageWrite$Parameters.e(), ((Boolean) ((ox8.b) ox8Var).a).booleanValue());
            } else if (ox8Var instanceof ox8.a) {
                z4y z4yVar3 = eVar.this$0;
                Set<Long> set3 = z4y.h;
                z4yVar3.j().b(localStorageWrite$Parameters.e(), new JsMethod("VKWebAppLocalStorageWrite"), ((ox8.a) ox8Var).b, ((ox8.a) ox8Var).a);
            } else {
                if (!epx.f(ox8Var, ox8.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z4y z4yVar4 = eVar.this$0;
                Set<Long> set4 = z4y.h;
                z4yVar4.j().f(localStorageWrite$Parameters.e());
            }
            return s3q0.a;
        }
    }

    /* compiled from: JsLocalStorageDelegateImpl.kt */
    @b6l(c = "com.vk.superapp.local.storage.js.bridge.impl.JsLocalStorageDelegateImpl$launchInScope$1", f = "JsLocalStorageDelegateImpl.kt", l = {338}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<spj<? super s3q0>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super f> spjVar) {
            super(2, spjVar);
            this.$block = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new f(this.$block, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izs<spj<? super s3q0>, Object> izsVar = this.$block;
                this.label = 1;
                if (izsVar.invoke(this) == coroutineSingletons) {
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

    public z4y(com.vk.superapp.base.js.bridge.b bVar, pp20 pp20Var, xwv0 xwv0Var, maj majVar) {
        this.b = bVar;
        this.c = pp20Var;
        this.d = xwv0Var;
        this.e = majVar;
    }

    public static final c2n0 c(z4y z4yVar) {
        return (c2n0) z4yVar.f.getValue();
    }

    public static boolean l(FragmentActivity fragmentActivity) {
        return (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) ? false : true;
    }

    public static void n(FragmentActivity fragmentActivity, izs izsVar) {
        myc0.h(g5z.a(fragmentActivity), null, null, new f(izsVar, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.w4y
    public final void B(p2y<LocalStorageGetMeta$Parameters> p2yVar) {
        this.b.k(new JsMethod("VKWebAppLocalStorageGetMeta"), p2yVar.b());
        if (!k()) {
            j().d(p2yVar.b());
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) this.e.invoke();
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (l(fragmentActivity)) {
            if (fragmentActivity != null) {
                n(fragmentActivity, new b(null, p2yVar, this));
                return;
            }
            return;
        }
        yvp j = j();
        String b2 = p2yVar.b();
        String str2 = null;
        Object[] objArr4 = objArr2 == true ? 1 : 0;
        com.vk.superapp.base.js.bridge.b.o(j.a, new JsMethod("VKWebAppLocalStorageGetMeta"), new LocalStorageGetMeta$Error(objArr4, new LocalStorageGetMeta$Error.Data(LocalStorageGetMeta$Error.Data.Type.CLIENT_ERROR, b2, new Responses$ClientError(str2, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, str, 3, objArr3 == true ? 1 : 0), null, null, null, null, null, null, 130046, null), b2, 1, null)), 1, objArr == true ? 1 : 0), null, null, 12);
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageDelete(String str) {
        x4y.a.VKWebAppLocalStorageDelete(this, str);
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageGetMeta(String str) {
        x4y.a.VKWebAppLocalStorageGetMeta(this, str);
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageGetState(String str) {
        x4y.a.VKWebAppLocalStorageGetState(this, str);
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageRead(String str) {
        x4y.a.VKWebAppLocalStorageRead(this, str);
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageWrite(String str) {
        x4y.a.VKWebAppLocalStorageWrite(this, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.w4y
    public final void d(p2y<LocalStorageRead$Parameters> p2yVar) {
        this.b.k(new JsMethod("VKWebAppLocalStorageRead"), p2yVar.b());
        int i = 1;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (!k()) {
            yvp j = j();
            String b2 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.o(j.a, new JsMethod("VKWebAppLocalStorageRead"), new LocalStorageRead$Error(str, new LocalStorageRead$Error.Data(LocalStorageRead$Error.Data.Type.CLIENT_ERROR, b2, yvp.a(b2)), i, objArr5 == true ? 1 : 0), null, null, 12);
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) this.e.invoke();
        if (l(fragmentActivity)) {
            if (fragmentActivity != null) {
                n(fragmentActivity, new d(null, p2yVar, this));
                return;
            }
            return;
        }
        yvp j2 = j();
        String b3 = p2yVar.b();
        String str2 = null;
        Responses$ReasonUnknownError responses$ReasonUnknownError = null;
        Responses$ReasonMissingParams responses$ReasonMissingParams = null;
        Responses$ReasonConnectionLost responses$ReasonConnectionLost = null;
        Responses$ReasonUserDenied responses$ReasonUserDenied = null;
        Responses$ReasonInvalidParams responses$ReasonInvalidParams = null;
        Responses$ReasonUnsupportedPlatform responses$ReasonUnsupportedPlatform = null;
        Responses$ReasonNoDevicePermission responses$ReasonNoDevicePermission = null;
        Responses$ReasonNeedUserPermission responses$ReasonNeedUserPermission = null;
        Responses$ReasonRequestsLimitReached responses$ReasonRequestsLimitReached = null;
        Responses$ReasonAccessDenied responses$ReasonAccessDenied = null;
        Responses$ReasonUninitializedApp responses$ReasonUninitializedApp = null;
        Responses$ReasonCustom responses$ReasonCustom = null;
        Responses$ReasonNoAds responses$ReasonNoAds = null;
        Responses$ReasonAlreadyInProgress responses$ReasonAlreadyInProgress = null;
        String str3 = null;
        com.vk.superapp.base.js.bridge.b.o(j2.a, new JsMethod("VKWebAppLocalStorageRead"), new LocalStorageRead$Error(objArr2 == true ? 1 : 0, new LocalStorageRead$Error.Data(LocalStorageRead$Error.Data.Type.CLIENT_ERROR, b3, new Responses$ClientError(str3, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, str2, responses$ReasonUnknownError, responses$ReasonMissingParams, responses$ReasonConnectionLost, responses$ReasonUserDenied, responses$ReasonInvalidParams, responses$ReasonUnsupportedPlatform, responses$ReasonNoDevicePermission, responses$ReasonNeedUserPermission, new Responses$ReasonActionCantUseInBackground(0, objArr4 == true ? 1 : 0, 3, objArr3 == true ? 1 : 0), responses$ReasonRequestsLimitReached, responses$ReasonAccessDenied, responses$ReasonUninitializedApp, responses$ReasonCustom, responses$ReasonNoAds, responses$ReasonAlreadyInProgress, 130046, null), b3, 1, null)), i, objArr == true ? 1 : 0), null, null, 12);
    }

    public final long h() {
        xwv0 xwv0Var = this.d;
        Long valueOf = xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null;
        if (valueOf != null) {
            return valueOf.longValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.w4y
    public final void h0(p2y<LocalStorageGetState$Parameters> p2yVar) {
        this.b.k(new JsMethod("VKWebAppLocalStorageGetState"), p2yVar.b());
        if (!k()) {
            j().e(p2yVar.b());
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) this.e.invoke();
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (l(fragmentActivity)) {
            if (fragmentActivity != null) {
                n(fragmentActivity, new c(null, p2yVar, this));
                return;
            }
            return;
        }
        yvp j = j();
        String b2 = p2yVar.b();
        String str2 = null;
        Object[] objArr4 = objArr2 == true ? 1 : 0;
        com.vk.superapp.base.js.bridge.b.o(j.a, new JsMethod("VKWebAppLocalStorageGetState"), new LocalStorageGetState$Error(objArr4, new LocalStorageGetState$Error.Data(LocalStorageGetState$Error.Data.Type.CLIENT_ERROR, b2, new Responses$ClientError(str2, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, str, 3, objArr3 == true ? 1 : 0), null, null, null, null, null, null, 130046, null), b2, 1, null)), 1, objArr == true ? 1 : 0), null, null, 12);
    }

    public final yvp j() {
        return (yvp) this.g.getValue();
    }

    public final boolean k() {
        if (BuildInfo.h()) {
            return true;
        }
        return h.contains(Long.valueOf(h()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.w4y
    public final void m(p2y<LocalStorageWrite$Parameters> p2yVar) {
        this.b.k(new JsMethod("VKWebAppLocalStorageWrite"), p2yVar.b());
        if (!k()) {
            j().f(p2yVar.b());
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) this.e.invoke();
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (l(fragmentActivity)) {
            if (fragmentActivity != null) {
                n(fragmentActivity, new e(null, p2yVar, this));
                return;
            }
            return;
        }
        yvp j = j();
        String b2 = p2yVar.b();
        String str2 = null;
        Object[] objArr4 = objArr2 == true ? 1 : 0;
        com.vk.superapp.base.js.bridge.b.o(j.a, new JsMethod("VKWebAppLocalStorageWrite"), new LocalStorageWrite$Error(objArr4, new LocalStorageWrite$Error.Data(LocalStorageWrite$Error.Data.Type.CLIENT_ERROR, b2, new Responses$ClientError(str2, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, str, 3, objArr3 == true ? 1 : 0), null, null, null, null, null, null, 130046, null), b2, 1, null)), 1, objArr == true ? 1 : 0), null, null, 12);
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.d = xwv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.w4y
    public final void r1(p2y<LocalStorageDelete$Parameters> p2yVar) {
        this.b.k(new JsMethod("VKWebAppLocalStorageDelete"), p2yVar.b());
        if (!k()) {
            j().c(p2yVar.b());
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) this.e.invoke();
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (l(fragmentActivity)) {
            if (fragmentActivity != null) {
                n(fragmentActivity, new a(null, p2yVar, this));
                return;
            }
            return;
        }
        yvp j = j();
        String b2 = p2yVar.b();
        String str2 = null;
        Object[] objArr4 = objArr2 == true ? 1 : 0;
        com.vk.superapp.base.js.bridge.b.o(j.a, new JsMethod("VKWebAppLocalStorageDelete"), new LocalStorageDelete$Error(objArr4, new LocalStorageDelete$Error.Data(LocalStorageDelete$Error.Data.Type.CLIENT_ERROR, b2, new Responses$ClientError(str2, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, str, 3, objArr3 == true ? 1 : 0), null, null, null, null, null, null, 130046, null), b2, 1, null)), 1, objArr == true ? 1 : 0), null, null, 12);
    }

    @Override // xsna.npf0
    public final void release() {
        this.d = null;
    }
}
