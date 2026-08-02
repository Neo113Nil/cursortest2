package xsna;

import com.vk.core.dynamic_loader.b;
import com.vk.core.utils.newtork.d;
import com.vk.dto.hints.Hint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ta3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ta3(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 1:
                return new ArrayList((List) obj);
            case 2:
                if (((com.vk.core.utils.newtork.d) obj) instanceof d.b) {
                    Iterator<T> it = com.vk.core.dynamic_loader.b.i.values().iterator();
                    while (it.hasNext()) {
                        ((io.reactivex.rxjava3.subjects.d) it.next()).onNext(b.AbstractC0762b.a.a);
                    }
                }
                return s3q0.a;
            case 3:
                return new io.reactivex.rxjava3.internal.operators.single.b(new com.vk.movika.sdk.base.hooks.k((Hint) obj, 29));
            default:
                return Boolean.valueOf(epx.f(((Hint) obj).getId(), "feed:after_auth:unban_security_recommendation"));
        }
    }

    public /* synthetic */ ta3(gwt gwtVar) {
        this.b = 3;
    }
}
