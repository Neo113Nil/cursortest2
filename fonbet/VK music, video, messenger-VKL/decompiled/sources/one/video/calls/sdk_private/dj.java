package one.video.calls.sdk_private;

/* compiled from: HttpError.java */
/* loaded from: classes8.dex */
public final class dj extends Exception {
    private Integer a;

    public dj(String str, int i) {
        super(str + " (" + i + ")");
        this.a = Integer.valueOf(i);
    }
}
