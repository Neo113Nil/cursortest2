package xsna;

import android.text.SpannableStringBuilder;
import com.vk.common.links.LinksParserData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: LinksParserHelper.kt */
/* loaded from: classes17.dex */
public final class tdz {
    public static final bpn0 d = new bpn0(new sk4(21));
    public final com.vk.common.links.a a;
    public final om8 b;
    public final bpn0 c = new bpn0(new odm(this, 21));

    public tdz(com.vk.common.links.a aVar, om8 om8Var) {
        this.a = aVar;
        this.b = om8Var;
    }

    public static void a(ArrayList arrayList, int i, int i2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wlb wlbVar = (wlb) it.next();
            int i3 = wlbVar.a;
            if (i3 >= i) {
                wlbVar.a = i3 - i2;
                wlbVar.b -= i2;
            }
        }
    }

    public final SpannableStringBuilder b(Pattern pattern, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, ArrayList<wlb> arrayList, LinksParserData linksParserData) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Matcher matcher = pattern.matcher(spannableStringBuilder);
        int i = 0;
        int i2 = 0;
        while (matcher.find()) {
            if (!((Boolean) this.b.invoke(matcher, arrayList, Integer.valueOf(i))).booleanValue()) {
                int start = matcher.start() - i;
                int end = matcher.end() - i;
                int end2 = (matcher.end(2) - matcher.start(2)) + start;
                int i3 = end - end2;
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder, i2, matcher.start());
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder, matcher.start(2), matcher.end(2));
                i2 = matcher.end();
                int start2 = matcher.start(1);
                int end3 = matcher.end(1);
                qaz b = this.a.b(((start2 < 0 || end3 > spannableStringBuilder.length() || end3 - start2 < 0) ? "" : spannableStringBuilder.subSequence(start2, end3)).toString(), linksParserData, false);
                if (b != null) {
                    spannableStringBuilder2.setSpan(b, start, end2, 0);
                }
                a(arrayList, start, i3);
                arrayList.add(new wlb(start, end2));
                i += i3;
            }
        }
        if (i2 < matcher.regionEnd()) {
            spannableStringBuilder2.append((CharSequence) spannableStringBuilder, i2, matcher.regionEnd());
        }
        return spannableStringBuilder2;
    }
}
