package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.friends.impl.birthdays.presentation.BirthdaysListFragment;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: BirthdaysListView.kt */
/* loaded from: classes15.dex */
public final class eb7 implements gm50 {
    public final BirthdaysListFragment b;
    public final Context c;
    public final np1 d;
    public final BirthdaysListFragment e;
    public final View f;
    public final CustomSwipeRefreshLayout g;
    public final ViewGroup h;
    public final VkPlaceholder i;
    public final VkPlaceholder j;
    public final RecyclerView k;
    public final ja7 l;
    public final ayn0 m;

    /* JADX WARN: Multi-variable type inference failed */
    public eb7(BirthdaysListFragment birthdaysListFragment, Context context, BirthdaysListFragment birthdaysListFragment2, np1 np1Var) {
        this.b = birthdaysListFragment;
        this.c = context;
        this.d = np1Var;
        this.e = birthdaysListFragment2;
        View inflate = LayoutInflater.from(context).inflate(R.layout.birthdays_list_fragment, (ViewGroup) null);
        this.f = inflate;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) inflate.findViewById(R.id.content_state_container);
        this.g = customSwipeRefreshLayout;
        this.h = (ViewGroup) inflate.findViewById(R.id.loading_state_container);
        this.i = (VkPlaceholder) inflate.findViewById(R.id.error_state_container);
        this.j = (VkPlaceholder) inflate.findViewById(R.id.empty_state_container);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.birthdays_list_recycler);
        this.k = recyclerView;
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        AppBarShadowView appBarShadowView = (AppBarShadowView) inflate.findViewById(R.id.shadow);
        ja7 ja7Var = new ja7(np1Var);
        this.l = ja7Var;
        kf90 kf90Var = new kf90(new im0(this, 10));
        this.m = new ayn0(recyclerView, null, 28);
        appBarShadowView.setSeparatorAllowed(true);
        customSwipeRefreshLayout.setOnRefreshListener(new j7(this, 6));
        recyclerView.setAdapter(ja7Var);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.addOnScrollListener(new ef90(kf90Var));
        a();
        vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), tq.h(tlo0.Companion, R.string.vk_accessibility_back), new com.vk.movika.sdk.base.logic.processor.actions.d(this, 4), null, null, 56));
        tlo0.f fVar = new tlo0.f(R.string.birthdays_list_fragment_title);
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(fVar, null, null, null, null, 30), cVar, objArr2, objArr, 14));
        h3p0.d(birthdaysListFragment, vkTopBar);
    }

    public final void a() {
        zoo zooVar = new zoo(R.attr.vk_ui_background_content);
        RecyclerView recyclerView = this.k;
        recyclerView.setBackground(new InsetDrawable((Drawable) zooVar, recyclerView.getPaddingLeft(), 0, recyclerView.getPaddingRight(), 0));
        this.m.b();
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.e;
    }
}
