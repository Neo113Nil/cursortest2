package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: SelectionStickerViewWrapper.kt */
/* loaded from: classes16.dex */
public final class efi0 implements tb0 {
    public final /* synthetic */ dfi0 b;

    public efi0(dfi0 dfi0Var) {
        this.b = dfi0Var;
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        ArrayList parcelableArrayList;
        Uri uri;
        if (i2 == -1 && i == 167) {
            dfi0 dfi0Var = this.b;
            dfi0Var.e.hide();
            if (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null || (uri = (Uri) j5g.a0(parcelableArrayList)) == null) {
                return;
            }
            io.reactivex.rxjava3.internal.operators.single.k c = cug0.c(mcr0.i(uri, 1080, 1920, 94848, null, null).m0(), dfi0Var.a, new gtl(4), null, new i8c0(6), 16);
            asu0 asu0Var = asu0.a;
            asu0Var.getClass();
            ver0.a(new io.reactivex.rxjava3.internal.operators.single.p(c.q(asu0.k()).m(asu0Var.d()), new shd(dfi0Var, 5)).subscribe(new m1r(new k22(21, uri, dfi0Var), 27), new n1r(new av70(14), 20)));
        }
    }
}
