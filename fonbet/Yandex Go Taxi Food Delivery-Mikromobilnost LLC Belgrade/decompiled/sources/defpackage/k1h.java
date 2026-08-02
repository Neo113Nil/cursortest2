package defpackage;

import com.ybsdk.api.DepositType;
import com.ybsdk.core.common.domain.entities.Action;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class k1h {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DepositType.values().length];
        try {
            iArr[DepositType.OrderAmount.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DepositType.ExactAmount.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DeeplinkAction.Redirect.Auth.values().length];
        try {
            iArr2[DeeplinkAction.Redirect.Auth.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DeeplinkAction.Redirect.Auth.YANDEX.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[Action.values().length];
        try {
            iArr3[Action.OPEN_PRODUCT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[Action.REGISTRATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
