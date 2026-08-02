package xsna;

import com.vk.dto.group.Group;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class clu implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Group c;

    public /* synthetic */ clu(Group group, int i) {
        this.b = i;
        this.c = group;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return f870.s(this.c, ((Integer) obj).intValue());
            default:
                return Boolean.valueOf(((Group) obj).c.equals(this.c.c));
        }
    }
}
