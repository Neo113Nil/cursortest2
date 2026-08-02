package xsna;

import android.os.Handler;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.o1k0;
import xsna.r1k0;
import xsna.rye;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hf80 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hf80(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new a.c((qg80) this.d, ((mc90) this.e).r(), true));
                return s3q0.a;
            case 1:
                rye.b bVar = (rye.b) this.c;
                gtl gtlVar = (gtl) this.d;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.e;
                bVar.d.postDelayed(new ds4(bVar, 2), gtlVar.a);
                bVar.c(cVar);
                return s3q0.a;
            case 2:
                List list = (List) this.d;
                mc90 mc90Var = (mc90) this.e;
                izs izsVar = (izs) this.c;
                r1k0.a aVar = (r1k0.a) list.get(mc90Var.k());
                if ((aVar instanceof r1k0.a.AbstractC3589a.b) || (aVar instanceof r1k0.a.AbstractC3589a.C3590a)) {
                    izsVar.invoke(o1k0.a.a);
                } else {
                    if (!(aVar instanceof r1k0.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar.invoke(o1k0.b.a);
                }
                return s3q0.a;
            case 3:
                izs izsVar2 = (izs) this.c;
                WeakReference weakReference = (WeakReference) this.d;
                Handler handler = (Handler) this.e;
                if (izsVar2 != null) {
                    izsVar2.invoke(weakReference);
                }
                handler.removeCallbacksAndMessages(null);
                return s3q0.a;
            default:
                xkx0 xkx0Var = (xkx0) this.c;
                String str = (String) this.d;
                VkAuthValidateAccountResponse vkAuthValidateAccountResponse = (VkAuthValidateAccountResponse) this.e;
                pir0 pir0Var = xkx0Var.G;
                List<VkAuthValidateAccountResponse.ValidateAccountFlow> list2 = vkAuthValidateAccountResponse.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (((VkAuthValidateAccountResponse.ValidateAccountFlow) obj) != VkAuthValidateAccountResponse.ValidateAccountFlow.TRUSTED_HASH) {
                        arrayList.add(obj);
                    }
                }
                pir0.c(pir0Var, str, VkAuthValidateAccountResponse.a(vkAuthValidateAccountResponse, arrayList));
                return s3q0.a;
        }
    }

    public /* synthetic */ hf80(List list, yjl yjlVar, izs izsVar) {
        this.b = 2;
        this.d = list;
        this.e = yjlVar;
        this.c = izsVar;
    }
}
