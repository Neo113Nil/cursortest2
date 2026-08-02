package xsna;

import com.vk.pin.views.keyboard.PinKeyboardView;

/* compiled from: PinDigitKey.kt */
/* loaded from: classes3.dex */
public final class vla0 extends sf6<PinKeyboardView.a> {
    public final String b;

    public vla0(dgy dgyVar, String str) {
        super(dgyVar);
        this.b = str;
    }

    @Override // xsna.sf6
    public final void a(PinKeyboardView.a aVar) {
        if (aVar != null) {
            aVar.s(this.b);
        }
    }
}
