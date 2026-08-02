package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.dto.geo.GeoLocation;
import com.vkontakte.android.R;

/* compiled from: StoryGeoPlaceHolder.kt */
/* loaded from: classes6.dex */
public final class u3m0 extends hf6<v3m0> {
    public final a m;
    public final TextView n;
    public final TextView o;

    /* compiled from: StoryGeoPlaceHolder.kt */
    public interface a {
        void f(GeoLocation geoLocation);
    }

    public u3m0(View view, t3m0 t3m0Var) {
        super(view);
        this.m = t3m0Var;
        this.n = (TextView) this.itemView.findViewById(R.id.place_name);
        this.o = (TextView) this.itemView.findViewById(R.id.place_info);
        jjc.g(view, new wug0(this, 9));
    }

    @Override // xsna.hf6
    public final void W5(v3m0 v3m0Var) {
        v3m0 v3m0Var2 = v3m0Var;
        this.n.setText(v3m0Var2.a.i);
        ey2.i(this.o, v3m0Var2.b);
    }
}
