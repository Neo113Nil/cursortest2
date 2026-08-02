package com.yandex.go.safety.center.main;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.chr0;
import defpackage.k4o;
import defpackage.l050;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/yandex/go/safety/center/main/SafetyCenterMainMvpView;", "Ll050;", "ButtonState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SafetyCenterMainMvpView extends l050 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/main/SafetyCenterMainMvpView$ButtonState;", "", "VISIBLE", "GONE", "LOADING", "DISABLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ButtonState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonState[] $VALUES;
        public static final ButtonState DISABLED;
        public static final ButtonState GONE;
        public static final ButtonState LOADING;
        public static final ButtonState VISIBLE;

        static {
            ButtonState buttonState = new ButtonState("VISIBLE", 0);
            VISIBLE = buttonState;
            ButtonState buttonState2 = new ButtonState("GONE", 1);
            GONE = buttonState2;
            ButtonState buttonState3 = new ButtonState("LOADING", 2);
            LOADING = buttonState3;
            ButtonState buttonState4 = new ButtonState("DISABLED", 3);
            DISABLED = buttonState4;
            ButtonState[] buttonStateArr = {buttonState, buttonState2, buttonState3, buttonState4};
            $VALUES = buttonStateArr;
            $ENTRIES = kotlin.enums.a.a(buttonStateArr);
        }

        public static ButtonState valueOf(String str) {
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public static ButtonState[] values() {
            return (ButtonState[]) $VALUES.clone();
        }
    }

    void setButtonState(SafetyCenterExperiment.ButtonType buttonType, ButtonState buttonState);

    void setShakeToggleEnabled(chr0 chr0Var);

    void setStories(List list);

    void showShareDisabledTooltip();
}
