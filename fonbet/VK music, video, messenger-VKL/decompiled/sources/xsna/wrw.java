package xsna;

import com.vk.update.core.AvailabilityState;
import com.vk.update.core.DownloadState;

/* compiled from: InAppUpdateInfo.kt */
/* loaded from: classes6.dex */
public final class wrw {
    public static final wrw g = new wrw("", -1, AvailabilityState.UPDATE_NOT_AVAILABLE, DownloadState.NOT_LOADED, v8o.c, null);
    public final String a;
    public final long b;
    public final AvailabilityState c;
    public final DownloadState d;
    public final v8o e;
    public final Object f;

    public wrw(String str, long j, AvailabilityState availabilityState, DownloadState downloadState, v8o v8oVar, Object obj) {
        this.a = str;
        this.b = j;
        this.c = availabilityState;
        this.d = downloadState;
        this.e = v8oVar;
        this.f = obj;
    }

    public static wrw a(wrw wrwVar, long j, DownloadState downloadState, v8o v8oVar, int i) {
        String str = wrwVar.a;
        if ((i & 2) != 0) {
            j = wrwVar.b;
        }
        long j2 = j;
        AvailabilityState availabilityState = wrwVar.c;
        if ((i & 16) != 0) {
            v8oVar = wrwVar.e;
        }
        Object obj = wrwVar.f;
        wrwVar.getClass();
        return new wrw(str, j2, availabilityState, downloadState, v8oVar, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrw)) {
            return false;
        }
        wrw wrwVar = (wrw) obj;
        return epx.f(this.a, wrwVar.a) && this.b == wrwVar.b && this.c == wrwVar.c && this.d == wrwVar.d && epx.f(this.e, wrwVar.e) && epx.f(this.f, wrwVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31;
        Object obj = this.f;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppUpdateInfo(packageName=");
        sb.append(this.a);
        sb.append(", availableVersionCode=");
        sb.append(this.b);
        sb.append(", availabilityState=");
        sb.append(this.c);
        sb.append(", downloadState=");
        sb.append(this.d);
        sb.append(", downloadInfo=");
        sb.append(this.e);
        sb.append(", payload=");
        return k73.c(sb, this.f, ')');
    }
}
