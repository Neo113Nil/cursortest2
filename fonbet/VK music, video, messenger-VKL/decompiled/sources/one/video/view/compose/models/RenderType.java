package one.video.view.compose.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RenderType.kt */
/* loaded from: classes8.dex */
public final class RenderType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RenderType[] $VALUES;
    public static final RenderType SURFACE;
    public static final RenderType TEXTURE;

    static {
        RenderType renderType = new RenderType("TEXTURE", 0);
        TEXTURE = renderType;
        RenderType renderType2 = new RenderType("SURFACE", 1);
        SURFACE = renderType2;
        RenderType[] renderTypeArr = {renderType, renderType2};
        $VALUES = renderTypeArr;
        $ENTRIES = new asp(renderTypeArr);
    }

    public RenderType() {
        throw null;
    }

    public static RenderType valueOf(String str) {
        return (RenderType) Enum.valueOf(RenderType.class, str);
    }

    public static RenderType[] values() {
        return (RenderType[]) $VALUES.clone();
    }
}
