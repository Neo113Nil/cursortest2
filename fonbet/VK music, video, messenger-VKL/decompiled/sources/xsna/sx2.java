package xsna;

import android.content.Context;
import android.os.Trace;
import com.vk.api.sdk.VKApiConfig;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.NewsFeedBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class sx2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sx2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                VKApiConfig vKApiConfig = (VKApiConfig) this.c;
                o2l.a.getClass();
                if (o2l.b("__dbg_use_anonymous_token", true)) {
                    return new yu2(vKApiConfig.a);
                }
                return null;
            case 1:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                nwy nwyVar = gamesCatalogComponentImpl.d;
                qcy<Object> qcyVar = GamesCatalogComponentImpl.s[3];
                return new z9t((cct) nwyVar.c());
            case 2:
                return ((ihu) this.c).a.b();
            case 3:
                return "#changeConfig " + ((pzv) this.c);
            case 4:
                return ((ClipsUploadVkComponent) m7m.a(((nx50) this.c).b).a(fpf0.a(ClipsUploadVkComponent.class))).Uc();
            case 5:
                return ((ClassifiedsComponent) ((NewsFeedBridgeComponentImpl) this.c).d.getValue()).dc();
            case 6:
                bhl0 bhl0Var = (bhl0) this.c;
                Trace.beginSection(ndp0.f("lazy StorageManager.channelMessagesStorageManager"));
                try {
                    r3b r3bVar = new r3b(bhl0Var.B(), false);
                    bhl0Var.z(r3bVar);
                    return r3bVar;
                } finally {
                    Trace.endSection();
                }
            case 7:
                return ((StoriesComponentImpl) this.c).d.h7();
            case 8:
                bpn0 bpn0Var = (bpn0) this.c;
                VKApplication.a aVar = VKApplication.c;
                ph20 ph20Var = (ph20) bpn0Var.getValue();
                ph20Var.a();
                w660 w660Var = w660.a;
                Context context = ph20Var.b;
                b25 a = o25.a();
                mxv c = g2v.c();
                a1w a1wVar = q1w.a;
                a1w a1wVar2 = a1wVar != null ? a1wVar : null;
                x870 x870Var = x870.a;
                rej rejVar = new rej(2);
                synchronized (w660Var) {
                    if (!w660.b) {
                        x660 x660Var = new x660(context, a1wVar2, rejVar);
                        x660Var.g.add(new r660(context, c));
                        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.q(new jm(a)), new io.reactivex.rxjava3.internal.operators.observable.q(new km(context)), new r870());
                        asu0.a.getClass();
                        new io.reactivex.rxjava3.internal.operators.observable.y(m.r0(asu0.k()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0.k()).subscribe(new m60(new s660(x660Var, 0), 2));
                        new io.reactivex.rxjava3.internal.operators.observable.q(new jm(a)).r0(asu0.k()).a0(asu0.k()).b(2, 1).subscribe(new ope(new npe(x660Var, 1), 1));
                        w660.b = true;
                    }
                }
                return s3q0.a;
            default:
                if (((qks0) this.c).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_DOWNLOAD_FORMAT_PRIORITY;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ sx2(dc3 dc3Var, VKApiConfig vKApiConfig) {
        this.b = 0;
        this.c = vKApiConfig;
    }
}
