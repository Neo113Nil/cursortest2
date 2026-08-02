package xsna;

import android.content.Context;
import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DuetMeta;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.c70;

/* compiled from: ActionsImpl.kt */
/* loaded from: classes5.dex */
public final class k70 implements d70, w8i {
    public final Object b;
    public final Object c;
    public final Object d;

    public k70() {
        i70 i70Var = new i70(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, i70Var);
        this.c = msy.a(lazyThreadSafetyMode, new j70(this, 0));
        this.d = msy.a(lazyThreadSafetyMode, new gc(1));
    }

    @Override // xsna.d70
    public final ActionsInfo a(PhotoAlbum photoAlbum) {
        c70.b bVar = new c70.b();
        bVar.j = sua.t(photoAlbum);
        boolean z = false;
        bVar.b = false;
        bVar.c = false;
        if (photoAlbum.f > 0 && photoAlbum.x) {
            z = true;
        }
        bVar.k(z);
        return bVar.b();
    }

    @Override // xsna.d70
    public final ActionsInfo b(PromoPost promoPost) {
        return f(promoPost.n);
    }

    @Override // xsna.d70
    public final ActionsInfo c(Article article) {
        c70.b bVar = new c70.b();
        bVar.b = false;
        bVar.c = false;
        bVar.e(true, article.n);
        String str = article.i;
        if (!(str != null ? Article.a.a(str) : false)) {
            bVar.k(false);
        }
        return bVar.b();
    }

    @Override // xsna.d70
    public final ActionsInfo d(String str) {
        c70.b bVar = new c70.b();
        bVar.b = false;
        bVar.c = false;
        if (!y501.a().g(str)) {
            bVar.k(false);
        }
        return bVar.b();
    }

