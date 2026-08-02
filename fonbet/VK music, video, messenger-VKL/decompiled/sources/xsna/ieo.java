package xsna;

import com.vk.im.ui.fragments.WrongPhoneNumberException;
import com.vk.poll.fragments.PollVotersFragment;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ieo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ ieo(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qtd0 qtd0Var;
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "drafts_list_toolbar");
                qgi0.h(tgi0Var, str);
                return s3q0.a;
            case 1:
                t8j t8jVar = (t8j) j5g.a0((List) obj);
                if (t8jVar == null || (qtd0Var = t8jVar.b) == null) {
                    throw new WrongPhoneNumberException(zr.a("Phone number '", str, "' is wrong"));
                }
                return qtd0Var;
            case 2:
                int i2 = PollVotersFragment.a0;
                qgi0.h((tgi0) obj, str);
                return s3q0.a;
            default:
                return (whr0) ((Map) obj).get(str);
        }
    }
}
