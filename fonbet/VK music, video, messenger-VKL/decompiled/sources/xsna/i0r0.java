package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;

/* compiled from: SelectionPreviewVhOld.kt */
/* loaded from: classes2.dex */
public final class i0r0 extends RecyclerView.e0 {
    public final gei0 l;
    public final ImAvatarView m;
    public final View n;
    public final TextView o;
    public ldi0 p;

    public i0r0(View view, gei0 gei0Var) {
        super(view);
        this.l = gei0Var;
        this.m = (ImAvatarView) view.findViewById(R.id.vkim_avatar);
        View findViewById = view.findViewById(R.id.vkim_close_btn);
        this.n = findViewById;
        this.o = (TextView) view.findViewById(R.id.vkim_name);
        jjc.g(findViewById, new rtg0(this, 12));
    }
}
