package defpackage;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.impl.net.dto.PromoBannerDto;
import com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodeResponse;
import com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class mni0 {
    public final xdf a;

    public mni0(xdf xdfVar) {
        this.a = xdfVar;
    }

    public final ReferralCodes a(List list) {
        String c;
        ReferralCode referralCode;
        if (list.isEmpty()) {
            return ReferralCodes.d;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReferralCodeResponse referralCodeResponse = (ReferralCodeResponse) it.next();
            if (referralCodeResponse == null) {
                referralCode = ReferralCode.o;
            } else {
                String a = referralCodeResponse.getA();
                int f = referralCodeResponse.getF();
                String g = referralCodeResponse.getG();
                String h = referralCodeResponse.getH();
                ief i = referralCodeResponse.getI();
                ief i2 = referralCodeResponse.getI();
                PromoBannerDto j = referralCodeResponse.getJ();
                ReferralCode.PromoBanner promoBanner = null;
                if (j != null) {
                    String b = j.getB();
                    String a2 = j.getA();
                    String d = j.getD();
                    if ((b != null && b.length() != 0) || ((a2 != null && a2.length() != 0) || ((d != null && d.length() != 0) || ((c = j.getC()) != null && c.length() != 0)))) {
                        xdf xdfVar = this.a;
                        String str = "";
                        String e = (b == null || b.length() == 0) ? "" : kub1.e(xdfVar, i2, b);
                        String e2 = (a2 == null || a2.length() == 0) ? "" : kub1.e(xdfVar, i2, a2);
                        if (d != null && d.length() != 0) {
                            str = kub1.e(xdfVar, i2, d);
                        }
                        promoBanner = new ReferralCode.PromoBanner(e, e2, j.getC(), str);
                        referralCode = new ReferralCode(a, f, g, h, false, i, promoBanner, referralCodeResponse.getK(), referralCodeResponse.getL(), referralCodeResponse.getC(), referralCodeResponse.getM(), referralCodeResponse.getN());
                    }
                }
                referralCode = new ReferralCode(a, f, g, h, false, i, promoBanner, referralCodeResponse.getK(), referralCodeResponse.getL(), referralCodeResponse.getC(), referralCodeResponse.getM(), referralCodeResponse.getN());
            }
            arrayList.add(referralCode);
        }
        return new ReferralCodes(arrayList);
    }
}
