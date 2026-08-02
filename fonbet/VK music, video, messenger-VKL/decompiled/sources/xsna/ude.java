package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.design.view.floatingbutton.FloatingButtonView;
import com.vk.dto.actionlinks.ActionLink;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.rrr;
import xsna.srr;

/* compiled from: ClipsGridLivesButton.kt */
/* loaded from: classes17.dex */
public final class ude implements cfu {
    public final FloatingButtonView b;
    public final pxo0 c;

    public ude(FloatingButtonView floatingButtonView, pxo0 pxo0Var) {
        this.b = floatingButtonView;
        this.c = pxo0Var;
    }

    @Override // xsna.cfu
    public final void a(izs<? super View, s3q0> izsVar) {
        this.b.setOnClickListener(new cm1(1, this, izsVar));
    }

    @Override // xsna.cfu
    public final void b(boolean z) {
        this.b.V4(z);
    }

    @Override // xsna.cfu
    public final void c(Integer num, ActionLink actionLink) {
        FloatingButtonView floatingButtonView = this.b;
        Context context = floatingButtonView.getContext();
        gko.b bVar = gko.Companion;
        String string = context.getString(R.string.video_clips_create_live);
        floatingButtonView.setLeft(new rrr.a(new gko(R.drawable.vk_icon_live_24)));
        floatingButtonView.setMiddle(new srr.a(oq.d(tlo0.Companion, string)));
        floatingButtonView.setContentDescription(string);
    }

    @Override // xsna.cfu
    public final void d(boolean z) {
        bwt0.p0(this.b, z);
    }

    @Override // xsna.cfu
    public final void e(float f) {
        qcy<Object>[] qcyVarArr = bwt0.a;
        FloatingButtonView floatingButtonView = this.b;
        floatingButtonView.setTranslationY((bwt0.M(floatingButtonView) + (floatingButtonView.getLayoutParams() != null ? r1.height : 0)) * f);
    }

    @Override // xsna.cfu
    public final void setVisible(boolean z) {
        bwt0.p0(this.b, z);
    }
}
