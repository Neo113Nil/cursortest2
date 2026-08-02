package xsna;

import androidx.appcompat.app.AppCompatActivity;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: VkMsgListComponent.kt */
/* loaded from: classes2.dex */
public abstract class i5v0 extends j8i {
    public boolean i;

    public abstract a1w X0();

    public abstract vm30 Y0();

    public abstract void Z0(pjm pjmVar);

    public final void a1(Msg msg, Integer num) {
        vm30 Y0 = Y0();
        if (Y0 != null) {
            a1w X0 = X0();
            bzb0 bzb0Var = Y0.d0;
            bzb0Var.a();
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            cbw cbwVar = (cbw) zdwVar.e().b.getValue();
            long j = msg.c;
            int i = msg.d;
            tze0 tze0Var = new tze0(X0, j, i, num != null ? num.intValue() : 0);
            io.reactivex.rxjava3.internal.operators.single.c C = X0.C(tze0Var, new vst(j, i));
            asu0 asu0Var = asu0.a;
            C.q(asu0Var.c()).m(asu0Var.d()).subscribe(new j3z(new r820(tze0Var, 18), 16), new lw30(new rxz(tze0Var, 20), 10));
            mze0 mze0Var = new mze0(cbwVar, tze0Var);
            bzb0Var.h = mze0Var;
            mze0Var.Td(((AppCompatActivity) e3m.h(bzb0Var.a)).getSupportFragmentManager(), "CurrentBottomSheet");
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
