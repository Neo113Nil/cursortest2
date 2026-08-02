package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendOptionsPopup$Option;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.av20;
import xsna.dw20;

/* compiled from: AvitoInteractor.kt */
/* loaded from: classes18.dex */
public final class vt5 implements s1y0 {
    public final Object b;

    public /* synthetic */ vt5(Object obj) {
        this.b = obj;
    }

    @Override // xsna.s1y0
    public void a(f1y0 f1y0Var) {
        com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.b;
        WriteBar writeBar = aVar.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.B.getClass();
        e4w e4wVar = aVar.H;
        View view = aVar.z;
        if (e4wVar.b(view != null ? view : null)) {
            return;
        }
        aVar.J(aVar.p);
    }

    @Override // xsna.s1y0
    public void b(f1y0 f1y0Var) {
        com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.b;
        aVar.J(aVar.p);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [T, xsna.dw20] */
    @Override // xsna.s1y0
    public boolean c() {
        Object value;
        com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.b;
        if (aVar.I() || aVar.i) {
            return false;
        }
        if (aVar.p.l() != null) {
            aVar.J(aVar.p);
            return true;
        }
        bpn0 bpn0Var = new bpn0(new com.vk.movika.sdk.base.ui.o0(25));
        bpn0 bpn0Var2 = new bpn0(new lk(26));
        Activity activity = aVar.o;
        List singletonList = Collections.singletonList(MsgSendOptionsPopup$Option.DELAYED);
        wi3 wi3Var = new wi3(aVar, 2);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        y61 y61Var = new y61(8, wi3Var, ref$ObjectRef);
        int f = e3m.f(R.attr.vk_ui_icon_accent, activity);
        int f2 = e3m.f(R.attr.vk_ui_text_primary, activity);
        int f3 = e3m.f(R.attr.vk_ui_background_negative, activity);
        av20.a aVar2 = new av20.a();
        aVar2.d(R.layout.ds_internal_actions_popup_item, LayoutInflater.from(activity));
        aVar2.d = new ux20(f2, activity, f3, f, null);
        aVar2.e = new vx20(y61Var);
        av20 b = aVar2.b();
        List list = singletonList;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = qy30.$EnumSwitchMapping$0[((MsgSendOptionsPopup$Option) it.next()).ordinal()];
            if (i == 1) {
                value = bpn0Var.getValue();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                value = bpn0Var2.getValue();
            }
            arrayList.add((e520) value);
        }
        b.setItems(arrayList);
        ref$ObjectRef.element = ((dw20.b) dw20.a.k(new dw20.b(activity, tzp0.a(null, 3)), b, 4)).I0("modal_msg_send_options");
        return true;
    }
}
