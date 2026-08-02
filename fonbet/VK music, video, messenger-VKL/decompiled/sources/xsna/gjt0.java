package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;

/* compiled from: VideoTabParams.kt */
/* loaded from: classes15.dex */
public final class gjt0 {
    public final String a;
    public final UserId b;
    public final SearchStatsLoggingInfo c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public gjt0() {
        this(null, null, null, null, null, false, null, false, 2047);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle(8);
        bundle.putString("ref", this.a);
        bundle.putParcelable("owner_id", this.b);
        bundle.putParcelable("search_stats_logging_info", this.c);
        bundle.putString("track_code", null);
        bundle.putString("title", this.d);
        bundle.putBoolean("open_for_add", false);
        bundle.putString("embedded_video_id", this.e);
        bundle.putBoolean("is_system", this.f);
        bundle.putBoolean("is_single_section", this.g);
        bundle.putString("key_url", this.h);
        bundle.putBoolean("enable_sound", this.i);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjt0)) {
            return false;
        }
        gjt0 gjt0Var = (gjt0) obj;
        return epx.f(this.a, gjt0Var.a) && epx.f(this.b, gjt0Var.b) && epx.f(this.c, gjt0Var.c) && epx.f(this.d, gjt0Var.d) && epx.f(this.e, gjt0Var.e) && this.f == gjt0Var.f && this.g == gjt0Var.g && epx.f(this.h, gjt0Var.h) && this.i == gjt0Var.i;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.b;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.c;
        int hashCode3 = (hashCode2 + (searchStatsLoggingInfo == null ? 0 : searchStatsLoggingInfo.hashCode())) * 961;
        String str2 = this.d;
        int b = qoy.b((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false);
        String str3 = this.e;
        int b2 = qoy.b(qoy.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31, this.g);
        String str4 = this.h;
        return Boolean.hashCode(this.i) + ((b2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTabParams(refer=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", searchStatsLoggingInfo=");
        sb.append(this.c);
        sb.append(", trackCode=null, title=");
        sb.append(this.d);
        sb.append(", openForAdd=false, embeddedVideoId=");
        sb.append(this.e);
        sb.append(", isSystem=");
        sb.append(this.f);
        sb.append(", isSingleSection=");
        sb.append(this.g);
        sb.append(", url=");
        sb.append(this.h);
        sb.append(", enableSound=");
        return defpackage.q0.a(sb, this.i, ')');
    }

    public gjt0(String str, UserId userId, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2, String str3, boolean z, String str4, boolean z2, int i) {
        str = (i & 1) != 0 ? null : str;
        userId = (i & 2) != 0 ? null : userId;
        searchStatsLoggingInfo = (i & 4) != 0 ? null : searchStatsLoggingInfo;
        str2 = (i & 16) != 0 ? null : str2;
        str3 = (i & 64) != 0 ? null : str3;
        boolean z3 = (i & 128) == 0;
        z = (i & 256) != 0 ? false : z;
        str4 = (i & 512) != 0 ? null : str4;
        z2 = (i & 1024) != 0 ? false : z2;
        this.a = str;
        this.b = userId;
        this.c = searchStatsLoggingInfo;
        this.d = str2;
        this.e = str3;
        this.f = z3;
        this.g = z;
        this.h = str4;
        this.i = z2;
    }
}
