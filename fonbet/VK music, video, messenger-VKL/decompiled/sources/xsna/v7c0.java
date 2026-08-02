package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ej90;
import xsna.q7c0;
import xsna.u7c0;
import xsna.y9c0;

/* compiled from: PostStickerInfoBuilder.kt */
/* loaded from: classes6.dex */
public final class v7c0 {
    public boolean a;

    public static List c(List list, Size size) {
        Image image;
        if (list.isEmpty()) {
            PostStickerStyle.Companion.getClass();
            return e43.l(PostStickerStyle.PREVIEW, PostStickerStyle.MINIATURE);
        }
        ArrayList o = e43.o(PostStickerStyle.PREVIEW, PostStickerStyle.MINIATURE);
        Attachment attachment = (Attachment) j5g.a0(list);
        float f = 1.0f;
        if (attachment != null) {
            int width = size.getWidth();
            if (attachment instanceof PhotoAttachment) {
                Photo photo = ((PhotoAttachment) attachment).l;
                f = photo.y.E0() > 1.0f ? photo.Fb(width, true).E0() : photo.Db(width, true).E0();
            } else if ((attachment instanceof DocumentAttachment) && (image = ((DocumentAttachment) attachment).s) != null) {
                f = image.E0();
            }
        }
        bpn0 bpn0Var = z5l0.a;
        if (z5l0.f(f, size.getWidth() / size.getHeight())) {
            o.add(PostStickerStyle.FULLSCREEN);
        }
        return o;
    }

    public static ArrayList d(Post post) {
        NewsfeedCoowners newsfeedCoowners;
        if (post != null && (newsfeedCoowners = post.f0) != null) {
            boolean z = newsfeedCoowners.b;
            List<NewsfeedCoowners.CoownerStatus> list = newsfeedCoowners.f;
            if (!list.isEmpty() && list.size() >= 2) {
                List<NewsfeedCoowners.CoownerStatus> subList = list.subList(1, list.size());
                ArrayList arrayList = new ArrayList();
                for (Object obj : subList) {
                    NewsfeedCoowners.CoownerStatus coownerStatus = (NewsfeedCoowners.CoownerStatus) obj;
                    if ((z && epx.f(coownerStatus.c, "approved")) || !z) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Owner owner = ((NewsfeedCoowners.CoownerStatus) it.next()).b;
                    String str = owner.c;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String f = owner.f(cn70.b(28));
                    if (f != null) {
                        str2 = f;
                    }
                    arrayList2.add(new u7c0.c(str, null, str2));
                }
                return arrayList2;
            }
        }
        return null;
    }

    public static Post e(Post post) {
        Post post2 = post.D;
        return post2 == null ? post : e(post2);
    }

