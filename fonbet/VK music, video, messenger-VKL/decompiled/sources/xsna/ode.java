package xsna;

import com.vk.im.engine.models.messages.MsgFromUser;

/* compiled from: _Sequences.kt */
/* loaded from: classes17.dex */
public final class ode implements izs {
    public static final ode c = new ode(0);
    public static final ode d = new ode(1);
    public final /* synthetic */ int b;

    public /* synthetic */ ode(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof vee);
            default:
                return Boolean.valueOf(obj instanceof MsgFromUser);
        }
    }
}