    @Override // xsna.d70
    public final ActionsInfo e(Photo photo, boolean z) {
        c70.b bVar = new c70.b();
        boolean z2 = false;
        bVar.b = false;
        bVar.c = false;
        if (photo.q && z) {
            z2 = true;
        }
        bVar.k(z2);
        return bVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (xsna.fkq0.d(r9.b) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0144, code lost:
    
        if (r4.k.Fa() != false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.d70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionsInfo f(Post post) {
        boolean z;
        Owner owner = post.o;
        Flags flags = post.l;
        boolean b9 = post.b9();
        if (BuildInfo.s() && !b9) {
            Owner owner2 = post.Q;
            String str = owner2 != null ? owner2.h : "";
            boolean zb = flags.zb(512L);
            int i = R.string.share_for_friends_only;
            if (!zb) {
                if (flags.zb(2147483648L)) {
                    i = R.string.share_for_best_friends_only;
                } else if (owner2 == null || !owner2.i(16)) {
                    if (owner2 != null) {
                    }
                    i = R.string.share_disabled_from_private_group;
                } else {
                    if (fkq0.d(owner2.b)) {
                        i = R.string.share_disabled_from_closed_profile;
                    }
                    i = R.string.share_disabled_from_private_group;
                }
            }
            c70.b bVar = new c70.b();
            bVar.g();
            Context context = e43.a;
            bVar.k = (context != null ? context : null).getString(i, str);
            return bVar.b();
        }
        boolean z2 = false;
        if (flags.zb(512L)) {
            boolean X = post.X();
            k70 k70Var = c70.a;
            c70.b bVar2 = new c70.b();
            bVar2.b = false;
            bVar2.c = false;
            bVar2.k(false);
            bVar2.e(true, X);
            return bVar2.b();
        }
        UserId userId = owner.b;
        UserId c = o25.a().c();
        if (!epx.f(c, owner.b)) {
            NewsfeedCoowners newsfeedCoowners = post.f0;
            if (newsfeedCoowners != null) {
                List<NewsfeedCoowners.CoownerStatus> list = newsfeedCoowners.f;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((NewsfeedCoowners.CoownerStatus) it.next()).b.b, c)) {
                        }
                    }
                }
            }
            z = false;
            boolean f = epx.f(post.m, userId);
            boolean z3 = (b9 || z || BuildInfo.t()) ? false : true;
            boolean z4 = !BuildInfo.s() && ((pbj0) this.d.getValue()).a;
            c70.b bVar3 = new c70.b();
            bVar3.l(z3);
            bVar3.j(!b9 && f);
            if (b9 && !post.ec()) {
                if (post.gc()) {
                    EntryAttachment entryAttachment = (EntryAttachment) j5g.a0(post.z);
                    Serializer.StreamParcelableAdapter streamParcelableAdapter = entryAttachment != null ? entryAttachment.b : null;
                    VideoAttachment videoAttachment = streamParcelableAdapter instanceof VideoAttachment ? (VideoAttachment) streamParcelableAdapter : null;
                    if (videoAttachment != null) {
                    }
                }
                z2 = true;
            }
            bVar3.k(z2);
            bVar3.c(z4);
            bVar3.e(!BuildInfo.s(), post.X());
            bVar3.v = z4;
            return bVar3.b();
        }
        z = true;
        boolean f2 = epx.f(post.m, userId);
        if (b9) {
        }
        if (BuildInfo.s()) {
        }
        c70.b bVar32 = new c70.b();
        bVar32.l(z3);
        bVar32.j(!b9 && f2);
        if (b9) {
            if (post.gc()) {
            }
            z2 = true;
        }
        bVar32.k(z2);
        bVar32.c(z4);
        bVar32.e(!BuildInfo.s(), post.X());
        bVar32.v = z4;
        return bVar32.b();
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.d70
    public final ActionsInfo g(VideoFile videoFile, boolean z) {
        DuetMeta duetMeta;
        Boolean bool;
        boolean d = g620.f().d(videoFile);
        boolean booleanValue = (((zof) this.b.getValue()).c() && d && (videoFile instanceof ClipVideoFile) && (duetMeta = ((ClipVideoFile) videoFile).G1) != null && (bool = duetMeta.b) != null) ? bool.booleanValue() : false;
        boolean q = BuildInfo.q();
        ?? r5 = this.c;
        if (q) {
            c70.b bVar = new c70.b();
            bVar.d(true);
            bVar.a(15);
            bVar.q = true;
            bVar.c(true);
            bVar.b = false;
            bVar.c = false;
            bVar.k(false);
            bVar.f();
            bVar.e(false, videoFile.X());
            bVar.a(5);
            bVar.g = true;
            if (booleanValue) {
                bVar.a(6);
            }
            bVar.h = booleanValue;
            boolean b = ((ClipsDownloadComponent) r5.getValue()).Q5().b(videoFile);
            if (b) {
                bVar.a(13);
            }
            bVar.n = b;
            bVar.v = true;
            return bVar.b();
        }
        boolean z2 = !d && BuildInfo.s();
        boolean z3 = d && ((pbj0) this.d.getValue()).b && BuildInfo.s();
        c70.b bVar2 = new c70.b();
        bVar2.c(z2);
        bVar2.b = false;
        bVar2.c = false;
        bVar2.k(videoFile.Fa() && z);
        bVar2.f();
        bVar2.e(false, videoFile.X());
        bVar2.a(5);
        bVar2.g = true;
        bVar2.c(z3);
        if (booleanValue) {
            bVar2.a(6);
        }
        bVar2.h = booleanValue;
        boolean b2 = ((ClipsDownloadComponent) r5.getValue()).Q5().b(videoFile);
        if (b2) {
            bVar2.a(13);
        }
        bVar2.n = b2;
        bVar2.d(d);
        if (d) {
            bVar2.a(15);
        }
        bVar2.q = d;
        bVar2.v = z3 || z2;
        return bVar2.b();
    }

    @Override // xsna.d70
    public final ActionsInfo h() {
        c70.b bVar = new c70.b();
        bVar.b = false;
        bVar.c = false;
        return bVar.b();
    }

    @Override // xsna.d70
    public final ActionsInfo i(Good good) {
        c70.b bVar = new c70.b();
        bVar.b = false;
        bVar.c = false;
        bVar.k(true);
        bVar.e(true, good.J);
        return bVar.b();
    }

    @Override // xsna.d70
    public final ActionsInfo j() {
        c70.b bVar = new c70.b();
        bVar.g();
        bVar.v = true;
        return bVar.b();
    }
}
