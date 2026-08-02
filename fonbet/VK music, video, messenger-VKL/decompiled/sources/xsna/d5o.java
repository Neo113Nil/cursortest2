package xsna;

import com.vk.api.generated.video.dto.VideoDonutActionDto;
import com.vk.api.generated.video.dto.VideoDonutPopupDto;

/* compiled from: DonutVideoDtoToDonutVideoMapper.kt */
/* loaded from: classes3.dex */
public final class d5o {

    /* compiled from: DonutVideoDtoToDonutVideoMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoDonutPopupDto.IllustrationDto.values().length];
            try {
                iArr[VideoDonutPopupDto.IllustrationDto.ILLUSTRATION_DONUT_LOGO_CONFETTI_120H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoDonutActionDto.TypeDto.values().length];
            try {
                iArr2[VideoDonutActionDto.TypeDto.HIGHER_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[VideoDonutActionDto.TypeDto.EDIT_PRIVACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VideoDonutActionDto.TypeDto.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
