package xsna;

import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import xsna.eil0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class rb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((BridgeComponentImpl) obj).b.t();
            case 1:
                gxw gxwVar = (gxw) obj;
                bpn0 bpn0Var = new bpn0(new m66(gxwVar, 6));
                bpn0 bpn0Var2 = new bpn0(new n66(gxwVar, 5));
                return new kzv0(new gr6(bpn0Var, bpn0Var2), new tq6(), new gek(), new bpn0(new dr4(gxwVar, 4)));
            case 2:
                return ((MarketComponent) ((LinksBridgeComponentImpl) obj).m.getValue()).Ob();
            case 3:
                return new sgb0((OfflineAudioDatabase_Impl) obj);
            case 4:
                aid0 aid0Var = (aid0) obj;
                xhd0 xhd0Var = aid0Var.b;
                return aid0Var.g(xhd0Var.c(new pl0(new auk(xhd0Var.j)), true, aid0Var.h));
            case 5:
                return ((CommonEditorComponent) ((tcl0) obj).c().a(fpf0.a(CommonEditorComponent.class))).Z1();
            case 6:
                return new eil0.d(((eil0) obj).a);
            case 7:
                qcy<Object>[] qcyVarArr = StoryViewerComponentImpl.s;
                avl0 avl0Var = new avl0();
                nwy nwyVar = ((StoryViewerComponentImpl) obj).c;
                qcy<Object> qcyVar = StoryViewerComponentImpl.s[0];
                return new nnm0(avl0Var, (f8o0) nwyVar.c(), pq20.b());
            default:
                kzv0 kzv0Var = (kzv0) obj;
                int i2 = 9;
                return new com.vk.libvideo.upload.impl.b(new gb8(kzv0Var, i2), new bpn0(new g67(kzv0Var, i2)));
        }
    }
}
