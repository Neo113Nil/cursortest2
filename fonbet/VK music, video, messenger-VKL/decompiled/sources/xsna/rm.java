package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.BotKeyboard;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class rm implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rm(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Peer peer;
        Peer.Type type;
        switch (this.b) {
            case 0:
                ep10 ep10Var = (ep10) obj;
                int r0 = ep10Var.r0(vm.b);
                long j = ((o6j) obj3).a;
                int i = r0 * 2;
                tra0 N = ((zo10) obj2).N(s6j.i(0, i, j));
                return ep10Var.Q(N.b, N.c - i, jgp.b, new tm(N, r0, 0));
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-370128918, intValue, -1, "com.vk.clips.playlists.folders.list.ui.ComposableSingletons$ClipPlaylistsFolderListKt.lambda$-370128918.<anonymous> (ClipPlaylistsFolderList.kt:119)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 f = txj0.f(aVar2, 1.0f);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    zfr0.f(SpinnerState.Loading, ra8.a.b(aVar2, dt1.a.f), null, 0L, null, null, aVar, 6, 60);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                BotKeyboard botKeyboard = ((com.vk.im.engine.models.dialogs.b) obj2).D;
                rdi.k(sQLiteStatement, intValue2, (botKeyboard == null || (peer = botKeyboard.b) == null || (type = peer.c) == null) ? null : Integer.valueOf(type.h()));
                return s3q0.a;
        }
    }
}
