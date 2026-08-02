package xsna;

import com.vk.movika.sdk.player.base.model.PlayerItemVariant;

/* compiled from: PlayerItem.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2b0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PlayerItemVariant.Type.values().length];
        try {
            iArr[PlayerItemVariant.Type.HLS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerItemVariant.Type.MP4.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayerItemVariant.Type.DASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
