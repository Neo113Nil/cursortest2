package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: FoldersShowViewEvent.kt */
/* loaded from: classes18.dex */
public abstract class s2s implements yn50 {

    /* compiled from: FoldersShowViewEvent.kt */
    public static final class a extends s2s {
        public final yyr a;

        public a(yyr yyrVar) {
            this.a = yyrVar;
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
            return "ShowFolderDeleteConfirm(folder=" + this.a + ')';
        }
    }

    /* compiled from: FoldersShowViewEvent.kt */
    public static final class b extends s2s {
        public final yyr a;
        public final List<bzr> b;

        public b(yyr yyrVar, ListBuilder listBuilder) {
            this.a = yyrVar;
            this.b = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowFolderMoreDialog(folder=");
            sb.append(this.a);
            sb.append(", actions=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: FoldersShowViewEvent.kt */
    public static final class c extends s2s {
        public final int a;
        public final Object[] b;

        public c(int i, Object... objArr) {
            this.a = i;
            this.b = objArr;
        }
    }
}
