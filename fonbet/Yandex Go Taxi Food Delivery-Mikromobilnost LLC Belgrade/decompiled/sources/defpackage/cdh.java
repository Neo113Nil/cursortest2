package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final /* synthetic */ class cdh implements xrj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Size b;

    public /* synthetic */ cdh(int i, Size size) {
        this.a = i;
        this.b = size;
    }

    @Override // defpackage.xrj0
    public final List a(ArrayList arrayList) {
        int i = this.a;
        Size size = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    Size size2 = (Size) obj;
                    if (size2.getWidth() >= size.getWidth() && size2.getHeight() >= size.getHeight()) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            default:
                ArrayList arrayList3 = new ArrayList(arrayList);
                if (arrayList3.contains(size)) {
                    arrayList3.remove(size);
                    arrayList3.add(0, size);
                }
                return arrayList3;
        }
    }
}
