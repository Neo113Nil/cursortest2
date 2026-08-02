package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: WaitingRoomHolder.kt */
/* loaded from: classes7.dex */
public final class e8x0 implements tmg0 {
    public final TextView b;
    public final View c;
    public final zzz d;
    public final List<TextView> e;
    public final EmptyList f;

    public e8x0(mjw0 mjw0Var) {
        TextView textView = (TextView) mjw0Var.findViewById(R.id.voip_waiting_room_label);
        this.b = textView;
        this.c = mjw0Var.findViewById(R.id.voip_waiting_room_label_background);
        com.vk.voip.ui.c.b.getClass();
        this.d = (a000) com.vk.voip.ui.c.T().a;
        this.e = Collections.singletonList(textView);
        this.f = EmptyList.b;
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.f;
    }

    @Override // xsna.tmg0
    public final List<TextView> getViewsToRotate() {
        return this.e;
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        TextView textView = this.b;
        if (f == 90.0f) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.i = 0;
            bVar.u = R.id.call_state_title;
            bVar.l = 0;
            bVar.j = -1;
            bVar.t = -1;
            bVar.s = -1;
            bVar.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar.F = 0.5f;
            textView.setTranslationX(textView.getWidth() / 1.5f);
            textView.setLayoutParams(bVar);
            return;
        }
        if (f == 270.0f) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.i = 0;
            bVar2.s = R.id.call_state_title;
            bVar2.l = 0;
            bVar2.j = -1;
            bVar2.t = -1;
            bVar2.v = -1;
            bVar2.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar2.F = 0.5f;
            textView.setTranslationX((-textView.getWidth()) / 1.5f);
            textView.setLayoutParams(bVar2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.j = R.id.call_state_title;
        bVar3.t = 0;
        bVar3.v = 0;
        bVar3.i = -1;
        bVar3.l = -1;
        bVar3.s = -1;
        bVar3.u = -1;
        bVar3.E = 0.5f;
        bVar3.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        textView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textView.setLayoutParams(bVar3);
    }
}
