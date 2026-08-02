package xsna;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;

/* compiled from: DomainViewHolder.kt */
/* loaded from: classes15.dex */
public final class tvn extends as6 {
    public final ViewGroup r;
    public final bpn0 s;
    public final bpn0 t;

    public tvn(ViewGroup viewGroup) {
        super(viewGroup);
        this.r = viewGroup;
        this.s = new bpn0(new d4(14));
        this.t = new bpn0(new eb(this, 29));
    }

    public final SpannableStringBuilder W5(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Number) this.t.getValue()).intValue()), str.length(), spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }
}
