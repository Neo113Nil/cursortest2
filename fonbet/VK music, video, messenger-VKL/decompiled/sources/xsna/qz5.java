package xsna;

import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import xsna.f7p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qz5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qz5(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((sz5) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((yp8) this.d).a((VkOnboardingStat$Delegate) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                com.vk.profile.community.impl.ui.events.d.b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 3:
                ((Integer) obj2).getClass();
                c1q.a((ksr) this.d, (wzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((lgg0) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                cjo0.a((nmo0) this.d, (jai) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((f7p0.c) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qz5(yp8 yp8Var, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, int i) {
        this.b = 1;
        this.d = yp8Var;
        this.e = vkOnboardingStat$Delegate;
        this.c = i;
    }
}
