package defpackage;

import android.animation.AnimatorSet;
import android.widget.ImageView;
import androidx.compose.runtime.g;
import com.yandex.div.core.images.BitmapSource;

/* loaded from: classes15.dex */
public final class dnh extends k9v {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ dnh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k9v
    public String a() {
        switch (this.a) {
            case 1:
                return ((btk) this.b).a();
            default:
                return super.a();
        }
    }

    @Override // defpackage.k9v
    public void b() {
        switch (this.a) {
            case 0:
                ((enh) this.b).H.e();
                break;
            case 1:
                ((btk) this.b).c();
                break;
            case 2:
                jhv jhvVar = (jhv) this.b;
                if (jhvVar.B.a.a) {
                    jhvVar.a.startPostponedEnterTransition();
                    break;
                }
                break;
            case 6:
                ((lo31) this.b).J.e();
                break;
            case 7:
                ((g) ((w6f0) this.b)).setValue(vb61.b);
                break;
        }
    }

    @Override // defpackage.k9v
    public void c(mav mavVar) {
        switch (this.a) {
            case 3:
                ((fyc) this.b).T(new iyj0(mavVar));
                break;
            default:
                super.c(mavVar);
                break;
        }
    }

    @Override // defpackage.k9v
    public void d() {
        switch (this.a) {
            case 1:
                ((btk) this.b).e();
                break;
            case 4:
                ((ImageView) ((bu0) this.b).i).setImageDrawable(null);
                break;
            case 7:
                ((g) ((w6f0) this.b)).setValue(vb61.c);
                break;
        }
    }

    @Override // defpackage.k9v
    public void e(ad7 ad7Var) {
        switch (this.a) {
            case 0:
                ((enh) this.b).H.e();
                break;
            case 1:
                btk btkVar = (btk) this.b;
                int i = zxk.a[ad7Var.d.ordinal()];
                btkVar.g(new bd7(ad7Var.a, ad7Var.c, ad7Var.b, i != 1 ? i != 2 ? BitmapSource.NETWORK : BitmapSource.MEMORY : BitmapSource.DISK));
                break;
            case 2:
                jhv jhvVar = (jhv) this.b;
                ((ImageView) jhvVar.D.d).setImageBitmap(ad7Var.a);
                if (jhvVar.B.a.a) {
                    jhvVar.a.startPostponedEnterTransition();
                    break;
                }
                break;
            case 3:
                ((fyc) this.b).T(new myj0(ad7Var.b));
                break;
            case 5:
                AnimatorSet animatorSet = ((mae0) this.b).k;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 6:
                ((lo31) this.b).J.e();
                break;
            case 7:
                ((g) ((w6f0) this.b)).setValue(new wb61(ad7Var));
                break;
        }
    }

    public /* synthetic */ dnh() {
        this.a = 3;
    }
}
