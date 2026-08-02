package defpackage;

import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositAutoTopup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g24 implements qas0 {
    public final BaseDeeplinkAction a;

    public g24(SplitDepositAutoTopup splitDepositAutoTopup) {
        this.a = splitDepositAutoTopup;
    }

    public final BaseDeeplinkAction a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g24) && jl40.l(this.a, ((g24) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetFragmentResultListener(actionToResolveOnSet=" + this.a + Extension.C_BRAKE;
    }
}
