package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RxExt.kt */
/* loaded from: classes2.dex */
public final class fnb implements izs {
    public static final fnb c = new fnb(0);
    public static final fnb d = new fnb(1);
    public final /* synthetic */ int b;

    public /* synthetic */ fnb(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof n980);
            default:
                List<a610> list = ((g610) obj).d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (a610 a610Var : list) {
                    long j = a610Var.c;
                    UserId userId = a610Var.a;
                    ImageSize imageSize = (ImageSize) ixj0.c(b210.g(a610Var.d), cn70.b(128), cn70.b(152));
                    String str = imageSize != null ? imageSize.d.d : null;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new s110(j, userId, str, a610Var.e, a610Var.f, (int) a610Var.h, a610Var.g));
                }
                return new wow(arrayList);
        }
    }
}
