package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Looper;
import com.vk.im.ui.views.avatars.AvatarView;
import java.util.concurrent.CountDownLatch;

/* compiled from: AvatarBitmapFactory.kt */
/* loaded from: classes2.dex */
public final class up5 {

    /* compiled from: AvatarBitmapFactory.kt */
    public static final class a extends AvatarView {
        @Override // com.vk.im.ui.views.avatars.AvatarView, xsna.zjt, android.widget.ImageView, android.view.View
        public final void onAttachedToWindow() {
            getHierarchy().d.setVisible(true, true);
            super.onAttachedToWindow();
        }
    }

    public static Bitmap a(int i, izs izsVar) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        dhr0.a.getClass();
        a aVar = new a(dhr0.E(), null, 6, 0);
        aVar.setControllerListener(new vp5(countDownLatch));
        aVar.setFadeDuration(0);
        aVar.setViewSize(i);
        aVar.measure(i, i);
        aVar.layout(0, 0, i, i);
        izsVar.invoke(aVar);
        aVar.onAttachedToWindow();
        if (aVar.getController() == null) {
            countDownLatch.countDown();
        }
        if (epx.f(Looper.getMainLooper(), Looper.myLooper())) {
            fp.d("Bitmap creating is prohibited on main thread due to deadlocking");
        }
        try {
            countDownLatch.await();
            aVar.draw(canvas);
            return createBitmap;
        } finally {
            aVar.onDetachedFromWindow();
        }
    }
}
