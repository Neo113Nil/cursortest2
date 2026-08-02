package com.yandex.passport.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yandex.passport.R;
import defpackage.w53;
import defpackage.wuj0;
import defpackage.yma1;
import java.util.Map;

/* loaded from: classes2.dex */
public class LoginValidationIndicator extends FrameLayout {
    private static final long SWITCH_DURATION = 150;
    private final ImageView imageInvalid;
    private final ImageView imageValid;
    private final ProgressBar progress;
    private State state;
    private Map<State, View> stateToViewMap;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State INDETERMINATE;
        public static final State INVALID;
        public static final State PROGRESS;
        public static final State VALID;

        static {
            State state = new State("INDETERMINATE", 0);
            INDETERMINATE = state;
            State state2 = new State("PROGRESS", 1);
            PROGRESS = state2;
            State state3 = new State("VALID", 2);
            VALID = state3;
            State state4 = new State("INVALID", 3);
            INVALID = state4;
            $VALUES = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public LoginValidationIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        State state = State.INDETERMINATE;
        this.state = state;
        this.stateToViewMap = new w53();
        ImageView imageView = new ImageView(getContext());
        this.imageValid = imageView;
        Resources resources = getResources();
        int i2 = R.drawable.passport_ic_login_validation_ok;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        imageView.setImageDrawable(yma1.b(resources, i2, theme));
        imageView.setVisibility(8);
        addView(imageView);
        ImageView imageView2 = new ImageView(getContext());
        this.imageInvalid = imageView2;
        imageView2.setImageDrawable(yma1.b(getResources(), R.drawable.passport_ic_login_validation_error, getContext().getTheme()));
        imageView2.setVisibility(8);
        addView(imageView2);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.progress = progressBar;
        progressBar.setVisibility(8);
        com.yandex.passport.legacy.d.b(getContext(), progressBar, R.color.passport_login_validation_progress_bar);
        addView(progressBar);
        this.stateToViewMap.put(state, null);
        this.stateToViewMap.put(State.VALID, imageView);
        this.stateToViewMap.put(State.INVALID, imageView2);
        this.stateToViewMap.put(State.PROGRESS, progressBar);
        setClipToPadding(false);
        setClipChildren(false);
    }

    private void switchState(State state, State state2) {
        if (state == state2) {
            return;
        }
        this.state = state2;
        View view = this.stateToViewMap.get(state);
        View view2 = this.stateToViewMap.get(state2);
        if (view != null) {
            view.animate().setDuration(150L).alpha(0.0f).start();
            view.animate().setDuration(150L).translationY(-getMeasuredHeight()).start();
        }
        if (view2 != null) {
            view2.setAlpha(0.0f);
            view2.setVisibility(0);
            view2.animate().setDuration(150L).alpha(1.0f).start();
            view2.setTranslationY(getMeasuredHeight());
            view2.animate().setDuration(150L).translationY(0.0f).start();
        }
    }

    public void onIndeterminate() {
        switchState(this.state, State.INDETERMINATE);
    }

    public void onInvalid() {
        switchState(this.state, State.INDETERMINATE);
    }

    public void onProgress() {
        switchState(this.state, State.PROGRESS);
    }

    public void onValid() {
        switchState(this.state, State.VALID);
    }

    public LoginValidationIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoginValidationIndicator(Context context) {
        this(context, null);
    }
}
