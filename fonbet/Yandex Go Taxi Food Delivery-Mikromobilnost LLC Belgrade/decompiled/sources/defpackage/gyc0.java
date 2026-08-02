package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes10.dex */
public final class gyc0 extends x0 {
    public final TextView N;
    public final TextView O;
    public final ImageView P;
    public final /* synthetic */ PlayerControlView Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyc0(PlayerControlView playerControlView, View view) {
        super(view);
        this.Q = playerControlView;
        if (tw21.a < 26) {
            view.setFocusable(true);
        }
        this.N = (TextView) view.findViewById(i9h0.exo_main_text);
        this.O = (TextView) view.findViewById(i9h0.exo_sub_text);
        this.P = (ImageView) view.findViewById(i9h0.exo_icon);
        view.setOnClickListener(new d5b0(5, this));
    }
}
