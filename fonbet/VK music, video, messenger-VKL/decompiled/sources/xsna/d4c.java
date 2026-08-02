package xsna;

import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.tab.presentation.TabView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class d4c implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d4c(boolean z) {
        this.c = z;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        boolean z = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                i4c.a(z, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj).getClass();
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                ((TabView) obj2).setSkipAnimation(z);
                break;
        }
        return s3q0.a;
    }
}
