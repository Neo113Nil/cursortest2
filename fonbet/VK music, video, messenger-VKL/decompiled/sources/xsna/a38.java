package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.TintTextView;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.ButtonColor;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.b38;
import xsna.e3m;
import xsna.y28;

/* compiled from: BotKeyboardAdapter.kt */
/* loaded from: classes2.dex */
public final class a38 extends RecyclerView.Adapter<y28> {
    public final LayoutInflater c;
    public int d;
    public List<? extends BotButton> e = EmptyList.b;
    public b38 f = b38.a.a;
    public boolean g;

    public a38(LayoutInflater layoutInflater) {
        this.c = layoutInflater;
        this.d = e3m.f(R.attr.vk_legacy_accent, layoutInflater.getContext());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(y28 y28Var, int i) {
        int i2;
        Drawable a;
        y28 y28Var2 = y28Var;
        BotButton botButton = this.e.get(i);
        boolean z = this.g;
        b38 b38Var = this.f;
        int i3 = this.d;
        ImageView imageView = y28Var2.m;
        TintTextView tintTextView = y28Var2.l;
        Context context = y28Var2.itemView.getContext();
        boolean z2 = botButton instanceof BotButton.Callback;
        ButtonColor buttonColor = z2 ? ((BotButton.Callback) botButton).m : botButton instanceof BotButton.Text ? ((BotButton.Text) botButton).k : botButton instanceof BotButton.ModalView ? ((BotButton.ModalView) botButton).l : botButton instanceof BotButton.VkPay ? ButtonColor.VKPAY : ButtonColor.DEFAULT;
        int[] iArr = y28.a.$EnumSwitchMapping$0;
        int i4 = iArr[buttonColor.ordinal()];
        int f = i4 != 1 ? i4 != 2 ? -1 : e3m.f(R.attr.vk_ui_text_contrast_themed, context) : z ? e3m.f(R.attr.vk_ui_vkontakte_im_bubble_wallpaper_button_foreground, context) : e3m.f(R.attr.vk_ui_vkontakte_im_bubble_button_foreground, context);
        if (imageView != null) {
            bwt0.p0(imageView, botButton instanceof BotButton.Link);
        }
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(f));
        }
        boolean z3 = botButton instanceof BotButton.Text;
        int i5 = 0;
        if (z3) {
            ucp ucpVar = ucp.a;
            tintTextView.setText(ucp.i(((BotButton.Text) botButton).j));
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (botButton instanceof BotButton.Link) {
            ucp ucpVar2 = ucp.a;
            tintTextView.setText(ucp.i(((BotButton.Link) botButton).j));
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (botButton instanceof BotButton.Location) {
            tintTextView.setText(tintTextView.getContext().getString(R.string.vkim_botbutton_place));
            tintTextView.setCompoundDrawablesRelative(y28Var2.n, null, null, null);
            tintTextView.setDrawableLeftTint(i3);
        } else if (botButton instanceof BotButton.VkApps) {
            String str = ((BotButton.VkApps) botButton).m;
            if (str == null) {
                str = tintTextView.getContext().getString(R.string.vkim_botbutton_vkapps);
            }
            tintTextView.setText(str);
            tintTextView.setCompoundDrawablesRelative(y28Var2.o, null, null, null);
            tintTextView.setDrawableLeftTint(i3);
        } else if (botButton instanceof BotButton.VkPay) {
            tintTextView.setText(tintTextView.getContext().getString(R.string.vkim_botbutton_vkpay));
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            his0.t(tintTextView, R.drawable.ic_vk_pay_white, 0);
            tintTextView.f();
        } else if (z2) {
            ucp ucpVar3 = ucp.a;
            tintTextView.setText(ucp.i(((BotButton.Callback) botButton).l));
        } else if (botButton instanceof BotButton.ModalView) {
            ucp ucpVar4 = ucp.a;
            tintTextView.setText(ucp.i(((BotButton.ModalView) botButton).j));
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            tintTextView.setText(tintTextView.getContext().getString(R.string.vkim_unavailable));
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        tintTextView.setTextColor(f);
        View view = y28Var2.itemView;
        ButtonColor buttonColor2 = z2 ? ((BotButton.Callback) botButton).m : z3 ? ((BotButton.Text) botButton).k : botButton instanceof BotButton.ModalView ? ((BotButton.ModalView) botButton).l : botButton instanceof BotButton.VkPay ? ButtonColor.VKPAY : ButtonColor.DEFAULT;
        if (!botButton.Bb() || buttonColor2 != ButtonColor.DEFAULT) {
            Context context2 = view.getContext();
            int i6 = iArr[buttonColor2.ordinal()];
            if (i6 == 1) {
                i2 = dhr0.C().b ? R.drawable.vkui_bg_button_white : R.drawable.vkui_bg_button_secondary;
            } else if (i6 == 2) {
                i2 = R.drawable.vkim_bg_bot_button_primary;
            } else if (i6 == 3) {
                i2 = R.drawable.vkim_bg_bot_button_green;
            } else if (i6 == 4) {
                i2 = R.drawable.vkim_bg_bot_button_red;
            } else {
                if (i6 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.drawable.vkui_bg_button_vkpay;
            }
            e3m.a aVar = e3m.a;
            a = m33.a(i2, context2);
        } else if (z) {
            Context context3 = view.getContext();
            e3m.a aVar2 = e3m.a;
            a = m33.a(R.drawable.vkim_bot_button_bg_alternate, context3);
        } else {
            Context context4 = view.getContext();
            e3m.a aVar3 = e3m.a;
            a = m33.a(R.drawable.vkim_bot_button_bg, context4);
        }
        view.setBackground(a);
        jjc.g(y28Var2.itemView, new x28(b38Var, botButton, i, i5));
        if (botButton instanceof BotButton.a) {
            boolean r2 = ((BotButton.a) botButton).r2();
            boolean z4 = !r2;
            bwt0.p0(tintTextView, z4);
            bwt0.p0(y28Var2.p, r2);
            y28Var2.itemView.setEnabled(z4);
            y28Var2.itemView.setAlpha(!r2 ? 1.0f : 0.64f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final y28 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new y28(this.c.inflate(R.layout.vkim_bot_button, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(y28 y28Var) {
        y28Var.itemView.setOnClickListener(null);
    }
}
