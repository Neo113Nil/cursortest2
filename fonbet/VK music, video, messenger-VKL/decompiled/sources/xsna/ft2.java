package xsna;

import android.content.DialogInterface;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;

/* compiled from: Announce.java */
/* loaded from: classes3.dex */
public final class ft2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ qpb b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ gt2 d;

    public ft2(gt2 gt2Var, qpb qpbVar, ArrayList arrayList) {
        this.d = gt2Var;
        this.b = qpbVar;
        this.c = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        qpb qpbVar = this.b;
        if (qpbVar != null) {
            String str = (String) this.c.get(i);
            str.getClass();
            if (str.equals(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                qpbVar.S0(this.d.d.j);
            }
        }
    }
}
