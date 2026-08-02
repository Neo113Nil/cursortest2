package xsna;

import android.app.Activity;
import android.os.Parcel;
import android.view.View;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.HashMap;
import xsna.ksd0;

/* compiled from: CommunityPriorityBlockItemCtaButtonDelegate.kt */
/* loaded from: classes5.dex */
public final class odh {
    public final ksd0 a;
    public final CommonMarketStat$TypeRefSource b;

    public odh(ksd0 ksd0Var, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        this.a = ksd0Var;
        this.b = commonMarketStat$TypeRefSource;
    }

    public final void a(CallProducerButton callProducerButton, View view, int i, Good good, izs<? super ProductTileCtaButtonType, s3q0> izsVar) {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null) {
            return;
        }
        ProductTileCtaButtonType.a aVar = ProductTileCtaButtonType.Companion;
        int i2 = callProducerButton.b;
        aVar.getClass();
        ProductTileCtaButtonType a = ProductTileCtaButtonType.a.a(i2);
        Parcel obtain = Parcel.obtain();
        try {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            Serializer.g gVar = new Serializer.g(obtain);
            gVar.i0(good);
            obtain.setDataPosition(0);
            Serializer.StreamParcelable G = gVar.G(Good.class.getClassLoader());
            obtain.recycle();
            Good good2 = (Good) G;
            good2.M = new Owner(good2.c, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194302, null);
            s3q0 s3q0Var = s3q0.a;
            ksd0.b a2 = msd0.a(good2);
            String str = callProducerButton.k;
            String str2 = callProducerButton.d;
            UserId userId = callProducerButton.i;
            InaccessibilityMessage inaccessibilityMessage = callProducerButton.j;
            String str3 = inaccessibilityMessage != null ? inaccessibilityMessage.b : null;
            String str4 = inaccessibilityMessage != null ? inaccessibilityMessage.c : null;
            Boolean bool = callProducerButton.f;
            this.a.a(b, new ksd0.c(view, a, a2, str, new ksd0.c.b(userId, str2, str3, str4, callProducerButton.l, bool != null ? bool.booleanValue() : true), Integer.valueOf(i), new ksd0.c.a(this.b, null, null), new ndh(izsVar, 0), good.V));
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
