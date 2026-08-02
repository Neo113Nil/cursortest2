package xsna;

import android.content.Context;
import com.vk.core.compose.component.defaults.VkTooltipAppearance;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.superapp.browser.internal.utils.FlashlightUtils;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.e6w0;
import xsna.ggu0;
import xsna.hn90;
import xsna.hsf0;
import xsna.ikv0;
import xsna.tba0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pm90 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pm90(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((rm90) this.c).l.a(new hn90.a(((jn90) this.d).b));
                return s3q0.a;
            case 1:
                ((izs) this.c).invoke(((tba0.b) ((bca0) this.d).m).a);
                return s3q0.a;
            case 2:
                String str = (String) this.c;
                String str2 = (String) this.d;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT COUNT(*) FROM playlists_to_tracks\n        WHERE uid = ? AND playlist_id = ?\n    ");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    int i = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 3:
                ((yab0) this.c).f.B((Playlist) this.d);
                return s3q0.a;
            case 4:
                Throwable th2 = (Throwable) obj;
                if (!((lsd0) this.c).g.a((Context) this.d, th2)) {
                    h03.b(th2);
                }
                return s3q0.a;
            case 5:
                mtk0 mtk0Var = (mtk0) this.c;
                TimelineViewState.d dVar = (TimelineViewState.d) this.d;
                tdu tduVar = (tdu) obj;
                int intValue = ((Number) mtk0Var.getValue()).intValue() % dVar.g;
                int i2 = dVar.c;
                int i3 = (intValue - (intValue % i2)) / i2;
                tduVar.A(i2);
                tduVar.B(dVar.d);
                float intBitsToFloat = Float.intBitsToFloat((int) (tduVar.d() >> 32)) * (-r3);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (tduVar.d() >> 32)) * (i2 - 1);
                float f = 2;
                tduVar.o((intBitsToFloat2 / f) + intBitsToFloat);
                tduVar.n(((Float.intBitsToFloat((int) (tduVar.d() & 4294967295L)) * (r1 - 1)) / f) + (Float.intBitsToFloat((int) (tduVar.d() & 4294967295L)) * (-i3)));
                return s3q0.a;
            case 6:
                ((zak0) ((e6p0) this.c).n).setValue((VkTooltipAppearance) ((LinkedHashMap) this.d).get((String) obj));
                return s3q0.a;
            case 7:
                return UserProfileHeaderView.T4((UserProfileHeaderView) this.c, (VkOnboardingCampaign) this.d);
            case 8:
                ((tuq0) this.c).g.put((aj1) this.d, (VKList) obj);
                return s3q0.a;
            case 9:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.c;
                com.vk.video.ui.discovery.minimizable.q qVar = (com.vk.video.ui.discovery.minimizable.q) this.d;
                csf0 csf0Var = (csf0) obj;
                gVar.X0(qVar, new hsf0.a.b(csf0Var.c));
                f4z<VideoMinimizableDiscoverySideEffect> f4zVar = gVar.J;
                if (csf0Var.c) {
                    long j = csf0Var.e;
                    int i4 = csf0Var.d;
                    Thumb thumb = csf0Var.b;
                    if (thumb == null) {
                        thumb = lso0.a;
                    }
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.s.a(j, i4, csf0Var.a, thumb));
                } else {
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.s.d(true));
                }
                gVar.T(new n.a(com.vk.video.ui.discovery.minimizable.g.c1(gVar, qVar, null, Boolean.TRUE, 2)));
                return s3q0.a;
            case 10:
                ikv0.a aVar = (ikv0.a) this.c;
                nht0 nht0Var = (nht0) this.d;
                fxc0.B().Y().D(aVar.a, true);
                ikv0 ikv0Var = nht0Var.f;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                return s3q0.a;
            case 11:
                uut0 uut0Var = (uut0) this.c;
                wc1 wc1Var = (wc1) this.d;
                wc1 wc1Var2 = (wc1) obj;
                k5t k5tVar = uut0Var.j;
                if (wc1Var == null) {
                    wc1Var = wc1Var2;
                }
                k5tVar.c = wc1Var;
                return s3q0.a;
            case 12:
                gzs gzsVar = (gzs) this.c;
                gzs gzsVar2 = (gzs) this.d;
                FlashlightUtils.EnableFlashlightResult enableFlashlightResult = (FlashlightUtils.EnableFlashlightResult) obj;
                int i5 = enableFlashlightResult == null ? -1 : ggu0.a.$EnumSwitchMapping$0[enableFlashlightResult.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (gzsVar2 != null) {
                        gzsVar2.invoke();
                    }
                } else if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            default:
                m6w0 m6w0Var = (m6w0) this.c;
                e6w0.k kVar = (e6w0.k) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                w6w0 w6w0Var = m6w0Var.f;
                VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = kVar.b;
                boolean z = !booleanValue;
                w6w0Var.getClass();
                io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new djl0(vmojiStickerPackPreviewModel.b, z), null, null, 3);
                wau0 wau0Var = new wau0(new lo70(w6w0Var, vmojiStickerPackPreviewModel, z, 3), 5);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
                m6w0Var.e.b(y0.E(wau0Var, lVar, kVar2, kVar2).subscribe(new aov0(new pe70(m6w0Var, booleanValue, kVar), 1)));
                return s3q0.a;
        }
    }
}
