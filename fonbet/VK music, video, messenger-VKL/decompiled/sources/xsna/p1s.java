package xsna;

/* compiled from: FoldersPagerViewAction.kt */
/* loaded from: classes18.dex */
public abstract class p1s implements kj50 {

    /* compiled from: FoldersPagerViewAction.kt */
    public static final class a extends p1s {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeCarouselFreeze(freezeUpdated="), this.b, ')');
        }
    }

    /* compiled from: FoldersPagerViewAction.kt */
    public static final class b extends p1s {
        public final xyr b;

        public b(xyr xyrVar) {
            this.b = xyrVar;
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
            return "FolderDeleteConfirmClick(folder=" + this.b + ')';
        }
    }

    /* compiled from: FoldersPagerViewAction.kt */
    public static final class c extends p1s {
        public final xyr b;

        public c(xyr xyrVar) {
            this.b = xyrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FolderLongClick(folder=" + this.b + ')';
        }
    }

    /* compiled from: FoldersPagerViewAction.kt */
    public static final class d extends p1s {
        public final xyr b;
        public final wzr c;

        public d(xyr xyrVar, wzr wzrVar) {
            this.b = xyrVar;
            this.c = wzrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "FolderPopupOptionClick(folder=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: FoldersPagerViewAction.kt */
    public static final class e extends p1s {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1385805619;
        }

        public final String toString() {
            return "FolderReselected";
        }
    }

    /* compiled from: FoldersPagerViewAction.kt */
    public static final class f extends p1s {
        public final xyr b;

        public f(xyr xyrVar) {
            this.b = xyrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FolderSelected(folder=" + this.b + ')';
        }
    }

    /* compiled from: FoldersPagerViewAction.kt */
    public static final class g extends p1s {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ManagedGroupsOnboardingLongClick(folder=null)";
        }
    }

    /* compiled from: FoldersPagerViewAction.kt */
    public static final class h extends p1s {
        public final int b;
        public final long c;

        public h(int i, long j) {
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b == hVar.b && this.c == hVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UndoAddDialogToFolder(folderId=");
            sb.append(this.b);
            sb.append(", dialogId=");
            return vu5.a(')', this.c, sb);
        }
    }
}
