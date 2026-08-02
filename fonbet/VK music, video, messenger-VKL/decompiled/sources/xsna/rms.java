package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FriendsCleanupState.kt */
/* loaded from: classes15.dex */
public final class rms {
    public final String a;
    public final List<UsersUserFullDto> b;
    public final List<UsersUserFullDto> c;
    public final int d;
    public final List<UserId> e;
    public final boolean f;
    public final boolean g;

    public rms(String str, List<UsersUserFullDto> list, List<UsersUserFullDto> list2, int i, List<UserId> list3, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = list3;
        this.f = z;
        this.g = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rms a(rms rmsVar, ArrayList arrayList, ArrayList arrayList2, int i) {
        String str = rmsVar.a;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = rmsVar.b;
        }
        List list2 = list;
        List<UsersUserFullDto> list3 = rmsVar.c;
        int i2 = rmsVar.d;
        List list4 = arrayList2;
        if ((i & 16) != 0) {
            list4 = rmsVar.e;
        }
        List list5 = list4;
        boolean z = (i & 32) != 0 ? rmsVar.f : false;
        boolean z2 = rmsVar.g;
        rmsVar.getClass();
        return new rms(str, list2, list3, i2, list5, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rms)) {
            return false;
        }
        rms rmsVar = (rms) obj;
        return epx.f(this.a, rmsVar.a) && epx.f(this.b, rmsVar.b) && epx.f(this.c, rmsVar.c) && this.d == rmsVar.d && epx.f(this.e, rmsVar.e) && this.f == rmsVar.f && this.g == rmsVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(fw3.a(shy.a(this.d, fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsCleanupContent(description=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", mutuals=");
        sb.append(this.c);
        sb.append(", totalCount=");
        sb.append(this.d);
        sb.append(", deletedUserIds=");
        sb.append(this.e);
        sb.append(", hasMore=");
        sb.append(this.f);
        sb.append(", isCurrentProfileClosed=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
