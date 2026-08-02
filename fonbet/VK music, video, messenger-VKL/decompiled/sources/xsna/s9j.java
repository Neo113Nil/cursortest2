package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoShowcaseViewHolder;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.libvideo.videobottomsheet.api.a;
import com.vk.music.playlist.display.domain.a;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.Collections;
import xsna.lab0;
import xsna.rw30;
import xsna.u4a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class s9j implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s9j(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        long G3;
        Long l;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                u9j.a(new MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.EventType.MODAL_SYNC_CONTACTS_ACCEPT_IMPORT_CONTACTS, null));
                ((t9j) obj3).b((Activity) obj2, (z9j) obj);
                break;
            case 1:
                wzv wzvVar = (wzv) obj3;
                enj.q(R.string.vkim_download_started, 0, wzvVar.b);
                vao.b(wzvVar.b, (String) obj2, (String) obj, true, null, Boolean.TRUE, false);
                break;
            case 2:
                rw30 rw30Var = (rw30) obj3;
                qtd0 qtd0Var = (qtd0) obj2;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = (ImSearchItemLoggingInfo) obj;
                Dialog dialog = new Dialog();
                if (!qtd0Var.E8() || (l = ((Contact) qtd0Var).j) == null) {
                    G3 = qtd0Var.G3();
                } else {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    G3 = new Peer.User(l.longValue()).b;
                }
                dialog.setId(G3);
                rw30.a aVar = rw30Var.w;
                if (aVar != null) {
                    aVar.e(dialog, new ProfilesSimpleInfo(Collections.singletonList(qtd0Var)), imSearchItemLoggingInfo);
                }
                rw30Var.j1(dialog);
                break;
            case 3:
                ((vtu) obj3).a(0);
                ((k150) obj2).m.a.invoke(new a.f.b(((lab0.a) obj).a));
                break;
            case 4:
                LinkAttachment linkAttachment = (LinkAttachment) ((Attachment) obj);
                fa60.b((Context) obj3, (u1c0) obj2, linkAttachment);
                PostInteract postInteract = linkAttachment.j;
                if (postInteract != null) {
                    postInteract.Db(PostInteract.Type.link_click, linkAttachment.f.b);
                }
                break;
            case 5:
                ((rhc0) obj3).d(((PostPrivacyData) obj2).g, (h1) obj);
                break;
            default:
                UIBlockVideo uIBlockVideo = (UIBlockVideo) obj2;
                VideoShowcaseViewHolder videoShowcaseViewHolder = (VideoShowcaseViewHolder) obj;
                u4a u4aVar = videoShowcaseViewHolder.c;
                Activity b = enj.b((ComposeView) obj3);
                if (b != null) {
                    a.c cVar2 = new a.c(uIBlockVideo.N, uIBlockVideo.M, uIBlockVideo.g, uIBlockVideo.f, uIBlockVideo.H, uIBlockVideo.K);
                    com.vk.libvideo.videobottomsheet.api.a aVar2 = u4aVar.b.P;
                    if (aVar2 == null) {
                        break;
                    } else {
                        u6s0 b2 = aVar2.b();
                        VideoFile videoFile = uIBlockVideo.B;
                        u4a.a aVar3 = u4aVar.b;
                        aVar3.getClass();
                        s6s0 a = b2.a(new a.InterfaceC1255a.C1256a(videoFile, cVar2, null, false), new i6s0(aVar3.f, uIBlockVideo), new VideoShowcaseViewHolder.a(1, xg5.a(), cpu.class, "isCurrentUserOrGroupAdmin", "isCurrentUserOrGroupAdmin(Lcom/vk/dto/common/id/UserId;)Z", 0));
                        if (((Boolean) videoShowcaseViewHolder.e.getValue()).booleanValue()) {
                            new w6s0(a, null).e(b);
                        } else {
                            new e6s0(b, a, null).c();
                        }
                        break;
                    }
                } else {
                    break;
                }
        }
        return s3q0.a;
    }

    public /* synthetic */ s9j(fa60 fa60Var, Context context, u1c0 u1c0Var, Attachment attachment) {
        this.b = 4;
        this.c = context;
        this.d = u1c0Var;
        this.e = attachment;
    }
}
