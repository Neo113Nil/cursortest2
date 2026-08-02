package xsna;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import com.vkontakte.android.R;
import java.util.Set;
import xsna.uwl0;

/* compiled from: StoryLikeActionVH.kt */
/* loaded from: classes6.dex */
public final class k5m0 extends wwl0 {
    @Override // xsna.cc
    public final void g6(uwl0.a aVar) {
        this.o = aVar;
        super.g6(aVar);
        if (aVar instanceof uwl0.a.AbstractC3841a.d) {
            b6((uwl0.a.AbstractC3841a) aVar);
        }
    }

    @Override // xsna.wwl0, xsna.cc
    /* renamed from: l6 */
    public final void b6(uwl0.a.AbstractC3841a abstractC3841a) {
        super.b6(abstractC3841a);
        if (abstractC3841a instanceof uwl0.a.AbstractC3841a.d) {
            int i = ((uwl0.a.AbstractC3841a.d) abstractC3841a).e ? R.color.vk_red : R.color.vk_white;
            ImageView imageView = this.q;
            imageView.setColorFilter(imageView.getContext().getColor(i), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // xsna.wwl0
    public final void m6(uwl0 uwl0Var) {
        if (uwl0Var instanceof uwl0.a.AbstractC3841a.d) {
            uwl0.a.AbstractC3841a.d dVar = new uwl0.a.AbstractC3841a.d(!((uwl0.a.AbstractC3841a.d) uwl0Var).e);
            b6(dVar);
            Set<View> set = g6z.a;
            boolean z = dVar.e;
            ImageView imageView = this.q;
            g6z.c(imageView, imageView, z, true, 32);
        }
    }
}
