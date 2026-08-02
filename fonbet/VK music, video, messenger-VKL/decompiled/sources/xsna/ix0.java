package xsna;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e21;
import xsna.jvm0;
import xsna.lw;
import xsna.m2m;
import xsna.tf00;
import xsna.ti50;
import xsna.zu;

/* compiled from: AdsItemMainOverlayMapper.kt */
/* loaded from: classes17.dex */
public final class ix0 extends oy8<pf00, tf00> {
    public final yof b;
    public final boolean c;
    public final yu d;
    public final b1n e = new b1n();
    public final c590 f;
    public final c21 g;

    public ix0(d11 d11Var, yof yofVar, boolean z) {
        this.b = yofVar;
        this.c = z;
        this.d = new yu(yofVar, !z);
        this.f = new c590(d11Var.a);
        this.g = new c21(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ac  */
    @Override // xsna.oy8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tf00 b(pf00 pf00Var) {
        DescriptionViewState bVar;
        boolean z;
        boolean z2;
        String P;
        e590 e590Var;
        SdkVideoAdInfo X0;
        pf00 pf00Var2 = pf00Var;
        hw0 hw0Var = pf00Var2.b;
        if (!pf00Var2.a) {
            return new tf00.b(hw0Var.b);
        }
        b21 b21Var = pf00Var2.d;
        e21 bVar2 = (!b21Var.f || this.g.a) ? e21.a.a : new e21.b(b21Var.a, b21Var.b, b21Var.c, b21Var.d, b21Var.e);
        boolean z3 = bVar2 instanceof e21.b;
        String str = hw0Var.b;
        SdkClipVideoFile sdkClipVideoFile = hw0Var.a;
        m2m m2mVar = hw0Var.d;
        String j1 = sdkClipVideoFile.j1();
        if (j1 == null) {
            j1 = "";
        }
        boolean z4 = pf00Var2.f;
        if (m2mVar instanceof m2m.b) {
            CharSequence charSequence = ((m2m.b) m2mVar).a;
            bVar = myc0.f(charSequence) ? new DescriptionViewState.b(charSequence, j1, DescriptionViewState.ExpansionState.STATIC) : DescriptionViewState.a.a;
        } else {
            if (!(m2mVar instanceof m2m.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = z4 ? new DescriptionViewState.b(((m2m.a) m2mVar).b, j1, DescriptionViewState.ExpansionState.EXPANDED) : new DescriptionViewState.b(((m2m.a) m2mVar).a, j1, DescriptionViewState.ExpansionState.COLLAPSED);
        }
        DescriptionViewState descriptionViewState = bVar;
        boolean U = sdkClipVideoFile.U();
        if (sdkClipVideoFile.h1()) {
            SdkActionLink m1 = sdkClipVideoFile.m1();
            if (!epx.f(m1 != null ? m1.e : null, "link_community_with_subscribe") && !dgd.d(sdkClipVideoFile)) {
                z = true;
                jvm0 bVar3 = !z3 ? jvm0.a.a : (z && U) ? jvm0.c.a : (!z || U) ? jvm0.a.a : new jvm0.b(false);
                boolean z5 = bVar3 instanceof jvm0.c;
                z2 = this.c;
                if (!z2) {
                    z5 = false;
                }
                tf00.c cVar = new tf00.c(bVar3, z5);
                SdkActionLink m12 = sdkClipVideoFile.m1();
                boolean U2 = sdkClipVideoFile.U();
                ev evVar = pf00Var2.g;
                lw a = this.d.a(new zu(m12, U2, zu.a.b.a, evVar.a, evVar.b, evVar.c, evVar.d, evVar.e));
                tf00.a aVar = new tf00.a(a, !(a instanceof lw.d) && z2);
                g1n a2 = b1n.a(this.e, pf00Var2.c, pf00Var2.h, z2, 8);
                String str2 = (dgd.d(sdkClipVideoFile) ? (P = sdkClipVideoFile.P()) != null : !((X0 = sdkClipVideoFile.X0()) == null || (P = X0.g) == null)) ? P : "";
                if (dgd.d(sdkClipVideoFile)) {
                    e590Var = new e590(sdkClipVideoFile.M0());
                } else {
                    SdkVideoAdInfo X02 = sdkClipVideoFile.X0();
                    e590Var = new e590(X02 != null ? X02.m : null);
                }
                x590 a3 = this.f.a(new g590(EmptyList.b, sdkClipVideoFile.s(), str2, e590Var, z3));
                boolean z6 = !pf00Var2.i || sdkClipVideoFile.k0();
                return new tf00.d(str, sdkClipVideoFile, descriptionViewState, cVar, aVar, a2, a3, new ti50.b(!z6 ? R.string.video_accessibility_sound_on : R.string.video_accessibility_sound_off, z6), bVar2);
            }
        }
        z = false;
        if (!z3) {
        }
        boolean z52 = bVar3 instanceof jvm0.c;
        z2 = this.c;
        if (!z2) {
        }
        tf00.c cVar2 = new tf00.c(bVar3, z52);
        SdkActionLink m122 = sdkClipVideoFile.m1();
        boolean U22 = sdkClipVideoFile.U();
        ev evVar2 = pf00Var2.g;
        lw a4 = this.d.a(new zu(m122, U22, zu.a.b.a, evVar2.a, evVar2.b, evVar2.c, evVar2.d, evVar2.e));
        tf00.a aVar2 = new tf00.a(a4, !(a4 instanceof lw.d) && z2);
        g1n a22 = b1n.a(this.e, pf00Var2.c, pf00Var2.h, z2, 8);
        if (dgd.d(sdkClipVideoFile)) {
        }
        if (dgd.d(sdkClipVideoFile)) {
        }
        x590 a32 = this.f.a(new g590(EmptyList.b, sdkClipVideoFile.s(), str2, e590Var, z3));
        if (pf00Var2.i) {
        }
        return new tf00.d(str, sdkClipVideoFile, descriptionViewState, cVar2, aVar2, a22, a32, new ti50.b(!z6 ? R.string.video_accessibility_sound_on : R.string.video_accessibility_sound_off, z6), bVar2);
    }
}
