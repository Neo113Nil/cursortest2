package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.commons.http.Http;

/* compiled from: DisplayItemViewTypeMapper.kt */
/* loaded from: classes.dex */
public final class qen {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new xa3(2));

    public static int a(VideoAttachment videoAttachment, NewsEntry newsEntry, s1c0 s1c0Var, boolean z) {
        int i;
        Post R = di60.R(newsEntry);
        boolean z2 = false;
        boolean z3 = R != null && R.gc();
        Videos videos = newsEntry instanceof Videos ? (Videos) newsEntry : null;
        boolean z4 = videos != null && videos.Ea();
        boolean z5 = newsEntry instanceof ShitAttachment;
        ShitAttachment shitAttachment = z5 ? (ShitAttachment) newsEntry : null;
        boolean z6 = shitAttachment != null && shitAttachment.Hb();
        ShitAttachment shitAttachment2 = z5 ? (ShitAttachment) newsEntry : null;
        if (shitAttachment2 != null && shitAttachment2.Gb()) {
            z2 = true;
        }
        boolean b = s1c0Var.b();
        if (b && z3) {
            i = 353;
        } else {
            if (!b) {
                if (z4) {
                    i = di60.o((Videos) newsEntry) ? 336 : Http.StatusCode.SEE_OTHER;
                } else if (z3 && R.kc()) {
                    i = 231;
                } else if (z3) {
                    i = Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE;
                } else if (z6) {
                    i = 299;
                } else if (z2) {
                    i = 337;
                }
            }
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (videoAttachment.Jb().W9()) {
            return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
        }
        if (videoAttachment.Q5() || videoAttachment.Hb() != null) {
            return z ? 58 : 59;
        }
        if (z) {
            return 258;
        }
        return Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE;
    }

    public static boolean b(int i) {
        return i == 15 || i == 49;
    }

    public static boolean c(int i) {
        return i == 44 || i == 54 || i == 95 || i == 43 || i == 39 || i == 83;
    }

    public static boolean d(int i) {
        return i == 302;
    }

    public static boolean e(int i) {
        return i == 181;
    }
}
