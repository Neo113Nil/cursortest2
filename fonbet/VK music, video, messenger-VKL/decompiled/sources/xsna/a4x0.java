package xsna;

import com.vk.voip.OKVoipEngine;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a4x0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s {
    public final /* synthetic */ int b;

    public /* synthetic */ a4x0() {
        this.b = 1;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return ((fjw0) obj).a();
            default:
                return Boolean.FALSE;
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        p6x0 p6x0Var = new p6x0(rVar);
        rVar.a(new xre0(p6x0Var, 1));
        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
        rVar.onNext(Boolean.valueOf(oKVoipEngine.getMediaOptionsForCurrentUser().getMovieSharingState() != MediaOptionState.MUTED_PERMANENT));
        oKVoipEngine.getClass();
        OKVoipEngine.k.o.a.add(p6x0Var);
    }

    public /* synthetic */ a4x0(izs izsVar, int i) {
        this.b = i;
    }
}
