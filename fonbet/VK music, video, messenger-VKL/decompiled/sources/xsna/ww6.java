package xsna;

import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class ww6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ ww6(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean convertToJetpackResponse$lambda$13;
        switch (this.a) {
            case 0:
                convertToJetpackResponse$lambda$13 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$13(this.b, obj);
                return convertToJetpackResponse$lambda$13;
            case 1:
                return ((Boolean) ((igh) this.b).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((uv20) this.b).invoke(obj)).booleanValue();
        }
    }
}
