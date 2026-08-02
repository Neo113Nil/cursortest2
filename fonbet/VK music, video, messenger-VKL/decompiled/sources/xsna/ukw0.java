package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.voip.calls.join.impl.presentation.link.bypassword.VoipCallsJoinToCallByPasswordActivity;
import kotlin.NoWhenBranchMatchedException;
import xsna.dlw0;
import xsna.elw0;
import xsna.ykw0;

/* compiled from: VoipCallsJoinRouterImpl.kt */
/* loaded from: classes7.dex */
public final class ukw0 implements tkw0 {
    @Override // xsna.tkw0
    public final void a(Context context, dlw0 dlw0Var, zlt zltVar) {
        elw0 aVar;
        int i = ykw0.j1;
        if (dlw0Var instanceof dlw0.b) {
            aVar = elw0.b.a;
        } else {
            if (!(dlw0Var instanceof dlw0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new elw0.a(((dlw0.a) dlw0Var).a);
        }
        xyt xytVar = zltVar != null ? new xyt((gzs) zltVar.b, (gzs) zltVar.c, (Bundle) zltVar.d) : null;
        new ykw0.a(context, aVar, xytVar != null ? (Bundle) xytVar.c : null).X(new u7v0(xytVar, 4)).a0(new pis0(xytVar, 18)).I0("VoipCallsJoinToCallByPasswordModalDialog");
    }

    @Override // xsna.tkw0
    public final void b(Context context, dlw0.a aVar) {
        int i = VoipCallsJoinToCallByPasswordActivity.z;
        String str = aVar.a;
        Intent intent = new Intent(context, (Class<?>) VoipCallsJoinToCallByPasswordActivity.class);
        intent.putExtra("vk_join_link", str);
        context.startActivity(intent);
    }
}
