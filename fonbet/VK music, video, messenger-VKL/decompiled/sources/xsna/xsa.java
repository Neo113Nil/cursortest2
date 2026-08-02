package xsna;

import android.content.Context;
import com.vk.auth.captcha.api.di.CaptchaComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.design.inspector.DesignInspectorComponent;
import com.vk.music.offline.api.di.StorageTypeComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.nspk.di.NspkSearchBanksFeatureComponentImpl;
import com.vk.nspk.di.NspkSearchBanksFeatureInnerComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xsa implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xsa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        e5x n;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new yyu((Context) obj);
            case 1:
                return ((BridgeComponent) ((hlg) obj).d.getValue()).Le().z();
            case 2:
                return ((NewsfeedRouterComponent) ((LinksBridgeComponentImpl) obj).D.getValue()).l0();
            case 3:
                return Boolean.valueOf(((r360) obj).d().c().c);
            case 4:
                return (BridgeComponent) ((g8m) obj).a(fpf0.a(BridgeComponent.class));
            case 5:
                nwy nwyVar = ((NspkSearchBanksFeatureComponentImpl) obj).b.c;
                qcy<Object> qcyVar = NspkSearchBanksFeatureInnerComponent.d[0];
                return new u2h0((rm70) nwyVar.c());
            case 6:
                return ((StorageTypeComponent) obj).Y7();
            case 7:
                return ((ui90) obj).c.invoke();
            case 8:
                qcy<Object>[] qcyVarArr = PhotosComponentImpl.u;
                nwy nwyVar2 = ((PhotosComponentImpl) obj).g;
                qcy<Object> qcyVar2 = PhotosComponentImpl.u[6];
                return (up1) nwyVar2.c();
            case 9:
                aid0 aid0Var = (aid0) obj;
                bpn0 bpn0Var = aid0Var.m;
                xhd0 xhd0Var = aid0Var.b;
                if (!lhs.d()) {
                    thd0 thd0Var = (thd0) bpn0Var.getValue();
                    xhd0Var.getClass();
                    return new jln0(thd0Var);
                }
                lhs.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
                try {
                    thd0 thd0Var2 = (thd0) bpn0Var.getValue();
                    xhd0Var.getClass();
                    return new jln0(thd0Var2);
                } finally {
                    lhs.b();
                }
            case 10:
                return new jrl0(((StoryViewerComponentImpl) obj).a.w());
            case 11:
                VKApplication vKApplication = (VKApplication) obj;
                VKApplication.a aVar = VKApplication.c;
                if (((Boolean) com.vk.core.apps.a.l.getValue()).booleanValue() && (n = ((DesignInspectorComponent) m7m.e().a(fpf0.a(DesignInspectorComponent.class))).n()) != null) {
                    ((q5x) n).d(vKApplication);
                }
                return s3q0.a;
            default:
                return ((CaptchaComponent) ((k7m) m7m.f((zcu0) obj)).mo408a(fpf0.a(CaptchaComponent.class))).D1();
        }
    }
}
