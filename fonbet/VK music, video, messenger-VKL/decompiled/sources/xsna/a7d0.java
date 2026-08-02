package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: PrimaryAttachmentDisplayItemsFactory.kt */
/* loaded from: classes.dex */
public final class a7d0 {
    public final vbk0 a;
    public final sn3 b;

    public a7d0(a6a0 a6a0Var, bdl bdlVar, wuj wujVar, vbk0 vbk0Var, sn3 sn3Var) {
        this.a = vbk0Var;
        this.b = sn3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r74 a(v1c0 v1c0Var, int i, Attachment attachment, int i2, ArrayList arrayList, s1c0 s1c0Var) {
        int i3;
        NewsEntry a = v1c0Var.a();
        NewsEntry c = v1c0Var.c();
        r74 r74Var = null;
        if (!(attachment instanceof AlbumAttachment)) {
            if (attachment instanceof VideoAttachment) {
                VideoAttachment videoAttachment = (VideoAttachment) attachment;
                if (i == 220) {
                    i3 = i;
                    r74Var = bdl.b(i3, a, c, videoAttachment);
                } else if (i == 257) {
                    i3 = i;
                    p2s0 p2s0Var = new p2s0(a, c, videoAttachment, i3, s1c0Var);
                    r74Var = new r74(i3, p2s0Var.a(), p2s0Var.b(), p2s0Var.c());
                    r74Var.h = (ol60) j5g.a0(new j4s0().a(p2s0Var));
                } else if (i == 258) {
                    r74 r74Var2 = new r74(i, videoAttachment, a, c);
                    r74Var2.h = (ol60) j5g.a0(new vgt0().x(new mds0(i, a, c, videoAttachment), null));
                    r74Var = r74Var2;
                }
            } else {
                i3 = i;
                if (attachment instanceof PhotoAttachment) {
                    vp10 vp10Var = new vp10(a, c, (PhotoAttachment) attachment, i3, i2, arrayList, s1c0Var.d());
                    switch (vp10Var.d()) {
                        case 203:
                            r74Var = a6a0.c(vp10Var);
                            break;
                        case 204:
                            r74Var = a6a0.b(vp10Var);
                            break;
                        case 205:
                            r74Var = a6a0.a(vp10Var);
                            break;
                    }
                } else if (attachment instanceof DocumentAttachment) {
                    DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
                    if (i3 == 206) {
                        r74Var = wuj.c(a, c, documentAttachment, i3);
                    } else if (i3 == 207) {
                        r74Var = wuj.b(a, c, documentAttachment, i3);
                    }
                } else if (attachment instanceof MarketAlbumAttachment) {
                    if (i3 == 212) {
                        r74Var = new r74(i3, attachment, a, c);
                    }
                } else if (attachment instanceof GraffitiAttachment) {
                    if (i3 == 213) {
                        r74Var = new r74(i3, attachment, a, c);
                    }
                } else if (attachment instanceof SnippetAttachment) {
                    if (i3 == 215) {
                        SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
                        r74Var = new r74(i3, snippetAttachment, a, c);
                        r74Var.h = (ol60) j5g.a0(this.a.a.b().x(new Pair(a, snippetAttachment), new bp5(i3, snippetAttachment.Ab(), c)));
                    } else if (i3 == 268) {
                        r74Var = new r74(i3, attachment, a, c);
                    }
                } else if (attachment instanceof ArticleAttachment) {
                    sn3 sn3Var = this.b;
                    if (i3 == 215) {
                        r74Var = sn3Var.b(a, c, i3, (ArticleAttachment) attachment);
                    } else if (i3 == 344) {
                        r74Var = sn3Var.a(a, c, i3, (ArticleAttachment) attachment);
                    } else if (i3 == 345) {
                        r74Var = sn3.c(a, c, i3, (ArticleAttachment) attachment);
                    }
                } else if (attachment instanceof PollAttachment) {
                    PollAttachment pollAttachment = (PollAttachment) attachment;
                    NewsEntry a2 = v1c0Var.a();
                    NewsEntry c2 = v1c0Var.c();
                    if (i3 == 293) {
                        r74Var = new r74(i3, pollAttachment, a2, c2);
                        r74Var.h = (ol60) j5g.a0(new nad0().a(0, new Triple(pollAttachment, v1c0Var, new m7x0(0))));
                    }
                } else if (attachment instanceof AudioAttachment) {
                    if (i3 == 219) {
                        r74Var = new r74(i3, attachment, a, c);
                    }
                } else if ((attachment instanceof AudioPlaylistAttachment) && i3 == 211) {
                    r74Var = new r74(i3, attachment, a, c);
                }
            }
            return r74Var != null ? new r74(i3, attachment, a, c) : r74Var;
        }
        if (i == 210) {
            AlbumAttachment albumAttachment = (AlbumAttachment) attachment;
            r74Var = new r74(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, albumAttachment, a, c);
            r74Var.h = (ol60) j5g.a0(r6d0.a(new bd1(a, a, albumAttachment, s1c0Var.d())));
        }
        i3 = i;
        if (r74Var != null) {
        }
    }
}
