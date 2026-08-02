package ru.rustore.sdk.core.config;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* compiled from: SdkType.kt */
/* loaded from: classes9.dex */
public enum SdkType {
    KOTLIN("kotlin"),
    UNITY(PluginErrorDetails.Platform.UNITY),
    FLUTTER(PluginErrorDetails.Platform.FLUTTER),
    UNREAL_ENGINE("unreal-engine"),
    GODOT("godot"),
    REACT_NATIVE("react-native");

    public static final a Companion = new a();
    private static final String KEY = "type";
    private final String value;

    /* compiled from: SdkType.kt */
    public static final class a {
    }

    SdkType(String str) {
        this.value = str;
    }

    public final String h() {
        return this.value;
    }
}
