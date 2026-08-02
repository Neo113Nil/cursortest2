package xsna;

import android.content.Context;
import com.vk.catalog.mvi.block.video.impl.video.list.c;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import com.vk.log.L;
import com.vk.video.profile.presentation.VideoProfileSource;
import com.vk.video.profile.presentation.f;
import com.vk.video.profile.presentation.h;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vk.voip.ui.hint.VoipHintView;
import com.vk.voip.ui.hint.a;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x7t0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x7t0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String string;
        switch (this.b) {
            case 0:
                com.vk.video.profile.presentation.c cVar = (com.vk.video.profile.presentation.c) this.c;
                c9t0 c9t0Var = (c9t0) this.d;
                Pair pair = (Pair) obj;
                k8t0 k8t0Var = cVar.h;
                f4z<com.vk.video.profile.presentation.h> f4zVar = cVar.A;
                k8t0Var.a(new h8t0(((u490) pair.i()).a.i(16), ((u490) pair.i()).a.b, c9t0Var.b instanceof VideoProfileSource.OwnProfile));
                cVar.T(new f.e.c((List) pair.j(), (u490) pair.i()));
                u490 u490Var = (u490) pair.i();
                h7v h7vVar = cVar.m;
                if (u490Var.q != null || u490Var.r != null) {
                    String id = HintId.CHANNEL_DONUT_BUTTON_TOOLTIP.getId();
                    Hint p = h7vVar.p(id);
                    if (h7vVar.a(id) && p != null && (str = p.d) != null && str.length() != 0 && !(c9t0Var.b instanceof VideoProfileSource.OwnProfile)) {
                        f4zVar.b(new h.u(str));
                    }
                }
                u490 u490Var2 = (u490) pair.i();
                if (com.vk.toggle.d.c() != null) {
                    boolean b = fkq0.b(u490Var2.a.b);
                    zog zogVar = u490Var2.b;
                    boolean z = zogVar.a || zogVar.b;
                    if (b && z) {
                        String id2 = HintId.CREATORS_DASHBOARD_WEBVIEW.getId();
                        Hint p2 = h7vVar.p(id2);
                        if (h7vVar.a(id2) && p2 != null && (str2 = p2.c) != null && str2.length() != 0) {
                            f4zVar.b(new h.y(str2));
                        }
                    }
                }
                u490 u490Var3 = (u490) pair.i();
                if (cVar.r) {
                    cVar.X().a(u490Var3, false);
                }
                break;
            case 1:
                crt0 crt0Var = (crt0) this.c;
                CachedVideoViewedSegments cachedVideoViewedSegments = (CachedVideoViewedSegments) this.d;
                L.p((Throwable) obj, cachedVideoViewedSegments);
                crt0Var.a.a(cachedVideoViewedSegments);
                break;
            case 2:
                s2u0 s2u0Var = (s2u0) obj;
                ((izs) this.c).invoke(new c.e(((vst0) this.d).b, s2u0Var.a, s2u0Var.b));
                break;
            case 3:
                ((tdu) obj).b((((Boolean) ((mtk0) this.d).getValue()).booleanValue() && ((ButtonStyle) this.c) == ButtonStyle.Link) ? 0.7f : 1.0f);
                break;
            case 4:
                ((paw0) this.c).l.a(((ebf0) this.d).b);
                break;
            case 5:
                ((agw0) this.c).h6(((VoipCallByLinkViewState.ContentDialog.Item.Setting) this.d).b);
                break;
            case 6:
                com.vk.voip.ui.hint.a aVar = (com.vk.voip.ui.hint.a) this.c;
                jf8 jf8Var = (jf8) this.d;
                whr0 whr0Var = (whr0) ((it80) obj).a;
                VoipHintView voipHintView = aVar.a;
                boolean z2 = jf8Var.a;
                whr0 whr0Var2 = jf8Var.b;
                a.EnumC2056a enumC2056a = a.EnumC2056a.BroadcastFinished;
                if (enumC2056a.h() >= aVar.a()) {
                    String str3 = whr0Var2.a;
                    boolean z3 = whr0Var2.c;
                    com.vk.voip.ui.c.b.getClass();
                    CallMemberId a = com.vk.voip.ui.c.r.a();
                    if (!epx.f(str3, a != null ? a.b : null)) {
                        Context context = voipHintView.getContext();
                        String r = rte0.r(whr0Var != null ? whr0Var.q : null);
                        if (z2) {
                            if (r == null) {
                                r = whr0Var2.e();
                            }
                            string = context.getString(z3 ? R.string.voip_smb_ended_broadcast_record_f : R.string.voip_smb_ended_broadcast_record, r);
                        } else {
                            if (r == null) {
                                r = whr0Var2.e();
                            }
                            string = context.getString(z3 ? R.string.voip_smb_ended_broadcast_f : R.string.voip_smb_ended_broadcast, r);
                        }
                        voipHintView.a(new VoipHintView.a(string, Integer.valueOf(z2 ? R.drawable.vk_icon_recorder_tape_slash_outline_28 : R.drawable.vk_icon_live_slash_outline_28), null, null, false, 28));
                        voipHintView.setVisibility(0);
                        aVar.i = enumC2056a;
                        aVar.j(io.reactivex.rxjava3.core.a.s(3000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new h9b(aVar, 4)));
                    }
                }
                break;
            default:
                s1y0 s1y0Var = (s1y0) this.c;
                c1y0 c1y0Var = (c1y0) this.d;
                if (s1y0Var != null) {
                    s1y0Var.a(c1y0Var.b.getInputState());
                }
                break;
        }
        return s3q0.a;
    }
}
