package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.vas0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qki implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qki(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(s890Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1342603483, intValue, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.ComposableSingletons$ScreenKt.lambda$1342603483.<anonymous> (Screen.kt:104)");
                    }
                    q630 C = s200.C(txj0.d(q630.a.a, 1.0f), s890Var);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, C);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, null, null, aVar, 6, 510);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                vas0.a.C3879a c3879a = (vas0.a.C3879a) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.J(c3879a) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(149361153, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoCellScreenContentKt.lambda$149361153.<anonymous> (VideoCellScreenContent.kt:68)");
                    }
                    c3879a.a.f().c(VideoCellViewState.Size.Medium, aVar3, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).o.b);
                return s3q0.a;
        }
    }
}
