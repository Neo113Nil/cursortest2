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
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import java.util.Set;

/* compiled from: CommonCallsBridge.kt */
/* loaded from: classes11.dex */
public final class cig implements kyv {
    public final aow0 a;

    public cig(aow0 aow0Var) {
        this.a = aow0Var;
    }

    @Override // xsna.kyv
    public final void a(FragmentActivity fragmentActivity, DialogExt dialogExt, VoipCallSource voipCallSource, boolean z, Set set) {
        wzv.i(dialogExt, voipCallSource, z, mhw0.a(set));
    }

    @Override // xsna.kyv
    public final void b() {
        this.a.a(new jb(10));
    }

    @Override // xsna.kyv
    public final void c(Context context, VoipCallSource voipCallSource, Set<? extends CallStartAction> set) {
        wzv.j(voipCallSource, mhw0.a(set));
    }

    @Override // xsna.kyv
    public final void d(Context context, VoipCallSource voipCallSource, UserId userId, boolean z) {
        new wzv(context).h(voipCallSource, userId, z);
    }

    @Override // xsna.kyv
    public final void e(Context context, JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2, esa esaVar) {
        wzv.g(joinData, voipCallSource, z, z2, esaVar);
    }

    @Override // xsna.kyv
    public final boolean f(long j, Context context) {
        return wzv.c(j);
    }

    @Override // xsna.kyv
    public final void g(Context context) {
        wzv.b();
    }

    @Override // xsna.kyv
    public final void h(Context context, VoipCallSource voipCallSource, String str, String str2) {
        x69.a(context, new zle(this, context, voipCallSource, 1));
    }

    @Override // xsna.kyv
    public final io.reactivex.rxjava3.internal.operators.single.y i() {
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.c0.getClass();
        return q39.e.b().K().l(new ps2(new com.vk.movika.sdk.base.observable.i(18), 12));
    }

    @Override // xsna.kyv
    public final void j(FragmentActivity fragmentActivity, String str) {
        qxm0.t(fragmentActivity, str);
    }

    @Override // xsna.kyv
    public final void k(Context context, UserProfile userProfile, VoipCallSource voipCallSource, MaxButtonVariants maxButtonVariants) {
        x69.c(context, userProfile, voipCallSource, maxButtonVariants);
    }

    @Override // xsna.kyv
    public final void l(Context context, qtd0 qtd0Var, VoipCallSource voipCallSource, MaxButtonVariants maxButtonVariants) {
        x69.d(context, qtd0Var, voipCallSource, maxButtonVariants);
    }

    @Override // xsna.kyv
    public final void m(Context context, VoipCallSource voipCallSource, Set<? extends CallStartAction> set) {
        x69.b(context, new yn7(context, voipCallSource, set));
    }

    @Override // xsna.kyv
    public final void n(Context context, JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2, UserId userId) {
        wzv.f(joinData, voipCallSource, z, z2, userId);
    }

    @Override // xsna.kyv
    public final void o(Context context, JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2) {
        wzv.d(joinData, voipCallSource, z, z2);
    }

    @Override // xsna.kyv
    public final void p(Context context, Contact contact, VoipCallSource voipCallSource) {
        wzv.k(contact, voipCallSource);
    }

    @Override // xsna.kyv
    public final void q(Context context) {
        new VoipCallServiceFragment.a().k(context);
    }

    @Override // xsna.kyv
    public final void r(Context context, wt2 wt2Var, VoipCallSource voipCallSource, boolean z, boolean z2) {
        wzv.e(wt2Var, voipCallSource, z, z2);
    }
}
