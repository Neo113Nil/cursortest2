package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.attachpicker.configuration.GalleryGridSpanStyle;
import com.vk.attachpicker.configuration.GalleryHeaderButtonStyle;
import xsna.gz10;
import xsna.u0x;

/* compiled from: GalleryPickerUIConfigurator.kt */
/* loaded from: classes15.dex */
public interface b5t {

    /* compiled from: GalleryPickerUIConfigurator.kt */
    public static final class a {
        public static final int a = cn70.b(10);
    }

    static {
        int i = a.a;
    }

    hj1 a();

    s4t b();

    int c(Context context, boolean z);

    gz10 d(Context context, float f, gz10.a aVar);

    u0x e(ViewGroup viewGroup, jba0 jba0Var, u0x.a aVar);

    boolean f(boolean z);

    default int g() {
        return 0;
    }

    default int h() {
        return a.a;
    }

    l5t i();

    String j(Context context);

    GalleryGridSpanStyle k();

    boolean l();

    GalleryHeaderButtonStyle m();
}
