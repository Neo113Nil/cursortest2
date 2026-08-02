package xsna;

/* compiled from: MeterProvider.java */
/* loaded from: classes8.dex */
public interface cj20 {
    static cj20 m() {
        return sil.b;
    }

    default yi20 get(String str) {
        return meterBuilder(str).build();
    }

    aj20 meterBuilder(String str);
}
