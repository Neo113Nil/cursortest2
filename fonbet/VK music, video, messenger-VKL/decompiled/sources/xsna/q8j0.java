package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.Narrative;
import java.util.List;
import java.util.Map;

/* compiled from: ShareStoryPatch.kt */
/* loaded from: classes16.dex */
public abstract class q8j0 implements xl50 {

    /* compiled from: ShareStoryPatch.kt */
    public static final class a extends q8j0 {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeOnlineBookingSwitch(isChecked="), this.b, ')');
        }
    }

    /* compiled from: ShareStoryPatch.kt */
    public static final class b extends q8j0 {
        public final Group b;

        public b(Group group) {
            this.b = group;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
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

    /* compiled from: ShareStoryPatch.kt */
    public static final class c extends q8j0 {
        public final List<Group> b;
        public final Map<UserId, Boolean> c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Group> list, Map<UserId, Boolean> map) {
            this.b = list;
            this.c = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
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

    /* compiled from: ShareStoryPatch.kt */
    public static final class d extends q8j0 {
        public final List<Group> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Group> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("OnNewGroups(groups="), this.b);
        }
    }

    /* compiled from: ShareStoryPatch.kt */
    public static final class e extends q8j0 {
        public final List<Narrative> b;
        public final String c;
        public final boolean d;

        public e(List<Narrative> list, String str, boolean z) {
            this.b = list;
            this.c = str;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && this.d == eVar.d;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnNewNarratives(narratives=");
            sb.append(this.b);
            sb.append(", nextForm=");
            sb.append(this.c);
            sb.append(", addToStart=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ShareStoryPatch.kt */
    public static final class f extends q8j0 {
        public final Narrative b;

        public f(Narrative narrative) {
            this.b = narrative;
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
            return "SelectNarrative(narrative=" + this.b + ')';
        }
    }

    /* compiled from: ShareStoryPatch.kt */
    public static final class g extends q8j0 {
        public final Narrative b;

        public g(Narrative narrative) {
            this.b = narrative;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UnselectNarrative(narrative=" + this.b + ')';
        }
    }

    /* compiled from: ShareStoryPatch.kt */
    public static final class h extends q8j0 {
        public final int b;

        public h(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdateLifetime(lifetime="), this.b, ')');
        }
    }

    /* compiled from: ShareStoryPatch.kt */
    public static final class i extends q8j0 {
        public final StoryPrivacyType b;

        public i(StoryPrivacyType storyPrivacyType) {
            this.b = storyPrivacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdatePrivacy(type=" + this.b + ')';
        }
    }
}
