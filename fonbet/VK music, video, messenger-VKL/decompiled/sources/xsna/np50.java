package xsna;

import com.vk.clips.sdk.facade.api.MyTargetFacadeClickTarget;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MyTargetClickTargetMapper.kt */
/* loaded from: classes17.dex */
public final class np50 {

    /* compiled from: MyTargetClickTargetMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MyTargetFacadeClickTarget.values().length];
            try {
                iArr[MyTargetFacadeClickTarget.AGE_RESTRICTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyTargetFacadeClickTarget.ADVERTISING_LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MyTargetFacadeClickTarget.CTA_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MyTargetFacadeClickTarget.DESCRIPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MyTargetFacadeClickTarget.ICON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MyTargetFacadeClickTarget.IMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MyTargetFacadeClickTarget.TITLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MyTargetFacadeClickTarget.VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MyTargetFacadeClickTarget.BACKGROUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static int a(MyTargetFacadeClickTarget myTargetFacadeClickTarget) {
        switch (a.$EnumSwitchMapping$0[myTargetFacadeClickTarget.ordinal()]) {
            case 1:
                return 7;
            case 2:
                return 8;
            case 3:
                return 6;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 0;
            case 8:
                return 13;
            case 9:
                return 11;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
