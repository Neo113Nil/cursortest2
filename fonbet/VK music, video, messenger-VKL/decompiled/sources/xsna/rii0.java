package xsna;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import xsna.uii0;

/* compiled from: SendStoryUsersCreateChatDelegate.kt */
/* loaded from: classes16.dex */
public final class rii0 extends p1u0<uii0.a> {
    public final q99 a;

    /* compiled from: SendStoryUsersCreateChatDelegate.kt */
    public static final class a extends vfz<uii0.a> {
        public final izs<nii0, s3q0> l;

        public a(ViewGroup viewGroup, q99 q99Var) {
            super(R.layout.layout_story_send_dialog, viewGroup);
            this.l = q99Var;
            VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.dialog_photo);
            TextView textView = (TextView) this.itemView.findViewById(R.id.dialog_title);
            bwt0.i0(this.itemView, new l850(this, 10));
            View view = this.itemView;
            view.setBackground(m33.a(R.drawable.white_ripple_bounded_8dp, view.getContext()));
            f4m.j(this.itemView.findViewById(R.id.dialog_btn_send));
            at.d(this.itemView, R.string.sharing_action_button_label_create_chat, textView);
            LayerDrawable layerDrawable = (LayerDrawable) m33.a(R.drawable.story_add_narrative, this.itemView.getContext());
            layerDrawable.findDrawableByLayerId(R.id.add_outline_28).setTint(e3m.f(R.attr.vk_ui_icon_accent, this.itemView.getContext()));
            textView.setTextColor(e3m.f(R.attr.vk_ui_text_accent, this.itemView.getContext()));
            vKCircleImageView.setEmptyImagePlaceholder(layerDrawable);
            vKCircleImageView.W();
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final /* bridge */ /* synthetic */ void i6(uii0.a aVar) {
        }
    }

    public rii0(q99 q99Var) {
        this.a = q99Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends uii0.a> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof uii0.a;
    }
}
