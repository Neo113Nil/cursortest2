package xsna;

import android.os.Handler;
import com.vk.clips.editor.templates.impl.player.MusicPlayerState;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import com.vk.log.L;
import com.vk.money.createtransfer.people.CreatePeopleTransferPresenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gsa implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gsa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                jsa jsaVar = (jsa) obj;
                xx0 xx0Var = new xx0(9);
                jsaVar.getClass();
                jsa.c(xx0Var);
                qaj0.c(jsaVar.b.c(), "changed_name", null);
                break;
            case 1:
                qyd qydVar = (qyd) obj;
                Handler handler = qydVar.j;
                handler.removeCallbacksAndMessages(null);
                som0 som0Var = qydVar.a;
                ((q850) som0Var.b).stop(26);
                handler.removeCallbacksAndMessages(null);
                q850 q850Var = (q850) som0Var.b;
                if (t850.a(q850Var.h()) != MusicPlayerState.STOPPED) {
                    q850Var.stop(26);
                }
                q850Var.getClass();
                bn40.f(new Object[0]);
                q850Var.d.e();
                break;
            case 2:
                ((CreatePeopleTransferPresenter) obj).n = false;
                break;
            case 3:
                xam xamVar = (xam) obj;
                xamVar.o = null;
                zam zamVar = xamVar.u;
                if (zamVar != null) {
                    zamVar.b();
                    break;
                }
                break;
            case 4:
                int i2 = MasksWrap.e0;
                L.e("MasksWrap", "getMask " + ((Mask) obj) + " is disposed");
                break;
            default:
                ((w920) obj).q.compareAndSet(true, false);
                break;
        }
    }
}
