package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class qd implements jd {
    public final String a;
    public final Runnable b;

    public qd(String str, Runnable runnable) {
        this.a = str;
        this.b = runnable;
    }

    public final void a() {
        this.b.run();
    }

    public final boolean a(String str, String str2) {
        return "mobileads".equals(str) && epx.f(this.a, str2);
    }
}
