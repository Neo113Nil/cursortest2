package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: ModalAddPhotoActionView.kt */
/* loaded from: classes3.dex */
public final class ev20 extends FrameLayout {
    public final RecyclerView b;
    public final View c;
    public dm1 d;
    public gzs<s3q0> e;
    public boolean f;

    /* compiled from: ModalAddPhotoActionView.kt */
    public final class a extends RecyclerView.Adapter<vif0<?>> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(vif0<?> vif0Var, int i) {
            vif0Var.i6(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final vif0<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
            dv20 dv20Var = new dv20(viewGroup, R.layout.view_add_album_button, 0);
            dv20Var.itemView.setOnClickListener(new yg1(ev20.this, 6));
            return dv20Var;
        }
    }

    public ev20(FragmentActivity fragmentActivity) {
        super(fragmentActivity, null, 0);
        RecyclerView recyclerView = new RecyclerView(fragmentActivity);
        this.b = recyclerView;
        this.f = true;
        float f = 10;
        recyclerView.setPadding(iah0.a(f), 0, iah0.a(f), 0);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.x = new bv20();
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new cv20());
        addView(recyclerView);
        View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.empty_albums_list_stub, (ViewGroup) this, false);
        this.c = inflate;
        inflate.setVisibility(8);
        inflate.findViewById(R.id.action_button).setOnClickListener(new bg0(this, 7));
        addView(inflate);
    }

    public final void a(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
        this.b.setVisibility(z ? 8 : 0);
    }

    public final dm1 getAlbumsAdapter() {
        return this.d;
    }

    public final View getEmptyStub() {
        return this.c;
    }

    public final boolean getNeedShowStub() {
        return this.f;
    }

    public final gzs<s3q0> getOnAddAlbumClick() {
        return this.e;
    }

    public final RecyclerView getRecyclerView() {
        return this.b;
    }

    public final void setAdapter(dm1 dm1Var) {
        this.d = dm1Var;
        d920 d920Var = new d920();
        d920Var.x0(new a());
        d920Var.x0(dm1Var);
        this.b.setAdapter(d920Var);
        if (this.f) {
            a(dm1Var.E0() == 0);
        }
    }

    public final void setAlbumsAdapter(dm1 dm1Var) {
        this.d = dm1Var;
    }

    public final void setNeedShowStub(boolean z) {
        this.f = z;
    }

    public final void setOnAddAlbumClick(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }
}
