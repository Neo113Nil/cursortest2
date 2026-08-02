package xsna;

import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z2b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ z2b(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                int i = this.c;
                Object obj2 = ((wpp) obj).c.get(Integer.valueOf(i));
                MsgFromChannel msgFromChannel = obj2 instanceof MsgFromChannel ? (MsgFromChannel) obj2 : null;
                if (msgFromChannel != null) {
                    return msgFromChannel;
                }
                throw new IllegalStateException(tgw.b(i, "Local msg with localId = ", " is absent"));
            case 1:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                List<Integer> list = bVar.J;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return bVar;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    int i2 = this.c;
                    if (intValue <= i2) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (((Number) obj3).intValue() > i2) {
                                arrayList.add(obj3);
                            }
                        }
                        return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, arrayList, null, 0, false, false, null, null, 0, null, 0, -1, 2097147);
                    }
                }
                return bVar;
            default:
                tso.n((tgi0) obj, this.c);
                return s3q0.a;
        }
    }
}
