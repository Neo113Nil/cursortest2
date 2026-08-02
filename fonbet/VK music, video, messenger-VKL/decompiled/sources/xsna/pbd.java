package xsna;

import android.view.View;
import com.vk.newsfeed.impl.views.NoSwipePaginatedView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pbd implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ pbd(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                gzsVar.invoke();
                break;
            default:
                int i2 = NoSwipePaginatedView.P;
                gzsVar.invoke();
                break;
        }
    }
}
