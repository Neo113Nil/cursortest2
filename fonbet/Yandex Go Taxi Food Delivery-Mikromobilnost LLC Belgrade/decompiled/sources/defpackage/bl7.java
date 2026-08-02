package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yandex.images.FadingDrawable;
import com.yandex.images.b;

/* loaded from: classes15.dex */
public final class bl7 {
    public final b a;
    public final xn50 b;
    public final rq c;
    public final String d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ int g;
    public k9v h;

    public bl7(b bVar, Object obj, xn50 xn50Var, String str, int i) {
        this.g = i;
        this.a = bVar;
        this.b = xn50Var;
        this.c = obj == null ? null : new rq(this, obj, bVar.g);
        this.d = str;
        xn50Var.getClass();
    }

    public final void a() {
        switch (this.g) {
            case 0:
                this.e = true;
                this.h = null;
                break;
            default:
                this.e = true;
                this.h = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ad7 ad7Var) {
        switch (this.g) {
            case 0:
                k9v k9vVar = this.h;
                if (k9vVar != null) {
                    k9vVar.e(ad7Var);
                    this.h = null;
                    break;
                }
                break;
            default:
                rq rqVar = this.c;
                z83.d(rqVar, "ImageViewAction must have target!");
                ImageView imageView = (ImageView) rqVar.get();
                if (imageView != null) {
                    FadingDrawable.setBitmap(imageView, ad7Var.a, false, ad7Var.d);
                    k9v k9vVar2 = this.h;
                    if (k9vVar2 != null) {
                        k9vVar2.e(ad7Var);
                        this.h = null;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(mav mavVar) {
        int i;
        int i2 = this.g;
        xn50 xn50Var = this.b;
        switch (i2) {
            case 0:
                h5b1.b(xn50Var.a, mavVar, this.h);
                k9v k9vVar = this.h;
                if (k9vVar != null) {
                    k9vVar.c(mavVar);
                    if (!this.f) {
                        this.h = null;
                        break;
                    }
                }
                break;
            default:
                h5b1.b(xn50Var.a, mavVar, this.h);
                rq rqVar = this.c;
                z83.d(rqVar, "ImageViewAction must have target!");
                ImageView imageView = (ImageView) rqVar.get();
                if (imageView != null) {
                    Resources resources = imageView.getResources();
                    Drawable drawable = xn50Var.e;
                    if (drawable == null && (i = xn50Var.d) != 0) {
                        drawable = resources.getDrawable(i);
                    }
                    if (drawable != null) {
                        FadingDrawable.setPlaceholder(imageView, drawable);
                    }
                    k9v k9vVar2 = this.h;
                    if (k9vVar2 != null) {
                        k9vVar2.c(mavVar);
                        this.h = null;
                        break;
                    }
                }
                break;
        }
    }

    public final Object d() {
        rq rqVar = this.c;
        if (rqVar == null) {
            return null;
        }
        return rqVar.get();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Action{mNetImage = [");
        sb.append(this.b);
        sb.append("], mKey = [");
        return oyr.t(sb, this.d, "]}");
    }
}
