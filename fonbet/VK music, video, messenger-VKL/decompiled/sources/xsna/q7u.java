package xsna;

import android.os.Bundle;
import android.text.SpannedString;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.MarketRejectInfoButtons;
import com.vk.dto.common.MarketRejectInfoButtonsType;
import java.util.Iterator;
import java.util.List;
import xsna.hmd0;

/* compiled from: GoodRejectInfoHolder.kt */
/* loaded from: classes18.dex */
public final class q7u extends vif0<MarketRejectInfo> {
    public final srf0 n;
    public final sdz o;
    public final ComposeView p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q7u(ViewGroup viewGroup, srf0 srf0Var, sdz sdzVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setTag("product_card_soft_block_banner_compose_view");
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.n = srf0Var;
        this.o = sdzVar;
        this.p = (ComposeView) this.itemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Type inference failed for: r3v3, types: [xsna.hmd0] */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(MarketRejectInfo marketRejectInfo) {
        hmd0.a.C3009a c3009a;
        Object obj;
        Object obj2;
        String str;
        MarketRejectInfo marketRejectInfo2 = marketRejectInfo;
        hmd0.a.b bVar = null;
        if (marketRejectInfo2 != null) {
            String str2 = marketRejectInfo2.b;
            String str3 = marketRejectInfo2.c;
            List<MarketRejectInfoButtons> list = marketRejectInfo2.h;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((MarketRejectInfoButtons) obj2).b == MarketRejectInfoButtonsType.MARKET_EDIT) {
                            break;
                        }
                    }
                }
                MarketRejectInfoButtons marketRejectInfoButtons = (MarketRejectInfoButtons) obj2;
                if (marketRejectInfoButtons != null && (str = marketRejectInfoButtons.c) != null) {
                    c3009a = new hmd0.a.C3009a(str);
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it2.next();
                                if (((MarketRejectInfoButtons) obj).b == MarketRejectInfoButtonsType.MARKET_DELETE) {
                                    break;
                                }
                            }
                        }
                        if (((MarketRejectInfoButtons) obj) != null) {
                            bVar = hmd0.a.b.a;
                        }
                    }
                    bVar = new hmd0(str2, str3, c3009a, bVar, SpannedString.valueOf(this.o.d(marketRejectInfo2.d, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))));
                }
            }
            c3009a = null;
            if (list != null) {
            }
            bVar = new hmd0(str2, str3, c3009a, bVar, SpannedString.valueOf(this.o.d(marketRejectInfo2.d, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))));
        }
        this.p.setContent(new jai(154205224, new x2(3, bVar, this), true));
    }
}
