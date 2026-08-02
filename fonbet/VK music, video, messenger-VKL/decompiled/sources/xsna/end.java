package xsna;

import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import java.util.Set;

/* compiled from: ClipsCoauthorsSelectorSideEffect.kt */
/* loaded from: classes16.dex */
public interface end {

    /* compiled from: ClipsCoauthorsSelectorSideEffect.kt */
    public static final class a implements end {
        public static final a a = new a();
    }

    /* compiled from: ClipsCoauthorsSelectorSideEffect.kt */
    @vby
    public static final class b implements end {
        public final Set<ClipsCoauthorSelectorUserItem> a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return epx.f(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetResult(selectedItems=" + this.a + ')';
        }
    }

    /* compiled from: ClipsCoauthorsSelectorSideEffect.kt */
    public static final class c implements end {
        public static final c a = new c();
    }
}
