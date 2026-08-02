package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vkontakte.android.R;

/* compiled from: UserProfileClosedProfileHolder.kt */
/* loaded from: classes5.dex */
public final class pmq0 {
    public final VkLinkedText a;
    public slq0 b;

    public pmq0(VkLinkedText vkLinkedText) {
        this.a = vkLinkedText;
        vkLinkedText.setGravity(17);
    }

    public final void a(int i, int i2, int i3, gzs<s3q0> gzsVar) {
        VkLinkedText vkLinkedText = this.a;
        String string = vkLinkedText.getContext().getString(i);
        String string2 = vkLinkedText.getContext().getString(i2);
        a aVar = new a(gzsVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pzl.b(string, " · ", string2));
        int length = spannableStringBuilder.length();
        int length2 = spannableStringBuilder.length() - string2.length();
        abg0 abg0Var = dhr0.t;
        nik0.c(spannableStringBuilder, abg0Var.c(R.attr.vk_ui_vkontakte_button_tertiary_foreground), length2, length);
        spannableStringBuilder.setSpan(aVar, length2, length, 33);
        vkLinkedText.setText(spannableStringBuilder);
        vkLinkedText.setCompoundDrawablesWithIntrinsicBounds(abg0Var.b(i3, R.attr.vk_ui_icon_secondary), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* compiled from: UserProfileClosedProfileHolder.kt */
    public static final class a extends qjc {
        public final /* synthetic */ gzs<s3q0> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gzs<s3q0> gzsVar) {
            super(null);
            this.i = gzsVar;
        }

        @Override // xsna.rku0
        public final void f(Context context, View view) {
            this.i.invoke();
        }

        @Override // xsna.rku0
        public final void a(Context context, View view) {
        }
    }
}
