package ru.rustore.sdk.pushclient.y;

import android.content.ComponentName;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import com.vk.push.core.utils.PackageExtenstionsKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.lfy0;
import xsna.zr;

/* loaded from: classes9.dex */
public final /* synthetic */ class b$e extends FunctionReferenceImpl implements izs<String, ComponentName> {
    @Override // xsna.izs
    public final ComponentName invoke(String str) {
        String str2 = str;
        lfy0 lfy0Var = (lfy0) this.receiver;
        int i = lfy0.o;
        ComponentName findServiceByAction = PackageExtenstionsKt.findServiceByAction(lfy0Var.getContext(), str2, ComponentActions.PUSH_SERVICE_ACTION);
        if (findServiceByAction != null) {
            return findServiceByAction;
        }
        Logger.DefaultImpls.warn$default(lfy0Var.getLogger(), zr.a("Unable to resolve service in ", str2, " by action com.vk.push.PUSH_SERVICE, try connect to com.vk.push.pushsdk.ipc.PushService"), null, 2, null);
        return new ComponentName(str2, "com.vk.push.pushsdk.ipc.PushService");
    }
}
