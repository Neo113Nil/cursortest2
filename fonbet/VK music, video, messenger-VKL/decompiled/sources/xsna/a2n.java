package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import com.vk.camera.editor.common.cadre.CadreTarget;
import com.vkontakte.android.R;

/* compiled from: DiscoverErrorLoadStoryView.kt */
/* loaded from: classes6.dex */
public final class a2n implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ b2n b;

    public a2n(b2n b2nVar) {
        this.b = b2nVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b2n b2nVar = this.b;
        b2nVar.getViewTreeObserver().removeOnPreDrawListener(this);
        kz8 kz8Var = b2nVar.e.j;
        iz8 b = kz8.b(kz8Var, b2nVar, kz8Var.a(b2nVar.getContext()), CadreTarget.VIEWER, 8);
        View findViewById = b2nVar.findViewById(R.id.background_discover_error);
        f4m.o(b.a, b.b, findViewById);
        hz8 c = b2nVar.e.j.c(b);
        findViewById.setTranslationY(b.c);
        findViewById.setOutlineProvider(c);
        return false;
    }
}
