package xsna;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PodcastPageErrorViewController.kt */
/* loaded from: classes3.dex */
public final class cib0 {
    public final View a;
    public final KidsModeRestrictionRenderer b;
    public final gjb0 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new nh0(29));
    public final uj40 e;
    public final ComposeView f;

    public cib0(View view, KidsModeRestrictionRenderer kidsModeRestrictionRenderer, gjb0 gjb0Var, a040 a040Var) {
        this.a = view;
        this.b = kidsModeRestrictionRenderer;
        this.c = gjb0Var;
        uj40 uj40Var = (uj40) view.findViewById(R.id.podcast_music_error_view);
        uj40Var.d(new by20(this, 14), a040Var);
        int a = e3m.a(R.dimen.catalog_tab_2_layout_height, uj40Var.getRootView().getContext());
        View findViewById = uj40Var.findViewById(R.id.error_content);
        f4m.y(a, findViewById);
        f4m.v(0, findViewById);
        this.e = uj40Var;
        this.f = (ComposeView) view.findViewById(R.id.podcast_music_error_compose_view);
    }

    public final void a() {
        bwt0.p0(this.a, false);
        bwt0.p0(this.e, false);
        bwt0.p0(this.f, false);
    }
}
