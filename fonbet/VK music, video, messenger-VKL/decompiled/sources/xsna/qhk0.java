package xsna;

/* compiled from: SpanContext.java */
/* loaded from: classes11.dex */
public interface qhk0 {
    String e();

    String h();

    default boolean i() {
        return (((qpw) ((sm5) this).d).b & 1) != 0;
    }

    boolean isValid();

    rdp0 j();
}
