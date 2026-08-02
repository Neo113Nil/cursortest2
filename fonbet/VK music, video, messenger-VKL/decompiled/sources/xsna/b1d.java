package xsna;

import android.content.Context;
import android.view.View;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import ru.ok.android.webrtc.Privacy;
import xsna.c3q;
import xsna.hf20;
import xsna.vmu;
import xsna.xh70;
import xsna.xt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b1d implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b1d(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                im0 im0Var = (im0) this.c;
                c1d c1dVar = (c1d) this.d;
                View view = (View) this.e;
                im0Var.invoke();
                c1dVar.d(view);
                return s3q0.a;
            case 1:
                FriendsSuggestsVh friendsSuggestsVh = (FriendsSuggestsVh) this.c;
                Context context = (Context) this.d;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) this.e;
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) friendsSuggestsVh.i.getValue();
                c3q a = c3q.a.a(uIBlockProfile.A.c, null, true);
                a.H0(uIBlockProfile.y.d);
                a.F0(Privacy.FRIENDS);
                bVar.b(hg1.m(rsg0.y0(a, null, null, 3).L(new tt0(new g86(9, friendsSuggestsVh, uIBlockProfile), 21), false), context, 0L, false, 62).subscribe(new tts(new on7(uIBlockProfile, context, friendsSuggestsVh, 3), 0), new mf1(new com(7), 26)));
                return s3q0.a;
            case 2:
                dlv0 dlv0Var = (dlv0) this.c;
                izs izsVar = (izs) this.d;
                xh70 xh70Var = (xh70) this.e;
                dlv0Var.a();
                izsVar.invoke(new vmu.c(((xh70.a) xh70Var).a));
                return s3q0.a;
            case 3:
                return (hf20.b) ((l7r0) this.c).d((ij20) this.d, (hf20.a) this.e);
            case 4:
                String str = (String) this.c;
                String str2 = (String) this.d;
                a3d0 a3d0Var = (a3d0) this.e;
                AdsintEventTypeDto adsintEventTypeDto = AdsintEventTypeDto.MRC_CLICK;
                int layoutPosition = a3d0Var.getLayoutPosition();
                return new xt0.a(adsintEventTypeDto, str, str2, layoutPosition < 0 ? xt0.c.b.a : new xt0.c.a(layoutPosition));
            default:
                return up2.f((h7m) this.c, (Context) this.d, (f5z) this.e);
        }
    }
}
