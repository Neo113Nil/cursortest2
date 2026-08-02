package defpackage;

import android.view.View;

/* loaded from: classes14.dex */
public interface oc80 {
    void disableNestedScrolling();

    void forceScrollToTop();

    int getHeight();

    int getHeight(float f);

    View getView();

    void insetsType(t1w t1wVar);

    void onListStateChanged(int i, boolean z);

    void pause();

    void resume();

    void scrollToTop();

    boolean topItemIsCompletelyVisible();
}
