package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm.ExitConfirmDialogViewState;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uff implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uff(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ahf ahfVar = (ahf) obj5;
                ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1 clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1 = (ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1) obj4;
                fgf fgfVar = (fgf) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                String str = ClipsUploadFragmentImpl.a0;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(205328930, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ClipsUploadFragmentImpl.kt:252)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    ahfVar.a(clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1, !ylu0Var.s(), fgfVar, txj0.d(q630.a.a, 1.0f), aVar, 3078);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((lzi) obj5).h((e0j) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                z4q.a((ExitConfirmDialogViewState) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                fau0.a((izs) obj5, (MusicPlayerInformerViewState.a) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ uff(ahf ahfVar, ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1 clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1, fgf fgfVar) {
        this.b = 0;
        this.c = ahfVar;
        this.d = clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1;
        this.e = fgfVar;
    }
}
