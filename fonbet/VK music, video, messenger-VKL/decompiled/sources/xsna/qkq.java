package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.vk.profile.user.impl.ui.UserProfileAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class qkq implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qkq(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((SnapshotStateList) this.d).set(this.c, Boolean.valueOf(!((Boolean) r0.get(r1)).booleanValue()));
                break;
            case 1:
                ((sc60) this.d).a.notifyItemRangeRemoved(0, this.c);
                break;
            default:
                ((arq0) this.d).n.a(new UserProfileAction.d.b.a.C1676b(this.c));
                break;
        }
        return s3q0.a;
    }
}
