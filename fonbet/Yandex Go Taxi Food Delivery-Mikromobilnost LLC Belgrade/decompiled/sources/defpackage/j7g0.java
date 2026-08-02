package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class j7g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PayboxScenario.values().length];
        try {
            iArr[PayboxScenario.PAY_TV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PayboxScenario.PAY_OFFLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PayboxScenario.PAY_BOX_OFFLINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PayboxScenario.PAY_ONLINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
