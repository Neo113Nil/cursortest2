package xsna;

import com.vk.metrics.performance.images.ImageCacheSource;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class kal implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kal(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((oal) this.c).e();
                break;
            default:
                for (Map.Entry entry : ((Map) ((yfl) this.c).c.getValue()).entrySet()) {
                    ImageCacheSource imageCacheSource = (ImageCacheSource) entry.getKey();
                    Map map = (Map) entry.getValue();
                    String h = imageCacheSource.h();
                    Iterator it = map.values().iterator();
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (it.hasNext()) {
                        switch (((AtomicInteger) it.next()).get()) {
                            case 0:
                                break;
                            case 1:
                                i++;
                                break;
                            case 2:
                                i2++;
                                break;
                            case 3:
                                i3++;
                                break;
                            case 4:
                                i4++;
                                break;
                            case 5:
                                i5++;
                                break;
                            case 6:
                                i6++;
                                break;
                            case 7:
                                i7++;
                                break;
                            default:
                                i8++;
                                break;
                        }
                    }
                    fgw fgwVar = new fgw();
                    fgwVar.v(h, i, i2, i3, i4, i5, i6, i7, i8);
                    fgwVar.q();
                }
                break;
        }
        return s3q0.a;
    }
}
