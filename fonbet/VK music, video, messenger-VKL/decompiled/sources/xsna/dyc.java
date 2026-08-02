package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.VkPlaceholderVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import java.util.List;
import xsna.djc;
import xsna.o9t;
import xsna.q610;
import xsna.u710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dyc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dyc(Context context, hwe hweVar, SdkVideoFile sdkVideoFile) {
        this.b = 1;
        this.c = context;
        this.e = hweVar;
        this.d = sdkVideoFile;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        m7q m7qVar;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                int i2 = ClipFeedListFragment.a2;
                ((ClipFeedListFragment) obj3).Mo((Context) obj2, (SdkVideoFile) obj);
                break;
            case 1:
                Context context = (Context) obj2;
                io.reactivex.rxjava3.subjects.e eVar = frd.a;
                VideoFile a = ((s2f) ((hwe) obj3).c.getValue()).a((SdkVideoFile) obj);
                if (frd.a()) {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    yg5 e = b.C1208b.a().e(a, null);
                    VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                    Object e2 = (videoAutoPlay == null || (m7qVar = videoAutoPlay.k0) == null) ? null : jgz.e(m7qVar);
                    dbn dbnVar = e2 instanceof dbn ? (dbn) e2 : null;
                    if (dbnVar != null) {
                        asu0.a.getClass();
                        asu0.n().execute(new drd(context, dbnVar));
                    }
                }
                break;
            case 2:
                ((izs) obj3).invoke(new o9t.m(new djc.b(((h8t) obj2).d, Integer.valueOf(((i8t) obj).a), null, null)));
                break;
            case 3:
                izs izsVar = (izs) obj3;
                u710 u710Var = (u710) obj2;
                UserId userId = u710Var.d;
                long j = u710Var.c;
                List<MediaContentItem> list = ((u710.a.C3787a) obj).d;
                izsVar.invoke(new q610.a(userId, j, list != null ? list.size() : 0, false, false, 16));
                break;
            case 4:
                n6d0 n6d0Var = (n6d0) obj2;
                nod0 nod0Var = (nod0) obj;
                Integer m = arm0.m(10, String.valueOf(((VkInputSelect) obj3).getText()));
                Integer valueOf = m != null ? Integer.valueOf(m.intValue() * 100) : null;
                p6d0 p6d0Var = n6d0Var.f;
                n6d0Var.f = p6d0Var != null ? new p6d0(p6d0Var.a, valueOf) : new p6d0(1, null, valueOf);
                nod0Var.l.invoke(n6d0Var);
                break;
            case 5:
                vcn0 vcn0Var = (vcn0) obj3;
                c530 c530Var = (c530) obj2;
                wcn0 wcn0Var = (wcn0) obj;
                q530 q530Var = vcn0Var.q;
                if (!(q530Var != null ? q530Var.b(c530Var, q530Var.a(c530Var)) : false)) {
                    WebAction webAction = wcn0Var.h.o.b;
                    if (webAction != null) {
                        vcn0Var.p.b(vcn0Var.itemView.getContext(), webAction, wcn0Var, null);
                    }
                    break;
                } else {
                    break;
                }
            default:
                VkPlaceholderVh vkPlaceholderVh = (VkPlaceholderVh) obj3;
                UIBlock uIBlock = (UIBlock) obj2;
                UIBlockAction uIBlockAction = (UIBlockAction) obj;
                com.vk.catalog2.common.ui.mvp.util.a aVar = vkPlaceholderVh.b;
                VkPlaceholder vkPlaceholder = vkPlaceholderVh.c;
                com.vk.catalog2.common.ui.mvp.util.a.e(aVar, (vkPlaceholder != null ? vkPlaceholder : null).getContext(), uIBlock, uIBlockAction, null, 48);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dyc(VkPlaceholderVh vkPlaceholderVh, UIBlock uIBlock, UIBlockAction uIBlockAction, boolean z) {
        this.b = 6;
        this.e = vkPlaceholderVh;
        this.c = uIBlock;
        this.d = uIBlockAction;
    }

    public /* synthetic */ dyc(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
