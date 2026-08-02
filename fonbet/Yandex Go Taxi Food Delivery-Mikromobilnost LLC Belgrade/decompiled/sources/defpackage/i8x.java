package defpackage;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.yandex.mapkit.mapview.MapTexture;
import java.nio.ByteBuffer;
import ru.yandextaxi.flutter_yandex_mapkit.jni.JniBinaryMessenger;

/* loaded from: classes7.dex */
public final class i8x implements k8x {
    public final q501 a = new q501(28);
    public final ssr b;
    public final eu00 c;

    public i8x(ssr ssrVar, eu00 eu00Var) {
        m6 m6Var = new m6(14, this);
        JniBinaryMessenger.Companion.getClass();
        JniBinaryMessenger.instance.setMessageHandler(1, new j8x(m6Var));
        this.b = ssrVar;
        this.c = eu00Var;
    }

    @Override // defpackage.k8x
    public final void a(int i, ByteBuffer byteBuffer) {
        MotionEvent motionEvent;
        if (i != 1) {
            ny61.r(oyr.j(i, "method: ", " not implemented"));
            return;
        }
        DisplayMetrics displayMetrics = this.b.a.getResources().getDisplayMetrics();
        int i2 = byteBuffer.getInt();
        Integer num = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : 3 : 1 : 2 : 0;
        if (num != null) {
            int intValue = num.intValue();
            long j = byteBuffer.getLong();
            int i3 = byteBuffer.getInt();
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = byteBuffer.getInt();
                pointerPropertiesArr[i4] = pointerProperties;
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                pointerCoords.x = byteBuffer.getFloat() * displayMetrics.density;
                pointerCoords.y = byteBuffer.getFloat() * displayMetrics.density;
                pointerCoordsArr[i5] = pointerCoords;
            }
            motionEvent = MotionEvent.obtain(j, j, intValue, i3, pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
        } else {
            motionEvent = null;
        }
        ht00 ht00Var = (ht00) this.c.a;
        if (motionEvent != null) {
            MapTexture mapTexture = ht00Var.c;
            (mapTexture != null ? mapTexture : null).onTouchEvent(motionEvent);
            motionEvent.recycle();
        }
    }
}
