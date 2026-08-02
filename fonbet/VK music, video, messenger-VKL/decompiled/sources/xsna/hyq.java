package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.vk.common.links.LinksParserData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Episode;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: FeedDigestSpotlightTransformer.kt */
/* loaded from: classes4.dex */
public final class hyq implements gn60<Triple<? extends DigestItem, ? extends Digest, ? extends xah0>, wm60> {
    public final List a(int i, Triple triple) {
        Thumb thumb;
        String Ab;
        ImageSize Cb;
        Image image;
        ImageSize Cb2;
        Image image2;
        ImageSize Cb3;
        Image image3;
        ImageSize Cb4;
        String str;
        RoundedCornersDrawable roundedCornersDrawable;
        String str2;
        CharSequence charSequence;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        DigestItem digestItem = (DigestItem) triple.d();
        Digest digest = (Digest) triple.g();
        xah0 xah0Var = (xah0) triple.h();
        int i2 = xah0Var.b;
        float f = xah0Var.a;
        int min = Math.min(((int) (i2 * f)) - (xah0Var.c ? (int) (84 * f) : 0), (int) (640 * f));
        Attachment d = digestItem.d();
        Post post = digestItem.g;
        CharSequence charSequence2 = null;
        if (d instanceof PhotoAttachment) {
            ImageSize Cb5 = ((PhotoAttachment) d).l.y.Cb(min, true, false);
            if (Cb5 != null) {
                Ab = Cb5.d.d;
                str = Ab;
            }
            str = null;
        } else if (d instanceof VideoAttachment) {
            ImageSize Cb6 = ((VideoAttachment) d).k.getImage().Cb(min, true, false);
            if (Cb6 != null) {
                Ab = Cb6.d.d;
                str = Ab;
            }
            str = null;
        } else if (d instanceof SnippetAttachment) {
            Photo photo = ((SnippetAttachment) d).p;
            if (photo != null && (image3 = photo.y) != null && (Cb4 = image3.Cb(min, true, false)) != null) {
                Ab = Cb4.d.d;
                str = Ab;
            }
            str = null;
        } else if (d instanceof ArticleAttachment) {
            Photo photo2 = ((ArticleAttachment) d).f.l;
            if (photo2 != null && (image2 = photo2.y) != null && (Cb3 = image2.Cb(min, true, false)) != null) {
                Ab = Cb3.d.d;
                str = Ab;
            }
            str = null;
        } else if (d instanceof PodcastAttachment) {
            Episode episode = ((PodcastAttachment) d).f.w;
            if (episode != null && (image = episode.f) != null && (Cb2 = image.Cb(min, true, false)) != null) {
                Ab = Cb2.d.d;
                str = Ab;
            }
            str = null;
        } else if (d instanceof MarketAttachment) {
            Image image4 = ((MarketAttachment) d).f.n;
            if (image4 != null && (Cb = image4.Cb(min, true, false)) != null) {
                Ab = Cb.d.d;
                str = Ab;
            }
            str = null;
        } else {
            if (d instanceof AudioPlaylistAttachment) {
                Playlist playlist = ((AudioPlaylistAttachment) d).f;
                Thumb thumb2 = playlist.m;
                if (thumb2 != null) {
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    Ab = thumb2.Ab(min, false);
                } else {
                    List<Thumb> list = playlist.p;
                    if (list != null && (thumb = (Thumb) j5g.a0(list)) != null) {
                        Serializer.c<Thumb> cVar2 = Thumb.CREATOR;
                        Ab = thumb.Ab(min, false);
                    }
                }
                str = Ab;
            }
            str = null;
        }
        int i3 = post.E.e;
        String str3 = digestItem.k;
        if (str3 == null || str3.length() == 0) {
            roundedCornersDrawable = null;
        } else {
            float a = cn70.a() * 8.0f;
            int b = an10.b(20.4f);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            hny hnyVar = new hny(context);
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            colorDrawable.setAlpha(b);
            hnyVar.b(colorDrawable);
            hnyVar.b(new c5j0(0.625f));
            roundedCornersDrawable = new RoundedCornersDrawable(hnyVar);
            roundedCornersDrawable.f = RoundedCornersDrawable.Type.CLIPPING;
            roundedCornersDrawable.q();
            roundedCornersDrawable.invalidateSelf();
            roundedCornersDrawable.i(new float[]{a, a, a, a, a, a, a, a});
            roundedCornersDrawable.e(true);
        }
        CharSequence charSequence3 = digestItem.j;
        if (charSequence3 == null) {
            FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
            feedFeatures.getClass();
            if (com.vk.toggle.b.A.a(feedFeatures)) {
                Serializer.c<DigestItem> cVar3 = DigestItem.CREATOR;
                String str4 = post.s;
                Bundle bundle = post.K;
                float f2 = post.N.d;
                cn70.b(6);
                LinksParserData linksParserData = new LinksParserData(43787, bundle, 0, 0, (String) null, (String) null, 0, 0, LinksParserData.HashtagService.Posts, (saz) null, 0, (taz) null, o25.a().i().U == ObsceneTextFilter.ENABLED, 1788);
                vdz vdzVar = new vdz(0);
                ucp ucpVar = ucp.a;
                charSequence2 = ucp.i(xwk.d().a().o(str4, linksParserData, vdzVar));
                post.l.Ab(68719476736L, vdzVar.a);
            } else {
                ej90 ej90Var = post.P;
                if (ej90Var != null) {
                    charSequence2 = ej90Var.a;
                }
            }
        } else {
            charSequence2 = charSequence3;
        }
        String str5 = digestItem.k;
        boolean z6 = !(str5 == null || str5.length() == 0);
        ucp ucpVar2 = ucp.a;
        String str6 = digestItem.c;
        if (str6 == null) {
            str6 = post.o.c;
        }
        CharSequence i4 = ucp.i(str6);
        boolean z7 = !(charSequence2 == null || charSequence2.length() == 0);
        int i5 = post.r;
        boolean z8 = i5 > 0;
        String str7 = digestItem.i;
        boolean z9 = !(str7 == null || str7.length() == 0);
        boolean z10 = !(str == null || str.length() == 0);
        if (str == null || str.length() == 0) {
            str2 = str7;
            charSequence = i4;
            z = true;
        } else {
            str2 = str7;
            charSequence = i4;
            z = false;
        }
        if (i3 > 0) {
            z3 = true;
            z2 = true;
        } else {
            z2 = true;
            z3 = false;
        }
        String valueOf = String.valueOf(i3);
        if (i3 > 0) {
            z4 = z9;
            z5 = z2;
        } else {
            z4 = z9;
            z5 = false;
        }
        return Collections.singletonList(new gyq(str5, z6, roundedCornersDrawable, charSequence, charSequence2, z7, i5, z8, str2, z4, str, z10, z, z3, valueOf, z5, i3 > 0 ? z2 : false, (int) (f * (digest.m.size() == digest.m.indexOf(digestItem) + 1 ? 12 : 8)), new StringBuilder(), digestItem, digest, triple));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, (Triple) pair);
    }
}
