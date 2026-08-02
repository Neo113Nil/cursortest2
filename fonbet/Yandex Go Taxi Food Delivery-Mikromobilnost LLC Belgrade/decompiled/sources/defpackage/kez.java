package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import kotlin.a;

/* loaded from: classes2.dex */
public final class kez {
    public final me0 a;
    public final i3y b = a.a(new yow(25, this));

    public kez(me0 me0Var) {
        this.a = me0Var;
    }

    public final jzj a(jzj jzjVar, dfz dfzVar, boolean z) {
        SpannedString spannedString = jzjVar.b;
        int i = z ? spg0.plus_sdk_current_match_highlight : spg0.plus_sdk_match_highlight;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannedString);
        spannableStringBuilder.setSpan(new BackgroundColorSpan(this.a.a.getColor(i)), dfzVar.b, dfzVar.c, 17);
        return new jzj(jzjVar.a, new SpannedString(spannableStringBuilder));
    }
}
