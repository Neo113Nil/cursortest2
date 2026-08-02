package xsna;

import com.vk.voip.ui.share.link.pager_new.model.SharingReason;
import com.vk.voip.ui.share.link.pager_new.model.VoipShareLinkSheetButton;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;
import xsna.y1x0;
import xsna.z1x0;

/* compiled from: VoipShareLinkPagerReducer.kt */
/* loaded from: classes7.dex */
public final class p1x0 extends dm50<a2x0, y1x0, z1x0> {
    public final VoipShareLinkSheetButton d;
    public final VoipShareLinkSheetButton e;
    public final VoipShareLinkSheetButton f;

    /* compiled from: VoipShareLinkPagerReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SharingReason.values().length];
            try {
                iArr[SharingReason.Privacy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SharingReason.Expiration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SharingReason.PrivacyAndExpiration.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p1x0() {
        super(z1x0.b.b);
        this.d = new VoipShareLinkSheetButton(tq.h(tlo0.Companion, R.string.voip_share_link_pager_bottom_sheet_chat), VoipShareLinkSheetButton.Type.ShareInChat);
        this.e = new VoipShareLinkSheetButton(new tlo0.f(R.string.voip_share_link_pager_bottom_sheet_system_share), VoipShareLinkSheetButton.Type.SystemSharing);
        this.f = new VoipShareLinkSheetButton(new tlo0.f(R.string.voip_share_link_pager_bottom_sheet_call), VoipShareLinkSheetButton.Type.ForceCall);
    }

    @Override // xsna.dm50
    public final z1x0 c(z1x0 z1x0Var, y1x0 y1x0Var) {
        y1x0 y1x0Var2 = y1x0Var;
        if (!(y1x0Var2 instanceof y1x0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        y1x0.a aVar = (y1x0.a) y1x0Var2;
        return new z1x0.a(aVar.b, aVar.c, aVar.d, aVar.e);
    }

    @Override // xsna.dm50
    public final a2x0 d() {
        return new a2x0(e(new xep0(9)), e(new c3k0(this, 23)));
    }

    @Override // xsna.dm50
    public final void h(z1x0 z1x0Var, a2x0 a2x0Var) {
        z1x0 z1x0Var2 = z1x0Var;
        a2x0 a2x0Var2 = a2x0Var;
        if (z1x0Var2 instanceof z1x0.a) {
            f(a2x0Var2.b, z1x0Var2);
        } else {
            if (!(z1x0Var2 instanceof z1x0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(a2x0Var2.a, z1x0Var2);
        }
    }
}
