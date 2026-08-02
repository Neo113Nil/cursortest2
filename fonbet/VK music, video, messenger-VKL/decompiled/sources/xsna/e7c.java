package xsna;

import androidx.compose.runtime.a;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.donut.design.compose.banner.DonutBannerSkeletonContent;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.g6n0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class e7c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e7c(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                l7c.a((String) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.donut.design.compose.banner.b.f((DonutBannerSkeletonContent.Type) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                v8t.j((String) this.d, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                n020.b((q020) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                lj40 lj40Var = (lj40) this.d;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1312738393, intValue, -1, "com.vk.music.offline.ui.presentation.MusicSettingsView.<anonymous> (MusicDownloadsSettingsView.kt:58)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = androidx.compose.runtime.k.b(Boolean.FALSE);
                        aVar.R(x);
                    }
                    wh50 wh50Var = (wh50) x;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    phv0.b(txj0.d(q630.a.a, 1.0f), kai.c(-1438467744, new m9c(6, lj40Var, izsVar), aVar), null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-1651885387, new er0(izsVar, lj40Var, wh50Var), aVar), aVar, 805306416, 380);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.d;
                ac90 ac90Var = (ac90) this.c;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ref$FloatRef.element += ac90Var.a.f(floatValue - ref$FloatRef.element);
                break;
            case 6:
                com.vk.music.player.playback.c cVar = (com.vk.music.player.playback.c) this.d;
                PlaybackLaunchMeta playbackLaunchMeta = (PlaybackLaunchMeta) this.c;
                List<gza0> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (gza0 gza0Var : list) {
                    arrayList.add(new gza0(gza0Var.a, UUID.randomUUID().toString(), gza0Var.c, gza0Var.d, playbackLaunchMeta));
                }
                cVar.h(arrayList);
                break;
            case 7:
                ((Integer) obj2).getClass();
                pmh0.b((g6n0.b) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                List list2 = (List) this.d;
                izs izsVar2 = (izs) this.c;
                ((Integer) obj2).getClass();
                jaq0.b(ne7.I(1), (androidx.compose.runtime.a) obj, list2, izsVar2);
                break;
            default:
                ((Integer) obj2).getClass();
                o7v0.b((g7v0) this.d, (VkOnboarding$TintColor) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ e7c(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
    }

    public /* synthetic */ e7c(lj40 lj40Var, izs izsVar) {
        this.b = 4;
        this.d = lj40Var;
        this.c = izsVar;
    }
}
