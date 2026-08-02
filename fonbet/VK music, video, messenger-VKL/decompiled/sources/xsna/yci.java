package xsna;

import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.zei;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yci implements zzs {
    public final /* synthetic */ int b;

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                ksy ksyVar = (ksy) obj;
                ((Integer) obj2).getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(ksyVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1753197335, intValue, -1, "com.vk.clips.playlists.folders.gridlist.ui.ComposableSingletons$ClipsPlaylistsSmallFoldersListKt.lambda$-1753197335.<anonymous> (ClipsPlaylistsSmallFoldersList.kt:172)");
                    }
                    yqe.c(ksy.c(ksyVar, q630.a.a, 2), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                z37 z37Var = (z37) obj;
                u2m u2mVar = (u2m) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar2.J(z37Var) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar2.J(u2mVar) ? 32 : 16;
                }
                if (aVar2.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-659399490, i, -1, "com.vk.video.ui.upload.impl.publish.presentation.description.fragment.ComposableSingletons$DescriptionModalKt.lambda$-659399490.<anonymous> (DescriptionModal.kt:59)");
                    }
                    boolean z = (i & 14) == 4;
                    Object x = aVar2.x();
                    if (z || x == a.C0011a.a) {
                        zei.a aVar3 = new zei.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar2.R(aVar3);
                        x = aVar3;
                    }
                    zz20.c(u2mVar, (izs) ((fcy) x), null, aVar2, (i >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
