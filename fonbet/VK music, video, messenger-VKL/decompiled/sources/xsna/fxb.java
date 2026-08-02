package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.nwb;

/* compiled from: ChatProfileItemWithDescriptionDelegate.kt */
/* loaded from: classes2.dex */
public final class fxb extends p1u0<nwb.h> {
    public final kkm a;
    public final Object b;

    /* compiled from: ChatProfileItemWithDescriptionDelegate.kt */
    public static final class a extends vfz<nwb.h> {
        public final kkm l;
        public final InterfaceC2898a m;
        public final AppCompatImageView n;
        public final TextView o;
        public final TextView p;
        public final VKImageView q;
        public final View r;
        public boolean s;
        public final bpn0 t;

        /* compiled from: ChatProfileItemWithDescriptionDelegate.kt */
        /* renamed from: xsna.fxb$a$a, reason: collision with other inner class name */
        public interface InterfaceC2898a {
            void j(ChatProfileListItem.c cVar);
        }

        public a(View view, kkm kkmVar, InterfaceC2898a interfaceC2898a) {
            super(view);
            this.l = kkmVar;
            this.m = interfaceC2898a;
            this.n = (AppCompatImageView) view.findViewById(R.id.vkim_chat_profile_adapter_with_description_item_icon);
            this.o = (TextView) view.findViewById(R.id.vkim_chat_profile_adapter_with_description_item_title);
            this.p = (TextView) view.findViewById(R.id.vkim_chat_profile_adapter_with_description_subtitle);
            this.q = (VKImageView) view.findViewById(R.id.vkim_chat_profile_adapter_with_description_item_end_icon);
            this.r = view.findViewById(R.id.vkim_chat_profile_adapter_with_description_hint);
            this.t = new bpn0(new vg1(view, 1));
        }

        @Override // xsna.vfz
        public final void V5() {
            h6();
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(nwb.h hVar) {
            nwb.h hVar2 = hVar;
            ChatProfileListItem.c cVar = hVar2.b;
            boolean t = BuildInfo.t();
            AppCompatImageView appCompatImageView = this.n;
            if (t) {
                Drawable drawable = (Drawable) this.t.getValue();
                Context context = this.itemView.getContext();
                int i = cVar.c;
                e3m.a aVar = e3m.a;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, m33.a(i, context)});
                layerDrawable.setLayerInset(1, cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(8));
                appCompatImageView.setImageDrawable(layerDrawable);
                ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = cn70.b(36);
                layoutParams.height = cn70.b(36);
                appCompatImageView.setLayoutParams(layoutParams);
                pxb.a(this.itemView, hVar2);
            } else {
                Context context2 = this.itemView.getContext();
                int i2 = cVar.c;
                e3m.a aVar2 = e3m.a;
                appCompatImageView.setImageDrawable(m33.a(i2, context2));
            }
            this.o.setText(cVar.b);
            this.s = cVar.k;
            Integer num = cVar.d;
            if (num != null) {
                int intValue = num.intValue();
                VKImageView vKImageView = this.q;
                vKImageView.setImageResource(intValue);
                vKImageView.setVisibility(0);
            }
            if (cVar.e) {
                this.r.setVisibility(0);
            }
            h6();
            String str = hVar2.c;
            if (str != null) {
                TextView textView = this.p;
                textView.setText(str);
                textView.setVisibility(0);
            }
            bwt0.i0(this.itemView, new v74(5, this, hVar2));
        }

        @Override // xsna.vfz
        public final void a6() {
            boolean z = this.s;
            kkm kkmVar = this.l;
            if (z) {
                kkmVar.h(this.o);
            }
            kkmVar.h(this.n);
        }

        public final void h6() {
            boolean t = BuildInfo.t();
            AppCompatImageView appCompatImageView = this.n;
            int i = R.attr.vk_ui_text_primary;
            TextView textView = this.o;
            if (t) {
                if (this.s) {
                    i = R.attr.vk_ui_text_accent;
                }
                abg0 abg0Var = dhr0.t;
                textView.setTextColor(abg0Var.c(i));
                bwt0.o0(appCompatImageView, abg0Var.c(R.attr.im_icon_grey));
                bwt0.o0(this.q, abg0Var.c(R.attr.vk_ui_icon_accent));
                return;
            }
            boolean z = this.s;
            kkm kkmVar = this.l;
            if (z) {
                kkmVar.c(textView, R.attr.vk_ui_text_accent);
            } else {
                textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
            }
            kkmVar.d(appCompatImageView, R.attr.vk_ui_icon_accent);
        }
    }

    public fxb(kkm kkmVar, a.InterfaceC2898a interfaceC2898a) {
        this.a = kkmVar;
        this.b = interfaceC2898a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.fxb$a$a] */
    @Override // xsna.p1u0
    public final vfz<? extends nwb.h> b(ViewGroup viewGroup) {
        boolean t = BuildInfo.t();
        int i = 0;
        ?? r2 = this.b;
        if (t) {
            return new a(bwt0.I(R.layout.vkim_chat_profile_adapter_with_description_item, viewGroup, false), this.a, r2);
        }
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, i);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setId(R.id.chatProfileItemWithDescriptionCell);
        return new qvx(vkCell, r2);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof nwb.h;
    }
}
