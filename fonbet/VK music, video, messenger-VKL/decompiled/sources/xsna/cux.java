package xsna;

import android.view.View;
import xsna.bux;

/* compiled from: ItemBaseContract.kt */
/* loaded from: classes7.dex */
public interface cux<P extends bux> extends dc6<P> {
    default void L5(View view, String str) {
        if (str.length() == 0) {
            if (view != null) {
                f4m.j(view);
            }
        } else if (view != null) {
            view.setVisibility(0);
        }
    }

    default void setActionVisibility(boolean z) {
    }
}
