package xsna;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public abstract class dxj extends a1s {

    /* compiled from: FoldersEvent.kt */
    public static final class a extends dxj {
        public final upm b;

        public a(upm upmVar) {
            this.b = upmVar;
        }

        @Override // xsna.a1s, xsna.sxp
        public final Object a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            upm upmVar = this.b;
            if (upmVar == null) {
                return 0;
            }
            return upmVar.c.hashCode();
        }

        public final String toString() {
            return "OnCounterAffectingFolderCreated(changerTag=" + this.b + ')';
        }
    }

    /* compiled from: FoldersEvent.kt */
    public static final class b extends dxj {
        public final Object b;

        public b(Object obj) {
            this.b = obj;
        }

        @Override // xsna.a1s, xsna.sxp
        public final Object a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            Object obj = this.b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("OnCounterAffectingFolderDeleted(changerTag="), this.b, ')');
        }
    }
}
