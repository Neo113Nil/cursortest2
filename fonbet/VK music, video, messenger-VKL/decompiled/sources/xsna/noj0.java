package xsna;

import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;

/* compiled from: SimilarVideoModel.kt */
/* loaded from: classes14.dex */
public final class noj0 {
    public final VideoFile a;
    public final String b;
    public final String c;
    public final DonutVideoUiModel d;

    public noj0(VideoFile videoFile, String str, String str2, DonutVideoUiModel donutVideoUiModel) {
        this.a = videoFile;
        this.b = str;
        this.c = str2;
        this.d = donutVideoUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noj0)) {
            return false;
        }
        noj0 noj0Var = (noj0) obj;
        return epx.f(this.a, noj0Var.a) && epx.f(this.b, noj0Var.b) && epx.f(this.c, noj0Var.c) && epx.f(this.d, noj0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DonutVideoUiModel donutVideoUiModel = this.d;
        return hashCode3 + (donutVideoUiModel != null ? donutVideoUiModel.hashCode() : 0);
    }

    public final String toString() {
        return "SimilarVideoModel(videoFile=" + this.a + ", videoReferrer=" + this.b + ", videoContext=" + this.c + ", donutVideoUiModel=" + this.d + ')';
    }
}
