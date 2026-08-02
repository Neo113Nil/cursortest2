package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fb80;

/* compiled from: CommunityProfileWallView.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class wvh implements fb80.a, g0t {
    public final /* synthetic */ kvh b;

    public wvh(kvh kvhVar) {
        this.b = kvhVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fb80.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.b, kvh.class, "getItemViewedScreen", "getItemViewedScreen()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.fb80.a
    public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
        return this.b.x0();
    }
}
