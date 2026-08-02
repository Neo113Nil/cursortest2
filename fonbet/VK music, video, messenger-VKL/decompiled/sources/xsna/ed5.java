package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.notifications.NotificationButton;
import com.vk.dto.notifications.NotificationItem;
import com.vk.profile.user.impl.UserProfileDialogs;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.moq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ed5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ed5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.vk.movika.sdk.base.ui.m] */
    /* JADX WARN: Type inference failed for: r10v0, types: [xsna.bj70, xsna.iwu] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                UserId userId = (UserId) obj3;
                jd5 jd5Var = (jd5) obj4;
                VideoFile videoFile = (VideoFile) obj2;
                if (!epx.f((UserId) obj, userId)) {
                    break;
                } else {
                    break;
                }
            case 1:
                ((f0r) obj3).j((nj50) obj4, (qih0) obj, (wzs) obj2, null);
                break;
            case 2:
                ka70 ka70Var = (ka70) obj3;
                TextView textView = (TextView) obj4;
                NotificationButton notificationButton = (NotificationButton) obj2;
                c970 c970Var = ka70Var.n;
                if (c970Var != 0) {
                    Context context = textView.getContext();
                    NotificationItem item = ka70Var.p.getItem();
                    c970Var.c(context, ka70Var.s, notificationButton.f, item, ka70Var.l);
                }
                break;
            case 3:
                com.vk.movika.sdk.base.hooks.p pVar = (com.vk.movika.sdk.base.hooks.p) obj4;
                if (((zfj0) obj3).a.b()) {
                    pVar.invoke(new IllegalStateException("User must be logged in"));
                }
                break;
            case 4:
                smm0 smm0Var = (smm0) obj3;
                String str = (String) obj4;
                x1d0 x1d0Var = (x1d0) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    break;
                }
            case 5:
                ((Ref$ObjectRef) obj3).element = new com.vk.movika.sdk.base.ui.m(28, (UserProfileDialogs) obj2, (moq0.a) obj);
                VkContextMenu vkContextMenu = (VkContextMenu) ((Ref$ObjectRef) obj4).element;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                break;
            case 6:
                VkTopBarVh vkTopBarVh = (VkTopBarVh) obj3;
                View view = (View) obj4;
                UIBlockList uIBlockList = (UIBlockList) obj2;
                String str2 = (String) obj;
                VkContextMenu vkContextMenu2 = vkTopBarVh.p;
                if (vkContextMenu2 != null) {
                    vkContextMenu2.b();
                }
                eda edaVar = vkTopBarVh.h;
                if (edaVar != null) {
                    Context context2 = view.getContext();
                    String str3 = uIBlockList.b;
                    bpn0 bpn0Var = cqm0.a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    edaVar.e(context2, str3, str2, vkTopBarVh);
                }
                break;
            default:
                ((zhw0) obj4).c0((UserId) obj3, (yiw0) obj2, new iiu0(4));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ed5(zhw0 zhw0Var, UserId userId, yiw0 yiw0Var) {
        this.b = 7;
        this.d = zhw0Var;
        this.c = userId;
        this.e = yiw0Var;
    }
}
