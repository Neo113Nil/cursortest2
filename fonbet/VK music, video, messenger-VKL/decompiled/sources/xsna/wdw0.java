package xsna;

import com.vk.common.links.contract.AnonymousLinker;
import com.vk.voip.invite.AnonymCallInviteFragment;
import com.vkontakte.android.MainActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.dlw0;

/* compiled from: VoipAnonymousJoinToCallHandler.kt */
/* loaded from: classes7.dex */
public final class wdw0 {

    /* compiled from: VoipAnonymousJoinToCallHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnonymousLinker.CallLinkType.values().length];
            try {
                iArr[AnonymousLinker.CallLinkType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnonymousLinker.CallLinkType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(MainActivity mainActivity, AnonymousLinker.a aVar, tkw0 tkw0Var, fb8 fb8Var) {
        String str = aVar.b;
        int i = a.$EnumSwitchMapping$0[aVar.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tkw0Var.a(mainActivity, new dlw0.a(str), new zlt(fb8Var, null, yfb.b(new Pair("before_auth", Boolean.TRUE), new Pair("request_code", 1231)), 5));
        } else {
            int i2 = AnonymCallInviteFragment.T;
            AnonymCallInviteFragment.b bVar = new AnonymCallInviteFragment.b();
            bVar.j.putString("vkJoinLink", str);
            bVar.h(mainActivity, 1231);
        }
    }
}
