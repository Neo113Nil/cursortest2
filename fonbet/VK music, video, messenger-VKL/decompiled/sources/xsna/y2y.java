package xsna;

import com.vk.superapp.bridges.SuperappPurchasesBridge$PurchaseResult;

/* compiled from: JsClientDelegate.kt */
/* loaded from: classes6.dex */
public final class y2y {
    public final x6y a;

    /* compiled from: JsClientDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuperappPurchasesBridge$PurchaseResult.values().length];
            try {
                iArr[SuperappPurchasesBridge$PurchaseResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperappPurchasesBridge$PurchaseResult.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperappPurchasesBridge$PurchaseResult.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuperappPurchasesBridge$PurchaseResult.CONNECTION_LOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y2y(x6y x6yVar) {
        this.a = x6yVar;
    }
}
