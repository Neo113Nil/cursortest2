package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.nwb;

/* compiled from: ChatProfileSimpleItemDelegate.kt */
/* loaded from: classes2.dex */
public final class oxb extends p1u0<nwb.k> {
    public final kkm a;
    public final Object b;

    /* compiled from: ChatProfileSimpleItemDelegate.kt */
    public static final class a extends vfz<nwb.k> {
        public final kkm l;
        public final InterfaceC3477a m;
        public final TextView n;
        public final AppCompatImageView o;
        public final AppCompatImageView p;
        public final VKImageView q;
        public boolean r;

        /* compiled from: ChatProfileSimpleItemDelegate.kt */
        /* renamed from: xsna.oxb$a$a, reason: collision with other inner class name */
        public interface InterfaceC3477a {
            void f(qxb qxbVar);

            void n(qxb qxbVar);
        }

        public a(View view, kkm kkmVar, InterfaceC3477a interfaceC3477a) {
            super(view);
            this.l = kkmVar;
            this.m = interfaceC3477a;
            this.n = (TextView) view.findViewById(R.id.vkim_chat_profile_adapter_simple_item__title);
            this.o = (AppCompatImageView) view.findViewById(R.id.vkim_chat_profile_adapter_simple_item__icon);
            this.p = (AppCompatImageView) view.findViewById(R.id.vkim_chat_profile_adapter_simple_item_icon_right);
            this.q = (VKImageView) view.findViewById(R.id.vkim_chat_profile_adapter_simple_item_hint_icon_right);
        }

        @Override // xsna.vfz
        public final void V5() {
            h6();
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(nwb.k kVar) {
            nwb.k kVar2 = kVar;
            qxb qxbVar = kVar2.b;
            this.n.setText(qxbVar.f());
            boolean t = BuildInfo.t();
            AppCompatImageView appCompatImageView = this.o;
            if (t) {
                Context context = this.itemView.getContext();
                e3m.a aVar = e3m.a;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{m33.a(R.drawable.bg_rounded_corners_8, context), m33.a(qxbVar.b(), this.itemView.getContext())});
                layerDrawable.setLayerInset(1, cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(8));
                appCompatImageView.setImageDrawable(layerDrawable);
                ConstraintLayout.b bVar = (ConstraintLayout.b) appCompatImageView.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) bVar).width = cn70.b(36);
                ((ViewGroup.MarginLayoutParams) bVar).height = cn70.b(36);
                AppCompatImageView appCompatImageView2 = this.p;
                if (appCompatImageView2 != null) {
                    bwt0.p0(appCompatImageView2, qxbVar.a() != null);
                }
                Integer a = qxbVar.a();
                if (a != null) {
                    int intValue = a.intValue();
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageDrawable(m33.a(intValue, this.itemView.getContext()));
                    }
                }
                pxb.a(this.itemView, kVar2);
            } else {
                Context context2 = this.itemView.getContext();
                int b = qxbVar.b();
                e3m.a aVar2 = e3m.a;
                appCompatImageView.setImageDrawable(m33.a(b, context2));
            }
            if (qxbVar.c()) {
                this.q.setVisibility(0);
            }
            this.r = qxbVar.d();
            bwt0.i0(this.itemView, new g86(3, this, qxbVar));
            bwt0.k0(this.itemView, new ya(8, this, qxbVar));
            h6();
        }

        @Override // xsna.vfz
        public final void a6() {
            boolean z = this.r;
            kkm kkmVar = this.l;
            if (z) {
                kkmVar.h(this.n);
            }
            kkmVar.h(this.o);
        }

        public final void h6() {
            boolean t = BuildInfo.t();
            AppCompatImageView appCompatImageView = this.o;
            int i = R.attr.vk_ui_text_primary;
            TextView textView = this.n;
            if (!t) {
                boolean z = this.r;
                kkm kkmVar = this.l;
                if (z) {
                    kkmVar.c(textView, R.attr.vk_ui_text_accent);
                } else {
                    textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                }
                kkmVar.d(appCompatImageView, R.attr.vk_ui_text_accent);
                return;
            }
            if (this.r) {
                i = R.attr.vk_ui_text_accent;
            }
            abg0 abg0Var = dhr0.t;
            textView.setTextColor(abg0Var.c(i));
            bwt0.o0(appCompatImageView, abg0Var.c(R.attr.im_icon_grey));
            AppCompatImageView appCompatImageView2 = this.p;
            if (appCompatImageView2 != null) {
                bwt0.o0(appCompatImageView2, abg0Var.c(R.attr.vk_ui_icon_accent));
            }
        }
    }

    public oxb(kkm kkmVar, a.InterfaceC3477a interfaceC3477a) {
        this.a = kkmVar;
        this.b = interfaceC3477a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.oxb$a$a] */
    @Override // xsna.p1u0
    public final vfz<? extends nwb.k> b(ViewGroup viewGroup) {
        boolean t = BuildInfo.t();
        int i = 0;
        ?? r2 = this.b;
        if (t) {
            return new a(bwt0.I(BuildInfo.t() ? R.layout.vkim_chat_profile_adapter_simple_item_v2 : R.layout.vkim_chat_profile_adapter_simple_item, viewGroup, false), this.a, r2);
        }
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, i);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setId(R.id.simpleItemCell);
        return new crj0(vkCell, r2);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof nwb.k;
    }
}
