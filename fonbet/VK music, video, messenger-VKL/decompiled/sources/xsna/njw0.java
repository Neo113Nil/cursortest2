package xsna;

import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.hint.VoipHintView;
import com.vk.voip.ui.hint.a;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: VoipCallView.kt */
/* loaded from: classes7.dex */
public final class njw0 implements OKVoipEngine.a {
    public final /* synthetic */ mjw0 a;

    public njw0(mjw0 mjw0Var) {
        this.a = mjw0Var;
    }

    @Override // com.vk.voip.OKVoipEngine.a
    public final void b(String str, boolean z) {
        kiu kiuVar;
        com.vk.voip.ui.hint.a aVar = this.a.W;
        VoipHintView voipHintView = aVar.a;
        if (a.EnumC2056a.AdminStateChanged.h() < aVar.a()) {
            return;
        }
        aVar.c.getClass();
        Iterator<kiu> it = GroupCallViewModel.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                kiuVar = null;
                break;
            } else {
                kiuVar = it.next();
                if (epx.f(kiuVar.a.a.b, str)) {
                    break;
                }
            }
        }
        kiu kiuVar2 = kiuVar;
        if (kiuVar2 != null) {
            voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString(z ? R.string.voip_admin_state_changed_hint_me : kiuVar2.i ? R.string.voip_admin_state_changed_hint_female : R.string.voip_admin_state_changed_hint_male, com.vk.voip.ui.hint.a.b(kiuVar2)), Integer.valueOf(R.drawable.vk_icon_user_star_badge_outline_28), null, null, false, 28));
            voipHintView.setVisibility(0);
            aVar.i = a.EnumC2056a.AdminStateChanged;
            aVar.j(io.reactivex.rxjava3.core.a.s(3000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qbp(aVar, 3)));
        }
    }

    @Override // com.vk.voip.OKVoipEngine.a
    public final void a(boolean z) {
    }
}
