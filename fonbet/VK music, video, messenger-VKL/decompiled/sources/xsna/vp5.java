package xsna;

import android.graphics.drawable.Animatable;
import java.util.concurrent.CountDownLatch;

/* compiled from: AvatarBitmapFactory.kt */
/* loaded from: classes2.dex */
public final class vp5 extends fc6<mjw> {
    public final /* synthetic */ CountDownLatch c;

    public vp5(CountDownLatch countDownLatch) {
        this.c = countDownLatch;
    }

    @Override // xsna.fc6, xsna.kqj
    public final void b(String str, Throwable th) {
        this.c.countDown();
    }

    @Override // xsna.fc6, xsna.kqj
    public final void e(String str, Object obj, Animatable animatable) {
        this.c.countDown();
    }
}
