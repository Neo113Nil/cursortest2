package xsna;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ReportContent.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportContentKt$ReportContent$1$1", f = "ReportContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class h5g0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ kg50 $imeHeight;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5g0(View view, kg50 kg50Var, spj<? super h5g0> spjVar) {
        super(2, spjVar);
        this.$rootView = view;
        this.$imeHeight = kg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new h5g0(this.$rootView, this.$imeHeight, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h5g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (Build.VERSION.SDK_INT >= 30) {
            View view = this.$rootView;
            final kg50 kg50Var = this.$imeHeight;
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xsna.g5g0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    int ime;
                    Insets insets;
                    int i;
                    ime = WindowInsets.Type.ime();
                    insets = windowInsets.getInsets(ime);
                    i = insets.bottom;
                    kg50.this.g(i);
                    return windowInsets;
                }
            });
        }
        return s3q0.a;
    }
}
