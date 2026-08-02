package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.qrcode.QRStatsTracker;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vk.toggle.features.SmbAdFeatures;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class q21 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q21(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ArrayList<DeprecatedStatisticUrl> arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                Integer num = (Integer) obj;
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
                smbAdFeatures.getClass();
                if (com.vk.toggle.b.A.a(smbAdFeatures)) {
                    s21.p().a(list);
                } else {
                    Pattern compile = Pattern.compile("\\w+.mail.ru");
                    for (DeprecatedStatisticUrl deprecatedStatisticUrl : arrayList) {
                        if (num != null) {
                            com.vkontakte.android.data.b.p(s21.B(deprecatedStatisticUrl, compile, num.intValue()));
                        } else {
                            com.vkontakte.android.data.b.p(deprecatedStatisticUrl);
                        }
                    }
                }
                break;
            case 1:
                ((qaz) obj3).f((Context) obj2, (View) obj);
                break;
            case 2:
                ((izs) obj3).invoke(new a.d((qg80) obj2, ((mc90) obj).r()));
                break;
            case 3:
                gbz.a((Activity) obj3, ((ime0) obj2).c.getTelURI());
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.CALL);
                com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                com.vk.qrcode.d.a((cme0) obj);
                break;
            case 4:
                ((izs) obj3).invoke(new ArrayList(new wow((List) obj2)));
                ((gzs) obj).invoke();
                break;
            default:
                d2p0 d2p0Var = (d2p0) obj3;
                SharedPreferences.Editor edit = ((SharedPreferences) d2p0Var.c.getValue()).edit();
                UserId userId = d2p0Var.b;
                edit.putString("VK_PAY_CHECKOUT_VKPAY_TOKEN/" + userId.b, (String) obj2).putString("VK_PAY_CHECKOUT_VKPAY_TOKEN_IV/" + userId.b, (String) obj).apply();
                break;
        }
        return s3q0.a;
    }
}
