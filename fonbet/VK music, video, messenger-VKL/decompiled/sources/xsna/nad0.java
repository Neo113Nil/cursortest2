package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollGradient;
import com.vk.dto.polls.PollOption;
import com.vk.dto.polls.PollTile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.l7x0;
import xsna.taa0;
import xsna.vrb0;

/* compiled from: PrimaryPollAttachmentTransformer.kt */
/* loaded from: classes4.dex */
public final class nad0 implements gn60<Triple<? extends PollAttachment, ? extends v1c0, ? extends m7x0>, wm60> {
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public final Drawable c = m33.a(R.drawable.poll_view_no_background_selector, e43.a);
    public final Drawable d = m33.a(R.drawable.poll_view_with_background_selector, e43.a);

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0502, code lost:
    
        if (r9.F == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0512, code lost:
    
        if (r1.F == false) goto L241;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(int i, Triple triple) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        int size;
        int i2;
        String str4;
        NewsEntry newsEntry;
        String Ab;
        boolean z3;
        int i3;
        tjo tjoVar;
        GradientDrawable gradientDrawable;
        NewsEntry newsEntry2;
        String str5;
        int i4;
        PollBackground pollBackground;
        String str6;
        int i5;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        int i8;
        boolean z7;
        String format;
        PollBackground pollBackground2;
        int i9;
        String str7;
        boolean z8;
        int i10;
        PollBackground pollBackground3;
        int f;
        PollAttachment pollAttachment = (PollAttachment) triple.d();
        v1c0 v1c0Var = (v1c0) triple.g();
        m7x0 m7x0Var = (m7x0) triple.h();
        Poll poll = pollAttachment.f;
        boolean Bb = poll.Bb();
        boolean z9 = poll.i;
        Owner owner = poll.w;
        List<PollOption> list = poll.f;
        int i11 = poll.h;
        PollBackground pollBackground4 = poll.s;
        String e = y8g0.e(!Bb ? R.string.poll_show_results : R.string.poll_show_variants);
        int i12 = poll.Fb() ? R.drawable.vk_icon_more_vertical_shadow_medium_48 : R.drawable.vk_icon_more_vertical_24;
        Drawable drawable = poll.Fb() ? this.c : this.d;
        boolean z10 = m7x0Var.a instanceof l7x0.d;
        int i13 = !z10 ? 0 : 4;
        if (z10) {
            str = "";
        } else {
            str = (i11 == 0 && poll.Bb()) ? y8g0.e(o25.a().o().o ? R.string.poll_vote_first_female : R.string.poll_vote_first_male) : i11 == 0 ? y8g0.e(R.string.poll_no_votes) : y8g0.c(R.plurals.poll_voters, i11);
        }
        int i14 = poll.Fb() ? R.drawable.bg_button_primary_poll_8_radius : R.drawable.bg_button_primary_poll_no_bg_secondary;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        mkq0 mkq0Var = new mkq0();
        mad0 mad0Var = new mad0(mkq0Var);
        mad0Var.b = true;
        long j = poll.k;
        String str8 = owner != null ? owner.c : null;
        if (str8 != null && str8.length() != 0 && (poll.isClosed() || j > 0)) {
            spannableStringBuilder.append((CharSequence) str8);
            if (spannableStringBuilder.length() > 0) {
                mkq0Var.b = owner.b;
                if (poll.Fb()) {
                    z = z9;
                } else {
                    z = z9;
                    dhr0.t.c(R.attr.vk_ui_text_secondary);
                }
                spannableStringBuilder.setSpan(mad0Var, 0, str8.length(), 33);
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                String e2 = y8g0.e(!z ? R.string.poll_anonym : R.string.poll_public);
                z2 = poll.o;
                SpannableStringBuilder spannableStringBuilder2 = this.b;
                if (z2) {
                    spannableStringBuilder2.clear();
                    String e3 = y8g0.e(R.string.poll_disable_unvote_title);
                    if (j > 0) {
                        spannableStringBuilder2.append((CharSequence) e3);
                        spannableStringBuilder2.append((CharSequence) " · ");
                        spannableStringBuilder2.append((CharSequence) e2);
                    } else {
                        spannableStringBuilder2.append((CharSequence) e2);
                        spannableStringBuilder2.append((CharSequence) " · ");
                        spannableStringBuilder2.append((CharSequence) e3.toLowerCase(Locale.ROOT));
                    }
                    spannableStringBuilder2.append((CharSequence) "\n");
                    e2 = spannableStringBuilder2.toString();
                }
                String str9 = owner == null ? owner.c : null;
                if (!poll.isClosed()) {
                    String e4 = y8g0.e(poll.isExpired() ? R.string.poll_expired : R.string.poll_closed);
                    spannableStringBuilder2.clear();
                    spannableStringBuilder2.append((CharSequence) e2);
                    spannableStringBuilder2.append((CharSequence) " · ");
                    spannableStringBuilder2.append((CharSequence) e4);
                    e2 = spannableStringBuilder2.toString();
                } else if (j > 0) {
                    spannableStringBuilder2.clear();
                    spannableStringBuilder2.append((CharSequence) e2);
                    spannableStringBuilder2.append((CharSequence) " · ");
                    spannableStringBuilder2.append((CharSequence) csb0.c((int) j, false, true));
                    e2 = spannableStringBuilder2.toString();
                } else if (str9 != null && str9.length() != 0) {
                    spannableStringBuilder2.clear();
                    spannableStringBuilder2.append((CharSequence) str9);
                    spannableStringBuilder2.append((CharSequence) " · ");
                    spannableStringBuilder2.append((CharSequence) e2);
                    e2 = spannableStringBuilder2.toString();
                }
                spannableStringBuilder.append((CharSequence) e2);
                Pair pair = new Pair(spannableStringBuilder, mkq0Var);
                CharSequence charSequence = (CharSequence) pair.d();
                mkq0 mkq0Var2 = (mkq0) pair.g();
                if (pollBackground4 != null) {
                    if (pollBackground4 instanceof PhotoPoll) {
                        int i15 = taa0.o;
                        PhotoPoll photoPoll = (PhotoPoll) pollBackground4;
                        List<ImageSize> list2 = photoPoll.d;
                        str2 = taa0.a.a(photoPoll, iah0.a(344), iah0.a(160)).d.d;
                        ImageSize imageSize = (ImageSize) ixj0.m(list2);
                        if (imageSize == null) {
                            imageSize = list2.get(0);
                        }
                        str3 = imageSize.d.d;
                        Pair pair2 = new Pair(str2, str3);
                        String str10 = (String) pair2.d();
                        String str11 = (String) pair2.g();
                        List Eb = m7x0Var.a instanceof l7x0.d ? (z || i11 == 0) ? EmptyList.b : poll.Eb() : EmptyList.b;
                        l7x0 l7x0Var = m7x0Var.a;
                        boolean z11 = (!(l7x0Var instanceof l7x0.a) || (l7x0Var instanceof l7x0.d) || (l7x0Var instanceof l7x0.e)) ? false : true;
                        int size2 = list.size();
                        l7x0 l7x0Var2 = m7x0Var.a;
                        ArrayList arrayList = new ArrayList();
                        i2 = 0;
                        for (size = list.size(); i2 < size; size = size) {
                            PollOption pollOption = list.get(i2);
                            boolean Fb = poll.Fb();
                            int i16 = pollOption.d;
                            float f2 = pollOption.e;
                            mkq0 mkq0Var3 = mkq0Var2;
                            CharSequence charSequence2 = charSequence;
                            long j2 = pollOption.b;
                            String str12 = pollOption.c;
                            SpannableString spannableString = new SpannableString(lhg.a(i16, " · "));
                            if (poll.Bb()) {
                                str5 = str12;
                                i4 = 0;
                            } else if (Fb) {
                                i4 = 1560281087;
                                str5 = str12;
                            } else {
                                str5 = str12;
                                i4 = dhr0.t.c(R.attr.vk_ui_text_muted);
                            }
                            spannableString.setSpan(new ForegroundColorSpan(i4), 0, spannableString.length(), 33);
                            spannableString.setSpan(new AbsoluteSizeSpan(iah0.a(14.0f)), 0, spannableString.length(), 33);
                            Drawable a = poll.Bb() ? m33.a(Fb ? R.drawable.poll_option_with_background_selector : R.drawable.poll_option_no_background_selector, e43.a) : null;
                            long j3 = pollOption.b;
                            CharSequence concat = TextUtils.concat(str5, spannableString);
                            if (poll.Bb()) {
                                pollBackground = pollBackground4;
                                str6 = str5;
                            } else {
                                pollBackground = pollBackground4;
                                str6 = null;
                            }
                            if (l7x0Var2 instanceof l7x0.c) {
                                int i17 = i2;
                                z4 = ((l7x0.c) l7x0Var2).a.contains(Long.valueOf(j2));
                                i5 = i17;
                            } else {
                                i5 = i2;
                                z4 = false;
                            }
                            boolean z12 = l7x0Var2 instanceof l7x0.d;
                            if (z12) {
                                i7 = i5;
                                i6 = 4;
                            } else if (poll.Ib() && poll.Bb()) {
                                i7 = i5;
                                i6 = 0;
                            } else {
                                i6 = 8;
                                i7 = i5;
                            }
                            boolean z13 = l7x0Var2 instanceof l7x0.a;
                            if (z13) {
                                z5 = z12;
                                if (((l7x0.a) l7x0Var2).a == j2) {
                                    z6 = Fb;
                                    i8 = 0;
                                    if (poll.Bb()) {
                                        z7 = z6;
                                        format = String.format("%.0f\u2009%%", Arrays.copyOf(new Object[]{Float.valueOf(an10.b(f2))}, 1));
                                    } else {
                                        z7 = z6;
                                        format = "";
                                    }
                                    if (!poll.Bb() || z13 || z5) {
                                        pollBackground2 = pollBackground;
                                        i9 = 4;
                                    } else {
                                        pollBackground2 = pollBackground;
                                        i9 = 0;
                                    }
                                    if (poll.Bb()) {
                                        str7 = format;
                                        boolean z14 = z7;
                                        i10 = Math.round(10000 * (f2 / 100));
                                        z8 = z14;
                                    } else {
                                        str7 = format;
                                        z8 = z7;
                                        i10 = 0;
                                    }
                                    if (z8) {
                                        pollBackground3 = pollBackground2;
                                        f = l8g.f(0.16f, dhr0.t.c(R.attr.vk_ui_background_accent_themed));
                                    } else {
                                        f = 1040187391;
                                        pollBackground3 = pollBackground2;
                                    }
                                    String str13 = str7;
                                    int i18 = f;
                                    ArrayList arrayList2 = arrayList;
                                    arrayList2.add(new tmb0(j3, pollOption, poll, concat, str6, z4, i6, i8, str13, i9, a, i10, i18));
                                    i2 = i7 + 1;
                                    list = list;
                                    arrayList = arrayList2;
                                    pollBackground4 = pollBackground3;
                                    l7x0Var2 = l7x0Var2;
                                    charSequence = charSequence2;
                                    mkq0Var2 = mkq0Var3;
                                }
                            } else {
                                z5 = z12;
                            }
                            z6 = Fb;
                            i8 = 4;
                            if (poll.Bb()) {
                            }
                            if (poll.Bb()) {
                            }
                            pollBackground2 = pollBackground;
                            i9 = 4;
                            if (poll.Bb()) {
                            }
                            if (z8) {
                            }
                            String str132 = str7;
                            int i182 = f;
                            ArrayList arrayList22 = arrayList;
                            arrayList22.add(new tmb0(j3, pollOption, poll, concat, str6, z4, i6, i8, str132, i9, a, i10, i182));
                            i2 = i7 + 1;
                            list = list;
                            arrayList = arrayList22;
                            pollBackground4 = pollBackground3;
                            l7x0Var2 = l7x0Var2;
                            charSequence = charSequence2;
                            mkq0Var2 = mkq0Var3;
                        }
                        mkq0 mkq0Var4 = mkq0Var2;
                        CharSequence charSequence3 = charSequence;
                        ArrayList arrayList3 = arrayList;
                        PollBackground pollBackground5 = pollBackground4;
                        boolean z15 = false;
                        boolean Bb2 = poll.Bb();
                        String str14 = poll.d;
                        int i19 = pollBackground5 == null ? R.drawable.bg_button_primary_poll_8_radius : R.drawable.bg_button_primary_poll_no_bg_secondary;
                        l7x0 l7x0Var3 = m7x0Var.a;
                        int i20 = !(l7x0Var3 instanceof l7x0.c) ? 0 : 4;
                        int i21 = l7x0Var3 instanceof l7x0.d ? 0 : 4;
                        boolean z16 = !Eb.isEmpty();
                        str4 = v1c0Var.d;
                        newsEntry = v1c0Var.a;
                        if (str4 == null) {
                            str4 = "poll";
                        }
                        Post post = !(newsEntry instanceof Post) ? (Post) newsEntry : null;
                        String str15 = post == null ? post.L.b : null;
                        Ab = newsEntry.Ab();
                        if (Ab == null) {
                            Ab = "wall";
                        }
                        mkl mklVar = new mkl(poll, str4, str15, Ab);
                        int b = cn70.b(10);
                        z3 = pollBackground5 instanceof PhotoPoll;
                        if (z3) {
                            i3 = 10;
                            if (pollBackground5 instanceof PollTile) {
                                int i22 = vrb0.d;
                                tjoVar = new urb0(b);
                            } else {
                                tjoVar = null;
                            }
                        } else {
                            int i23 = taa0.o;
                            i3 = 10;
                            tjoVar = new saa0(((PhotoPoll) pollBackground5).c, -1, iah0.a(160), b);
                        }
                        int b2 = cn70.b(i3);
                        if (!z3) {
                            int c = l8g.c(0.6f, ((PhotoPoll) pollBackground5).c);
                            gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(c);
                            gradientDrawable.setCornerRadius(b2);
                        } else if (pollBackground5 instanceof PollTile) {
                            int i24 = ((PollTile) pollBackground5).c;
                            gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(i24);
                            gradientDrawable.setCornerRadius(b2);
                        } else {
                            gradientDrawable = null;
                        }
                        dqb0 dqb0Var = !(pollBackground5 instanceof PollGradient) ? new dqb0((PollGradient) pollBackground5, cn70.b(i3)) : null;
                        newsEntry2 = v1c0Var.b;
                        if (!(newsEntry2 instanceof ShitAttachment) && !(newsEntry instanceof ShitAttachment)) {
                            if (newsEntry instanceof Post) {
                                Post post2 = (Post) newsEntry;
                                if (!post2.dc()) {
                                }
                            }
                            if (newsEntry2 instanceof Post) {
                                Post post3 = (Post) newsEntry2;
                                if (!post3.dc()) {
                                }
                            }
                            return Collections.singletonList(new lad0(i12, z11, size2, arrayList3, Bb2, str14, charSequence3, e, i19, i20, i14, i13, str, z16, Eb, drawable, i21, mklVar, mkq0Var4, tjoVar, gradientDrawable, str10, str11, dqb0Var, v1c0Var, z15, new m7x0(m7x0Var.a), pollAttachment, v1c0Var.a, v1c0Var.b));
                        }
                        z15 = true;
                        return Collections.singletonList(new lad0(i12, z11, size2, arrayList3, Bb2, str14, charSequence3, e, i19, i20, i14, i13, str, z16, Eb, drawable, i21, mklVar, mkq0Var4, tjoVar, gradientDrawable, str10, str11, dqb0Var, v1c0Var, z15, new m7x0(m7x0Var.a), pollAttachment, v1c0Var.a, v1c0Var.b));
                    }
                    if (pollBackground4 instanceof PollTile) {
                        int i25 = vrb0.d;
                        str2 = vrb0.a.a((PollTile) pollBackground4, iah0.v()).d.d;
                        str3 = str2;
                        Pair pair22 = new Pair(str2, str3);
                        String str102 = (String) pair22.d();
                        String str112 = (String) pair22.g();
                        List Eb2 = m7x0Var.a instanceof l7x0.d ? (z || i11 == 0) ? EmptyList.b : poll.Eb() : EmptyList.b;
                        l7x0 l7x0Var4 = m7x0Var.a;
                        if (!(l7x0Var4 instanceof l7x0.a)) {
                        }
                        int size22 = list.size();
                        l7x0 l7x0Var22 = m7x0Var.a;
                        ArrayList arrayList4 = new ArrayList();
                        i2 = 0;
                        while (i2 < size) {
                        }
                        mkq0 mkq0Var42 = mkq0Var2;
                        CharSequence charSequence32 = charSequence;
                        ArrayList arrayList32 = arrayList4;
                        PollBackground pollBackground52 = pollBackground4;
                        boolean z152 = false;
                        boolean Bb22 = poll.Bb();
                        String str142 = poll.d;
                        if (pollBackground52 == null) {
                        }
                        l7x0 l7x0Var32 = m7x0Var.a;
                        if (!(l7x0Var32 instanceof l7x0.c)) {
                        }
                        if (l7x0Var32 instanceof l7x0.d) {
                        }
                        boolean z162 = !Eb2.isEmpty();
                        str4 = v1c0Var.d;
                        newsEntry = v1c0Var.a;
                        if (str4 == null) {
                        }
                        if (!(newsEntry instanceof Post)) {
                        }
                        if (post == null) {
                        }
                        Ab = newsEntry.Ab();
                        if (Ab == null) {
                        }
                        mkl mklVar2 = new mkl(poll, str4, str15, Ab);
                        int b3 = cn70.b(10);
                        z3 = pollBackground52 instanceof PhotoPoll;
                        if (z3) {
                        }
                        int b22 = cn70.b(i3);
                        if (!z3) {
                        }
                        if (!(pollBackground52 instanceof PollGradient)) {
                        }
                        newsEntry2 = v1c0Var.b;
                        if (!(newsEntry2 instanceof ShitAttachment)) {
                            if (newsEntry instanceof Post) {
                            }
                            if (newsEntry2 instanceof Post) {
                            }
                            return Collections.singletonList(new lad0(i12, z11, size22, arrayList32, Bb22, str142, charSequence32, e, i19, i20, i14, i13, str, z162, Eb2, drawable, i21, mklVar2, mkq0Var42, tjoVar, gradientDrawable, str102, str112, dqb0Var, v1c0Var, z152, new m7x0(m7x0Var.a), pollAttachment, v1c0Var.a, v1c0Var.b));
                        }
                        z152 = true;
                        return Collections.singletonList(new lad0(i12, z11, size22, arrayList32, Bb22, str142, charSequence32, e, i19, i20, i14, i13, str, z162, Eb2, drawable, i21, mklVar2, mkq0Var42, tjoVar, gradientDrawable, str102, str112, dqb0Var, v1c0Var, z152, new m7x0(m7x0Var.a), pollAttachment, v1c0Var.a, v1c0Var.b));
                    }
                }
                str2 = null;
                str3 = str2;
                Pair pair222 = new Pair(str2, str3);
                String str1022 = (String) pair222.d();
                String str1122 = (String) pair222.g();
                List Eb22 = m7x0Var.a instanceof l7x0.d ? (z || i11 == 0) ? EmptyList.b : poll.Eb() : EmptyList.b;
                l7x0 l7x0Var42 = m7x0Var.a;
                if (!(l7x0Var42 instanceof l7x0.a)) {
                }
                int size222 = list.size();
                l7x0 l7x0Var222 = m7x0Var.a;
                ArrayList arrayList42 = new ArrayList();
                i2 = 0;
                while (i2 < size) {
                }
                mkq0 mkq0Var422 = mkq0Var2;
                CharSequence charSequence322 = charSequence;
                ArrayList arrayList322 = arrayList42;
                PollBackground pollBackground522 = pollBackground4;
                boolean z1522 = false;
                boolean Bb222 = poll.Bb();
                String str1422 = poll.d;
                if (pollBackground522 == null) {
                }
                l7x0 l7x0Var322 = m7x0Var.a;
                if (!(l7x0Var322 instanceof l7x0.c)) {
                }
                if (l7x0Var322 instanceof l7x0.d) {
                }
                boolean z1622 = !Eb22.isEmpty();
                str4 = v1c0Var.d;
                newsEntry = v1c0Var.a;
                if (str4 == null) {
                }
                if (!(newsEntry instanceof Post)) {
                }
                if (post == null) {
                }
                Ab = newsEntry.Ab();
                if (Ab == null) {
                }
                mkl mklVar22 = new mkl(poll, str4, str15, Ab);
                int b32 = cn70.b(10);
                z3 = pollBackground522 instanceof PhotoPoll;
                if (z3) {
                }
                int b222 = cn70.b(i3);
                if (!z3) {
                }
                if (!(pollBackground522 instanceof PollGradient)) {
                }
                newsEntry2 = v1c0Var.b;
                if (!(newsEntry2 instanceof ShitAttachment)) {
                }
                z1522 = true;
                return Collections.singletonList(new lad0(i12, z11, size222, arrayList322, Bb222, str1422, charSequence322, e, i19, i20, i14, i13, str, z1622, Eb22, drawable, i21, mklVar22, mkq0Var422, tjoVar, gradientDrawable, str1022, str1122, dqb0Var, v1c0Var, z1522, new m7x0(m7x0Var.a), pollAttachment, v1c0Var.a, v1c0Var.b));
            }
        }
        z = z9;
        if (spannableStringBuilder.length() > 0) {
        }
        String e22 = y8g0.e(!z ? R.string.poll_anonym : R.string.poll_public);
        z2 = poll.o;
        SpannableStringBuilder spannableStringBuilder22 = this.b;
        if (z2) {
        }
        if (owner == null) {
        }
        if (!poll.isClosed()) {
        }
        spannableStringBuilder.append((CharSequence) e22);
        Pair pair3 = new Pair(spannableStringBuilder, mkq0Var);
        CharSequence charSequence4 = (CharSequence) pair3.d();
        mkq0 mkq0Var22 = (mkq0) pair3.g();
        if (pollBackground4 != null) {
        }
        str2 = null;
        str3 = str2;
        Pair pair2222 = new Pair(str2, str3);
        String str10222 = (String) pair2222.d();
        String str11222 = (String) pair2222.g();
        List Eb222 = m7x0Var.a instanceof l7x0.d ? (z || i11 == 0) ? EmptyList.b : poll.Eb() : EmptyList.b;
        l7x0 l7x0Var422 = m7x0Var.a;
        if (!(l7x0Var422 instanceof l7x0.a)) {
        }
        int size2222 = list.size();
        l7x0 l7x0Var2222 = m7x0Var.a;
        ArrayList arrayList422 = new ArrayList();
        i2 = 0;
        while (i2 < size) {
        }
        mkq0 mkq0Var4222 = mkq0Var22;
        CharSequence charSequence3222 = charSequence4;
        ArrayList arrayList3222 = arrayList422;
        PollBackground pollBackground5222 = pollBackground4;
        boolean z15222 = false;
        boolean Bb2222 = poll.Bb();
        String str14222 = poll.d;
        if (pollBackground5222 == null) {
        }
        l7x0 l7x0Var3222 = m7x0Var.a;
        if (!(l7x0Var3222 instanceof l7x0.c)) {
        }
        if (l7x0Var3222 instanceof l7x0.d) {
        }
        boolean z16222 = !Eb222.isEmpty();
        str4 = v1c0Var.d;
        newsEntry = v1c0Var.a;
        if (str4 == null) {
        }
        if (!(newsEntry instanceof Post)) {
        }
        if (post == null) {
        }
        Ab = newsEntry.Ab();
        if (Ab == null) {
        }
        mkl mklVar222 = new mkl(poll, str4, str15, Ab);
        int b322 = cn70.b(10);
        z3 = pollBackground5222 instanceof PhotoPoll;
        if (z3) {
        }
        int b2222 = cn70.b(i3);
        if (!z3) {
        }
        if (!(pollBackground5222 instanceof PollGradient)) {
        }
        newsEntry2 = v1c0Var.b;
        if (!(newsEntry2 instanceof ShitAttachment)) {
        }
        z15222 = true;
        return Collections.singletonList(new lad0(i12, z11, size2222, arrayList3222, Bb2222, str14222, charSequence3222, e, i19, i20, i14, i13, str, z16222, Eb222, drawable, i21, mklVar222, mkq0Var4222, tjoVar, gradientDrawable, str10222, str11222, dqb0Var, v1c0Var, z15222, new m7x0(m7x0Var.a), pollAttachment, v1c0Var.a, v1c0Var.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, (Triple) pair);
    }
}
