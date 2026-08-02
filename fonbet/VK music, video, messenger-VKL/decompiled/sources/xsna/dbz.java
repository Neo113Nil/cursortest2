package xsna;

import com.vk.api.generated.ads.dto.AdsItemBlockAdCardDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdItemDto;
import com.vk.api.generated.prettyCards.dto.PrettyCardsPrettyCardDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAdActionButtonDto;

/* compiled from: LinkUrlTargetDtoMapper.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class dbz {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[AdsItemBlockAdCardDto.LinkUrlTargetDto.values().length];
        try {
            iArr[AdsItemBlockAdCardDto.LinkUrlTargetDto.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdsItemBlockAdCardDto.LinkUrlTargetDto.EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdsItemBlockAdCardDto.LinkUrlTargetDto.INTERNAL_HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[AdsItemBlockAdItemDto.LinkUrlTargetDto.values().length];
        try {
            iArr2[AdsItemBlockAdItemDto.LinkUrlTargetDto.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AdsItemBlockAdItemDto.LinkUrlTargetDto.EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AdsItemBlockAdItemDto.LinkUrlTargetDto.INTERNAL_HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[PrettyCardsPrettyCardDto.LinkUrlTargetDto.values().length];
        try {
            iArr3[PrettyCardsPrettyCardDto.LinkUrlTargetDto.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[PrettyCardsPrettyCardDto.LinkUrlTargetDto.EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[ShortVideoAdActionButtonDto.UrlTargetDto.values().length];
        try {
            iArr4[ShortVideoAdActionButtonDto.UrlTargetDto.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[ShortVideoAdActionButtonDto.UrlTargetDto.INTERNAL_HIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[ShortVideoAdActionButtonDto.UrlTargetDto.EXTERNAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$3 = iArr4;
    }
}
