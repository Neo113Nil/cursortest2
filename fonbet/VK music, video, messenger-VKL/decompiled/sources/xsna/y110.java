package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import ru.ok.android.utils.Logger;

/* compiled from: MarketItemLinkCreator.kt */
/* loaded from: classes18.dex */
public final class y110 {
    public y110(hy2 hy2Var) {
    }

    public final String a(Good good) {
        String str = good.k0;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        UserId userId = good.c;
        long j = good.b;
        Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
        qcy<Object>[] qcyVarArr = MarketComponentImpl.l;
        return a.authority(a0a.d).appendPath("market" + userId).appendQueryParameter(Logger.METHOD_W, "product" + userId + '_' + j).build().toString();
    }
}
