package xsna;

import android.net.Uri;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.tags.Tag;
import xsna.via0;

/* compiled from: TagFactory.kt */
/* loaded from: classes4.dex */
public final class i0o0 {
    public int a;

    /* compiled from: TagFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketItemType.values().length];
            try {
                iArr[MarketItemType.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketItemType.OZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static via0.b a(Tag tag) {
        Long l;
        n0o0 n0o0Var = tag.f;
        UserId userId = null;
        if (n0o0Var.e != null) {
            peq0 peq0Var = new peq0(Uri.parse(n0o0Var.b));
            if (peq0.p(peq0Var, laz.e(), null, null, 14)) {
                long c = peq0Var.c(1);
                gzs<s3q0> gzsVar = fkq0.a;
                userId = new UserId(c);
                l = Long.valueOf(peq0Var.c(2));
                return new via0.b(tag, userId, l);
            }
        }
        l = null;
        return new via0.b(tag, userId, l);
    }
}
