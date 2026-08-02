package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.feature.dashboard.internal.data.dto.BalanceItem;

/* loaded from: classes3.dex */
public abstract class jy00 {
    public static final float[] a = new float[91];

    public static void a(Outline outline, rq90 rq90Var) {
        if (rq90Var instanceof jb2) {
            outline.setPath(((jb2) rq90Var).a);
        } else {
            w511.x("Unable to obtain android.graphics.Path");
        }
    }

    public static final jo4 b(BalanceItem balanceItem) {
        ColoredTextDto coloredText = balanceItem.getColoredText();
        return new jo4(new zhc(coloredText.getText(), coloredText.getThemedColor()), balanceItem.getThemedImage());
    }

    public static final void c(int i, Context context) {
        if (!(context instanceof ContextThemeWrapper)) {
            context.setTheme(i);
            return;
        }
        ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
        contextThemeWrapper.setTheme((Resources.Theme) null);
        contextThemeWrapper.setTheme(i);
    }
}
