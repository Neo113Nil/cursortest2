package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: UserProfileContentReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class qnq0 {

    /* compiled from: UserProfileContentReducerDelegate.kt */
    public static final class a {
        public final boolean a;
        public final CommunityProfileContent b;

        public a(boolean z, CommunityProfileContent communityProfileContent) {
            this.a = z;
            this.b = communityProfileContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            CommunityProfileContent communityProfileContent = this.b;
            return hashCode + (communityProfileContent == null ? 0 : communityProfileContent.hashCode());
        }

        public final String toString() {
            return "UpdateContentData(isNeedToUpdateContent=" + this.a + ", content=" + this.b + ')';
        }
    }

    public static com.vk.profile.user.impl.ui.g a(com.vk.profile.user.impl.ui.g gVar, b.e eVar) {
        a aVar;
        CommunityProfileContent communityProfileContent = gVar.g;
        CommunityProfileContent communityProfileContent2 = eVar.b;
        if (communityProfileContent == null) {
            aVar = new a(true, null);
        } else {
            List<CommunityProfileContentItem> list = communityProfileContent.b;
            int size = list.size();
            List<CommunityProfileContentItem> list2 = communityProfileContent2.b;
            if (size != list2.size()) {
                aVar = new a(true, CommunityProfileContent.a(communityProfileContent2, null, null, communityProfileContent.g, 1983));
            } else {
                Iterator<T> it = list.iterator();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        aVar = new a(false, communityProfileContent);
                        break;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    CommunityProfileContentItem communityProfileContentItem = list2.get(i);
                    if (communityProfileContentItem.h != ((CommunityProfileContentItem) next).h) {
                        aVar = new a(true, null);
                        break;
                    }
                    if (communityProfileContentItem.f() == CommunityProfileContentItem.State.RELOAD) {
                        aVar = new a(true, null);
                        break;
                    }
                    i = i2;
                }
                if (!aVar.a) {
                    List<CommunityProfileContentItem> list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<T> it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((CommunityProfileContentItem) it2.next()).f() == CommunityProfileContentItem.State.INITIAL) {
                                z = true;
                                break;
                            }
                        }
                    }
                    aVar = new a(true ^ z, null);
                }
            }
        }
        if (!aVar.a) {
            return com.vk.profile.user.impl.ui.g.a(gVar, null, false, false, false, null, communityProfileContent != null ? CommunityProfileContent.a(communityProfileContent, null, null, null, 1791) : null, communityProfileContent2.c, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, 8388511);
        }
        CommunityProfileContent communityProfileContent3 = aVar.b;
        return com.vk.profile.user.impl.ui.g.a(gVar, null, false, false, false, null, communityProfileContent3 == null ? communityProfileContent2 : communityProfileContent3, communityProfileContent2.c, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, 8388511);
    }
}
