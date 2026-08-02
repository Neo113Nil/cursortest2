package xsna;

import java.io.Serializable;

/* compiled from: CreateVkEmailModel.kt */
/* loaded from: classes15.dex */
public final class wak {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ wak(Serializable serializable, Serializable serializable2, int i) {
        this.a = i;
        this.b = serializable;
        this.c = serializable2;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return ((String) this.b) + ", " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    public wak(String str) {
        this.a = 0;
        this.b = str;
        this.c = new m900(20);
    }
}
