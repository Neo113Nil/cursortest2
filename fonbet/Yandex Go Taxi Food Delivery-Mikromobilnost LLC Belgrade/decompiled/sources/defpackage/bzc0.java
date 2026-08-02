package defpackage;

import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes6.dex */
public final class bzc0 implements Runnable {
    public final ModalView a;
    public final Runnable b;
    public boolean c;

    public bzc0(ModalView modalView, Runnable runnable) {
        this.a = modalView;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            this.b.run();
            this.a.postOnAnimation(this);
        }
    }
}
