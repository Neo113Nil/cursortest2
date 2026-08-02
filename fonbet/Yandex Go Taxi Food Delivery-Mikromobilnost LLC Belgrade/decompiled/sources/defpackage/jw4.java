package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil3.graphics.EnumC0136DataSource;
import coil3.size.Precision;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public final class jw4 implements pwq {
    public final /* synthetic */ int a;
    public final lg70 b;
    public final Object c;

    public /* synthetic */ jw4(Object obj, lg70 lg70Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = lg70Var;
    }

    @Override // defpackage.pwq
    public final Object a(Continuation continuation) {
        int i = this.a;
        Object obj = this.c;
        lg70 lg70Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                int G = evu0.G(str, HexString.CHAR_COMMA, 0, 6);
                if (G == -1) {
                    ny61.g("Missing comma in data URL.");
                    return null;
                }
                if (!cvu0.s(gvu0.A0(G, str), ";base64", false)) {
                    ny61.g("Not a base64 image data URL.");
                    return null;
                }
                ByteString q = cvw.q(str.substring(G + 1));
                if (q == null) {
                    ny61.g("Failed to decode base64 content");
                    return null;
                }
                yp6 yp6Var = new yp6();
                yp6Var.b0(q);
                return new zct0(eja1.b(yp6Var, lg70Var.e), null, EnumC0136DataSource.MEMORY);
            case 1:
                yp6 yp6Var2 = new yp6();
                yp6Var2.m968write((byte[]) obj);
                return new zct0(eja1.b(yp6Var2, lg70Var.e), null, EnumC0136DataSource.MEMORY);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new zct0(new bdt0(new jci0(new x67(byteBuffer)), lg70Var.e, new c77(byteBuffer)), null, EnumC0136DataSource.MEMORY);
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = zx21.a;
                boolean z = (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
                if (z) {
                    drawable = new BitmapDrawable(lg70Var.a.getResources(), om91.e(drawable, lev.a(lg70Var), lg70Var.b, lg70Var.c, (xis0) s8o.p(lg70Var, kev.b), lg70Var.d == Precision.INEXACT));
                }
                return new t9v(cma1.k(drawable), z, EnumC0136DataSource.MEMORY);
        }
    }
}
