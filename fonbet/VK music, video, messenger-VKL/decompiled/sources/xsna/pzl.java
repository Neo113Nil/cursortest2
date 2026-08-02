package xsna;

import com.vk.log.L;
import com.vk.statistic.DeprecatedStatisticBase;
import com.vk.statistic.DeprecatedStatisticPrettyCard;
import com.vkontakte.android.data.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class pzl implements v0m {
    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    @Override // xsna.v0m
    public boolean a(DeprecatedStatisticBase deprecatedStatisticBase, int i) {
        if (!(deprecatedStatisticBase instanceof DeprecatedStatisticPrettyCard)) {
            return false;
        }
        DeprecatedStatisticPrettyCard deprecatedStatisticPrettyCard = (DeprecatedStatisticPrettyCard) deprecatedStatisticBase;
        b.d dVar = new b.d("ads/impression_pretty_card");
        dVar.j();
        dVar.b(deprecatedStatisticPrettyCard.f, "ad_data");
        dVar.b(deprecatedStatisticPrettyCard.g, "card_data");
        if (i != -1) {
            dVar.c(Integer.valueOf(i));
        }
        dVar.h();
        L.e("Statistics sent", deprecatedStatisticPrettyCard);
        return true;
    }
}
