package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReactionListAdapter.kt */
/* loaded from: classes2.dex */
public final class f1f0 extends RecyclerView.Adapter<c1f0> {
    public final RecyclerView c;
    public final zaw d;
    public final List<yaw> e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final com.vk.im.reactions.impl.set_reaction.list.a i;
    public Integer j;
    public final yaw k = new yaw(-1, R.raw.msg_reaction_show_more, R.string.im_msg_reaction_show_more_description, R.color.vk_gray_100, null, null, 496);
    public Integer l;
    public final io.reactivex.rxjava3.disposables.b m;

    public f1f0(RecyclerView recyclerView, zaw zawVar, List list, boolean z, int i, boolean z2, com.vk.im.reactions.impl.set_reaction.list.a aVar) {
        this.c = recyclerView;
        this.d = zawVar;
        this.e = list;
        this.f = z;
        this.g = i;
        this.h = z2;
        this.i = aVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        recyclerView.addOnAttachStateChangeListener(new e1f0(bVar));
        this.m = bVar;
    }

    public final void Ve(Integer num) {
        Integer num2 = this.l;
        this.l = num;
        int i = -1;
        int i2 = 0;
        List<yaw> list = this.e;
        if (num2 != null) {
            Iterator<yaw> it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (it.next().a == num2.intValue()) {
                    break;
                } else {
                    i3++;
                }
            }
            notifyItemChanged(i3);
        }
        if (num != null) {
            Iterator<yaw> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().a == num.intValue()) {
                    i = i2;
                    break;
                }
                i2++;
            }
            notifyItemChanged(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Integer num = this.j;
        return num != null ? num.intValue() : this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Integer num = this.j;
        if (num != null) {
            int i2 = i + 1;
            if (num != null && i2 == num.intValue()) {
                return 2;
            }
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(c1f0 c1f0Var, int i) {
        c1f0 c1f0Var2 = c1f0Var;
        int i2 = c1f0Var2.o;
        bpn0 bpn0Var = c1f0Var2.s;
        int itemViewType = getItemViewType(i);
        int i3 = 2;
        int i4 = 1;
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            View view = c1f0Var2.itemView;
            ImageButton imageButton = (ImageButton) view;
            view.setContentDescription(view.getContext().getString(R.string.im_msg_reaction_show_more_description));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c1f0Var2.l.h(dhr0.a.c(c1f0Var2.itemView.getContext()) ? R.raw.msg_reaction_show_more_dark : R.raw.msg_reaction_show_more, i2, c1f0Var2.itemView.getContext())});
            layerDrawable.setLayerSize(0, i2, i2);
            imageButton.setImageDrawable(layerDrawable);
            imageButton.setOnClickListener(new yew(i4, c1f0Var2, this.k));
            return;
        }
        List<yaw> list = this.e;
        yaw yawVar = list.get(i);
        int i5 = list.get(i).a;
        Integer num = this.l;
        boolean z = num != null && i5 == num.intValue();
        boolean z2 = c1f0Var2.n;
        ImageButton imageButton2 = (ImageButton) c1f0Var2.itemView;
        bwt0.Q(imageButton2, R.id.reaction_image, Integer.valueOf(yawVar.a));
        View view2 = c1f0Var2.itemView;
        view2.setContentDescription(view2.getContext().getString(R.string.im_msg_reaction_send_description, c1f0Var2.itemView.getContext().getString(yawVar.c)));
        if (z) {
            GradientDrawable a = ful0.a(1);
            a.setColor(l8g.g(c1f0Var2.itemView.getContext().getColor(yawVar.d), 51));
            s3q0 s3q0Var = s3q0.a;
            LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{a, c1f0Var2.V5(c1f0Var2.itemView, yawVar, ((Number) bpn0Var.getValue()).intValue(), z2)});
            layerDrawable2.setLayerSize(0, i2, i2);
            layerDrawable2.setLayerSize(1, ((Number) bpn0Var.getValue()).intValue(), ((Number) bpn0Var.getValue()).intValue());
            layerDrawable2.setLayerGravity(1, 17);
            imageButton2.setImageDrawable(layerDrawable2);
        } else {
            LayerDrawable layerDrawable3 = new LayerDrawable(new ReactionAssetDrawable[]{c1f0Var2.V5(c1f0Var2.itemView, yawVar, i2, z2)});
            layerDrawable3.setLayerSize(0, i2, i2);
            imageButton2.setImageDrawable(layerDrawable3);
        }
        imageButton2.setOnClickListener(new com.vk.movika.sdk.android.defaultplayer.control.d(i3, c1f0Var2, yawVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final c1f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View I = bwt0.I(R.layout.im_set_reaction_item_big_piker, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = I.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i2 = this.g;
        layoutParams.width = i2;
        layoutParams.height = i2;
        I.setLayoutParams(layoutParams);
        return new c1f0(I, this.d, this.m, this.f, this.g, this.h, this.i);
    }
}
