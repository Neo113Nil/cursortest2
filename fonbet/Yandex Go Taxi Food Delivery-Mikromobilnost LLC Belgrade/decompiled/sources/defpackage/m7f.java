package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.dsl.views.d;

/* loaded from: classes15.dex */
public final class m7f extends d {
    public final View w;
    public final RecyclerView x;
    public final TextView y;

    public m7f(Activity activity) {
        super(activity, olh0.msg_b_create_poll_message);
        this.w = this.c.a(e9h0.btn_back);
        this.x = (RecyclerView) this.c.a(e9h0.recycler_view);
        this.y = (TextView) this.c.a(e9h0.create_poll_btn);
    }
}
