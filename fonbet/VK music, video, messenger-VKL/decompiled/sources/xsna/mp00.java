package xsna;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.ads.DisclaimerBannerData;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.m2m;
import xsna.p0n;
import xsna.r0n;
import xsna.ti50;
import xsna.uf00;
import xsna.wih0;
import xsna.zu;

/* compiled from: MarketAdsItemMainOverlayMapper.kt */
/* loaded from: classes17.dex */
public final class mp00 extends oy8<nf00, uf00> {
    public final yu b;
    public final b1n c = new b1n();
    public final c590 d;

    public mp00(yof yofVar, d11 d11Var) {
        this.b = new yu(yofVar, false);
        this.d = new c590(d11Var.a);
    }

    @Override // xsna.oy8
    public final uf00 b(nf00 nf00Var) {
        boolean z;
        DescriptionViewState bVar;
        int i;
        int i2;
        r0n bVar2;
        nf00 nf00Var2 = nf00Var;
        tgg tggVar = nf00Var2.c;
        hr00 hr00Var = nf00Var2.b;
        if (!nf00Var2.a) {
            return new uf00.a(hr00Var.g);
        }
        String str = hr00Var.g;
        wih0.b.a aVar = hr00Var.b;
        SdkActionLink sdkActionLink = hr00Var.c;
        SdkOwner sdkOwner = aVar.e;
        boolean f = epx.f(sdkOwner != null ? Boolean.valueOf(sdkOwner.g) : null, Boolean.TRUE);
        boolean z2 = false;
        if (hr00Var.c != null) {
            z = false;
            z2 = true;
        } else {
            z = false;
        }
        cv cvVar = nf00Var2.f;
        lw a = this.b.a(new zu(sdkActionLink, f, zu.a.b.a, z2, cvVar.a, null, cvVar.b, cvVar.c));
        m2m m2mVar = hr00Var.f;
        String str2 = hr00Var.d;
        boolean z3 = nf00Var2.e;
        if (m2mVar instanceof m2m.b) {
            CharSequence charSequence = ((m2m.b) m2mVar).a;
            bVar = myc0.f(charSequence) ? new DescriptionViewState.b(charSequence, str2, DescriptionViewState.ExpansionState.STATIC) : DescriptionViewState.a.a;
        } else {
            if (!(m2mVar instanceof m2m.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = z3 ? new DescriptionViewState.b(((m2m.a) m2mVar).b, str2, DescriptionViewState.ExpansionState.EXPANDED) : new DescriptionViewState.b(((m2m.a) m2mVar).a, str2, DescriptionViewState.ExpansionState.COLLAPSED);
        }
        ti50.a aVar2 = ti50.a.a;
        DisclaimerBannerData disclaimerBannerData = tggVar.b;
        DisclaimerBannerData.DisclaimerType disclaimerType = disclaimerBannerData != null ? disclaimerBannerData.b : null;
        int i3 = disclaimerType == null ? -1 : p0n.a.$EnumSwitchMapping$0[disclaimerType.ordinal()];
        if (i3 == 1) {
            i = R.drawable.vk_icon_illustration_disclaimer_bad_feed_360w;
        } else if (i3 == 2) {
            i = R.drawable.vk_icon_illustration_disclaimer_contraindications_feed_360w;
        } else if (i3 == 3) {
            i = R.drawable.vk_icon_illustration_disclaimer_credits_feed_360w;
        } else if (i3 == 4) {
            i = R.drawable.vk_icon_illustration_disclaimer_bankruptcy_360w;
        } else {
            if (i3 != 5) {
                bVar2 = r0n.a.a;
                return new uf00.b(str, a, bVar, aVar2, bVar2, b1n.a(this.c, tggVar, nf00Var2.d, false, 4), this.d.a(new g590(EmptyList.b, aVar.e, aVar.f, new e590(aVar.i), false)));
            }
            i = R.drawable.vk_icon_illustration_disclaimer_energy_drinks_360w;
        }
        int i4 = p0n.a.$EnumSwitchMapping$0[disclaimerBannerData.b.ordinal()];
        if (i4 == 1) {
            i2 = R.string.clips_disclaimer_supplements;
        } else if (i4 == 2) {
            i2 = R.string.clips_disclaimer_drug;
        } else if (i4 == 3) {
            i2 = R.string.clips_disclaimer_loan;
        } else if (i4 == 4) {
            i2 = R.string.clips_disclaimer_bankruptcy;
        } else {
            if (i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.clips_disclaimer_energetics;
        }
        bVar2 = new r0n.b(i, tq.h(tlo0.Companion, i2), disclaimerBannerData.c, disclaimerBannerData.d);
        return new uf00.b(str, a, bVar, aVar2, bVar2, b1n.a(this.c, tggVar, nf00Var2.d, false, 4), this.d.a(new g590(EmptyList.b, aVar.e, aVar.f, new e590(aVar.i), false)));
    }
}
