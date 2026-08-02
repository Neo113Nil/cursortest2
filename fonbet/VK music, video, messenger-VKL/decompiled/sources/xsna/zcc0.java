package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.AdminCommunitiesDataSource;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingAuthorLoadException;
import xsna.xcc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zcc0 implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zcc0(com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b bVar, boolean z) {
        this.b = bVar;
        this.c = z;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b bVar = this.b;
        final UserId c = bVar.a.c();
        if (epx.f(c, UserId.d)) {
            c = null;
        }
        if (c == null) {
            return io.reactivex.rxjava3.core.x.i(new PostingAuthorLoadException(xcc0.b.a, null));
        }
        final AdminCommunitiesDataSource adminCommunitiesDataSource = bVar.b;
        final AdminCommunitiesDataSource.LoadStrategy loadStrategy = this.c ? AdminCommunitiesDataSource.LoadStrategy.REMOTE : AdminCommunitiesDataSource.LoadStrategy.LOCAL;
        return new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.pt0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                AdminCommunitiesDataSource adminCommunitiesDataSource2 = AdminCommunitiesDataSource.this;
                if (adminCommunitiesDataSource2.c.get()) {
                    if (loadStrategy == AdminCommunitiesDataSource.LoadStrategy.LOCAL) {
                        return new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.b(new rt0(adminCommunitiesDataSource2, 0)), new l7(new sa(1, adminCommunitiesDataSource2, c), 2));
                    }
                }
                return adminCommunitiesDataSource2.a();
            }
        });
    }
}
