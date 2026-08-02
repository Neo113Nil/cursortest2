package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.media.filters.model.FilterType;

/* compiled from: FiltersBridge.kt */
/* loaded from: classes3.dex */
public interface tfr {
    boolean a(FilterType filterType, Context context);

    String b(FilterType filterType, Context context);

    umv c(FilterType filterType, Context context);

    Bitmap d(Context context, Bitmap bitmap, FilterType filterType);

    lcr e();

    void f();

    /* compiled from: FiltersBridge.kt */
    public static final class a implements tfr {
        public static final a a = new a();

        @Override // xsna.tfr
        public final boolean a(FilterType filterType, Context context) {
            return false;
        }

        @Override // xsna.tfr
        public final String b(FilterType filterType, Context context) {
            return "";
        }

        @Override // xsna.tfr
        public final umv c(FilterType filterType, Context context) {
            return cdi.g;
        }

        @Override // xsna.tfr
        public final lcr e() {
            return null;
        }

        @Override // xsna.tfr
        public final void f() {
        }

        @Override // xsna.tfr
        public final Bitmap d(Context context, Bitmap bitmap, FilterType filterType) {
            return bitmap;
        }
    }
}
