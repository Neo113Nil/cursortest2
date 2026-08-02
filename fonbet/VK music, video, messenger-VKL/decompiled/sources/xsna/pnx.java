package xsna;

import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;

/* compiled from: InternalWebRouter.kt */
/* loaded from: classes6.dex */
public interface pnx {
    void b(UserId userId, boolean z);

    void c(VkAlertData vkAlertData, SuperappUiRouterBridge.d dVar);

    void d(String str);

    void e();

    void f(Intent intent);

    void finish();

    void g();

    default void a(UserId userId, UserId userId2) {
    }
}
