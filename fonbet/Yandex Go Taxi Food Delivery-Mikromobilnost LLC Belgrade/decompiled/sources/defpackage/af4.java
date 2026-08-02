package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes15.dex */
public final class af4 {
    public final View a;
    public xe4 b;

    public af4(View view) {
        this.a = view;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        if (this.b == null || i != 4) {
            return false;
        }
        int action = keyEvent.getAction();
        View view = this.a;
        if (action == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        return this.b.onBackClick();
    }

    public final void b(View view) {
        if (view == this.a) {
            c();
        }
    }

    public final void c() {
        View rootView;
        View view = this.a;
        boolean z = view.isShown() && this.b != null;
        if (view.hasWindowFocus()) {
            boolean hasFocus = view.hasFocus();
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            if (z) {
                view.requestFocus();
            } else {
                if (!hasFocus || (rootView = view.getRootView()) == null) {
                    return;
                }
                rootView.requestFocus(33);
            }
        }
    }
}
