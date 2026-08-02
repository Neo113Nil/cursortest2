package xsna;

import android.net.Uri;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefContentQuality;
import com.vk.reefton.dto.ReefContentType;
import kotlin.NoWhenBranchMatchedException;
import xsna.g73;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class u63 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u63(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                g73.a aVar = (g73.a) this.c;
                d73 d73Var = (d73) this.d;
                NavigationDelegateActivity navigationDelegateActivity = (NavigationDelegateActivity) this.e;
                mq2 mq2Var = (mq2) this.f;
                if (aVar instanceof g73.a.b.C2918a) {
                    lau lauVar = d73Var.c;
                    ((g73.a.b.C2918a) aVar).getClass();
                    lauVar.c(navigationDelegateActivity, new b73(d73Var, mq2Var, null, navigationDelegateActivity));
                    return;
                } else if (aVar instanceof g73.a.b.C2919b) {
                    d73Var.f = ((g73.a.b.C2919b) aVar).a;
                    d73Var.i = 3;
                    return;
                } else {
                    if (!(aVar instanceof g73.a.C2917a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g73.a.C2917a c2917a = (g73.a.C2917a) aVar;
                    d73Var.d.h(c2917a.a.getMessage());
                    d73Var.i = 0;
                    String message = c2917a.a.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    mq2Var.invoke(-1, message);
                    return;
                }
            default:
                hwl0 hwl0Var = (hwl0) this.c;
                ReefContentType reefContentType = (ReefContentType) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                Reef m = hwl0Var.m();
                if (m != null) {
                    m.a(new ReefEvent.x(reefContentType, str, Uri.parse(str2)));
                }
                Reef m2 = hwl0Var.m();
                if (m2 != null) {
                    m2.a(new ReefEvent.PlayerQualityChange(ReefContentQuality.AUTO, ReefEvent.PlayerQualityChange.Reason.AUTO, null));
                }
                hwl0Var.b = -1L;
                return;
        }
    }
}
