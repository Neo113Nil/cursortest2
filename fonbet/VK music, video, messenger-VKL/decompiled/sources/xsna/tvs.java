package xsna;

import com.vk.fullscreenbanners.BlockType;

/* compiled from: FullScreenBlockParser.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class tvs {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BlockType.values().length];
        try {
            iArr[BlockType.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlockType.TITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlockType.IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BlockType.BUTTON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
