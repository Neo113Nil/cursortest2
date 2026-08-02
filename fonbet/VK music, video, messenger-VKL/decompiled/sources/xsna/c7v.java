package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;

/* compiled from: VhHints.kt */
/* loaded from: classes2.dex */
public final class c7v extends RecyclerView.e0 {
    public final mkr0 l;
    public final ImAvatarView m;
    public final TextView n;
    public final ImageView o;
    public final DisplayNameFormatter p;

    public c7v(View view, mkr0 mkr0Var) {
        super(view);
        this.l = mkr0Var;
        this.m = (ImAvatarView) view.findViewById(R.id.vkim_avatar);
        this.n = (TextView) view.findViewById(R.id.vkim_name);
        this.o = (ImageView) view.findViewById(R.id.vkim_verified);
        this.p = new DisplayNameFormatter(null, 2, "…");
    }
}
