package xsna;

import androidx.fragment.app.FragmentActivity;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class hx50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hx50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                nx50.N0((nx50) this.c, ((Integer) obj).intValue(), null, 14);
                break;
            default:
                FragmentActivity fragmentActivity = (FragmentActivity) this.c;
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.d()).booleanValue();
                boolean booleanValue2 = ((Boolean) pair.g()).booleanValue();
                if (booleanValue || booleanValue2) {
                    dhr0.a.i(fragmentActivity);
                }
                break;
        }
        return s3q0.a;
    }
}
