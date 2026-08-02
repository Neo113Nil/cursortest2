package xsna;

import com.vk.log.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: CollageEditorScreen.kt */
/* loaded from: classes15.dex */
public final class p0g implements n4p {
    @Override // xsna.n4p
    public final void a(Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(th);
    }

    @Override // xsna.n4p
    public final void b(Object... objArr) {
        List asList = Arrays.asList(objArr);
        ArrayList arrayList = new ArrayList(c5g.u(asList, 10));
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        L.G((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // xsna.n4p
    public final void d(String str) {
        L.e(str);
    }
}
