package xsna;

import android.util.Size;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.yk90;

/* compiled from: GlobalSearchCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class x1u extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1u(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        DiscoverSearchFragment.d.a aVar;
        switch (this.b) {
            case 0:
                GlobalSearchCatalogRootVh globalSearchCatalogRootVh = (GlobalSearchCatalogRootVh) this.receiver;
                globalSearchCatalogRootVh.getClass();
                boolean l0 = GlobalSearchCatalogRootVh.l0((UIBlockList) obj);
                if (globalSearchCatalogRootVh.t && (aVar = globalSearchCatalogRootVh.s) != null) {
                    aVar.a(l0);
                }
                break;
            default:
                final int intValue = ((Number) obj).intValue();
                final int intValue2 = ((Number) obj2).intValue();
                final yk90 yk90Var = (yk90) this.receiver;
                yk90Var.g.post(new Runnable() { // from class: xsna.xk90
                    @Override // java.lang.Runnable
                    public final void run() {
                        new Size(intValue, intValue2);
                        yk90 yk90Var2 = yk90Var;
                        boolean z = yk90Var2.i;
                        ArrayList arrayList = yk90Var2.h;
                        if (!z) {
                            yk90Var2.i = true;
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((yk90.a) it.next()).c();
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((yk90.a) it2.next()).getClass();
                        }
                    }
                });
                break;
        }
        return s3q0.a;
    }
}
