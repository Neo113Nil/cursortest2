package defpackage;

import com.google.accompanist.permissions.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class dx40 implements wza0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dx40(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wza0
    public final void a() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                m50 m50Var = bVar.e;
                if (m50Var != null) {
                    List list = bVar.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((dz40) it.next()).a);
                    }
                    m50Var.a(arrayList.toArray(new String[0]));
                } else {
                    zy11Var = null;
                }
                if (zy11Var == null) {
                    ny61.r("ActivityResultLauncher cannot be null");
                    break;
                }
                break;
            default:
                dz40 dz40Var = (dz40) obj;
                m50 m50Var2 = dz40Var.e;
                if (m50Var2 != null) {
                    m50Var2.a(dz40Var.a);
                } else {
                    zy11Var = null;
                }
                if (zy11Var == null) {
                    ny61.r("ActivityResultLauncher cannot be null");
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wza0
    public final boolean b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((b) obj).d.getValue()).booleanValue();
            default:
                return ((dz40) obj).a().equals(yza0.a);
        }
    }
}
