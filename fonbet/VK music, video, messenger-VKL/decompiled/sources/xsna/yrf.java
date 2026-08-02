package xsna;

import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import java.util.UUID;

/* compiled from: ClipsWrapperItemMviState.kt */
/* loaded from: classes17.dex */
public final class yrf implements km50 {
    public final mme b;
    public final String c;
    public final int d;
    public final ClipFeedTransientArgumentsContainer e;

    public yrf() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrf)) {
            return false;
        }
        yrf yrfVar = (yrf) obj;
        return epx.f(this.b, yrfVar.b) && epx.f(this.c, yrfVar.c) && this.d == yrfVar.d && epx.f(this.e, yrfVar.e);
    }

    public final int hashCode() {
        mme mmeVar = this.b;
        int a = shy.a(this.d, urd0.a((mmeVar == null ? 0 : mmeVar.hashCode()) * 31, 31, this.c), 31);
        ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer = this.e;
        return a + (clipFeedTransientArgumentsContainer != null ? clipFeedTransientArgumentsContainer.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsWrapperItemMviState(item=" + this.b + ", wrapperId=" + this.c + ", currentItemIndex=" + this.d + ", transientArguments=" + this.e + ')';
    }

    public yrf(mme mmeVar, String str, int i, ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer) {
        this.b = mmeVar;
        this.c = str;
        this.d = i;
        this.e = clipFeedTransientArgumentsContainer;
    }

    public /* synthetic */ yrf(String str, int i) {
        this(null, (i & 2) != 0 ? UUID.randomUUID().toString() : str, 0, null);
    }
}
