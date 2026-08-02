package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.TypedValue;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class ln1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;

    public /* synthetic */ ln1(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Bitmap bitmap = this.b;
        Context context = (Context) obj;
        switch (i) {
            case 0:
                return new BitmapDrawable(context.getResources(), bitmap);
            case 1:
                return new BitmapDrawable(context.getResources(), bitmap);
            default:
                RoundedBitmapDrawable a = a.a(context.getResources(), bitmap);
                a.setCircular(true);
                a.setCornerRadius(TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics()));
                return a;
        }
    }
}
