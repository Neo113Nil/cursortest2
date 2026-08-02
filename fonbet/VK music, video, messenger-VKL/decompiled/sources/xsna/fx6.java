package xsna;

import android.service.credentials.BeginGetCredentialOption;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class fx6 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fx6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        BeginGetCredentialOption convertToFrameworkRequest$lambda$5;
        switch (this.a) {
            case 0:
                convertToFrameworkRequest$lambda$5 = BeginGetCredentialUtil.Companion.convertToFrameworkRequest$lambda$5((izs) this.b, obj);
                return convertToFrameworkRequest$lambda$5;
            case 1:
                return (fl20) this.b;
            default:
                return (Integer) ((defpackage.o) this.b).invoke(obj);
        }
    }
}
