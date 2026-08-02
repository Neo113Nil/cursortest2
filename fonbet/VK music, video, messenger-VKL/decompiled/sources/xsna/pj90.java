package xsna;

import android.text.SpannableStringBuilder;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.mentions.MassMentionType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ParserMention.kt */
/* loaded from: classes2.dex */
public final class pj90 implements ij90 {
    public static final Pattern a = Pattern.compile("\\[id(\\d{1,30})\\|((?s:.)+?)\\]", 0);
    public static final Pattern b = Pattern.compile("\\[club(\\d{1,30})\\|((?s:.)+?)\\]", 0);
    public static final Pattern c = Pattern.compile(rl3.Z(MassMentionType.values(), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, new y8m(21), 30));

    /* JADX WARN: Can't wrap try/catch for region: R(10:4|(1:37)(3:6|(3:8|(1:26)(5:10|(1:25)(1:13)|(1:24)(1:16)|(1:21)|20)|22)|27)|28|(1:30)|31|32|33|34|20|2) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        r6 = Long.MAX_VALUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(SpannableStringBuilder spannableStringBuilder, vaz vazVar, Pattern pattern, Peer.Type type) {
        Matcher matcher = pattern.matcher(spannableStringBuilder);
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start() + i;
            int end = matcher.end() + i;
            int i2 = end - 1;
            if (spannableStringBuilder.length() != 0) {
                for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
                    if (!(obj instanceof pvu0)) {
                        int spanStart = spannableStringBuilder.getSpanStart(obj);
                        int spanEnd = spannableStringBuilder.getSpanEnd(obj) - 1;
                        boolean z = spanStart <= start && start <= spanEnd;
                        boolean z2 = spanStart <= i2 && i2 <= spanEnd;
                        if (!z && !z2) {
                        }
                    }
                }
            }
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group2 == null) {
                group2 = "";
            }
            long j = Long.parseLong(group);
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Object c2 = vazVar.c(new x120(Peer.a.a(j, type), group2, (String) null, 12));
            spannableStringBuilder.replace(start, end, (CharSequence) group2);
            spannableStringBuilder.setSpan(c2, start, group2.length() + start, 33);
            i += group2.length() - (end - start);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, vaz vazVar, boolean z) {
        MassMentionType massMentionType;
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        c(spannableStringBuilder, vazVar, a, Peer.Type.USER);
        c(spannableStringBuilder, vazVar, b, Peer.Type.GROUP);
        if (z) {
            Matcher matcher = c.matcher(spannableStringBuilder);
            int i = 0;
            while (matcher.find()) {
                int start = matcher.start() + i;
                int end = matcher.end() + i;
                Character z0 = erm0.z0(start, spannableStringBuilder);
                Character z02 = erm0.z0(start, spannableStringBuilder);
                if (z0 != null) {
                    ro.j(z0.charValue());
                }
                if (z02 != null) {
                    ro.j(z02.charValue());
                }
                int i2 = end - 1;
                if (spannableStringBuilder.length() != 0) {
                    for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
                        if (!(obj instanceof pvu0)) {
                            int spanStart = spannableStringBuilder.getSpanStart(obj);
                            int spanEnd = spannableStringBuilder.getSpanEnd(obj) - 1;
                            boolean z2 = spanStart <= start && start <= spanEnd;
                            boolean z3 = spanStart <= i2 && i2 <= spanEnd;
                            if (!z2 && !z3) {
                            }
                        }
                    }
                }
                CharSequence subSequence = spannableStringBuilder.subSequence(start, end);
                int L = drm0.L(subSequence, '(', 0, 6);
                int L2 = drm0.L(subSequence, ')', 0, 6);
                String obj2 = subSequence.subSequence(0, 1).toString();
                String obj3 = subSequence.subSequence(1, subSequence.length()).toString();
                String a2 = fo8.a(obj2, obj3);
                if (L2 >= 0 && L >= 0 && L2 - L > 1 && !drm0.N(a2.subSequence(L, L2))) {
                    obj3 = subSequence.subSequence(1, L).toString();
                    a2 = subSequence.subSequence(L + 1, L2).toString();
                }
                String obj4 = drm0.p0(obj3).toString();
                String obj5 = drm0.p0(a2).toString();
                MassMentionType[] values = MassMentionType.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        massMentionType = null;
                        break;
                    }
                    massMentionType = values[i3];
                    if (massMentionType.h().contains(obj4)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                Object c2 = massMentionType != null ? vazVar.c(new xi10(massMentionType, obj5)) : null;
                if (c2 != null) {
                    spannableStringBuilder.replace(start, subSequence.length() + start, (CharSequence) obj5);
                    spannableStringBuilder.setSpan(c2, start, obj5.length() + start, 33);
                    i += obj5.length() - (end - start);
                }
            }
        }
    }

    @Override // xsna.ij90
    public final boolean a(CharSequence charSequence) {
        if (!myc0.f(charSequence)) {
            return false;
        }
        if (ad0.t(charSequence, "[id") || ad0.t(charSequence, "[club") || ad0.t(charSequence, "@") || ad0.t(charSequence, "*")) {
            return a.matcher(charSequence).find() || b.matcher(charSequence).find() || c.matcher(charSequence).find();
        }
        return false;
    }

    @Override // xsna.ij90
    public final void b(SpannableStringBuilder spannableStringBuilder, vaz vazVar, boolean z) {
        d(spannableStringBuilder, vazVar, true);
    }
}
