package defpackage;

/* loaded from: classes14.dex */
public interface kak0 extends ibk0 {
    default kak0 b(int i) {
        if (this instanceof iak0) {
            return new iak0(((iak0) this).a, i);
        }
        if (this instanceof jak0) {
            return new jak0(((jak0) this).a, i);
        }
        w511.b();
        return null;
    }
}
