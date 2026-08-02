package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.SpinnerState;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fii implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fii(int i) {
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
                        androidx.compose.runtime.b.f(1270383673, intValue, -1, "com.vk.music.playlist.display.presentation.ComposableSingletons$MusicPlaylistListContentKt.lambda$1270383673.<anonymous> (MusicPlaylistListContent.kt:114)");
                    }
                    if (a690.d(q630.a.a, tab0.d, aVar, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1099901328, intValue2, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.ComposableSingletons$ReviewFriendsComposeContentViewKt.lambda$-1099901328.<anonymous> (ReviewFriendsComposeContentView.kt:89)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630.a aVar3 = q630.a.a;
                    q630 c = qri.c(aVar2, aVar3);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar2, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar2, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar2, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar2, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar2, c, dVar);
                    f9t.e(txj0.h(aVar3, 14), aVar2, 6);
                    q630 f = txj0.f(aVar3, 1.0f);
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c2 = qri.c(aVar2, f);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d, cVar);
                    k9q0.w(aVar2, D2, eVar);
                    ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                    k9q0.w(aVar2, c2, dVar);
                    zfr0.f(SpinnerState.Loading, ra8.a.b(aVar3, dt1.a.f), null, 0L, null, null, aVar2, 6, 60);
                    if (kr.f(aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).P);
                return s3q0.a;
        }
    }
}
