package xsna;

import android.widget.TextView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MessageViewsActionController.kt */
@b6l(c = "com.vk.im.messageviews.impl.ui.action.MessageViewsActionController$loadMessageTotalViews$1", f = "MessageViewsActionController.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class fc20 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ gc20 this$0;

    /* compiled from: MessageViewsActionController.kt */
    @b6l(c = "com.vk.im.messageviews.impl.ui.action.MessageViewsActionController$loadMessageTotalViews$1$count$1", f = "MessageViewsActionController.kt", l = {38}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Integer>, Object> {
        int label;
        final /* synthetic */ gc20 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gc20 gc20Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = gc20Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Integer> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            gc20 gc20Var = this.this$0;
            xc20 xc20Var = gc20Var.d;
            int i2 = gc20Var.a;
            long j = gc20Var.b;
            this.label = 1;
            Object a = xc20Var.a(i2, j, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc20(gc20 gc20Var, spj<? super fc20> spjVar) {
        super(2, spjVar);
        this.this$0 = gc20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fc20(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fc20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.a.a(obj);
                ((ShimmerFrameLayout) this.this$0.c.b).d();
                ovj b = hqu0.b();
                a aVar = new a(this.this$0, null);
                this.label = 1;
                obj = myc0.k(b, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            i = ((Number) obj).intValue();
        } catch (Exception unused) {
            i = 0;
        }
        sxi sxiVar = this.this$0.c;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) sxiVar.b;
        shimmerFrameLayout.e();
        shimmerFrameLayout.setVisibility(8);
        TextView textView = (TextView) sxiVar.c;
        textView.setText(i == 0 ? textView.getResources().getString(R.string.im_message_views_no_views) : textView.getResources().getQuantityString(R.plurals.im_message_views_count, i, Integer.valueOf(i)));
        return s3q0.a;
    }
}
