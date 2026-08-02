package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.avatar.api.VKAvatarView;
import com.vk.reactions.view.ElevationImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.g6f0;
import xsna.o0r0;

/* compiled from: ReactionHolder.kt */
/* loaded from: classes5.dex */
public final class x0f0 extends RecyclerView.e0 implements View.OnClickListener {
    public static final int t = cn70.b(48);
    public static final int u = cn70.b(20);
    public final VKAvatarView l;
    public final TextView m;
    public final ElevationImageView n;
    public final ImageView o;
    public g6f0.b p;
    public final Object q;
    public final Object r;
    public final Object s;

    public x0f0(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.reaction_user_item, viewGroup, false));
        this.l = (VKAvatarView) this.itemView.findViewById(R.id.reaction_holder_image_avatar);
        this.m = (TextView) this.itemView.findViewById(R.id.reaction_holder_text_user_name);
        ElevationImageView elevationImageView = (ElevationImageView) this.itemView.findViewById(R.id.reaction_holder_image_reaction);
        this.n = elevationImageView;
        this.o = (ImageView) this.itemView.findViewById(R.id.reaction_holder_status_icon);
        iia0 iia0Var = new iia0(viewGroup, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, iia0Var);
        this.r = msy.a(lazyThreadSafetyMode, new lbc0(viewGroup, 10));
        this.s = msy.a(lazyThreadSafetyMode, new myd0(viewGroup, 4));
        this.itemView.setOnClickListener(this);
        elevationImageView.setElevationDp(4.0f);
        elevationImageView.setShadowDy(4.0f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g6f0.b bVar;
        if (jjc.b() || (bVar = this.p) == null) {
            return;
        }
        xwk.e().m(this.itemView.getContext(), bVar.a.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
