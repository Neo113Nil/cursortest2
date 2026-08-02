package xsna;

import android.content.Context;
import com.vk.photogallery.PhotoGalleryView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class axz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ axz(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return ((wwz) obj).a(context);
            default:
                int intValue = ((Integer) obj).intValue();
                int i2 = PhotoGalleryView.m;
                return Integer.valueOf(e3m.f(intValue, context));
        }
    }
}
