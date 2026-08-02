package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VkMixIconAdapter.kt */
/* loaded from: classes3.dex */
public final class i4v0 extends o4v0<p830> {
    public final rm0 e;

    public i4v0(rm0 rm0Var) {
        this.e = rm0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new p830(tf3.b(viewGroup, R.layout.item_vk_mix_mood, viewGroup, false), new whe(1, this, i4v0.class, "selectItem", "selectItem(I)V", 0, 16));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        p830 p830Var = (p830) e0Var;
        LottieAnimationView lottieAnimationView = p830Var.n;
        super.onBindViewHolder(p830Var, i, list);
        MixOption mixOption = (MixOption) this.c.get(i);
        Object a0 = j5g.a0(list);
        Boolean bool = a0 instanceof Boolean ? (Boolean) a0 : null;
        if (bool != null ? bool.booleanValue() : false) {
            boolean z = mixOption.f;
            lottieAnimationView.setFrame(z ? 0 : 20);
            lottieAnimationView.setSpeed(z ? 1.0f : -1.0f);
            lottieAnimationView.m0();
            return;
        }
        VKImageView vKImageView = p830Var.o;
        String str = mixOption.d;
        p830Var.m.setText(mixOption.c);
        String str2 = mixOption.e;
        if (str2.length() == 0) {
            bwt0.p0(vKImageView, false);
            vKImageView.clear();
        } else {
            vKImageView.s0(str2);
            bwt0.p0(vKImageView, true);
        }
        lottieAnimationView.setFailureListener(new o830());
        lottieAnimationView.setAnimationFromUrl(str);
        lottieAnimationView.setFrame(mixOption.f ? 20 : 0);
        lottieAnimationView.invalidate();
    }
}
