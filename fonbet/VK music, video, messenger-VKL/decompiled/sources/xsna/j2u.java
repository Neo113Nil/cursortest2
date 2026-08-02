package xsna;

import com.vk.core.utils.newtork.d;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j2u implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ j2u(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                synchronized (qak0.c) {
                    List<? extends izs<Object, s3q0>> list = qak0.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke(obj);
                    }
                }
                return s3q0.a;
            default:
                return Boolean.valueOf(((com.vk.core.utils.newtork.d) obj) instanceof d.a);
        }
    }
}
