package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.owners.dto.OwnersAddToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersPinToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersRemoveFromMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersUnpinFromMainTabItemTypeDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: PostInteractor.kt */
/* loaded from: classes4.dex */
public interface d4c0 {
    io.reactivex.rxjava3.core.x<Post> a(Post post, String str, ObsceneTextFilter obsceneTextFilter, String str2);

    io.reactivex.rxjava3.core.a b(String str, UserId userId, OwnersPinToMainTabItemTypeDto ownersPinToMainTabItemTypeDto);

    io.reactivex.rxjava3.core.a c(String str, UserId userId, OwnersUnpinFromMainTabItemTypeDto ownersUnpinFromMainTabItemTypeDto);

    io.reactivex.rxjava3.core.a d(Post post);

    io.reactivex.rxjava3.core.x<Post> e(Post post, z6c0 z6c0Var);

    io.reactivex.rxjava3.core.a f(String str, UserId userId, OwnersAddToMainTabItemTypeDto ownersAddToMainTabItemTypeDto);

    io.reactivex.rxjava3.core.a g(Post post);

    io.reactivex.rxjava3.core.a h(NewsEntry newsEntry, z6c0 z6c0Var);

    io.reactivex.rxjava3.core.a i(String str, UserId userId, OwnersRemoveFromMainTabItemTypeDto ownersRemoveFromMainTabItemTypeDto);

    io.reactivex.rxjava3.core.x<BaseOkResponseDto> j(UserId userId, UserId userId2);

    io.reactivex.rxjava3.core.a k(UserId userId, String str);

    io.reactivex.rxjava3.core.a l(int i, UserId userId, UserId userId2);

    io.reactivex.rxjava3.core.x<List<Post>> m(List<String> list);

    io.reactivex.rxjava3.core.a n(int i, UserId userId, UserId userId2);

    io.reactivex.rxjava3.core.a o(UserId userId, String str);

    io.reactivex.rxjava3.core.x p(String str, Post post);

    io.reactivex.rxjava3.core.a q(Post post);

    io.reactivex.rxjava3.core.a r(Post post);

    io.reactivex.rxjava3.core.a s(Post post);

    io.reactivex.rxjava3.core.a t(Post post);

    io.reactivex.rxjava3.core.x u(String str, Post post);

    io.reactivex.rxjava3.core.x<VKList<UserProfile>> v(UserId userId, UserId userId2);

    void w(Context context, String str);

    io.reactivex.rxjava3.disposables.c x(l6z l6zVar, mm1 mm1Var, d9j d9jVar);

    io.reactivex.rxjava3.core.x y(String str, Post post);

    /* compiled from: PostInteractor.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final ItemReactions c;
        public final boolean d;

        public a(int i, int i2, ItemReactions itemReactions, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = itemReactions;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            ItemReactions itemReactions = this.c;
            return Boolean.hashCode(this.d) + ((a + (itemReactions == null ? 0 : itemReactions.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LikeResult(likes=");
            sb.append(this.a);
            sb.append(", reposts=");
            sb.append(this.b);
            sb.append(", reactions=");
            sb.append(this.c);
            sb.append(", needShowSubscribeSuggestion=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public /* synthetic */ a(int i, ItemReactions itemReactions, boolean z) {
            this(i, 0, itemReactions, z);
        }
    }
}
