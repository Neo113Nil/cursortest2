package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.c;
import com.vk.superapp.multiaccount.impl.ui.FooterButtonType;
import com.vk.superapp.multiaccount.impl.ui.relateduser.RelatedUserStackView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.xnn0;

/* compiled from: MultiAccountSwitcherAdapter.kt */
/* loaded from: classes6.dex */
public final class o340 extends androidx.recyclerview.widget.x<xnn0, RecyclerView.e0> {
    public static final a h = new a();
    public final pxo c;
    public final jzq0 d;
    public final kav e;
    public final g6b f;
    public final p340 g;

    /* compiled from: MultiAccountSwitcherAdapter.kt */
    public static final class a extends m.e<xnn0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(xnn0 xnn0Var, xnn0 xnn0Var2) {
            xnn0 xnn0Var3 = xnn0Var;
            xnn0 xnn0Var4 = xnn0Var2;
            if ((xnn0Var3 instanceof xnn0.a) && (xnn0Var4 instanceof xnn0.a)) {
                return true;
            }
            if ((xnn0Var3 instanceof xnn0.e) && (xnn0Var4 instanceof xnn0.e)) {
                return xnn0Var3.equals(xnn0Var4);
            }
            if ((xnn0Var3 instanceof xnn0.d) && (xnn0Var4 instanceof xnn0.d)) {
                return xnn0Var3.equals(xnn0Var4);
            }
            if ((xnn0Var3 instanceof xnn0.h) && (xnn0Var4 instanceof xnn0.h)) {
                return ((xnn0.h) xnn0Var3).a.equals(((xnn0.h) xnn0Var4).a);
            }
            if ((xnn0Var3 instanceof xnn0.c) && (xnn0Var4 instanceof xnn0.c)) {
                return ((xnn0.c) xnn0Var3).c.equals(((xnn0.c) xnn0Var4).c);
            }
            if ((xnn0Var3 instanceof xnn0.f) && (xnn0Var4 instanceof xnn0.f)) {
                ArrayList arrayList = ((xnn0.f) xnn0Var3).a;
                ArrayList arrayList2 = ((xnn0.f) xnn0Var4).a;
                return arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
            }
            if ((xnn0Var3 instanceof xnn0.b) && (xnn0Var4 instanceof xnn0.b)) {
                return true;
            }
            return (xnn0Var3 instanceof xnn0.g) && (xnn0Var4 instanceof xnn0.g) && ((xnn0.g) xnn0Var3).a == ((xnn0.g) xnn0Var4).a;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(xnn0 xnn0Var, xnn0 xnn0Var2) {
            xnn0 xnn0Var3 = xnn0Var;
            xnn0 xnn0Var4 = xnn0Var2;
            if (!qjg.a(xnn0Var3).equals(qjg.a(xnn0Var4))) {
                return false;
            }
            if ((xnn0Var3 instanceof xnn0.a) && (xnn0Var4 instanceof xnn0.a)) {
                return true;
            }
            if ((xnn0Var3 instanceof xnn0.e) && (xnn0Var4 instanceof xnn0.e)) {
                return xnn0Var3.equals(xnn0Var4);
            }
            if ((xnn0Var3 instanceof xnn0.d) && (xnn0Var4 instanceof xnn0.d)) {
                return xnn0Var3.equals(xnn0Var4);
            }
            if ((xnn0Var3 instanceof xnn0.h) && (xnn0Var4 instanceof xnn0.h)) {
                return epx.f(((xnn0.h) xnn0Var3).a.a().b, ((xnn0.h) xnn0Var4).a.a().b);
            }
            if ((xnn0Var3 instanceof xnn0.c) && (xnn0Var4 instanceof xnn0.c)) {
                xnn0.c cVar = (xnn0.c) xnn0Var3;
                xnn0.c cVar2 = (xnn0.c) xnn0Var4;
                return epx.f(cVar.c.a().b, cVar2.c.a().b) && cVar.a.equals(cVar2.a);
            }
            if ((xnn0Var3 instanceof xnn0.f) && (xnn0Var4 instanceof xnn0.f)) {
                return ((xnn0.f) xnn0Var3).a.size() == ((xnn0.f) xnn0Var4).a.size();
            }
            if ((xnn0Var3 instanceof xnn0.b) && (xnn0Var4 instanceof xnn0.b)) {
                return true;
            }
            return (xnn0Var3 instanceof xnn0.g) && (xnn0Var4 instanceof xnn0.g);
        }
    }

    /* compiled from: MultiAccountSwitcherAdapter.kt */
    public interface b {
        void a();
    }

