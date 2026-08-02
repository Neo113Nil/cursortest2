package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.images.ImageManager$From;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class fb4 extends k9v {
    public final Context a;
    public final db4 b;
    public final zog c;
    public final int d;
    public final kb4 e;
    public yn50 f;
    public gb4 g;

    public fb4(Context context, db4 db4Var, zog zogVar, int i) {
        this.a = context.getApplicationContext();
        this.b = db4Var;
        this.c = zogVar;
        this.d = i;
        this.e = new kb4(context.getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.k9v
    public final void e(ad7 ad7Var) {
        Bitmap bitmap = ad7Var.a;
        z83.d(bitmap, null);
        ImageManager$From imageManager$From = ad7Var.d;
        gb4 gb4Var = this.g;
        pe2 pe2Var = new pe2(imageManager$From, gb4Var == null ? null : gb4Var.a(this.a), bitmap);
        this.g = pe2Var;
        if (this.f != null) {
            zog zogVar = this.c;
            zogVar.getClass();
            tje.e();
            czj czjVar = zogVar.i;
            Objects.requireNonNull(czjVar);
            sq60 sq60Var = zogVar.b;
            z83.c(null, sq60Var.hasNext());
            sq60Var.rewind();
            while (sq60Var.hasNext()) {
                zyj zyjVar = (zyj) sq60Var.next();
                if (zyjVar.a == this.d) {
                    zyjVar.a(czjVar, pe2Var);
                }
            }
        }
    }
}
