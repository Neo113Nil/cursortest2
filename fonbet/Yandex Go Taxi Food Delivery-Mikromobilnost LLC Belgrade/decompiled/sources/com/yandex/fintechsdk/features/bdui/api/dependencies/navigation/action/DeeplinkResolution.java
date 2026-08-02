package com.yandex.fintechsdk.features.bdui.api.dependencies.navigation.action;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/api/dependencies/navigation/action/DeeplinkResolution;", "", "HANDLED", "NOT_HANDLED", "FAILED", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeeplinkResolution {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeeplinkResolution[] $VALUES;
    public static final DeeplinkResolution FAILED;
    public static final DeeplinkResolution HANDLED;
    public static final DeeplinkResolution NOT_HANDLED;

    static {
        DeeplinkResolution deeplinkResolution = new DeeplinkResolution("HANDLED", 0);
        HANDLED = deeplinkResolution;
        DeeplinkResolution deeplinkResolution2 = new DeeplinkResolution("NOT_HANDLED", 1);
        NOT_HANDLED = deeplinkResolution2;
        DeeplinkResolution deeplinkResolution3 = new DeeplinkResolution("FAILED", 2);
        FAILED = deeplinkResolution3;
        DeeplinkResolution[] deeplinkResolutionArr = {deeplinkResolution, deeplinkResolution2, deeplinkResolution3};
        $VALUES = deeplinkResolutionArr;
        $ENTRIES = a.a(deeplinkResolutionArr);
    }

    public static DeeplinkResolution valueOf(String str) {
        return (DeeplinkResolution) Enum.valueOf(DeeplinkResolution.class, str);
    }

    public static DeeplinkResolution[] values() {
        return (DeeplinkResolution[]) $VALUES.clone();
    }
}
