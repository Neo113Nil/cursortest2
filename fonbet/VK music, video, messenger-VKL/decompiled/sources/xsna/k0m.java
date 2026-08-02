package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.widget.TabsLayoutManager;
import com.vk.dto.hints.HintId;
import java.util.List;
import java.util.stream.Collectors;
import xsna.cyn0;

/* compiled from: DeprecatedAttachActivity.java */
/* loaded from: classes15.dex */
public final class k0m extends TabsLayoutManager {
    public final /* synthetic */ DeprecatedAttachActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0m(DeprecatedAttachActivity deprecatedAttachActivity, DeprecatedAttachActivity deprecatedAttachActivity2) {
        super(deprecatedAttachActivity2);
        this.s = deprecatedAttachActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        int i = DeprecatedAttachActivity.K0;
        if (pla.e().b().a(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP.getId())) {
            int x = x();
            DeprecatedAttachActivity deprecatedAttachActivity = this.s;
            Object[] objArr = 0;
            List list = (List) deprecatedAttachActivity.C.f.stream().filter(new d0m(0 == true ? 1 : 0)).collect(Collectors.toList());
            cyn0.b bVar = (cyn0.b) list.stream().reduce(new e0m()).orElse(null);
            if (bVar != null) {
                int indexOf = deprecatedAttachActivity.C.f.indexOf(bVar);
                View findViewByPosition = findViewByPosition(indexOf);
                String str = bVar.e;
                if (x > indexOf) {
                    deprecatedAttachActivity.b2(findViewByPosition, str, list.size() == 1, null);
                } else {
                    deprecatedAttachActivity.b2(findViewByPosition(x), str, false, new f0m(deprecatedAttachActivity, indexOf, objArr == true ? 1 : 0));
                }
            }
        }
    }
}
