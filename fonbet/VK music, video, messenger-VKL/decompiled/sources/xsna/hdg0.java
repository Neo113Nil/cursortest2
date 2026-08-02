package xsna;

import android.view.View;
import com.vk.dto.photo.Photo;
import xsna.baz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hdg0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hdg0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                idg0 idg0Var = (idg0) this.c;
                ((kdg0) idg0Var.a.getValue()).g((Photo) this.d);
                break;
            default:
                ycz0 ycz0Var = (ycz0) this.c;
                baz0.a aVar = (baz0.a) this.d;
                if (view != ycz0Var.p.getVideoControlView().getVideoControlButton()) {
                    if (view == ycz0Var.p.getVideoControlView().getSoundControlButton()) {
                        aVar.d();
                        break;
                    }
                } else {
                    aVar.c();
                    break;
                }
                break;
        }
    }
}
