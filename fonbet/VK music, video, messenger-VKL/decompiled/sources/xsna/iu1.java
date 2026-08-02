package xsna;

import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import xsna.ab60;
import xsna.kz30;
import xsna.l6w;
import xsna.l8j;
import xsna.nub;
import xsna.otb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu1 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iu1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((vl1) obj2).invoke(obj);
                break;
            case 1:
                bpn0 bpn0Var = AppsPickerFragment.V;
                ((lf3) obj2).invoke(obj);
                break;
            case 2:
                ((vl1) obj2).invoke(obj);
                break;
            case 3:
                ((vl1) obj2).invoke(obj);
                break;
            case 4:
                ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
                break;
            case 5:
                ChatFragment.d dVar = ChatFragment.w1;
                ((a8) obj2).invoke(obj);
                break;
            case 6:
                ((otb.j) obj2).invoke(obj);
                break;
            case 7:
                ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
                break;
            case 8:
                ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
                break;
            case 9:
                ((k82) obj2).invoke(obj);
                break;
            case 10:
                ((xhe) obj2).invoke(obj);
                break;
            case 11:
                int i2 = CommunitiesManageNotificationsFragment.Z;
                ((k82) obj2).invoke(obj);
                break;
            case 12:
                ((l8j.i) obj2).invoke(obj);
                break;
            case 13:
                ((j37) obj2).invoke(obj);
                break;
            case 14:
                ((pw4) obj2).invoke(obj);
                break;
            case 15:
                ((rop) obj2).invoke(obj);
                break;
            case 16:
                jjq jjqVar = (jjq) obj2;
                nub.a aVar = (nub.a) obj;
                vm30 vm30Var = jjqVar.n;
                tk30 tk30Var = jjqVar.q;
                if (vm30Var == null) {
                    vm30Var = null;
                }
                Dialog dialog = aVar.b;
                mj30 mj30Var = aVar.a;
                vm30Var.h0 = f870.I(dialog);
                vm30Var.P(!r6.m);
                vm30Var.R();
                mj30Var.getClass();
                gj30 gj30Var = mj30Var.a;
                tk30Var.F(mj30Var.b);
                tk30Var.A(dialog.tc());
                tk30Var.B(dialog.uc());
                tk30Var.z(dialog.sc());
                tk30Var.t(jgm.a(dialog));
                tk30Var.v(aVar.c);
                tk30Var.G(dialog.T8());
                tk30Var.w(dialog.Zb());
                tk30Var.J(dialog.mc());
                tk30Var.u(dialog.Gb());
                tk30Var.D(dialog.Xb().k());
                PinnedMsg dc = dialog.dc();
                tk30Var.E(dc != null ? Integer.valueOf(dc.c) : null);
                jjqVar.X0(tk30Var.e(gj30Var, -1));
                Msg msg = (Msg) j5g.Z(gj30Var);
                if (msg != null) {
                    int i3 = msg.b;
                    vm30 vm30Var2 = jjqVar.n;
                    (vm30Var2 != null ? vm30Var2 : null).l(MsgIdType.LOCAL_ID, i3, "vcInit");
                    break;
                }
                break;
            case 17:
                ((rop) obj2).invoke(obj);
                break;
            case 18:
                ((vsq) obj2).invoke(obj);
                break;
            case 19:
                ((rop) obj2).invoke(obj);
                break;
            case 20:
                ((nhe) obj2).invoke(obj);
                break;
            case 21:
                ((d7w) obj2).c(new l6w.b.i(((Boolean) obj).booleanValue()));
                break;
            case 22:
                ((k82) obj2).invoke(obj);
                break;
            case 23:
                ((rop) obj2).invoke(obj);
                break;
            case 24:
                ((kz30.g) obj2).invoke(obj);
                break;
            case 25:
                ((k82) obj2).invoke(obj);
                break;
            case 26:
                ((m350) obj2).invoke(obj);
                break;
            case 27:
                ((vw4) obj2).invoke(obj);
                break;
            case 28:
                ((rop) obj2).invoke(obj);
                break;
            default:
                ((ab60.a) obj2).invoke(obj);
                break;
        }
    }
}
