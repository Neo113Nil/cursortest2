package xsna;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.vk.inappreview.impl.fake.RatingBar;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import xsna.o2z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pjq implements RatingBar.a, o2z0.b {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pjq(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.o2z0.b
    public void a(boolean z) {
        WeakReference weakReference = (WeakReference) this.b;
        kiw kiwVar = (kiw) this.c;
        o2z0.b bVar = (o2z0.b) this.d;
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            WeakHashMap weakHashMap = o2z0.c;
            if (kiwVar == ((kiw) weakHashMap.get(imageView))) {
                weakHashMap.remove(imageView);
                Bitmap a = kiwVar.a();
                if (a != null) {
                    o2z0.c(a, imageView);
                }
            }
        }
        if (bVar != null) {
            bVar.a(kiwVar.a() != null);
        }
    }
}
