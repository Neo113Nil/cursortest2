package defpackage;

import android.view.View;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class kxm implements iqj0 {
    public final iqj0 a;
    public final dvm b;
    public boolean c;

    public kxm(iqj0 iqj0Var, dvm dvmVar) {
        this.a = iqj0Var;
        this.b = dvmVar;
    }

    @Override // defpackage.iqj0
    public final void a(View view) {
        if (this.c) {
            dvm dvmVar = this.b;
            x770 x770Var = dvmVar.b;
            pex0 m = ((k) dvmVar.a).m();
            String str = m != null ? m.b : null;
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
            }
            x770Var.a.a("Preorder.BackButtonTapped", hashMap, 1, new HashMap());
        }
        this.a.a(view);
    }
}
