package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import com.vk.geo.api.data.IconDrawConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import xsna.cpv;
import xsna.crv;

/* compiled from: IconDrawer.kt */
/* loaded from: classes2.dex */
public abstract class fqv<I extends crv> {
    public static final Regex j = new Regex("\n");
    public final float a;
    public final IconDrawConfig b;
    public final I c;
    public final wqo0 d = new wqo0(new v3n(this, 9));
    public final Object e = msy.a(LazyThreadSafetyMode.PUBLICATION, new p3h(this, 25));
    public final wqo0 f = new wqo0(new h13(15));
    public final wqo0 g;
    public final wqo0 h;
    public final bpn0 i;

    /* compiled from: IconDrawer.kt */
    public static final class a {
        public final Path a;
        public final Path b;

        public a(Path path, Path path2) {
            this.a = path;
            this.b = path2;
        }
    }

    /* compiled from: IconDrawer.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fqv(float f, IconDrawConfig iconDrawConfig, I i) {
        this.a = f;
        this.b = iconDrawConfig;
        this.c = i;
        new wqo0(new i13(12));
        this.g = new wqo0(new fc(16));
        this.h = new wqo0(new gc(11));
        this.i = new bpn0(new jrh(this, 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap a(fqv fqvVar, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = (int) (fqvVar.c.c() >> 32);
        }
        int g = fqvVar.g();
        fqvVar.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        float f = i2 * 0.5f;
        Paint paint = (Paint) fqvVar.d.b.get();
        paint.setColor(g);
        canvas.drawCircle(f, f, f, paint);
        paint.setColor(i);
        canvas.drawCircle(f, f, f - cn70.b(1), paint);
        return createBitmap;
    }

    public static Bitmap h(Layout layout) {
        Bitmap createBitmap = Bitmap.createBitmap(layout.getWidth(), layout.getHeight(), Bitmap.Config.ARGB_8888);
        layout.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public abstract Bitmap b(Bitmap bitmap, float f, int i);

    public abstract cpv.a c(Bitmap bitmap, int i, boolean z, CharSequence charSequence, CharSequence charSequence2);

    public abstract cpv.a d(Bitmap bitmap, cpv.a aVar, int i, float f, boolean z, CharSequence charSequence, CharSequence charSequence2);

    public abstract cpv.a e(Bitmap bitmap, float f, CharSequence charSequence, CharSequence charSequence2);

    public abstract Bitmap f(elr0 elr0Var, int i);

    public abstract int g();
}
