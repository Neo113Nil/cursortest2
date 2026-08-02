package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.stories.entities.OrdData;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import java.util.Date;
import java.util.List;

/* compiled from: VideoEditDataDo.kt */
/* loaded from: classes7.dex */
public final class ois0 {
    public final VideoFile a;
    public final String b;
    public final String c;
    public final PrivacyDo d;
    public final PrivacyDo e;
    public final boolean f;
    public final OrdData g;
    public final List<VideoFile> h;
    public final DonutLevel i;
    public final Date j;

    /* JADX WARN: Multi-variable type inference failed */
    public ois0(VideoFile videoFile, String str, String str2, PrivacyDo privacyDo, PrivacyDo privacyDo2, boolean z, OrdData ordData, List<? extends VideoFile> list, DonutLevel donutLevel, Date date) {
        this.a = videoFile;
        this.b = str;
        this.c = str2;
        this.d = privacyDo;
        this.e = privacyDo2;
        this.f = z;
        this.g = ordData;
        this.h = list;
        this.i = donutLevel;
        this.j = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ois0)) {
            return false;
        }
        ois0 ois0Var = (ois0) obj;
        return epx.f(this.a, ois0Var.a) && epx.f(this.b, ois0Var.b) && epx.f(this.c, ois0Var.c) && epx.f(this.d, ois0Var.d) && epx.f(this.e, ois0Var.e) && this.f == ois0Var.f && epx.f(this.g, ois0Var.g) && epx.f(this.h, ois0Var.h) && epx.f(this.i, ois0Var.i) && epx.f(this.j, ois0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int b = qoy.b((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31, 31, this.f);
        OrdData ordData = this.g;
        int a = fw3.a((b + (ordData == null ? 0 : ordData.hashCode())) * 31, 31, this.h);
        DonutLevel donutLevel = this.i;
        int hashCode3 = (a + (donutLevel == null ? 0 : donutLevel.hashCode())) * 31;
        Date date = this.j;
        return hashCode3 + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        return "VideoEditDataDo(videoFile=" + this.a + ", title=" + this.b + ", description=" + this.c + ", privacy=" + this.d + ", privacyComment=" + this.e + ", addToWall=" + this.f + ", ordData=" + this.g + ", attachedClips=" + this.h + ", donutLevel=" + this.i + ", publicationDate=" + this.j + ')';
    }
}
