package sg.bigo.ads.j;

import android.graphics.Rect;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* loaded from: classes9.dex */
public class h extends g {

    @Nullable
    private Button u;

    public h(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, cVar);
    }

    @Override // sg.bigo.ads.j.g
    public final void a(int i) {
        super.a(i);
        Button button = (Button) this.l.findViewById(R.id.inter_btn_cta_main);
        this.u = button;
        if (button != null) {
            button.setVisibility(0);
            float a = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 8);
            this.u.setBackground(sg.bigo.ads.common.utils.e.a(a, a, a, a, (Rect) null, -16724924));
            this.u.setTextColor(sg.bigo.ads.ad.interstitial.d.a);
            sg.bigo.ads.ad.interstitial.b.a.a(this.u);
        }
    }

    @Override // sg.bigo.ads.j.g
    public final void m() {
        super.m();
        if (this.u == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.u);
    }
}
