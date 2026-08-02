package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import xsna.mut0;

/* compiled from: ComposeExt.kt */
/* loaded from: classes17.dex */
public final class mpi {
    public static ComposeView a(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setLayoutParams(layoutParams);
        return composeView;
    }
}
