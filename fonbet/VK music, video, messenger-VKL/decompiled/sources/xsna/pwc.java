package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: ClipFeedItemReactionsStateMapper.kt */
/* loaded from: classes17.dex */
public final class pwc implements gn60, dfh {
    public final Object b;
    public final Object c;

    public /* synthetic */ pwc(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public static int c(FaveEntry faveEntry, NewsEntry newsEntry) {
        gmq gmqVar = faveEntry.i.f;
        if (!(gmqVar instanceof Post) || (newsEntry instanceof PromoPost)) {
            return 0;
        }
        return ((Post) gmqVar).r;
    }

    public static int d(FaveEntry faveEntry) {
        if (di60.I(faveEntry)) {
            return cn70.b(8);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(FaveEntry faveEntry, s1c0 s1c0Var) {
        BadgesSet u0;
        if (faveEntry instanceof c6z) {
            Badgeable badgeable = faveEntry instanceof Badgeable ? (Badgeable) faveEntry : null;
            u0 = badgeable != null ? badgeable.u0() : null;
            return s1c0Var.i && u0 != null && !u0.e.isEmpty() && u0.f > 0;
        }
        gmq gmqVar = faveEntry.i.f;
        if (gmqVar instanceof Post) {
            Badgeable badgeable2 = gmqVar != null ? (Badgeable) gmqVar : null;
            u0 = badgeable2 != null ? badgeable2.u0() : null;
            return s1c0Var.i && u0 != null && !u0.e.isEmpty() && u0.f > 0;
        }
        if ((gmqVar instanceof ArticleAttachment) || !(gmqVar instanceof VideoAttachment)) {
            return false;
        }
        VideoFile videoFile = ((VideoAttachment) gmqVar).k;
        Badgeable badgeable3 = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
        u0 = badgeable3 != null ? badgeable3.u0() : null;
        return s1c0Var.i && u0 != null && !u0.e.isEmpty() && u0.f > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(FaveEntry faveEntry, s1c0 s1c0Var) {
        if (faveEntry instanceof c6z) {
            Badgeable badgeable = faveEntry instanceof Badgeable ? (Badgeable) faveEntry : null;
            if (!s1c0Var.i) {
                return false;
            }
            BadgesSet u0 = badgeable != null ? badgeable.u0() : null;
            if (u0 == null || u0.e.isEmpty() || u0.f <= 0) {
                return (badgeable != null ? badgeable.ca() : null) != null && s1c0Var.k;
            }
            return false;
        }
        gmq gmqVar = faveEntry.i.f;
        if (gmqVar instanceof Post) {
            Badgeable badgeable2 = gmqVar != null ? (Badgeable) gmqVar : null;
            if (!s1c0Var.i) {
                return false;
            }
            BadgesSet u02 = badgeable2 != null ? badgeable2.u0() : null;
            if (u02 == null || u02.e.isEmpty() || u02.f <= 0) {
                return (badgeable2 != null ? badgeable2.ca() : null) != null && s1c0Var.k;
            }
            return false;
        }
        if ((gmqVar instanceof ArticleAttachment) || !(gmqVar instanceof VideoAttachment)) {
            return false;
        }
        VideoFile videoFile = ((VideoAttachment) gmqVar).k;
        Badgeable badgeable3 = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
        if (!s1c0Var.i) {
            return false;
        }
        BadgesSet u03 = badgeable3 != null ? badgeable3.u0() : null;
        if (u03 == null || u03.e.isEmpty() || u03.f <= 0) {
            return (badgeable3 != null ? badgeable3.ca() : null) != null && s1c0Var.k;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(FaveEntry faveEntry, s1c0 s1c0Var) {
        if (faveEntry instanceof c6z) {
            Badgeable badgeable = faveEntry instanceof Badgeable ? (Badgeable) faveEntry : null;
            boolean z = s1c0Var.k;
            if (s1c0Var.i && badgeable != null && badgeable.u0() != null) {
                BadgesSet u0 = badgeable.u0();
                if (((u0 != null ? u0.f : 0) > 0 || z) && (z || !epx.f(null, Boolean.TRUE))) {
                    return true;
                }
            }
        } else {
            gmq gmqVar = faveEntry.i.f;
            if (gmqVar instanceof Post) {
                Badgeable badgeable2 = gmqVar != null ? (Badgeable) gmqVar : null;
                Post post = gmqVar != null ? (Post) gmqVar : null;
                Boolean valueOf = post != null ? Boolean.valueOf(post.gc()) : null;
                boolean z2 = s1c0Var.k;
                if (s1c0Var.i && badgeable2 != null && badgeable2.u0() != null) {
                    BadgesSet u02 = badgeable2.u0();
                    if (((u02 != null ? u02.f : 0) > 0 || z2) && (z2 || !epx.f(valueOf, Boolean.TRUE))) {
                        return true;
                    }
                }
            } else if (!(gmqVar instanceof ArticleAttachment) && (gmqVar instanceof VideoAttachment)) {
                VideoFile videoFile = ((VideoAttachment) gmqVar).k;
                Badgeable badgeable3 = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
                Boolean bool = Boolean.FALSE;
                boolean z3 = s1c0Var.k;
                if (s1c0Var.i && badgeable3 != null && badgeable3.u0() != null) {
                    BadgesSet u03 = badgeable3.u0();
                    if (((u03 != null ? u03.f : 0) > 0 || z3) && (z3 || !bool.equals(Boolean.TRUE))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean i(FaveEntry faveEntry) {
        if (!(faveEntry instanceof c6z)) {
            gmq gmqVar = faveEntry.i.f;
            if (gmqVar instanceof Post) {
                Post post = (Post) gmqVar;
                boolean z = post.dc() || post.F;
                Post post2 = gmqVar != null ? post : null;
                boolean z2 = post2 != null && post2.ic();
                if (post.qa() || (!z && !z2)) {
                }
            } else if (!(gmqVar instanceof ArticleAttachment) && (gmqVar instanceof VideoAttachment)) {
                return ((VideoAttachment) gmqVar).k.Pa().qa();
            }
            return false;
        }
        ((c6z) faveEntry).qa();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean j(FaveEntry faveEntry) {
        if (faveEntry instanceof c6z) {
            return ((faveEntry instanceof o2f0 ? (o2f0) faveEntry : null) != null && di60.I(faveEntry)) || ((grj0) faveEntry).T9() > 0;
        }
        Object obj = faveEntry.i.f;
        if (obj instanceof Post) {
            return di60.I((NewsEntry) obj) || ((Post) obj).E.b > 0;
        }
        return !(obj instanceof ArticleAttachment) && (obj instanceof VideoAttachment) && ((VideoAttachment) obj).k.Pa().T9() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean k(FaveEntry faveEntry) {
        if (faveEntry instanceof c6z) {
            o2f0 o2f0Var = faveEntry instanceof o2f0 ? (o2f0) faveEntry : null;
            if (o2f0Var == null || !di60.I(faveEntry)) {
                return false;
            }
            return o2f0Var.G4();
        }
        gmq gmqVar = faveEntry.i.f;
        if (!(gmqVar instanceof Post)) {
            return false;
        }
        if (di60.I(gmqVar != null ? (NewsEntry) gmqVar : null)) {
            return ((Post) gmqVar).G4();
        }
        return false;
    }

    public static boolean l(FaveEntry faveEntry) {
        if (!(faveEntry instanceof c6z)) {
            gmq gmqVar = faveEntry.i.f;
            if (!(gmqVar instanceof Post) ? !(!(gmqVar instanceof ArticleAttachment) && (gmqVar instanceof VideoAttachment)) : ((Post) gmqVar).qc()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.dfh
    public CommunityProfileContentItem a() {
        return (p8u) this.c;
    }

    @Override // xsna.dfh
    public String b() {
        return (String) this.b;
    }

    public ReactionMeta e(FaveEntry faveEntry) {
        h170 h170Var = (h170) this.b;
        Object obj = faveEntry.i.f;
        if (obj instanceof Post) {
            if (di60.I(obj != null ? (NewsEntry) obj : null)) {
                o2f0 o2f0Var = (o2f0) obj;
                return h170Var.g() ? o2f0Var.p4() : o2f0Var.c8();
            }
        } else if (obj instanceof VideoAttachment) {
            Object Pa = ((VideoAttachment) obj).k.Pa();
            o2f0 o2f0Var2 = Pa instanceof o2f0 ? (o2f0) Pa : null;
            if (di60.I(Pa instanceof NewsEntry ? (NewsEntry) Pa : null) && o2f0Var2 != null) {
                return h170Var.g() ? o2f0Var2.p4() : o2f0Var2.c8();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List m(int i, Triple triple) {
        ReactionAsset d;
        ReactionAsset d2;
        ReactionAsset d3;
        ArrayList<ReactionMeta> O8;
        boolean z;
        int i2;
        boolean z2;
        ReactionAsset d4;
        h170 h170Var = (h170) this.b;
        pa2 pa2Var = (pa2) this.c;
        FaveEntry faveEntry = (FaveEntry) triple.d();
        NewsEntry newsEntry = (NewsEntry) triple.g();
        s1c0 s1c0Var = (s1c0) triple.h();
        gmq gmqVar = faveEntry.i.f;
        if (gmqVar instanceof Post) {
            Post post = (Post) gmqVar;
            Post post2 = post != null ? post : null;
            boolean J = post.J();
            Counters counters = post.E;
            ItemReactions itemReactions = post.W;
            int i3 = itemReactions != null ? itemReactions.c : 0;
            int i4 = itemReactions != null ? itemReactions.d : 0;
            Triple s = f9t.s(post.X, s1c0Var);
            boolean booleanValue = ((Boolean) s.d()).booleanValue();
            int intValue = ((Number) s.g()).intValue();
            int intValue2 = ((Number) s.h()).intValue();
            int i5 = i3;
            int i6 = counters.e;
            int i7 = counters.c;
            int i8 = counters.d;
            BadgesSet badgesSet = post.X;
            int i9 = badgesSet != null ? badgesSet.f : -1;
            boolean z3 = i6 > 0;
            boolean z4 = i7 > 0;
            int i10 = i9;
            EntryHeader entryHeader = post.y;
            boolean z5 = (entryHeader != null ? entryHeader.h : null) == null;
            boolean z6 = !z5 && i8 > 0;
            boolean z7 = z5 && c(faveEntry, newsEntry) > 0;
            ReactionMeta e = e(faveEntry);
            boolean k = k(faveEntry);
            String c = pa2.c(e);
            String str = (e == null || (d4 = e.d()) == null) ? null : d4.b;
            if (((h170) pa2Var.b).g()) {
                if (post2 != null) {
                    O8 = post2.v8();
                    z = J;
                    i2 = i4;
                }
                z = J;
                i2 = i4;
                O8 = null;
            } else {
                if (post2 != null) {
                    O8 = post2.O8(3);
                    z = J;
                    i2 = i4;
                }
                z = J;
                i2 = i4;
                O8 = null;
            }
            int i11 = counters.b;
            String z8 = sa30.z(i6, s1c0Var);
            ArrayList<ReactionMeta> arrayList = O8;
            String z9 = sa30.z(counters.b, s1c0Var);
            String z10 = sa30.z(i8, s1c0Var);
            String str2 = str;
            String z11 = sa30.z(i7, s1c0Var);
            int c2 = c(faveEntry, newsEntry);
            boolean i12 = i(faveEntry);
            boolean j = j(faveEntry);
            boolean l = l(faveEntry);
            int A = sa30.A(faveEntry);
            boolean a = pa2.a(faveEntry);
            if (counters.b == 0) {
                ItemReactions itemReactions2 = post.W;
                if ((itemReactions2 != null ? itemReactions2.c : 0) == 0 && s1c0Var.i) {
                    z2 = true;
                    boolean z12 = !di60.I(post) ? s1c0Var.h : false;
                    boolean I = di60.I(faveEntry);
                    int d5 = d(faveEntry);
                    boolean h = h(faveEntry, s1c0Var);
                    boolean f = f(faveEntry, s1c0Var);
                    boolean g = g(faveEntry, s1c0Var);
                    boolean D = f9t.D(booleanValue, post, s1c0Var);
                    boolean b = h170Var.b();
                    Post post3 = !(newsEntry instanceof Post) ? (Post) newsEntry : null;
                    return Collections.singletonList(new q6s(z, false, k, e, c, str2, arrayList, i2, i5, i11, i6, i7, i8, i10, z9, z8, z11, z10, false, false, R.string.video_remove_from_added, 0, i12, z3, j, z4, l, A, z6, z7, a, true, z2, z12, I, d5, h, f, g, intValue, intValue2, booleanValue, D, b, post3 == null ? post3.Tb() : false, f9t.t(badgesSet, true), f9t.t(badgesSet, false), f9t.r(badgesSet), c2, tni.i(faveEntry), false, faveEntry, newsEntry, 0));
                }
            }
            z2 = false;
            if (!di60.I(post)) {
            }
            boolean I2 = di60.I(faveEntry);
            int d52 = d(faveEntry);
            boolean h2 = h(faveEntry, s1c0Var);
            boolean f2 = f(faveEntry, s1c0Var);
            boolean g2 = g(faveEntry, s1c0Var);
            boolean D2 = f9t.D(booleanValue, post, s1c0Var);
            boolean b2 = h170Var.b();
            if (!(newsEntry instanceof Post)) {
            }
            return Collections.singletonList(new q6s(z, false, k, e, c, str2, arrayList, i2, i5, i11, i6, i7, i8, i10, z9, z8, z11, z10, false, false, R.string.video_remove_from_added, 0, i12, z3, j, z4, l, A, z6, z7, a, true, z2, z12, I2, d52, h2, f2, g2, intValue, intValue2, booleanValue, D2, b2, post3 == null ? post3.Tb() : false, f9t.t(badgesSet, true), f9t.t(badgesSet, false), f9t.r(badgesSet), c2, tni.i(faveEntry), false, faveEntry, newsEntry, 0));
        }
        if (gmqVar instanceof ArticleAttachment) {
            int i13 = ((ArticleAttachment) gmqVar).f.m;
            boolean z13 = i13 > 0;
            ReactionMeta e2 = e(faveEntry);
            boolean k2 = k(faveEntry);
            String c3 = pa2.c(e2);
            String str3 = (e2 == null || (d3 = e2.d()) == null) ? null : d3.b;
            int c4 = c(faveEntry, newsEntry);
            boolean i14 = i(faveEntry);
            boolean j2 = j(faveEntry);
            boolean l2 = l(faveEntry);
            boolean a2 = pa2.a(faveEntry);
            boolean I3 = di60.I(faveEntry);
            int d6 = d(faveEntry);
            boolean h3 = h(faveEntry, s1c0Var);
            boolean f3 = f(faveEntry, s1c0Var);
            boolean g3 = g(faveEntry, s1c0Var);
            boolean b3 = h170Var.b();
            Post post4 = newsEntry instanceof Post ? (Post) newsEntry : null;
            boolean Tb = post4 != null ? post4.Tb() : false;
            EmptyList emptyList = EmptyList.b;
            return Collections.singletonList(new q6s(false, false, k2, e2, c3, str3, null, 0, 0, 0, 0, 0, i13, 0, null, null, null, null, false, false, R.string.video_remove_from_added, 0, i14, false, j2, true, l2, R.drawable.vk_icon_share_outline_24, z13, false, a2, false, false, false, I3, d6, h3, f3, g3, 0, 0, false, false, b3, Tb, emptyList, emptyList, false, c4, tni.i(faveEntry), false, faveEntry, newsEntry, 0));
        }
        if (!(gmqVar instanceof VideoAttachment)) {
            ReactionMeta e3 = e(faveEntry);
            boolean k3 = k(faveEntry);
            String c5 = pa2.c(e3);
            String str4 = (e3 == null || (d = e3.d()) == null) ? null : d.b;
            int c6 = c(faveEntry, newsEntry);
            boolean i15 = i(faveEntry);
            boolean j3 = j(faveEntry);
            boolean l3 = l(faveEntry);
            boolean a3 = pa2.a(faveEntry);
            boolean I4 = di60.I(faveEntry);
            int d7 = d(faveEntry);
            boolean h4 = h(faveEntry, s1c0Var);
            boolean f4 = f(faveEntry, s1c0Var);
            boolean g4 = g(faveEntry, s1c0Var);
            EmptyList emptyList2 = EmptyList.b;
            boolean i16 = tni.i(faveEntry);
            boolean b4 = h170Var.b();
            Post post5 = newsEntry instanceof Post ? (Post) newsEntry : null;
            return Collections.singletonList(new q6s(false, false, k3, e3, c5, str4, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, false, false, R.string.video_remove_from_added, 0, i15, false, j3, false, l3, R.drawable.vk_icon_share_outline_24, false, false, a3, false, false, false, I4, d7, h4, f4, g4, 0, 0, false, false, b4, post5 != null ? post5.Tb() : false, emptyList2, emptyList2, false, c6, i16, false, faveEntry, newsEntry, 0));
        }
        VideoAttachment videoAttachment = (VideoAttachment) gmqVar;
        int T9 = videoAttachment.k.Pa().T9();
        int E1 = videoAttachment.k.Pa().E1();
        int i72 = videoAttachment.k.Pa().i7();
        int w0 = videoAttachment.k.Pa().w0();
        VideoFile videoFile = videoAttachment.k;
        Badgeable badgeable = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
        BadgesSet u0 = badgeable != null ? badgeable.u0() : null;
        int i17 = u0 != null ? u0.f : -1;
        boolean z14 = E1 > 0;
        boolean z15 = i72 > 0;
        boolean j0 = videoAttachment.k.j0();
        boolean z16 = !j0;
        boolean i92 = videoAttachment.k.i9();
        boolean J2 = videoAttachment.k.Pa().J();
        ReactionMeta e4 = e(faveEntry);
        boolean k4 = k(faveEntry);
        String c7 = pa2.c(e4);
        String str5 = (e4 == null || (d2 = e4.d()) == null) ? null : d2.b;
        String z17 = sa30.z(E1, s1c0Var);
        String z18 = sa30.z(T9, s1c0Var);
        String z19 = sa30.z(w0, s1c0Var);
        String z20 = sa30.z(i72, s1c0Var);
        int c8 = c(faveEntry, newsEntry);
        int i18 = !j0 ? R.string.video_add_to_added : R.string.video_remove_from_added;
        boolean i19 = i(faveEntry);
        boolean j4 = j(faveEntry);
        boolean l4 = l(faveEntry);
        int A2 = sa30.A(faveEntry);
        boolean a4 = pa2.a(faveEntry);
        boolean I5 = di60.I(faveEntry);
        int d8 = d(faveEntry);
        boolean h5 = h(faveEntry, s1c0Var);
        boolean f5 = f(faveEntry, s1c0Var);
        boolean g5 = g(faveEntry, s1c0Var);
        VideoFile videoFile2 = videoAttachment.k;
        boolean D3 = f9t.D(false, videoFile2 instanceof Badgeable ? (Badgeable) videoFile2 : null, s1c0Var);
        boolean b5 = h170Var.b();
        Post post6 = newsEntry instanceof Post ? (Post) newsEntry : null;
        return Collections.singletonList(new q6s(J2, false, k4, e4, c7, str5, null, 0, 0, T9, E1, i72, w0, i17, z18, z17, z20, z19, z16, i92, i18, 0, i19, z14, j4, z15, l4, A2, false, false, a4, false, false, false, I5, d8, h5, f5, g5, 0, 0, false, D3, b5, post6 != null ? post6.Tb() : false, f9t.t(u0, true), f9t.t(u0, false), f9t.r(u0), c8, tni.i(faveEntry), false, faveEntry, newsEntry, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return m(0, (Triple) pair);
    }

    public pwc() {
        this.b = owc.a;
        this.c = new mwc();
    }
}
