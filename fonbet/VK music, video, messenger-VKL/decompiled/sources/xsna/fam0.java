package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: StoryPrivacyState.kt */
/* loaded from: classes16.dex */
public final class fam0 implements km50 {
    public final StoryPrivacyType b;
    public final StoryPrivacyType c;
    public final List<UserId> d;
    public final List<UserId> e;
    public final List<UserId> f;
    public final List<ayv0> g;
    public final List<ayv0> h;
    public final List<ayv0> i;

    /* JADX WARN: Multi-variable type inference failed */
    public fam0(StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, List<UserId> list, List<UserId> list2, List<UserId> list3, List<? extends ayv0> list4, List<? extends ayv0> list5, List<? extends ayv0> list6) {
        this.b = storyPrivacyType;
        this.c = storyPrivacyType2;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = list5;
        this.i = list6;
    }

    public static fam0 a(fam0 fam0Var, StoryPrivacyType storyPrivacyType, List list, List list2, List list3, List list4, List list5, int i) {
        if ((i & 1) != 0) {
            storyPrivacyType = fam0Var.b;
        }
        StoryPrivacyType storyPrivacyType2 = storyPrivacyType;
        StoryPrivacyType storyPrivacyType3 = (i & 2) != 0 ? fam0Var.c : null;
        if ((i & 4) != 0) {
            list = fam0Var.d;
        }
        List list6 = list;
        if ((i & 8) != 0) {
            list2 = fam0Var.e;
        }
        List list7 = list2;
        List<UserId> list8 = fam0Var.f;
        if ((i & 32) != 0) {
            list3 = fam0Var.g;
        }
        List list9 = list3;
        List list10 = (i & 64) != 0 ? fam0Var.h : list4;
        List list11 = (i & 128) != 0 ? fam0Var.i : list5;
        fam0Var.getClass();
        return new fam0(storyPrivacyType2, storyPrivacyType3, list6, list7, list8, list9, list10, list11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fam0)) {
            return false;
        }
        fam0 fam0Var = (fam0) obj;
        return this.b == fam0Var.b && this.c == fam0Var.c && epx.f(this.d, fam0Var.d) && epx.f(this.e, fam0Var.e) && epx.f(this.f, fam0Var.f) && epx.f(this.g, fam0Var.g) && epx.f(this.h, fam0Var.h) && epx.f(this.i, fam0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        StoryPrivacyType storyPrivacyType = this.c;
        return this.i.hashCode() + fw3.a(fw3.a(fw3.a(fw3.a(fw3.a((hashCode + (storyPrivacyType == null ? 0 : storyPrivacyType.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryPrivacyState(selectedPrivacyType=");
        sb.append(this.b);
        sb.append(", oldPrivacyType=");
        sb.append(this.c);
        sb.append(", bestFriends=");
        sb.append(this.d);
        sb.append(", excludedFriends=");
        sb.append(this.e);
        sb.append(", includedFriends=");
        sb.append(this.f);
        sb.append(", bestFriendsAvatars=");
        sb.append(this.g);
        sb.append(", excludedFriendsAvatars=");
        sb.append(this.h);
        sb.append(", includedFriendsAvatars=");
        return ms9.a(')', sb, this.i);
    }
}
