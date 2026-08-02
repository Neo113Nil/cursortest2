package xsna;

import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.OnlineInfo;
import com.vk.profile.core.avatar.StoryBorderMode;
import com.vk.profile.user.api.domain.UserProfileMode;

/* compiled from: UserProfileAvatarModel.kt */
/* loaded from: classes5.dex */
public final class kmq0 {
    public final String a;
    public final String b;
    public final AvatarBorderType c;
    public final StoriesContainer d;
    public final StoryBorderMode e;
    public final OnlineInfo f;
    public final UserProfileMode g;
    public final boolean h;
    public final rka0 i;
    public final srq0 j;
    public final com.vk.profile.core.cover.a k;
    public final String l;

    public kmq0(String str, String str2, AvatarBorderType avatarBorderType, StoriesContainer storiesContainer, StoryBorderMode storyBorderMode, OnlineInfo onlineInfo, UserProfileMode userProfileMode, boolean z, rka0 rka0Var, srq0 srq0Var, com.vk.profile.core.cover.a aVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = avatarBorderType;
        this.d = storiesContainer;
        this.e = storyBorderMode;
        this.f = onlineInfo;
        this.g = userProfileMode;
        this.h = z;
        this.i = rka0Var;
        this.j = srq0Var;
        this.k = aVar;
        this.l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmq0)) {
            return false;
        }
        kmq0 kmq0Var = (kmq0) obj;
        return epx.f(this.a, kmq0Var.a) && epx.f(this.b, kmq0Var.b) && this.c == kmq0Var.c && epx.f(this.d, kmq0Var.d) && this.e == kmq0Var.e && epx.f(this.f, kmq0Var.f) && this.g == kmq0Var.g && this.h == kmq0Var.h && this.i.equals(kmq0Var.i) && this.j.equals(kmq0Var.j) && epx.f(this.k, kmq0Var.k) && epx.f(this.l, kmq0Var.l);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        StoriesContainer storiesContainer = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (storiesContainer == null ? 0 : storiesContainer.hashCode())) * 31)) * 31;
        OnlineInfo onlineInfo = this.f;
        int hashCode4 = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + qoy.b((this.g.hashCode() + ((hashCode3 + (onlineInfo == null ? 0 : onlineInfo.hashCode())) * 31)) * 31, 31, this.h)) * 31)) * 31)) * 31;
        String str3 = this.l;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfileAvatarModel(avatarUrl=");
        sb.append(this.a);
        sb.append(", placeholder=");
        sb.append(this.b);
        sb.append(", avatarBorderType=");
        sb.append(this.c);
        sb.append(", storiesContainer=");
        sb.append(this.d);
        sb.append(", storyBorderMode=");
        sb.append(this.e);
        sb.append(", onlineInfo=");
        sb.append(this.f);
        sb.append(", profileMode=");
        sb.append(this.g);
        sb.append(", isCurrentUser=");
        sb.append(this.h);
        sb.append(", onAvatarClicked=");
        sb.append(this.i);
        sb.append(", hintShowRequest=");
        sb.append(this.j);
        sb.append(", coverDelegate=");
        sb.append(this.k);
        sb.append(", thumbHash=");
        return ho8.a(sb, this.l, ')');
    }
}
