package xsna;

import androidx.compose.runtime.a;
import org.json.JSONObject;
import xsna.umi;
import xsna.uv60;
import xsna.vki;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wii implements zzs {
    public final /* synthetic */ int b;

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        switch (this.b) {
            case 0:
                z37 z37Var = (z37) obj;
                dt70 dt70Var = (dt70) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(dt70Var) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1072746645, i, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.ComposableSingletons$OfflineAudioBookChaptersMviComposeComponentKt.lambda$-1072746645.<anonymous> (OfflineAudioBookChaptersMviComposeComponent.kt:112)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-2036251312, new a73(2, dt70Var, z37Var), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                z37 z37Var2 = (z37) obj;
                o3j0 o3j0Var = (o3j0) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = (aVar2.J(z37Var2) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= aVar2.J(o3j0Var) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(882003795, i2, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.ComposableSingletons$SettingsComposeComponentKt.lambda$882003795.<anonymous> (SettingsComposeComponent.kt:32)");
                    }
                    boolean z = (i2 & 14) == 4;
                    Object x = aVar2.x();
                    if (z || x == a.C0011a.a) {
                        vki.a aVar3 = new vki.a(1, z37Var2, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar2.R(aVar3);
                        x = aVar3;
                    }
                    n3j0.c(o3j0Var, (izs) ((fcy) x), null, aVar2, (i2 >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                z37 z37Var3 = (z37) obj;
                ldh0 ldh0Var = (ldh0) obj2;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    i3 = (aVar4.J(z37Var3) ? 4 : 2) | intValue3;
                } else {
                    i3 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i3 |= aVar4.J(ldh0Var) ? 32 : 16;
                }
                if (aVar4.t(i3 & 1, (i3 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1061521594, i3, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.ComposableSingletons$VideoViewerComposeComponentKt.lambda$1061521594.<anonymous> (VideoViewerComposeComponent.kt:32)");
                    }
                    boolean z2 = (i3 & 14) == 4;
                    Object x2 = aVar4.x();
                    if (z2 || x2 == a.C0011a.a) {
                        umi.a aVar5 = new umi.a(1, z37Var3, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar4.R(aVar5);
                        x2 = aVar5;
                    }
                    kch0.a(ldh0Var, (izs) ((fcy) x2), null, aVar4, (i3 >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                return new uv60.a((String) obj3, (JSONObject) obj, (String) obj4, (String) obj2);
        }
    }
}
