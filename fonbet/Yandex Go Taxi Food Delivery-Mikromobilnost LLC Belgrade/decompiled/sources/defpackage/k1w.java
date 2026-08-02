package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.messaging.internal.view.timeline.i;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Fragment;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoFragment;
import com.ybsdk.feature.resolver.internal.screens.empty.EmptyLinkResolverFragment;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import flex.engine.a;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class k1w implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ k1w(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static fly a(tw51 tw51Var) {
        int i = 11;
        kk kkVar = new kk(n3w.a(new yvn(new j4n(new u1g(tw51Var, 12), new u1g(tw51Var, 17), new u1g(tw51Var, 13), new u1g(tw51Var, 15), new jpf0((xvf0) new zni0(i5m.b(new h1t(new u1g(tw51Var, 16), 20)), i), (xvf0) new u1g(tw51Var, 14), 19), new u1g(tw51Var, i), dwn.a))), 28);
        LinkedHashMap A = gtq0.A(1);
        A.put(EmptyLinkResolverFragment.class, kkVar);
        fly flyVar = (fly) i5m.b(new dsl(hdp0.a, new br00(A), 2)).get();
        q5z.i(flyVar);
        return flyVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new j1w((Activity) xvf0Var.get());
            case 1:
                return new o1w((j1w) xvf0Var.get());
            case 2:
                return new gfh(i2, (d9w) xvf0Var.get());
            case 3:
                a engine = ((FeedSdkComponent) xvf0Var.get()).getEngine();
                q5z.i(engine);
                return engine;
            case 4:
                return new mdw((uew) xvf0Var.get());
            case 5:
                Context context = (Context) xvf0Var.get();
                csw.a.getClass();
                return (tpg) bsw.c.getValue(context, bsw.b[0]);
            case 6:
                return new com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.data.a((Transfer2Api) xvf0Var.get());
            case 7:
                return new com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.data.a((Transfer2Api) xvf0Var.get());
            case 8:
                return new qvw((h) xvf0Var.get());
            case 9:
                return new reu(14, (x22) xvf0Var.get());
            case 10:
                return new pk3((Activity) xvf0Var.get());
            case 11:
                return (b0x) xvf0Var.get();
            case 12:
                return new pk3((Activity) xvf0Var.get());
            case 13:
                return new c0x((odz0) xvf0Var.get());
            case 14:
                return ((Fragment) xvf0Var.get()).getLifecycle();
            case 15:
                return (b0x) xvf0Var.get();
            case 16:
                return (i) xvf0Var.get();
            case 17:
                return new i4x((z22) xvf0Var.get());
            case 18:
                return new j4x((i4x) xvf0Var.get());
            case 19:
                return new r4t((SharedPreferences) xvf0Var.get());
            case 20:
                return new r501((x22) xvf0Var.get());
            case 21:
                tw51 tw51Var = (tw51) xvf0Var.get();
                u1g u1gVar = new u1g(tw51Var, 4);
                u1g u1gVar2 = new u1g(tw51Var, 9);
                int i4 = 1;
                u1g u1gVar3 = new u1g(tw51Var, i4);
                u1g u1gVar4 = new u1g(tw51Var, 10);
                xvf0 b = i5m.b(new h1t(new u1g(tw51Var, 8), 19));
                u1g u1gVar5 = new u1g(tw51Var, 6);
                u1g u1gVar6 = new u1g(tw51Var, 7);
                prq prqVar = new prq(u1gVar4, new e3u(b, (xvf0) u1gVar5, (xvf0) u1gVar6, 12, false), mnx.a, u1gVar, u1gVar6, 19, false);
                u1g u1gVar7 = new u1g(tw51Var, 5);
                u1g u1gVar8 = new u1g(tw51Var, i2);
                n3w a = n3w.a(new fpx(new w3i(u1gVar2, u1gVar3, prqVar, u1gVar, u1gVar7, u1gVar8, u1gVar6, new ef6(u1gVar, i4), 26)));
                u1g u1gVar9 = new u1g(tw51Var, 3);
                e3u e3uVar = new e3u(u1gVar, a, u1gVar9, 11);
                xnx xnxVar = new xnx(n3w.a(new nox(new w3i(u1gVar2, u1gVar3, prqVar, u1gVar, u1gVar8, u1gVar6, i5m.b(new ef6(u1gVar, i3)), wox.a, 25))), u1gVar9, i3);
                xnx xnxVar2 = new xnx(n3w.a(new sjb0(new wrr(u1gVar2, u1gVar3, prqVar, u1gVar, u1gVar8, u1gVar6, bkb0.a, 19))), u1gVar9, i4);
                LinkedHashMap A = gtq0.A(3);
                A.put(KycPhotoFragment.class, e3uVar);
                A.put(KycPhotoV2Fragment.class, xnxVar);
                A.put(PhotoFragment.class, xnxVar2);
                gnx gnxVar = (gnx) i5m.b(new e3u((xvf0) edp0.a, (xvf0) u1gVar, (xvf0) new br00(A), 10, false)).get();
                q5z.i(gnxVar);
                return gnxVar;
            case 22:
                return new bsx((zuj0) xvf0Var.get());
            case 23:
                return new ru.yandex.taxi.linked_order.provider.h((g) xvf0Var.get());
            case 24:
                return new otx((w3c) xvf0Var.get());
            case 25:
                return new pj((pho) xvf0Var.get());
            case 26:
                return new tgy((s1f0) xvf0Var.get());
            case 27:
                return a((tw51) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.linked_order.map.utils.a((ah00) xvf0Var.get());
            default:
                return new hqy((z22) xvf0Var.get(), i3);
        }
    }
}
