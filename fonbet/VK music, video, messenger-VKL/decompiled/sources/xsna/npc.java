package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import java.util.List;

/* compiled from: ClipCtaWithDonutMviPatch.kt */
/* loaded from: classes16.dex */
public interface npc extends yl50 {

    /* compiled from: ClipCtaWithDonutMviPatch.kt */
    public static final class a implements npc {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -298894904;
        }

        public final String toString() {
            return "ClearSelected";
        }
    }

    /* compiled from: ClipCtaWithDonutMviPatch.kt */
    public static final class b implements npc {
        public final List<qaq0> a;

        public b(List<qaq0> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("DonutLoaded(levels="), this.a);
        }
    }

    /* compiled from: ClipCtaWithDonutMviPatch.kt */
    public static final class c implements npc {
        public final ClipInvolvementActionButton<?> a;

        public c(ClipInvolvementActionButton<?> clipInvolvementActionButton) {
            this.a = clipInvolvementActionButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            ClipInvolvementActionButton<?> clipInvolvementActionButton = this.a;
            if (clipInvolvementActionButton == null) {
                return 0;
            }
            return clipInvolvementActionButton.hashCode();
        }

        public final String toString() {
            return "OnSelected(selectedOption=" + this.a + ')';
        }
    }
}
