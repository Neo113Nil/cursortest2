package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x43 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ x43(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(epx.f(((StoriesContainer) obj).Ob(), str));
            case 1:
                qyg0 V0 = ((hyg0) obj).V0("SELECT COUNT(*) FROM auto_download_track WHERE uid = ?  AND auto_download_track.auto_download_type = 1");
                try {
                    V0.D3(1, str);
                    int i2 = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i2);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.s(tgi0Var, new us2(str));
                qgi0.n(tgi0Var, 0);
                return s3q0.a;
            case 3:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.n(tgi0Var2, 2);
                qgi0.q(tgi0Var2, str);
                return s3q0.a;
            default:
                aag0 aag0Var = (aag0) obj;
                if (!aag0Var.a()) {
                    return io.reactivex.rxjava3.core.q.H(new IllegalArgumentException(go9.b("Can't resolve screen for ", str)));
                }
                Regex regex = wgx0.a;
                return wgx0.b(aag0Var.a, aag0Var.b, str);
        }
    }
}
