package xsna;

import androidx.credentials.provider.CredentialEntry;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class ax6 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ax6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        CredentialEntry convertToJetpackResponse$lambda$8;
        switch (this.a) {
            case 0:
                convertToJetpackResponse$lambda$8 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$8((izs) this.b, obj);
                return convertToJetpackResponse$lambda$8;
            default:
                Map.Entry entry = (Map.Entry) obj;
                return new lqf0((dl20) entry.getKey(), new k0u0((x9l) entry.getKey(), (fu9) entry.getValue(), new ArrayList((List) this.b)));
        }
    }
}
