package xsna;

import android.content.Context;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vkontakte.android.R;
import java.util.List;
import xsna.wfu;

/* compiled from: AnonymProfileStubStrategy.kt */
/* loaded from: classes17.dex */
public final class au2 extends nsm0 {
    @Override // xsna.wfu
    public final void a(wfu.a aVar, List<ClipGridParams.Data.Profile> list) {
        wee weeVar = this.a;
        weeVar.Od(aVar);
        weeVar.ql(false, false, false, false);
        weeVar.Yi();
    }

    @Override // xsna.wfu
    public final io.reactivex.rxjava3.core.x<wfu.a> b() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String string = context.getString(R.string.clip_grid_anonym_name);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        String string2 = context2.getString(R.string.clip_grid_anon_id);
        String e = dgn0.e();
        tfx tfxVar = new tfx("shortVideo.getAnonUserInfo", new kq(29), new lq(29));
        tfx.o(tfxVar, "device_id", e, 0, 0, 12);
        dz2 x = yfb.x(tfxVar);
        x.c = true;
        x.d = true;
        return new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.w0(x).l(new q40(new pe1(1), 1)), new rr(1), null).l(new s41(new zt2(string, string2), 1));
    }
}
