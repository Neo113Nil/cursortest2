package yads;

import java.util.Map;

/* loaded from: classes10.dex */
public final class ya implements Runnable {
    public final String b;
    public final ac3 c;
    public final Map d;

    public ya(String str, ac3 ac3Var, Map map) {
        this.b = str;
        this.c = ac3Var;
        this.d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.length() > 0) {
            this.c.a(this.b, this.d);
        }
    }
}
