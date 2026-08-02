package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StoryOwnerUtilImpl.kt */
/* loaded from: classes6.dex */
public final class t7m0 implements s7m0 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080 A[RETURN] */
    @Override // xsna.s7m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(StoryOwner storyOwner, UserId userId) {
        boolean equals = userId.equals(storyOwner.Fb());
        if (storyOwner instanceof StoryOwner.User) {
            UserProfile userProfile = ((StoryOwner.User) storyOwner).c;
            if (userProfile != null) {
                int i = userProfile.v;
                boolean z = i == 0 || i == 2;
                if (!equals && z) {
                    return true;
                }
            }
            return false;
        }
        if (!(storyOwner instanceof StoryOwner.Owner)) {
            if (!(storyOwner instanceof StoryOwner.Community)) {
                throw new NoWhenBranchMatchedException();
            }
            Group group = ((StoryOwner.Community) storyOwner).c;
            if (group != null) {
                int i2 = group.C;
                boolean z2 = i2 == 5;
                boolean z3 = i2 == 0;
                boolean z4 = group.u() && !group.j;
                boolean z5 = group.n() && (z3 || z2);
                boolean z6 = group.C() && z2;
                if (z5 || z4 || z6) {
                }
            }
            return false;
        }
        Owner owner = ((StoryOwner.Owner) storyOwner).c;
        if (owner == null || equals || owner.i(4)) {
            return false;
        }
    }

    @Override // xsna.s7m0
    public final String b(StoryOwner storyOwner) {
        String Db;
        if (storyOwner.Mb() && (Db = storyOwner.Db()) != null && Db.length() > 0) {
            return storyOwner.Db();
        }
        if (!(storyOwner instanceof StoryOwner.User)) {
            if (storyOwner instanceof StoryOwner.Community) {
                return ((StoryOwner.Community) storyOwner).k;
            }
            return null;
        }
        UserProfile userProfile = ((StoryOwner.User) storyOwner).c;
        if (userProfile != null) {
            return userProfile.n();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    @Override // xsna.s7m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(StoryOwner storyOwner, UserId userId) {
        if (!a(storyOwner, userId) && storyOwner.b) {
            boolean equals = userId.equals(storyOwner.Fb());
            if (storyOwner instanceof StoryOwner.User) {
                UserProfile userProfile = ((StoryOwner.User) storyOwner).c;
                if (userProfile != null) {
                    boolean z = userProfile.v != 3;
                    if (!equals && z) {
                        return true;
                    }
                }
            } else if (storyOwner instanceof StoryOwner.Owner) {
                Owner owner = ((StoryOwner.Owner) storyOwner).c;
                if (owner != null && !equals && owner.i(4)) {
                }
            } else {
                if (!(storyOwner instanceof StoryOwner.Community)) {
                    throw new NoWhenBranchMatchedException();
                }
                Group group = ((StoryOwner.Community) storyOwner).c;
                if (group != null) {
                    boolean z2 = group.C == 4;
                    boolean z3 = group.u() && group.j;
                    boolean z4 = group.n() && z2;
                    if (z3 || z4) {
                    }
                }
            }
        }
        return false;
    }
}
