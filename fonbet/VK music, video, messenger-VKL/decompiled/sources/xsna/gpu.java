package xsna;

import com.vk.dto.group.GroupSuggestion;

/* compiled from: GroupsCarouselItemUiDto.kt */
/* loaded from: classes4.dex */
public interface gpu {

    /* compiled from: GroupsCarouselItemUiDto.kt */
    public static final class a implements gpu {
        public final GroupSuggestion a;

        public a(GroupSuggestion groupSuggestion) {
            this.a = groupSuggestion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Group(groupSuggestion=" + this.a + ')';
        }
    }

    /* compiled from: GroupsCarouselItemUiDto.kt */
    public static final class b implements gpu {
        public static final b a = new b();
    }
}
