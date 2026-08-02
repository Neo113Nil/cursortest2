package xsna;

import com.vk.core.voip.VoipCallSource;
import com.vk.voip.api.join.JoinData;
import com.vkontakte.android.MainActivity;
import java.lang.ref.WeakReference;
import xsna.phw0;

/* compiled from: JoinCallParams.kt */
/* loaded from: classes7.dex */
public final class ozx {
    public static final phw0.d a(nzx nzxVar, MainActivity mainActivity, VoipCallSource voipCallSource, phw0.d.a aVar) {
        WeakReference weakReference = new WeakReference(mainActivity);
        s89 s89Var = nzxVar.b;
        String str = s89Var.c;
        JoinData joinData = s89Var.e;
        String str2 = joinData.b;
        String str3 = s89Var.b;
        if (str3 == null) {
            str3 = "";
        }
        return new phw0.d(weakReference, str, voipCallSource, str2, str3, joinData.d, s89Var.d, aVar, 128);
    }
}
