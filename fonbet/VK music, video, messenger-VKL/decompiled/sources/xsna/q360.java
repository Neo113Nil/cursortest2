package xsna;

import android.app.Application;
import android.os.Build;
import com.vk.api.sdk.utils.clientagent.model.App;
import com.vk.api.sdk.utils.clientagent.model.ClientAgentKey;
import com.vk.api.sdk.utils.clientagent.model.From;
import com.vk.api.sdk.utils.clientagent.model.OS;
import com.vk.core.apps.BuildInfo;
import java.util.HashSet;
import xsna.elc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class q360 {
    public final /* synthetic */ r360 a;

    public final elc.a a() {
        App app2 = App.VK;
        BuildInfo.Client client = BuildInfo.a;
        String str = (String) BuildInfo.i.getValue();
        String valueOf = String.valueOf(BuildInfo.e);
        OS os = OS.ANDROID;
        String str2 = Build.VERSION.RELEASE;
        Application application = this.a.b;
        HashSet hashSet = iah0.a;
        elc.a aVar = new elc.a(app2, str, valueOf, os, fnj.b(application) ? From.TABLET : From.MOBILE);
        aVar.a.put(ClientAgentKey.SDK, Integer.valueOf(Build.VERSION.SDK_INT));
        return aVar;
    }
}
