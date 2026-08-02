package xsna;

import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class tw6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ tw6(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean convertToJetpackResponse$lambda$3;
        switch (this.a) {
            case 0:
                convertToJetpackResponse$lambda$3 = BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$3(this.b, obj);
                return convertToJetpackResponse$lambda$3;
            default:
                return ((Boolean) ((yr00) this.b).invoke(obj)).booleanValue();
        }
    }
}
