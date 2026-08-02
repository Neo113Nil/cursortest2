package xsna;

import android.content.DialogInterface;
import android.widget.ListView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wb30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wb30(int i, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = serializable;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.c;
                xb30 xb30Var = (xb30) this.d;
                n160 n160Var = (n160) this.e;
                zb30 zb30Var = (zb30) this.f;
                gq2 gq2Var = (gq2) obj;
                float floatValue = ((Number) ((zak0) gq2Var.e).getValue()).floatValue() - ref$FloatRef.element;
                if (!ec30.a(floatValue)) {
                    if (!ec30.a(floatValue - xb30Var.e(n160Var, floatValue))) {
                        gq2Var.a();
                        return s3q0.a;
                    }
                    ref$FloatRef.element += floatValue;
                }
                if (((Boolean) zb30Var.invoke(Float.valueOf(ref$FloatRef.element))).booleanValue()) {
                    gq2Var.a();
                }
                return s3q0.a;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                izs izsVar = (izs) this.e;
                ListView listView = (ListView) this.f;
                DialogInterface dialogInterface = (DialogInterface) ref$ObjectRef.element;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    if (listView.getCheckedItemPositions().get(i)) {
                        arrayList2.add(obj2);
                    }
                    i = i2;
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((jwb0) it.next()).f);
                }
                izsVar.invoke(arrayList3);
                return s3q0.a;
        }
    }
}
