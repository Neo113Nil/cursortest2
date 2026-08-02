package xsna;

import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PhotoTagConfirmationDto.kt */
/* loaded from: classes4.dex */
public final class rba0 {
    public final Photos a;
    public final PhotoAttachment b;
    public final int c;
    public final UserProfile d;

    public rba0(Photos photos, PhotoAttachment photoAttachment, int i, UserProfile userProfile) {
        this.a = photos;
        this.b = photoAttachment;
        this.c = i;
        this.d = userProfile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rba0)) {
            return false;
        }
        rba0 rba0Var = (rba0) obj;
        return epx.f(this.a, rba0Var.a) && epx.f(this.b, rba0Var.b) && this.c == rba0Var.c && epx.f(this.d, rba0Var.d);
    }

    public final int hashCode() {
        int a = shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        UserProfile userProfile = this.d;
        return a + (userProfile == null ? 0 : userProfile.hashCode());
    }

    public final String toString() {
        return "PhotoTagConfirmationDto(entry=" + this.a + ", photoAttachment=" + this.b + ", tagId=" + this.c + ", tagPlacer=" + this.d + ')';
    }
}
