package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MessagesReorderFoldersApiCmd.kt */
/* loaded from: classes18.dex */
public final class mg20 extends nx2<s3q0> {
    public final List<Integer> b;

    public mg20(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        tfx tfxVar = new tfx("messages.reorderFolders", new ar(23), new wd10(1));
        tfxVar.i("folder_ids", this.b);
        bz2.d(tfxVar);
        return s3q0.a;
    }
}
