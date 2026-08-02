package com.yandex.messenger.emoji;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.am2;
import defpackage.ftn;
import defpackage.j45;
import defpackage.pey;
import defpackage.pyh0;
import defpackage.pyr;
import defpackage.scc;
import defpackage.syr;
import defpackage.xwv;
import defpackage.z83;
import defpackage.zmg0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/messenger/emoji/BaseMessengerEmojiInitializer;", "Lxwv;", "Lzy11;", "messaging-emoji-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class BaseMessengerEmojiInitializer implements xwv {
    public static final List a = scc.g(48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 42, 35, 169);

    @Override // defpackage.xwv
    public final Object create(Context context) {
        z83.i();
        syr syrVar = new syr(context, new pyr(context.getString(pyh0.provider_authority), context.getString(pyh0.provider_package), context.getString(pyh0.font_query), zmg0.com_google_android_gms_fonts_certs));
        syrVar.b = true;
        syrVar.a(a);
        syrVar.e = 1;
        ftn.d(syrVar);
        pey peyVar = (pey) am2.j(context).l();
        peyVar.getLifecycle().a(new j45(0, peyVar));
        return zy11.a;
    }

    @Override // defpackage.xwv
    public final List dependencies() {
        return scc.i(ProcessLifecycleInitializer.class);
    }
}
