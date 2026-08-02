package xsna;

/* compiled from: SourceInformation.kt */
/* loaded from: classes11.dex */
public final class zi90 extends Exception {
    private final String message;

    public zi90(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
