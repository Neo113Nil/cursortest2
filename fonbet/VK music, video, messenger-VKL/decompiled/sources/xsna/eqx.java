package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import xsna.dqx;

/* compiled from: InvitationBroadcastItemVh.kt */
/* loaded from: classes2.dex */
public abstract class eqx<T extends dqx> extends vfz<T> {
    public final izs<Peer, s3q0> l;
    public final AvatarView m;
    public final ImageView n;
    public final TextView o;
    public final TextView p;
    public final ImageView q;
    public final DisplayNameFormatter r;

    /* JADX WARN: Multi-variable type inference failed */
    public eqx(View view, izs<? super Peer, s3q0> izsVar) {
        super(view);
        this.l = izsVar;
        this.m = (AvatarView) this.itemView.findViewById(R.id.avatar);
        this.n = (ImageView) this.itemView.findViewById(R.id.online);
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.q = (ImageView) this.itemView.findViewById(R.id.selected);
        this.r = new DisplayNameFormatter(null, 3, null);
    }

    public abstract boolean h6(T t);

    public abstract Peer i6(T t);

    public final void j6(T t) {
        boolean h6 = h6(t);
        ImageView imageView = this.q;
        if (!h6) {
            imageView.setVisibility(4);
            return;
        }
        if (t.c) {
            imageView.setImageResource(R.drawable.vk_icon_check_circle_on_24);
            imageView.setImageTintList(e3m.c(R.attr.vk_ui_icon_accent, this.itemView.getContext()));
        } else {
            imageView.setImageResource(R.drawable.vk_icon_check_circle_off_24);
            imageView.setImageTintList(e3m.c(R.attr.vk_ui_icon_tertiary, this.itemView.getContext()));
        }
        imageView.setVisibility(0);
    }
}
