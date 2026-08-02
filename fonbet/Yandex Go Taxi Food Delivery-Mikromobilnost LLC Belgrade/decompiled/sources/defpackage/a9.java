package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class a9 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ a9(int i, Collection collection) {
        this.a = i;
        this.b = collection;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.a;
        Collection collection = this.b;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = SnapshotStateList.retainAll$lambda$0(collection, (List) obj);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
