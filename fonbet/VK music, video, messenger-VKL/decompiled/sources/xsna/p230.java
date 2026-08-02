package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.author.compose.onboarding.OnboardingViewState;
import java.util.ArrayList;

/* compiled from: ModalViewState.kt */
/* loaded from: classes7.dex */
public final class p230 implements lm50 {
    public final ArrayList b;
    public final boolean c;
    public final OnboardingViewState d;

    public p230(ArrayList arrayList, boolean z, OnboardingViewState onboardingViewState) {
        this.b = arrayList;
        this.c = z;
        this.d = onboardingViewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p230)) {
            return false;
        }
        p230 p230Var = (p230) obj;
        return this.b.equals(p230Var.b) && this.c == p230Var.c && this.d.equals(p230Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalViewState(items=");
        kr.d(this.b, sb, ", isCreateChannelButtonVisible=");
        sb.append(this.c);
        sb.append(", onboarding=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
