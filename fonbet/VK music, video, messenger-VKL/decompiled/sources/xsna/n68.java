package xsna;

import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BottomPanelController.kt */
@b6l(c = "com.vk.ui.photoviewer.BottomPanelController$onShow$1", f = "BottomPanelController.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class n68 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ m68 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n68(m68 m68Var, spj<? super n68> spjVar) {
        super(2, spjVar);
        this.this$0 = m68Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new n68(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((n68) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator withEndAction;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.this$0.getClass();
            this.label = 1;
            if (qsl.b(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        m68 m68Var = this.this$0;
        kfj0 kfj0Var = m68Var.J;
        boolean z = kfj0Var.d;
        if (!z && m68Var.z && !m68Var.f) {
            VkContentBadge vkContentBadge = kfj0Var.b;
            ConstraintLayout constraintLayout = kfj0Var.a;
            if (!kfj0Var.c && !z) {
                kfj0Var.c = true;
                if (vkContentBadge != null) {
                    vkContentBadge.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    vkContentBadge.setPivotY(vkContentBadge.getHeight() / 2.0f);
                }
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                bVar.i(constraintLayout);
                bVar.h(R.id.show_attached_products_button, 6);
                bVar.h(R.id.show_attached_products_button, 7);
                bVar.l(R.id.show_attached_products_button, 6, R.id.show_more_shops_button, 7, cn70.b(8));
                wra wraVar = new wra();
                wraVar.setInterpolator(new ilq());
                wraVar.setDuration(250L);
                zmp0.a(constraintLayout, wraVar);
                bVar.b(constraintLayout);
                if (vkContentBadge != null && (animate = vkContentBadge.animate()) != null && (scaleX = animate.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (alpha = scaleY.alpha(1.0f)) != null && (duration = alpha.setDuration(250L)) != null && (interpolator = duration.setInterpolator(new ilq())) != null && (withEndAction = interpolator.withEndAction(new oh(kfj0Var, 13))) != null) {
                    withEndAction.start();
                }
            }
            Pair a = m68.a(this.this$0);
            if (a != null) {
                m68 m68Var2 = this.this$0;
                long longValue = ((Number) a.d()).longValue();
                long longValue2 = ((Number) a.g()).longValue();
                zzq zzqVar = (zzq) m68Var2.I.getValue();
                int i2 = (int) longValue2;
                String str = m68Var2.b;
                zzqVar.getClass();
                MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton = new MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton(MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton.EntryPoint.TIMER, null);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                UiTrackingScreen b = UiTracker.j.b();
                new iid0(c, SchemeStat$TypeAction.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, Long.valueOf(i2), Long.valueOf(longValue), null, str, null, 40, null), b != null ? b.a : null, mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton)).q();
            }
        }
        return s3q0.a;
    }
}
