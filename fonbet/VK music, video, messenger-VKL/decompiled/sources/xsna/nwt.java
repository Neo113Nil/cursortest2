package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;

/* compiled from: VideoGetByIdRequestProvider.kt */
/* loaded from: classes15.dex */
public final class nwt {
    public final VideoFileOld a;
    public final UserProfile b;
    public final Group c;
    public final ArrayList d;
    public final ArrayList e;

    public nwt(VideoFileOld videoFileOld, UserProfile userProfile, Group group, ArrayList arrayList, ArrayList arrayList2) {
        this.a = videoFileOld;
        this.b = userProfile;
        this.c = group;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwt)) {
            return false;
        }
        nwt nwtVar = (nwt) obj;
        return this.a.equals(nwtVar.a) && epx.f(this.b, nwtVar.b) && epx.f(this.c, nwtVar.c) && this.d.equals(nwtVar.d) && this.e.equals(nwtVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        UserProfile userProfile = this.b;
        int hashCode2 = (hashCode + (userProfile == null ? 0 : userProfile.hashCode())) * 31;
        Group group = this.c;
        return this.e.hashCode() + qr.a(this.d, (hashCode2 + (group != null ? group.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetVideoByIdDTO(video=");
        sb.append(this.a);
        sb.append(", hostProfile=");
        sb.append(this.b);
        sb.append(", hostGroup=");
        sb.append(this.c);
        sb.append(", comments=");
        sb.append(this.d);
        sb.append(", pinnedComments=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
    }
}
