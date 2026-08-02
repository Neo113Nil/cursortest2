package xsna;

import com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtonsStyle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k750 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k750(b78 b78Var, boolean z, boolean z2, q630 q630Var, int i) {
        this.f = b78Var;
        this.c = z;
        this.d = z2;
        this.g = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                n750.l((b78) this.f, this.c, this.d, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                u7b0.b(this.c, this.d, (PlaylistButtonsStyle) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k750(boolean z, boolean z2, PlaylistButtonsStyle playlistButtonsStyle, izs izsVar, int i) {
        this.c = z;
        this.d = z2;
        this.f = playlistButtonsStyle;
        this.g = izsVar;
        this.e = i;
    }
}
