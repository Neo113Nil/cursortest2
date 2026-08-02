package defpackage;

import android.view.View;

/* loaded from: classes12.dex */
public interface nsn {
    void clearOverlayDetachPreserve();

    void destroyCompletely();

    View getView();

    boolean isContentScrollAtBottom();

    boolean isFlexDocumentAlive();

    void onPagePaused();

    void onPageResumed();

    void prepareForOverlayDetach();
}
