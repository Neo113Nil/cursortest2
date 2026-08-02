package xsna;

import android.text.SpannableStringBuilder;
import com.vk.im.ui.formatters.linkparser.LinkType;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LinkParser.kt */
/* loaded from: classes2.dex */
public final class baz {
    public static final LinkedHashMap<LinkType, ij90> d;
    public final int a;
    public final cvk b;
    public final LinkedHashMap<LinkType, ij90> c;

    static {
        LinkedHashMap<LinkType, ij90> linkedHashMap = new LinkedHashMap<>();
        d = linkedHashMap;
        linkedHashMap.put(LinkType.MENTION_PERSON, new pj90());
        linkedHashMap.put(LinkType.MENTION_LINK, new oj90());
        linkedHashMap.put(LinkType.EMAIL, new mj90());
        linkedHashMap.put(LinkType.URL, new uj90());
        linkedHashMap.put(LinkType.TEL, new tj90());
        linkedHashMap.put(LinkType.HASHTAG, new nj90());
        linkedHashMap.put(LinkType.NUMBERS, new rj90());
        linkedHashMap.put(LinkType.PHONE, new sj90());
    }

    public baz() {
        this(0);
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, ohl[] ohlVarArr) {
        for (ohl ohlVar : ohlVarArr) {
            int spanStart = spannableStringBuilder.getSpanStart(ohlVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(ohlVar);
            if (spanEnd - spanStart > i) {
                int spanFlags = spannableStringBuilder.getSpanFlags(ohlVar);
                CharSequence subSequence = spannableStringBuilder.subSequence(spanStart, spanEnd);
                StringBuilder sb = new StringBuilder();
                sb.append((Object) subSequence.subSequence(0, i));
                sb.append((char) 8230);
                String sb2 = sb.toString();
                spannableStringBuilder.replace(spanStart, spanEnd, (CharSequence) sb2);
                spannableStringBuilder.removeSpan(ohlVar);
                spannableStringBuilder.setSpan(ohlVar, spanStart, sb2.length() + spanStart, spanFlags);
            }
        }
    }

    public final boolean a(CharSequence charSequence) {
        if (charSequence.length() <= 0) {
            return false;
        }
        LinkedHashMap<LinkType, ij90> linkedHashMap = this.c;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<LinkType, ij90>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().a(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ baz(int i) {
        this(rl3.u0(LinkType.values()));
    }

    public baz(Collection<? extends LinkType> collection) {
        this.a = 40;
        this.b = new cvk();
        LinkedHashMap<LinkType, ij90> linkedHashMap = new LinkedHashMap<>(d);
        p4g.o(collection, linkedHashMap);
        this.c = linkedHashMap;
    }
}
