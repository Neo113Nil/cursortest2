package xsna;

import com.vk.dto.group.Group;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ wl2(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                qgi0.h(tgi0Var, str);
                return s3q0.a;
            case 1:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    Group group = (Group) obj2;
                    String str2 = group.d;
                    String str3 = this.c;
                    if (drm0.D(str2, str3, true) || drm0.D(group.h, str3, true)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
                tgi0 tgi0Var2 = (tgi0) obj;
                String str4 = this.c;
                if (str4 == null) {
                    str4 = "";
                }
                qgi0.r(tgi0Var2, str4);
                return s3q0.a;
        }
    }
}
