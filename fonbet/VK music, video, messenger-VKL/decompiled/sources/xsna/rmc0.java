package xsna;

import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public final class rmc0 implements fmc0 {
    public final UploadDto a;

    public rmc0(UploadDto uploadDto) {
        this.a = uploadDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rmc0) && epx.f(this.a, ((rmc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StopUpload(uploadDto=" + this.a + ')';
    }
}
