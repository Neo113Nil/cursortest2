package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;

/* compiled from: PostingBannerView.kt */
/* loaded from: classes4.dex */
public final class hdc0 implements jk6 {
    public u04 b;
    public View c;
    public TextView d;
    public TextView e;
    public final gdc0 f = new gdc0();

    public final void b(boolean z, boolean z2) {
        if (z2) {
            View view = this.c;
            ViewParent parent = view != null ? view.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                zmp0.a(viewGroup, null);
            }
        }
        View view2 = this.c;
        if (view2 != null) {
            bwt0.p0(view2, z);
        }
    }

    @Override // xsna.jk6
    public final void d3(View view) {
        this.c = view.findViewById(R.id.posting_banner);
        this.d = (TextView) view.findViewById(R.id.posting_banner_info);
        this.e = (TextView) view.findViewById(R.id.posting_banner_button);
        View findViewById = view.findViewById(R.id.posting_banner_close);
        if (findViewById != null) {
            bwt0.i0(findViewById, new r820(this, 13));
        }
        l7v b = pla.e().b();
        HintId hintId = HintId.FEED_COMPACT_ATTACHMENTS_ONBOARDING;
        boolean a = b.a(hintId.getId());
        b(a, false);
        if (a) {
            Hint p = pla.e().b().p(hintId.getId());
            TextView textView = this.d;
            gdc0 gdc0Var = this.f;
            if (textView != null) {
                textView.setText(gdc0Var.a(p != null ? p.c : null));
            }
            TextView textView2 = this.e;
            if (textView2 != null) {
                textView2.setText(gdc0Var.a(p != null ? p.d : null));
            }
        }
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
    }
}
