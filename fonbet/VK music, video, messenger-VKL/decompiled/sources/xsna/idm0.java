package xsna;

import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import xsna.hdm0;

/* compiled from: StoryServicePreviewContract.kt */
/* loaded from: classes16.dex */
public final class idm0 {
    public final int a;
    public final StoryServiceItemInfo b;
    public final boolean c;
    public final boolean d;
    public final hdm0 e;

    /* JADX WARN: Multi-variable type inference failed */
    public idm0() {
        this(null, false, 0 == true ? 1 : 0, 31);
    }

    public static idm0 a(idm0 idm0Var, int i, StoryServiceItemInfo storyServiceItemInfo, hdm0 hdm0Var, int i2) {
        if ((i2 & 1) != 0) {
            i = idm0Var.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            storyServiceItemInfo = idm0Var.b;
        }
        StoryServiceItemInfo storyServiceItemInfo2 = storyServiceItemInfo;
        boolean z = idm0Var.c;
        boolean z2 = (i2 & 8) != 0 ? idm0Var.d : false;
        if ((i2 & 16) != 0) {
            hdm0Var = idm0Var.e;
        }
        idm0Var.getClass();
        return new idm0(i3, storyServiceItemInfo2, z, z2, hdm0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idm0)) {
            return false;
        }
        idm0 idm0Var = (idm0) obj;
        return this.a == idm0Var.a && epx.f(this.b, idm0Var.b) && this.c == idm0Var.c && this.d == idm0Var.d && epx.f(this.e, idm0Var.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        StoryServiceItemInfo storyServiceItemInfo = this.b;
        return this.e.hashCode() + qoy.b(qoy.b((hashCode + (storyServiceItemInfo == null ? 0 : storyServiceItemInfo.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "StoryServicePreviewViewState(currentStyleIndex=" + this.a + ", serviceInfo=" + this.b + ", isEditMode=" + this.c + ", onboardingIsVisible=" + this.d + ", style=" + this.e + ')';
    }

    public idm0(int i, StoryServiceItemInfo storyServiceItemInfo, boolean z, boolean z2, hdm0 hdm0Var) {
        this.a = i;
        this.b = storyServiceItemInfo;
        this.c = z;
        this.d = z2;
        this.e = hdm0Var;
    }

    public /* synthetic */ idm0(StoryServiceItemInfo storyServiceItemInfo, boolean z, hdm0 hdm0Var, int i) {
        this(0, (i & 2) != 0 ? null : storyServiceItemInfo, false, (i & 8) != 0 ? true : z, (i & 16) != 0 ? hdm0.b.c : hdm0Var);
    }
}
