package androidx.appcompat.widget;

import android.content.res.Resources;
import android.widget.SpinnerAdapter;

/* loaded from: classes10.dex */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(Resources.Theme theme);
}
