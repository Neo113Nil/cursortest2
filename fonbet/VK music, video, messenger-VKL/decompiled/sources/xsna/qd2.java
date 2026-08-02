package xsna;

import com.unity3d.ads.core.domain.adquality.AndroidUpdateAdQualitySessionToken;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class qd2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ qd2(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String invoke$lambda$0;
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                invoke$lambda$0 = AndroidUpdateAdQualitySessionToken.invoke$lambda$0(str);
                return invoke$lambda$0;
            default:
                bpn0 bpn0Var = c7r0.a;
                String f = c7r0.f(str);
                c7r0.j(str, f);
                c7r0.c().put(str, f);
                return f;
        }
    }
}
