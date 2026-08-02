package xsna;

import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PostingSettingsCommunityState.kt */
/* loaded from: classes3.dex */
public final class rlc0 {
    public final List<PostingSettingsCommunityItem> a;

    /* JADX WARN: Multi-variable type inference failed */
    public rlc0(List<? extends PostingSettingsCommunityItem> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlc0) && epx.f(this.a, ((rlc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("PostingSettingsCommunityState(items="), this.a);
    }

    public rlc0() {
        this(EmptyList.b);
    }
}
