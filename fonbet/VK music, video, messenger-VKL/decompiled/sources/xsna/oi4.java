package xsna;

import com.vk.music.bottomsheets.audiobook.person.model.AudioBookPersonModel;
import java.util.List;

/* compiled from: AudioBookPersonPatch.kt */
/* loaded from: classes3.dex */
public interface oi4 extends xl50 {

    /* compiled from: AudioBookPersonPatch.kt */
    public static final class a implements oi4 {
        public final List<vh4> b;

        public a(List<vh4> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("PersonActionItemListShowing(actionList="), this.b);
        }
    }

    /* compiled from: AudioBookPersonPatch.kt */
    public static final class b implements oi4 {
        public final List<AudioBookPersonModel> b;

        public b(List<AudioBookPersonModel> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("PersonListShowing(personList="), this.b);
        }
    }
}
