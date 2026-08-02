package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;

/* compiled from: SuperAppRouter.kt */
/* loaded from: classes11.dex */
public interface cbn0 {
    static /* synthetic */ void c(cbn0 cbn0Var, Context context, WebApiApplication webApiApplication, String str, UserId userId, String str2, int i) {
        if ((i & 16) != 0) {
            userId = null;
        }
        cbn0Var.d(context, webApiApplication, str, null, userId, (i & 32) != 0 ? null : str2);
    }

    static /* synthetic */ void i(cbn0 cbn0Var, Context context, long j, String str, int i) {
        if ((i & 8) != 0) {
            str = null;
        }
        cbn0Var.a(context, j, str);
    }

    void a(Context context, long j, String str);

    void b(Context context, long j, String str);

    void d(Context context, WebApiApplication webApiApplication, String str, Integer num, UserId userId, String str2);

    void e(FragmentActivity fragmentActivity);

    void f(FragmentActivity fragmentActivity, FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod);

    @ozl
    void g(ww50<?> ww50Var, String str);

    void h(Context context);
}
