package xsna;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.a;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.newsfeed.posting.geo_picker.presentation.e;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: PlacePickerView.kt */
/* loaded from: classes4.dex */
public final class sra0 implements gm50 {
    public final com.vk.newsfeed.posting.geo_picker.presentation.e b;
    public final e.b c;
    public final uqa0 d;
    public final View e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final View h;
    public final VkErrorView i;
    public final VkText j;
    public final VkErrorView k;
    public final RecyclerView l;
    public final LayoutTransition m;
    public final LayoutTransition n;

    /* JADX WARN: Multi-variable type inference failed */
    public sra0(Context context, com.vk.newsfeed.posting.geo_picker.presentation.e eVar, e.b bVar, uqa0 uqa0Var) {
        this.b = eVar;
        this.c = bVar;
        this.d = uqa0Var;
        View inflate = LayoutInflater.from(context).inflate(R.layout.geo_picker_view, (ViewGroup) null, false);
        this.e = inflate;
        this.f = (ViewGroup) inflate.findViewById(R.id.geo_picker_screen);
        this.g = (ViewGroup) inflate.findViewById(R.id.geo_picker_placeholder_container);
        this.h = inflate.findViewById(R.id.geo_picker_progress);
        VkErrorView vkErrorView = (VkErrorView) inflate.findViewById(R.id.geo_picker_network_error_view);
        this.i = vkErrorView;
        this.j = (VkText) inflate.findViewById(R.id.geo_picker_empty_view);
        VkErrorView vkErrorView2 = (VkErrorView) inflate.findViewById(R.id.geo_picker_permission_error_view);
        this.k = vkErrorView2;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.geo_picker_list);
        this.l = recyclerView;
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.geo_picker_appbar);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        this.m = layoutTransition;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.enableTransitionType(4);
        this.n = layoutTransition2;
        VkTopBar vkTopBar = new VkTopBar(context, null, 6, 0);
        vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_cancel_outline_28), tq.h(tlo0.Companion, R.string.close), new ln20(this, 9), null, null, 56));
        tlo0.f fVar = new tlo0.f(R.string.geo_picker_modal_title);
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(fVar, null, null, null, null, 30), cVar, objArr2, objArr, 14));
        vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
        AppBarLayout.d dVar = new AppBarLayout.d(cn70.b(52));
        dVar.a = 0;
        s3q0 s3q0Var = s3q0.a;
        appBarLayout.addView(vkTopBar, dVar);
        vkErrorView2.c(a(false, new e550(this, 8)));
        vkErrorView.c(a.C0851a.a(context, new s6y(this, 25)));
        recyclerView.setHasFixedSize(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(uqa0Var);
        recyclerView.addOnScrollListener(new rra0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.vk.core.view.components.paging.list.a a(boolean z, gzs gzsVar) {
        Object[] objArr = 0;
        return new com.vk.core.view.components.paging.list.a(null, new VkPlaceholder.b((tlo0) null, (tlo0) tq.h(tlo0.Companion, z ? R.string.geo_picker_device_restriction_title : R.string.geo_picker_permission_title), (com.vk.core.compose.component.semantics.a) (0 == true ? 1 : 0), 11), new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(z ? R.string.geo_picker_device_restriction_button : R.string.geo_picker_permission_button), gzsVar, null, null, null, VkButton.Mode.Tertiary, null, false, null, 1916), (VkPlaceholder.a.C0854a) (objArr == true ? 1 : 0), 6), 1);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
