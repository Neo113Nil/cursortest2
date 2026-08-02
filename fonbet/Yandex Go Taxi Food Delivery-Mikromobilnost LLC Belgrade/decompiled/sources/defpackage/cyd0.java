package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import com.yandex.messaging.internal.avatar.a;

/* loaded from: classes15.dex */
public final class cyd0 extends x0 {
    public final a N;
    public final ike O;
    public final rp21 P;
    public final AvatarImageView Q;
    public final TextView R;
    public final View S;
    public final View T;
    public pzt0 U;

    public cyd0(View view, a aVar, ike ikeVar, rp21 rp21Var) {
        super(view);
        this.N = aVar;
        this.O = ikeVar;
        this.P = rp21Var;
        AvatarImageView avatarImageView = (AvatarImageView) view.findViewById(e9h0.user_avatar);
        this.Q = avatarImageView;
        TextView textView = (TextView) view.findViewById(e9h0.member_name);
        this.R = textView;
        View findViewById = view.findViewById(e9h0.avatar_placeholder);
        this.S = findViewById;
        View findViewById2 = view.findViewById(e9h0.text_placeholder);
        this.T = findViewById2;
        ai91.c(view.findViewById(e9h0.user_admin), false);
        ai91.c(view.findViewById(e9h0.user_menu), false);
        ai91.f(avatarImageView, false);
        ai91.f(textView, false);
        ai91.c(findViewById, false);
        ai91.c(findViewById2, false);
    }
}
