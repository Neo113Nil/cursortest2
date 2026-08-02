package defpackage;

import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.security.impl.internal.devicechallenge.a;
import java.security.Signature;

/* loaded from: classes2.dex */
public final /* synthetic */ class gaj implements tls {
    public final /* synthetic */ a a;
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ String w;
    public final /* synthetic */ int x;
    public final /* synthetic */ wls y;

    public /* synthetic */ gaj(a aVar, FragmentActivity fragmentActivity, byte[] bArr, String str, int i, wls wlsVar) {
        this.a = aVar;
        this.b = fragmentActivity;
        this.c = bArr;
        this.w = str;
        this.x = i;
        this.y = wlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        FragmentActivity fragmentActivity = this.b;
        byte[] bArr = this.c;
        String str = this.w;
        int i = this.x;
        wls wlsVar = this.y;
        ay5 ay5Var = (ay5) obj;
        a aVar = this.a;
        z22 z22Var = aVar.a;
        try {
            Signature signature = ay5Var.a;
            if (signature != null) {
                signature.update(bArr);
                String encodeToString = Base64.encodeToString(signature.sign(), 2);
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new rz5(encodeToString));
                aVar.a(fragmentActivity, str, i, encodeToString, wlsVar);
            }
        } catch (Exception e) {
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new oz5(String.valueOf(e.getMessage())));
            aVar.a(fragmentActivity, str, i, null, wlsVar);
        }
        return zy11.a;
    }
}
