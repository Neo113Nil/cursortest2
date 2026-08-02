package xsna;

import android.view.View;
import android.view.ViewStub;
import com.vk.dto.messages.MsgIdType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class da6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ da6(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((gj30) obj).r(MsgIdType.CNV_ID, this.c));
            case 1:
                View view = (View) obj;
                return Boolean.valueOf((view instanceof ViewStub) && ((ViewStub) view).getInflatedId() == this.c);
            case 2:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                List<Integer> list = bVar.L;
                int i = this.c;
                if (!list.contains(Integer.valueOf(i))) {
                    return bVar;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Number) obj2).intValue() != i) {
                        arrayList.add(obj2);
                    }
                }
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, arrayList, 0, false, false, null, null, 0, null, 0, -1, 2097135);
            default:
                lt40.i((tgi0) obj, this.c);
                return s3q0.a;
        }
    }
}
