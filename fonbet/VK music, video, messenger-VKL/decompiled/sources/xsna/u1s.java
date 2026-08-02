package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: FoldersPagerViewEvent.kt */
/* loaded from: classes18.dex */
public abstract class u1s implements yn50 {

    /* compiled from: FoldersPagerViewEvent.kt */
    public static final class a extends u1s {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("CopyTextToClipboard(text="), this.a, ')');
        }
    }

    /* compiled from: FoldersPagerViewEvent.kt */
    public static final class b extends u1s {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ScrollToTop(folderId="), this.a, ')');
        }
    }

    /* compiled from: FoldersPagerViewEvent.kt */
    public static final class c extends u1s {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectFolder(pos="), this.a, ')');
        }
    }

    /* compiled from: FoldersPagerViewEvent.kt */
    public static final class d extends u1s {
        public final int a;
        public final String b;
        public final long c;

        public d(int i, String str, long j) {
            this.a = i;
            this.b = str;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowDialogAddedToFolder(folderId=");
            sb.append(this.a);
            sb.append(", folderName=");
            sb.append(this.b);
            sb.append(", dialogId=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: FoldersPagerViewEvent.kt */
    public static final class e extends u1s {
        public final xyr a;

        public e(xyr xyrVar) {
            this.a = xyrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowFolderDeleteConfirm(item=" + this.a + ')';
        }
    }

    /* compiled from: FoldersPagerViewEvent.kt */
    public static final class f extends u1s {
        public final List<wzr> a;
        public final xyr b;
        public final xyr c;

        public f(ListBuilder listBuilder, xyr xyrVar, xyr xyrVar2) {
            this.a = listBuilder;
            this.b = xyrVar;
            this.c = xyrVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ShowFolderPopup(actions=" + this.a + ", item=" + this.b + ", currentSelected=" + this.c + ')';
        }
    }

    /* compiled from: FoldersPagerViewEvent.kt */
    public static final class g extends u1s {
        public final xyr a;

        public g(xyr xyrVar) {
            this.a = xyrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowFolderResetCountersConfirm(item=" + this.a + ')';
        }
    }

    /* compiled from: FoldersPagerViewEvent.kt */
    public static final class h extends u1s {
        public final int a;
        public final Object[] b;

        public h(int i, Object... objArr) {
            this.a = i;
            this.b = objArr;
        }
    }
}
