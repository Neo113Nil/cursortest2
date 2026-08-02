package xsna;

import android.content.Context;
import com.vk.core.voip.VoipCallSource;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogExt;
import java.lang.ref.WeakReference;
import xsna.phw0;

/* compiled from: ChatCallsActionsHandler.kt */
/* loaded from: classes2.dex */
public final class umb {
    public final Context a;
    public final DialogExt b;
    public final com.vk.im.engine.models.c c;
    public final kyv d;
    public final phw0 e;

    public umb(Context context, DialogExt dialogExt, com.vk.im.engine.models.c cVar, kyv kyvVar, phw0 phw0Var) {
        this.a = context;
        this.b = dialogExt;
        this.c = cVar;
        this.d = kyvVar;
        this.e = phw0Var;
    }

    public final void a(biu biuVar, VoipCallSource voipCallSource) {
        DialogExt dialogExt = this.b;
        long j = dialogExt.e;
        kyv kyvVar = this.d;
        Context context = this.a;
        if (kyvVar.f(j, context)) {
            kyvVar.g(context);
            return;
        }
        WeakReference weakReference = new WeakReference(context);
        String str = (String) biuVar.c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = (String) biuVar.b;
        String title = dialogExt.getTitle();
        ChatSettings Bb = dialogExt.Bb();
        this.e.d(new phw0.d(weakReference, str2, voipCallSource, str3, title, Bb != null ? Bb.c : null, 0, null, 448));
    }
}
