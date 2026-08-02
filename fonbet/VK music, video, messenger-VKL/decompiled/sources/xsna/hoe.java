package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.api.comment.SdkReplyInfo;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.models.comment.ReplyInfo;
import xsna.epe;
import xsna.foe;

/* compiled from: ClipsOwnerSwipeFeatureFactory.kt */
/* loaded from: classes17.dex */
public final class hoe {
    public final soe a;
    public final urf b;

    public hoe(soe soeVar, urf urfVar) {
        this.a = soeVar;
        this.b = urfVar;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ioe a(roe roeVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, boolean z, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3) {
        ReplyInfo replyInfo;
        a7j a7jVar;
        Object obj;
        Object parcelable;
        Bundle a = roeVar.a();
        ?? r3 = roeVar.e;
        if (a != null) {
            if (a.containsKey("ClipsOwnerSwipeFragment.clip_comment_reply")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = a.getParcelable("ClipsOwnerSwipeFragment.clip_comment_reply", ReplyInfo.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Parcelable parcelable2 = a.getParcelable("ClipsOwnerSwipeFragment.clip_comment_reply");
                    if (!(parcelable2 instanceof ReplyInfo)) {
                        parcelable2 = null;
                    }
                    obj = (ReplyInfo) parcelable2;
                }
                if (obj != null) {
                    a.remove("ClipsOwnerSwipeFragment.clip_comment_reply");
                    replyInfo = (ReplyInfo) obj;
                }
            }
            obj = null;
            replyInfo = (ReplyInfo) obj;
        } else {
            replyInfo = null;
        }
        if (replyInfo != null) {
            a7jVar = new a7j(new ClipFeedOpenAction.OpenComments(new SdkReplyInfo(replyInfo.b, replyInfo.c)));
        } else {
            ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
            Bundle a2 = roeVar.a();
            aVar.getClass();
            ClipFeedOpenAction a3 = ClipsWrapperInputArguments.a.a(a2);
            a7jVar = a3 != null ? new a7j(a3) : null;
        }
        epe.a.b bVar = new epe.a.b(Integer.valueOf(((Number) roeVar.c.getValue()).intValue()), roeVar.c(), ((Boolean) roeVar.j.getValue()).booleanValue(), ((Boolean) roeVar.l.getValue()).booleanValue(), roeVar.d(), a7jVar, clipsScreenPerformanceReporter, (SearchStatsLoggingInfo) roeVar.h.getValue(), roeVar.b(), ((Boolean) r3.getValue()).booleanValue(), ((Boolean) roeVar.f.getValue()).booleanValue());
        woe woeVar = new woe(bpn0Var, bpn0Var2, bpn0Var3);
        gpe gpeVar = new gpe();
        voe a4 = woeVar.a(new voe(new yrf(roeVar.e(), 13), ((Boolean) r3.getValue()).booleanValue(), z, 78), bVar);
        return new ioe(new goe(this.a, this.b, roeVar.e(), new ape(a4, woeVar, gpeVar), foe.c.b), new poe(gpe.a(a4)));
    }
}
