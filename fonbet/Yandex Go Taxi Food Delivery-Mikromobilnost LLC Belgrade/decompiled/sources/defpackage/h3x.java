package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final class h3x extends lys {
    public static final /* synthetic */ int S = 0;

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        cca ccaVar = (cca) obj;
        View view = (View) this.R;
        ((ListItemComponent) view).setTitle(ccaVar.a);
        ((ListItemComponent) view).setTrailCompanionText(ccaVar.b);
    }
}
