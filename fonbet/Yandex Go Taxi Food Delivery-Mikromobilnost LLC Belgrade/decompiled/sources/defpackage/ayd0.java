package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.yandex.dsl.views.d;
import com.yandex.messaging.views.AvatarStackView;

/* loaded from: classes15.dex */
public final class ayd0 extends d {
    public final AvatarStackView w;
    public final TextView x;
    public final View y;
    public final TextView z;

    public ayd0(FragmentActivity fragmentActivity) {
        super(fragmentActivity, olh0.msg_b_poll_recent_voters);
        this.w = (AvatarStackView) this.c.a(e9h0.voters_portraits);
        this.x = (TextView) this.c.a(e9h0.is_anonymous_label);
        this.y = this.c.a(e9h0.separator);
        this.z = (TextView) this.c.a(e9h0.voters_count);
    }
}
