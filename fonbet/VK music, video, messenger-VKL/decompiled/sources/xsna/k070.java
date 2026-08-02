package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;

/* compiled from: NewsfeedStoriesDto.kt */
/* loaded from: classes4.dex */
public final class k070 {
    public final GetStoriesResponse a;

    public k070(GetStoriesResponse getStoriesResponse) {
        this.a = getStoriesResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k070) && epx.f(this.a, ((k070) obj).a);
    }

    public final int hashCode() {
        GetStoriesResponse getStoriesResponse = this.a;
        if (getStoriesResponse == null) {
            return 0;
        }
        return getStoriesResponse.hashCode();
    }

    public final String toString() {
        return "NewsfeedStoriesDto(stories=" + this.a + ')';
    }
}
