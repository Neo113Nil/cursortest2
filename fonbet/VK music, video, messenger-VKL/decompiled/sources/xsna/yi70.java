package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import xsna.b68;

/* compiled from: NotificationsButtonViewController.kt */
/* loaded from: classes2.dex */
public final class yi70 implements b68.a {
    public final zb70 a;
    public final ImageView b;
    public final TextView c;
    public final View d;
    public final View e;
    public int f;

    public yi70(View view, zb70 zb70Var) {
        this.a = zb70Var;
        ImageView imageView = (ImageView) view.findViewById(R.id.notifications_button);
        this.b = imageView;
        this.c = (TextView) view.findViewById(R.id.counter);
        View findViewById = view.findViewById(R.id.notifications_container);
        this.d = findViewById;
        this.e = view.findViewById(R.id.dot);
        Context context = view.getContext();
        HashSet hashSet = iah0.a;
        if (!fnj.b(context)) {
            bwt0.p0(findViewById, !b68.i());
            b68 b68Var = b68.b;
            b68.e().g.add(new WeakReference<>(this));
        }
        imageView.setImageResource(R.drawable.vk_icon_animated_notification_receive_28_60fps);
        jjc.g(imageView, new k8(24, this, view));
    }

    @Override // xsna.b68.a
    public final void a() {
        bwt0.p0(this.d, !b68.i());
    }
}
