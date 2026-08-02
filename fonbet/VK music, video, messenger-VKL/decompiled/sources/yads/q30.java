package yads;

import java.io.IOException;

/* loaded from: classes10.dex */
public class q30 extends IOException {
    public static final /* synthetic */ int c = 0;
    public final int b;

    public q30(int i) {
        this.b = i;
    }

    public q30(int i, String str) {
        super(str);
        this.b = i;
    }

    public q30(String str, Throwable th, int i) {
        super(str, th);
        this.b = i;
    }

    public q30(Throwable th, int i) {
        super(th);
        this.b = i;
    }
}
