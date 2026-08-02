package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import androidx.camera.core.g;
import androidx.media3.ui.TrackSelectionView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonGroup;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import java.util.Comparator;
import ru.yandex.taxi.recycler.a;
import ru.yandex.taxi.recycler.b;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListView;

/* loaded from: classes11.dex */
public final /* synthetic */ class oe7 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oe7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int onMeasure$lambda$2;
        int lambda$new$0;
        int b;
        int b2;
        int preserveStoriesOrder$lambda$1;
        int lambda$init$0;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((Number) ((mq5) obj3).invoke(obj, obj2)).intValue();
            case 1:
                for (tls tlsVar : (tls[]) obj3) {
                    int b3 = uvc.b((Comparable) tlsVar.invoke(obj), (Comparable) tlsVar.invoke(obj2));
                    if (b3 != 0) {
                        return b3;
                    }
                }
                return 0;
            case 2:
                onMeasure$lambda$2 = CompressionResistantListComponent.onMeasure$lambda$2((sdd) obj3, obj, obj2);
                return onMeasure$lambda$2;
            case 3:
                return ((Number) ((tbb) obj3).invoke(obj, obj2)).intValue();
            case 4:
                return ((Number) ((gse) obj3).invoke(obj, obj2)).intValue();
            case 5:
                lambda$new$0 = ((MaterialButtonGroup) obj3).lambda$new$0((MaterialButton) obj, (MaterialButton) obj2);
                return lambda$new$0;
            case 6:
                ed10 ed10Var = (ed10) obj3;
                b = ed10Var.b(obj2);
                b2 = ed10Var.b(obj);
                break;
            case 7:
                return ((Number) ((g990) obj3).invoke(obj, obj2)).intValue();
            case 8:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i2 = a.a[((b) obj3).b.ordinal()];
                if (i2 == 1) {
                    int i3 = rect.top;
                    int i4 = rect2.top;
                    if (i3 == i4) {
                        if (rect.left >= rect2.left) {
                            return 1;
                        }
                    } else if (i3 >= i4) {
                        return 1;
                    }
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return 0;
                    }
                    int i5 = rect.left;
                    int i6 = rect2.left;
                    if (i5 == i6) {
                        if (rect.top >= rect2.top) {
                            return 1;
                        }
                    } else if (i5 >= i6) {
                        return 1;
                    }
                }
                return -1;
            case 9:
                return ((Number) ((arm0) obj3).invoke(obj, obj2)).intValue();
            case 10:
                return ((Number) ((e3o0) obj3).invoke(obj, obj2)).intValue();
            case 11:
                preserveStoriesOrder$lambda$1 = StoriesPreviewsListView.preserveStoriesOrder$lambda$1((sn1) obj3, obj, obj2);
                return preserveStoriesOrder$lambda$1;
            case 12:
                return ((Number) ((sn1) obj3).invoke(obj, obj2)).intValue();
            case 13:
                gyq0 gyq0Var = (gyq0) obj2;
                ((aow0) obj3).getClass();
                Class cls = ((gyq0) obj).f().j;
                int i7 = cls == MediaCodec.class ? 2 : (cls == g.class || cls == iru0.class) ? 0 : 1;
                Class cls2 = gyq0Var.f().j;
                return i7 - (cls2 != MediaCodec.class ? (cls2 == g.class || cls2 == iru0.class) ? 0 : 1 : 2);
            case 14:
                lambda$init$0 = TrackSelectionView.lambda$init$0((Comparator) obj3, (u001) obj, (u001) obj2);
                return lambda$init$0;
            case 15:
                Rect rect3 = (Rect) obj3;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return (Math.abs(size.getHeight() - rect3.height()) + Math.abs(size.getWidth() - rect3.width())) - (Math.abs(size2.getHeight() - rect3.height()) + Math.abs(size2.getWidth() - rect3.width()));
            default:
                n281 n281Var = (n281) obj3;
                b = n281Var.a(obj2);
                b2 = n281Var.a(obj);
                break;
        }
        return b - b2;
    }
}
