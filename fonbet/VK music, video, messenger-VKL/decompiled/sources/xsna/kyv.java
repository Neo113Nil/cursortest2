package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.bridges.MaxButtonVariants;
import com.vk.im.ui.calls.CallStartAction;
import com.vk.voip.api.join.JoinData;
import java.util.Set;

/* compiled from: ImCallsBridge.kt */
/* loaded from: classes.dex */
public interface kyv {
    void a(FragmentActivity fragmentActivity, DialogExt dialogExt, VoipCallSource voipCallSource, boolean z, Set set);

    void b();

    void c(Context context, VoipCallSource voipCallSource, Set<? extends CallStartAction> set);

    void d(Context context, VoipCallSource voipCallSource, UserId userId, boolean z);

    void e(Context context, JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2, esa esaVar);

    boolean f(long j, Context context);

    void g(Context context);

    void h(Context context, VoipCallSource voipCallSource, String str, String str2);

    io.reactivex.rxjava3.internal.operators.single.y i();

    void j(FragmentActivity fragmentActivity, String str);

    void k(Context context, UserProfile userProfile, VoipCallSource voipCallSource, MaxButtonVariants maxButtonVariants);

    void l(Context context, qtd0 qtd0Var, VoipCallSource voipCallSource, MaxButtonVariants maxButtonVariants);

    void m(Context context, VoipCallSource voipCallSource, Set<? extends CallStartAction> set);

    void n(Context context, JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2, UserId userId);

    void o(Context context, JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2);

    void p(Context context, Contact contact, VoipCallSource voipCallSource);

    void q(Context context);

    void r(Context context, wt2 wt2Var, VoipCallSource voipCallSource, boolean z, boolean z2);
}
