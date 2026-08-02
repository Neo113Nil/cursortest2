package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.design.view.floatingbutton.FloatingButtonView;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vkontakte.android.R;
import xsna.rrr;
import xsna.srr;

/* compiled from: ClipsGridCameraButton.kt */
/* loaded from: classes17.dex */
public final class ece implements cfu {
    public final FloatingButtonView b;
    public final pxo0 c;

    /* compiled from: ClipsGridCameraButton.kt */
    public static final class a implements vrr {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PictureParams(url="), this.a, ')');
        }
    }

    public ece(FloatingButtonView floatingButtonView, pxo0 pxo0Var) {
        this.b = floatingButtonView;
        this.c = pxo0Var;
        floatingButtonView.setLeftMainPictureController(new fch(new xx0(15), new d69((byte) 0, 1)));
    }

    @Override // xsna.cfu
    public final void a(izs<? super View, s3q0> izsVar) {
        this.b.setOnClickListener(new dce(0, this, izsVar));
    }

    @Override // xsna.cfu
    public final void b(boolean z) {
        this.b.V4(z);
    }

    @Override // xsna.cfu
    public final void c(Integer num, ActionLink actionLink) {
        String string;
        ActionLinkSnippet actionLinkSnippet;
        ActionLinkSnippet actionLinkSnippet2;
        FloatingButtonView floatingButtonView = this.b;
        Context context = floatingButtonView.getContext();
        String zb = (actionLink == null || (actionLinkSnippet2 = actionLink.f) == null) ? null : actionLinkSnippet2.zb();
        if (actionLink == null || (actionLinkSnippet = actionLink.f) == null || (string = actionLinkSnippet.e) == null) {
            string = context.getString(num != null ? num.intValue() : R.string.video_clips_create_clip);
        }
        floatingButtonView.setLeft(zb == null ? new rrr.a(new gko(R.drawable.vk_icon_camera_outline_24)) : new rrr.b(new a(zb)));
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
