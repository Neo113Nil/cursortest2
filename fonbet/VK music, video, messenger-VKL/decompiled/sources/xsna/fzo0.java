package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.groups.Group;

/* compiled from: PeerItem.kt */
/* loaded from: classes18.dex */
public abstract class fzo0 {

    /* compiled from: PeerItem.kt */
    public static final class a extends fzo0 {
        public final Dialog a;

        public a(Dialog dialog) {
            this.a = dialog;
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
            return "Chat(dialog=" + this.a + ')';
        }
    }

    /* compiled from: PeerItem.kt */
    public static final class b extends fzo0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1655222583;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: PeerItem.kt */
    public static final class c extends fzo0 {
        public final Dialog a;
        public final Group b;

        public c(Dialog dialog, Group group) {
            this.a = dialog;
            this.b = group;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Group(dialog=" + this.a + ", profile=" + this.b + ')';
        }
    }

    /* compiled from: PeerItem.kt */
    public static final class d extends fzo0 {
        public final Dialog a;
        public final Serializer.StreamParcelableAdapter b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Dialog dialog, qtd0 qtd0Var) {
            this.a = dialog;
            this.b = (Serializer.StreamParcelableAdapter) qtd0Var;
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
            return "User(dialog=" + this.a + ", profile=" + this.b + ')';
        }
    }
}
