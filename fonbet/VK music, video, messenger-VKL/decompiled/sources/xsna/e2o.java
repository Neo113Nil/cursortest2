package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.donut.privacy.levels.PrivacyEditDonutLevelsFragment;
import com.vk.dto.donut.DonutLevel;
import java.util.ArrayList;
import java.util.List;
import xsna.ycd0;

/* compiled from: DonutPrivacyRouterImpl.kt */
/* loaded from: classes18.dex */
public final class e2o implements d2o {
    @Override // xsna.d2o
    public final void a(Context context, DonutLevel donutLevel, ArrayList arrayList, r9c0 r9c0Var) {
        new ycd0.a(context, donutLevel, arrayList, r9c0Var).I0(null);
    }

    @Override // xsna.d2o
    public final void b(Context context, DonutLevel donutLevel, List list) {
        PrivacyEditDonutLevelsFragment.a aVar = new PrivacyEditDonutLevelsFragment.a(PrivacyEditDonutLevelsFragment.class, null, null);
        Bundle bundle = aVar.j;
        if (donutLevel != null) {
            bundle.putParcelable("donut_level", donutLevel);
        }
        bundle.putParcelableArrayList("donut_levels", p4g.q(list));
        aVar.h(e3m.h(context), 150);
    }
}
