package xsna;

import android.util.Log;
import android.view.ActionMode;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.b;
import androidx.lifecycle.Lifecycle;
import com.ironsource.Ya;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonItemInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonViewRedesign;
import com.vkontakte.android.R;
import java.util.Objects;
import xsna.uc2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vc2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vc2(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                uc2 uc2Var = (uc2) this.c;
                nbo0 nbo0Var = (nbo0) this.d;
                uc2.b bVar = (uc2.b) this.e;
                ActionMode startActionMode = uc2Var.a.startActionMode(new hsr(nbo0Var), 1);
                epx.f(uc2Var.h, startActionMode);
                if (startActionMode == null) {
                    bVar.close();
                    break;
                }
                break;
            case 1:
                ((ink) this.c).b.a((String) this.d, (String) this.e);
                break;
            case 2:
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.c;
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) this.d;
                b.g gVar = (b.g) this.e;
                bds.a(operation.c, operation2.c, gVar.o, gVar.n);
                break;
            case 3:
                MsgSkeletonViewRedesign.c cVar = (MsgSkeletonViewRedesign.c) this.c;
                MsgSkeletonItemInfo msgSkeletonItemInfo = (MsgSkeletonItemInfo) this.d;
                MsgSkeletonViewRedesign msgSkeletonViewRedesign = (MsgSkeletonViewRedesign) this.e;
                bwt0.c0(msgSkeletonItemInfo.b, cVar.o);
                bwt0.r0(Math.min(an10.b(msgSkeletonItemInfo.a * cVar.itemView.getMeasuredWidth()), e3m.a(R.dimen.msg_bubble_max_width, msgSkeletonViewRedesign.getContext())), cVar.o);
                break;
            case 4:
                Lifecycle lifecycle = (Lifecycle) this.c;
                RemoteUtils.a aVar = (RemoteUtils.a) this.d;
                String str = (String) this.e;
                if (lifecycle != null) {
                    try {
                        if (lifecycle.getCurrentState().a(Lifecycle.State.CREATED)) {
                            aVar.a();
                            break;
                        }
                    } catch (BundlerException e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str), e);
                        return;
                    }
                }
                Objects.toString(aVar);
            default:
                Ya.a((Ya) this.c, (LevelPlayReward) this.d, (LevelPlayAdInfo) this.e);
                break;
        }
    }
}
