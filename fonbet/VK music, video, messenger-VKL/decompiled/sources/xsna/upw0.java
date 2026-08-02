package xsna;

import com.vk.voip.ui.history.friends.ui.b;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bqw0;
import xsna.xpw0;

/* compiled from: VoipHistoryFriendsReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class upw0 extends FunctionReferenceImpl implements izs<xpw0.a, b.c> {
    @Override // xsna.izs
    public final b.c invoke(xpw0.a aVar) {
        xpw0.a aVar2 = aVar;
        ((ppw0) this.receiver).getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bqw0.e.b.b);
        List<gpw0> list = aVar2.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        for (gpw0 gpw0Var : list) {
            arrayList2.add(new bqw0.b(gpw0Var.a, gpw0Var.b, gpw0Var.c, gpw0Var.d, gpw0Var.e, gpw0Var.f, gpw0Var.g, gpw0Var.h));
        }
        arrayList.addAll(arrayList2);
        String str = null;
        for (gpw0 gpw0Var2 : aVar2.d) {
            CallsUserId.VkUserId vkUserId = gpw0Var2.a;
            String str2 = gpw0Var2.b;
            bqw0.b bVar = new bqw0.b(vkUserId, str2, gpw0Var2.c, gpw0Var2.d, gpw0Var2.e, gpw0Var2.f, gpw0Var2.g, gpw0Var2.h);
            String upperCase = String.valueOf(erm0.x0(str2)).toUpperCase(Locale.ROOT);
            if (!epx.f(str, upperCase)) {
                arrayList.add(new bqw0.a(ppw0.a, 2));
                arrayList.add(new bqw0.e.a(upperCase));
                str = upperCase;
            }
            arrayList.add(bVar);
        }
        xpw0.a.AbstractC4033a abstractC4033a = aVar2.f;
        if (!(abstractC4033a instanceof xpw0.a.AbstractC4033a.b)) {
            if (abstractC4033a instanceof xpw0.a.AbstractC4033a.c) {
                arrayList.add(bqw0.d.b);
            } else {
                if (!(abstractC4033a instanceof xpw0.a.AbstractC4033a.C4034a)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new bqw0.c(((xpw0.a.AbstractC4033a.C4034a) abstractC4033a).a));
            }
        }
        return new b.c(arrayList, aVar2.e instanceof xpw0.a.b.C4036b);
    }
}
