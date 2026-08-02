package xsna;

import com.vk.dto.group.Group;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mmu implements izs {
    public final /* synthetic */ Group b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ com.vk.catalog2.common.ui.holders.group.a e;

    public /* synthetic */ mmu(Group group, int i, boolean z, com.vk.catalog2.common.ui.holders.group.a aVar) {
        this.b = group;
        this.c = i;
        this.d = z;
        this.e = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.group.a$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Group group = this.b;
        group.C = this.c;
        group.j = this.d;
        com.vk.catalog2.common.ui.holders.group.a aVar = this.e;
        Group group2 = aVar.d;
        if (group2 != null && epx.f(group2.c, group.c)) {
            aVar.f();
        }
        aVar.b.e(th);
        return s3q0.a;
    }
}
