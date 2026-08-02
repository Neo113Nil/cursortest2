package com.google.android.gms.maps;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class MapsInitializer$Renderer {
    public static final MapsInitializer$Renderer LATEST;
    public static final MapsInitializer$Renderer LEGACY;
    private static final /* synthetic */ MapsInitializer$Renderer[] zza;

    static {
        MapsInitializer$Renderer mapsInitializer$Renderer = new MapsInitializer$Renderer("LEGACY", 0);
        LEGACY = mapsInitializer$Renderer;
        MapsInitializer$Renderer mapsInitializer$Renderer2 = new MapsInitializer$Renderer("LATEST", 1);
        LATEST = mapsInitializer$Renderer2;
        zza = new MapsInitializer$Renderer[]{mapsInitializer$Renderer, mapsInitializer$Renderer2};
    }

    public static MapsInitializer$Renderer valueOf(String str) {
        return (MapsInitializer$Renderer) Enum.valueOf(MapsInitializer$Renderer.class, str);
    }

    public static MapsInitializer$Renderer[] values() {
        return (MapsInitializer$Renderer[]) zza.clone();
    }
}
