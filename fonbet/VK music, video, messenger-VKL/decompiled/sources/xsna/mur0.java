package xsna;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vk.im.ui.views.span.SpanPressableTextView;
import com.vkontakte.android.R;

/* compiled from: VhMsgServiceCustom.kt */
/* loaded from: classes2.dex */
public final class mur0 extends osr0<nur0> {
    public static final /* synthetic */ int o = 0;
    public final SpanPressableTextView m;
    public final StyleSpan n;

    public mur0(View view) {
        super(view);
        this.m = (SpanPressableTextView) view.findViewById(R.id.text);
        this.n = new StyleSpan(1);
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.Custom);
    }

    @Override // xsna.osr0
    public final /* bridge */ /* synthetic */ void V5(Object obj, pk30 pk30Var) {
        a6((nur0) obj, null);
    }

    public final void a6(nur0 nur0Var, ub80 ub80Var) {
        boolean z = nur0Var.c;
        SpanPressableTextView spanPressableTextView = this.m;
        if (z) {
            spanPressableTextView.setTextColor(e3m.f(R.attr.vk_legacy_im_service_message_text_alternate, spanPressableTextView.getContext()));
            spanPressableTextView.setBackground(m33.a(R.drawable.bg_im_system_msg, spanPressableTextView.getContext()));
        } else {
            spanPressableTextView.setTextColor(e3m.f(R.attr.vk_legacy_im_service_message_text, spanPressableTextView.getContext()));
            spanPressableTextView.setBackground(null);
        }
        spanPressableTextView.setOnSpanClickListener(ub80Var);
        CharSequence charSequence = nur0Var.d;
        if (charSequence == null) {
            charSequence = "";
        }
        Spannable spannableStringBuilder = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableStringBuilder(charSequence);
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ohl.class)) {
            ohl ohlVar = (ohl) obj;
            spannableStringBuilder.setSpan(this.n, spannableStringBuilder.getSpanStart(ohlVar), spannableStringBuilder.getSpanEnd(ohlVar), 0);
        }
        spanPressableTextView.setText(spannableStringBuilder);
    }
}
