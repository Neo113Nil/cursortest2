package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.attachments.MarketAttachment;
import xsna.aji;
import xsna.b78;
import xsna.cco;
import xsna.dz40;
import xsna.mt00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h08 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h08(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                MarketAttachment marketAttachment = (MarketAttachment) this.c;
                Good good = (Good) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gmq gmqVar = (gmq) obj2;
                if (gmqVar instanceof MarketFavable) {
                    MarketFavable marketFavable = (MarketFavable) gmqVar;
                    long j = marketFavable.b;
                    if (j == marketAttachment.f.b) {
                        good.J = booleanValue;
                        mt00.h(new mt00.a((int) j, marketFavable.c, booleanValue, CommonMarketStat$TypeRefSource.POST, null, null, null, null, null, null, 8176));
                        break;
                    }
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                v7d.a((w7d) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                hv70 hv70Var = (hv70) this.c;
                z37 z37Var = (z37) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-94430144, intValue, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.ComposableSingletons$OfflinePodcastEpisodesMviComposeComponentKt.lambda$-1672765563.<anonymous>.<anonymous> (OfflinePodcastEpisodesMviComposeComponent.kt:110)");
                    }
                    boolean J = aVar.J(z37Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        aji.a aVar2 = new aji.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(aVar2);
                        x = aVar2;
                    }
                    cv70.f(hv70Var, (izs) ((fcy) x), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ybo.a((cco.b) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                fc30 fc30Var = (fc30) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-59194059, intValue2, -1, "androidx.compose.runtime.GapComposer.invokeMovableContentLambda.<anonymous> (GapComposer.kt:2265)");
                    }
                    fc30Var.a.invoke(this.d, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                odx.a((q630) this.c, (uog0) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                n750.k((b78.g) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((d8d0) this.c).t((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((vmd0) this.c).e((mtk0) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 9:
                ((Integer) obj2).getClass();
                vkf0.b((dz40.h) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 10:
                String str = (String) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                lhg0.a(ne7.I(385), (androidx.compose.runtime.a) obj, str, izsVar);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((bdn0) this.c).o6((jdj0) this.d, (androidx.compose.runtime.a) obj, ne7.I(9));
                break;
            case 12:
                gho0 gho0Var = (gho0) this.c;
                yvj yvjVar = (yvj) this.d;
                tco0 tco0Var = (tco0) obj;
                Context context = (Context) obj2;
                boolean l = gho0Var.l();
                us2 o = gho0Var.o();
                qko0 qko0Var = null;
                String str2 = o != null ? o.c : null;
                qko0 qko0Var2 = gho0Var.x;
                if (qko0Var2 != null) {
                    long j2 = qko0Var2.a;
                    uv70 uv70Var = gho0Var.b;
                    qko0Var = new qko0(jgz.c(uv70Var.b((int) (j2 >> 32)), uv70Var.b((int) (j2 & 4294967295L))));
                }
                gua0.a(tco0Var, context, l, str2, qko0Var, gho0Var.j, new ysd(gho0Var, yvjVar, context, 13));
                break;
            case 13:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.datacontent.presets.b.b((VideoMetaViewState.a) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                x7u0.b((String) this.c, (SemanticsConfiguration) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h08(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
