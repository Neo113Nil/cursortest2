package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.stat.sak.scheme.SchemeStatSak$ErrorView;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommonApiErrorEventSender.kt */
/* loaded from: classes15.dex */
public final class xgg {

    /* compiled from: CommonApiErrorEventSender.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiErrorViewType.values().length];
            try {
                iArr[ApiErrorViewType.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiErrorViewType.FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiErrorViewType.ALERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiErrorViewType.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiErrorViewType.SKIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static SchemeStatSak$ErrorView a(ApiErrorViewType apiErrorViewType) {
        int i = a.$EnumSwitchMapping$0[apiErrorViewType.ordinal()];
        if (i == 1) {
            return SchemeStatSak$ErrorView.INPUT;
        }
        if (i == 2) {
            return SchemeStatSak$ErrorView.FULLSCREEN;
        }
        if (i == 3) {
            return SchemeStatSak$ErrorView.ALERT;
        }
        if (i == 4 || i == 5) {
            return SchemeStatSak$ErrorView.ALERT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
