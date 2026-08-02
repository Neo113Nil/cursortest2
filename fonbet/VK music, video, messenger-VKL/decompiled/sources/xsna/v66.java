package xsna;

import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: BaseAuthRequest.kt */
/* loaded from: classes6.dex */
public abstract class v66<T> extends rdx0<T> {
    public v66(String str) {
        super(str);
        Iterator it = RegistrationStatParamsFactory.a().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            j((String) pair.d(), (String) pair.g());
        }
        this.r = true;
        this.c = true;
        this.d = true;
    }
}
