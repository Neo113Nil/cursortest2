package defpackage;

import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.ui.onboarding.OnboardingShowingType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class k170 extends s120 {
    public final g720 a;
    public final MessagingAction b;
    public final OnboardingShowingType c;
    public final String d = "Messaging.Arguments.Key.Onboarding";

    public k170(g720 g720Var, MessagingAction messagingAction, OnboardingShowingType onboardingShowingType) {
        this.a = g720Var;
        this.b = messagingAction;
        this.c = onboardingShowingType;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.d;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k170)) {
            return false;
        }
        k170 k170Var = (k170) obj;
        return jl40.l(this.a, k170Var.a) && jl40.l(this.b, k170Var.b) && this.c == k170Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OnboardingArguments(source=" + this.a + ", pendingAction=" + this.b + ", requiredOnboardingType=" + this.c + Extension.C_BRAKE;
    }
}
