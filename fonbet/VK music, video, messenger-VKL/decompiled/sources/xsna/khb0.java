package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: PodcastHeaderPopularHolder.kt */
/* loaded from: classes3.dex */
public final class khb0 extends dib0<Boolean> implements View.OnClickListener {
    public final gjb0 n;
    public final View o;

    public khb0(ViewGroup viewGroup, sib0 sib0Var) {
        super(viewGroup, R.layout.music_header_popular_episodes, 0);
        this.n = sib0Var;
        View findViewById = this.itemView.findViewById(R.id.music_show_all_btn);
        this.o = findViewById;
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        bwt0.p0(this.o, ((Boolean) obj).booleanValue());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        this.n.P0();
    }
}
