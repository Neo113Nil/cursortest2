package xsna;

import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.h7u0;

/* compiled from: Announce.java */
/* loaded from: classes3.dex */
public final class et2 implements View.OnClickListener {
    public final /* synthetic */ gt2 b;

    public et2(gt2 gt2Var) {
        this.b = gt2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gt2 gt2Var = this.b;
        if (gt2Var.g) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            qpb qpbVar = gt2Var.e.get();
            arrayList.add(gt2Var.getContext().getString(R.string.live_announce_menu_goto_profile));
            arrayList2.add(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            androidx.appcompat.app.d dVar = gt2Var.f;
            if (dVar != null) {
                dVar.dismiss();
                gt2Var.f = null;
            }
            h7u0.a aVar = new h7u0.a(gt2Var.getContext());
            aVar.T((CharSequence[]) arrayList.toArray(new String[0]), new ft2(gt2Var, qpbVar, arrayList2));
            gt2Var.f = aVar.m();
        }
    }
}
