package xsna;

import android.app.Activity;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.reactions.impl.models.AnimationID;

/* compiled from: ImReactionsFeatureImpl.kt */
/* loaded from: classes2.dex */
public final class ebw {
    public final hbw a;
    public final paw b;

    public ebw(hbw hbwVar, uaw uawVar) {
        this.a = hbwVar;
        this.b = uawVar;
    }

    public final void a(Msg msg, Integer num, boolean z, boolean z2, Activity activity) {
        int h = AnimationID.HEART.h();
        if (num != null && num.intValue() == h) {
            long j = msg.c;
            this.a.d(msg.d, msg.b, j, z2);
            return;
        }
        m5f0 m5f0Var = m5f0.a;
        dbw dbwVar = new dbw(this, msg, z2, 0);
        m5f0Var.getClass();
        m5f0.d(activity, z, dbwVar);
    }
}
