package defpackage;

import android.graphics.Bitmap;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.view.RatioImageView;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class iz11 extends l9y {
    public final /* synthetic */ String b;
    public final /* synthetic */ RatioImageView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz11(jz11 jz11Var, DivView divView, String str, RatioImageView ratioImageView) {
        super(divView);
        this.b = str;
        this.c = ratioImageView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.k9v
    public final void e(ad7 ad7Var) {
        char c;
        int i;
        Bitmap bitmap = ad7Var.a;
        int width = bitmap.getWidth();
        String str = this.b;
        str.getClass();
        switch (str.hashCode()) {
            case 108:
                if (str.equals("l")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 109:
                if (str.equals("m")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case HProv.PP_CACHE_SIZE /* 115 */:
                if (str.equals("s")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                i = width / 15;
                break;
            case 2:
                i = width / 10;
                break;
            default:
                i = -1;
                break;
        }
        RatioImageView ratioImageView = this.c;
        if (i == -1) {
            ratioImageView.setImageBitmap(bitmap);
        } else {
            ratioImageView.setRoundedImage(bitmap, i);
        }
    }
}
