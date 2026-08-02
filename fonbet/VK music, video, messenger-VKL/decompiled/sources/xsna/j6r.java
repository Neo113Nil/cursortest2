package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.feedback.ui.FeedbackGroupCallFlyView;
import com.vk.voip.ui.feedback.ui.FeedbackP2PCallFlyView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FeedbacksFlyDelegate.kt */
/* loaded from: classes7.dex */
public final class j6r implements tmg0 {
    public final t98 b;
    public final dow0 c;
    public final AccessibilityEvents d;
    public final l7s e;
    public final FeedbackGroupCallFlyView f;
    public final FeedbackP2PCallFlyView g;
    public final io.reactivex.rxjava3.disposables.b h;
    public float i;
    public boolean j;

    public j6r(t98 t98Var, dow0 dow0Var, AccessibilityEvents accessibilityEvents, l7s l7sVar) {
        this.b = t98Var;
        this.c = dow0Var;
        this.d = accessibilityEvents;
        this.e = l7sVar;
        mjw0 mjw0Var = (mjw0) t98Var.b;
        FeedbackGroupCallFlyView feedbackGroupCallFlyView = (FeedbackGroupCallFlyView) mjw0Var.findViewById(R.id.feedback_group_fly_view);
        this.f = feedbackGroupCallFlyView;
        this.g = (FeedbackP2PCallFlyView) mjw0Var.findViewById(R.id.feedback_p2p_fly_view);
        this.h = new io.reactivex.rxjava3.disposables.b();
        this.j = true;
        feedbackGroupCallFlyView.setCountSection(5);
    }

    public final void a(View view, boolean z) {
        if (view.getWidth() == view.getHeight()) {
            return;
        }
        mjw0 mjw0Var = (mjw0) this.b.b;
        if (z) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = mjw0Var.getWidth();
            layoutParams.height = mjw0Var.getHeight();
            view.setLayoutParams(layoutParams);
            return;
        }
        view.setTranslationX(w65.h(mjw0Var));
        view.setTranslationY(-w65.h(mjw0Var));
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = mjw0Var.getHeight();
        layoutParams2.height = mjw0Var.getWidth();
        view.setLayoutParams(layoutParams2);
    }

    public final void b(float f) {
        boolean z = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == 180.0f;
        FeedbackP2PCallFlyView feedbackP2PCallFlyView = this.g;
        if (feedbackP2PCallFlyView != null) {
            a(feedbackP2PCallFlyView, z);
        }
        FeedbackGroupCallFlyView feedbackGroupCallFlyView = this.f;
        if (feedbackGroupCallFlyView == null) {
            return;
        }
        a(feedbackGroupCallFlyView, z);
        t98 t98Var = this.b;
        if (f == 90.0f) {
            feedbackGroupCallFlyView.setPadding(((mjw0) t98Var.b).getTopOffset(), 0, this.j ? cn70.b(108) : 0, 0);
            return;
        }
        if (f == 270.0f) {
            feedbackGroupCallFlyView.setPadding(this.j ? cn70.b(108) : 0, 0, ((mjw0) t98Var.b).getTopOffset(), 0);
        } else if (f == 180.0f) {
            feedbackGroupCallFlyView.setPadding(0, this.j ? cn70.b(108) : 0, 0, ((mjw0) t98Var.b).getTopOffset());
        } else {
            feedbackGroupCallFlyView.setPadding(0, ((mjw0) t98Var.b).getTopOffset(), 0, this.j ? cn70.b(108) : 0);
        }
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            CallMemberId callMemberId = ((a69) obj).b;
            arrayList2.add(obj);
        }
        int e = on00.e(c5g.u(arrayList2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a69 a69Var = (a69) it.next();
            Pair pair = new Pair(a69Var.b, this.c.a(a69Var.a));
            linkedHashMap.put(pair.i(), pair.j());
        }
        for (Map.Entry entry : p4g.h(linkedHashMap).entrySet()) {
            CallMemberId callMemberId2 = (CallMemberId) entry.getKey();
            String str = ((b69) entry.getValue()).c;
            if (str != null) {
                AccessibilityEvents accessibilityEvents = this.d;
                accessibilityEvents.getClass();
                accessibilityEvents.d(new kk(accessibilityEvents, callMemberId2, str, 0));
            }
        }
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return rl3.I(new FrameLayout[]{this.f, this.g});
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return rl3.I(new FrameLayout[]{this.f, this.g});
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        this.i = f;
        b(f);
    }
}
