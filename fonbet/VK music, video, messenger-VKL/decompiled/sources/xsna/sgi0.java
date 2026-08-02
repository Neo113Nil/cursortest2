package xsna;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes11.dex */
public final class sgi0<T> {
    public final String a;
    public final wzs<T, T, T> b;
    public final boolean c;

    public sgi0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sgi0(String str, wzs<? super T, ? super T, ? extends T> wzsVar) {
        this.a = str;
        this.b = wzsVar;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ sgi0(String str) {
        this(str, qj10.k);
    }

    public sgi0(String str, int i) {
        this(str);
        this.c = true;
    }

    public sgi0(String str, boolean z, wzs wzsVar) {
        this(str, wzsVar);
        this.c = z;
    }
}
