package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import java.util.List;
import java.util.Map;

/* compiled from: BroadcastSettingsContract.kt */
/* loaded from: classes3.dex */
public final class fj8 implements km50 {
    public final UserId b;
    public final Integer c;
    public final BroadcastAuthor d;
    public final BroadcastStream e;
    public final List<BroadcastAuthor> f;
    public final Map<BroadcastAuthor, List<BroadcastStream>> g;
    public final Throwable h;
    public final boolean i;
    public final boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public fj8(UserId userId, Integer num, BroadcastAuthor broadcastAuthor, BroadcastStream broadcastStream, List<? extends BroadcastAuthor> list, Map<BroadcastAuthor, ? extends List<? extends BroadcastStream>> map, Throwable th, boolean z, boolean z2) {
        this.b = userId;
        this.c = num;
        this.d = broadcastAuthor;
        this.e = broadcastStream;
        this.f = list;
        this.g = map;
        this.h = th;
        this.i = z;
        this.j = z2;
    }

    public static fj8 a(fj8 fj8Var, BroadcastAuthor broadcastAuthor, BroadcastStream broadcastStream, List list, Map map, Throwable th, boolean z, boolean z2, int i) {
        UserId userId = fj8Var.b;
        Integer num = fj8Var.c;
        if ((i & 4) != 0) {
            broadcastAuthor = fj8Var.d;
        }
        BroadcastAuthor broadcastAuthor2 = broadcastAuthor;
        if ((i & 8) != 0) {
            broadcastStream = fj8Var.e;
        }
        BroadcastStream broadcastStream2 = broadcastStream;
        if ((i & 16) != 0) {
            list = fj8Var.f;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            map = fj8Var.g;
        }
        Map map2 = map;
        boolean z3 = (i & 128) != 0 ? fj8Var.i : z;
        fj8Var.getClass();
        return new fj8(userId, num, broadcastAuthor2, broadcastStream2, list2, map2, th, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj8)) {
            return false;
        }
        fj8 fj8Var = (fj8) obj;
        return this.b.equals(fj8Var.b) && epx.f(this.c, fj8Var.c) && epx.f(this.d, fj8Var.d) && epx.f(this.e, fj8Var.e) && epx.f(this.f, fj8Var.f) && epx.f(this.g, fj8Var.g) && epx.f(this.h, fj8Var.h) && this.i == fj8Var.i && this.j == fj8Var.j;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        BroadcastAuthor broadcastAuthor = this.d;
        int hashCode3 = (hashCode2 + (broadcastAuthor == null ? 0 : broadcastAuthor.hashCode())) * 31;
        BroadcastStream broadcastStream = this.e;
        int hashCode4 = (hashCode3 + (broadcastStream == null ? 0 : broadcastStream.hashCode())) * 31;
        List<BroadcastAuthor> list = this.f;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<BroadcastAuthor, List<BroadcastStream>> map = this.g;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Throwable th = this.h;
        return Boolean.hashCode(this.j) + qoy.b((hashCode6 + (th != null ? th.hashCode() : 0)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BroadcastSettingsState(preselectedAuthorId=");
        sb.append(this.b);
        sb.append(", preselectedStreamId=");
        sb.append(this.c);
        sb.append(", selectedAuthor=");
        sb.append(this.d);
        sb.append(", selectedStream=");
        sb.append(this.e);
        sb.append(", authors=");
        sb.append(this.f);
        sb.append(", streams=");
        sb.append(this.g);
        sb.append(", error=");
        sb.append(this.h);
        sb.append(", isRefreshing=");
        sb.append(this.i);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
