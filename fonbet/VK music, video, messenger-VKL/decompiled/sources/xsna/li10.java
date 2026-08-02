package xsna;

import android.app.ProgressDialog;
import android.location.Location;
import androidx.appcompat.app.d;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MaskGeo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import xsna.bi10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class li10 implements izs {
    public final /* synthetic */ Mask b;
    public final /* synthetic */ MasksWrap c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ProgressDialog e;

    public /* synthetic */ li10(Mask mask, MasksWrap masksWrap, int i, ProgressDialog progressDialog) {
        this.b = mask;
        this.c = masksWrap;
        this.d = i;
        this.e = progressDialog;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        int i = MasksWrap.e0;
        Mask mask = this.b;
        MaskGeo maskGeo = mask.r;
        MasksWrap masksWrap = this.c;
        if (location == null || maskGeo == null || !maskGeo.zb(location)) {
            d.a aVar = new d.a(masksWrap.getContext());
            aVar.c(R.string.mask_wrong_location);
            aVar.j(masksWrap.getContext().getString(R.string.ok).toUpperCase(Locale.ROOT), null);
            aVar.m();
        } else {
            masksWrap.getMasksController().e.add(mask);
            Iterator it = ((ArrayList) masksWrap.N.y0()).iterator();
            while (it.hasNext()) {
                bi10 bi10Var = (bi10) it.next();
                bi10.d dVar = bi10Var instanceof bi10.d ? (bi10.d) bi10Var : null;
                if (dVar != null) {
                    Mask mask2 = dVar.a;
                    if (mask2.Fb() && !masksWrap.getMasksController().h(mask2) && mask2.r.zb(location)) {
                        masksWrap.getMasksController().e.add(mask2);
                    }
                }
            }
            masksWrap.x(this.d, mask, false);
        }
        ProgressDialog progressDialog = this.e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        return s3q0.a;
    }
}
