package xsna;

import com.vk.core.view.components.formitem.VkTextArea;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fha0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ fha0(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 1:
                ((ikv0) obj).a();
                gzsVar.invoke();
                break;
            default:
                int i2 = VkTextArea.r;
                gzsVar.invoke();
                break;
        }
        return s3q0.a;
    }
}
