package defpackage;

import android.graphics.drawable.Drawable;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes12.dex */
public final class mtr {
    public final FloatButtonHolderLayout a;
    public final sls b;
    public final sls c;
    public final sls d;
    public RotatableFloatButton e;
    public int f = 255;
    public Integer g;

    public mtr(FloatButtonHolderLayout floatButtonHolderLayout, sls slsVar, sls slsVar2, sls slsVar3) {
        this.a = floatButtonHolderLayout;
        this.b = slsVar;
        this.c = slsVar2;
        this.d = slsVar3;
    }

    public final void a(ptr ptrVar) {
        RotatableFloatButton addFloatButton$default;
        RotatableFloatButton rotatableFloatButton = this.e;
        FloatButtonHolderLayout floatButtonHolderLayout = this.a;
        if (rotatableFloatButton != null) {
            floatButtonHolderLayout.removeFloatButton(rotatableFloatButton);
        }
        if (ptrVar instanceof ntr) {
            Drawable k = bei.k(v2h0.ic_location, floatButtonHolderLayout);
            k.setTint(s8o.m(new bdc(xng0.textMain), floatButtonHolderLayout.getContext()));
            addFloatButton$default = FloatButtonHolderLayout.addFloatButton$default(floatButtonHolderLayout, k, new h60(27, this.d), null, 4, null);
        } else if (!(ptrVar instanceof otr)) {
            w511.b();
            return;
        } else {
            Drawable k2 = bei.k(v2h0.ic_route_info, floatButtonHolderLayout);
            k2.setTint(s8o.m(new bdc(xng0.textMain), floatButtonHolderLayout.getContext()));
            addFloatButton$default = FloatButtonHolderLayout.addFloatButton$default(floatButtonHolderLayout, k2, new h60(28, this.c), null, 4, null);
        }
        this.e = addFloatButton$default;
        Integer a = ptrVar.a();
        if (a != null) {
            int u = tje.u(a.intValue(), floatButtonHolderLayout.getContext());
            RotatableFloatButton rotatableFloatButton2 = this.e;
            if (rotatableFloatButton2 != null) {
                rotatableFloatButton2.setImageSize(u, u);
            }
        }
        Integer num = this.g;
        if (num != null) {
            int intValue = num.intValue();
            RotatableFloatButton rotatableFloatButton3 = this.e;
            if (rotatableFloatButton3 != null) {
                rotatableFloatButton3.setIconBackgroundTint(intValue);
            }
        }
        RotatableFloatButton rotatableFloatButton4 = this.e;
        if (rotatableFloatButton4 != null) {
            rotatableFloatButton4.setIconBackgroundAlpha(this.f);
        }
        RotatableFloatButton rotatableFloatButton5 = this.e;
        if (rotatableFloatButton5 != null) {
            rotatableFloatButton5.setVisibilityAnimated(ptrVar.isVisible());
        }
        this.b.invoke();
    }
}
