package xsna;

import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.clips.sdk.shared.api.domain.MentionsParseMode;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.hl10;
import xsna.z420;

/* compiled from: ClipsDataFormatterImpl.kt */
/* loaded from: classes17.dex */
public final class yod implements ibr0 {
    public final sxy a;
    public final u04 b;

    public yod(sxy sxyVar, u04 u04Var) {
        this.a = sxyVar;
        this.b = u04Var;
    }

    @Override // xsna.xod
    public final CharSequence a(CharSequence charSequence, HashtagParseMode hashtagParseMode, MentionsParseMode mentionsParseMode, boolean z) {
        int i;
        boolean z2;
        Matcher matcher;
        Context context;
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        ucp ucpVar = ucp.a;
        sdz a = xwk.d().a();
        int i2 = hashtagParseMode != HashtagParseMode.DEFAULT ? 43779 : 43787;
        if (mentionsParseMode != MentionsParseMode.DEFAULT) {
            i2 &= -3;
        }
        int i3 = i2;
        int i4 = R.color.clip_clickable_description;
        int i5 = z ? R.color.clip_clickable_description : 0;
        int i6 = z ? R.color.clip_clickable_description : 0;
        int i7 = z ? 0 : R.attr.vk_ui_text_primary;
        if (z) {
            z2 = false;
            i = 0;
        } else {
            i = R.attr.vk_ui_text_primary;
            z2 = false;
        }
        CharSequence i8 = ucp.i(a.d(charSequence, new LinksParserData(i3, (Bundle) null, i5, i7, (String) null, (String) null, i6, i, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16178)));
        if (mentionsParseMode == MentionsParseMode.CLIPS) {
            sxy sxyVar = this.a;
            z420 z420Var = (z420) sxyVar.a;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Matcher matcher2 = ((Pattern) ((bpn0) sxyVar.b).getValue()).matcher(i8);
            int i9 = 0;
            int i10 = 0;
            while (matcher2.find()) {
                int start = matcher2.start() - i9;
                int end = matcher2.end() - i9;
                int end2 = (matcher2.end(2) - matcher2.start(2)) + start;
                int i11 = end - end2;
                spannableStringBuilder.append(i8, i10, matcher2.start());
                spannableStringBuilder.append(i8, matcher2.start(2), matcher2.end(2));
                i10 = matcher2.end();
                int start2 = matcher2.start(1);
                int end3 = matcher2.end(1);
                String obj = ((start2 < 0 || end3 > i8.length() || end3 - start2 < 0) ? "" : i8.subSequence(start2, end3)).toString();
                String obj2 = i8.subSequence(matcher2.start(), matcher2.end()).toString();
                Context context2 = e43.a;
                if (context2 != null) {
                    matcher = matcher2;
                    context = context2;
                } else {
                    matcher = matcher2;
                    context = null;
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(i4)), start, end2, 33);
                boolean B = brm0.B(obj, "club", false);
                hl10 b = ((Regex) z420Var.b.getValue()).b(obj);
                long j = 0;
                if (b != null) {
                    try {
                        j = Long.parseLong((String) ((hl10.a) b.b()).get(1));
                    } catch (NumberFormatException unused) {
                    }
                }
                long j2 = j;
                z420.a aVar = new z420.a(B ? new UserId(-j2) : new UserId(j2), obj2, z420Var.a);
                aVar.b = true;
                aVar.c(R.color.vk_black_alpha24);
                spannableStringBuilder.setSpan(aVar, start, end2, 33);
                i9 += i11;
                matcher2 = matcher;
                i4 = R.color.clip_clickable_description;
            }
            Matcher matcher3 = matcher2;
            if (i10 < matcher3.regionEnd()) {
                spannableStringBuilder.append(i8, i10, matcher3.regionEnd());
            }
            i8 = spannableStringBuilder;
        }
        if (hashtagParseMode != HashtagParseMode.CLIPS) {
            return i8;
        }
        Spannable spannableStringBuilder2 = i8 instanceof Spannable ? (Spannable) i8 : new SpannableStringBuilder(i8);
        Matcher matcher4 = ((Pattern) ((bpn0) this.b.c).getValue()).matcher(i8);
        while (matcher4.find()) {
            int start3 = matcher4.start();
            int end4 = matcher4.end();
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(context3.getColor(R.color.clip_clickable_description)), start3, end4, 33);
            spannableStringBuilder2.setSpan(new szc(matcher4.group()), start3, end4, 33);
        }
        return spannableStringBuilder2;
    }

    @Override // xsna.xod
    public final CharSequence b(String str) {
        ucp ucpVar = ucp.a;
        return drm0.p0(ucp.i(str));
    }

    @Override // xsna.ibr0
    public final CharSequence c(MusicTrack musicTrack) {
        List list;
        List list2;
        List<Artist> list3;
        List<Artist> list4;
        if (musicTrack == null || (list4 = musicTrack.t) == null) {
            list = null;
        } else {
            list = new ArrayList();
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                String str = ((Artist) it.next()).c;
                if (str != null) {
                    list.add(str);
                }
            }
        }
        if (list == null) {
            list = EmptyList.b;
        }
        if (musicTrack == null || (list3 = musicTrack.u) == null) {
            list2 = null;
        } else {
            list2 = new ArrayList();
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                String str2 = ((Artist) it2.next()).c;
                if (str2 != null) {
                    list2.add(str2);
                }
            }
        }
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        String str3 = musicTrack != null ? musicTrack.h : null;
        if (str3 == null) {
            str3 = "";
        }
        return d(new ag40(list, list2, str3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r13 != null) goto L21;
     */
    @Override // xsna.xod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence d(ag40 ag40Var) {
        String str;
        String str2;
        if (ag40Var != null) {
            ucp ucpVar = ucp.a;
            StringBuilder sb = new StringBuilder();
            List<String> list = ag40Var.a;
            if (!ad0.y(list)) {
                list = null;
            }
            if (list == null || (str = j5g.g0(list, ", ", null, null, 0, null, 62)) == null) {
                str = ag40Var.c;
            }
            sb.append(str);
            sb.append(' ');
            List<String> list2 = ag40Var.b;
            List<String> list3 = ad0.y(list2) ? list2 : null;
            if (list3 != null) {
                str2 = "feat. " + j5g.g0(list3, ", ", null, null, 0, null, 62);
            }
            str2 = "";
            sb.append(str2);
            CharSequence i = ucp.i(drm0.p0(sb.toString()).toString());
            if (i != null) {
                return i;
            }
        }
        return "";
    }
}
