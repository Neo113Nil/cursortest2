package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import java.util.LinkedHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3r implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x3r(a4r a4rVar, boolean z) {
        this.d = a4rVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                a4r a4rVar = (a4r) this.d;
                RecyclerView recyclerView = a4rVar.c;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator(this.c ? a4rVar.d : null);
                }
                break;
            default:
                iy30 iy30Var = (iy30) this.d;
                VkSearchView vkSearchView = iy30Var.k;
                if (vkSearchView == null) {
                    vkSearchView = null;
                }
                vkSearchView.U4();
                VkSearchView vkSearchView2 = iy30Var.k;
                if (vkSearchView2 == null) {
                    vkSearchView2 = null;
                }
                if (vkSearchView2.isFocused()) {
                    VkSearchView vkSearchView3 = iy30Var.k;
                    if (vkSearchView3 == null) {
                        vkSearchView3 = null;
                    }
                    vkSearchView3.d0();
                }
                View view = iy30Var.i;
                (view != null ? view : null).setVisibility(8);
                LinkedHashMap linkedHashMap = iy30Var.a().e;
                if (!linkedHashMap.isEmpty()) {
                    for (b0i0 b0i0Var : linkedHashMap.values()) {
                        RecyclerView recyclerView2 = b0i0Var.d;
                        recyclerView2.setVisibility(4);
                        recyclerView2.stopScroll();
                        b0i0Var.a.setVisibility(4);
                        b0i0Var.b.setVisibility(4);
                        b0i0Var.c.setVisibility(4);
                    }
                }
                iy30Var.a.F(this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ x3r(iy30 iy30Var, HideReason hideReason, boolean z) {
        this.d = iy30Var;
        this.c = z;
    }
}
