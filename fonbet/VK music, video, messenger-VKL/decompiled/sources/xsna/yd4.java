package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.photos.root.selectalbum.domain.a;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import java.util.List;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yd4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = zd4.g1;
                ((zd4) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                CommunitiesSearchTopBarVh communitiesSearchTopBarVh = (CommunitiesSearchTopBarVh) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = 0;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(480520440, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh.bindData.<anonymous> (CommunitiesSearchTopBarVh.kt:97)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1962387869, new uog(communitiesSearchTopBarVh, i3), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                int i4 = z5h.j1;
                ((z5h) obj3).eo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                ((izs) obj3).invoke(((CharSequence) obj2).toString());
                return s3q0.a;
            case 4:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                int i5 = SelectAlbumBottomSheet.p1;
                xn50.a.c((SelectAlbumBottomSheet) obj3, new a.e((List) obj, booleanValue));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((jnx0) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                return new h9x(((dt1) obj3).a(0L, ((q9x) obj).a, (LayoutDirection) obj2));
        }
    }

    public /* synthetic */ yd4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
