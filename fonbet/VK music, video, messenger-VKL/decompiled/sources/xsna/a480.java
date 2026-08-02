package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: OnDestroyViewActionDelegate.kt */
/* loaded from: classes6.dex */
public final class a480 implements z380 {
    public final ArrayList<gzs<s3q0>> a = new ArrayList<>();

    @Override // xsna.z380
    public final void a(gzs<s3q0> gzsVar) {
        this.a.add(gzsVar);
    }

    @Override // xsna.z380
    public final void onDestroy() {
        ArrayList<gzs<s3q0>> arrayList = this.a;
        if (arrayList == null || arrayList == null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((gzs) it.next()).invoke();
            }
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).invoke();
            }
        }
        arrayList.clear();
    }
}
