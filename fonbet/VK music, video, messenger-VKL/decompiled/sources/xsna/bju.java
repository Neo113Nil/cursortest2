package xsna;

import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.dto.group.Group;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bju implements izs {
    public final /* synthetic */ Group b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ GroupCardItemVh e;

    public /* synthetic */ bju(Group group, int i, boolean z, GroupCardItemVh groupCardItemVh) {
        this.b = group;
        this.c = i;
        this.d = z;
        this.e = groupCardItemVh;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Group group = this.b;
        group.C = this.c;
        group.j = this.d;
        GroupCardItemVh groupCardItemVh = this.e;
        if (epx.f(groupCardItemVh.s, group.c)) {
            groupCardItemVh.t(group);
            groupCardItemVh.q();
        }
        i0q0.d(500L, new n44(th, 4));
        return s3q0.a;
    }
}
