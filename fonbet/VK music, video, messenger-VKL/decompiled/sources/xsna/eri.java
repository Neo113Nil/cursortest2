package xsna;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import xsna.dri;

/* compiled from: ComposeUserProfileViewHolder.kt */
/* loaded from: classes5.dex */
public abstract class eri<T extends dri<?>> {
    public static dri b(eri eriVar, Context context, slq0 slq0Var, zuq0 zuq0Var, int i) {
        int i2 = (i & 16) != 0 ? -2 : -1;
        eriVar.getClass();
        ComposeView e = sv1.e(context);
        vq.b(-1, i2, e);
        return eriVar.a(e, slq0Var, zuq0Var);
    }

    public abstract dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var);
}
