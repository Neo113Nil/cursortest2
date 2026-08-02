package xsna;

import com.vk.design.demo.presentation.components.ThemeType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ayb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ ayb(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke();
                break;
            case 1:
                if (((ThemeType) obj) == ThemeType.LEGO) {
                    this.c.invoke();
                }
                break;
            default:
                this.c.invoke();
                break;
        }
        return s3q0.a;
    }
}
