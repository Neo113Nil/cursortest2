package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: StatView.kt */
/* loaded from: classes16.dex */
public final class xsk0 extends FrameLayout implements prk0 {
    public final RecyclerView b;
    public ork0 c;
    public final VkScreenSpinner d;
    public final ViewGroup e;

    public xsk0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.live_stat_view, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.live_viewers_recycler);
        this.b = recyclerView;
        this.d = (VkScreenSpinner) findViewById(R.id.live_viewers_progress);
        View findViewById = findViewById(R.id.live_stat_placeholder);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) findViewById;
        vkPlaceholder.setMode(VkPlaceholder.Mode.Primary);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(null, new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.default_network_error)), 1));
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vk_retry), (gzs) new ofc0(this, 10), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, 284), null, null, null, 8));
        this.e = (ViewGroup) findViewById;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setMinimumHeight(iah0.f().heightPixels / 2);
    }

    @Override // xsna.prk0
    public final void I() {
        this.e.setVisibility(8);
        this.d.setVisibility(0);
    }

    @Override // xsna.prk0
    public final void g0() {
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.prk0
    public final void i0() {
        this.e.setVisibility(8);
        this.d.setVisibility(8);
    }

    @Override // xsna.prk0
    public void setupAdapter(RecyclerView.Adapter<RecyclerView.e0> adapter) {
        RecyclerView recyclerView = this.b;
        recyclerView.setAdapter(adapter);
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    @Override // xsna.rr6
    public ork0 getPresenter() {
        return this.c;
    }

    @Override // xsna.rr6
    public void setPresenter(ork0 ork0Var) {
        this.c = ork0Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.rr6
    public final void pause() {
    }

    @Override // xsna.rr6
    public final void release() {
    }

    @Override // xsna.rr6
    public final void resume() {
    }
}
