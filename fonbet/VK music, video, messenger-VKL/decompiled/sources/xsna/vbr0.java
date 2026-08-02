package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;

/* compiled from: VKGameViewDelegate.kt */
/* loaded from: classes6.dex */
public final class vbr0 {
    public final /* synthetic */ ubr0 a;
    public final /* synthetic */ UserId b;
    public final /* synthetic */ String c;

    public vbr0(ubr0 ubr0Var, UserId userId, String str) {
        this.a = ubr0Var;
        this.b = userId;
        this.c = str;
    }

    public final void a() {
        this.a.c.m(JsApiMethodType.SHOW_INVITE_BOX, VkAppsErrors.Client.USER_DENIED, null, null);
    }
}
