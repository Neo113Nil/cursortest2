package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import xsna.cjj;

/* compiled from: ContentProductsRouterImpl.kt */
/* loaded from: classes18.dex */
public final class lkj implements kkj {
    @Override // xsna.kkj
    public final void a(Context context, UserId userId, long j) {
        Activity activity = (Activity) context;
        vjj vjjVar = new vjj(activity, userId, j);
        dw20 a = new cjj.a(activity, userId, j).d0(new ey0(vjjVar, 28)).a0(new eb(vjjVar, 28)).a();
        vjjVar.c = a;
        a.Td(((FragmentActivity) e3m.h(context)).getSupportFragmentManager(), "ProductInContentBottomSheet");
    }
}
