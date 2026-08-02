package xsna;

import android.view.View;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vkontakte.android.R;
import java.util.Iterator;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class wm30 implements Runnable {
    public final /* synthetic */ vm30 b;
    public final /* synthetic */ MsgFromUser c;
    public final /* synthetic */ k3b d;
    public final /* synthetic */ izs e;

    public wm30(vm30 vm30Var, MsgFromUser msgFromUser, k3b k3bVar, izs izsVar) {
        this.b = vm30Var;
        this.c = msgFromUser;
        this.d = k3bVar;
        this.e = izsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q1f0 C;
        izs izsVar;
        MsgIdType msgIdType = MsgIdType.LOCAL_ID;
        MsgFromUser msgFromUser = this.c;
        int i = msgFromUser.b;
        vm30 vm30Var = this.b;
        ok30 ok30Var = vm30Var.H;
        View view = null;
        if (ok30Var == null) {
            ok30Var = null;
        }
        if (ok30Var != null) {
            Iterator it = ok30Var.x0(msgIdType, i).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View findViewByPosition = vm30Var.I.findViewByPosition(((Number) it.next()).intValue());
                View findViewById = findViewByPosition != null ? findViewByPosition.findViewById(R.id.add_reaction_floating) : null;
                if (findViewById != null && f4m.h(findViewById)) {
                    view = findViewById;
                    break;
                }
            }
        }
        if (view == null || (C = vm30Var.C(msgFromUser, view, this.d)) == null || (izsVar = this.e) == null) {
            return;
        }
        izsVar.invoke(C);
    }
}
