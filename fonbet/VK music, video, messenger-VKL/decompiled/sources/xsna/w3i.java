package xsna;

import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class w3i implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ w3i(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue((tho0) obj);
                break;
            case 1:
                this.c.setValue((ContextMenuScreenContent.ImplementationType) obj);
                break;
            case 2:
                this.c.setValue(Integer.valueOf(((ljo0) obj).b.f));
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.c.setValue(bool);
                break;
            default:
                ((Boolean) obj).getClass();
                this.c.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                break;
        }
        return s3q0.a;
    }
}
