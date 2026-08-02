package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsInitDecorPayload;
import com.vk.im.chat.clips.decoration.api.models.ImChatPaginationKey;
import com.vk.im.chat.clips.decoration.api.models.ImClipsDecorationKey;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.video.ui.share.api.ShareItemType;
import java.util.Map;
import kotlin.Lazy;
import kotlin.text.Regex;

/* compiled from: SingleClipLink.kt */
/* loaded from: classes17.dex */
public final class ltj0 implements pje {
    public static final bpn0 d = new bpn0(new e3c0(5));
    public final zof a;
    public final Lazy<com.vk.video.ui.share.api.b> b;
    public final qbm c;

    /* JADX WARN: Multi-variable type inference failed */
    public ltj0(zof zofVar, Lazy<? extends com.vk.video.ui.share.api.b> lazy, qbm qbmVar) {
        this.a = zofVar;
        this.b = lazy;
        this.c = qbmVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        return peq0.p(peq0Var, (Regex) d.getValue(), null, null, 14);
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        ReplyInfo replyInfo;
        z1f z1fVar;
        Integer m;
        Uri uri = peq0Var.a;
        VideoFileOld clipVideoFile = this.a.k() ? new ClipVideoFile() : new VideoFileOld();
        clipVideoFile.b = new UserId(peq0Var.c(1));
        clipVideoFile.c = peq0Var.b(2);
        String queryParameter = uri.getQueryParameter("access_key");
        if (queryParameter == null) {
            queryParameter = "";
        }
        clipVideoFile.r0 = queryParameter;
        Lazy<com.vk.video.ui.share.api.b> lazy = this.b;
        com.vk.video.ui.share.api.b value = lazy != null ? lazy.getValue() : null;
        if (value != null) {
            value.a(ShareItemType.CLIP, uri.toString(), peq0Var.c(2), peq0Var.c(1));
        }
        nl30 nl30Var = new nl30(yp80Var, 26);
        String queryParameter2 = uri.getQueryParameter("reply");
        if (queryParameter2 == null || (m = arm0.m(10, queryParameter2)) == null) {
            replyInfo = null;
        } else {
            int intValue = m.intValue();
            String queryParameter3 = uri.getQueryParameter("thread");
            replyInfo = new ReplyInfo(intValue, queryParameter3 != null ? arm0.m(10, queryParameter3) : null);
        }
        Map<String, Object> map = launchContext.x;
        if (map != null) {
            Object obj = map.get("peerId");
            Long l = obj instanceof Long ? (Long) obj : null;
            Object obj2 = map.get("cnvMsgId");
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (l != null && num != null) {
                int intValue2 = num.intValue();
                final long longValue = l.longValue();
                ImChatPaginationKey imChatPaginationKey = new ImChatPaginationKey(intValue2, longValue, 1);
                ImClipsDecorationKey imClipsDecorationKey = new ImClipsDecorationKey(null, 1, null);
                ImChatClipsInitDecorPayload imChatClipsInitDecorPayload = new ImChatClipsInitDecorPayload(intValue2, 1, null, longValue, false, 16, null);
                Object obj3 = map.get("requestRef");
                z1fVar = new z1f(imClipsDecorationKey, imChatClipsInitDecorPayload, imChatPaginationKey, imChatPaginationKey, obj3 instanceof String ? (String) obj3 : null, new gzs() { // from class: xsna.ktj0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return ltj0.this.c.c(longValue);
                    }
                });
                net0.c(context, clipVideoFile, null, null, null, null, false, nl30Var, replyInfo, null, false, false, false, false, 0L, false, null, null, true, launchContext.i, true, z1fVar, null, 9174652);
                return true;
            }
        }
        z1fVar = null;
        net0.c(context, clipVideoFile, null, null, null, null, false, nl30Var, replyInfo, null, false, false, false, false, 0L, false, null, null, true, launchContext.i, true, z1fVar, null, 9174652);
        return true;
    }
}
