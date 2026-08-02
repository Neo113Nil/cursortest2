package xsna;

import android.content.Context;
import android.os.Trace;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.internal.storage.database.FeatureDatabase_Impl;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.prodstat.analytics.max.view.VoipMaxAppViewAnalytics;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import kotlin.LazyThreadSafetyMode;
import xsna.o260;
import xsna.vwv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class cuq implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cuq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 7;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return new ia3((FeatureDatabase_Impl) this.c);
            case 1:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                return new bat(gamesCatalogComponentImpl.Df());
            case 2:
                ImBridgeComponentImpl imBridgeComponentImpl = (ImBridgeComponentImpl) this.c;
                o0r0 F = imBridgeComponentImpl.a.F();
                nwy nwyVar = imBridgeComponentImpl.j;
                qcy<Object>[] qcyVarArr2 = ImBridgeComponentImpl.n;
                qcy<Object> qcyVar = qcyVarArr2[1];
                pcw pcwVar = (pcw) nwyVar.c();
                nwy nwyVar2 = imBridgeComponentImpl.k;
                qcy<Object> qcyVar2 = qcyVarArr2[2];
                o0w o0wVar = (o0w) nwyVar2.c();
                nwy nwyVar3 = imBridgeComponentImpl.l;
                qcy<Object> qcyVar3 = qcyVarArr2[3];
                kyv kyvVar = (kyv) nwyVar3.c();
                fu2 fu2Var = new fu2(imBridgeComponentImpl, 1);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                return new eau0(F, pcwVar, o0wVar, kyvVar, msy.a(lazyThreadSafetyMode, fu2Var), msy.a(lazyThreadSafetyMode, new vbp(imBridgeComponentImpl, 2)), msy.a(lazyThreadSafetyMode, new nxv(imBridgeComponentImpl, 0)), msy.a(lazyThreadSafetyMode, new oxv(imBridgeComponentImpl, 0)), imBridgeComponentImpl.h);
            case 3:
                return (ProfileFragmentProviderComponent) m7m.a(((nx50) this.c).b).a(fpf0.a(ProfileFragmentProviderComponent.class));
            case 4:
                return new z560(((o260.b) this.c).a);
            case 5:
                bhl0 bhl0Var = (bhl0) this.c;
                Trace.beginSection(ndp0.f("lazy StorageManager.videoMessageStencilManager"));
                try {
                    kts0 kts0Var = new kts0(bhl0Var.B());
                    bhl0Var.z(kts0Var);
                    return kts0Var;
                } finally {
                    Trace.endSection();
                }
            case 6:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = StoriesComponentImpl.N;
                return new sul0(storiesComponentImpl.Df(), storiesComponentImpl.w(), storiesComponentImpl.bf(), storiesComponentImpl.bb(), new bpn0(new sx2(storiesComponentImpl, i)));
            case 7:
                bpn0 bpn0Var = (bpn0) this.c;
                VKApplication.a aVar = VKApplication.c;
                ph20 ph20Var = (ph20) bpn0Var.getValue();
                ph20Var.a();
                Context context = ph20Var.b;
                gx8 yc = ((CacheComponent) m7m.e().a(fpf0.a(CacheComponent.class))).yc();
                int i3 = 4;
                aqi aqiVar = new aqi(i3);
                wb3 wb3Var = new wb3(1);
                vwv.c = context;
                vwv.d = aqiVar;
                vwv.e = wb3Var;
                if (yc != null) {
                    yc.c(vwv.b);
                }
                nr4 nr4Var = nr4.a;
                s12 s12Var = new s12(i3);
                lza0 lza0Var = jw5.g;
                v94 v94Var = new v94(7);
                synchronized (nr4Var) {
                    if (!nr4.b) {
                        nr4.e = context.getApplicationContext();
                        nr4.f = "AudioMsgPlayerNotificationService";
                        nr4.g = 11;
                        nr4.h = s12Var;
                        nr4.i = lza0Var;
                        nr4.j = v94Var;
                        nr4.b = true;
                    }
                }
                c63 c63Var = c63.a;
                c63.a(new vwv.a());
                asu0.a.getClass();
                vwv.f = asu0.n().submit(new twv(i2));
                return s3q0.a;
            case 8:
                return new mca((zia) ((xhu0) this.c).b.getValue());
            default:
                nsd0 nsd0Var = (nsd0) this.c;
                qcy<Object>[] qcyVarArr4 = VoipAnalyticsInternalComponent.b;
                return new VoipMaxAppViewAnalytics(nsd0Var);
        }
    }
}
