package xsna;

import com.vk.dto.common.DuetType;
import com.vk.media.ok.utils.DuetAction;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StoryParamsConverter.kt */
/* loaded from: classes16.dex */
public final class v7m0 {

    /* compiled from: StoryParamsConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DuetType.values().length];
            try {
                iArr[DuetType.BLUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DuetType.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DuetType.VERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DuetType.HOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static DuetAction a(DuetType duetType) {
        int i = duetType == null ? -1 : a.$EnumSwitchMapping$0[duetType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return DuetAction.BLUR;
        }
        if (i == 2) {
            return DuetAction.CARD;
        }
        if (i == 3) {
            return DuetAction.VERT;
        }
        if (i == 4) {
            return DuetAction.HOR;
        }
        throw new NoWhenBranchMatchedException();
    }
}
