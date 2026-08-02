package xsna;

import androidx.compose.runtime.a;
import com.vk.profile.design.view.fab.ProfileFabView;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c050 implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c050(ProfileFabView profileFabView, boolean z) {
        this.d = profileFabView;
        this.c = z;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        izs izsVar;
        switch (this.b) {
            case 0:
                bi40 bi40Var = (bi40) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1206027585, intValue, -1, "com.vk.music.playlist.display.presentation.DownloadingStateButton.<anonymous> (MusicPlaylistHeaderButtons.kt:349)");
                    }
                    q630 q = txj0.q(q630.a.a, 24);
                    qzu0.a.getClass();
                    lg90 L = qzu0.L(aVar);
                    lg90 J = qzu0.J(aVar);
                    boolean z = this.c;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z) {
                        aVar.K(1366727557);
                        Object x = aVar.x();
                        if (x == c0012a) {
                            x = new juz(5);
                            aVar.R(x);
                        }
                        izsVar = (izs) x;
                        aVar.j();
                    } else {
                        aVar.K(1367301305);
                        Object x2 = aVar.x();
                        if (x2 == c0012a) {
                            x2 = new vsq(16);
                            aVar.R(x2);
                        }
                        izsVar = (izs) x2;
                        aVar.j();
                    }
                    ki40.a(bi40Var, J, j050.b, izsVar, q, L, false, aVar, 286784, 64);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                return ProfileFabView.D((ProfileFabView) this.d, this.c, (androidx.compose.runtime.a) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ c050(bi40 bi40Var, boolean z) {
        this.c = z;
        this.d = bi40Var;
    }
}
