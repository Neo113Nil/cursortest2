package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.opz;

/* compiled from: DialogHeaderInfoComponent.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class wem extends FunctionReferenceImpl implements izs<opz.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(opz.a aVar) {
        opz.a aVar2 = aVar;
        afm afmVar = (afm) this.receiver;
        zsk0 zsk0Var = afmVar.D;
        zsk0Var.h = false;
        zsk0Var.d = aVar2.a;
        zsk0Var.e = aVar2.b;
        p4g.n(zsk0Var.g, aVar2.c);
        Dialog a = zsk0Var.a();
        odw odwVar = afmVar.B;
        if (a != null) {
            List<Peer.Type> list = rdw.a;
            if (rdw.a(a.Zb(), a.Jc())) {
                afmVar.t.b(odwVar.a().a0(asu0.a.d()).subscribe(new defpackage.z(new defpackage.y(7, a, afmVar), 19)));
                odwVar.b(a.Zb());
            }
        }
        afmVar.Y0();
        afmVar.b1();
        return s3q0.a;
    }
}
