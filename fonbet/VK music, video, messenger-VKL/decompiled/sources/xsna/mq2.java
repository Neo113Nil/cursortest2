package xsna;

import android.animation.PropertyValuesHolder;
import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import com.vk.ads.di.NewsfeedOptionalAdsComponentImpl;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.data.Subscription;
import com.vk.log.L;
import com.vk.network.kbh.state.NetworkState;
import com.vk.utils.vectordrawable.AnimationTarget;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mq2 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ mq2(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0109 A[Catch: all -> 0x00e8, LOOP:0: B:73:0x0103->B:75:0x0109, LOOP_END, TryCatch #0 {all -> 0x00e8, blocks: (B:56:0x00d6, B:62:0x00df, B:64:0x00e3, B:67:0x00ec, B:69:0x00f0, B:72:0x00fd, B:73:0x0103, B:75:0x0109, B:77:0x0113, B:79:0x0117, B:81:0x011b, B:82:0x0120, B:84:0x0124, B:86:0x0128, B:87:0x0130, B:89:0x013a, B:91:0x0144, B:95:0x014e), top: B:55:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013a A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #0 {all -> 0x00e8, blocks: (B:56:0x00d6, B:62:0x00df, B:64:0x00e3, B:67:0x00ec, B:69:0x00f0, B:72:0x00fd, B:73:0x0103, B:75:0x0109, B:77:0x0113, B:79:0x0117, B:81:0x011b, B:82:0x0120, B:84:0x0124, B:86:0x0128, B:87:0x0130, B:89:0x013a, B:91:0x0144, B:95:0x014e), top: B:55:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144 A[Catch: all -> 0x00e8, TRY_ENTER, TryCatch #0 {all -> 0x00e8, blocks: (B:56:0x00d6, B:62:0x00df, B:64:0x00e3, B:67:0x00ec, B:69:0x00f0, B:72:0x00fd, B:73:0x0103, B:75:0x0109, B:77:0x0113, B:79:0x0117, B:81:0x011b, B:82:0x0120, B:84:0x0124, B:86:0x0128, B:87:0x0130, B:89:0x013a, B:91:0x0144, B:95:0x014e), top: B:55:0x00d6 }] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Iterator<ny1> it;
        bxi bxiVar;
        bxi bxiVar2;
        f370 f370Var;
        switch (this.b) {
            case 0:
                AnimationTarget.Property property = AnimationTarget.Property.FILL_COLOR;
                int[] q0 = rl3.q0((Integer[]) ((Object[]) obj2));
                ((PropertyValuesHolder) obj).setIntValues(Arrays.copyOf(q0, q0.length));
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1679051451, intValue, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.placeholder.ComposableSingletons$FullToolbarKt.lambda$1679051451.<anonymous> (FullToolbar.kt:162)");
                    }
                    q630 a = wdj0.a(q630.a.a, null);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, a);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    qws.b(true, aVar, 6);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                boolean z = true;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) == 2) {
                    z = false;
                }
                if (aVar3.t(intValue2 & 1, z)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1888009864, intValue2, -1, "com.vk.music.playlist.framework.presentation.track.ComposableSingletons$MusicTrackComponentKt.lambda$1888009864.<anonymous> (MusicTrackComponent.kt:134)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-836118916, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical16> (VkSdkIcons.kt:2658)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_16, 0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a2, d370.N(R.string.music_talkback_more, 0, aVar3), null, ylu0Var.getIcon().a, aVar3, 8, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1624772335, intValue3, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$-1624772335.<anonymous> (Scaffold.kt:308)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1687309363, intValue4, -1, "com.vk.core.compose.component.ComposableSingletons$VkSecondaryTabRowKt.lambda$-1687309363.<anonymous> (VkSecondaryTabRow.kt:140)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 6:
                Context context = (Context) obj;
                int intValue5 = ((Integer) obj2).intValue();
                tld0 tld0Var = new tld0(new float[9], new float[3]);
                bpn0 bpn0Var = uvg0.a;
                int i = 14;
                return io.reactivex.rxjava3.core.g.a(uvg0.b(context, 1, intValue5, new ap30(qvg0.b, i)), uvg0.b(context, 2, intValue5, new ap30(svg0.b, i)), tld0Var).o(intValue5, TimeUnit.MICROSECONDS);
            case 7:
                pxy pxyVar = ((uxy) obj2).c;
                return e43.l(pxyVar.b, pxyVar.d);
            case 8:
                Subscription subscription = (Subscription) obj;
                subscription.y = (String) obj2;
                return subscription;
            case 9:
                ((Integer) obj).intValue();
                qcy<Object>[] qcyVarArr = NewsfeedOptionalAdsComponentImpl.d;
                return s3q0.a;
            case 10:
                return Integer.valueOf(((wak0) ((jgh0) obj2).a).getIntValue());
            case 11:
                return Integer.valueOf(((zox) obj).j0(((Integer) obj2).intValue()));
            case 12:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                d6q0 d6q0Var = d6q0.a;
                synchronized (d6q0Var) {
                    try {
                        if (d6q0.r) {
                            if (!booleanValue) {
                                bxi bxiVar3 = d6q0.b;
                                if (bxiVar3 != null && bxiVar3.p) {
                                }
                                if (d6q0.q && !Boolean.valueOf(r6).equals(d6q0.p)) {
                                    it = d6q0.d.iterator();
                                    while (it.hasNext()) {
                                        it.next().b(r6);
                                    }
                                    bxiVar = d6q0.b;
                                    if (bxiVar != null && !bxiVar.s) {
                                        d6q0.c.b(r6);
                                    }
                                    bxiVar2 = d6q0.b;
                                    if (bxiVar2 != null && (f370Var = bxiVar2.h) != null) {
                                        f370Var.b(new gzs() { // from class: xsna.c6q0
                                            @Override // xsna.gzs
                                            public final Object invoke() {
                                                return zhy0.a("UnstableNetworkDetector: current local tunnel state is ", r1);
                                            }
                                        });
                                    }
                                    Boolean bool = d6q0.p;
                                    d6q0.p = Boolean.valueOf(r6);
                                    if (r6) {
                                        d6q0.m(NetworkState.STABLE);
                                        d6q0Var.n();
                                    } else if (!epx.f(bool, Boolean.TRUE) || booleanValue2) {
                                        d6q0Var.i();
                                    }
                                }
                            }
                            r6 = true;
                            if (d6q0.q) {
                                it = d6q0.d.iterator();
                                while (it.hasNext()) {
                                }
                                bxiVar = d6q0.b;
                                if (bxiVar != null) {
                                    d6q0.c.b(r6);
                                }
                                bxiVar2 = d6q0.b;
                                if (bxiVar2 != null) {
                                    f370Var.b(new gzs() { // from class: xsna.c6q0
                                        @Override // xsna.gzs
                                        public final Object invoke() {
                                            return zhy0.a("UnstableNetworkDetector: current local tunnel state is ", r1);
                                        }
                                    });
                                }
                                Boolean bool2 = d6q0.p;
                                d6q0.p = Boolean.valueOf(r6);
                                if (r6) {
                                }
                            }
                        }
                    } finally {
                    }
                }
                return s3q0.a;
            case 13:
                Throwable th = (Throwable) obj2;
                if (th != null) {
                    L.i(th);
                }
                return s3q0.a;
            case 14:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar6.K(893001977);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(893001977, intValue6, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:241)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar6.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.a1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return frv0Var;
            default:
                com.vk.voip.ui.sessionrooms.f fVar = (com.vk.voip.ui.sessionrooms.f) obj;
                Boolean bool3 = (Boolean) obj2;
                boolean z2 = (fVar.f == null || bool3.booleanValue()) ? false : true;
                boolean z3 = fVar.g;
                Integer num = fVar.f;
                int intValue7 = num != null ? num.intValue() : 0;
                boolean z4 = fVar.b && !bool3.booleanValue();
                boolean z5 = fVar.c;
                boolean z6 = fVar.e;
                boolean z7 = fVar.d && !fVar.h;
                f.a aVar7 = fVar.a;
                f.a.b bVar = aVar7 instanceof f.a.b ? (f.a.b) aVar7 : null;
                return new VoipActionsFeatureState.t(intValue7, bVar != null ? bVar.b : null, z2, z3, z4, z5, z6, z7, fVar.i);
        }
    }
}
