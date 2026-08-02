package defpackage;

import com.ybsdk.feature.dashboard.api.model.ProductId;

/* loaded from: classes3.dex */
public abstract class hng {
    public static final klg a(plg plgVar) {
        ProductId productId = plgVar.a;
        switch (productId == null ? -1 : gng.a[productId.ordinal()]) {
            case -1:
            case 1:
            case 2:
                return ilg.a;
            case 0:
            default:
                w511.b();
                return null;
            case 3:
            case 4:
                return jlg.a;
            case 5:
                return hlg.a;
            case 6:
                return glg.a;
        }
    }
}
