package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vk.medianative.MediaNative;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class g5l implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g5l(int i, DebugFileManagerFragment debugFileManagerFragment, izs izsVar) {
        this.c = i;
        this.d = debugFileManagerFragment;
        this.e = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Bitmap b;
        switch (this.b) {
            case 0:
                DebugFileManagerFragment debugFileManagerFragment = (DebugFileManagerFragment) this.d;
                izs izsVar = (izs) this.e;
                if (this.c == debugFileManagerFragment.O.get()) {
                    izsVar.invoke(EmptyList.b);
                }
                return s3q0.a;
            default:
                BitmapFactory.Options options = (BitmapFactory.Options) this.d;
                String str = (String) this.e;
                Triple triple = (Triple) obj;
                int intValue = ((Number) triple.d()).intValue();
                int intValue2 = ((Number) triple.g()).intValue();
                boolean booleanValue = ((Boolean) triple.h()).booleanValue();
                options.inSampleSize = kd7.a(intValue, intValue2, options);
                options.inJustDecodeBounds = false;
                Bitmap k = kd7.k(BitmapFactory.decodeFile(str, options), this.c, false);
                if (k == null) {
                    b = null;
                } else {
                    int width = k.getWidth();
                    int height = k.getHeight();
                    float f = width;
                    float f2 = height;
                    if ((1.0f * f) / f2 > 1.3333334f) {
                        width = (int) (f2 * 1.3333334f);
                    } else {
                        height = (int) (f / 1.3333334f);
                    }
                    Pair pair = new Pair(Integer.valueOf(width), Integer.valueOf(height));
                    b = kd7.b(k, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue(), false, false);
                }
                if (booleanValue && b != null) {
                    MediaNative.blurBitmap(b, b.getWidth() / 10);
                }
                it80.b.getClass();
                return new it80(b);
        }
    }

    public /* synthetic */ g5l(BitmapFactory.Options options, String str, int i, p860 p860Var) {
        this.d = options;
        this.e = str;
        this.c = i;
    }
}
