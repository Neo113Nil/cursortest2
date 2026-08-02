package xsna;

import com.ironsource.X3;
import com.vk.core.fragments.internal.data.FragmentNavigationControllerState;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.core.serialize.Serializer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class za3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ za3(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 1:
                if (epx.f(obj, Boolean.TRUE)) {
                    return 0;
                }
                return epx.f(obj, Boolean.FALSE) ? 1 : null;
            default:
                FStack fStack = (FStack) obj;
                Serializer.c<FragmentNavigationControllerState> cVar = FragmentNavigationControllerState.CREATOR;
                String canonicalName = fStack.b.b.getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = "";
                }
                return y57.a("\"", canonicalName, "\": ", j5g.g0(fStack.zb(), null, X3.j.d, X3.j.e, 10, new f57(24), 17));
        }
    }
}
