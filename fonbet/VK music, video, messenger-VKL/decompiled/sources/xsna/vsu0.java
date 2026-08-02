package xsna;

import android.net.Uri;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkExternalAuthModel.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class vsu0 extends FunctionReferenceImpl implements izs<Uri, String> {
    public static final vsu0 b = new vsu0(1, Uri.class, "toString", "toString()Ljava/lang/String;", 0);

    @Override // xsna.izs
    public final String invoke(Uri uri) {
        return uri.toString();
    }
}
