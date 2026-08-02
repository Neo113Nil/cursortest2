package xsna;

import com.vk.dto.newsfeed.entries.Photos;

/* compiled from: PhotoFriendsTagsConfirmationDto.kt */
/* loaded from: classes4.dex */
public final class g9a0 {
    public final Photos a;

    public g9a0(Photos photos) {
        this.a = photos;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9a0) && epx.f(this.a, ((g9a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PhotoFriendsTagsConfirmationDto(entry=" + this.a + ')';
    }
}
