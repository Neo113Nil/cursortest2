package xsna;

/* compiled from: EventData.java */
/* loaded from: classes8.dex */
public interface pyp {
    int a();

    long b();

    default int c() {
        return a() - getAttributes().size();
    }

    q94 getAttributes();

    String getName();
}
