package xsna;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.LinksParserData;
import com.vk.dto.user.ObsceneTextFilter;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.uij0;

/* compiled from: ParsedText.kt */
/* loaded from: classes18.dex */
public final class ej90 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;

    /* compiled from: ParsedText.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [xsna.sdz] */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r5v6, types: [android.text.SpannableStringBuilder] */
        /* JADX WARN: Type inference failed for: r5v9 */
        public static ej90 a(String str, b bVar, c cVar) {
            ?? r5;
            LinksParserData linksParserData = new LinksParserData(bVar.f, bVar.a, 0, 0, (String) null, (String) null, 0, 0, bVar.i, (saz) null, bVar.g, bVar.h, bVar.d == ObsceneTextFilter.ENABLED, 1788);
            vdz vdzVar = new vdz(0);
            ucp ucpVar = ucp.a;
            CharSequence i = ucp.i(xwk.d().a().o(str, linksParserData, vdzVar));
            cVar.a = vdzVar.a;
            zg90 zg90Var = bVar.e;
            if (zg90Var != null) {
                int i2 = zg90Var.a;
                r5 = i instanceof SpannableStringBuilder ? (SpannableStringBuilder) i : new SpannableStringBuilder(i);
                boolean z = false;
                boolean z2 = false;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < r5.length(); i5++) {
                    char charAt = r5.charAt(i5);
                    if (z) {
                        if (charAt == '\n') {
                            i4 = i5 + 1;
                            z2 = true;
                        } else if (charAt != ' ' && charAt != '\t' && charAt != '\r') {
                            if (z && z2) {
                                r5.setSpan(new ipk0(i2), i3, i4, 0);
                            }
                            z = false;
                            z2 = false;
                        }
                    } else if (charAt == '\n') {
                        z2 = false;
                        i3 = i5 + 1;
                        z = true;
                    }
                }
                if (z && z2) {
                    r5.setSpan(new ipk0(i2), i3, i4, 0);
                }
            } else {
                r5 = i;
            }
            return new ej90(i, xwk.d().a().i(r5, bVar.c, bVar.b), n420.b(str));
        }

        public static /* synthetic */ ej90 b(String str, b bVar, int i) {
            if ((i & 2) != 0) {
                bVar = new b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, 0, 0, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            }
            return a(str, bVar, new c(0));
        }

        public static void c(SpannableStringBuilder spannableStringBuilder) {
            int length = spannableStringBuilder.length();
            for (Object obj : spannableStringBuilder.getSpans(0, length, Object.class)) {
                qaz qazVar = obj instanceof qaz ? (qaz) obj : null;
                if (qazVar != null) {
                    int spanStart = spannableStringBuilder.getSpanStart(qazVar);
                    int spanEnd = spannableStringBuilder.getSpanEnd(qazVar);
                    int spanFlags = spannableStringBuilder.getSpanFlags(qazVar);
                    int g = swe0.g(spanStart, 0, length);
                    int g2 = swe0.g(spanEnd, 0, length);
                    spannableStringBuilder.removeSpan(qazVar);
                    int i = qjc.h;
                    spannableStringBuilder.setSpan(qazVar.clone(), g, g2, spanFlags);
                }
            }
        }
    }

    /* compiled from: ParsedText.kt */
    public static class b {
        public final Bundle a;
        public final float b;
        public final uij0 c;
        public final ObsceneTextFilter d;
        public final zg90 e;
        public final int f;
        public final int g;
        public final taz h;
        public final LinksParserData.HashtagService i;

        public b(Bundle bundle, float f, uij0 uij0Var, ObsceneTextFilter obsceneTextFilter, zg90 zg90Var, int i, int i2, taz tazVar, LinksParserData.HashtagService hashtagService, int i3) {
            bundle = (i3 & 1) != 0 ? null : bundle;
            f = (i3 & 2) != 0 ? 1.0f : f;
            uij0Var = (i3 & 4) != 0 ? uij0.a.a : uij0Var;
            obsceneTextFilter = (i3 & 8) != 0 ? ObsceneTextFilter.UNAVAILABLE : obsceneTextFilter;
            zg90Var = (i3 & 16) != 0 ? null : zg90Var;
            i = (i3 & 32) != 0 ? 43787 : i;
            i2 = (i3 & 64) != 0 ? 0 : i2;
            tazVar = (i3 & 128) != 0 ? null : tazVar;
            hashtagService = (i3 & 256) != 0 ? LinksParserData.HashtagService.Posts : hashtagService;
            this.a = bundle;
            this.b = f;
            this.c = uij0Var;
            this.d = obsceneTextFilter;
            this.e = zg90Var;
            this.f = i;
            this.g = i2;
            this.h = tazVar;
            this.i = hashtagService;
        }
    }

    /* compiled from: ParsedText.kt */
    public static final class c {
        public boolean a = false;

        public c(int i) {
        }
    }

    /* compiled from: ParsedText.kt */
    public static final class d extends b {
        public d(uij0 uij0Var, ObsceneTextFilter obsceneTextFilter, int i, int i2, taz tazVar, LinksParserData.HashtagService hashtagService) {
            super(null, 1.0f, uij0Var, obsceneTextFilter, null, i, i2, tazVar, hashtagService, 16);
        }
    }

    public ej90(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
    }

    public final ej90 a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a);
        a.c(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.b);
        a.c(spannableStringBuilder2);
        return new ej90(spannableStringBuilder, spannableStringBuilder2, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej90)) {
            return false;
        }
        ej90 ej90Var = (ej90) obj;
        return epx.f(this.a, ej90Var.a) && epx.f(this.b, ej90Var.b) && epx.f(this.c, ej90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u11.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParsedText(text=");
        sb.append((Object) this.a);
        sb.append(", excerpt=");
        sb.append((Object) this.b);
        sb.append(", stripped=");
        return thl0.a(sb, this.c, ')');
    }
}
