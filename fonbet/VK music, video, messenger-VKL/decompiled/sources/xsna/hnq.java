package xsna;

import android.content.Context;
import android.util.Size;
import com.ironsource.InterfaceC4319fe;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.FaveTag;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hnq implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hnq(int i, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        int i2 = 0;
        switch (i) {
            case 0:
                gux0 gux0Var = (gux0) obj5;
                List<FaveTag> list = (List) obj4;
                Context context = (Context) obj3;
                pqq pqqVar = (pqq) obj2;
                if (((Boolean) obj).booleanValue()) {
                    p870.f().e(InterfaceC4319fe.a.c, gux0Var.copy(list));
                    boolean f = epx.f(pqqVar.b, "FAVE");
                    String string = list.isEmpty() ? context.getString(R.string.fave_tags_remove_successful) : enj.f(R.plurals.fave_tags_add_successful, list.size(), context);
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_bookmark_circle_fill_yellow_28, (Integer) null, (Size) null, 14);
                    aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
                    aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, f ? "" : context.getString(R.string.fave_move_to_screen), new lnq(f, context, i2));
                    pkv0.f(aVar);
                } else {
                    cvk.u(R.string.error, false);
                }
                return s3q0.a;
            default:
                n8w0 n8w0Var = (n8w0) obj5;
                s8w0 s8w0Var = n8w0Var.a;
                String str = (String) obj4;
                String str2 = (String) obj3;
                UserId userId = (UserId) obj2;
                it80 it80Var = (it80) obj;
                if (it80Var.a()) {
                    return io.reactivex.rxjava3.core.q.T(it80Var.a);
                }
                if (!s8w0Var.a().exists()) {
                    s8w0Var.a().mkdirs();
                } else if (!s8w0Var.a().isDirectory()) {
                    File a = s8w0Var.a();
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.d(a);
                    s8w0Var.a().mkdirs();
                }
                io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new dug0(str, new File(s8w0Var.a(), str2), false));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return new io.reactivex.rxjava3.internal.operators.observable.i0(qVar.i0(), new pi40(new jyq0(8), 20)).U(new tuz(new go6(n8w0Var, userId, str2, 9), 23));
        }
    }
}
