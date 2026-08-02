package xsna;

import android.view.View;
import com.vkontakte.android.R;
import java.util.LinkedHashSet;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: ClipsEditorLogger.kt */
/* loaded from: classes.dex */
public final class lyd {
    public static xke a = new yke();
    public static final siw b = new siw("THUMBHASH", ".thumbhash");
    public static final con0 c = new con0("NO_VALUE");
    public static bpn0 d;

    public lyd() {
        new LinkedHashSet(20);
    }

    public static final caj0 a(int i, int i2, BufferOverflow bufferOverflow) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "replay cannot be negative, but was ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(lhg.a(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i2 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new caj0(i, i3, bufferOverflow);
    }

    public static /* synthetic */ caj0 b(int i, int i2, BufferOverflow bufferOverflow, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i, i2, bufferOverflow);
    }

    public static final Object c(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final ksr e(baj0 baj0Var, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? baj0Var : new wya(i, dVar, bufferOverflow, baj0Var);
    }

    public static final z1h0 f(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            z1h0 z1h0Var = tag instanceof z1h0 ? (z1h0) tag : null;
            if (z1h0Var != null) {
                return z1h0Var;
            }
            Object m = fvr.m(view);
            view = m instanceof View ? (View) m : null;
        }
        return null;
    }

    public static final fl4 g() {
        bpn0 bpn0Var = d;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (fl4) bpn0Var.getValue();
    }

    public static final void h(View view, z1h0 z1h0Var) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, z1h0Var);
    }
}
