package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vkontakte.android.R;

/* compiled from: DefaultCommonApiErrorFactory.kt */
/* loaded from: classes.dex */
public final class tcl {
    public final Context a;

    /* compiled from: DefaultCommonApiErrorFactory.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiErrorViewType.values().length];
            try {
                iArr[ApiErrorViewType.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiErrorViewType.ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiErrorViewType.FULLSCREEN.ordinal()] = 3;
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

    public tcl(Context context) {
        this.a = context;
    }

    public final jr1 a(wz2 wz2Var) {
        Context context = this.a;
        return new jr1(context.getString(R.string.vk_auth_error), context.getString(R.string.vk_auth_unknown_error), wz2Var);
    }
}