    public o340(pxo pxoVar, jzq0 jzq0Var) {
        super(h);
        this.c = pxoVar;
        this.d = jzq0Var;
        this.e = new kav();
        this.f = new g6b(6);
        this.g = new p340(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        xnn0 item = getItem(i);
        if (item instanceof xnn0.h) {
            return 1;
        }
        if (item instanceof xnn0.a) {
            return 0;
        }
        if (item instanceof xnn0.d) {
            return 2;
        }
        if (item instanceof xnn0.e) {
            return 3;
        }
        if (item instanceof xnn0.b) {
            return 4;
        }
        if (item instanceof xnn0.c) {
            return 5;
        }
        if (item instanceof xnn0.f) {
            return 6;
        }
        if (item instanceof xnn0.g) {
            return 7;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        Drawable findDrawableByLayerId;
        xnn0 item = getItem(i);
        if (e0Var instanceof v340) {
            ((v340) e0Var).V5((xnn0.h) item);
            return;
        }
        if (e0Var instanceof q340) {
            q340 q340Var = (q340) e0Var;
            int i2 = ((xnn0.a) item).a;
            View view = q340Var.n;
            f4m.s(i2, view);
            q340Var.m.setOnClickListener(new um3(q340Var, 5));
            iut0.q(q340Var.itemView, new vmk());
            View view2 = q340Var.itemView;
            view2.setContentDescription(view2.getContext().getString(R.string.vk_multiaccount_add_account));
            Drawable background = view.getBackground();
            LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
            if (layerDrawable == null || (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.shape_plus)) == null) {
                return;
            }
            findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(e3m.f(R.attr.vk_ui_icon_accent_themed, view.getContext()), PorterDuff.Mode.SRC_ATOP));
            return;
        }
        if (e0Var instanceof g240) {
            g240 g240Var = (g240) e0Var;
            FooterButtonType footerButtonType = ((xnn0.d) item).a;
            iut0.q(g240Var.itemView, new vmk());
            View view3 = g240Var.m;
            Context context = g240Var.p;
            view3.setBackground(enj.e(footerButtonType.h(), R.attr.vk_ui_accent_blue, context));
            g240Var.n.setText(context.getString(footerButtonType.i()));
            g240Var.o.setOnClickListener(new gla(5, footerButtonType, g240Var));
            return;
        }
        if (e0Var instanceof u340) {
            u340 u340Var = (u340) e0Var;
            ArrayList arrayList = ((xnn0.f) item).a;
            RelatedUserStackView relatedUserStackView = u340Var.o;
            relatedUserStackView.setUsers(arrayList);
            iut0.q(relatedUserStackView, new vmk());
            jzq0 jzq0Var = u340Var.m;
            arrayList.size();
            jzq0Var.getClass();
            relatedUserStackView.setContentDescription("");
            relatedUserStackView.setUserSelectedCallback(u340Var.l);
            relatedUserStackView.setContentPaddingStart(iah0.a(74));
            relatedUserStackView.setStrokeColor(krv0.m(R.attr.vk_ui_background_modal, u340Var.itemView.getContext()));
            relatedUserStackView.setOnClickListener(new bg0(u340Var, 9));
            return;
        }
        if (e0Var instanceof w340) {
            w340 w340Var = (w340) e0Var;
            xnn0.e eVar = (xnn0.e) item;
            TextView textView = w340Var.l;
            Integer c = eVar.c();
            String string = c != null ? w340Var.itemView.getContext().getString(c.intValue()) : eVar.a();
            textView.setText(cqm0.o(string, eVar.i));
            textView.setContentDescription(string);
            textView.setTextAppearance(w340Var.itemView.getContext(), eVar.c);
            textView.setPaddingRelative(eVar.e, eVar.f, eVar.g, eVar.h);
            Integer b2 = eVar.b();
            if (b2 != null) {
                int intValue = b2.intValue();
                TypedValue typedValue = new TypedValue();
                if (textView.getContext().getTheme().resolveAttribute(intValue, typedValue, true)) {
                    textView.setTextColor(typedValue.resourceId != 0 ? textView.getContext().getColor(typedValue.resourceId) : typedValue.data);
                    return;
                }
                return;
            }
            return;
        }
        if (e0Var instanceof b240) {
            return;
        }
        if (!(e0Var instanceof e240)) {
            if (e0Var instanceof n340) {
                f4m.k(((xnn0.g) item).a, ((n340) e0Var).itemView);
                return;
            }
            return;
        }
        xnn0.c cVar = (xnn0.c) item;
        e240 e240Var = (e240) e0Var;
        EcosystemProfileView ecosystemProfileView = e240Var.l;
        ecosystemProfileView.setProfileMode$impl_release(c.a.a);
        xwo xwoVar = ecosystemProfileView.h;
        ecosystemProfileView.j = cVar.b;
        if (!ecosystemProfileView.isAttachedToWindow()) {
            ecosystemProfileView.addOnAttachStateChangeListener(new d240(ecosystemProfileView, e240Var, cVar));
        } else {
            xwoVar.s(new a.i(cVar.a));
            xwoVar.s(new a.h(cVar.c));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        jzq0 jzq0Var = this.d;
        pxo pxoVar = this.c;
        switch (i) {
            case 0:
                return new q340(viewGroup, pxoVar);
            case 1:
                r55 r55Var = r55.a;
                v340 v340Var = new v340(viewGroup, pxoVar, r55.f(), jzq0Var);
                kav kavVar = this.e;
                kavVar.b.add(new WeakReference<>(v340Var));
                kav kavVar2 = v340Var.p;
                ps8 ps8Var = v340Var.n;
                if (kavVar2 != null) {
                    ps8Var.h.remove(kavVar2);
                }
                ps8Var.h.add(kavVar);
                v340Var.p = kavVar;
                return v340Var;
            case 2:
                return new g240(viewGroup, pxoVar);
            case 3:
                return new w340(viewGroup);
            case 4:
                return new b240(tf3.b(viewGroup, R.layout.vk_auth_multiaccount_divider_item, viewGroup, false));
            case 5:
                return new e240(viewGroup);
            case 6:
                u340 u340Var = new u340(viewGroup, pxoVar, jzq0Var, this.g);
                ((LinkedHashSet) this.f.b).add(new WeakReference(u340Var.o));
                return u340Var;
            case 7:
                return new n340(tf3.b(viewGroup, R.layout.vk_auth_multiaccount_padding_item, viewGroup, false));
            default:
                throw new IllegalStateException(lhg.a(i, "Unknown viewType = "));
        }
    }
}
