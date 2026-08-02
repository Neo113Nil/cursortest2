package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.typography.FontFamily;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;

/* compiled from: VideoTextHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class pjt0 implements gn60<a, wm60> {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new wqf0(9));

    /* compiled from: VideoTextHolderTransformer.kt */
    public static final class a {
        public final Videos a;
        public final NewsEntry b;
        public final boolean c;
        public final boolean d;
        public final v1c0 e;

        public a(Videos videos, NewsEntry newsEntry, boolean z, boolean z2, v1c0 v1c0Var) {
            this.a = videos;
            this.b = newsEntry;
            this.c = z;
            this.d = z2;
            this.e = v1c0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(qoy.b(e630.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "Params(entry=" + this.a + ", rootEntry=" + this.b + ", isInRepost=" + this.c + ", isInLegoTheme=" + this.d + ", postDisplayItemEntryContext=" + this.e + ')';
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0087, code lost:
    
        if (r1.Ea() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0089, code lost:
    
        r16 = new xsna.ej90.b(null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, 0, 0, null, com.vk.common.links.LinksParserData.HashtagService.Clips, 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bf, code lost:
    
        r0 = new xsna.fj90(xsna.rte0.h(xsna.ej90.a.b(r9, r16, 4), r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a5, code lost:
    
        r16 = new xsna.ej90.b(null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, 0, 0, null, null, ru.ok.android.api.core.ApiInvocationException.ErrorCodes.IDS_BLOCKED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cd, code lost:
    
        r11 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(a aVar) {
        VideoAttachment videoAttachment;
        VideoFile videoFile;
        String title;
        String str;
        fj90 fj90Var;
        boolean z;
        Integer num;
        Videos videos = aVar.a;
        NewsEntry newsEntry = aVar.b;
        boolean z2 = aVar.c;
        boolean z3 = aVar.d;
        v1c0 v1c0Var = aVar.e;
        FontFamily fontFamily = FontFamily.REGULAR;
        float e = cn70.e() * 2.25f;
        float a2 = cn70.a() * 4.0f;
        int b = cn70.b(8);
        if (videos.Ea()) {
            VideoAttachment j = di60.j(videos);
            VideoFile videoFile2 = j != null ? j.k : null;
            ClipVideoFile clipVideoFile = videoFile2 instanceof ClipVideoFile ? (ClipVideoFile) videoFile2 : null;
            if (clipVideoFile != null) {
                title = clipVideoFile.m;
                str = title;
            }
            str = null;
        } else {
            if (di60.L(videos) && (videoAttachment = (VideoAttachment) j5g.a0(videos.Pb())) != null && (videoFile = videoAttachment.k) != null) {
                title = videoFile.getTitle();
                str = title;
            }
            str = null;
        }
        if (!videos.Ea() && (!di60.L(videos) || !((Boolean) this.b.getValue()).booleanValue())) {
            fj90Var = null;
            if (v1c0Var.f) {
                num = Integer.MAX_VALUE;
            } else if (di60.j(videos) != null) {
                num = 1;
            } else {
                boolean J = di60.J(videos);
                List<EntryAttachment> list = videos.u;
                if (J) {
                    z = true;
                } else {
                    List<EntryAttachment> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (!(((EntryAttachment) it.next()).c instanceof CompactAttachmentStyle)) {
                                z = !list.isEmpty();
                                break;
                            }
                        }
                    }
                    z = false;
                }
                num = z ? 3 : 10;
            }
            msy.a(LazyThreadSafetyMode.NONE, new exw(5));
            NewsEntry newsEntry2 = v1c0Var.b;
            s1q c = !ydo0.d(newsEntry2) ? ydo0.c(newsEntry2) : null;
            s1q a3 = c == null ? s1q.a(c, num.intValue(), 62) : null;
            Pair o = ad0.o(videos);
            return Collections.singletonList(new dio0(videos, newsEntry, z2, z3, v1c0Var, str, fj90Var, fontFamily, true, 15.0f, a3, a3 == null, (int) a2, b, e, 1.0f, ad0.E(videos), ad0.v(videos, newsEntry), ad0.A(videos, newsEntry), ad0.p(videos), (String) o.i(), (String) o.j(), false));
        }
        Object fj90Var2 = null;
        Object failure = fj90Var2;
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        fj90Var = (fj90) failure;
        if (v1c0Var.f) {
        }
        msy.a(LazyThreadSafetyMode.NONE, new exw(5));
        NewsEntry newsEntry22 = v1c0Var.b;
        if (!ydo0.d(newsEntry22)) {
        }
        if (c == null) {
        }
        Pair o2 = ad0.o(videos);
        return Collections.singletonList(new dio0(videos, newsEntry, z2, z3, v1c0Var, str, fj90Var, fontFamily, true, 15.0f, a3, a3 == null, (int) a2, b, e, 1.0f, ad0.E(videos), ad0.v(videos, newsEntry), ad0.A(videos, newsEntry), ad0.p(videos), (String) o2.i(), (String) o2.j(), false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((a) pair);
    }
}
