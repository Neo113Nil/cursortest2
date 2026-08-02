package xsna;

import androidx.credentials.provider.Action;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.function.Function;
import one.video.calls.sdk_private.aF;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class dx6 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dx6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Action convertToJetpackResponse$lambda$11;
        switch (this.a) {
            case 0:
                convertToJetpackResponse$lambda$11 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$11((izs) this.b, obj);
                return convertToJetpackResponse$lambda$11;
            default:
                return ((mny0) this.b).a[((aF) obj).ordinal()];
        }
    }
}
