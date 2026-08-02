package xsna;

import android.database.SQLException;
import android.os.Trace;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: CompletableDeferred.kt */
/* loaded from: classes11.dex */
public final class p7i {
    public static o7i a() {
        return new o7i(null);
    }

    public static final void c(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(lhg.a(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final void e(hyg0 hyg0Var, String str) {
        qyg0 V0 = hyg0Var.V0(str);
        try {
            V0.step();
            yfb.d(V0, null);
        } finally {
        }
    }

    public static int f(Attachment attachment) {
        if (attachment instanceof AlbumAttachment) {
            return Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE;
        }
        if (attachment instanceof PhotoAttachment) {
            Photo photo = ((PhotoAttachment) attachment).l;
            if (photo.Hb()) {
                return 204;
            }
            return photo.Ib() ? 205 : 203;
        }
        if (attachment instanceof DocumentAttachment) {
            DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
            if (documentAttachment.x5() && documentAttachment.V0()) {
                return 207;
            }
            Image image = documentAttachment.s;
            if (image != null && !image.b.isEmpty()) {
                return 206;
            }
        } else {
            if (attachment instanceof VideoSnippetAttachment) {
                return -1;
            }
            if (attachment instanceof VideoAttachment) {
                VideoAttachment videoAttachment = (VideoAttachment) attachment;
                if (!g620.f().d(videoAttachment.Jb())) {
                    return videoAttachment.Jb().W9() ? Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE : videoAttachment.Q5() ? 257 : 258;
                }
            } else {
                if (attachment instanceof MarketAlbumAttachment) {
                    return Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE;
                }
                if (attachment instanceof GraffitiAttachment) {
                    return Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE;
                }
                if (attachment instanceof SnippetAttachment) {
                    SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
                    if (snippetAttachment.Hb()) {
                        return 268;
                    }
                    if (snippetAttachment.Fb()) {
                        return Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE;
                    }
                } else {
                    if (attachment instanceof ArticleAttachment) {
                        ArticleAttachment articleAttachment = (ArticleAttachment) attachment;
                        boolean z = articleAttachment.Gb() && articleAttachment.Eb();
                        boolean z2 = articleAttachment.d5() || articleAttachment.Fb() || articleAttachment.Q8() || !articleAttachment.Db().e();
                        if (z) {
                            return 344;
                        }
                        if (z2) {
                            return 345;
                        }
                        return Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE;
                    }
                    if (attachment instanceof PollAttachment) {
                        return 293;
                    }
                    if (attachment instanceof AudioAttachment) {
                        return Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE;
                    }
                    if (attachment instanceof AudioPlaylistAttachment) {
                        return 211;
                    }
                }
            }
        }
        return -1;
    }

    public static final void g(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public void b(String str) {
        Trace.beginSection(ndp0.f(str));
    }

    public void d() {
        Trace.endSection();
    }
}
