package xsna;

import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hr6 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    public /* synthetic */ hr6(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                int i = com.vk.clips.design.view.timeline.a.P;
                if (th != null) {
                    L.g("baseTimeline", th);
                    break;
                }
                break;
            default:
                z4g.d().l();
                s3q0 s3q0Var = s3q0.a;
                break;
        }
    }
}
