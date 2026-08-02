package defpackage;

import com.yandex.fintechsdk.adapters.yb.sdk.api.upgradesplit.UpgradeSplitResult$Status;

/* loaded from: classes10.dex */
public final class ib21 {
    public static final ib21 c = new ib21(UpgradeSplitResult$Status.SUCCESS, null);
    public static final ib21 d = new ib21(UpgradeSplitResult$Status.CANCELED, null);
    public static final ib21 e = new ib21(UpgradeSplitResult$Status.INVALID_DEEPLINK, null);
    public final UpgradeSplitResult$Status a;
    public final String b;

    public ib21(UpgradeSplitResult$Status upgradeSplitResult$Status, String str) {
        this.a = upgradeSplitResult$Status;
        this.b = str;
    }
}
