package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.groups.Group;

/* compiled from: PeerItem.kt */
/* loaded from: classes18.dex */
public abstract class n0n0 {

    /* compiled from: PeerItem.kt */
    public static final class a extends n0n0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 615174096;
        }

        public final String toString() {
            return "BelongToSublist";
        }
    }

    /* compiled from: PeerItem.kt */
    public static final class b extends n0n0 {
        public final Dialog a;

        public b(Dialog dialog) {
            this.a = dialog;
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
            return "Chat(dialog=" + this.a + ')';
        }
    }

    /* compiled from: PeerItem.kt */
    public static final class c extends n0n0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -973183303;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: PeerItem.kt */
    public static final class d extends n0n0 {
        public final Dialog a;
        public final Group b;

        public d(Dialog dialog, Group group) {
            this.a = dialog;
            this.b = group;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Group(dialog=" + this.a + ", profile=" + this.b + ')';
        }
    }

    /* compiled from: PeerItem.kt */
    public static final class e extends n0n0 {
        public final Dialog a;
        public final Serializer.StreamParcelableAdapter b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Dialog dialog, qtd0 qtd0Var) {
            this.a = dialog;
            this.b = (Serializer.StreamParcelableAdapter) qtd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "User(dialog=" + this.a + ", profile=" + this.b + ')';
        }
    }
}
