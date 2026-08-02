package androidx.compose.ui;

import defpackage.d530;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Ld530;", "element", "invoke", "(Ljava/lang/String;Ld530;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class CombinedModifier$toString$1 extends Lambda implements wls {
    public static final CombinedModifier$toString$1 w = new CombinedModifier$toString$1(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        d530 d530Var = (d530) obj2;
        if (str.length() == 0) {
            return d530Var.toString();
        }
        return str + Extension.FIX_SPACE + d530Var;
    }
}
