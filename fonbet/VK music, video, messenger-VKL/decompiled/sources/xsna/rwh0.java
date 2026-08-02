package xsna;

import com.vk.im.engine.models.SearchMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SearchPageData.kt */
/* loaded from: classes2.dex */
public final class rwh0 {
    public final String a;
    public final FunctionReferenceImpl b;
    public final SearchMode c;
    public final MobileOfficialAppsCoreNavStat$EventScreen d;
    public final long e;
    public final rx30 f;
    public String g;
    public final int h;

    public rwh0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rwh0(String str, gzs gzsVar, SearchMode searchMode, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, long j, rx30 rx30Var, int i, int i2) {
        i = (i2 & 128) != 0 ? -1 : i;
        this.a = str;
        this.b = (FunctionReferenceImpl) gzsVar;
        this.c = searchMode;
        this.d = mobileOfficialAppsCoreNavStat$EventScreen;
        this.e = j;
        this.f = rx30Var;
        this.g = "";
        this.h = i;
    }

    public final boolean a() {
        return !this.f.d.isEmpty();
    }
}
