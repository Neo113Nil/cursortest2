package com.yandex.div.core.view2.reuse;

import android.view.View;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import java.lang.ref.WeakReference;
import xsna.epx;
import xsna.zcl;

/* compiled from: InputFocusTracker.kt */
/* loaded from: classes7.dex */
public final class InputFocusTracker {
    public static final Companion Companion = new Companion(null);
    private static WeakReference<View> lastFocused;
    private boolean changingState;
    private final InputFocusPersistentDivDataChangedObserver divDataChangedObserver;
    private Object focusedInputTag;

    /* compiled from: InputFocusTracker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: InputFocusTracker.kt */
    public final class InputFocusPersistentDivDataChangedObserver implements PersistentDivDataObserver {
        private boolean focusRequestedDuringChangeState;

        public InputFocusPersistentDivDataChangedObserver() {
        }

        @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
        public void onAfterDivDataChanged() {
            InputFocusTracker.this.changingState = false;
            if (this.focusRequestedDuringChangeState) {
                return;
            }
            InputFocusTracker.this.focusedInputTag = null;
        }

        @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
        public void onBeforeDivDataChanged() {
            InputFocusTracker.this.changingState = true;
            this.focusRequestedDuringChangeState = false;
        }

        public final void setFocusRequestedDuringChangeState(boolean z) {
            this.focusRequestedDuringChangeState = z;
        }
    }

    public InputFocusTracker(Div2View div2View) {
        InputFocusPersistentDivDataChangedObserver inputFocusPersistentDivDataChangedObserver = new InputFocusPersistentDivDataChangedObserver();
        this.divDataChangedObserver = inputFocusPersistentDivDataChangedObserver;
        div2View.addPersistentDivDataObserver$div_release(inputFocusPersistentDivDataChangedObserver);
    }

    public final void inputFocusChanged(Object obj, DivInputView divInputView, boolean z) {
        if (this.changingState) {
            return;
        }
        if (z) {
            this.focusedInputTag = obj;
            lastFocused = new WeakReference<>(divInputView);
            divInputView.setSelection(divInputView.length());
        } else {
            if (z) {
                return;
            }
            this.focusedInputTag = null;
            lastFocused = null;
        }
    }

    public final boolean isFocusedOnInput() {
        return this.focusedInputTag != null;
    }

    public final void removeFocusFromFocusedInput() {
        View view;
        WeakReference<View> weakReference = lastFocused;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.clearFocus();
        DivActionTypedUtilsKt.closeKeyboard(view);
    }

    public final void requestFocusIfNeeded(View view) {
        if (view.getTag() != null && epx.f(view.getTag(), this.focusedInputTag) && this.changingState) {
            this.divDataChangedObserver.setFocusRequestedDuringChangeState(true);
            view.requestFocus();
        }
    }
}
