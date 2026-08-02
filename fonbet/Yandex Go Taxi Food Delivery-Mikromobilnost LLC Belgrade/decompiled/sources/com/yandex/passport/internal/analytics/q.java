package com.yandex.passport.internal.analytics;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;

/* loaded from: classes2.dex */
public final class q extends m {
    public static final q b = new q("start");
    public static final q c = new q("permission_declined");
    public static final q d = new q("permission_accepted");
    public static final q e = new q("account_selected");
    public static final q f = new q("relogined");
    public static final q g = new q("browser_result");
    public static final q h = new q(TarifficatorScenarioActivity.RESULT_KEY);
    public static final q i = new q("error");
    public static final q j = new q("cancelled");

    public q(String str) {
        super("social_application_bind.".concat(str));
    }
}
