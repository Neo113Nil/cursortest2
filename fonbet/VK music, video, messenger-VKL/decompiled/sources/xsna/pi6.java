package xsna;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.im.engine.models.messages.Msg;
import one.video.controls20.SimpleControlsView;
import xsna.x7j0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pi6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pi6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qi6 qi6Var = (qi6) obj;
                u1c0 J0 = qi6Var.J0();
                int i2 = J0 != null ? J0.k : -1;
                s980 l6 = qi6Var.l6();
                if (l6 != null) {
                    l6.U5(qi6Var.t6(), true, i2);
                    break;
                }
                break;
            case 1:
                sq7 sq7Var = (sq7) obj;
                if (!sq7Var.G) {
                    sq7Var.U6(sq7Var.itemView);
                    break;
                }
                break;
            case 2:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                bpn0 bpn0Var = jjc.a;
                if (!jjc.d().b(400L)) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 3:
                e8j0 e8j0Var = (e8j0) obj;
                x7j0.i iVar = x7j0.i.b;
                e8j0Var.getClass();
                xn50.a.c(e8j0Var, iVar);
                break;
            case 4:
                y5r y5rVar = ((SimpleControlsView) obj).C;
                if (y5rVar != null) {
                    y5rVar.a();
                    break;
                }
                break;
            case 5:
                qfk0 qfk0Var = (qfk0) obj;
                qfk0Var.b.a(qfk0Var.k.getText().toString());
                break;
            case 6:
                ((com.vk.photo.editor.features.colorgrading.h) obj).c(false);
                break;
            case 7:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) obj;
                pk30 pk30Var = aVar.J;
                Msg msg = aVar.p.R;
                if (pk30Var != null && msg != null) {
                    pk30Var.U(msg, new sz30(false));
                    break;
                }
                break;
            case 8:
                ((AppCompatCheckBox) obj).setChecked(!r3.isChecked());
                break;
            default:
                fzy0 fzy0Var = (fzy0) obj;
                fzy0Var.g.b(fzy0Var.P);
                break;
        }
    }
}
