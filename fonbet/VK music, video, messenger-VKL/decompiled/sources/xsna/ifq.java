package xsna;

import android.content.Context;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.e3m;
import xsna.ffq;

/* compiled from: ExternalNpsPollLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class ifq implements hfq {
    public final bfq a;

    public ifq(bfq bfqVar) {
        this.a = bfqVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hfq
    public final void a(Context context, ExternalNpsCondition externalNpsCondition) {
        ffq ffqVar = new ffq(context, externalNpsCondition, this.a);
        ?? r7 = ffqVar.c;
        dw20.b S = new dw20.b((l7s) r7.getValue(), null).D0(ffqVar.a(), false).v0(R.string.clips_external_nps_title).l(((l7s) r7.getValue()).getColor(R.color.vk_gray_900)).S(((l7s) r7.getValue()).getColor(R.color.vk_gray_900));
        l7s l7sVar = (l7s) r7.getValue();
        e3m.a aVar = e3m.a;
        dw20.b s = S.s(m33.a(R.drawable.vk_icon_cancel_outline_28, l7sVar));
        zqf zqfVar = new zqf(ffqVar, 19);
        ffq.a aVar2 = new ffq.a();
        aVar2.a = zqfVar;
        ffqVar.a().setOnCompleteListener(new xy0(10, ffqVar, ((dw20.b) ((dw20.b) s.n(aVar2)).a0(new b1j(ffqVar, 16)).q(false).p(true).J()).c(new jfq(ffqVar.a(), ffq.e)).K0(32).I0(null)));
    }
}
