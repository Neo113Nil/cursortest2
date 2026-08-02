package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.graffiti.domain.model.BrushType;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.photo.editor.markup.view.tools.SizeCircleView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;
import com.vk.photo.editor.markup.view.tools.button.PipetteButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cdu;
import xsna.wpa0;
import xsna.y8g;
import xsna.ycu;

/* compiled from: GraffitiDrawingView.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class fcu extends FunctionReferenceImpl implements izs<ycu.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ycu.b bVar) {
        wpa0 bVar2;
        BrushesPanel.BrushType brushType;
        ycu.b bVar3 = bVar;
        jcu jcuVar = (jcu) this.receiver;
        SizeCircleView sizeCircleView = jcuVar.z;
        BrushesPanel brushesPanel = jcuVar.t;
        RecyclerView recyclerView = jcuVar.r;
        PipetteButton pipetteButton = jcuVar.q;
        ColorButton colorButton = jcuVar.p;
        rho rhoVar = bVar3.b;
        ycu.a aVar = bVar3.a;
        z5g z5gVar = rhoVar.b;
        BrushType brushType2 = rhoVar.c;
        boolean z = z5gVar.b;
        int i = z5gVar.a;
        jf10 jf10Var = jcuVar.f;
        ArrayList arrayList = jcuVar.e;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        y8g.c cVar = y8g.a.a;
        y8g.c cVar2 = cVar;
        while (it.hasNext()) {
            y8g.c cVar3 = (y8g.c) it.next();
            Iterator it2 = it;
            boolean z2 = cVar3.a == i && !z;
            if (z2) {
                cVar2 = cVar3;
            }
            arrayList2.add(new jzp0(cVar3, z2));
            it = it2;
            cVar = cVar;
        }
        y8g.c cVar4 = cVar;
        jf10Var.submitList(arrayList2);
        cdu.a aVar2 = aVar.b;
        if (!epx.f(aVar2, cdu.a.C2659a.a) && !(aVar2 instanceof cdu.a.d) && recyclerView != null) {
            Iterator<jzp0> it3 = jf10Var.getCurrentList().iterator();
            int i2 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (it3.next().b) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 1;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int w = linearLayoutManager.w();
                int s = linearLayoutManager.s();
                if (s == -1 || w == -1 ? i3 == 1 : w - s >= i3) {
                    i3 = 0;
                }
            }
            lkf0.c(recyclerView, i3);
        }
        colorButton.setCurrentColor(z ? cVar4 : cVar2);
        if (z) {
            bVar2 = new wpa0.a(new y8g.c(i), ((aVar2 instanceof cdu.a.d) || (aVar2 instanceof cdu.a.b)) ? false : true);
        } else {
            bVar2 = new wpa0.b(false);
        }
        jcuVar.g.submitList(Collections.singletonList(new xzp0(bVar2)));
        pipetteButton.setState(bVar2);
        pipetteButton.setClickable(z);
        pipetteButton.setFocusable(z);
        if (epx.f(aVar.a, cdu.a.c.a) && epx.f(aVar2, cdu.a.b.a)) {
            if (z) {
                pipetteButton.setVisibility(0);
                pipetteButton.setAlpha(1.0f);
                colorButton.setVisibility(4);
                colorButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                colorButton.setVisibility(0);
                colorButton.setAlpha(1.0f);
                pipetteButton.setVisibility(4);
                pipetteButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        boolean z3 = !z;
        colorButton.setClickable(z3);
        colorButton.setFocusable(z3);
        float f = rhoVar.a;
        int i4 = fl8.$EnumSwitchMapping$0[brushType2.ordinal()];
        if (i4 == 1) {
            brushType = BrushesPanel.BrushType.Pen;
        } else if (i4 == 2) {
            brushType = BrushesPanel.BrushType.Arrow;
        } else if (i4 == 3) {
            brushType = BrushesPanel.BrushType.Marker;
        } else if (i4 == 4) {
            brushType = BrushesPanel.BrushType.Glow;
        } else {
            if (i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            brushType = BrushesPanel.BrushType.Eraser;
        }
        brushesPanel.setCurrentBrush(brushType);
        brushesPanel.setCurrentColor(i);
        jcuVar.A.setSize(f);
        sizeCircleView.setRelativeSize(f);
        if (brushType2 == BrushType.Eraser) {
            i = -1;
        }
        sizeCircleView.setColor(i);
        return s3q0.a;
    }
}
