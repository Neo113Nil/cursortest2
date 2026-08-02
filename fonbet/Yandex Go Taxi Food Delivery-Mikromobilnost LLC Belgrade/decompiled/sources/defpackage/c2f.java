package defpackage;

import com.yandex.runtime.image.ImageProvider;
import java.util.function.Supplier;

/* loaded from: classes14.dex */
public final /* synthetic */ class c2f implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageProvider b;

    public /* synthetic */ c2f(ImageProvider imageProvider, int i) {
        this.a = i;
        this.b = imageProvider;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        ImageProvider imageProvider = this.b;
        switch (i) {
            case 0:
                return imageProvider.getImage();
            default:
                return Boolean.valueOf(((qxy) imageProvider).a());
        }
    }
}
