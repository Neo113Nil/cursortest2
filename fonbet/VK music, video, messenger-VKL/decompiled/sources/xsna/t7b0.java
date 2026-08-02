package xsna;

import com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtonsStyle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t7b0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t7b0(u4i0 u4i0Var, boolean z, q630 q630Var, int i) {
        this.b = 1;
        this.e = u4i0Var;
        this.c = z;
        this.f = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                u7b0.a(this.c, (PlaylistButtonsStyle) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                u4i0 u4i0Var = (u4i0) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                u4i0Var.e(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, q630Var, this.c);
                break;
            default:
                q630 q630Var2 = (q630) this.e;
                izs izsVar = (izs) this.f;
                ((Integer) obj2).getClass();
                hol0.e(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var2, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t7b0(boolean z, Object obj, izs izsVar, int i, int i2) {
        this.b = i2;
        this.c = z;
        this.e = obj;
        this.f = izsVar;
        this.d = i;
    }
}
