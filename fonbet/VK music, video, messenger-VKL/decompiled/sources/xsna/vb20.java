package xsna;

import android.content.res.ColorStateList;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.IconSize;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dop0;
import xsna.ob20;
import xsna.onp0;
import xsna.tlo0;
import xsna.unp0;

/* compiled from: MessageTranslateScreenVc.kt */
/* loaded from: classes6.dex */
public final class vb20 implements xg6 {
    public final qb20 a;
    public final View b;
    public final VkSpinner c;
    public final LinearLayout d;
    public final VkText e;
    public final VkText f;
    public final VkExpandableText g;
    public final VkText h;
    public final VkImage i;
    public final VkText j;
    public final VkSkeleton k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final LinearLayout n;
    public final VkPlaceholder o;
    public tb20 p;
    public ob20 q;
    public boolean r;
    public boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    public vb20(LayoutInflater layoutInflater, ViewGroup viewGroup, qb20 qb20Var) {
        this.a = qb20Var;
        layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.vkim_message_translate, viewGroup, false);
        inflate.setClipToOutline(true);
        inflate.setOutlineProvider(new t0w0(4, e3m.a(R.dimen.vk_ui_border_radius_paper, inflate.getContext()), false, false));
        this.b = inflate;
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.topbar);
        VkSpinner vkSpinner = (VkSpinner) inflate.findViewById(R.id.translations_loader);
        this.c = vkSpinner;
        this.d = (LinearLayout) inflate.findViewById(R.id.translation_container);
        this.e = (VkText) inflate.findViewById(R.id.original_language);
        this.f = (VkText) inflate.findViewById(R.id.recognized_automatically);
        this.g = (VkExpandableText) inflate.findViewById(R.id.original_text);
        this.h = (VkText) inflate.findViewById(R.id.translation_language);
        VkImage vkImage = (VkImage) inflate.findViewById(R.id.btn_audio_translate);
        this.i = vkImage;
        VkText vkText = (VkText) inflate.findViewById(R.id.translated_text);
        this.j = vkText;
        this.k = (VkSkeleton) inflate.findViewById(R.id.translated_text_skeleton);
        this.l = (LinearLayout) inflate.findViewById(R.id.translation_container_lego);
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.lego_cell_translation);
        this.m = (LinearLayout) inflate.findViewById(R.id.actions_container);
        this.n = (LinearLayout) inflate.findViewById(R.id.actions_container_lego);
        this.o = (VkPlaceholder) inflate.findViewById(R.id.translation_failed_placeholder);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(inflate.getContext().getString(R.string.vkim_message_translate_title), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
        vkTopBar.setBefore(new VkTopBar.c.d(0 == true ? 1 : 0, new foi(this, 23), 0 == true ? 1 : 0, com.vk.core.compose.component.semantics.b.a(null, new x8m(18), 3), 5));
        vkTopBar.setAfter(null);
        vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size56);
        ColorStateList valueOf = ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent));
        vkSpinner.setIndeterminateTintList(valueOf);
        vkSpinner.setProgressTintList(valueOf);
        jjc.g(vkText, new qi00(this, 3));
        jjc.g(vkImage, new u6k(this, 20));
        jjc.g(vkCell, new vam(this, 25));
    }

    @Override // xsna.xg6
    public final void a(tb20 tb20Var) {
        dop0 dop0Var = tb20Var.b;
        unp0 unp0Var = tb20Var.c;
        if ((dop0Var instanceof dop0.b) && (unp0Var instanceof unp0.b)) {
            boolean z = dop0Var instanceof dop0.b;
            VkSpinner vkSpinner = this.c;
            if (z && (unp0Var instanceof unp0.b)) {
                f4m.j(this.d);
                f4m.j(this.l);
                f4m.j(this.m);
                f4m.j(this.n);
                vkSpinner.setVisibility(0);
            } else {
                f4m.j(vkSpinner);
            }
        } else if (dop0Var instanceof dop0.c) {
            dop0.c cVar = dop0Var != null ? (dop0.c) dop0Var : null;
            if (cVar != null) {
                onp0 onp0Var = cVar.a;
                if ((unp0Var instanceof unp0.b) || (unp0Var instanceof unp0.a)) {
                    d(onp0Var);
                } else {
                    if (!(unp0Var instanceof unp0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if ((onp0Var instanceof onp0.c) || (onp0Var instanceof onp0.d)) {
                        d(onp0Var);
                    } else {
                        if (!(onp0Var instanceof onp0.b) && !(onp0Var instanceof onp0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c(tb20Var);
                    }
                }
            }
        } else {
            c(tb20Var);
        }
        this.p = tb20Var;
    }

    public final void b(View view, kb20 kb20Var) {
        int i = kb20Var.a;
        int i2 = kb20Var.c;
        view.setTag(Integer.valueOf(i));
        view.setClickable(kb20Var.d);
        jjc.g(view, new az2(19, this, kb20Var));
        if (view instanceof VkCellButton) {
            VkCellButton vkCellButton = (VkCellButton) view;
            vkCellButton.setTitle(i2);
            vkCellButton.a(true, Integer.valueOf(kb20Var.b));
        } else if (view instanceof VkButton) {
            ((VkButton) view).setText(i2);
        }
    }

    public final void c(tb20 tb20Var) {
        String g;
        String g2;
        f4m.j(this.c);
        tb20 tb20Var2 = this.p;
        if (tb20Var2 != null && (tb20Var2.b instanceof dop0.b) && !(tb20Var.b instanceof dop0.b) && !this.r) {
            this.r = true;
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.addListener((Transition.TransitionListener) new ub20(this));
            this.a.X0(autoTransition);
        }
        int i = 0;
        this.d.setVisibility(0);
        unp0 unp0Var = tb20Var.c;
        unp0 unp0Var2 = tb20Var.c;
        dop0 dop0Var = tb20Var.b;
        CharSequence charSequence = "";
        if (unp0Var instanceof unp0.b) {
            g = "";
        } else if (unp0Var instanceof unp0.c) {
            g = ((unp0.c) unp0Var).a.g();
        } else {
            if (!(unp0Var instanceof unp0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            g = ((unp0.a) unp0Var).a.g();
        }
        this.e.setText(g);
        boolean z = unp0Var2 instanceof unp0.a;
        this.f.setText(z ? this.b.getContext().getString(R.string.vkim_translate_language_autorecognized) : "");
        ez80 ez80Var = tb20Var.a;
        CharSequence charSequence2 = ez80Var.a;
        VkExpandableText vkExpandableText = this.g;
        vkExpandableText.setText(charSequence2);
        View view = null;
        vkExpandableText.setExpandButton(!this.s ? new VkExpandableText.a(tq.h(tlo0.Companion, R.string.vkim_translate_show_full_translate), new x7g(R.attr.vk_ui_text_accent), null, new w4u(this, 10), 20) : null);
        if (ez80Var.b) {
            vkExpandableText.q();
        } else {
            vkExpandableText.o();
        }
        if (unp0Var2 instanceof unp0.b) {
            g2 = "";
        } else if (unp0Var2 instanceof unp0.c) {
            g2 = ((unp0.c) unp0Var2).b.g();
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            g2 = ((unp0.a) unp0Var2).b.g();
        }
        this.h.setText(g2);
        boolean z2 = dop0Var instanceof dop0.b;
        VkSkeleton vkSkeleton = this.k;
        VkText vkText = this.j;
        if (z2 && (unp0Var2 instanceof unp0.c)) {
            f4m.j(vkText);
            vkSkeleton.setVisibility(0);
        } else {
            f4m.j(vkSkeleton);
            vkText.setVisibility(0);
            if (dop0Var instanceof dop0.a) {
                if (dop0Var != null) {
                    charSequence = ((dop0.a) dop0Var).a;
                }
            } else if (!(dop0Var instanceof dop0.c) && !(dop0Var instanceof dop0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            vkText.setText(charSequence);
        }
        this.i.setImageResource((dop0Var instanceof dop0.a) && ((dop0.a) dop0Var).b ? R.drawable.vk_icon_pause_24 : R.drawable.vk_icon_play_circle_24);
        ob20 ob20Var = tb20Var.d;
        if (epx.f(ob20Var, this.q)) {
            return;
        }
        this.q = ob20Var;
        boolean z3 = ob20Var instanceof ob20.b;
        LinearLayout linearLayout = this.m;
        if (!z3) {
            if (!(ob20Var instanceof ob20.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ob20.a) ob20Var).a.getClass();
            int childCount = linearLayout.getChildCount();
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = linearLayout.getChildAt(i);
                if (epx.f(childAt.getTag(), 2)) {
                    view = childAt;
                    break;
                }
                i++;
            }
            if (view == null) {
                return;
            }
            b(view, mb20.a);
            return;
        }
        List<kb20> list = ((ob20.b) ob20Var).a;
        linearLayout.removeAllViews();
        linearLayout.setVisibility(0);
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            VkCellButton vkCellButton = new VkCellButton(linearLayout.getContext(), null, 6);
            vkCellButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            vkCellButton.setAppearance(Appearance.Accent);
            vkCellButton.setIconSize(IconSize.Small);
            b(vkCellButton, (kb20) obj);
            linearLayout.addView(vkCellButton);
            i = i2;
        }
    }

    public final void d(onp0 onp0Var) {
        int i;
        int i2;
        f4m.j(this.d);
        f4m.j(this.l);
        f4m.j(this.m);
        f4m.j(this.n);
        onp0.b bVar = onp0.b.a;
        if (epx.f(onp0Var, bVar)) {
            i = R.string.vkim_language_not_autorecognized;
        } else if (epx.f(onp0Var, onp0.c.a)) {
            i = R.string.vkim_translate_for_msg_not_supported;
        } else {
            if (!epx.f(onp0Var, onp0.d.a) && !(onp0Var instanceof onp0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.vkim_translate_service_not_available;
        }
        if (epx.f(onp0Var, bVar)) {
            i2 = R.string.vkim_language_not_autorecognized_info;
        } else if (epx.f(onp0Var, onp0.c.a)) {
            i2 = R.string.vkim_translate_for_msg_not_supported_info;
        } else {
            if (!epx.f(onp0Var, onp0.d.a) && !(onp0Var instanceof onp0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.vkim_translate_service_not_available_info;
        }
        VkPlaceholder.Mode mode = VkPlaceholder.Mode.Primary;
        VkPlaceholder vkPlaceholder = this.o;
        vkPlaceholder.setMode(mode);
        vkPlaceholder.setWithPaddings(true);
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_illustration_confused_man_188h), null, null, 12));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, i)), new VkPlaceholder.b.C0859b(14, new tlo0.f(i2))));
        vkPlaceholder.setBottom(onp0Var instanceof onp0.b ? new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vkim_translate_select_language), (gzs) new bfm(this, 20), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, (VkButton.Mode) null, (VkButton.Appearance) null, false, IronSourceError.ERROR_CODE_INIT_FAILED), null, null, null, 14) : null);
        vkPlaceholder.setVisibility(0);
    }
}
