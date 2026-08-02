package xsna;

import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class cx6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cx6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean convertToJetpackResponse$lambda$10;
        switch (this.a) {
            case 0:
                convertToJetpackResponse$lambda$10 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$10((izs) this.b, obj);
                return convertToJetpackResponse$lambda$10;
            case 1:
                return ((Boolean) ((izs) this.b).invoke(obj)).booleanValue();
            default:
                return ((String) this.b).equals(((Map.Entry) obj).getKey().toString().toLowerCase(Locale.ROOT).replace("-", "."));
        }
    }
}
