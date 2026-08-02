package xsna;

import android.util.SparseIntArray;
import com.vk.api.generated.assets.dto.AssetsItemDto;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hae implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hae(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                AssetsItemDto assetsItemDto = (AssetsItemDto) j5g.a0((List) this.c);
                if (assetsItemDto != null) {
                    return assetsItemDto.getUrl();
                }
                return null;
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.c;
                int size = sparseIntArray.size();
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseIntArray.keyAt(i);
                    long valueAt = sparseIntArray.valueAt(i) * keyAt;
                    j2 += valueAt;
                    if (keyAt > gfs.j) {
                        j += valueAt;
                    }
                }
                return new Pair(Long.valueOf(j), Long.valueOf(j2));
            default:
                ((vvn0) this.c).a.l();
                return s3q0.a;
        }
    }
}
