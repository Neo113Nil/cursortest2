package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.domain.unreadcount.d;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import com.yandex.messaging.ui.badges.MarkedBadgeImageView;

/* loaded from: classes15.dex */
public final class p5b0 extends x0 {
    public final d N;
    public final ike O;
    public final AvatarImageView P;
    public final TextView Q;
    public final TextView R;
    public final MarkedBadgeImageView S;
    public final int T;

    public p5b0(View view, vse vseVar, d dVar) {
        super(view);
        this.N = dVar;
        this.O = vseVar.c(true);
        this.P = (AvatarImageView) view.findViewById(e9h0.organization_avatar);
        this.Q = (TextView) view.findViewById(e9h0.organization_name);
        this.R = (TextView) view.findViewById(e9h0.unread_counter);
        this.S = (MarkedBadgeImageView) view.findViewById(e9h0.guest_badge);
        this.T = fxa1.c(jng0.messagingCommonAccentColor, view.getContext()).data;
    }
}
