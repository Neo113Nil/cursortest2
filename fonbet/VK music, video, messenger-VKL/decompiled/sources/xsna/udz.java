package xsna;

import android.content.Context;
import android.os.Bundle;
import android.text.Annotation;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.common.links.AwayLink;
import com.vk.common.links.LinksParserData;
import com.vk.common.links.a;
import com.vk.dto.specials.SpecialEvent;
import com.vk.dto.specials.SpecialEvents;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.qjc;
import xsna.uij0;

/* compiled from: LinksParserImpl.kt */
/* loaded from: classes17.dex */
public final class udz implements sdz {
    public final Context a;
    public final tdz b;

    public udz(Context context, com.vk.common.links.a aVar) {
        this.a = context;
        this.b = new tdz(aVar, new om8(3, this, udz.class, "intersects", "intersects(Ljava/util/regex/MatchResult;Ljava/util/ArrayList;I)Z", 0));
    }

    public final CharSequence a(CharSequence charSequence, uij0 uij0Var, float f, i68 i68Var) {
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        int length = charSequence.length();
        int i = 1;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (charSequence.charAt(i3) == '\n') {
                i++;
            }
            if (i2 == -1 && i > 5) {
                i2 = i3;
            }
            if (i >= 10) {
                break;
            }
        }
        if (i < 10) {
            i2 = -1;
        }
        int abs = Math.abs(an10.b(PsExtractor.VIDEO_STREAM_MASK * f));
        int i4 = abs * 2;
        if (length > i4 && (i2 == -1 || i2 > i4)) {
            for (int i5 = abs; -1 < i5; i5--) {
                char charAt = charSequence.charAt(i5);
                if (charAt == 10240 || Character.isWhitespace(charAt)) {
                    i2 = i5;
                    break;
                }
            }
            i2 = Math.min(i2, i4);
            if (i2 == -1) {
                i2 = abs;
            }
        }
        if (i2 == -1) {
            return charSequence;
        }
        for (int i6 = i2 - 1; -1 < i6; i6--) {
            char charAt2 = charSequence.charAt(i6);
            if (charAt2 != 10240 && !Character.isWhitespace(charAt2)) {
                break;
            }
            i2--;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, 0, i2);
        if (!(uij0Var instanceof uij0.c) && i2 == i4) {
            spannableStringBuilder.append((CharSequence) "...");
        }
        if (uij0Var instanceof uij0.a) {
            String string = this.a.getString(R.string.link_show_full);
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) string);
            int length2 = spannableStringBuilder.length() - string.length();
            int length3 = spannableStringBuilder.length();
            x7q x7qVar = new x7q();
            if (i68Var != null) {
                x7qVar.m = i68Var;
            }
            spannableStringBuilder.setSpan(x7qVar, length2, length3, 0);
        }
        return spannableStringBuilder;
    }

    @Override // xsna.sdz
    public final CharSequence d(CharSequence charSequence, LinksParserData linksParserData) {
        return o(charSequence, linksParserData, new vdz(0));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sdz
    public final boolean e(String str) {
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((Pattern) eaz.o.getValue()).matcher(str);
        return matcher.find() && matcher.start() == 0 && matcher.end() == str.length();
    }

    @Override // xsna.sdz
    public final CharSequence f(CharSequence charSequence, float f) {
        return a(charSequence, uij0.a.a, f, null);
    }

    @Override // xsna.sdz
    public final boolean g(CharSequence charSequence) {
        int i;
        if (charSequence.length() == 0) {
            return false;
        }
        Matcher matcher = eaz.d().matcher(charSequence);
        return matcher.find() && (i = crx0.i(matcher)) != -1 && matcher.start(i) == 0 && crx0.h(matcher, i) == charSequence.length();
    }

    @Override // xsna.sdz
    public final CharSequence h(CharSequence charSequence) {
        return a(charSequence, uij0.a.a, 1.0f, null);
    }

    @Override // xsna.sdz
    public final CharSequence i(CharSequence charSequence, uij0 uij0Var, float f) {
        return a(charSequence, uij0Var, f, null);
    }

    @Override // xsna.sdz
    public final boolean j(MatchResult matchResult, ArrayList<wlb> arrayList, int i) {
        int start = matchResult.start() - i;
        int end = (matchResult.end() - 1) - i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wlb wlbVar = arrayList.get(i2);
            int i3 = wlbVar.a;
            boolean z = start >= i3 && start <= wlbVar.b;
            boolean z2 = end >= i3 && end <= wlbVar.b;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.sdz
    public final String k(CharSequence charSequence) {
        String group;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = eaz.d().matcher(charSequence);
        if (matcher.find() && (group = matcher.group(1)) != null) {
            return brm0.v(group, ".", false) ? qoy.c(1, 0, group) : group;
        }
        return null;
    }

    @Override // xsna.sdz
    public final CharSequence l(CharSequence charSequence, uij0 uij0Var, i68 i68Var) {
        return a(charSequence, uij0Var, 1.0f, i68Var);
    }

    @Override // xsna.sdz
    public final CharSequence m(CharSequence charSequence) {
        return d(charSequence, new LinksParserData(0, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16383));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sdz
    public final boolean n(String str) {
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((Pattern) eaz.l.getValue()).matcher(str);
        return matcher.find() && matcher.start() == 0 && matcher.end() == str.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0269  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [android.text.Editable] */
    /* JADX WARN: Type inference failed for: r0v42, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, xsna.pvu] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v20, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r5v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v87, types: [xsna.bp4] */
    /* JADX WARN: Type inference failed for: r8v59, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence o(CharSequence charSequence, LinksParserData linksParserData, vdz vdzVar) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        SpannableStringBuilder spannableStringBuilder2;
        String str2;
        SpannableStringBuilder spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder4;
        CharSequence charSequence2;
        final LinksParserData linksParserData2;
        ?? r0;
        spa spaVar;
        int i;
        String str3;
        qaz qazVar;
        Iterator it;
        int i2;
        tdz tdzVar;
        Matcher matcher;
        ArrayList<SpecialEvent> arrayList;
        Object obj;
        a.C0719a c0719a;
        int i3 = 0;
        String str4 = "";
        if (charSequence == null) {
            return "";
        }
        int i4 = linksParserData.a;
        ArrayList<wlb> arrayList2 = new ArrayList<>();
        String str5 = "censored";
        int i5 = 2;
        ?? r15 = 1;
        if ((i4 & 8192) > 0) {
            this.b.getClass();
            arrayList2.isEmpty();
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
            Matcher matcher2 = ((Pattern) eaz.m.getValue()).matcher(charSequence);
            ?? bp4Var = new bp4(matcher2, charSequence);
            int i6 = 0;
            while (matcher2.find()) {
                vdzVar.a = r15;
                int e = bp4Var.e(i3);
                int start = matcher2.start() - i6;
                int e2 = bp4Var.e(r15) + start;
                bp4Var.a(spannableStringBuilder5, r15);
                if (linksParserData.n) {
                    spannableStringBuilder5.setSpan(new Annotation("censored", bp4Var.d(i5).toString()), start, e2, 0);
                }
                i6 = (e - bp4Var.e(1)) + i6;
                i3 = 0;
                i5 = 2;
                r15 = 1;
            }
            bp4Var.b(spannableStringBuilder5);
            spannableStringBuilder = spannableStringBuilder5;
        } else {
            spannableStringBuilder = null;
        }
        if ((32768 & i4) > 0) {
            tdz tdzVar2 = this.b;
            tdzVar2.getClass();
            CharSequence charSequence3 = spannableStringBuilder;
            if (spannableStringBuilder == null) {
                charSequence3 = charSequence;
            }
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
            Matcher matcher3 = ((Pattern) eaz.n.getValue()).matcher(charSequence3);
            int i7 = 0;
            int i8 = 0;
            while (matcher3.find()) {
                if (!((Boolean) tdzVar2.b.invoke(matcher3, arrayList2, Integer.valueOf(i7))).booleanValue()) {
                    int start2 = matcher3.start() - i7;
                    int end = matcher3.end() - i7;
                    int i9 = i7;
                    int end2 = (matcher3.end(1) - matcher3.start(1)) + start2;
                    int i10 = end - end2;
                    String str6 = str5;
                    spannableStringBuilder6.append(charSequence3, i8, matcher3.start());
                    spannableStringBuilder6.append(charSequence3, matcher3.start(1), matcher3.end(1));
                    int end3 = matcher3.end();
                    com.vk.common.links.a aVar = tdzVar2.a;
                    tdz tdzVar3 = tdzVar2;
                    int start3 = matcher3.start(2);
                    int end4 = matcher3.end(2);
                    qaz b = aVar.b(((start3 < 0 || end4 > charSequence3.length() || end4 - start3 < 0) ? "" : charSequence3.subSequence(start3, end4)).toString(), linksParserData, false);
                    if (b != null) {
                        spannableStringBuilder6.setSpan(b, start2, end2, 0);
                    }
                    tdz.a(arrayList2, start2, i10);
                    arrayList2.add(new wlb(start2, end2));
                    i7 = i9 + i10;
                    tdzVar2 = tdzVar3;
                    str5 = str6;
                    i8 = end3;
                }
            }
            str = str5;
            if (i8 < matcher3.regionEnd()) {
                spannableStringBuilder6.append(charSequence3, i8, matcher3.regionEnd());
            }
            spannableStringBuilder2 = spannableStringBuilder6;
        } else {
            str = "censored";
            spannableStringBuilder2 = spannableStringBuilder;
        }
        this.b.getClass();
        CharSequence charSequence4 = spannableStringBuilder2;
        if (spannableStringBuilder2 == null) {
            charSequence4 = charSequence;
        }
        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
        Matcher matcher4 = ((Pattern) tdz.d.getValue()).matcher(charSequence4);
        int i11 = 0;
        int i12 = 0;
        while (matcher4.find()) {
            int start4 = matcher4.start() - i11;
            int end5 = (matcher4.end() - i11) - ((matcher4.end(0) - matcher4.start(0)) + start4);
            spannableStringBuilder7.append(charSequence4, i12, matcher4.start());
            spannableStringBuilder7.append((CharSequence) "");
            i12 = matcher4.end();
            tdz.a(arrayList2, start4, end5);
            i11 += end5;
        }
        if (i12 < matcher4.regionEnd()) {
            spannableStringBuilder7.append(charSequence4, i12, matcher4.regionEnd());
        }
        SpannableStringBuilder spannableStringBuilder8 = spannableStringBuilder7;
        if ((i4 & 512) > 0) {
            tdz tdzVar4 = this.b;
            tdzVar4.getClass();
            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
            Matcher matcher5 = eaz.a().matcher(spannableStringBuilder7);
            bp4 bp4Var2 = new bp4(matcher5, spannableStringBuilder7);
            int i13 = 0;
            while (matcher5.find()) {
                if (!((Boolean) tdzVar4.b.invoke(matcher5, arrayList2, Integer.valueOf(i13))).booleanValue()) {
                    int start5 = matcher5.start() - i13;
                    int end6 = matcher5.end() - i13;
                    int e3 = bp4Var2.e(2) + start5;
                    int i14 = end6 - e3;
                    bp4Var2.a(spannableStringBuilder9, 2);
                    com.vk.common.links.a aVar2 = tdzVar4.a;
                    String obj2 = bp4Var2.d(1).toString();
                    if (obj2 == null) {
                        i2 = i13;
                        tdzVar = tdzVar4;
                        matcher = matcher5;
                    } else {
                        i2 = i13;
                        String A = brm0.A(obj2, "event#", "");
                        fjk0 fjk0Var = aVar2.a;
                        AtomicBoolean atomicBoolean = (AtomicBoolean) fjk0Var.a;
                        if (atomicBoolean.get()) {
                            tdzVar = tdzVar4;
                            matcher = matcher5;
                        } else {
                            tdzVar = tdzVar4;
                            matcher = matcher5;
                            fjk0Var.b = (SpecialEvents) itg0.e(wmi0.a.h("special_events"));
                            atomicBoolean.set(true);
                        }
                        SpecialEvents specialEvents = (SpecialEvents) fjk0Var.b;
                        if (specialEvents != null && (arrayList = specialEvents.b) != null) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (epx.f(((SpecialEvent) obj).b, A)) {
                                    break;
                                }
                            }
                            SpecialEvent specialEvent = (SpecialEvent) obj;
                            if (specialEvent != null) {
                                c0719a = new a.C0719a(specialEvent);
                                if (c0719a != null) {
                                    spannableStringBuilder9.setSpan(c0719a, start5, e3, 0);
                                }
                                tdz.a(arrayList2, start5, i14);
                                arrayList2.add(new wlb(start5, e3));
                                i13 = (bp4Var2.e(0) - bp4Var2.e(2)) + i2;
                                tdzVar4 = tdzVar;
                                matcher5 = matcher;
                            }
                        }
                    }
                    c0719a = null;
                    if (c0719a != null) {
                    }
                    tdz.a(arrayList2, start5, i14);
                    arrayList2.add(new wlb(start5, e3));
                    i13 = (bp4Var2.e(0) - bp4Var2.e(2)) + i2;
                    tdzVar4 = tdzVar;
                    matcher5 = matcher;
                }
            }
            bp4Var2.b(spannableStringBuilder9);
            spannableStringBuilder8 = spannableStringBuilder9;
        }
        SpannableStringBuilder spannableStringBuilder10 = spannableStringBuilder8;
        if ((i4 & 4) > 0) {
            tdz tdzVar5 = this.b;
            tdzVar5.getClass();
            SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder();
            Matcher matcher6 = ((Pattern) eaz.d.getValue()).matcher(spannableStringBuilder8);
            bp4 bp4Var3 = new bp4(matcher6, spannableStringBuilder8);
            int i15 = 0;
            while (matcher6.find()) {
                if (!((Boolean) tdzVar5.b.invoke(matcher6, arrayList2, Integer.valueOf(i15))).booleanValue()) {
                    int start6 = matcher6.start() - i15;
                    int end7 = matcher6.end() - i15;
                    int e4 = bp4Var3.e(2) + start6;
                    int i16 = end7 - e4;
                    bp4Var3.a(spannableStringBuilder11, 2);
                    com.vk.common.links.a aVar3 = tdzVar5.a;
                    int i17 = i15;
                    qaz b2 = aVar3.b(aVar3.c(bp4Var3.d(1).toString()), linksParserData, true);
                    if (b2 != null) {
                        spannableStringBuilder11.setSpan(b2, start6, e4, 0);
                    }
                    tdz.a(arrayList2, start6, i16);
                    arrayList2.add(new wlb(start6, e4));
                    i15 = (bp4Var3.e(0) - bp4Var3.e(2)) + i17;
                }
            }
            bp4Var3.b(spannableStringBuilder11);
            spannableStringBuilder10 = spannableStringBuilder11;
        }
        if ((i4 & 2) > 0) {
            tdz tdzVar6 = this.b;
            tdzVar6.getClass();
            SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder();
            Matcher matcher7 = eaz.c().matcher(spannableStringBuilder10);
            int i18 = 0;
            int i19 = 0;
            while (matcher7.find()) {
                if (!((Boolean) tdzVar6.b.invoke(matcher7, arrayList2, Integer.valueOf(i18))).booleanValue()) {
                    int start7 = matcher7.start() - i18;
                    int end8 = matcher7.end() - i18;
                    int end9 = (matcher7.end(2) - matcher7.start(2)) + start7;
                    int i20 = end8 - end9;
                    int i21 = i18;
                    spannableStringBuilder12.append((CharSequence) spannableStringBuilder10, i19, matcher7.start());
                    String str7 = str4;
                    spannableStringBuilder12.append((CharSequence) spannableStringBuilder10, matcher7.start(2), matcher7.end(2));
                    int end10 = matcher7.end();
                    int start8 = matcher7.start(1);
                    int end11 = matcher7.end(1);
                    String obj3 = ((start8 < 0 || end11 > spannableStringBuilder10.length() || end11 - start8 < 0) ? str7 : spannableStringBuilder10.subSequence(start8, end11)).toString();
                    String c = tdzVar6.a.c(obj3);
                    StringBuilder sb = new StringBuilder("https://");
                    tdz tdzVar7 = tdzVar6;
                    sb.append(a0a.d);
                    sb.append('/');
                    sb.append(obj3);
                    r320 r320Var = new r320(c, sb.toString(), linksParserData.b);
                    r320Var.i = linksParserData.j;
                    r320Var.j = linksParserData.k;
                    int i22 = linksParserData.c;
                    if (i22 != 0) {
                        r320Var.c(i22);
                    } else {
                        int i23 = linksParserData.d;
                        if (i23 != 0) {
                            r320Var.b(i23);
                        }
                    }
                    spannableStringBuilder12.setSpan(r320Var, start7, end9, 0);
                    tdz.a(arrayList2, start7, i20);
                    arrayList2.add(new wlb(start7, end9));
                    i18 = i21 + i20;
                    str4 = str7;
                    i19 = end10;
                    tdzVar6 = tdzVar7;
                }
            }
            str2 = str4;
            if (i19 < matcher7.regionEnd()) {
                spannableStringBuilder12.append((CharSequence) spannableStringBuilder10, i19, matcher7.regionEnd());
            }
            spannableStringBuilder3 = spannableStringBuilder12;
        } else {
            str2 = "";
            spannableStringBuilder3 = spannableStringBuilder10;
        }
        SpannableStringBuilder spannableStringBuilder13 = spannableStringBuilder3;
        if ((i4 & 16384) > 0) {
            tdz tdzVar8 = this.b;
            tdzVar8.getClass();
            SpannableStringBuilder spannableStringBuilder14 = new SpannableStringBuilder();
            Matcher matcher8 = ((Pattern) eaz.p.getValue()).matcher(spannableStringBuilder3);
            bp4 bp4Var4 = new bp4(matcher8, spannableStringBuilder3);
            int i24 = 0;
            while (matcher8.find()) {
                if (!((Boolean) tdzVar8.b.invoke(matcher8, arrayList2, Integer.valueOf(i24))).booleanValue()) {
                    int i25 = bp4Var4.e(2) < 1 ? 1 : 2;
                    int start9 = matcher8.start() - i24;
                    int end12 = matcher8.end() - i24;
                    int e5 = bp4Var4.e(i25) + start9;
                    int i26 = end12 - e5;
                    bp4Var4.a(spannableStringBuilder14, i25);
                    String obj4 = bp4Var4.d(1).toString();
                    String c2 = tdzVar8.a.c(obj4);
                    int i27 = i24;
                    StringBuilder sb2 = new StringBuilder("https://");
                    tdz tdzVar9 = tdzVar8;
                    sb2.append(a0a.d);
                    sb2.append('/');
                    sb2.append(obj4);
                    r320 r320Var2 = new r320(c2, sb2.toString(), linksParserData.b);
                    r320Var2.i = linksParserData.j;
                    r320Var2.j = linksParserData.k;
                    int i28 = linksParserData.c;
                    if (i28 != 0) {
                        r320Var2.c(i28);
                    } else {
                        int i29 = linksParserData.d;
                        if (i29 != 0) {
                            r320Var2.b(i29);
                        }
                    }
                    spannableStringBuilder14.setSpan(r320Var2, start9, e5, 0);
                    tdz.a(arrayList2, start9, i26);
                    arrayList2.add(new wlb(start9, e5));
                    i24 = i27 + i26;
                    tdzVar8 = tdzVar9;
                }
            }
            bp4Var4.b(spannableStringBuilder14);
            spannableStringBuilder13 = spannableStringBuilder14;
        }
        tdz tdzVar10 = this.b;
        tdzVar10.getClass();
        SpannableStringBuilder spannableStringBuilder15 = new SpannableStringBuilder();
        Matcher f = yjo0.f();
        f.reset(spannableStringBuilder13);
        int i30 = 0;
        int i31 = 0;
        while (f.find()) {
            if (!((Boolean) tdzVar10.b.invoke(f, arrayList2, Integer.valueOf(i30))).booleanValue()) {
                int start10 = f.start() - i30;
                int end13 = f.end() - i30;
                int end14 = (f.end(2) - f.start(2)) + start10;
                int i32 = end13 - end14;
                spannableStringBuilder15.append((CharSequence) spannableStringBuilder13, i31, f.start());
                spannableStringBuilder15.append((CharSequence) spannableStringBuilder13, f.start(2), f.end(2));
                i31 = f.end();
                com.vk.common.links.a aVar4 = tdzVar10.a;
                tdz tdzVar11 = tdzVar10;
                int start11 = f.start(1);
                int i33 = i30;
                int end15 = f.end(1);
                qaz b3 = aVar4.b(((start11 < 0 || end15 > spannableStringBuilder13.length() || end15 - start11 < 0) ? str2 : spannableStringBuilder13.subSequence(start11, end15)).toString(), linksParserData, false);
                if (b3 != null) {
                    spannableStringBuilder15.setSpan(b3, start10, end14, 0);
                }
                tdz.a(arrayList2, start10, i32);
                arrayList2.add(new wlb(start10, end14));
                i30 = i33 + i32;
                tdzVar10 = tdzVar11;
            }
        }
        if (i31 < f.regionEnd()) {
            spannableStringBuilder15.append((CharSequence) spannableStringBuilder13, i31, f.regionEnd());
        }
        if ((i4 & 64) > 0) {
            tdz tdzVar12 = this.b;
            tdzVar12.getClass();
            SpannableStringBuilder spannableStringBuilder16 = new SpannableStringBuilder();
            Matcher matcher9 = ((Pattern) eaz.i.getValue()).matcher(spannableStringBuilder15);
            int i34 = 0;
            int i35 = 0;
            while (matcher9.find()) {
                if (!((Boolean) tdzVar12.b.invoke(matcher9, arrayList2, Integer.valueOf(i34))).booleanValue()) {
                    int start12 = matcher9.start() - i34;
                    int end16 = matcher9.end() - i34;
                    int end17 = (matcher9.end(2) - matcher9.start(2)) + start12;
                    int i36 = end16 - end17;
                    spannableStringBuilder16.append((CharSequence) spannableStringBuilder15, i35, matcher9.start());
                    spannableStringBuilder16.append((CharSequence) spannableStringBuilder15, matcher9.start(2), matcher9.end(2));
                    i35 = matcher9.end();
                    com.vk.common.links.a aVar5 = tdzVar12.a;
                    tdz tdzVar13 = tdzVar12;
                    int start13 = matcher9.start(1);
                    int i37 = i34;
                    int end18 = matcher9.end(1);
                    qaz b4 = aVar5.b(((start13 < 0 || end18 > spannableStringBuilder15.length() || end18 - start13 < 0) ? str2 : spannableStringBuilder15.subSequence(start13, end18)).toString(), linksParserData, true);
                    if (b4 != null) {
                        spannableStringBuilder16.setSpan(b4, start12, end17, 0);
                    }
                    tdz.a(arrayList2, start12, i36);
                    arrayList2.add(new wlb(start12, end17));
                    i34 = i37 + i36;
                    tdzVar12 = tdzVar13;
                }
            }
            if (i35 < matcher9.regionEnd()) {
                spannableStringBuilder16.append((CharSequence) spannableStringBuilder15, i35, matcher9.regionEnd());
            }
            spannableStringBuilder4 = spannableStringBuilder16;
        } else {
            spannableStringBuilder4 = spannableStringBuilder15;
        }
        if ((i4 & 32) > 0) {
            spannableStringBuilder4 = this.b.b((Pattern) eaz.h.getValue(), charSequence, spannableStringBuilder4, arrayList2, linksParserData);
        }
        if ((i4 & 1024) > 0) {
            charSequence2 = charSequence;
            linksParserData2 = linksParserData;
            r0 = this.b.b((Pattern) eaz.k.getValue(), charSequence2, spannableStringBuilder4, arrayList2, linksParserData2);
        } else {
            charSequence2 = charSequence;
            linksParserData2 = linksParserData;
            r0 = spannableStringBuilder4;
        }
        if ((i4 & 8) > 0) {
            ?? r2 = (pvu) this.b.c.getValue();
            r2.getClass();
            Matcher matcher10 = eaz.b().matcher(r0 != null ? r0 : charSequence2);
            while (matcher10.find()) {
                if (!((Boolean) r2.b.invoke(matcher10, arrayList2, 0)).booleanValue()) {
                    if (r0 == null) {
                        r0 = new SpannableStringBuilder(charSequence2);
                    }
                    r2.a(r0, matcher10, arrayList2, linksParserData2);
                }
            }
        }
        if ((i4 & 2048) > 0) {
            tdz tdzVar14 = this.b;
            tdzVar14.getClass();
            Matcher matcher11 = ((Pattern) eaz.l.getValue()).matcher(r0 != null ? r0 : charSequence2);
            while (matcher11.find()) {
                if (!((Boolean) tdzVar14.b.invoke(matcher11, arrayList2, 0)).booleanValue()) {
                    if (r0 == null) {
                        r0 = new SpannableStringBuilder(charSequence2);
                    }
                    String group = matcher11.group(0);
                    int start14 = matcher11.start();
                    int end19 = matcher11.end();
                    icp icpVar = group != null ? new icp(group) : null;
                    if (icpVar != null) {
                        r0.setSpan(icpVar, start14, end19, 0);
                        arrayList2.add(new wlb(start14, end19));
                    }
                }
            }
        }
        if ((i4 & 1) > 0) {
            tdz tdzVar15 = this.b;
            tdzVar15.getClass();
            if (r0 == null) {
                r0 = new SpannableStringBuilder(charSequence2);
            }
            Matcher matcher12 = eaz.d().matcher(r0);
            ArrayList arrayList3 = new ArrayList();
            th50 th50Var = new th50();
            int i38 = 0;
            while (matcher12.find(i38)) {
                int i39 = crx0.i(matcher12);
                if (i39 != -1) {
                    int start15 = matcher12.start(i39);
                    i38 = crx0.h(matcher12, i39);
                    th50Var.a = start15;
                    th50Var.b = (i38 - start15) + start15;
                    if (!((Boolean) tdzVar15.b.invoke(th50Var, arrayList2, 0)).booleanValue() && (start15 <= 0 || r0.charAt(start15 - 1) != '@')) {
                        qaz b5 = tdzVar15.a.b(r0.subSequence(start15, i38).toString(), linksParserData2, false);
                        if (b5 != null) {
                            r0.setSpan(b5, start15, i38, 0);
                            arrayList3.add(b5);
                        }
                    }
                } else {
                    i38 = matcher12.end();
                }
            }
            SpannableStringBuilder spannableStringBuilder17 = new SpannableStringBuilder();
            Iterator it3 = arrayList3.iterator();
            int i40 = 0;
            int i41 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int spanStart = r0.getSpanStart(next);
                int spanEnd = r0.getSpanEnd(next);
                int i42 = spanEnd - spanStart;
                if (i42 > 40) {
                    int spanFlags = r0.getSpanFlags(next);
                    it = it3;
                    CharSequence subSequence = r0.subSequence(spanStart, spanEnd);
                    r0.removeSpan(next);
                    int i43 = i41;
                    CharSequence subSequence2 = subSequence.subSequence(0, 40);
                    spannableStringBuilder17.append(r0.subSequence(i40, spanStart));
                    spannableStringBuilder17.append(subSequence2);
                    spannableStringBuilder17.append((CharSequence) "…");
                    int length = subSequence2.length() + 1;
                    int i44 = spanStart - i43;
                    int i45 = i44 + length;
                    spannableStringBuilder17.setSpan(next, i44, i45, spanFlags);
                    int i46 = i42 - length;
                    tdz.a(arrayList2, i44, i46);
                    arrayList2.add(new wlb(i44, i45));
                    i41 = i43 + i46;
                    i40 = spanEnd;
                } else {
                    it = it3;
                    int i47 = i41;
                    arrayList2.add(new wlb(spanStart - i47, spanEnd - i47));
                }
                it3 = it;
            }
            if (i40 < r0.length()) {
                spannableStringBuilder17.append(r0.subSequence(i40, r0.length()));
            }
            r0 = spannableStringBuilder17;
        }
        SpannableStringBuilder spannableStringBuilder18 = r0;
        if ((i4 & 16) > 0) {
            tdz tdzVar16 = this.b;
            tdzVar16.getClass();
            if (r0 == null) {
                r0 = charSequence2;
            }
            ?? spannableStringBuilder19 = new SpannableStringBuilder();
            Matcher matcher13 = ((Pattern) eaz.g.getValue()).matcher(r0);
            int i48 = 0;
            int i49 = 0;
            while (matcher13.find()) {
                if (!((Boolean) tdzVar16.b.invoke(matcher13, arrayList2, Integer.valueOf(i48))).booleanValue()) {
                    StyleSpan styleSpan = new StyleSpan(1);
                    int start16 = matcher13.start() - i48;
                    int end20 = matcher13.end() - i48;
                    int end21 = (matcher13.end(1) - matcher13.start(1)) + start16;
                    int i50 = end20 - end21;
                    spannableStringBuilder19.append(r0, i49, matcher13.start());
                    spannableStringBuilder19.append(r0, matcher13.start(1), matcher13.end(1));
                    i49 = matcher13.end();
                    spannableStringBuilder19.setSpan(styleSpan, start16, end21, 0);
                    tdz.a(arrayList2, start16, i50);
                    arrayList2.add(new wlb(start16, end21));
                    i48 += i50;
                    tdzVar16 = tdzVar16;
                }
            }
            if (i49 < matcher13.regionEnd()) {
                spannableStringBuilder19.append(r0, i49, matcher13.regionEnd());
            }
            spannableStringBuilder18 = spannableStringBuilder19;
        }
        if ((i4 & 128) > 0) {
            tdz tdzVar17 = this.b;
            tdzVar17.getClass();
            Matcher matcher14 = ((Pattern) eaz.j.getValue()).matcher(spannableStringBuilder18 != null ? spannableStringBuilder18 : charSequence2);
            while (matcher14.find()) {
                if (!((Boolean) tdzVar17.b.invoke(matcher14, arrayList2, 0)).booleanValue()) {
                    if (spannableStringBuilder18 == null) {
                        spannableStringBuilder18 = new SpannableStringBuilder(charSequence2);
                    }
                    String group2 = matcher14.group(1);
                    String group3 = matcher14.group(2);
                    String group4 = matcher14.group(3);
                    final int parseInt = (group2 != null ? Integer.parseInt(group2) * 3600 : 0) + (group3 != null ? Integer.parseInt(group3) * 60 : 0) + (group4 != null ? Integer.parseInt(group4) : 0);
                    if (parseInt > linksParserData2.l) {
                        qazVar = null;
                    } else {
                        qazVar = new qaz(null, null, null);
                        qazVar.c = new qjc.a() { // from class: xsna.uaz
                            @Override // xsna.qjc.a
                            public final void I(AwayLink awayLink) {
                                taz tazVar = LinksParserData.this.m;
                                if (tazVar != null) {
                                    tazVar.a(parseInt * 1000);
                                }
                            }
                        };
                        qazVar.b = true;
                    }
                    if (qazVar != null) {
                        int start17 = matcher14.start();
                        int end22 = matcher14.end();
                        spannableStringBuilder18.setSpan(qazVar, start17, end22, 0);
                        arrayList2.add(new wlb(start17, end22));
                    }
                }
            }
        }
        if ((i4 & 4096) > 0) {
            tdz tdzVar18 = this.b;
            tdzVar18.getClass();
            Matcher matcher15 = ((Pattern) eaz.o.getValue()).matcher(spannableStringBuilder18 != null ? spannableStringBuilder18 : charSequence2);
            while (matcher15.find()) {
                if (!((Boolean) tdzVar18.b.invoke(matcher15, arrayList2, 0)).booleanValue()) {
                    if (spannableStringBuilder18 == null) {
                        spannableStringBuilder18 = new SpannableStringBuilder(charSequence2);
                    }
                    String group5 = matcher15.group(0);
                    int start18 = matcher15.start();
                    int end23 = matcher15.end();
                    s3a0 s3a0Var = group5 != null ? new s3a0(group5) : null;
                    if (s3a0Var != null) {
                        spannableStringBuilder18.setSpan(s3a0Var, start18, end23, 0);
                    }
                }
            }
        }
        if (vdzVar.a && spannableStringBuilder18 != null) {
            this.b.getClass();
            if (vdzVar.a && linksParserData2.n) {
                Annotation[] annotationArr = (Annotation[]) spannableStringBuilder18.getSpans(0, spannableStringBuilder18.length(), Annotation.class);
                int i51 = 0;
                while (i51 < annotationArr.length) {
                    int i52 = i51 + 1;
                    try {
                        Annotation annotation = annotationArr[i51];
                        String str8 = str;
                        if (epx.f(annotation.getKey(), str8)) {
                            int spanStart2 = spannableStringBuilder18.getSpanStart(annotation);
                            int spanEnd2 = spannableStringBuilder18.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            if (spanEnd2 - spanStart2 == value.length()) {
                                spannableStringBuilder18.replace(spanStart2, spanEnd2, (CharSequence) value);
                                if (value.length() == 0) {
                                    spaVar = null;
                                    str3 = str2;
                                    i = 0;
                                } else {
                                    i = 0;
                                    spaVar = new spa(value, 0);
                                    str3 = str2;
                                    spaVar.n = str3;
                                    spaVar.b(R.attr.vk_ui_text_secondary);
                                }
                                if (spaVar != null) {
                                    spannableStringBuilder18.setSpan(spaVar, spanStart2, spanEnd2, i);
                                }
                                i51 = i52;
                                str2 = str3;
                                str = str8;
                            }
                        }
                        i51 = i52;
                        str = str8;
                    } catch (ArrayIndexOutOfBoundsException e6) {
                        throw new NoSuchElementException(e6.getMessage());
                    }
                }
            }
        }
        return spannableStringBuilder18 != null ? spannableStringBuilder18 : charSequence2;
    }

    @Override // xsna.sdz
    public final String p(Context context, uij0 uij0Var) {
        if (uij0Var instanceof uij0.a) {
            return context.getString(R.string.link_show_full);
        }
        if (uij0Var instanceof uij0.c) {
            return context.getString(R.string.link_show_full_compact);
        }
        return null;
    }

    @Override // xsna.sdz
    public final Spannable q(Editable editable, LinksParserData linksParserData, ArrayList arrayList) {
        char charAt;
        int i = linksParserData.a;
        ArrayList arrayList2 = new ArrayList();
        int i2 = i & 1;
        tdz tdzVar = this.b;
        if (i2 > 0) {
            tdzVar.getClass();
            Matcher matcher = eaz.d().matcher(editable);
            th50 th50Var = new th50();
            int i3 = 0;
            while (matcher.find(i3)) {
                int i4 = crx0.i(matcher);
                if (i4 != -1) {
                    int start = matcher.start(i4);
                    i3 = crx0.h(matcher, i4);
                    th50Var.a = start;
                    th50Var.b = (i3 - start) + start;
                    if (!((Boolean) tdzVar.b.invoke(th50Var, arrayList2, 0)).booleanValue() && (start <= 0 || ((charAt = editable.charAt(start - 1)) != '@' && charAt != '['))) {
                        qaz b = tdzVar.a.b(editable.subSequence(start, i3).toString(), linksParserData, false);
                        if (b != null) {
                            editable.setSpan(b, start, i3, 0);
                            arrayList.add(b);
                        }
                    }
                } else {
                    i3 = matcher.end();
                }
            }
        }
        if ((i & 8) > 0) {
            pvu pvuVar = (pvu) tdzVar.c.getValue();
            pvuVar.getClass();
            Matcher matcher2 = eaz.b().matcher(editable);
            while (matcher2.find()) {
                if (!((Boolean) pvuVar.b.invoke(matcher2, arrayList2, 0)).booleanValue()) {
                    pvuVar.a(editable, matcher2, arrayList2, linksParserData);
                }
            }
        }
        return editable;
    }
}
