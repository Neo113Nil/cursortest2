package xsna;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.dw20;

/* compiled from: ProfileDetailsDialogProviderImpl.kt */
/* loaded from: classes5.dex */
public final class vvd0 implements tvd0 {
    public final b25 a;
    public final qdz b;

    public vvd0(b25 b25Var, qdz qdzVar) {
        this.a = b25Var;
        this.b = qdzVar;
    }

    @Override // xsna.tvd0
    public final dw20 a(FragmentActivity fragmentActivity, jhq0 jhq0Var, ExtendedUserProfile extendedUserProfile, xah xahVar, m5o0 m5o0Var) {
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        rhq0 rhq0Var = new rhq0(fragmentActivity, this.a, this.b, jhq0Var, m5o0Var);
        zvw zvwVar = new zvw(null);
        zvwVar.setItems(rhq0Var.b(extendedUserProfile));
        RecyclerView recyclerView = new RecyclerView(fragmentActivity);
        recyclerView.setFocusable(false);
        recyclerView.setId(R.id.recycler);
        recyclerView.setAdapter(zvwVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        gpu0 gpu0Var = new gpu0(fragmentActivity);
        gpu0Var.j = new uvd0(zvwVar);
        recyclerView.addItemDecoration(gpu0Var);
        return ((dw20.b) new dw20.b(fragmentActivity, tzp0.a(null, 3)).v0(R.string.profile_user_more_info).m(R.attr.vk_ui_background_content).D0(recyclerView, false)).c(new d5j(recyclerView)).q0(true).a0(new wmd0(xahVar, 2)).I0(null);
    }
}
