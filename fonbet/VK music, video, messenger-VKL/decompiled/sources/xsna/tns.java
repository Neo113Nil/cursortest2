package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vkontakte.android.R;
import java.util.Map;

/* compiled from: FriendsCleanupRouterImpl.kt */
/* loaded from: classes15.dex */
public final class tns implements rns {
    public final z4f a;

    public tns(z4f z4fVar) {
        this.a = z4fVar;
    }

    @Override // xsna.rns
    public final void a(Context context) {
        Activity h = e3m.h(context);
        if (h != null) {
            new FriendsCleanupFragment.a().h(h, 425);
        }
    }

    @Override // xsna.rns
    public final void b(final Context context) {
        fns fnsVar = new fns(context, R.layout.friends_cleanup_all_friends_deleted_alert);
        fnsVar.a.o = new DialogInterface.OnDismissListener() { // from class: xsna.sns
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String str;
                String str2;
                Map<String, String> map;
                String str3;
                Hint p = ((h7v) tns.this.a.invoke()).p(HintId.FRIENDS_CLEANUP_FIND_NEW_FRIENDS.getId());
                if (p == null || (str = p.c) == null || (str2 = p.d) == null || (map = p.e) == null || (str3 = map.get("action")) == null) {
                    return;
                }
                km0 km0Var = new km0(context, str, str2, str3);
                Integer valueOf = Integer.valueOf(R.drawable.vk_icon_illustration_services_people_120h);
                e.a aVar = km0Var.d;
                aVar.I = valueOf;
                aVar.J = false;
                aVar.B0 = null;
                km0Var.Q0(iah0.a(PsExtractor.AUDIO_STREAM), iah0.a(120));
                km0Var.F0(true);
                km0Var.w0(km0Var.e);
                km0Var.s0(km0Var.f);
                km0Var.j0(km0Var.g, new im0(km0Var, 0));
                km0Var.F(enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_medium, km0Var.c), km0Var.c.getString(R.string.accessibility_close));
                km0Var.b0(new jm0(km0Var, 0));
                km0Var.h = km0Var.I0(km0.i);
            }
        };
        fnsVar.m();
    }
}
