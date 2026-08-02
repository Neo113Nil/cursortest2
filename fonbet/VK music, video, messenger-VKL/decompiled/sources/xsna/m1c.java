package xsna;

import com.coremedia.iso.boxes.FreeSpaceBox;
import com.ironsource.O6;
import com.vk.auth.api.models.AuthResult;
import com.vk.superapp.api.dto.auth.VkCheckSilentTokenStep;
import com.vk.superapp.api.states.VkAuthState;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CheckSilentTokenRequest.kt */
/* loaded from: classes6.dex */
public final class m1c extends r56 {
    public final VkAuthState f;

    public m1c(String str, int i, String str2, String str3, String str4, VkAuthState vkAuthState, String str5) {
        super(zr.a("https://", str, "/check_silent_token"), i, true);
        this.f = vkAuthState;
        ArrayList arrayList = vkAuthState.e;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((VkCheckSilentTokenStep) it.next()).h());
        }
        String k = p4g.k(arrayList2, StringUtils.COMMA, null);
        i("token", str2);
        i("uuid", str3);
        i(FreeSpaceBox.TYPE, k);
        i(O6.e1, str4);
        i("validate_session", (String) this.f.d.get("validate_session"));
        if (str5 != null) {
            i("super_app_token", str5);
        }
    }

    @Override // xsna.r56
    public final AuthResult n(com.vk.superapp.core.api.models.a aVar) {
        return v25.a(aVar, this.f, 12);
    }
}
