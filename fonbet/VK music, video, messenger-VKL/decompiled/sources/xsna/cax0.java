package xsna;

import com.vk.api.generated.owners.dto.OwnersAddToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersPinToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersRemoveFromMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersUnpinFromMainTabItemTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: WallRemoteRepository.kt */
/* loaded from: classes4.dex */
public interface cax0 {
    io.reactivex.rxjava3.internal.operators.single.r a(Post post, String str, ObsceneTextFilter obsceneTextFilter, String str2);

    io.reactivex.rxjava3.internal.operators.observable.b1 b(String str, UserId userId, OwnersPinToMainTabItemTypeDto ownersPinToMainTabItemTypeDto);

    io.reactivex.rxjava3.internal.operators.observable.b1 c(String str, UserId userId, OwnersUnpinFromMainTabItemTypeDto ownersUnpinFromMainTabItemTypeDto);

    io.reactivex.rxjava3.internal.operators.completable.w d(Post post);

    io.reactivex.rxjava3.internal.operators.single.y e(Post post, z6c0 z6c0Var);

    io.reactivex.rxjava3.internal.operators.observable.b1 f(String str, UserId userId, OwnersAddToMainTabItemTypeDto ownersAddToMainTabItemTypeDto);

    io.reactivex.rxjava3.internal.operators.completable.w g(Post post);

    io.reactivex.rxjava3.core.a h(NewsEntry newsEntry, z6c0 z6c0Var);

    io.reactivex.rxjava3.internal.operators.observable.b1 i(String str, UserId userId, OwnersRemoveFromMainTabItemTypeDto ownersRemoveFromMainTabItemTypeDto);

    io.reactivex.rxjava3.internal.operators.observable.f0 j(UserId userId, UserId userId2);

    io.reactivex.rxjava3.internal.operators.observable.b1 k(UserId userId, String str);

    io.reactivex.rxjava3.internal.operators.observable.b1 l(int i, UserId userId, UserId userId2);

    io.reactivex.rxjava3.internal.operators.single.y m(List list);

    io.reactivex.rxjava3.internal.operators.observable.b1 n(int i, UserId userId, UserId userId2);

    io.reactivex.rxjava3.internal.operators.observable.b1 o(UserId userId, String str);

    io.reactivex.rxjava3.internal.operators.single.y p(String str, Post post);

    io.reactivex.rxjava3.internal.operators.completable.w q(Post post);

    io.reactivex.rxjava3.internal.operators.completable.w r(Post post);

    io.reactivex.rxjava3.internal.operators.completable.w s(Post post);

    io.reactivex.rxjava3.internal.operators.completable.w t(Post post);

    io.reactivex.rxjava3.internal.operators.single.y u(String str, Post post);

    io.reactivex.rxjava3.internal.operators.observable.f0 v(UserId userId, UserId userId2);
}
