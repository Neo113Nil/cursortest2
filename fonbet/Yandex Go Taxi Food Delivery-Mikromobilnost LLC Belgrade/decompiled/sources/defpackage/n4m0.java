package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.SavingsAccountBalanceAnimation;
import com.ybsdk.rconfig.configs.SavingsAccountGoal;
import com.ybsdk.rconfig.configs.SavingsAccountImages;
import com.ybsdk.rconfig.configs.SavingsAccountLengthMax;
import java.lang.reflect.ParameterizedType;

/* loaded from: classes9.dex */
public abstract class n4m0 {
    public static final dfr a;
    public static final dfr b;
    public static final dfr c;
    public static final dfr d;

    static {
        String q = tje.q(tje.i0);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, SavingsAccountLengthMax.class);
        SavingsAccountLengthMax savingsAccountLengthMax = new SavingsAccountLengthMax(500);
        ExperimentApplyType experimentApplyType = ExperimentApplyType.LATEST;
        a = new dfr(q, newParameterizedType, new CommonExperiment(savingsAccountLengthMax, experimentApplyType));
        b = new dfr(tje.q(tje.p2), Types.newParameterizedType(CommonExperiment.class, SavingsAccountGoal.class), new CommonExperiment(new SavingsAccountGoal(10000000, 10), experimentApplyType));
        c = new dfr(tje.q(tje.Q1), Types.newParameterizedType(CommonExperiment.class, SavingsAccountBalanceAnimation.class), new CommonExperiment(new SavingsAccountBalanceAnimation(false, 1000), experimentApplyType));
        d = new dfr(tje.q(tje.C2), Types.newParameterizedType(CommonExperiment.class, SavingsAccountImages.class), new CommonExperiment(new SavingsAccountImages(new ThemedParameter("https://avatars.mds.yandex.net/get-fintech/6146621/savings_account_closing_light.png/optimize", "https://avatars.mds.yandex.net/get-fintech/6146621/savings_account_closing_dark.png/optimize"), new ThemedParameter("https://avatars.mds.yandex.net/get-fintech/6146621/savings_account_spendings_lock_light.png/optimize", "https://avatars.mds.yandex.net/get-fintech/6146621/savings_account_spendings_lock_dark.png/optimize"), new ThemedParameter("https://avatars.mds.yandex.net/get-fintech/6146621/savings_account_spending_unlock_transparent.png/optimize", "https://avatars.mds.yandex.net/get-fintech/6146621/savings_account_spending_unlock_transparent.png/optimize"), new ThemedParameter("https://avatars.mds.yandex.net/get-fintech/6059143/savings_account_opening_took_too_long.png/optimize", "https://avatars.mds.yandex.net/get-fintech/6059143/savings_account_opening_took_too_long.png/optimize")), experimentApplyType));
    }
}
