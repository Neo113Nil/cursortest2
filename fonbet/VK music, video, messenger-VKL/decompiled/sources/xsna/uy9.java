package xsna;

import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListInvitationStatusDto;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: CartUseCaseImpl.kt */
/* loaded from: classes18.dex */
public final class uy9 implements gn60 {
    public final Object b;
    public final Object c;

    public /* synthetic */ uy9(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public static int c(NewsEntry newsEntry, NewsEntry newsEntry2) {
        if (newsEntry instanceof c6z) {
            if (newsEntry instanceof Post) {
                if (newsEntry2 instanceof PromoPost) {
                    return 0;
                }
                return ((Post) newsEntry).r;
            }
            if (newsEntry instanceof Videos) {
                if (di60.q(newsEntry)) {
                    return ((Videos) newsEntry).n;
                }
            } else if ((newsEntry instanceof Photos) && di60.q(newsEntry)) {
                return ((Photos) newsEntry).p;
            }
        } else if (newsEntry instanceof FaveEntry) {
            gmq gmqVar = ((FaveEntry) newsEntry).i.f;
            if ((gmqVar instanceof Post) && !(newsEntry2 instanceof PromoPost)) {
                return ((Post) gmqVar).r;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(NewsEntry newsEntry, s1c0 s1c0Var) {
        BadgesSet u0;
        if (newsEntry instanceof c6z) {
            if (!s1c0Var.i) {
                return false;
            }
            Badgeable badgeable = newsEntry instanceof Badgeable ? (Badgeable) newsEntry : null;
            u0 = badgeable != null ? badgeable.u0() : null;
            return (u0 == null || u0.e.isEmpty() || u0.f <= 0) ? false : true;
        }
        if (!(newsEntry instanceof FaveEntry)) {
            if (!(newsEntry instanceof ShitAttachment)) {
                return false;
            }
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
            VideoAttachment videoAttachment = shitAttachment.I;
            if (!shitAttachment.Gb() || videoAttachment == null || !s1c0Var.i) {
                return false;
            }
            VideoFile videoFile = videoAttachment.k;
            Badgeable badgeable2 = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
            u0 = badgeable2 != null ? badgeable2.u0() : null;
            return (u0 == null || u0.e.isEmpty() || u0.f <= 0) ? false : true;
        }
        gmq gmqVar = ((FaveEntry) newsEntry).i.f;
        if (gmqVar instanceof Post) {
            if (!s1c0Var.i) {
                return false;
            }
            Badgeable badgeable3 = gmqVar != null ? (Badgeable) gmqVar : null;
            u0 = badgeable3 != null ? badgeable3.u0() : null;
            return (u0 == null || u0.e.isEmpty() || u0.f <= 0) ? false : true;
        }
        if ((gmqVar instanceof ArticleAttachment) || !(gmqVar instanceof VideoAttachment) || !s1c0Var.i) {
            return false;
        }
        VideoFile videoFile2 = ((VideoAttachment) gmqVar).k;
        Badgeable badgeable4 = videoFile2 instanceof Badgeable ? (Badgeable) videoFile2 : null;
        u0 = badgeable4 != null ? badgeable4.u0() : null;
        return (u0 == null || u0.e.isEmpty() || u0.f <= 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(NewsEntry newsEntry, s1c0 s1c0Var) {
        if (newsEntry instanceof c6z) {
            if (!s1c0Var.i) {
                return false;
            }
            boolean z = newsEntry instanceof Badgeable;
            Badgeable badgeable = z ? (Badgeable) newsEntry : null;
            BadgesSet u0 = badgeable != null ? badgeable.u0() : null;
            if (u0 != null && !u0.e.isEmpty() && u0.f > 0) {
                return false;
            }
            Badgeable badgeable2 = z ? (Badgeable) newsEntry : null;
            if ((badgeable2 != null ? badgeable2.ca() : null) == null || !s1c0Var.k) {
                return false;
            }
        } else if (newsEntry instanceof FaveEntry) {
            gmq gmqVar = ((FaveEntry) newsEntry).i.f;
            if (gmqVar instanceof Post) {
                if (!s1c0Var.i) {
                    return false;
                }
                Badgeable badgeable3 = gmqVar != null ? (Badgeable) gmqVar : null;
                BadgesSet u02 = badgeable3 != null ? badgeable3.u0() : null;
                if (u02 != null && !u02.e.isEmpty() && u02.f > 0) {
                    return false;
                }
                Badgeable badgeable4 = gmqVar != null ? (Badgeable) gmqVar : null;
                if ((badgeable4 != null ? badgeable4.ca() : null) == null || !s1c0Var.k) {
                    return false;
                }
            } else {
                if ((gmqVar instanceof ArticleAttachment) || !(gmqVar instanceof VideoAttachment) || !s1c0Var.i) {
                    return false;
                }
                VideoAttachment videoAttachment = (VideoAttachment) gmqVar;
                VideoFile videoFile = videoAttachment.k;
                Badgeable badgeable5 = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
                BadgesSet u03 = badgeable5 != null ? badgeable5.u0() : null;
                if (u03 != null && !u03.e.isEmpty() && u03.f > 0) {
                    return false;
                }
                VideoFile videoFile2 = videoAttachment.k;
                Badgeable badgeable6 = videoFile2 instanceof Badgeable ? (Badgeable) videoFile2 : null;
                if ((badgeable6 != null ? badgeable6.ca() : null) == null || !s1c0Var.k) {
                    return false;
                }
            }
        } else {
            if (!(newsEntry instanceof ShitAttachment)) {
                return false;
            }
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
            VideoAttachment videoAttachment2 = shitAttachment.I;
            if (!shitAttachment.Gb() || videoAttachment2 == null || !s1c0Var.i) {
                return false;
            }
            VideoFile videoFile3 = videoAttachment2.k;
            Badgeable badgeable7 = videoFile3 instanceof Badgeable ? (Badgeable) videoFile3 : null;
            BadgesSet u04 = badgeable7 != null ? badgeable7.u0() : null;
            if (u04 != null && !u04.e.isEmpty() && u04.f > 0) {
                return false;
            }
            VideoFile videoFile4 = videoAttachment2.k;
            Badgeable badgeable8 = videoFile4 instanceof Badgeable ? (Badgeable) videoFile4 : null;
            if ((badgeable8 != null ? badgeable8.ca() : null) == null || !s1c0Var.k) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(NewsEntry newsEntry, s1c0 s1c0Var) {
        Post post;
        if (newsEntry instanceof c6z) {
            Badgeable badgeable = newsEntry instanceof Badgeable ? (Badgeable) newsEntry : null;
            boolean z = s1c0Var.i;
            boolean z2 = s1c0Var.k;
            if (z && badgeable != null && badgeable.u0() != null) {
                BadgesSet u0 = badgeable.u0();
                if ((u0 != null ? u0.f : 0) > 0 || z2) {
                    if (!z2) {
                        post = newsEntry instanceof Post ? (Post) newsEntry : null;
                        if (!(post != null && post.gc())) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        if (!(newsEntry instanceof FaveEntry)) {
            if (newsEntry instanceof ShitAttachment) {
                ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
                VideoAttachment videoAttachment = shitAttachment.I;
                if (shitAttachment.Gb() && videoAttachment != null) {
                    VideoFile videoFile = videoAttachment.k;
                    Badgeable badgeable2 = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
                    boolean z3 = s1c0Var.i;
                    boolean z4 = s1c0Var.k;
                    if (z3 && badgeable2 != null && badgeable2.u0() != null) {
                        BadgesSet u02 = badgeable2.u0();
                        if ((u02 != null ? u02.f : 0) > 0 || z4) {
                            if (!z4) {
                                Parcelable parcelable = videoAttachment.k;
                                post = parcelable instanceof Post ? (Post) parcelable : null;
                                if (!(post != null && post.gc())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        gmq gmqVar = ((FaveEntry) newsEntry).i.f;
        if (gmqVar instanceof Post) {
            Badgeable badgeable3 = gmqVar != null ? (Badgeable) gmqVar : null;
            boolean z5 = s1c0Var.i;
            boolean z6 = s1c0Var.k;
            if (z5 && badgeable3 != null && badgeable3.u0() != null) {
                BadgesSet u03 = badgeable3.u0();
                if ((u03 != null ? u03.f : 0) > 0 || z6) {
                    if (!z6) {
                        post = gmqVar != null ? (Post) gmqVar : null;
                        if (!(post != null && post.gc())) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        if (!(gmqVar instanceof ArticleAttachment) && (gmqVar instanceof VideoAttachment)) {
            VideoAttachment videoAttachment2 = (VideoAttachment) gmqVar;
            VideoFile videoFile2 = videoAttachment2.k;
            Badgeable badgeable4 = videoFile2 instanceof Badgeable ? (Badgeable) videoFile2 : null;
            boolean z7 = s1c0Var.i;
            boolean z8 = s1c0Var.k;
            if (z7 && badgeable4 != null && badgeable4.u0() != null) {
                BadgesSet u04 = badgeable4.u0();
                if ((u04 != null ? u04.f : 0) > 0 || z8) {
                    if (!z8) {
                        Parcelable parcelable2 = videoAttachment2.k;
                        post = parcelable2 instanceof Post ? (Post) parcelable2 : null;
                        if (!(post != null && post.gc())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(NewsEntry newsEntry) {
        Post post;
        boolean z;
        if (newsEntry instanceof c6z) {
            boolean z2 = newsEntry instanceof Post;
            if (z2) {
                Post post2 = (Post) newsEntry;
                if (post2.dc() || post2.F) {
                    z = true;
                    post = z2 ? (Post) newsEntry : null;
                    return (((c6z) newsEntry).qa() && (z || (post == null && post.ic()))) ? false : true;
                }
            }
            z = false;
            if (z2) {
            }
            if (((c6z) newsEntry).qa()) {
            }
        }
        if (newsEntry instanceof FaveEntry) {
            gmq gmqVar = ((FaveEntry) newsEntry).i.f;
            if (gmqVar instanceof Post) {
                Post post3 = (Post) gmqVar;
                boolean z3 = post3.dc() || post3.F;
                post = gmqVar != null ? post3 : null;
                boolean z4 = post != null && post.ic();
                if (post3.qa() || (!z3 && !z4)) {
                }
            } else if (!(gmqVar instanceof ArticleAttachment) && (gmqVar instanceof VideoAttachment)) {
                return ((VideoAttachment) gmqVar).k.Pa().qa();
            }
        } else if (newsEntry instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
            VideoAttachment videoAttachment = shitAttachment.I;
            if (shitAttachment.Gb() && videoAttachment != null) {
                videoAttachment.k.Pa().qa();
                return true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean i(NewsEntry newsEntry) {
        VideoFile videoFile;
        bss0 Pa;
        Integer num = null;
        num = null;
        num = null;
        if (newsEntry instanceof c6z) {
            return ((newsEntry instanceof o2f0 ? (o2f0) newsEntry : null) != null && di60.I(newsEntry)) || ((grj0) newsEntry).T9() > 0;
        }
        if (newsEntry instanceof FaveEntry) {
            gmq gmqVar = ((FaveEntry) newsEntry).i.f;
            if (gmqVar instanceof Post) {
                return di60.I((NewsEntry) gmqVar) || ((Post) gmqVar).E.b > 0;
            }
            return !(gmqVar instanceof ArticleAttachment) && (gmqVar instanceof VideoAttachment) && ((VideoAttachment) gmqVar).k.Pa().T9() > 0;
        }
        if (!(newsEntry instanceof ShitAttachment)) {
            return false;
        }
        VideoAttachment videoAttachment = ((ShitAttachment) newsEntry).I;
        if (videoAttachment != null && (videoFile = videoAttachment.k) != null && (Pa = videoFile.Pa()) != null) {
            num = Integer.valueOf(Pa.T9());
        }
        return num != null && num.intValue() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(NewsEntry newsEntry) {
        boolean z;
        Attachment R1;
        if (newsEntry instanceof c6z) {
            if (newsEntry instanceof Photos) {
                Photos photos = (Photos) newsEntry;
                if (photos.r == 1 && (((R1 = photos.R1()) != null && fdi.t(R1)) || !photos.b9())) {
                    z = true;
                    return ((newsEntry instanceof Post) || !((Post) newsEntry).qc()) && !z;
                }
            }
            z = false;
            if (newsEntry instanceof Post) {
            }
        }
        if (!(newsEntry instanceof FaveEntry)) {
            if (newsEntry instanceof ShitAttachment) {
                ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
                VideoAttachment videoAttachment = shitAttachment.I;
                if (!shitAttachment.Gb() || videoAttachment == null) {
                }
            }
        }
        gmq gmqVar = ((FaveEntry) newsEntry).i.f;
        if (!(gmqVar instanceof Post) ? !(gmqVar instanceof ArticleAttachment) && (gmqVar instanceof VideoAttachment) : !((Post) gmqVar).qc()) {
        }
    }

    public io.reactivex.rxjava3.core.x a(int i) {
        b510 b510Var = (b510) this.b;
        h010 h010Var = (h010) this.c;
        UserId a = fkq0.a(h010Var.c);
        long j = h010Var.b;
        return rsg0.w0(yfb.x(b510Var.a.a(a, (int) j, i, h010Var.d, h010Var.a, h010Var.g)));
    }

    public String b(double d, String str, boolean z) {
        Currency currency;
        String symbol;
        String symbol2;
        StringBuilder sb = (StringBuilder) this.b;
        sb.setLength(0);
        NumberFormat numberFormat = (NumberFormat) this.c;
        boolean z2 = z && Math.abs(d - ((double) ((int) d))) <= 0.001d;
        Currency currency2 = null;
        try {
            currency = Currency.getInstance(str);
        } catch (Exception unused) {
            currency = null;
        }
        String str2 = "₽";
        if (currency != null) {
            numberFormat.setCurrency(currency);
            int minimumFractionDigits = numberFormat.getMinimumFractionDigits();
            int maximumFractionDigits = numberFormat.getMaximumFractionDigits();
            if (z2) {
                numberFormat.setMinimumFractionDigits(0);
            }
            sb.append(numberFormat.format(d));
            if (z2) {
                numberFormat.setMinimumFractionDigits(minimumFractionDigits);
                numberFormat.setMaximumFractionDigits(maximumFractionDigits);
            }
            if (str.equals("RUB") && (symbol2 = currency.getSymbol()) != null && symbol2.length() > 0 && !symbol2.equals("₽")) {
                int indexOf = sb.indexOf(symbol2);
                int length = symbol2.length() + indexOf;
                if (indexOf >= 0) {
                    sb.replace(indexOf, length, "₽");
                }
            }
        } else {
            int minimumFractionDigits2 = numberFormat.getMinimumFractionDigits();
            int maximumFractionDigits2 = numberFormat.getMaximumFractionDigits();
            if (z2) {
                numberFormat.setMinimumFractionDigits(0);
            }
            sb.append(numberFormat.format(d));
            sb.append(' ');
            if (!str.equals("RUB")) {
                try {
                    currency2 = Currency.getInstance(str);
                } catch (Exception unused2) {
                }
                if (currency2 != null && (symbol = currency2.getSymbol()) != null) {
                    str = symbol;
                }
                str2 = str;
            }
            sb.append(str2);
            if (z2) {
                numberFormat.setMinimumFractionDigits(minimumFractionDigits2);
                numberFormat.setMaximumFractionDigits(maximumFractionDigits2);
            }
        }
        return sb.toString();
    }

    public io.reactivex.rxjava3.internal.operators.observable.m1 d(String str, String str2) {
        return rsg0.T(yfb.x(((zqu) this.c).n((UserId) this.b, GroupsGetFriendsInvitationListInvitationStatusDto.NOT_INVITED, str, str2, Boolean.TRUE)));
    }

    public void k(String str) {
        int a = ((m090) this.b).a();
        if (a <= 0) {
            return;
        }
        String l = p490.l(a, str);
        if (l.length() == a) {
            ((io.reactivex.rxjava3.subjects.d) this.c).onNext(l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List l(int i, Triple triple) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ReactionMeta p4;
        ReactionMeta reactionMeta;
        boolean z9;
        ReactionMeta reactionMeta2;
        boolean G4;
        ArrayList<ReactionMeta> O8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ItemReactions K;
        ReactionAsset d;
        ItemReactions K2;
        ItemReactions K3;
        h170 h170Var = (h170) this.b;
        pa2 pa2Var = (pa2) this.c;
        NewsEntry newsEntry = (NewsEntry) triple.d();
        NewsEntry newsEntry2 = (NewsEntry) triple.g();
        s1c0 s1c0Var = (s1c0) triple.h();
        if (newsEntry instanceof Photos) {
            return new up70(pa2Var).a(0, new Triple(newsEntry, newsEntry2, s1c0Var));
        }
        if (newsEntry instanceof FaveEntry) {
            return new pwc(h170Var, pa2Var).m(0, new Triple(newsEntry, newsEntry2, s1c0Var));
        }
        if (newsEntry instanceof ShitAttachment) {
            return new dqz0(pa2Var).v(0, new Triple(newsEntry, newsEntry2, s1c0Var));
        }
        if (!(newsEntry instanceof c6z)) {
            int c = c(newsEntry, newsEntry2);
            boolean h = h(newsEntry);
            boolean i2 = i(newsEntry);
            boolean j = j(newsEntry);
            if (newsEntry instanceof Post) {
                if ((BuildInfo.s() && newsEntry != 0) ? !((Post) newsEntry).b9() : false) {
                    z = true;
                    int i3 = !z ? R.drawable.vk_icon_message_forward_outline_24 : R.drawable.vk_icon_share_outline_24;
                    boolean a = pa2.a(newsEntry);
                    boolean I = di60.I(newsEntry);
                    int b = di60.I(newsEntry) ? 0 : cn70.b(8);
                    boolean g = g(newsEntry, s1c0Var);
                    boolean e = e(newsEntry, s1c0Var);
                    boolean f = f(newsEntry, s1c0Var);
                    EmptyList emptyList = EmptyList.b;
                    boolean i4 = tni.i(newsEntry);
                    if (newsEntry instanceof Post) {
                        if (BuildInfo.s()) {
                            z3 = true;
                            z4 = !((Post) newsEntry).b9();
                        } else {
                            z4 = false;
                            z3 = true;
                        }
                        if (z4) {
                            z2 = z3;
                            boolean b2 = h170Var.b();
                            Post post = newsEntry2 instanceof Post ? (Post) newsEntry2 : null;
                            return Collections.singletonList(new q6s(false, false, false, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, false, false, R.string.video_remove_from_added, 0, h, false, i2, false, j, i3, false, false, a, false, false, false, I, b, g, e, f, 0, 0, false, false, b2, post != null ? post.Tb() : false, emptyList, emptyList, false, c, i4, z2, newsEntry, newsEntry2, 0));
                        }
                    }
                    z2 = false;
                    boolean b22 = h170Var.b();
                    if (newsEntry2 instanceof Post) {
                    }
                    return Collections.singletonList(new q6s(false, false, false, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, false, false, R.string.video_remove_from_added, 0, h, false, i2, false, j, i3, false, false, a, false, false, false, I, b, g, e, f, 0, 0, false, false, b22, post != null ? post.Tb() : false, emptyList, emptyList, false, c, i4, z2, newsEntry, newsEntry2, 0));
                }
            }
            z = false;
            int i32 = !z ? R.drawable.vk_icon_message_forward_outline_24 : R.drawable.vk_icon_share_outline_24;
            boolean a2 = pa2.a(newsEntry);
            boolean I2 = di60.I(newsEntry);
            if (di60.I(newsEntry)) {
            }
            boolean g2 = g(newsEntry, s1c0Var);
            boolean e2 = e(newsEntry, s1c0Var);
            boolean f2 = f(newsEntry, s1c0Var);
            EmptyList emptyList2 = EmptyList.b;
            boolean i42 = tni.i(newsEntry);
            if (newsEntry instanceof Post) {
            }
            z2 = false;
            boolean b222 = h170Var.b();
            if (newsEntry2 instanceof Post) {
            }
            return Collections.singletonList(new q6s(false, false, false, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, false, false, R.string.video_remove_from_added, 0, h, false, i2, false, j, i32, false, false, a2, false, false, false, I2, b, g2, e2, f2, 0, 0, false, false, b222, post != null ? post.Tb() : false, emptyList2, emptyList2, false, c, i42, z2, newsEntry, newsEntry2, 0));
        }
        c6z c6zVar = (c6z) newsEntry;
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        int i5 = (o2f0Var == null || (K3 = o2f0Var.K()) == null) ? 0 : K3.c;
        int i6 = (o2f0Var == null || (K2 = o2f0Var.K()) == null) ? 0 : K2.d;
        Badgeable badgeable = c6zVar instanceof Badgeable ? (Badgeable) c6zVar : null;
        Triple s = f9t.s(badgeable != null ? badgeable.u0() : null, s1c0Var);
        boolean booleanValue = ((Boolean) s.d()).booleanValue();
        int intValue = ((Number) s.g()).intValue();
        int intValue2 = ((Number) s.h()).intValue();
        int T9 = c6zVar.T9();
        int E1 = c6zVar.E1();
        int i7 = c6zVar.i7();
        int w0 = c6zVar.w0();
        boolean z16 = c6zVar instanceof Badgeable;
        Badgeable badgeable2 = z16 ? (Badgeable) c6zVar : null;
        BadgesSet u0 = badgeable2 != null ? badgeable2.u0() : null;
        int i8 = u0 != null ? u0.f : -1;
        NewsEntry newsEntry3 = (NewsEntry) c6zVar;
        if (newsEntry3 instanceof wsx0) {
            EntryHeader header = ((wsx0) newsEntry3).getHeader();
            if ((header != null ? header.h : null) == null) {
                z5 = true;
                boolean z17 = z5;
                boolean z18 = z5 && !(c6zVar instanceof Videos) && w0 > 0;
                boolean z19 = !z17 && c(newsEntry3, newsEntry2) > 0;
                z6 = newsEntry3 instanceof c6z;
                if (z6) {
                    z7 = z6;
                    if (newsEntry3 instanceof FaveEntry) {
                        Object obj = ((FaveEntry) newsEntry3).i.f;
                        z8 = z16;
                        if (obj instanceof Post) {
                            if (di60.I(obj != null ? (NewsEntry) obj : null)) {
                                o2f0 o2f0Var2 = (o2f0) obj;
                                p4 = h170Var.g() ? o2f0Var2.p4() : o2f0Var2.c8();
                                reactionMeta = p4;
                            }
                            reactionMeta = null;
                        } else {
                            if (obj instanceof VideoAttachment) {
                                Object Pa = ((VideoAttachment) obj).k.Pa();
                                o2f0 o2f0Var3 = Pa instanceof o2f0 ? (o2f0) Pa : null;
                                if (di60.I(Pa instanceof NewsEntry ? (NewsEntry) Pa : null) && o2f0Var3 != null) {
                                    p4 = h170Var.g() ? o2f0Var3.p4() : o2f0Var3.c8();
                                    reactionMeta = p4;
                                }
                            }
                            reactionMeta = null;
                        }
                    }
                    z8 = z16;
                    reactionMeta = null;
                } else {
                    z7 = z6;
                    o2f0 o2f0Var4 = newsEntry3 instanceof o2f0 ? (o2f0) newsEntry3 : null;
                    if (o2f0Var4 != null && di60.I(newsEntry3)) {
                        p4 = h170Var.g() ? o2f0Var4.p4() : o2f0Var4.c8();
                        z8 = z16;
                        reactionMeta = p4;
                    }
                    z8 = z16;
                    reactionMeta = null;
                }
                boolean J = c6zVar.J();
                if (z7) {
                    z9 = J;
                    if (newsEntry3 instanceof FaveEntry) {
                        Object obj2 = ((FaveEntry) newsEntry3).i.f;
                        reactionMeta2 = reactionMeta;
                        if (obj2 instanceof Post) {
                            if (di60.I(obj2 != null ? (NewsEntry) obj2 : null)) {
                                G4 = ((Post) obj2).G4();
                                String c2 = pa2.c(reactionMeta2);
                                boolean z20 = G4;
                                if (reactionMeta2 != null) {
                                }
                                if (((h170) pa2Var.b).g()) {
                                }
                                String z21 = sa30.z(E1, s1c0Var);
                                boolean z22 = z10;
                                boolean z23 = z9;
                                String z24 = sa30.z(T9, s1c0Var);
                                String z25 = sa30.z(w0, s1c0Var);
                                ReactionMeta reactionMeta3 = reactionMeta2;
                                String z26 = sa30.z(i7, s1c0Var);
                                int c3 = c(newsEntry3, newsEntry2);
                                boolean h2 = h(newsEntry3);
                                if (E1 <= 0) {
                                }
                                boolean i9 = i(newsEntry3);
                                if (i7 <= 0) {
                                }
                                boolean j2 = j(newsEntry3);
                                int A = sa30.A(newsEntry3);
                                boolean a3 = pa2.a(newsEntry3);
                                String str = r1;
                                boolean z27 = c6zVar instanceof o2f0;
                                if (!z27) {
                                }
                                if (c6zVar.T9() != 0) {
                                }
                                z12 = z11;
                                z13 = false;
                                if ((z12 ? (o2f0) c6zVar : null) != null) {
                                }
                                z14 = false;
                                boolean I3 = di60.I(newsEntry3);
                                if (di60.I(newsEntry3)) {
                                }
                                boolean g3 = g(newsEntry3, s1c0Var);
                                boolean e3 = e(newsEntry3, s1c0Var);
                                boolean f3 = f(newsEntry3, s1c0Var);
                                boolean D = f9t.D(booleanValue, !z22 ? (Badgeable) c6zVar : null, s1c0Var);
                                boolean b3 = h170Var.b();
                                if (!(newsEntry2 instanceof Post)) {
                                }
                                if (r1 == null) {
                                }
                                List t = f9t.t(u0, false);
                                List t2 = f9t.t(u0, true);
                                boolean r = f9t.r(u0);
                                boolean i10 = tni.i(newsEntry3);
                                if (newsEntry3 instanceof Post) {
                                }
                                z15 = false;
                                return Collections.singletonList(new q6s(z23, false, z20, reactionMeta3, c2, str, O8, i6, i5, T9, E1, i7, w0, i8, z24, z21, z26, z25, false, false, R.string.video_remove_from_added, 0, h2, r29, i9, r31, j2, A, z18, z19, a3, true, z13, z14, I3, r41, g3, e3, f3, intValue, intValue2, booleanValue, D, b3, r50, t2, t, r, c3, i10, z15, newsEntry3, newsEntry2, 0));
                            }
                        }
                    }
                    reactionMeta2 = reactionMeta;
                } else {
                    z9 = J;
                    o2f0 o2f0Var5 = newsEntry3 instanceof o2f0 ? (o2f0) newsEntry3 : null;
                    if (o2f0Var5 != null && di60.I(newsEntry3)) {
                        G4 = o2f0Var5.G4();
                        reactionMeta2 = reactionMeta;
                        String c22 = pa2.c(reactionMeta2);
                        boolean z202 = G4;
                        String str2 = (reactionMeta2 != null || (d = reactionMeta2.d()) == null) ? null : d.b;
                        if (((h170) pa2Var.b).g()) {
                            if (o2f0Var != null) {
                                O8 = o2f0Var.O8(3);
                                z10 = z8;
                            }
                            z10 = z8;
                            O8 = null;
                        } else {
                            if (o2f0Var != null) {
                                O8 = o2f0Var.v8();
                                z10 = z8;
                            }
                            z10 = z8;
                            O8 = null;
                        }
                        String z212 = sa30.z(E1, s1c0Var);
                        boolean z222 = z10;
                        boolean z232 = z9;
                        String z242 = sa30.z(T9, s1c0Var);
                        String z252 = sa30.z(w0, s1c0Var);
                        ReactionMeta reactionMeta32 = reactionMeta2;
                        String z262 = sa30.z(i7, s1c0Var);
                        int c32 = c(newsEntry3, newsEntry2);
                        boolean h22 = h(newsEntry3);
                        boolean z28 = E1 <= 0;
                        boolean i92 = i(newsEntry3);
                        boolean z29 = i7 <= 0;
                        boolean j22 = j(newsEntry3);
                        int A2 = sa30.A(newsEntry3);
                        boolean a32 = pa2.a(newsEntry3);
                        String str3 = str2;
                        boolean z272 = c6zVar instanceof o2f0;
                        o2f0 o2f0Var6 = !z272 ? (o2f0) c6zVar : null;
                        if (c6zVar.T9() != 0) {
                            z11 = z272;
                            if (((o2f0Var6 == null || (K = o2f0Var6.K()) == null) ? 0 : K.c) == 0 && s1c0Var.i) {
                                z12 = z11;
                                z13 = true;
                                if ((z12 ? (o2f0) c6zVar : null) != null) {
                                    if (di60.I(c6zVar instanceof NewsEntry ? newsEntry3 : null)) {
                                        z14 = s1c0Var.h;
                                        boolean I32 = di60.I(newsEntry3);
                                        int b4 = di60.I(newsEntry3) ? 0 : cn70.b(8);
                                        boolean g32 = g(newsEntry3, s1c0Var);
                                        boolean e32 = e(newsEntry3, s1c0Var);
                                        boolean f32 = f(newsEntry3, s1c0Var);
                                        boolean D2 = f9t.D(booleanValue, !z222 ? (Badgeable) c6zVar : null, s1c0Var);
                                        boolean b32 = h170Var.b();
                                        Post post2 = !(newsEntry2 instanceof Post) ? (Post) newsEntry2 : null;
                                        boolean Tb = post2 == null ? post2.Tb() : false;
                                        List t3 = f9t.t(u0, false);
                                        List t22 = f9t.t(u0, true);
                                        boolean r2 = f9t.r(u0);
                                        boolean i102 = tni.i(newsEntry3);
                                        if (newsEntry3 instanceof Post) {
                                            if (!BuildInfo.s() ? false : !((Post) newsEntry3).b9()) {
                                                z15 = true;
                                                return Collections.singletonList(new q6s(z232, false, z202, reactionMeta32, c22, str3, O8, i6, i5, T9, E1, i7, w0, i8, z242, z212, z262, z252, false, false, R.string.video_remove_from_added, 0, h22, z28, i92, z29, j22, A2, z18, z19, a32, true, z13, z14, I32, b4, g32, e32, f32, intValue, intValue2, booleanValue, D2, b32, Tb, t22, t3, r2, c32, i102, z15, newsEntry3, newsEntry2, 0));
                                            }
                                        }
                                        z15 = false;
                                        return Collections.singletonList(new q6s(z232, false, z202, reactionMeta32, c22, str3, O8, i6, i5, T9, E1, i7, w0, i8, z242, z212, z262, z252, false, false, R.string.video_remove_from_added, 0, h22, z28, i92, z29, j22, A2, z18, z19, a32, true, z13, z14, I32, b4, g32, e32, f32, intValue, intValue2, booleanValue, D2, b32, Tb, t22, t3, r2, c32, i102, z15, newsEntry3, newsEntry2, 0));
                                    }
                                }
                                z14 = false;
                                boolean I322 = di60.I(newsEntry3);
                                if (di60.I(newsEntry3)) {
                                }
                                boolean g322 = g(newsEntry3, s1c0Var);
                                boolean e322 = e(newsEntry3, s1c0Var);
                                boolean f322 = f(newsEntry3, s1c0Var);
                                boolean D22 = f9t.D(booleanValue, !z222 ? (Badgeable) c6zVar : null, s1c0Var);
                                boolean b322 = h170Var.b();
                                if (!(newsEntry2 instanceof Post)) {
                                }
                                if (post2 == null) {
                                }
                                List t32 = f9t.t(u0, false);
                                List t222 = f9t.t(u0, true);
                                boolean r22 = f9t.r(u0);
                                boolean i1022 = tni.i(newsEntry3);
                                if (newsEntry3 instanceof Post) {
                                }
                                z15 = false;
                                return Collections.singletonList(new q6s(z232, false, z202, reactionMeta32, c22, str3, O8, i6, i5, T9, E1, i7, w0, i8, z242, z212, z262, z252, false, false, R.string.video_remove_from_added, 0, h22, z28, i92, z29, j22, A2, z18, z19, a32, true, z13, z14, I322, b4, g322, e322, f322, intValue, intValue2, booleanValue, D22, b322, Tb, t222, t32, r22, c32, i1022, z15, newsEntry3, newsEntry2, 0));
                            }
                        } else {
                            z11 = z272;
                        }
                        z12 = z11;
                        z13 = false;
                        if ((z12 ? (o2f0) c6zVar : null) != null) {
                        }
                        z14 = false;
                        boolean I3222 = di60.I(newsEntry3);
                        if (di60.I(newsEntry3)) {
                        }
                        boolean g3222 = g(newsEntry3, s1c0Var);
                        boolean e3222 = e(newsEntry3, s1c0Var);
                        boolean f3222 = f(newsEntry3, s1c0Var);
                        boolean D222 = f9t.D(booleanValue, !z222 ? (Badgeable) c6zVar : null, s1c0Var);
                        boolean b3222 = h170Var.b();
                        if (!(newsEntry2 instanceof Post)) {
                        }
                        if (post2 == null) {
                        }
                        List t322 = f9t.t(u0, false);
                        List t2222 = f9t.t(u0, true);
                        boolean r222 = f9t.r(u0);
                        boolean i10222 = tni.i(newsEntry3);
                        if (newsEntry3 instanceof Post) {
                        }
                        z15 = false;
                        return Collections.singletonList(new q6s(z232, false, z202, reactionMeta32, c22, str3, O8, i6, i5, T9, E1, i7, w0, i8, z242, z212, z262, z252, false, false, R.string.video_remove_from_added, 0, h22, z28, i92, z29, j22, A2, z18, z19, a32, true, z13, z14, I3222, b4, g3222, e3222, f3222, intValue, intValue2, booleanValue, D222, b3222, Tb, t2222, t322, r222, c32, i10222, z15, newsEntry3, newsEntry2, 0));
                    }
                    reactionMeta2 = reactionMeta;
                }
                G4 = false;
                String c222 = pa2.c(reactionMeta2);
                boolean z2022 = G4;
                if (reactionMeta2 != null) {
                }
                if (((h170) pa2Var.b).g()) {
                }
                String z2122 = sa30.z(E1, s1c0Var);
                boolean z2222 = z10;
                boolean z2322 = z9;
                String z2422 = sa30.z(T9, s1c0Var);
                String z2522 = sa30.z(w0, s1c0Var);
                ReactionMeta reactionMeta322 = reactionMeta2;
                String z2622 = sa30.z(i7, s1c0Var);
                int c322 = c(newsEntry3, newsEntry2);
                boolean h222 = h(newsEntry3);
                if (E1 <= 0) {
                }
                boolean i922 = i(newsEntry3);
                if (i7 <= 0) {
                }
                boolean j222 = j(newsEntry3);
                int A22 = sa30.A(newsEntry3);
                boolean a322 = pa2.a(newsEntry3);
                String str32 = str2;
                boolean z2722 = c6zVar instanceof o2f0;
                if (!z2722) {
                }
                if (c6zVar.T9() != 0) {
                }
                z12 = z11;
                z13 = false;
                if ((z12 ? (o2f0) c6zVar : null) != null) {
                }
                z14 = false;
                boolean I32222 = di60.I(newsEntry3);
                if (di60.I(newsEntry3)) {
                }
                boolean g32222 = g(newsEntry3, s1c0Var);
                boolean e32222 = e(newsEntry3, s1c0Var);
                boolean f32222 = f(newsEntry3, s1c0Var);
                boolean D2222 = f9t.D(booleanValue, !z2222 ? (Badgeable) c6zVar : null, s1c0Var);
                boolean b32222 = h170Var.b();
                if (!(newsEntry2 instanceof Post)) {
                }
                if (post2 == null) {
                }
                List t3222 = f9t.t(u0, false);
                List t22222 = f9t.t(u0, true);
                boolean r2222 = f9t.r(u0);
                boolean i102222 = tni.i(newsEntry3);
                if (newsEntry3 instanceof Post) {
                }
                z15 = false;
                return Collections.singletonList(new q6s(z2322, false, z2022, reactionMeta322, c222, str32, O8, i6, i5, T9, E1, i7, w0, i8, z2422, z2122, z2622, z2522, false, false, R.string.video_remove_from_added, 0, h222, z28, i922, z29, j222, A22, z18, z19, a322, true, z13, z14, I32222, b4, g32222, e32222, f32222, intValue, intValue2, booleanValue, D2222, b32222, Tb, t22222, t3222, r2222, c322, i102222, z15, newsEntry3, newsEntry2, 0));
            }
        }
        z5 = false;
        boolean z172 = z5;
        if (z5) {
        }
        if (z172) {
        }
        z6 = newsEntry3 instanceof c6z;
        if (z6) {
        }
        boolean J2 = c6zVar.J();
        if (z7) {
        }
        G4 = false;
        String c2222 = pa2.c(reactionMeta2);
        boolean z20222 = G4;
        if (reactionMeta2 != null) {
        }
        if (((h170) pa2Var.b).g()) {
        }
        String z21222 = sa30.z(E1, s1c0Var);
        boolean z22222 = z10;
        boolean z23222 = z9;
        String z24222 = sa30.z(T9, s1c0Var);
        String z25222 = sa30.z(w0, s1c0Var);
        ReactionMeta reactionMeta3222 = reactionMeta2;
        String z26222 = sa30.z(i7, s1c0Var);
        int c3222 = c(newsEntry3, newsEntry2);
        boolean h2222 = h(newsEntry3);
        if (E1 <= 0) {
        }
        boolean i9222 = i(newsEntry3);
        if (i7 <= 0) {
        }
        boolean j2222 = j(newsEntry3);
        int A222 = sa30.A(newsEntry3);
        boolean a3222 = pa2.a(newsEntry3);
        String str322 = str2;
        boolean z27222 = c6zVar instanceof o2f0;
        if (!z27222) {
        }
        if (c6zVar.T9() != 0) {
        }
        z12 = z11;
        z13 = false;
        if ((z12 ? (o2f0) c6zVar : null) != null) {
        }
        z14 = false;
        boolean I322222 = di60.I(newsEntry3);
        if (di60.I(newsEntry3)) {
        }
        boolean g322222 = g(newsEntry3, s1c0Var);
        boolean e322222 = e(newsEntry3, s1c0Var);
        boolean f322222 = f(newsEntry3, s1c0Var);
        boolean D22222 = f9t.D(booleanValue, !z22222 ? (Badgeable) c6zVar : null, s1c0Var);
        boolean b322222 = h170Var.b();
        if (!(newsEntry2 instanceof Post)) {
        }
        if (post2 == null) {
        }
        List t32222 = f9t.t(u0, false);
        List t222222 = f9t.t(u0, true);
        boolean r22222 = f9t.r(u0);
        boolean i1022222 = tni.i(newsEntry3);
        if (newsEntry3 instanceof Post) {
        }
        z15 = false;
        return Collections.singletonList(new q6s(z23222, false, z20222, reactionMeta3222, c2222, str322, O8, i6, i5, T9, E1, i7, w0, i8, z24222, z21222, z26222, z25222, false, false, R.string.video_remove_from_added, 0, h2222, z28, i9222, z29, j2222, A222, z18, z19, a3222, true, z13, z14, I322222, b4, g322222, e322222, f322222, intValue, intValue2, booleanValue, D22222, b322222, Tb, t222222, t32222, r22222, c3222, i1022222, z15, newsEntry3, newsEntry2, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return l(0, (Triple) pair);
    }

    public uy9() {
        this.b = new StringBuilder();
        this.c = NumberFormat.getCurrencyInstance();
    }

    public uy9(m090 m090Var) {
        this.b = m090Var;
        this.c = io.reactivex.rxjava3.subjects.d.N0();
    }

    public uy9(h170 h170Var) {
        pa2 pa2Var = new pa2(h170Var);
        this.b = h170Var;
        this.c = pa2Var;
    }

    public uy9(UserId userId) {
        zqu zquVar = new zqu();
        this.b = userId;
        this.c = zquVar;
    }
}
