package yads;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class y70 implements m41 {
    public final /* synthetic */ ImageView a;

    public y70(ImageView imageView) {
        this.a = imageView;
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
    }

    @Override // yads.m41
    public final void a(l41 l41Var, boolean z) {
        Bitmap bitmap = l41Var.a;
        if (bitmap != null) {
            this.a.setImageBitmap(bitmap);
        }
    }
}
