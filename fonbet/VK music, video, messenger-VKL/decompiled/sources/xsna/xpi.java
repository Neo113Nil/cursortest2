package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import xsna.mut0;

/* compiled from: MviComposeComponent.kt */
/* loaded from: classes3.dex */
public final class xpi {
    public static ComposeView a(Context context) {
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return composeView;
    }
}
