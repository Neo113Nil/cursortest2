package defpackage;

import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.opengl.GLES20;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$ColorFormat;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$Target;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$WrapMode;
import com.ybsdk.core.utils.ext.ViewState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.collections.a;
import kotlinx.datetime.Month;

/* loaded from: classes15.dex */
public abstract class cob1 {
    public static final int a(int i, float f) {
        return Color.argb((int) (y6i0.c(f, 0.0f, 1.0f) * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final ColorStateList b(we6... we6VarArr) {
        int[][] iArr = new int[we6VarArr.length][];
        int[] iArr2 = new int[we6VarArr.length];
        int length = we6VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            we6 we6Var = we6VarArr[i];
            int i3 = i2 + 1;
            ViewState[] viewStateArr = (ViewState[]) we6Var.c;
            ArrayList arrayList = new ArrayList(viewStateArr.length);
            for (ViewState viewState : viewStateArr) {
                arrayList.add(Integer.valueOf(viewState.getAttrRes()));
            }
            iArr[i2] = a.I0(arrayList);
            iArr2[i2] = we6Var.b;
            i++;
            i2 = i3;
        }
        return new ColorStateList(iArr, iArr2);
    }

    public static uxj c(wyl0 wyl0Var, String str, Texture$WrapMode texture$WrapMode, Texture$ColorFormat texture$ColorFormat) {
        uxj uxjVar = new uxj(Texture$Target.TEXTURE_2D, texture$WrapMode, true);
        Bitmap bitmap = null;
        try {
            AssetManager assetManager = wyl0Var.a;
            Bitmap decodeStream = BitmapFactory.decodeStream(assetManager != null ? assetManager.open(str) : null);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (decodeStream.getConfig() == config) {
                bitmap = decodeStream;
            } else {
                Bitmap copy = decodeStream.copy(config, false);
                decodeStream.recycle();
                bitmap = copy;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocateDirect);
            allocateDirect.rewind();
            GLES20.glBindTexture(3553, ((int[]) uxjVar.c)[0]);
            pva1.i("Failed to bind texture", "glBindTexture");
            GLES20.glTexImage2D(3553, 0, texture$ColorFormat.getGlesEnum(), bitmap.getWidth(), bitmap.getHeight(), 0, 6408, 5121, allocateDirect);
            pva1.i("Failed to populate texture data", "glTexImage2D");
            GLES20.glGenerateMipmap(3553);
            pva1.i("Failed to generate mipmaps", "glGenerateMipmap");
            bitmap.recycle();
            return uxjVar;
        } finally {
        }
    }

    public static final int d(Month month) {
        return month.ordinal() + 1;
    }
}
