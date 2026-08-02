package xsna;

import androidx.compose.runtime.a;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import xsna.loh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pcb0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pcb0(PlaylistScreenFragment playlistScreenFragment, zdb0 zdb0Var, z37 z37Var, ksr ksrVar) {
        this.c = playlistScreenFragment;
        this.d = zdb0Var;
        this.e = z37Var;
        this.f = ksrVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                PlaylistScreenFragment playlistScreenFragment = (PlaylistScreenFragment) obj6;
                zdb0 zdb0Var = (zdb0) obj5;
                z37 z37Var = (z37) obj4;
                ksr ksrVar = (ksr) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1982280311, intValue, -1, "com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment.ScreenContent.<anonymous>.<anonymous>.<anonymous> (PlaylistScreenFragment.kt:133)");
                    }
                    nwy nwyVar = playlistScreenFragment.go().l;
                    qcy<Object> qcyVar = PlaylistScreenFragmentInternalComponent.y[2];
                    bga bgaVar = (bga) nwyVar.c();
                    boolean J = aVar.J(z37Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        PlaylistScreenFragment.d dVar = new PlaylistScreenFragment.d(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(dVar);
                        x = dVar;
                    }
                    ydb0.a(bgaVar, zdb0Var, (izs) ((fcy) x), ksrVar, null, aVar, 3072);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((koh0) obj6).n((loh0.e.a) obj5, (c1h) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pcb0(koh0 koh0Var, loh0.e.a aVar, c1h c1hVar, izs izsVar, int i) {
        this.c = koh0Var;
        this.d = aVar;
        this.e = c1hVar;
        this.f = izsVar;
    }
}
