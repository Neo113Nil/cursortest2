package xsna;

import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eu10(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new com.vk.mediapicker.impl.presentation.mvi.e((com.vk.mediapicker.impl.presentation.mvi.b) this.d, this.c, (MediaPickerMviState.Medias.Loaded) this.e, null), 3));
            default:
                m5r0 m5r0Var = (m5r0) this.d;
                List list = (List) this.e;
                List list2 = (List) obj;
                a6r0 a6r0Var = m5r0Var.d;
                long j = m5r0Var.a.c().b;
                String str = (String) j5g.a0(list);
                if (str == null) {
                    str = "";
                }
                String str2 = m5r0Var.c;
                return rsg0.Z(yfb.x(a6r0Var.c(j, this.c, str, list2, str2)));
        }
    }
}
