package xsna;

import android.content.Context;
import com.vk.clips.upload.ui.api.entities.ErrorType;
import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fjh implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fjh(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                gjh gjhVar = (gjh) this.c;
                f5u f5uVar = (f5u) this.d;
                s4u s4uVar = (s4u) this.e;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gjhVar.c.invoke(new d.t.a.e(f5uVar, booleanValue));
                lt00 lt00Var = gjhVar.b;
                Good good = f5uVar.b;
                MarketFavable s = ao8.s(good);
                s.f = booleanValue;
                lt00Var.d(s, CommonMarketStat$TypeRefSource.COMMUNITY_TAB_MARKET, Integer.valueOf(s4uVar.b), good.d0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                bvp.a((gzs) this.c, (ErrorType) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                tux.a((ovx) this.c, (izs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                vma0.d((String) this.c, (String) this.d, (String) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((bel0) this.c).z((Context) this.d, (BannerAdUiData) obj2, (WebAdConfig) this.e);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fjh(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
