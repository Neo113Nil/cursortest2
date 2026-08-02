package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.ui.utils.ItemType;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.amw0;
import xsna.bjw0;
import xsna.dw20;
import xsna.m5x0;
import xsna.mpw0;
import xsna.nv3;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class kfw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kfw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [T, xsna.dw20] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj;
                gvw0 gvw0Var = ((VoipCallActivity) obj2).A;
                gvw0 gvw0Var2 = gvw0Var != null ? gvw0Var : null;
                fr0 fr0Var = new fr0(izsVar, 7);
                i97 i97Var = new i97(izsVar, 8);
                gvw0.a(gvw0Var2.a);
                gvw0Var2.c = true;
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context context = gvw0Var2.a;
                permissionHelper.getClass();
                permissionHelper.d(context, PermissionHelper.x, R.string.vk_permissions_voip_masks, R.string.vk_permissions_voip_masks_settings, new gd0(21, gvw0Var2, fr0Var), new qum0(6, gvw0Var2, i97Var));
                return s3q0.a;
            case 1:
                return new bjw0.a(((tj50.a) obj).a(new siw0(1, (viw0) obj2, viw0.class, "composeContentState", "composeContentState(Lcom/vk/voip/ui/calls/presentation/model/state/VoipCallServiceState$Ready;)Ljava/util/List;", 0), ao8.d));
            case 2:
                ((vlw0) obj2).T(new amw0.a.C2551a((Throwable) obj));
                return s3q0.a;
            case 3:
                VoipHistoryFriendsFragment voipHistoryFriendsFragment = (VoipHistoryFriendsFragment) obj2;
                mpw0 mpw0Var = (mpw0) obj;
                int i2 = VoipHistoryFriendsFragment.U;
                if (!(mpw0Var instanceof mpw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cvk.w(j03.g(voipHistoryFriendsFragment.requireContext(), ((mpw0.a) mpw0Var).a, R.string.error), false);
                return s3q0.a;
            case 4:
                nrw0 nrw0Var = (nrw0) obj2;
                Context context2 = ((View) obj).getContext();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                dw20.b bVar = new dw20.b(context2, tzp0.a(null, 3));
                com.vk.voip.ui.c.b.getClass();
                nfw0 nfw0Var = com.vk.voip.ui.c.D0;
                ref$ObjectRef.element = bVar.P(e43.l(new brj0(0, 0, null, R.string.voip_asr_online_menu_start_subtitle_enabled, null, false, false, nfw0Var.b.a().b ? ItemType.DEFAULT_WITH_CHECK : ItemType.DEFAULT, 0, null, null, null, Integer.valueOf(context2.getColor(R.color.vk_white)), null, 114422), new brj0(1, 0, null, R.string.voip_asr_online_menu_start_subtitle_disabled, null, false, false, !nfw0Var.b.a().b ? ItemType.DEFAULT_WITH_CHECK : ItemType.DEFAULT, 0, null, null, null, Integer.valueOf(context2.getColor(R.color.vk_white)), null, 114422)), new lyb0(nrw0Var, ref$ObjectRef)).I0("asr_online_selector");
                return s3q0.a;
            case 5:
                o4x0 o4x0Var = (o4x0) obj2;
                whr0 whr0Var = (whr0) j5g.Z(((Map) obj).values());
                if (whr0Var == null) {
                    return s3q0.a;
                }
                mew0 mew0Var = new mew0(o4x0Var.g, o4x0Var.a(), whr0Var, null);
                o4x0Var.f = mew0Var;
                o4x0Var.i.onNext(new nv3.a(mew0Var));
                return s3q0.a;
            case 6:
                L.i((Throwable) obj);
                ((v5x0) obj2).C(m5x0.i.b);
                return s3q0.a;
            default:
                ((x2j0) obj2).invoke();
                ((etv0) obj).b(false);
                return s3q0.a;
        }
    }
}
