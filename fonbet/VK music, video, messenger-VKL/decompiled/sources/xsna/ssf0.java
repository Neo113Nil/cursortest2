package xsna;

/* compiled from: RelatedUserPinInputSideEffects.kt */
/* loaded from: classes6.dex */
public interface ssf0 {

    /* compiled from: RelatedUserPinInputSideEffects.kt */
    public static final class a implements ssf0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 274480980;
        }

        public final String toString() {
            return "ClearUserInput";
        }
    }

    /* compiled from: RelatedUserPinInputSideEffects.kt */
    public static final class b implements ssf0 {
        public final boolean a;

        public b() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Close(isRelatedPinCodeChanged="), this.a, ')');
        }

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: RelatedUserPinInputSideEffects.kt */
    public static final class c implements ssf0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1704693811;
        }

        public final String toString() {
            return "CloseSuccess";
        }
    }

    /* compiled from: RelatedUserPinInputSideEffects.kt */
    public static final class d implements ssf0 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CompleteInput(text="), this.a, ')');
        }
    }

    /* compiled from: RelatedUserPinInputSideEffects.kt */
    public static final class e implements ssf0 {
        public final String a;

        public e(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OpenRestorePinCodeScenario(flowService="), this.a, ')');
        }
    }

    /* compiled from: RelatedUserPinInputSideEffects.kt */
    public static final class f implements ssf0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1159332582;
        }

        public final String toString() {
            return "ShowKeyboard";
        }
    }
}
