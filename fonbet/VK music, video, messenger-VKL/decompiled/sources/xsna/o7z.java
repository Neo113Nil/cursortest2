package xsna;

import com.vk.dto.common.gift.GiftRarity;

/* compiled from: LimitedGiftsHelper.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class o7z {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[GiftRarity.Type.values().length];
        try {
            iArr[GiftRarity.Type.UNCOMMON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GiftRarity.Type.RARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GiftRarity.Type.LEGENDARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
