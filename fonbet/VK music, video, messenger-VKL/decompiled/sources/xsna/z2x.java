package xsna;

import com.vk.stories.design.view.stickerbutton.ReactionStickerButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class z2x implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ z2x(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        wh50 wh50Var = this.c;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        switch (i) {
            case 0:
                wh50Var.setValue(bool);
                break;
            default:
                int i2 = ReactionStickerButton.c;
                wh50Var.setValue(bool);
                break;
        }
        return s3q0.a;
    }
}
