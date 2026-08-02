package xsna;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class wxz0 extends xq01 {
    public final /* synthetic */ Collection c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ h3g0 e;
    public final /* synthetic */ TaskCompletionSource f;
    public final /* synthetic */ x201 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxz0(x201 x201Var, TaskCompletionSource taskCompletionSource, ArrayList arrayList, ArrayList arrayList2, h3g0 h3g0Var, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.g = x201Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = h3g0Var;
        this.f = taskCompletionSource2;
    }

    @Override // xsna.xq01
    public final void c() {
        TaskCompletionSource taskCompletionSource = this.f;
        x201 x201Var = this.g;
        h3g0 h3g0Var = this.e;
        Collection<String> collection = this.c;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        ArrayList arrayList2 = this.d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle2 = new Bundle();
            bundle2.putString("language", str2);
            arrayList3.add(bundle2);
        }
        arrayList.addAll(arrayList3);
        try {
            h3g0Var.q(2);
            c401 c401Var = x201Var.b.m;
            String str3 = x201Var.a;
            Bundle bundle3 = new Bundle();
            bundle3.putInt("playcore_version_code", 11004);
            bundle3.putParcelableArrayList("event_timestamps", new ArrayList<>(h3g0Var.p()));
            c401Var.y(str3, arrayList, bundle3, new o201(x201Var, taskCompletionSource));
        } catch (RemoteException e) {
            x201.c.c(e, "startInstall(%s,%s)", collection, arrayList2);
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}
