package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.voip.invite.AnonymCallInviteFragment;
import xsna.x89;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class nt2 implements izs {
    public final /* synthetic */ pt2 b;
    public final /* synthetic */ s89 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public /* synthetic */ nt2(pt2 pt2Var, s89 s89Var, boolean z, String str) {
        this.b = pt2Var;
        this.c = s89Var;
        this.d = z;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [xsna.lt2] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        final pt2 pt2Var = this.b;
        boolean z = pt2Var.p;
        pt2Var.p = false;
        boolean z2 = th instanceof VKApiExecutionException;
        final boolean z3 = this.d;
        if (z2 && ((VKApiExecutionException) th).s() == 960) {
            ((frw0) pt2Var.r.getValue()).a();
            Context context = pt2Var.i;
            final s89 s89Var = this.c;
            smw0.a(context, new izs() { // from class: xsna.ot2
                /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
                @Override // xsna.izs
                public final Object invoke(Object obj2) {
                    ((dw20) obj2).tn();
                    pt2 pt2Var2 = pt2.this;
                    AnonymCallInviteFragment.a aVar = pt2Var2.q;
                    if (aVar != null) {
                        AnonymCallInviteFragment anonymCallInviteFragment = aVar.a;
                        Intent intent = new Intent();
                        String string = anonymCallInviteFragment.requireArguments().getString("vkJoinLink");
                        if (string == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        intent.putExtra("proceedToCallJoinAfterAuth", string);
                        s3q0 s3q0Var = s3q0.a;
                        anonymCallInviteFragment.Mf(-1, intent);
                    }
                    ((frw0) pt2Var2.r.getValue()).c(new nzx(z3, s89Var));
                    return s3q0.a;
                }
            });
        } else if (z2 && ((VKApiExecutionException) th).s() == 952 && !z) {
            pt2Var.p = true;
            final String str = this.e;
            pt2Var.Z0(new Runnable() { // from class: xsna.lt2
                @Override // java.lang.Runnable
                public final void run() {
                    pt2 pt2Var2 = pt2.this;
                    x89 x89Var = pt2Var2.o;
                    x89.a aVar = x89Var instanceof x89.a ? (x89.a) x89Var : null;
                    if (aVar == null) {
                        return;
                    }
                    pt2Var2.Y0(str, aVar.a, z3);
                }
            });
        } else {
            j03.l(th);
        }
        return s3q0.a;
    }
}
