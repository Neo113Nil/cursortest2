package xsna;

import com.vk.api.generated.stories.dto.StoriesUploadResultDto;
import java.util.List;

/* compiled from: UploadParams.kt */
/* loaded from: classes6.dex */
public final class gcq0 {
    public final List<StoriesUploadResultDto> a;

    public gcq0(List<StoriesUploadResultDto> list) {
        this.a = list;
    }

    public final List<StoriesUploadResultDto> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcq0) && epx.f(this.a, ((gcq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("UploadParams(uploadJsons="), this.a);
    }
}
