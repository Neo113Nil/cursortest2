package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: StoryGeoLocationRestrictionsHolder.kt */
/* loaded from: classes6.dex */
public final class l3m0 extends hf6<m3m0> {
    public final a m;
    public final View n;

    public l3m0(View view, t3m0 t3m0Var) {
        super(view);
        this.m = t3m0Var;
        View findViewById = this.itemView.findViewById(R.id.button);
        this.n = findViewById;
        jjc.g(findViewById, new hij0(this, 3));
    }

    @Override // xsna.hf6
    public final /* bridge */ /* synthetic */ void W5(m3m0 m3m0Var) {
    }

    /* compiled from: StoryGeoLocationRestrictionsHolder.kt */
    public interface a {
        default void c() {
        }
    }
}
