package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: DataListParams.kt */
/* loaded from: classes18.dex */
public final class duk {
    public final Good a;
    public final k5u b;
    public final boolean c;
    public final List<Photo> d;
    public final List<VideoFile> e;

    /* JADX WARN: Multi-variable type inference failed */
    public duk(Good good, k5u k5uVar, boolean z, List<? extends Photo> list, List<? extends VideoFile> list2) {
        this.a = good;
        this.b = k5uVar;
        this.c = z;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duk)) {
            return false;
        }
        duk dukVar = (duk) obj;
        return epx.f(this.a, dukVar.a) && epx.f(this.b, dukVar.b) && this.c == dukVar.c && epx.f(this.d, dukVar.d) && epx.f(this.e, dukVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + fw3.a(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataListParams(good=");
        sb.append(this.a);
        sb.append(", pageData=");
        sb.append(this.b);
        sb.append(", shopConditionsAvailable=");
        sb.append(this.c);
        sb.append(", availablePhotos=");
        sb.append(this.d);
        sb.append(", availableVideos=");
        return ms9.a(')', sb, this.e);
    }
}
