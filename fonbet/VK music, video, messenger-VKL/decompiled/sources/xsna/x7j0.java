package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.Narrative;
import java.util.List;
import java.util.Map;

/* compiled from: ShareStoryAction.kt */
/* loaded from: classes16.dex */
public abstract class x7j0 implements kj50 {

    /* compiled from: ShareStoryAction.kt */
    public static final class a extends x7j0 {
        public final Group b;

        public a(Group group) {
            this.b = group;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            Group group = this.b;
            if (group == null) {
                return 0;
            }
            return group.hashCode();
        }

        public final String toString() {
            return "ChooseAuthor(group=" + this.b + ')';
        }
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class b extends x7j0 {
        public final Narrative b;

        public b(Narrative narrative) {
            this.b = narrative;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChooseNarrative(narrative=" + this.b + ')';
        }
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class c extends x7j0 {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CreateNarrative(title="), this.b, ')');
        }
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class d extends x7j0 {
        public static final d b = new d();
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class e extends x7j0 {
        public final List<Group> b;
        public final Map<UserId, Boolean> c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends Group> list, Map<UserId, Boolean> map) {
            this.b = list;
            this.c = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(initialGroups=");
            sb.append(this.b);
            sb.append(", marketOnlineBookingValues=");
            return cjl0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class f extends x7j0 {
        public final List<Group> b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends Group> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("OnNewGroups(groups="), this.b);
        }
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class g extends x7j0 {
        public final List<Narrative> b;
        public final String c;

        public g(VKList vKList, String str) {
            this.b = vKList;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnNewNarratives(narratives=");
            sb.append(this.b);
            sb.append(", nextForm=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class h extends x7j0 {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnlineBookingSwitchChanged(value="), this.b, ')');
        }
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class i extends x7j0 {
        public static final i b = new i();
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class j extends x7j0 {
        public static final j b = new j();
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class k extends x7j0 {
        public static final k b = new k();
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class l extends x7j0 {
        public static final l b = new l();
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class m extends x7j0 {
        public final int b;

        public m(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b == ((m) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdateLifetime(lifetime="), this.b, ')');
        }
    }

    /* compiled from: ShareStoryAction.kt */
    public static final class n extends x7j0 {
        public final StoryPrivacyType b;

        public n(StoryPrivacyType storyPrivacyType) {
            this.b = storyPrivacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdatePrivacy(type=" + this.b + ')';
        }
    }
}
