package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.a6t0;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sii implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sii(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-956511654, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.list.ComposableSingletons$NotificationListViewKt.lambda$-956511654.<anonymous> (NotificationListView.kt:540)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 f = txj0.f(aVar2, 1.0f);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    zfr0.f(SpinnerState.Loading, ra8.a.b(aVar2, dt1.a.f), null, 0L, null, null, aVar, 6, 60);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                a6t0.a.C2528a c2528a = (a6t0.a.C2528a) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar4.J(c2528a) ? 4 : 2;
                }
                if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1023961969, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoPreviewScreenContentKt.lambda$1023961969.<anonymous> (VideoPreviewScreenContent.kt:78)");
                    }
                    c2528a.a.h().c(PreviewViewState.Size.PosterMedium2x3, aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                PushSettings pushSettings = ((com.vk.im.engine.models.dialogs.b) obj2).p;
                rdi.l(sQLiteStatement, intValue3, pushSettings != null ? Long.valueOf(pushSettings.c) : null);
                return s3q0.a;
            default:
                ((Integer) obj).getClass();
                int intValue4 = ((Integer) obj2).intValue();
                nov novVar = (nov) obj3;
                novVar.e(f2l0.a, (f2l0.b / 2.0f) + (((intValue4 / 2.0f) - (novVar.getRealHeight() / 2.0f)) - (f2l0.a(intValue4) / 2.0f)));
                return s3q0.a;
        }
    }
}
