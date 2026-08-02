package xsna;

import com.vk.core.view.components.button.VkButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class z26 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ z26(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue((dt1) obj);
                break;
            case 1:
                ((VkButton) obj).setLoading(((Boolean) this.c.getValue()).booleanValue());
                break;
            case 2:
                this.c.setValue((tny) obj);
                break;
            default:
                int i = (int) (((q9x) obj).a >> 32);
                if (i != 0) {
                    this.c.setValue(Integer.valueOf(i));
                }
                break;
        }
        return s3q0.a;
    }
}
