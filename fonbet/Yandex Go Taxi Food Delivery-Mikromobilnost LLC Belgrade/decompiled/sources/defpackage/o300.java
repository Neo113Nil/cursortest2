package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import ru.yandex.taxi.activity.MainActivity;

/* loaded from: classes9.dex */
public interface o300 extends alj, fl40, zyq, xmr0, q15, ui00 {
    void a(MainActivity mainActivity);

    void b();

    void c();

    void d();

    boolean dispatchKeyEvent(KeyEvent keyEvent);

    boolean dispatchTouchEvent(MotionEvent motionEvent);

    void e(MainActivity mainActivity);

    void f(MainActivity mainActivity, long j, Bundle bundle);

    void g(MotionEvent motionEvent);

    void h(long j);

    void i(MainActivity mainActivity, int i, int i2, Intent intent);

    Context j(Context context);

    void k(long j);

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
}
