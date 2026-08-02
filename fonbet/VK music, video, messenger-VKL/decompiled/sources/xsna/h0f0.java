package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.reactions.view.ElevationImageView;
import com.vk.reactions.view.avatar.ClipsAvatarViewContainer;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.g6f0;
import xsna.o0r0;

/* compiled from: ReactionCardHolder.kt */
/* loaded from: classes5.dex */
public final class h0f0 extends RecyclerView.e0 implements View.OnClickListener {
    public static final int t = cn70.b(18);
    public final ClipsAvatarViewContainer l;
    public final TextView m;
    public final ElevationImageView n;
    public final ImageView o;
    public final View p;
    public final ElevationImageView q;
    public g6f0.b r;
    public final Object s;

    public h0f0(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.reaction_card_user_item, viewGroup, false));
        this.l = (ClipsAvatarViewContainer) this.itemView.findViewById(R.id.photo);
        this.m = (TextView) this.itemView.findViewById(R.id.title);
        ElevationImageView elevationImageView = (ElevationImageView) this.itemView.findViewById(R.id.reaction);
        this.n = elevationImageView;
        this.o = (ImageView) this.itemView.findViewById(R.id.online);
        View findViewById = this.itemView.findViewById(R.id.reaction_user_clickable);
        this.p = findViewById;
        ElevationImageView elevationImageView2 = (ElevationImageView) this.itemView.findViewById(R.id.reaction_card_user_item_author_like_badge);
        this.q = elevationImageView2;
        this.s = msy.a(LazyThreadSafetyMode.NONE, new u110(viewGroup, 15));
        findViewById.setOnClickListener(this);
        elevationImageView.setElevationDp(4.0f);
        elevationImageView.setShadowDy(4.0f);
        elevationImageView2.setElevationDp(2.0f);
        elevationImageView2.setShadowDy(2.0f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g6f0.b bVar;
        if (jjc.b() || (bVar = this.r) == null) {
            return;
        }
        xwk.e().m(this.itemView.getContext(), bVar.a.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
