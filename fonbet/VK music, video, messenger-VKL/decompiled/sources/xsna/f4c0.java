package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.owners.dto.OwnersAddToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersPinToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersRemoveFromMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersUnpinFromMainTabItemTypeDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.c9x0;

/* compiled from: PostInteractorNetworkOnly.kt */
/* loaded from: classes4.dex */
public final class f4c0 implements d4c0 {
    public final cax0 a;
    public final NewsfeedRouter b;
    public final CopyOnWriteArrayList<Long> c = new CopyOnWriteArrayList<>();
    public final d2f0 d = new d2f0();

    public f4c0(eax0 eax0Var, NewsfeedRouter newsfeedRouter) {
        this.a = eax0Var;
        this.b = newsfeedRouter;
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<Post> a(Post post, String str, ObsceneTextFilter obsceneTextFilter, String str2) {
        return this.a.a(post, str, obsceneTextFilter, str2);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a b(String str, UserId userId, OwnersPinToMainTabItemTypeDto ownersPinToMainTabItemTypeDto) {
        return this.a.b(str, userId, ownersPinToMainTabItemTypeDto);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a c(String str, UserId userId, OwnersUnpinFromMainTabItemTypeDto ownersUnpinFromMainTabItemTypeDto) {
        return this.a.c(str, userId, ownersUnpinFromMainTabItemTypeDto);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a d(Post post) {
        return this.a.d(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<Post> e(Post post, z6c0 z6c0Var) {
        return this.a.e(post, z6c0Var);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a f(String str, UserId userId, OwnersAddToMainTabItemTypeDto ownersAddToMainTabItemTypeDto) {
        return this.a.f(str, userId, ownersAddToMainTabItemTypeDto);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a g(Post post) {
        return this.a.g(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a h(NewsEntry newsEntry, z6c0 z6c0Var) {
        return this.a.h(newsEntry, z6c0Var);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a i(String str, UserId userId, OwnersRemoveFromMainTabItemTypeDto ownersRemoveFromMainTabItemTypeDto) {
        return this.a.i(str, userId, ownersRemoveFromMainTabItemTypeDto);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<BaseOkResponseDto> j(UserId userId, UserId userId2) {
        return this.a.j(userId, userId2);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a k(UserId userId, String str) {
        return this.a.k(userId, str);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a l(int i, UserId userId, UserId userId2) {
        return this.a.l(i, userId, userId2);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<List<Post>> m(List<String> list) {
        return this.a.m(list);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a n(int i, UserId userId, UserId userId2) {
        return this.a.n(i, userId, userId2);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a o(UserId userId, String str) {
        return this.a.o(userId, str);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x p(String str, Post post) {
        return this.a.p(str, post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a q(Post post) {
        return this.a.q(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a r(Post post) {
        return this.a.r(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a s(Post post) {
        return this.a.s(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a t(Post post) {
        return this.a.t(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x u(String str, Post post) {
        return this.a.u(str, post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<VKList<UserProfile>> v(UserId userId, UserId userId2) {
        return this.a.v(userId, userId2);
    }

    @Override // xsna.d4c0
    public final void w(Context context, String str) {
        this.b.N(context, str, null, c9x0.c.b, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.disposables.c x(l6z l6zVar, mm1 mm1Var, d9j d9jVar) {
        s9x0 F0;
        PhotoAttachment Mb;
        Photo photo;
        String str = l6zVar.e;
        boolean z = l6zVar.b;
        ReactionMeta reactionMeta = l6zVar.c;
        c6z c6zVar = l6zVar.a;
        if (!o25.a().b()) {
            if (d9jVar != null) {
                d9jVar.invoke(new IllegalStateException("User is not logged in"));
            }
            return EmptyDisposable.INSTANCE;
        }
        q6z q6zVar = new q6z(c6zVar, reactionMeta);
        this.d.getClass();
        d2f0.a(c6zVar, z, reactionMeta);
        q6zVar.i = c6zVar.J();
        ce60 ce60Var = ce60.b;
        ce60Var.getClass();
        p870.f().d(102, 100, (NewsEntry) c6zVar);
        if ((c6zVar instanceof Photos) && (Mb = ((Photos) c6zVar).Mb()) != null && (photo = Mb.l) != null) {
            ce60Var.getClass();
            p870.f().e(113, photo);
        }
        if (!this.c.addIfAbsent(Long.valueOf(c6zVar.hashCode()))) {
            return EmptyDisposable.INSTANCE;
        }
        if (str == null || str.length() == 0) {
            F0 = s9x0.F0(c6zVar, z, reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null, c6zVar.r());
        } else {
            F0 = s9x0.F0(c6zVar, z, reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null, str);
        }
        if (F0 == null) {
            return EmptyDisposable.INSTANCE;
        }
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        F0.s = o2f0Var != null ? o2f0Var.s4() : null;
        F0.j("ref", l6zVar.d);
        String str2 = l6zVar.f;
        if (str2 != null) {
            F0.j("action", str2);
        }
        return rsg0.y0(F0, null, null, 3).subscribe(new m330(new txv(this, l6zVar, q6zVar, mm1Var, 1), 13), new gl30(new e4c0(this, l6zVar, q6zVar, d9jVar), 13));
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x y(String str, Post post) {
        return this.a.p(str, post);
    }
}
