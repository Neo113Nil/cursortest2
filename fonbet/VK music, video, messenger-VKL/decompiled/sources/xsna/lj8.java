package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.libvideo.live.impl.broadcast_settings.BroadcastSettingsFragment;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: BroadcastSettingsView.kt */
/* loaded from: classes3.dex */
public final class lj8 implements gm50 {
    public final View b;
    public final ViewGroup c;
    public final CustomSwipeRefreshLayout d;
    public final View e;
    public final ViewGroup f;
    public final VkText g;
    public final View h;
    public final View i;
    public final li8 j;
    public p5h0 k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final f5z o;

    /* JADX WARN: Multi-variable type inference failed */
    public lj8(f5z f5zVar, Context context, BroadcastSettingsFragment.b bVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_broadcast_settings_view, (ViewGroup) null);
        this.b = inflate;
        this.c = (ViewGroup) inflate.findViewById(R.id.container);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.live_broadcast_settings_toolbar);
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) inflate.findViewById(R.id.live_broadcast_settings_recycler_swipe_container);
        this.d = customSwipeRefreshLayout;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.live_broadcast_settings_recycler);
        this.e = inflate.findViewById(R.id.live_broadcast_settings_progress);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.live_broadcast_settings_error_container);
        this.f = viewGroup;
        this.g = (VkText) viewGroup.findViewById(R.id.live_broadcast_settings_error_title);
        View findViewById = viewGroup.findViewById(R.id.live_broadcast_settings_error_button_retry);
        this.h = findViewById;
        View findViewById2 = inflate.findViewById(R.id.live_broadcast_settings_button_save);
        this.i = findViewById2;
        li8 li8Var = new li8(new com.vk.im.ui.fragments.b(bVar, 12), new a8(bVar, 10));
        this.j = li8Var;
        eu1 eu1Var = new eu1(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, eu1Var);
        this.m = msy.a(lazyThreadSafetyMode, new q(this, 8));
        this.n = msy.a(lazyThreadSafetyMode, new zy(this, 11));
        this.o = f5zVar;
        vkTopBar.setBack(new VkTopBar.b(new yg(bVar, 10), tq.h(tlo0.Companion, R.string.vk_accessibility_back), null, null, null, 28));
        tlo0.f fVar = new tlo0.f(R.string.live_broadcast_settings_title);
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(fVar, null, null, null, null, 30), cVar, objArr2, objArr, 14));
        vkTopBar.setShowBottomDivider(true);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(li8Var);
        recyclerView.setHasFixedSize(true);
        customSwipeRefreshLayout.setOnRefreshListener(new e8(bVar, 4));
        bwt0.i0(findViewById2, new sf1(bVar, 10));
        bwt0.i0(findViewById, new com.vk.im.engine.internal.storage.delegates.messages.b(bVar, 13));
    }

    public final void a(p5h0 p5h0Var) {
        if (epx.f(this.k, p5h0Var)) {
            return;
        }
        this.k = p5h0Var;
        a0k0 a0k0Var = new a0k0();
        a0k0Var.addTarget(this.i);
        biq biqVar = new biq();
        biqVar.addTarget(this.d);
        biqVar.addTarget(this.f);
        dnp0 dnp0Var = new dnp0();
        dnp0Var.g(0);
        dnp0Var.c(a0k0Var);
        dnp0Var.c(biqVar);
        zmp0.b(this.c);
        zmp0.d(p5h0Var, dnp0Var);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.o;
    }
}
