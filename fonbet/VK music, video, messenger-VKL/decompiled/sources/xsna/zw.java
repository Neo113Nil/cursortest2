package xsna;

import android.graphics.Bitmap;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ zw(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PrivateFiles.a b;
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "ActionButtonsToolbar");
                qgi0.h(tgi0Var, str);
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    bitmap = null;
                }
                break;
            case 2:
                qgi0.h((tgi0) obj, str);
                break;
            case 3:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.h(tgi0Var2, str);
                qgi0.n(tgi0Var2, 0);
                break;
            case 4:
                b = e8r.a.b(r2, PrivateSubdir.MUSIC_STICKER.h(), true);
                File file = new File(b.a, str);
                Regex regex = com.vk.core.files.a.a;
                vhk0.d(file);
                break;
            case 5:
                qgi0.q((tgi0) obj, str);
                break;
            case 6:
                qgi0.h((tgi0) obj, str);
                break;
            default:
                qgi0.h((tgi0) obj, str);
                break;
        }
        return s3q0.a;
    }
}
