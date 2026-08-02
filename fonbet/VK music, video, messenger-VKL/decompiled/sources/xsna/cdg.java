package xsna;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.vk.dto.common.Attachment;
import com.vk.lists.c;
import com.vk.metrics.eventtracking.Event;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.common.requests.CommentRestrictedResponse;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.a;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cdg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c.k d;

    public /* synthetic */ cdg(c.k kVar, boolean z, int i) {
        this.b = i;
        this.d = kVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        c.k kVar = this.d;
        switch (i) {
            case 0:
                mdg mdgVar = (mdg) kVar;
                ?? r0 = mdgVar.e;
                NewsComment newsComment = (NewsComment) obj;
                if (newsComment instanceof CommentRestrictedResponse) {
                    mdgVar.T = false;
                    if (z) {
                        r0.in();
                    }
                } else {
                    String str = mdgVar.y;
                    if (str != null) {
                        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                        el3 el3Var = Event.b;
                        Event.a aVar = new Event.a();
                        aVar.g(str);
                        aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
                        bVar.k(aVar.e());
                    }
                    mdgVar.T = true;
                    mdgVar.V = System.currentTimeMillis();
                    m3g0 m3g0Var = mdgVar.S;
                    NewsComment newsComment2 = m3g0Var != null ? m3g0Var.g : null;
                    if (z) {
                        r0.I9();
                    }
                    newsComment.y = true;
                    Iterator<Attachment> it = newsComment.J.iterator();
                    while (it.hasNext()) {
                        Attachment next = it.next();
                        if (next instanceof StickerAttachment) {
                            StickerAttachment stickerAttachment = (StickerAttachment) next;
                            stickerAttachment.j.setValue(stickerAttachment, StickerAttachment.l[0], Boolean.TRUE);
                        }
                    }
                    if (z) {
                        mdgVar.lg();
                    }
                    r0.d0();
                    r0.Ic(false);
                    mdgVar.M7(newsComment);
                    npu.a().a = null;
                    mdgVar.C7(newsComment, newsComment2, newsComment.l);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                ((eim0) kVar).c.invoke(new a.d.C1823a(z, th));
                kwg0.b().accept(th);
                break;
        }
        return s3q0.a;
    }
}
