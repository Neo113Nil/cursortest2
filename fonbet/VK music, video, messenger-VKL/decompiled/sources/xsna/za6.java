package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.core.tips.Tooltip;
import com.vk.dto.common.id.UserId;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayerAdapterKt;
import ru.ok.android.webrtc.participant.movie.MovieId;
import xsna.bzp0;
import xsna.ngl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class za6 implements ngl.a, io.reactivex.rxjava3.core.n, Tooltip.c, io.reactivex.rxjava3.core.d, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ za6(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        gzs gzsVar = (gzs) this.b;
        UIBlockHint uIBlockHint = (UIBlockHint) this.c;
        gzsVar.invoke();
        pla.e().b().b(uIBlockHint.y);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        ((com.vk.auth.verification.base.b) this.b).F0(((v2j) this.c).b, cVar.a);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        WatchTogetherPlayerAdapterKt.pauseCompletable$lambda$0((WatchTogetherPlayer) this.b, (MovieId) this.c, bVar);
    }

    @Override // io.reactivex.rxjava3.core.n
    public void subscribe(io.reactivex.rxjava3.core.l lVar) {
        xwk.e().h0().j((Context) this.b, (UserId) this.c, new zx0(lVar, 28), new tbg(lVar, 3), null);
    }
}
