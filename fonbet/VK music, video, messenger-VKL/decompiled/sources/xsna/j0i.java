package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;

/* compiled from: CommunityScheduledClipsBottomSheetParams.kt */
/* loaded from: classes5.dex */
public final class j0i {
    public final ClipVideoFile a;
    public final String b;
    public final boolean c = true;
    public final UserId d;
    public final ez20 e;
    public final boolean f;

    public j0i(ClipVideoFile clipVideoFile, String str, UserId userId, ez20 ez20Var, boolean z) {
        this.a = clipVideoFile;
        this.b = str;
        this.d = userId;
        this.e = ez20Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0i)) {
            return false;
        }
        j0i j0iVar = (j0i) obj;
        return epx.f(this.a, j0iVar.a) && epx.f(this.b, j0iVar.b) && this.c == j0iVar.c && epx.f(this.d, j0iVar.d) && epx.f(this.e, j0iVar.e) && this.f == j0iVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int a = bh10.a(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d.b);
        ez20 ez20Var = this.e;
        return Boolean.hashCode(this.f) + ((a + (ez20Var != null ? ez20Var.hashCode() : 0)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityScheduledClipsBottomSheetParams(video=");
        sb.append(this.a);
        sb.append(", ref=");
        sb.append(this.b);
        sb.append(", shouldNotifyVideoUpdates=");
        sb.append(this.c);
        sb.append(", targetId=");
        sb.append(this.d);
        sb.append(", stateCallback=");
        sb.append(this.e);
        sb.append(", source=null, forceDarkTheme=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
