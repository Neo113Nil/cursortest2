package xsna;

import android.content.Context;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ba9 implements izs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ VoipCallSource c;
    public final /* synthetic */ com.vk.im.engine.models.c d;
    public final /* synthetic */ kyv e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ ba9(Context context, VoipCallSource voipCallSource, com.vk.im.engine.models.c cVar, kyv kyvVar, boolean z) {
        this.b = context;
        this.c = voipCallSource;
        this.d = cVar;
        this.e = kyvVar;
        this.f = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.x n;
        Context context = this.b;
        VoipCallSource voipCallSource = this.c;
        com.vk.im.engine.models.c cVar = this.d;
        kyv kyvVar = this.e;
        boolean z = this.f;
        DialogExt dialogExt = (DialogExt) obj;
        Dialog Cb = dialogExt.Cb();
        if (Cb.uc()) {
            if (dialogExt.Cb() != null) {
                n = io.reactivex.rxjava3.core.x.k(dialogExt);
            } else {
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                n = hg1.n(a1wVar.E("DialogBundle", new uqm(dialogExt.f, Source.ACTUAL)).l(new y7(new oce(dialogExt, 16), 17)), context, false, null, 62);
            }
            hg1.i(n, new vd6(context, voipCallSource, cVar, 2));
        } else if (Cb.t1()) {
            kyvVar.d(context, voipCallSource, new UserId(Cb.ac()), z);
        }
        return s3q0.a;
    }
}
