package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.domain.model.NewsfeedInitialPost;
import java.util.List;

/* compiled from: NewsfeedInteractor.kt */
/* loaded from: classes4.dex */
public interface am60 {
    io.reactivex.rxjava3.core.a a(Post post);

    void b(int i, String str, boolean z, List list);

    io.reactivex.rxjava3.internal.operators.single.y c(iw60 iw60Var, jw60 jw60Var);

    io.reactivex.rxjava3.core.x<Boolean> d();

    io.reactivex.rxjava3.core.a e(NewsEntry newsEntry, UserId userId, String str, NewsfeedAddBanTypeDto newsfeedAddBanTypeDto);

    io.reactivex.rxjava3.internal.operators.single.r f(mu60 mu60Var);

    io.reactivex.rxjava3.core.a g(boolean z);

    io.reactivex.rxjava3.internal.operators.single.y h(iw60 iw60Var, jw60 jw60Var);

    io.reactivex.rxjava3.core.x<tl60> i(NewsEntry newsEntry, NewsEntry newsEntry2, String str);

    io.reactivex.rxjava3.internal.operators.single.y j(NewsEntry newsEntry);

    io.reactivex.rxjava3.internal.operators.single.y k(int i, boolean z, boolean z2);

    io.reactivex.rxjava3.internal.operators.single.y l(iw60 iw60Var, jw60 jw60Var);

    io.reactivex.rxjava3.internal.operators.single.d0 m(NewsfeedInitialPost newsfeedInitialPost);
}
