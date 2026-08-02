package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.view.tools.PipetteView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;
import com.vk.photo.editor.markup.view.tools.button.PipetteButton;
import java.util.Collections;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cdu;
import xsna.wpa0;
import xsna.y8g;
import xsna.ycu;

/* compiled from: GraffitiDrawingView.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class ecu extends FunctionReferenceImpl implements izs<ycu.a, s3q0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final s3q0 invoke(ycu.a aVar) {
        ycu.a aVar2 = aVar;
        jcu jcuVar = (jcu) this.receiver;
        ColorButton colorButton = jcuVar.p;
        PipetteView pipetteView = jcuVar.B;
        PipetteButton pipetteButton = jcuVar.q;
        z5g z5gVar = aVar2.c;
        cdu.a aVar3 = aVar2.b;
        cdu.a aVar4 = aVar2.a;
        boolean z = z5gVar.b;
        ColorButton colorButton2 = z ? pipetteButton : colorButton;
        cdu.a.C2659a c2659a = cdu.a.C2659a.a;
        boolean f = epx.f(aVar4, c2659a);
        cdu.a.b bVar = cdu.a.b.a;
        if (f && epx.f(aVar3, bVar)) {
            pipetteButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            fyt0.n(pipetteButton, z);
            colorButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            fyt0.n(colorButton, !z);
            l3p.a("GraffitiDrawExpand", new defpackage.m(19, jcuVar, colorButton2));
        } else if (epx.f(aVar4, bVar) && epx.f(aVar3, c2659a)) {
            l3p.a("GraffitiDrawExpand", new td0(17, jcuVar, colorButton2));
        } else if ((aVar4 instanceof cdu.a.d) && !(aVar3 instanceof cdu.a.d)) {
            pipetteView.setSelecting(false);
            fyt0.h(pipetteView);
        }
        if (!(aVar4 instanceof cdu.a.d) && (aVar3 instanceof cdu.a.d)) {
            pipetteView.setVisibility(0);
            pipetteView.c(((cdu.a.d) aVar3).a);
            wpa0.a aVar5 = new wpa0.a(new y8g.c(pipetteView.getSelectedColor()), false);
            if (pipetteButton != 0) {
                pipetteButton.setState(aVar5);
            }
            jcuVar.g.submitList(Collections.singletonList(new xzp0(aVar5)));
        }
        return s3q0.a;
    }
}
