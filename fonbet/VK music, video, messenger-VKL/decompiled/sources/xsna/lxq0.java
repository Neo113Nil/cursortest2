package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fb80;

/* compiled from: UserProfileWallView.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class lxq0 implements fb80.a, g0t {
    public final /* synthetic */ otq0 b;

    public lxq0(otq0 otq0Var) {
        this.b = otq0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fb80.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.b, otq0.class, "getItemViewedScreen", "getItemViewedScreen()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.fb80.a
    public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
        return this.b.x0();
    }
}
