package xsna;

import com.vk.profile.community.creationonboarding.api.models.OnBoardingTask;
import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;
import java.util.List;

/* compiled from: CreationOnboardingTasksState.kt */
/* loaded from: classes5.dex */
public final class zck implements lm50 {
    public final List<OnBoardingTask> b;
    public final String c;
    public final String d;
    public final String e;
    public final SnackBar f;

    public zck(List<OnBoardingTask> list, String str, String str2, String str3, SnackBar snackBar) {
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = snackBar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zck)) {
            return false;
        }
        zck zckVar = (zck) obj;
        return epx.f(this.b, zckVar.b) && epx.f(this.c, zckVar.c) && epx.f(this.d, zckVar.d) && epx.f(this.e, zckVar.e) && this.f == zckVar.f;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        SnackBar snackBar = this.f;
        return a + (snackBar == null ? 0 : snackBar.hashCode());
    }

    public final String toString() {
        return "CreationOnboardingTasksViewState(items=" + this.b + ", imageUrl=" + this.c + ", title=" + this.d + ", description=" + this.e + ", snackBar=" + this.f + ')';
    }
}
