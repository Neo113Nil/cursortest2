package com.ybsdk.rconfig.configs;

import android.net.Uri;
import com.squareup.moshi.Types;
import com.ybsdk.core.common.domain.entities.BottomBarIcon;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import defpackage.dfr;
import defpackage.gtu0;
import defpackage.scc;
import defpackage.tje;
import defpackage.uw51;
import defpackage.uza;
import java.lang.reflect.ParameterizedType;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class f {
    public final Text.Resource a;
    public final Text.Resource b;
    public final Text.Resource c;
    public final dfr d;

    public f(Text.Resource resource, Text.Resource resource2, Text.Resource resource3) {
        this.a = resource;
        this.b = resource2;
        this.c = resource3;
        byte[] bArr = tje.E2;
        byte[] bArr2 = new byte[25];
        for (int i = 0; i < 25; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, YbMobileTabBarConfig.class);
        YbMobileTabBarConfig.TabBarItem tabBarItem = new YbMobileTabBarConfig.TabBarItem(BottomBarItemId.HOME.getId(), resource, BottomBarIcon.HOME.getId(), "ybapp://screen.open/open_main_screen");
        YbMobileTabBarConfig.TabBarItem tabBarItem2 = new YbMobileTabBarConfig.TabBarItem(BottomBarItemId.MERCHANTS.getId(), resource2, BottomBarIcon.MERCHANTS.getId(), "ybapp://screen.open/merchant_offers");
        String id = BottomBarItemId.PAY.getId();
        String id2 = BottomBarIcon.PAY.getId();
        Regex regex = gtu0.a;
        this.d = new dfr(str, newParameterizedType, new CommonExperiment(new YbMobileTabBarConfig(scc.g(tabBarItem, tabBarItem2, new YbMobileTabBarConfig.TabBarItem(id, resource3, id2, "ybapp://screen.open/transfers_dashboard?tokenization_product_id=wallet&fallback=".concat(Uri.encode("ybapp://screen.open/qr_scan")))), null, 2, null), ExperimentApplyType.LATEST));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b.equals(fVar.b) && this.c.equals(fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "YbMobileTabBarConfigDefault(homeDefaultTitle=" + this.a + ", merchantsDefaultTitle=" + this.b + ", payDefaultTitle=" + this.c + Extension.C_BRAKE;
    }
}
