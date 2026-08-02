package xsna;

import com.vk.core.view.components.rating.RatingBar$Size;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class y2x implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ y2x(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.c.setValue(bool);
                break;
            case 1:
                this.c.setValue((RatingBar$Size) obj);
                break;
            default:
                this.c.setValue(new htv0(((Float) obj).floatValue()));
                break;
        }
        return s3q0.a;
    }
}
