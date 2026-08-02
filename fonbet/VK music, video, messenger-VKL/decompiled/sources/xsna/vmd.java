package xsna;

import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsCoauthorsSelectorAction.kt */
/* loaded from: classes16.dex */
public interface vmd extends kj50 {

    /* compiled from: ClipsCoauthorsSelectorAction.kt */
    @vby
    public static final class a implements vmd {
        public final ClipsCoauthorsSelectorInputParams b;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.b, ((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Init(inputParams=" + this.b + ')';
        }
    }

    /* compiled from: ClipsCoauthorsSelectorAction.kt */
    public static final class b implements vmd {
        public static final b b = new b();
    }

    /* compiled from: ClipsCoauthorsSelectorAction.kt */
    @vby
    public static final class c implements vmd {
        public final String b;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return epx.f(this.b, ((c) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return air.b(')', "OnInputChanged(input=", this.b);
        }
    }

    /* compiled from: ClipsCoauthorsSelectorAction.kt */
    public static final class d implements vmd {
        public static final d b = new d();
    }

    /* compiled from: ClipsCoauthorsSelectorAction.kt */
    @vby
    public static final class e implements vmd {
        public final UserId b;

        public final boolean equals(Object obj) {
            if (obj instanceof e) {
                return epx.f(this.b, ((e) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return "OnItemSelectionChanged(userId=" + this.b + ')';
        }
    }

    /* compiled from: ClipsCoauthorsSelectorAction.kt */
    public static final class f implements vmd {
        public static final f b = new f();
    }

    /* compiled from: ClipsCoauthorsSelectorAction.kt */
    public static final class g implements vmd {
        public static final g b = new g();
    }

    /* compiled from: ClipsCoauthorsSelectorAction.kt */
    @vby
    public static final class h implements vmd {
        public final UserId b;

        public final boolean equals(Object obj) {
            if (obj instanceof h) {
                return epx.f(this.b, ((h) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return "OnSelectedItemRemoved(userId=" + this.b + ')';
        }
    }

    /* compiled from: ClipsCoauthorsSelectorAction.kt */
    public static final class i implements vmd {
        public static final i b = new i();
    }
}
