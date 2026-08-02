package xsna;

import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.i8s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pii implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pii(int i) {
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
                        androidx.compose.runtime.b.f(-1771404885, intValue, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.ComposableSingletons$MusicTrackMenuHeaderKt.lambda$-1771404885.<anonymous> (MusicTrackMenuHeader.kt:57)");
                    }
                    w9q.a(0, 3, aVar, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                i8s0.a.C3039a c3039a = (i8s0.a.C3039a) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(c3039a) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1930346156, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoCardScreenContentKt.lambda$-1930346156.<anonymous> (VideoCardScreenContent.kt:75)");
                    }
                    c3039a.a.d().c(VideoCardViewState.Size.Sharp, aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).Z);
                break;
        }
        return s3q0.a;
    }
}
