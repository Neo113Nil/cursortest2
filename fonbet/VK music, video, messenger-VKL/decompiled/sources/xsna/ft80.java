package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.toggle.features.VoipFeatures;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: OpponentNetworkStatusHolder.kt */
/* loaded from: classes7.dex */
public final class ft80 implements vgw0, tmg0 {
    public final TextView b;
    public final gt80 c;
    public boolean d;
    public final TextView e;
    public final List<TextView> f;
    public final EmptyList g;

    /* compiled from: OpponentNetworkStatusHolder.kt */
    public interface a {
        void hide();

        void show();
    }

    public ft80(mjw0 mjw0Var) {
        TextView textView = (TextView) mjw0Var.findViewById(R.id.header_network_status_opponent_text);
        VoipFeatures voipFeatures = VoipFeatures.BAD_NETWORK_INDICATOR;
        voipFeatures.getClass();
        if (com.vk.toggle.b.A.a(voipFeatures)) {
            textView.setText(R.string.voip_call_network_status_opponent_unstable);
        }
        this.b = textView;
        this.c = new gt80(this);
        this.e = textView;
        this.f = Collections.singletonList(textView);
        this.g = EmptyList.b;
    }

    @Override // xsna.vgw0
    public final View a() {
        return this.e;
    }

    @Override // xsna.vgw0
    public final boolean b() {
        return this.c.a;
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.g;
    }

    @Override // xsna.tmg0
    public final List<TextView> getViewsToRotate() {
        return this.f;
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
            bVar.u = R.id.voip_indicators_container;
            bVar.l = 0;
            bVar.i = 0;
            bVar.t = -1;
            bVar.v = -1;
            bVar.j = -1;
            bVar.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar.F = 0.5f;
            textView.setTranslationX(textView.getWidth() / 2.0f);
            textView.setLayoutParams(bVar);
            return;
        }
        if (f == 270.0f) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.s = R.id.voip_indicators_container;
            bVar2.i = 0;
            bVar2.l = 0;
            bVar2.v = -1;
            bVar2.t = -1;
            bVar2.j = -1;
            bVar2.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar2.F = 0.5f;
            textView.setTranslationX((-textView.getWidth()) / 2.0f);
            textView.setLayoutParams(bVar2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.j = R.id.voip_indicators_container;
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
