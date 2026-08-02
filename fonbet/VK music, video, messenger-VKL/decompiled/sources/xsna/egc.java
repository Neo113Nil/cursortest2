package xsna;

import android.text.TextUtils;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import xsna.tlo0;

/* compiled from: ClassifiedsCatalogRootOverflowDialog.kt */
/* loaded from: classes18.dex */
public final class egc {
    public final MarketAnalyticsParams a;
    public final wfc b;
    public dw20 c;

    /* compiled from: ClassifiedsCatalogRootOverflowDialog.kt */
    public static final class a {
        public final String a;
        public final Boolean b;

        public a(String str, Boolean bool) {
            this.a = str;
            this.b = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.b;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Badge(count=");
            sb.append(this.a);
            sb.append(", notificationDot=");
            return tn.a(sb, this.b, ')');
        }
    }

    public egc(MarketAnalyticsParams marketAnalyticsParams, wfc wfcVar) {
        this.a = marketAnalyticsParams;
        this.b = wfcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(VkCell vkCell, int i, int i2, a aVar, gzs gzsVar) {
        Integer num;
        VkCell.Right.a aVar2;
        int i3;
        if (aVar == null) {
            f4m.j(vkCell);
            return;
        }
        String str = aVar.a;
        if (str != null) {
            bpn0 bpn0Var = cqm0.a;
            try {
                i3 = Integer.parseInt(str);
            } catch (Throwable unused) {
                i3 = 0;
            }
            num = Integer.valueOf(i3);
        } else {
            num = null;
        }
        if (epx.f(aVar.b, Boolean.TRUE)) {
            aVar2 = new VkCell.Right.a.C0822a(VkBadge.Appearance.Design.Accent);
        } else if (num == null || num.intValue() <= 0) {
            aVar2 = null;
        } else {
            aVar2 = new VkCell.Right.a.d(num.intValue(), VkCounter.CounterAppearance.Appearance.Neutral, VkCounter.Mode.Tertiary);
        }
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, i2), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(i, VkCell.Left.Main.Size.Medium, (k1u0) (0 == true ? 1 : 0), (tlo0.h) (0 == true ? 1 : 0), 12)));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, aVar2, null, null, null, 30));
        jjc.g(vkCell, new jl1(1, gzsVar));
    }
}
