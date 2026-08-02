package androidx.core.os;

import android.os.OutcomeReceiver;
import defpackage.j18;
import defpackage.te10;

/* loaded from: classes10.dex */
public abstract class a {
    public static final OutcomeReceiver a(j18 j18Var) {
        return te10.i(new ContinuationOutcomeReceiver(j18Var));
    }
}