    public static boolean f(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((q7c0) it.next()) instanceof q7c0.b) {
                    return false;
                }
            }
        }
        return !arrayList.isEmpty();
    }

    public static y9c0 g(Poster poster, String str) {
        Image image = poster.f;
        Image image2 = poster.g;
        int i = poster.d;
        int i2 = poster.e;
        Poster.Constants constants = poster.h;
        return new y9c0(str, image, image2, i, i2, new y9c0.a(constants.d, constants.e, constants.f, constants.g, constants.b, constants.c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
    
        if ((r3 instanceof xsna.q7c0.b) == true) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u7c0 a(Context context, Post post, Size size, PostStickerStyle postStickerStyle) {
        ArrayList arrayList;
        List a;
        PostStickerStyle postStickerStyle2;
        Post post2 = post;
        Post post3 = post2.D;
        if (post3 != null) {
            Post post4 = post3.D;
            if (post4 != null) {
                post3 = e(post4);
            }
        } else {
            post3 = post2;
        }
        b25 a2 = o25.a();
        Post post5 = post2.D;
        if (post5 != null) {
            post2 = e(post5);
        }
        String str = post2.s;
        Poster poster = post2.M;
        u7c0.f fVar = null;
        CharSequence charSequence = (str.length() <= 0 || poster != null) ? null : ej90.a.b(post2.s, new ej90.b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, a2.i().U, null, 0, 0, null, null, 503), 4).a;
        y9c0 g = poster != null ? g(poster, post2.s) : null;
        ArrayList<EntryAttachment> arrayList2 = post2.z;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((EntryAttachment) it.next()).b);
        }
        ArrayList a3 = r7c0.a(g, arrayList3);
        String str2 = b(null, post2, post2.Q).a;
        ArrayList d = d(post2);
        if (d != null) {
            ArrayList arrayList4 = new ArrayList(c5g.u(d, 10));
            Iterator it2 = d.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((u7c0.c) it2.next()).a);
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        u7c0.d dVar = new u7c0.d(str2, arrayList, charSequence, new u7c0.a(a3, arrayList3, g, 0, 24));
        Owner owner = post3.Q;
        Poster poster2 = post3.M;
        ArrayList<EntryAttachment> arrayList5 = post3.z;
        CharSequence charSequence2 = (post3.s.length() <= 0 || poster2 != null) ? null : ej90.a.b(post3.s, new ej90.b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, o25.a().i().U, null, 0, 0, null, null, 503), 4).a;
        y9c0 g2 = poster2 != null ? g(poster2, post3.s) : null;
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
        Iterator<T> it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((EntryAttachment) it3.next()).b);
        }
        ArrayList a4 = r7c0.a(g2, arrayList6);
        this.a = f(a4);
        q7c0 q7c0Var = (q7c0) j5g.a0(dVar.d.a);
        boolean z = q7c0Var != null;
        if (!this.a) {
            a = c(arrayList6, size);
        } else if (arrayList6.isEmpty()) {
            PostStickerStyle.Companion.getClass();
            a = e43.l(PostStickerStyle.SIMPLIFIED_LIGHT, PostStickerStyle.SIMPLIFIED_DARK, PostStickerStyle.LIGHT, PostStickerStyle.DARK);
        } else {
            PostStickerStyle.Companion.getClass();
            a = PostStickerStyle.a.a(z);
        }
        int i = post3.L.i;
        if (postStickerStyle != null) {
            postStickerStyle2 = postStickerStyle;
        } else if (this.a) {
            postStickerStyle2 = arrayList5.isEmpty() ? PostStickerStyle.SIMPLIFIED_LIGHT : PostStickerStyle.SIMPLIFIED_DARK;
        } else if (arrayList5.isEmpty()) {
            PostStickerStyle.Companion.getClass();
            postStickerStyle2 = (PostStickerStyle) j5g.Y(e43.l(PostStickerStyle.PREVIEW, PostStickerStyle.MINIATURE));
        } else {
            PostStickerStyle.Companion.getClass();
            postStickerStyle2 = (PostStickerStyle) j5g.Y(e43.l(PostStickerStyle.PREVIEW, PostStickerStyle.MINIATURE, PostStickerStyle.FULLSCREEN));
        }
        Attachment attachment = (Attachment) j5g.a0(arrayList6);
        if (attachment instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            fVar = new u7c0.f(videoAttachment.k.o0(), videoAttachment.k.I0());
        }
        return new u7c0(post3.n, post3.m, b(context, post3, owner), d(post3), charSequence2, dVar, new u7c0.a(a4, arrayList6, g2, i, 16), fVar, null, new u7c0.e(postStickerStyle2, a));
    }

    public final u7c0.c b(Context context, Post post, Owner owner) {
        VerifyInfo verifyInfo;
        NewsfeedCoowners newsfeedCoowners;
        Drawable drawable = null;
        List<NewsfeedCoowners.CoownerStatus> list = (post == null || (newsfeedCoowners = post.f0) == null) ? null : newsfeedCoowners.f;
        List<NewsfeedCoowners.CoownerStatus> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            Owner owner2 = ((NewsfeedCoowners.CoownerStatus) j5g.Y(list)).b;
            String str = owner2.c;
            if (str == null) {
                str = "";
            }
            String f = owner2.f(cn70.b(28));
            return new u7c0.c(str, null, f != null ? f : "");
        }
        if (owner == null) {
            return new u7c0.c("", null, "");
        }
        String str2 = owner.c;
        if (str2 == null) {
            str2 = "";
        }
        if (context != null && (verifyInfo = owner.f) != null) {
            VerifyInfoHelper.ColorTheme colorTheme = !this.a ? VerifyInfoHelper.ColorTheme.white : VerifyInfoHelper.ColorTheme.normal;
            if (verifyInfo.Cb()) {
                drawable = VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, context, colorTheme, 24);
            }
        }
        String f2 = owner.f(cn70.b(28));
        return new u7c0.c(str2, drawable, f2 != null ? f2 : "");
    }
}
