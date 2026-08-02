package defpackage;

import android.view.View;
import androidx.recyclerview.widget.x0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public abstract class ncl0 extends x0 {
    public final n0 N;

    public ncl0(View view) {
        super(view);
        this.N = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public abstract void W(zfu0 zfu0Var);

    public abstract void X(int i, boolean z);

    public abstract tpr Y();

    public abstract boolean Z();
}
