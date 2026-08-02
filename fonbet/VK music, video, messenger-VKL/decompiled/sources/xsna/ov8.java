package xsna;

import android.content.Context;
import com.vk.cachecontrol.impl.CacheComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.di.component.app.AppContextDiComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ov8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ov8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CacheComponentImpl.d;
                return new gw8(((AppContextDiComponent) obj2).a, ((CacheComponentImpl) obj).yc());
            default:
                String str = (String) obj;
                Preference.a.getClass();
                return new auj0(Preference.r((Context) obj2, str), str);
        }
    }
}
