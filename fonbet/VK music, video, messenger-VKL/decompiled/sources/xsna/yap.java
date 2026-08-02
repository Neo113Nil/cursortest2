package xsna;

import android.view.MotionEvent;
import xsna.k760;
import xsna.uap;

/* compiled from: ElementProducer.kt */
/* loaded from: classes4.dex */
public interface yap<E extends uap> {
    void a(mlo mloVar);

    default boolean b() {
        return false;
    }

    void c(MotionEvent motionEvent);

    E create();

    void d(MotionEvent motionEvent, k760.a aVar);

    void e(MotionEvent motionEvent);

    default boolean f() {
        return false;
    }

    void reset();
}
