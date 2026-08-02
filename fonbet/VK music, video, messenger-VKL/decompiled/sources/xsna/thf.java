package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ikv0;
import xsna.ked;

/* compiled from: ClipsUploadScreen.kt */
@b6l(c = "com.vk.clips.upload.ui.impl.compose.views.ClipsUploadScreenKt$ClipsUploadScreen$2$1", f = "ClipsUploadScreen.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class thf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rh00<Intent, ActivityResult> $activityResultLauncher;
    final /* synthetic */ ylu0 $colors;
    final /* synthetic */ Object $componentConsumer;
    final /* synthetic */ Context $context;
    final /* synthetic */ jqd $descriptionEditProvider;
    final /* synthetic */ boolean $isLightColors;
    final /* synthetic */ f5z $lifecycleOwner;
    final /* synthetic */ tw50 $navigationCallbackHolder;
    final /* synthetic */ izs<mbf, s3q0> $onAction;
    final /* synthetic */ nld $previewResultLauncher;
    final /* synthetic */ Object $sideEffects;
    final /* synthetic */ zih0 $suggestsAnalyticsDelegate;
    int label;

    /* compiled from: ClipsUploadScreen.kt */
    @b6l(c = "com.vk.clips.upload.ui.impl.compose.views.ClipsUploadScreenKt$ClipsUploadScreen$2$1$1", f = "ClipsUploadScreen.kt", l = {166}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ rh00<Intent, ActivityResult> $activityResultLauncher;
        final /* synthetic */ ylu0 $colors;
        final /* synthetic */ Object $componentConsumer;
        final /* synthetic */ Context $context;
        final /* synthetic */ jqd $descriptionEditProvider;
        final /* synthetic */ boolean $isLightColors;
        final /* synthetic */ tw50 $navigationCallbackHolder;
        final /* synthetic */ izs<mbf, s3q0> $onAction;
        final /* synthetic */ nld $previewResultLauncher;
        final /* synthetic */ Object $sideEffects;
        final /* synthetic */ zih0 $suggestsAnalyticsDelegate;
        int label;

        /* compiled from: ClipsUploadScreen.kt */
        @b6l(c = "com.vk.clips.upload.ui.impl.compose.views.ClipsUploadScreenKt$ClipsUploadScreen$2$1$1$1", f = "ClipsUploadScreen.kt", l = {167}, m = "invokeSuspend")
        /* renamed from: xsna.thf$a$a, reason: collision with other inner class name */
        public static final class C3746a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ rh00<Intent, ActivityResult> $activityResultLauncher;
            final /* synthetic */ ylu0 $colors;
            final /* synthetic */ Object $componentConsumer;
            final /* synthetic */ Context $context;
            final /* synthetic */ jqd $descriptionEditProvider;
            final /* synthetic */ boolean $isLightColors;
            final /* synthetic */ tw50 $navigationCallbackHolder;
            final /* synthetic */ izs<mbf, s3q0> $onAction;
            final /* synthetic */ nld $previewResultLauncher;
            final /* synthetic */ Object $sideEffects;
            final /* synthetic */ zih0 $suggestsAnalyticsDelegate;
            int label;

            /* compiled from: ClipsUploadScreen.kt */
            /* renamed from: xsna.thf$a$a$a, reason: collision with other inner class name */
            public static final class C3747a<T> implements lsr {
                public final /* synthetic */ nld b;
                public final /* synthetic */ rh00<Intent, ActivityResult> c;
                public final /* synthetic */ Context d;
                public final /* synthetic */ jqd e;
                public final /* synthetic */ tw50 f;
                public final /* synthetic */ zih0 g;
                public final /* synthetic */ Object h;
                public final /* synthetic */ izs<mbf, s3q0> i;
                public final /* synthetic */ ylu0 j;

                /* JADX WARN: Multi-variable type inference failed */
                public C3747a(nld nldVar, rh00<Intent, ActivityResult> rh00Var, Context context, boolean z, jqd jqdVar, tw50 tw50Var, zih0 zih0Var, Object obj, izs<? super mbf, s3q0> izsVar, ylu0 ylu0Var) {
                    this.b = nldVar;
                    this.c = rh00Var;
                    this.d = context;
                    this.e = jqdVar;
                    this.f = tw50Var;
                    this.g = zih0Var;
                    this.h = obj;
                    this.i = izsVar;
                    this.j = ylu0Var;
                }

                @Override // xsna.lsr
                public final Object emit(Object obj, spj spjVar) {
                    Window window;
                    ked kedVar = (ked) obj;
                    if (kedVar instanceof ked.c) {
                        nld nldVar = this.b;
                        if (nldVar != null) {
                            ClipsChoosePreviewParams clipsChoosePreviewParams = ((ked.c) kedVar).a;
                            this.c.a(nldVar.getIntent());
                        }
                    } else {
                        boolean z = kedVar instanceof ked.b;
                        final izs<mbf, s3q0> izsVar = this.i;
                        if (z) {
                            this.e.a(this.d, ((ked.b) kedVar).a, new qhf(izsVar, 0), this.f, this.g);
                        } else {
                            boolean z2 = kedVar instanceof ked.a;
                            Context context = this.d;
                            if (z2) {
                                final fpa fpaVar = ((ked.a) kedVar).a;
                                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                ComposeView composeView = new ComposeView(context, null, 6);
                                composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                final ylu0 ylu0Var = this.j;
                                composeView.setContent(new jai(1301040225, new wzs() { // from class: xsna.ysl
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj2, Object obj3) {
                                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1301040225, intValue, -1, "com.vk.clips.upload.ui.impl.compose.features.delayed_publish.DelayedPublishDialogsHelper.openDateChangeModal.<anonymous>.<anonymous> (DelayedPublishDialogsHelper.kt:38)");
                                            }
                                            rrv0.d(ylu0.this, null, null, null, kai.c(-1009403172, new bqg(izsVar, fpaVar, ref$ObjectRef), aVar), aVar, 24576, 14);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar.h();
                                        }
                                        return s3q0.a;
                                    }
                                }, true));
                                ref$ObjectRef.element = (T) new VkModal(VkModal.Mode.Card, new b.a.C0789a(composeView, false), null, false, 24).b(context, null);
                            } else if (kedVar instanceof ked.d) {
                                Activity h = e3m.h(context);
                                if (h != null && (window = h.getWindow()) != null) {
                                    ikv0.a aVar = new ikv0.a(context);
                                    aVar.u = new ikv0.d(context.getString(R.string.clips_edit_description_limit_alert_text), (String) null, (ikv0.d.a) null, 6);
                                    aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.clips_edit_description_limit_alert_btn), new yy(13));
                                    aVar.o = Integer.valueOf(iah0.a(8));
                                    aVar.l = 80;
                                    aVar.d = true;
                                    aVar.p(window);
                                }
                            } else if (kedVar != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    return s3q0.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3746a(Object obj, nld nldVar, rh00<Intent, ActivityResult> rh00Var, Context context, boolean z, jqd jqdVar, tw50 tw50Var, zih0 zih0Var, Object obj2, izs<? super mbf, s3q0> izsVar, ylu0 ylu0Var, spj<? super C3746a> spjVar) {
                super(2, spjVar);
                this.$sideEffects = obj;
                this.$previewResultLauncher = nldVar;
                this.$activityResultLauncher = rh00Var;
                this.$context = context;
                this.$isLightColors = z;
                this.$descriptionEditProvider = jqdVar;
                this.$navigationCallbackHolder = tw50Var;
                this.$suggestsAnalyticsDelegate = zih0Var;
                this.$componentConsumer = obj2;
                this.$onAction = izsVar;
                this.$colors = ylu0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3746a(this.$sideEffects, this.$previewResultLauncher, this.$activityResultLauncher, this.$context, this.$isLightColors, this.$descriptionEditProvider, this.$navigationCallbackHolder, this.$suggestsAnalyticsDelegate, this.$componentConsumer, this.$onAction, this.$colors, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3746a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    baj0 baj0Var = (baj0) this.$sideEffects;
                    C3747a c3747a = new C3747a(this.$previewResultLauncher, this.$activityResultLauncher, this.$context, this.$isLightColors, this.$descriptionEditProvider, this.$navigationCallbackHolder, this.$suggestsAnalyticsDelegate, this.$componentConsumer, this.$onAction, this.$colors);
                    this.label = 1;
                    if (baj0Var.collect(c3747a, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, nld nldVar, rh00<Intent, ActivityResult> rh00Var, Context context, boolean z, jqd jqdVar, tw50 tw50Var, zih0 zih0Var, Object obj2, izs<? super mbf, s3q0> izsVar, ylu0 ylu0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$sideEffects = obj;
            this.$previewResultLauncher = nldVar;
            this.$activityResultLauncher = rh00Var;
            this.$context = context;
            this.$isLightColors = z;
            this.$descriptionEditProvider = jqdVar;
            this.$navigationCallbackHolder = tw50Var;
            this.$suggestsAnalyticsDelegate = zih0Var;
            this.$componentConsumer = obj2;
            this.$onAction = izsVar;
            this.$colors = ylu0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$sideEffects, this.$previewResultLauncher, this.$activityResultLauncher, this.$context, this.$isLightColors, this.$descriptionEditProvider, this.$navigationCallbackHolder, this.$suggestsAnalyticsDelegate, this.$componentConsumer, this.$onAction, this.$colors, spjVar);
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
                bdn bdnVar = bdn.a;
                ge00 U = ie00.a.U();
                C3746a c3746a = new C3746a(this.$sideEffects, this.$previewResultLauncher, this.$activityResultLauncher, this.$context, this.$isLightColors, this.$descriptionEditProvider, this.$navigationCallbackHolder, this.$suggestsAnalyticsDelegate, this.$componentConsumer, this.$onAction, this.$colors, null);
                this.label = 1;
                if (myc0.k(U, c3746a, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public thf(f5z f5zVar, Object obj, nld nldVar, rh00<Intent, ActivityResult> rh00Var, Context context, boolean z, jqd jqdVar, tw50 tw50Var, zih0 zih0Var, Object obj2, izs<? super mbf, s3q0> izsVar, ylu0 ylu0Var, spj<? super thf> spjVar) {
        super(2, spjVar);
        this.$lifecycleOwner = f5zVar;
        this.$sideEffects = obj;
        this.$previewResultLauncher = nldVar;
        this.$activityResultLauncher = rh00Var;
        this.$context = context;
        this.$isLightColors = z;
        this.$descriptionEditProvider = jqdVar;
        this.$navigationCallbackHolder = tw50Var;
        this.$suggestsAnalyticsDelegate = zih0Var;
        this.$componentConsumer = obj2;
        this.$onAction = izsVar;
        this.$colors = ylu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new thf(this.$lifecycleOwner, this.$sideEffects, this.$previewResultLauncher, this.$activityResultLauncher, this.$context, this.$isLightColors, this.$descriptionEditProvider, this.$navigationCallbackHolder, this.$suggestsAnalyticsDelegate, this.$componentConsumer, this.$onAction, this.$colors, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((thf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            f5z f5zVar = this.$lifecycleOwner;
            Lifecycle.State state = Lifecycle.State.STARTED;
            a aVar = new a(this.$sideEffects, this.$previewResultLauncher, this.$activityResultLauncher, this.$context, this.$isLightColors, this.$descriptionEditProvider, this.$navigationCallbackHolder, this.$suggestsAnalyticsDelegate, this.$componentConsumer, this.$onAction, this.$colors, null);
            this.label = 1;
            if (androidx.lifecycle.u.a(f5zVar, state, aVar, this) == coroutineSingletons) {
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
