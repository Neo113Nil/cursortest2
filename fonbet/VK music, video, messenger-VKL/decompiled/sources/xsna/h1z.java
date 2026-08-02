package xsna;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import xsna.wih0;
import xsna.yt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class h1z implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h1z(int i, String str, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.d = obj;
        this.c = str;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 showCompleted$lambda$12;
        switch (this.b) {
            case 0:
                showCompleted$lambda$12 = LegacyShowUseCase.showCompleted$lambda$12((Listeners) this.d, this.c, (ShowStatus) this.e, (LegacyShowUseCase) this.f);
                return showCompleted$lambda$12;
            default:
                zo00 zo00Var = (zo00) this.d;
                wih0.b.a aVar = (wih0.b.a) this.e;
                String str = (String) this.f;
                zo00Var.d.invoke(new yt0.h.d(new zt0(this.c, aVar.k)));
                zo00Var.b.invoke(str, aVar.l);
                return s3q0.a;
        }
    }
}
