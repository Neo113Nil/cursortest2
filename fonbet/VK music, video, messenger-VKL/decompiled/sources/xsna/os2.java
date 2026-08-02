package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.my.tracker.MyTracker;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.ImageScreenSize;
import java.util.concurrent.Callable;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class os2 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ os2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                rs2 rs2Var = (rs2) this.c;
                it80.a aVar = it80.b;
                Object invoke = rs2Var.d.invoke();
                aVar.getClass();
                return new it80(invoke);
            case 1:
                return gpy0.l.b(xr50.b, new jgz(19), null, ((com.vk.articles.a) this.c).getContext());
            case 2:
                return Uri.parse((String) this.c);
            case 3:
                djl djlVar = (djl) this.c;
                if (djlVar.d == null) {
                    djlVar.d = Long.valueOf(SystemClock.elapsedRealtime());
                }
                djlVar.a.invoke();
                return s3q0.a;
            case 4:
                ImageSize Cb = ((Image) this.c).Cb(ImageScreenSize.MID.h(), true, false);
                return Uri.parse(Cb != null ? Cb.d.d : null);
            case 5:
                return ((gzs) this.c).invoke();
            default:
                return MyTracker.getInstanceId((Context) this.c);
        }
    }
}
