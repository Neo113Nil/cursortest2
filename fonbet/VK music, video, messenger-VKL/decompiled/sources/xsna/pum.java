package xsna;

import com.vk.im.engine.models.dialogs.DialogsFilter;

/* compiled from: DialogsLoadMode.kt */
/* loaded from: classes2.dex */
public interface pum {

    /* compiled from: DialogsLoadMode.kt */
    public static final class a implements pum {
        public final DialogsFilter a;

        public a(DialogsFilter dialogsFilter) {
            this.a = dialogsFilter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CommonLoad(filter=" + this.a + ')';
        }
    }

    /* compiled from: DialogsLoadMode.kt */
    public static final class b implements pum {
        public final int a;
        public final DialogsFilter b;

        public b(int i, DialogsFilter dialogsFilter) {
            this.a = i;
            this.b = dialogsFilter;
        }

        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "FolderLoad(id=" + this.a + ", filter=" + this.b + ')';
        }
    }
}
