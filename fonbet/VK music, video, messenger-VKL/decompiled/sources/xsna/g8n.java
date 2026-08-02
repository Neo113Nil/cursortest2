package xsna;

import java.util.Arrays;
import kotlin.Result;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayerAdapterKt;
import ru.ok.android.webrtc.participant.movie.MovieId;
import xsna.qn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8n implements io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.d, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g8n(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        WatchTogetherPlayerAdapterKt.stopCompletable$lambda$0((WatchTogetherPlayer) this.b, (MovieId) this.c, bVar);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        qn60 qn60Var = (qn60) this.b;
        qn60.b[] bVarArr = (qn60.b[]) this.c;
        Object f = qn60Var.f((qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (!(f instanceof Result.Failure)) {
            yVar.onSuccess((qn60.c) f);
        }
        Throwable a = Result.a(f);
        if (a != null) {
            yVar.onError(a);
        }
    }
}
