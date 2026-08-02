package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h150 implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h150(izs izsVar, boolean z) {
        this.c = z;
        this.d = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                k150 k150Var = (k150) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1484906227, intValue, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.playlistItems.<anonymous> (MusicPlaylistListContent.kt:151)");
                    }
                    k150Var.f(this.c, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(64664431, intValue2, -1, "com.vk.video.ui.share.impl.presentation.views.ShareBottomSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShareBottomSheetContent.kt:76)");
                    }
                    d7j0.b(0, aVar2, izsVar, this.c);
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

    public /* synthetic */ h150(k150 k150Var, boolean z) {
        this.d = k150Var;
        this.c = z;
    }
}
