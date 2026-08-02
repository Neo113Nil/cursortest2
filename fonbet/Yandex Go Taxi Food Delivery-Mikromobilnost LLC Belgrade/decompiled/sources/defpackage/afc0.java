package defpackage;

import com.yandex.go.design.view.GoImageView;
import com.yandex.go.places.searchbar.impl.ui.searchbar.PlacesSearchbarView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class afc0 implements pec0 {
    public final /* synthetic */ PlacesSearchbarView a;

    public afc0(PlacesSearchbarView placesSearchbarView) {
        this.a = placesSearchbarView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r6 == 0) goto L24;
     */
    @Override // defpackage.eyi0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(yec0 yec0Var) {
        pav pavVar;
        CharSequence charSequence;
        pav pavVar2;
        if (yec0Var instanceof xec0) {
            PlacesSearchbarView placesSearchbarView = this.a;
            RobotoTextView robotoTextView = placesSearchbarView.getBinding().e;
            xec0 xec0Var = (xec0) yec0Var;
            CharSequence charSequence2 = xec0Var.a;
            robotoTextView.setText(charSequence2);
            placesSearchbarView.getBinding().e.setVisibility((charSequence2 == null || charSequence2.length() == 0) ? 8 : 0);
            c.z(new xw90(25, yec0Var, placesSearchbarView), placesSearchbarView);
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            placesSearchbarView.setContentDescription(evu0.k0(charSequence2));
            String str = xec0Var.d;
            if (str != null) {
                pavVar2 = placesSearchbarView.imageLoader;
                ((nac) pavVar2.a(placesSearchbarView.getBinding().d)).b(new qbv(str));
            }
            wec0 wec0Var = xec0Var.e;
            if (wec0Var != null) {
                CharSequence obj = evu0.k0(charSequence2.toString()).toString();
                GoImageView goImageView = placesSearchbarView.getBinding().b;
                pavVar = placesSearchbarView.imageLoader;
                ((nac) pavVar.a(goImageView)).b(new qbv(wec0Var.b));
                c.z(new xw90(26, wec0Var, placesSearchbarView), goImageView);
                CharSequence charSequence3 = wec0Var.c;
                if (charSequence3 != null) {
                    int length = charSequence3.length();
                    charSequence = charSequence3;
                }
                charSequence = null;
                if (charSequence != null) {
                    obj = charSequence;
                }
                goImageView.setContentDescription(obj);
            }
        }
    }
}
