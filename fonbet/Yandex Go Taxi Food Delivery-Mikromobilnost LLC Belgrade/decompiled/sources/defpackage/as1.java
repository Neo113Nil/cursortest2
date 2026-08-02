package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes8.dex */
public final class as1 implements bnj {
    public final Set a;

    public as1(xw91 xw91Var, t830 t830Var, zwf0 zwf0Var, Context context) {
        this.a = Collections.singleton(new dnj("alice_chat_haptic"));
    }

    @Override // defpackage.bnj
    public final void h(smj smjVar) {
    }

    @Override // defpackage.bnj
    public final Set m() {
        return this.a;
    }
}
