package xsna;

import android.widget.FrameLayout;
import com.vk.community.design.compose.topbar.PassthroughThemedComposeView;
import xsna.dak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class c9b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c9b(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                i9b i9bVar = (i9b) this.d;
                i9bVar.i.f(i9bVar.f.getString(this.c));
                break;
            case 1:
                PassthroughThemedComposeView passthroughThemedComposeView = (PassthroughThemedComposeView) obj;
                FrameLayout frameLayout = ((com.vk.profile.community.impl.ui.profile.f) this.d).m;
                if (frameLayout != null) {
                    int height = passthroughThemedComposeView.getHeight();
                    int i = this.c;
                    bwt0.f0(frameLayout, i, height, i, 0, 8);
                }
                break;
            default:
                b160 b160Var = (b160) obj;
                khl khlVar = ((dsy) this.d).a;
                dak0 a = dak0.a.a();
                dak0.a.d(a, dak0.a.b(a), a != null ? a.e() : null);
                khlVar.getClass();
                int b = b160Var.b() == -1 ? 2 : b160Var.b();
                for (int i2 = 0; i2 < b; i2++) {
                    b160Var.a(this.c + i2);
                }
                break;
        }
        return s3q0.a;
    }
}
