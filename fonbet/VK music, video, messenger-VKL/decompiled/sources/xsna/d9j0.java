package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.dto.group.Group;
import com.vk.lists.c;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* compiled from: ShareStoryUsersPagedDataProvider.kt */
/* loaded from: classes16.dex */
public final class d9j0 implements c.l<Pair<? extends Integer, ? extends List<? extends Group>>> {
    public final izs<List<? extends Group>, s3q0> b;
    public final wzs<Throwable, izs<? super gzs<s3q0>, s3q0>, s3q0> c;
    public final xqu d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final dqu f = new dqu();

    /* JADX WARN: Multi-variable type inference failed */
    public d9j0(izs<? super List<? extends Group>, s3q0> izsVar, wzs<? super Throwable, ? super izs<? super gzs<s3q0>, s3q0>, s3q0> wzsVar, xqu xquVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = izsVar;
        this.c = wzsVar;
        this.d = xquVar;
        this.e = bVar;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<Pair<Integer, List<Group>>> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<Pair<? extends Integer, ? extends List<? extends Group>>> ui(int i, com.vk.lists.c cVar) {
        int k = cVar.k();
        return rsg0.y0(yfb.x(xqu.h(this.d, null, Collections.singletonList(GroupsFilterDto.EDITOR), e43.l(GroupsFieldsDto.SCREEN_NAME, GroupsFieldsDto.CAN_UPLOAD_STORY), Integer.valueOf(i), Integer.valueOf(k), 33)), null, null, 3).F(new sl30(new nk0(25, this, cVar), 23)).U(new xq70(new qyi0(this, 1), 11));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<Pair<Integer, List<Group>>> qVar, boolean z, com.vk.lists.c cVar) {
        hg1.e(this.e, qVar.subscribe(new oo20(new defpackage.b0(28, cVar, this), 23)));
    }
}
