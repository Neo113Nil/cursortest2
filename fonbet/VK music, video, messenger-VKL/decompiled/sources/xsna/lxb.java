package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.nwb;

/* compiled from: ChatProfileMultilineItemDelegate.kt */
/* loaded from: classes2.dex */
public final class lxb extends p1u0<nwb.j> {
    public final kkm a;

    /* compiled from: ChatProfileMultilineItemDelegate.kt */
    public static final class a extends vfz<nwb.j> {
        public final kkm l;
        public final TextView m;
        public final AppCompatImageView n;

        public a(View view, kkm kkmVar) {
            super(view);
            this.l = kkmVar;
            this.m = (TextView) view.findViewById(R.id.vkim_chat_profile_adapter_multiline_item__title);
            this.n = (AppCompatImageView) view.findViewById(R.id.vkim_chat_profile_adapter_multiline_item__icon);
        }

        @Override // xsna.vfz
        public final void V5() {
            abg0 abg0Var = dhr0.t;
            this.m.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
            bwt0.o0(this.n, abg0Var.c(R.attr.im_icon_grey));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(nwb.j jVar) {
            t0w0 t0w0Var;
            nwb.j jVar2 = jVar;
            ChatProfileListItem.d dVar = jVar2.b;
            CharSequence a = fwx0.c().a(dVar.b);
            TextView textView = this.m;
            textView.setText(a);
            Context context = this.itemView.getContext();
            e3m.a aVar = e3m.a;
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{m33.a(R.drawable.bg_rounded_corners_8, context), m33.a(dVar.c, this.itemView.getContext())});
            layerDrawable.setLayerInset(1, cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(8));
            AppCompatImageView appCompatImageView = this.n;
            appCompatImageView.setImageDrawable(layerDrawable);
            ConstraintLayout.b bVar = (ConstraintLayout.b) appCompatImageView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) bVar).width = cn70.b(36);
            ((ViewGroup.MarginLayoutParams) bVar).height = cn70.b(36);
            View view = this.itemView;
            int b = cn70.b(16);
            int b2 = cn70.b(8);
            int b3 = cn70.b(8);
            view.setClipToOutline(true);
            boolean z = jVar2.c;
            boolean z2 = jVar2.d;
            if (z && z2) {
                b2 = cn70.b(12);
                b3 = cn70.b(12);
                t0w0Var = new t0w0(6, cn70.a() * 20.0f, false, false);
            } else if (z) {
                b2 = cn70.b(12);
                t0w0Var = new t0w0(4, cn70.a() * 20.0f, false, false);
            } else if (z2) {
                b3 = cn70.b(12);
                t0w0Var = new t0w0(2, cn70.a() * 20.0f, false, false);
            } else {
                t0w0Var = new t0w0(6, cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false);
            }
            view.setOutlineProvider(t0w0Var);
            view.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e3m.f(R.attr.vk_ui_background_content, view.getContext()), 0, 254));
            view.setPadding(b, b2, b, b3);
            abg0 abg0Var = dhr0.t;
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
            bwt0.o0(appCompatImageView, abg0Var.c(R.attr.im_icon_grey));
        }

        @Override // xsna.vfz
        public final void a6() {
            TextView textView = this.m;
            kkm kkmVar = this.l;
            kkmVar.h(textView);
            kkmVar.h(this.n);
        }
    }

    public lxb(kkm kkmVar) {
        this.a = kkmVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends nwb.j> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.vkim_chat_profile_adapter_multiline_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof nwb.j;
    }
}
