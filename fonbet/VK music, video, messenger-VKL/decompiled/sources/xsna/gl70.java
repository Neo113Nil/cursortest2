package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKCircleImageView;
import java.util.ArrayList;

/* compiled from: NowAdapter.kt */
/* loaded from: classes3.dex */
public final class gl70 extends RecyclerView.Adapter<RecyclerView.e0> {
    public final kl70 c;
    public final int d = iah0.a(24.0f);
    public final int e = iah0.a(4.0f);
    public final ArrayList<UserProfile> f = new ArrayList<>();

    /* compiled from: NowAdapter.kt */
    public static final class a extends RecyclerView.e0 {
    }

    public gl70(kl70 kl70Var) {
        this.c = kl70Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        UserProfile userProfile = this.f.get(i);
        ((VKCircleImageView) e0Var.itemView).o0(userProfile.h, null);
        e0Var.itemView.setContentDescription(userProfile.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        VKCircleImageView vKCircleImageView = new VKCircleImageView(viewGroup.getContext());
        int i2 = this.d;
        vKCircleImageView.setLayoutParams(new RecyclerView.p(i2, i2));
        int i3 = this.e;
        f4m.t(i3, vKCircleImageView);
        f4m.r(i3, vKCircleImageView);
        vKCircleImageView.setOnClickListener(new t01(this, 5));
        return new a(vKCircleImageView);
    }
}
