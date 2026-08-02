package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.users.UsersSearch;
import com.vk.dto.common.id.UserId;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PagedFriendsSearchDataProvider.kt */
/* loaded from: classes15.dex */
public final class oa90 implements c.l<dts> {
    public final UserId b;
    public final boolean c;
    public final uuk<nqs> d;
    public final com.vk.newsfeed.posting.mediapicker.photovk.base.a e;
    public final UsersSearch.Entrypoint f;
    public String g;
    public io.reactivex.rxjava3.disposables.c h;
    public final Object i;
    public final Object j;
    public final j2r0 k;
    public volatile boolean l;
    public volatile int m;
    public final List<UsersFieldsDto> n;

    public oa90(UserId userId, boolean z, ListDataSet listDataSet, com.vk.newsfeed.posting.mediapicker.photovk.base.a aVar, UsersSearch.Entrypoint entrypoint) {
        this.b = userId;
        this.c = z;
        this.d = listDataSet;
        this.e = aVar;
        this.f = entrypoint;
        fc fcVar = new fc(27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, fcVar);
        this.j = msy.a(lazyThreadSafetyMode, new gc(25));
        this.k = new j2r0();
        this.l = true;
        UsersFieldsDto usersFieldsDto = UsersFieldsDto.FIRST_NAME_NOM;
        UsersFieldsDto usersFieldsDto2 = UsersFieldsDto.LAST_NAME_NOM;
        UsersFieldsDto usersFieldsDto3 = UsersFieldsDto.IS_FRIEND;
        this.n = e43.l(usersFieldsDto, usersFieldsDto2, usersFieldsDto3, usersFieldsDto3, UsersFieldsDto.ONLINE_INFO, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(int i, int i2) {
        return rsg0.T(yfb.x(((s1r0) this.j.getValue()).a(this.g, Integer.valueOf(i), Integer.valueOf(i2), this.n, ((-30) & 32) != 0 ? null : null, ((-30) & 128) != 0 ? null : null, (32768 & (-30)) != 0 ? null : null, (65536 & (-30)) != 0 ? null : null, (131072 & (-30)) != 0 ? null : null, ((-30) & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? null : null, this.f.h()))).U(new qj4(new c230(this, 12), 24));
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<dts> hj(com.vk.lists.c cVar, boolean z) {
        io.reactivex.rxjava3.disposables.c cVar2 = this.h;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.l = true;
        this.m = 0;
        this.d.clear();
        return ui(0, cVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<dts> ui(int i, com.vk.lists.c cVar) {
        int k = cVar.k();
        if (!this.l) {
            return a(i - this.m, k);
        }
        UserId userId = this.b;
        if (fkq0.c(userId)) {
            return rsg0.T(yfb.x(nts.h((nts) this.i.getValue(), this.b, this.g, this.n, Integer.valueOf(i), Integer.valueOf(k), null, 146))).U(new pu50(new b8e(this, k, 1), 4));
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(b4q.b(userId, "userId isn't real: ")));
        return io.reactivex.rxjava3.core.q.T(new dts(0));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<dts> qVar, boolean z, com.vk.lists.c cVar) {
        this.h = qVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new oz(new mmm(cVar, this, z, 1), 29));
    }
}
