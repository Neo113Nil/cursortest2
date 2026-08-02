package com.yandex.go.scooters.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/scooters/api/analytics/CameraTappedButton;", "", "", "buttonName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "GO_TO_SETTINGS", "TAKE_NEW_PHOTO", "FINISH_RIDING", "RISKY_FINISH_RIDING", "TAKE_PHOTO", "CLOSE", "TORCH", "EXIT", "DONE", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraTappedButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CameraTappedButton[] $VALUES;
    public static final CameraTappedButton CLOSE;
    public static final CameraTappedButton DONE;
    public static final CameraTappedButton EXIT;
    public static final CameraTappedButton FINISH_RIDING;
    public static final CameraTappedButton GO_TO_SETTINGS;
    public static final CameraTappedButton RISKY_FINISH_RIDING;
    public static final CameraTappedButton TAKE_NEW_PHOTO;
    public static final CameraTappedButton TAKE_PHOTO;
    public static final CameraTappedButton TORCH;
    private final String buttonName;

    static {
        CameraTappedButton cameraTappedButton = new CameraTappedButton("GO_TO_SETTINGS", 0, "go_to_settings");
        GO_TO_SETTINGS = cameraTappedButton;
        CameraTappedButton cameraTappedButton2 = new CameraTappedButton("TAKE_NEW_PHOTO", 1, "take_a_new_one");
        TAKE_NEW_PHOTO = cameraTappedButton2;
        CameraTappedButton cameraTappedButton3 = new CameraTappedButton("FINISH_RIDING", 2, "finish_riding");
        FINISH_RIDING = cameraTappedButton3;
        CameraTappedButton cameraTappedButton4 = new CameraTappedButton("RISKY_FINISH_RIDING", 3, "risky_finish_riding");
        RISKY_FINISH_RIDING = cameraTappedButton4;
        CameraTappedButton cameraTappedButton5 = new CameraTappedButton("TAKE_PHOTO", 4, "take_photo");
        TAKE_PHOTO = cameraTappedButton5;
        CameraTappedButton cameraTappedButton6 = new CameraTappedButton("CLOSE", 5, "close");
        CLOSE = cameraTappedButton6;
        CameraTappedButton cameraTappedButton7 = new CameraTappedButton("TORCH", 6, "torch");
        TORCH = cameraTappedButton7;
        CameraTappedButton cameraTappedButton8 = new CameraTappedButton("EXIT", 7, "exit");
        EXIT = cameraTappedButton8;
        CameraTappedButton cameraTappedButton9 = new CameraTappedButton("DONE", 8, "done");
        DONE = cameraTappedButton9;
        CameraTappedButton[] cameraTappedButtonArr = {cameraTappedButton, cameraTappedButton2, cameraTappedButton3, cameraTappedButton4, cameraTappedButton5, cameraTappedButton6, cameraTappedButton7, cameraTappedButton8, cameraTappedButton9};
        $VALUES = cameraTappedButtonArr;
        $ENTRIES = a.a(cameraTappedButtonArr);
    }

    public CameraTappedButton(String str, int i, String str2) {
        this.buttonName = str2;
    }

    public static CameraTappedButton valueOf(String str) {
        return (CameraTappedButton) Enum.valueOf(CameraTappedButton.class, str);
    }

    public static CameraTappedButton[] values() {
        return (CameraTappedButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }
}
