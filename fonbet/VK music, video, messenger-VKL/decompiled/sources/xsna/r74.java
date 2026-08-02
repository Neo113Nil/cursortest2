package xsna;

import android.os.Parcelable;
import com.ironsource.InterfaceC4413l1;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFileOld;
import com.vk.feed.core.models.attachment.AttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.commons.http.Http;

/* compiled from: AttachmentPostDisplayItem.kt */
/* loaded from: classes4.dex */
public class r74 extends u1c0 {
    public final Attachment q;

    public r74(int i, Attachment attachment, NewsEntry newsEntry, NewsEntry newsEntry2) {
        super(newsEntry, newsEntry2, i);
        this.q = attachment;
    }

    @Override // xsna.u1c0
    public final yg5 a() {
        switch (this.c) {
            case 7:
            case 58:
            case 59:
            case 71:
            case 207:
            case INVALID_CSB_DATA_VALUE:
            case 231:
            case 257:
            case 299:
            case Http.StatusCode.SEE_OTHER /* 303 */:
            case SILENT_MODE_MONITOR_ERROR_VALUE:
            case 336:
            case 337:
            case 353:
            case 367:
            case 404:
            case InterfaceC4413l1.a.b.e /* 405 */:
                Parcelable parcelable = this.q;
                if (parcelable instanceof VideoAttachment) {
                    return ((VideoAttachment) parcelable).i;
                }
                if (parcelable instanceof DocumentAttachment) {
                    return ((DocumentAttachment) parcelable).t;
                }
                if (parcelable instanceof yg5) {
                    yg5 yg5Var = (yg5) parcelable;
                    if (yg5Var.A().T3()) {
                        return yg5Var;
                    }
                }
                return null;
            default:
                return null;
        }
    }

    @Override // xsna.u1c0
    public final String d() {
        if (this.q instanceof VideoAttachment) {
            return super.d();
        }
        return null;
    }

    @Override // xsna.u1c0
    public final String e() {
        switch (this.c) {
            case 7:
            case 58:
            case 59:
            case 71:
            case 207:
            case INVALID_CSB_DATA_VALUE:
            case 231:
            case 257:
            case 299:
            case Http.StatusCode.SEE_OTHER /* 303 */:
            case SILENT_MODE_MONITOR_ERROR_VALUE:
            case 336:
            case 337:
            case 353:
            case 367:
            case 404:
            case InterfaceC4413l1.a.b.e /* 405 */:
                Parcelable parcelable = this.q;
                if (parcelable instanceof VideoAttachment) {
                    return ((VideoAttachment) parcelable).k.r();
                }
                if (parcelable instanceof DocumentAttachment) {
                    VideoFileOld videoFileOld = ((DocumentAttachment) parcelable).r;
                    if (videoFileOld != null) {
                        return videoFileOld.W;
                    }
                } else if (parcelable instanceof yg5) {
                    return ((yg5) parcelable).A().r();
                }
                return null;
            default:
                return null;
        }
    }

    public final Attachment k() {
        return this.q;
    }

    public final AttachmentStyle l() {
        List<EntryAttachment> Gb;
        Object obj;
        NewsEntry newsEntry = this.a;
        NewsEntryWithAttachments newsEntryWithAttachments = newsEntry instanceof NewsEntryWithAttachments ? (NewsEntryWithAttachments) newsEntry : null;
        if (newsEntryWithAttachments != null && (Gb = newsEntryWithAttachments.Gb()) != null) {
            Iterator<T> it = Gb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((EntryAttachment) obj).b, this.q)) {
                    break;
                }
            }
            EntryAttachment entryAttachment = (EntryAttachment) obj;
            if (entryAttachment != null) {
                return entryAttachment.c;
            }
        }
        return null;
    }
}
