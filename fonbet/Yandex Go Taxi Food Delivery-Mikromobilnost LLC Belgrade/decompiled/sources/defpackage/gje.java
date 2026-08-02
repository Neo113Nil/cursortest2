package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public interface gje {
    View getView();

    boolean onBackPressed();

    default void onHasStartedBeingOverlapped() {
    }

    default void onHasStoppedBeingOverlapped() {
    }

    default void onModalExpanded() {
    }

    default void onModalHide() {
    }

    default void onPause() {
    }

    default void onResume() {
    }

    default void onStart() {
    }

    default void onStop() {
    }
}
