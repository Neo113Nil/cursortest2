package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.vkontakte.android.R;
import java.util.concurrent.Callable;
import xsna.e3m;
import xsna.p8c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ne40 implements Callable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ne40(pe40 pe40Var, String str) {
        this.c = pe40Var;
        this.d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((pe40) obj2).a.n((String) obj));
            default:
                Bitmap createBitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
                Paint paint = new Paint(2);
                Canvas canvas = new Canvas(createBitmap);
                p8c0.b bVar = new p8c0.b((p7c0) obj2, null, createBitmap, paint, canvas);
                e3m.a aVar = e3m.a;
                canvas.drawColor(((Context) obj).getColor(R.color.vk_gray_700));
                return bVar;
        }
    }

    public /* synthetic */ ne40(p8c0 p8c0Var, p7c0 p7c0Var, Context context) {
        this.c = p7c0Var;
        this.d = context;
    }
}
