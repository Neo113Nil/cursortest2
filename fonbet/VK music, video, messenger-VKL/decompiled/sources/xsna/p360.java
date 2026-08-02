package xsna;

import com.vk.core.ui.tracking.UiTracker;
import java.util.Comparator;
import xsna.lkv;
import xsna.r360;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class p360 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        lkv.e eVar = lkv.e.a;
        String str = (String) ((ckv) obj).h(eVar);
        String str2 = (String) ((ckv) obj2).h(eVar);
        UiTracker uiTracker = UiTracker.a;
        String d = UiTracker.d();
        boolean a = r360.a.a(str, d);
        boolean a2 = r360.a.a(str2, d);
        return (a2 ? 1 : 0) - (a ? 1 : 0);
    }
}
