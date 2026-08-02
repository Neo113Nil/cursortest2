package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests.IntercityDashboardChipsView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests.b;

/* loaded from: classes14.dex */
public final class dbw extends kr31 implements xv5 {
    public final IntercityDashboardChipsView d;
    public g18 e;
    public final /* synthetic */ b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbw(b bVar, IntercityDashboardChipsView intercityDashboardChipsView) {
        super(intercityDashboardChipsView);
        this.f = bVar;
        this.d = intercityDashboardChipsView;
    }

    @Override // defpackage.xv5
    public final void c(Object obj) {
        final nbw nbwVar = (nbw) obj;
        String str = nbwVar.a;
        IntercityDashboardChipsView intercityDashboardChipsView = this.d;
        intercityDashboardChipsView.setTitle(str);
        intercityDashboardChipsView.setSelected(nbwVar.c);
        intercityDashboardChipsView.updateColors();
        String str2 = nbwVar.b;
        boolean z = (str2 == null || str2.length() == 0) ? false : true;
        intercityDashboardChipsView.getImageView().setVisibility(z ? 0 : 8);
        final b bVar = this.f;
        if (z) {
            g18 g18Var = this.e;
            if (g18Var != null) {
                g18Var.cancel();
            }
            nac nacVar = (nac) bVar.f.a(intercityDashboardChipsView.getImageView());
            nacVar.i = new tzt(21, this);
            this.e = nacVar.b(new obv(str2, null, 6, 0));
        }
        intercityDashboardChipsView.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests.a
            @Override // java.lang.Runnable
            public final void run() {
                ((IntercityDashboardCommentSuggestsModalView$itemAdapter$1) b.this.g).invoke(nbwVar);
            }
        });
    }
}
