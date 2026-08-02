package xsna;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.core.util.RecreateActivity;
import com.vk.dto.common.id.UserId;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.acs0;
import xsna.c2r0;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dil implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dil(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        RecyclerPaginatedView recyclerPaginatedView;
        int i = this.b;
        c2r0.b bVar = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((eil) obj).a.invoke(new z710.r.a(SystemClock.elapsedRealtime()));
                return s3q0.a;
            case 1:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj;
                int i2 = SettingsGeneralFragment.z0;
                r55 r55Var = r55.a;
                c2r0 j = r55.j();
                List<c2r0.b> h = ((yui) j).h(settingsGeneralFragment.requireContext(), true);
                UserId c = o25.a().c();
                for (c2r0.b bVar2 : h) {
                    if (c == bVar2.a) {
                        bVar = bVar2;
                    }
                }
                ((CacheComponent) j6i.b(m7m.f(settingsGeneralFragment), CacheComponent.class)).ic().b();
                if (bVar != null) {
                    ((yui) j).k(settingsGeneralFragment.requireContext(), bVar);
                }
                int i3 = RecreateActivity.b;
                RecreateActivity.a.b(0L, settingsGeneralFragment.requireContext());
                return 0;
            case 2:
                w4r0 w4r0Var = (w4r0) obj;
                if (w4r0Var.d.get(1355) == null && w4r0Var.c()) {
                    return new i4r0();
                }
                return null;
            default:
                acs0.c cVar = ((acs0) obj).p;
                RecyclerView recyclerView = (cVar == null || (recyclerPaginatedView = cVar.c) == null) ? null : recyclerPaginatedView.getRecyclerView();
                if (recyclerView != null) {
                    hl60 hl60Var = hl60.a;
                    hl60.j(e43.a(ll60.a.invoke()), recyclerView, null, null, 28);
                }
                return s3q0.a;
        }
    }
}
