package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.writebar.WriteBar;
import xsna.acs0;
import xsna.yl70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class prz implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ prz(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        View view;
        switch (this.b) {
            case 0:
                break;
            case 1:
                ((yl70.b.C4110b) this.d).e.invoke(Integer.valueOf(this.c));
                break;
            case 2:
                ((mj80) this.d).w(this.c);
                break;
            default:
                final acs0 acs0Var = (acs0) this.d;
                acs0.c cVar = acs0Var.p;
                if (cVar != null && (recyclerPaginatedView = cVar.c) != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        final int i = this.c;
                        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                        final int a = (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) ? iah0.a(72.0f) : view.getHeight();
                        int[] iArr = {0, 0};
                        recyclerView.getLocationOnScreen(iArr);
                        final int a0 = rl3.a0(iArr);
                        final int i2 = iah0.f().heightPixels;
                        u3g0 u3g0Var = acs0Var.n;
                        if (u3g0Var != null) {
                            gzs gzsVar = new gzs() { // from class: xsna.ybs0
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    u3g0 u3g0Var2 = acs0.this.n;
                                    int h = u3g0Var2 != null ? u3g0Var2.h() : 0;
                                    int i3 = ify.a;
                                    linearLayoutManager.K(i, (((i2 - (ify.e(ify.c) ? ify.d(3, null) : 0)) - a) - h) - a0);
                                    return s3q0.a;
                                }
                            };
                            WriteBar writeBar = u3g0Var.e;
                            if (writeBar != null) {
                                awt0.t(writeBar, gzsVar);
                            }
                        }
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
