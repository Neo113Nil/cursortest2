package xsna;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.base.Document;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Peer;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: OverlayMenuReportSenderImpl.kt */
/* loaded from: classes7.dex */
public final class y290 {
    public final tj8 a;
    public final String b;

    public y290(tj8 tj8Var, String str) {
        this.a = tj8Var;
        this.b = str;
    }

    public final long a() {
        rzb rzbVar = new rzb(Uri.parse(this.b).buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build().toString());
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return ((Number) vdg0.c(a1wVar.o("Sending bug report", rzbVar, 10000L))).longValue();
    }

    public final void b(long j, String str, String str2, String str3) {
        Attach attach;
        Attach b = (str2 == null || str2.length() == 0) ? null : ca3.b(new PendingPhotoAttachment(Uri.fromFile(new File(str2)).toString()));
        if (str3 == null || str3.length() == 0) {
            attach = null;
        } else {
            Document document = new Document();
            document.k = str3;
            document.m = ".zip";
            attach = ca3.b(new PendingDocumentAttachment(document));
        }
        b25 s = ((AuthBridgeComponent) this.a.c).s();
        StringBuilder sb = new StringBuilder();
        sb.append("Обращение от @" + s.o().h);
        sb.append('\n');
        if (str.length() > 0) {
            sb.append('\n');
            sb.append(str);
        }
        String sb2 = sb.toString();
        List<Attach> I = rl3.I(new Attach[]{b, attach});
        mxv g5 = ((ImBridgeComponent) this.a.b).g5();
        ArrayList arrayList = new ArrayList(c5g.u(I, 10));
        for (Attach attach2 : I) {
            if (attach2 instanceof AttachImage) {
                attach2 = g5.b().y((Context) this.a.a, (AttachImage) attach2);
            }
            arrayList.add(attach2);
        }
        Peer.Type type = Peer.Type.CHAT;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b2 = Peer.a.b(Peer.a.e(j, type));
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        pz30 pz30Var = new pz30(b2, sb2, null, null, null, null, null, "unknown", arrayList, null, null, null, null, 7804);
        a1w a1wVar = q1w.a;
        vdg0.c((a1wVar != null ? a1wVar : null).o("Sending bug report", pz30Var, 10000L));
    }
}
