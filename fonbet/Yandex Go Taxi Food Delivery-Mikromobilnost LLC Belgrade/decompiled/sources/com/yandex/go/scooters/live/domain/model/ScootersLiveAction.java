package com.yandex.go.scooters.live.domain.model;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.k4o;
import defpackage.r0h0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/scooters/live/domain/model/ScootersLiveAction;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "iconRes", CA20Status.STATUS_USER_I, "c", "()I", "Lcom/yandex/go/scooters/live/domain/model/ScootersLiveAction$BackgroundColor;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/go/scooters/live/domain/model/ScootersLiveAction$BackgroundColor;", "a", "()Lcom/yandex/go/scooters/live/domain/model/ScootersLiveAction$BackgroundColor;", "Lru/yandex/taxi/scooters/presentation/ontheway/domain/model/ScootersOnTheWayAction;", "onTheWayAction", "Lru/yandex/taxi/scooters/presentation/ontheway/domain/model/ScootersOnTheWayAction;", "f", "()Lru/yandex/taxi/scooters/presentation/ontheway/domain/model/ScootersOnTheWayAction;", "BackgroundColor", "START", "CONTINUE", "BEEP", "PAUSE", "CANCEL", "FINISH", "ROUTE", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersLiveAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersLiveAction[] $VALUES;
    public static final ScootersLiveAction BEEP;
    public static final ScootersLiveAction CANCEL;
    public static final ScootersLiveAction CONTINUE;
    public static final ScootersLiveAction FINISH;
    public static final ScootersLiveAction PAUSE;
    public static final ScootersLiveAction ROUTE;
    public static final ScootersLiveAction START;
    private final BackgroundColor backgroundColor;
    private final int iconRes;
    private final String id;
    private final ScootersOnTheWayAction onTheWayAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/live/domain/model/ScootersLiveAction$BackgroundColor;", "", "ACCENT", "PALE", "MINOR", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class BackgroundColor {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BackgroundColor[] $VALUES;
        public static final BackgroundColor ACCENT;
        public static final BackgroundColor MINOR;
        public static final BackgroundColor PALE;

        static {
            BackgroundColor backgroundColor = new BackgroundColor("ACCENT", 0);
            ACCENT = backgroundColor;
            BackgroundColor backgroundColor2 = new BackgroundColor("PALE", 1);
            PALE = backgroundColor2;
            BackgroundColor backgroundColor3 = new BackgroundColor("MINOR", 2);
            MINOR = backgroundColor3;
            BackgroundColor[] backgroundColorArr = {backgroundColor, backgroundColor2, backgroundColor3};
            $VALUES = backgroundColorArr;
            $ENTRIES = a.a(backgroundColorArr);
        }

        public static BackgroundColor valueOf(String str) {
            return (BackgroundColor) Enum.valueOf(BackgroundColor.class, str);
        }

        public static BackgroundColor[] values() {
            return (BackgroundColor[]) $VALUES.clone();
        }
    }

    static {
        ScootersLiveAction scootersLiveAction = new ScootersLiveAction("START", 0, "start", r0h0.ic_scooters_live_action_start, BackgroundColor.ACCENT, ScootersOnTheWayAction.START);
        START = scootersLiveAction;
        int i = r0h0.ic_scooters_live_action_continue;
        BackgroundColor backgroundColor = BackgroundColor.MINOR;
        ScootersLiveAction scootersLiveAction2 = new ScootersLiveAction("CONTINUE", 1, "continue", i, backgroundColor, ScootersOnTheWayAction.CONTINUE);
        CONTINUE = scootersLiveAction2;
        ScootersLiveAction scootersLiveAction3 = new ScootersLiveAction("BEEP", 2, "beep", r0h0.ic_scooters_live_action_beep, backgroundColor, ScootersOnTheWayAction.BEEP);
        BEEP = scootersLiveAction3;
        ScootersLiveAction scootersLiveAction4 = new ScootersLiveAction("PAUSE", 3, "pause", r0h0.ic_scooters_live_action_pause, backgroundColor, ScootersOnTheWayAction.PAUSE);
        PAUSE = scootersLiveAction4;
        ScootersLiveAction scootersLiveAction5 = new ScootersLiveAction("CANCEL", 4, "cancel", r0h0.ic_scooters_live_action_cancel, backgroundColor, ScootersOnTheWayAction.CANCEL);
        CANCEL = scootersLiveAction5;
        ScootersLiveAction scootersLiveAction6 = new ScootersLiveAction("FINISH", 5, "finish", r0h0.ic_scooters_live_action_finish, BackgroundColor.PALE, ScootersOnTheWayAction.FINISH);
        FINISH = scootersLiveAction6;
        ScootersLiveAction scootersLiveAction7 = new ScootersLiveAction("ROUTE", 6, "route", r0h0.ic_scooters_live_action_route, backgroundColor, ScootersOnTheWayAction.ROUTE);
        ROUTE = scootersLiveAction7;
        ScootersLiveAction[] scootersLiveActionArr = {scootersLiveAction, scootersLiveAction2, scootersLiveAction3, scootersLiveAction4, scootersLiveAction5, scootersLiveAction6, scootersLiveAction7};
        $VALUES = scootersLiveActionArr;
        $ENTRIES = a.a(scootersLiveActionArr);
    }

    public ScootersLiveAction(String str, int i, String str2, int i2, BackgroundColor backgroundColor, ScootersOnTheWayAction scootersOnTheWayAction) {
        this.id = str2;
        this.iconRes = i2;
        this.backgroundColor = backgroundColor;
        this.onTheWayAction = scootersOnTheWayAction;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static ScootersLiveAction valueOf(String str) {
        return (ScootersLiveAction) Enum.valueOf(ScootersLiveAction.class, str);
    }

    public static ScootersLiveAction[] values() {
        return (ScootersLiveAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final BackgroundColor getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: c, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* renamed from: f, reason: from getter */
    public final ScootersOnTheWayAction getOnTheWayAction() {
        return this.onTheWayAction;
    }

    public final String getId() {
        return this.id;
    }
}
