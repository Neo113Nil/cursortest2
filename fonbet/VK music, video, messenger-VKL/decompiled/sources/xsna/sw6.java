package xsna;

import androidx.credentials.provider.CreateEntry;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import java.util.function.Function;
import xsna.rg30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class sw6 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ sw6(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        CreateEntry convertToJetpackResponse$lambda$2;
        switch (this.a) {
            case 0:
                convertToJetpackResponse$lambda$2 = BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$2(this.b, obj);
                return convertToJetpackResponse$lambda$2;
            default:
                return (rg30.a) ((oey) this.b).invoke(obj);
        }
    }
}
