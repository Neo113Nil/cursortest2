package xsna;

import com.vk.navigation.NavigationDelegateActivity;
import com.vk.tabbar.core.api.domain.TabbarState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q7v implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q7v(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        TabbarState b;
        switch (this.b) {
            case 0:
                r7v r7vVar = (r7v) this.d;
                NavigationDelegateActivity navigationDelegateActivity = r7vVar.i;
                if (navigationDelegateActivity != null && (b = r7vVar.c.b()) != null) {
                    r7vVar.b.a(navigationDelegateActivity, this.c, b);
                }
                break;
            default:
                ((g4p0) this.d).invoke(Integer.valueOf(this.c));
                break;
        }
        return s3q0.a;
    }
}
