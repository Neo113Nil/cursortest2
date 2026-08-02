package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsAuthorsSelectorViewState.kt */
/* loaded from: classes14.dex */
public final class qid {
    public final List<ghd> a;
    public final MobileOfficialAppsCoreNavStat$EventScreen b;
    public final boolean c;

    public qid() {
        this(0);
    }

    public static qid a(qid qidVar, List list, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z, int i) {
        if ((i & 1) != 0) {
            list = qidVar.a;
        }
        if ((i & 2) != 0) {
            mobileOfficialAppsCoreNavStat$EventScreen = qidVar.b;
        }
        if ((i & 4) != 0) {
            z = qidVar.c;
        }
        qidVar.getClass();
        return new qid(mobileOfficialAppsCoreNavStat$EventScreen, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qid)) {
            return false;
        }
        qid qidVar = (qid) obj;
        return epx.f(this.a, qidVar.a) && this.b == qidVar.b && this.c == qidVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsAuthorsSelectorViewState(authorsList=");
        sb.append(this.a);
        sb.append(", screen=");
        sb.append(this.b);
        sb.append(", shouldShowCreateChannelButton=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public qid(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, List list, boolean z) {
        this.a = list;
        this.b = mobileOfficialAppsCoreNavStat$EventScreen;
        this.c = z;
    }

    public qid(int i) {
        this(null, EmptyList.b, false);
    }
}
