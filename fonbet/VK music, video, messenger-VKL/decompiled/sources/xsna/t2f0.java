package xsna;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.dto.user.VisibleStatus;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.reactions.view.ElevationImageView;
import com.vk.reactions.view.avatar.ClipsAvatarViewContainer;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import xsna.g6f0;
import xsna.kr5;

/* compiled from: ReactionsAdapter.kt */
/* loaded from: classes5.dex */
public final class t2f0 extends zoj0<g6f0, RecyclerView.e0> implements c.i {
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public int e;

    static {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        f = atomicInteger.incrementAndGet();
        g = atomicInteger.incrementAndGet();
        h = atomicInteger.incrementAndGet();
        i = atomicInteger.incrementAndGet();
    }

    public t2f0() {
        this(new ListDataSet());
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return getItemCount() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i2) {
        g6f0 g6f0Var = (g6f0) this.c.c(i2);
        if (g6f0Var instanceof g6f0.b) {
            return ((g6f0.b) g6f0Var).a.c.b;
        }
        if (!(g6f0Var instanceof g6f0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((g6f0.a) g6f0Var).getClass();
        return Integer.hashCode(0) + 10000000000L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i2) {
        g6f0 g6f0Var = (g6f0) this.c.c(i2);
        if (g6f0Var instanceof g6f0.a) {
            return f;
        }
        if (g6f0Var instanceof g6f0.b) {
            return i;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i2) {
        VisibleStatus visibleStatus;
        g6f0 g6f0Var = (g6f0) this.c.c(i2);
        if ((e0Var instanceof x0f0) && (g6f0Var instanceof g6f0.b)) {
            x0f0 x0f0Var = (x0f0) e0Var;
            g6f0.b bVar = (g6f0.b) g6f0Var;
            ElevationImageView elevationImageView = x0f0Var.n;
            ImageView imageView = x0f0Var.o;
            x0f0Var.p = bVar;
            ReactionUserProfile reactionUserProfile = bVar.a;
            x0f0Var.m.setText(reactionUserProfile.e);
            ReactionMeta reactionMeta = reactionUserProfile.h0;
            if (reactionUserProfile.i0) {
                imageView.setImageDrawable((Drawable) x0f0Var.q.getValue());
                bwt0.p0(elevationImageView, false);
                bwt0.p0(imageView, true);
            } else if (reactionMeta != null) {
                elevationImageView.load(reactionMeta.e(x0f0.u));
                bwt0.p0(elevationImageView, true);
                bwt0.p0(imageView, false);
            } else {
                bwt0.p0(elevationImageView, false);
                if (!reactionUserProfile.n.Ab()) {
                    double d = reactionUserProfile.c.b;
                    if (d >= -2.0E9d && d < 2.0E9d) {
                        OnlineInfo onlineInfo = reactionUserProfile.n;
                        visibleStatus = onlineInfo instanceof VisibleStatus ? (VisibleStatus) onlineInfo : null;
                        imageView.setImageDrawable((visibleStatus == null || visibleStatus.e != Platform.MOBILE) ? (Drawable) x0f0Var.r.getValue() : (Drawable) x0f0Var.s.getValue());
                        bwt0.p0(imageView, true);
                    }
                }
                bwt0.p0(imageView, false);
            }
            int i3 = reactionUserProfile.C() ? R.drawable.group_placeholder : R.drawable.user_placeholder_icon;
            VKAvatarView vKAvatarView = x0f0Var.l;
            kr5.a aVar = new kr5.a(new dqz0(reactionUserProfile));
            aVar.b(i3);
            s3q0 s3q0Var = s3q0.a;
            vKAvatarView.Y0(aVar.a());
            return;
        }
        if (!(e0Var instanceof h0f0) || !(g6f0Var instanceof g6f0.b)) {
            if ((e0Var instanceof zwu) && (g6f0Var instanceof g6f0.a)) {
                ((zwu) e0Var).V5(g6f0Var);
                return;
            }
            return;
        }
        h0f0 h0f0Var = (h0f0) e0Var;
        g6f0.b bVar2 = (g6f0.b) g6f0Var;
        ImageView imageView2 = h0f0Var.o;
        ElevationImageView elevationImageView2 = h0f0Var.n;
        ElevationImageView elevationImageView3 = h0f0Var.q;
        h0f0Var.r = bVar2;
        ReactionUserProfile reactionUserProfile2 = bVar2.a;
        h0f0Var.m.setText(reactionUserProfile2.e);
        ReactionMeta reactionMeta2 = reactionUserProfile2.h0;
        if (reactionUserProfile2.i0) {
            elevationImageView3.setImageDrawable((hny) h0f0Var.s.getValue());
            bwt0.p0(elevationImageView3, true);
            bwt0.p0(elevationImageView2, false);
            bwt0.p0(imageView2, false);
        } else if (reactionMeta2 != null) {
            elevationImageView2.load(reactionMeta2.e(h0f0.t));
            bwt0.p0(elevationImageView2, true);
            bwt0.p0(imageView2, false);
            bwt0.p0(elevationImageView3, false);
        } else {
            bwt0.p0(elevationImageView2, false);
            bwt0.p0(elevationImageView3, false);
            if (!reactionUserProfile2.n.Ab()) {
                double d2 = reactionUserProfile2.c.b;
                if (d2 >= -2.0E9d && d2 < 2.0E9d) {
                    OnlineInfo onlineInfo2 = reactionUserProfile2.n;
                    visibleStatus = onlineInfo2 instanceof VisibleStatus ? (VisibleStatus) onlineInfo2 : null;
                    imageView2.setImageDrawable(m33.a((visibleStatus == null || visibleStatus.e != Platform.MOBILE) ? R.drawable.ic_online_web_composite_16 : R.drawable.ic_online_mobile_vkapp_composite_16, imageView2.getContext()));
                    bwt0.p0(imageView2, true);
                }
            }
            bwt0.p0(imageView2, false);
        }
        int i4 = reactionUserProfile2.C() ? R.drawable.group_placeholder : R.drawable.user_placeholder_icon;
        ClipsAvatarViewContainer clipsAvatarViewContainer = h0f0Var.l;
        kr5.a aVar2 = new kr5.a(new dqz0(reactionUserProfile2));
        aVar2.b(i4);
        s3q0 s3q0Var2 = s3q0.a;
        clipsAvatarViewContainer.c(aVar2.a());
        h0f0Var.p.setContentDescription(reactionUserProfile2.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 == f) {
            return new zwu(viewGroup);
        }
        if (i2 == g) {
            return new x0f0(viewGroup);
        }
        if (i2 == i) {
            return new h0f0(viewGroup);
        }
        if (i2 == h) {
            return new urn(tf3.b(viewGroup, R.layout.reactions_divider_item, viewGroup, false));
        }
        throw new IllegalStateException(lhg.a(i2, "Unsupported view type: "));
    }

    public t2f0(ListDataSet<g6f0> listDataSet) {
        super(listDataSet);
        this.e = 1;
        setHasStableIds(true);
    }
}
