package androidx.camera.view.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ScreenFlashUiInfo$ProviderType {
    private static final /* synthetic */ ScreenFlashUiInfo$ProviderType[] $VALUES;
    public static final ScreenFlashUiInfo$ProviderType PREVIEW_VIEW;
    public static final ScreenFlashUiInfo$ProviderType SCREEN_FLASH_VIEW;

    static {
        ScreenFlashUiInfo$ProviderType screenFlashUiInfo$ProviderType = new ScreenFlashUiInfo$ProviderType("PREVIEW_VIEW", 0);
        PREVIEW_VIEW = screenFlashUiInfo$ProviderType;
        ScreenFlashUiInfo$ProviderType screenFlashUiInfo$ProviderType2 = new ScreenFlashUiInfo$ProviderType("SCREEN_FLASH_VIEW", 1);
        SCREEN_FLASH_VIEW = screenFlashUiInfo$ProviderType2;
        $VALUES = new ScreenFlashUiInfo$ProviderType[]{screenFlashUiInfo$ProviderType, screenFlashUiInfo$ProviderType2};
    }

    public static ScreenFlashUiInfo$ProviderType valueOf(String str) {
        return (ScreenFlashUiInfo$ProviderType) Enum.valueOf(ScreenFlashUiInfo$ProviderType.class, str);
    }

    public static ScreenFlashUiInfo$ProviderType[] values() {
        return (ScreenFlashUiInfo$ProviderType[]) $VALUES.clone();
    }
}
