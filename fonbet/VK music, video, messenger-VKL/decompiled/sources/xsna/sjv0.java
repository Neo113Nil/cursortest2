package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.ShareVmojiStoryParams;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VmojiAttachment;
import com.vkontakte.android.sharing.SharingExternalActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bbj0;
import xsna.c70;
import xsna.kbj0;

/* compiled from: VkSharingBridge.kt */
/* loaded from: classes11.dex */
public final class sjv0 implements kbj0 {
    public static final sjv0 a = new sjv0();
    public static final bpn0 b = new bpn0(new fr6(23));

    public static bbj0.a F(sjv0 sjv0Var, Context context, VideoFile videoFile, boolean z, boolean z2, String str, Peer peer, MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource, int i) {
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        if ((i & 64) != 0) {
            mobileOfficialAppsSharingStat$TypeEventSource = null;
        }
        peer.getClass();
        boolean z3 = !peer.Ab(Peer.Type.GROUP);
        bbj0.a.getClass();
        um6 um6Var = (um6) bbj0.b.a(context);
        um6Var.o(z2);
        um6Var.q(z);
        um6Var.u(peer);
        AttachmentInfo c = z74.c(videoFile, str);
        c.Ab(videoFile.r());
        um6Var.m(c);
        um6Var.a(c70.c(videoFile, Boolean.valueOf(z3)));
        um6Var.v(videoFile);
        um6Var.f();
        um6Var.w(mobileOfficialAppsSharingStat$TypeEventSource);
        return um6Var;
    }

    @Override // xsna.kbj0
    public final void A(Activity activity, Attachment attachment, Peer peer) {
        kmg.b(activity, attachment, false, null, false, peer, 88);
    }

    @Override // xsna.kbj0
    public final void B(FragmentActivity fragmentActivity, Playlist playlist, NewsEntry newsEntry) {
        s21.k(newsEntry);
        bbj0.a.getClass();
        um6 um6Var = (um6) bbj0.b.a(fragmentActivity);
        um6Var.m(z74.h(playlist));
        um6Var.a(c70.a());
        um6Var.c();
    }

    @Override // xsna.kbj0
    public final void C(Context context, Curator curator) {
        bbj0.a.getClass();
        um6 um6Var = (um6) bbj0.b.a(context);
        um6Var.m(z74.f(curator));
        um6Var.a(c70.h());
        um6Var.c();
    }

    @Override // xsna.kbj0
    public final void D(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SharingExternalActivity.class);
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", jeq0.g(str));
        intent.putExtra("extra_can_post_story", false);
        intent.setType("image/*");
        context.startActivity(intent);
    }

    @Override // xsna.kbj0
    public final void E(u90 u90Var, int i, Attachment attachment, boolean z) {
        kmg.c(u90Var, i, attachment, z);
    }

    @Override // xsna.kbj0
    public final void a(Context context, List<? extends Uri> list) {
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        String string = context.getString(R.string.vk_file_provider_authority);
        intent.setType("*/*");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String path = ((Uri) it.next()).getPath();
            File file = path != null ? new File(path) : null;
            if (file != null) {
                arrayList.add(file);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(FileProvider.getUriForFile(context, string, (File) it2.next()));
        }
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", p4g.q(arrayList2));
        context.startActivity(Intent.createChooser(intent, ""));
    }

    @Override // xsna.kbj0
    public final void b(jbs jbsVar, ApiApplication apiApplication, String str, q7j0 q7j0Var, String str2) {
        bbj0.b bVar = bbj0.a;
        Context B = jbsVar.B();
        bVar.getClass();
        um6 um6Var = (um6) bbj0.b.a(B);
        um6Var.a(c70.d(apiApplication, str, str, q7j0Var != null ? q7j0Var.a() : null));
        um6Var.x(SharingDataType.MINI_APP.ordinal());
        um6Var.m(z74.d(apiApplication, str, q7j0Var != null ? q7j0Var.b() : null));
        um6Var.t(str2);
        um6Var.h(jbsVar, 105);
    }

    @Override // xsna.kbj0
    public final void d(kbj0.a aVar) {
        ((io.reactivex.rxjava3.subjects.f) b.getValue()).onNext(aVar);
    }

    @Override // xsna.kbj0
    public final void f(jbs jbsVar, Object obj, String str) {
        ArticleAttachment articleAttachment = obj instanceof ArticleAttachment ? (ArticleAttachment) obj : null;
        if (articleAttachment == null) {
            return;
        }
        AttachmentInfo b2 = z74.b(articleAttachment.Db());
        b2.Ab(str);
        bbj0.b bVar = bbj0.a;
        Context B = jbsVar.B();
        bVar.getClass();
        um6 um6Var = (um6) bbj0.b.a(B);
        um6Var.l(articleAttachment.Db());
        um6Var.m(b2);
        um6Var.a(c70.b(articleAttachment.Db()));
        um6Var.x(SharingDataType.ARTICLE.ordinal());
        um6Var.h(jbsVar, 999);
    }

    @Override // xsna.kbj0
    public final void g(u90 u90Var, VideoFile videoFile, boolean z) {
        ((um6) F(this, u90Var.B(), videoFile, z, false, null, null, null, 112)).h(u90Var, 5551);
    }

    @Override // xsna.kbj0
    public final void h(Context context, MusicTrack musicTrack) {
        bbj0.a.getClass();
        um6 um6Var = (um6) bbj0.b.a(context);
        um6Var.m(z74.g(musicTrack));
        Boolean bool = Boolean.TRUE;
        um6Var.a(c70.e(musicTrack, bool, bool));
        um6Var.c();
    }

    @Override // xsna.kbj0
    public final void i(Context context, VideoFile videoFile, boolean z, boolean z2, Peer peer, MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource) {
        ((um6) F(this, context, videoFile, z, z2, null, peer, mobileOfficialAppsSharingStat$TypeEventSource, 16)).c();
    }

    @Override // xsna.kbj0
    public final void j(Context context, String str, ShareVmojiStoryParams shareVmojiStoryParams) {
        AttachmentInfo.b bVar = new AttachmentInfo.b(40);
        bVar.b("attachments", new VmojiAttachment(str, shareVmojiStoryParams));
        bVar.c("link", str);
        AttachmentInfo a2 = bVar.a();
        bbj0.a.getClass();
        um6 um6Var = (um6) bbj0.b.a(context);
        um6Var.q(false);
        um6Var.p(null);
        um6Var.m(a2);
        um6Var.c();
    }

    @Override // xsna.kbj0
    public final void k(Context context, String str) {
        bbj0.a.getClass();
        bbj0.a a2 = bbj0.b.a(context);
        c70.b bVar = new c70.b();
        bVar.l(false);
        bVar.j(false);
        bVar.m(str);
        bVar.k(false);
        um6 um6Var = (um6) a2;
        um6Var.a(bVar.b());
        um6Var.x(SharingDataType.CHAT_LINK.ordinal());
        um6Var.c();
    }

    @Override // xsna.kbj0
    public final void l(Context context, Artist artist) {
        bbj0.a.getClass();
        um6 um6Var = (um6) bbj0.b.a(context);
        um6Var.m(z74.e(artist));
        um6Var.a(c70.g());
        um6Var.x(SharingDataType.ARTIST.ordinal());
        um6Var.c();
    }

    @Override // xsna.kbj0
    public final void m(jbs jbsVar, String str) {
        bbj0.b bVar = bbj0.a;
        Context B = jbsVar.B();
        bVar.getClass();
        um6 um6Var = (um6) bbj0.b.a(B);
        um6Var.r(str, false);
        um6Var.h(jbsVar, 102);
    }

    @Override // xsna.kbj0
    public final void n(Context context, VideoFile videoFile) {
        kbj0.u(this, context, videoFile, true, false, null, null, 56);
    }

    @Override // xsna.kbj0
    public final io.reactivex.rxjava3.core.q<kbj0.a> o() {
        return ((io.reactivex.rxjava3.subjects.f) b.getValue()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.kbj0
    public final void p(Context context, VideoFile videoFile, String str) {
        ((um6) F(this, context, videoFile, true, false, str, null, null, 32)).c();
    }

    @Override // xsna.kbj0
    public final void q(FragmentActivity fragmentActivity, String str, String str2, boolean z, UserProfile userProfile) {
        bbj0.a.getClass();
        ((um6) bbj0.b.a(fragmentActivity)).j(str, str2, z, userProfile);
    }

    @Override // xsna.kbj0
    public final ArrayList r() {
        AppShareType[] values = AppShareType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (AppShareType appShareType : values) {
            arrayList.add(appShareType.h());
        }
        return arrayList;
    }

    @Override // xsna.kbj0
    public final void s(Context context, VideoAlbum videoAlbum, boolean z) {
        bbj0.a.getClass();
        um6 um6Var = (um6) bbj0.b.a(context);
        um6Var.q(z);
        um6Var.m(z74.i(videoAlbum));
        um6Var.a(c70.f());
        um6Var.v(videoAlbum);
        um6Var.f();
        um6Var.c();
    }

    @Override // xsna.kbj0
    public final void t(Context context, Object obj, boolean z, String str, boolean z2, Peer peer) {
        kmg.b(context, obj, z, str, z2, peer, 48);
    }

    @Override // xsna.kbj0
    public final void v(Context context, String str, String str2) {
        bbj0.a.getClass();
        um6 um6Var = (um6) bbj0.b.a(context);
        um6Var.q(false);
        um6Var.p(str2);
        um6Var.k(str);
    }

    @Override // xsna.kbj0
    public final void w(Context context, String str, boolean z, Peer peer, String str2, boolean z2) {
        bbj0.a.getClass();
        um6 um6Var = (um6) bbj0.b.a(context);
        um6Var.q(z2);
        um6Var.p(str2);
        um6Var.u(peer);
        um6Var.v(null);
        um6Var.i(str, z);
    }

    @Override // xsna.kbj0
    public final void x(bc6 bc6Var, String str, String str2) {
        bbj0.b bVar = bbj0.a;
        Context B = bc6Var.B();
        bVar.getClass();
        bbj0.a a2 = bbj0.b.a(B);
        c70.b bVar2 = new c70.b();
        bVar2.g();
        bVar2.h(bc6Var.B().getString(R.string.send_widget_snapshot));
        bVar2.i(bc6Var.B().getString(R.string.send_widget_info));
        um6 um6Var = (um6) a2;
        um6Var.a(bVar2.b());
        um6Var.m(z74.j(str2, str));
        um6Var.h(bc6Var, 194124);
    }

    @Override // xsna.kbj0
    public final void y(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SharingExternalActivity.class);
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/*");
        context.startActivity(intent);
    }

    @Override // xsna.kbj0
    public final void z(jbs jbsVar, do0 do0Var) {
        bbj0.b bVar = bbj0.a;
        Context B = jbsVar.B();
        bVar.getClass();
        bbj0.a a2 = bbj0.b.a(B);
        c70.b bVar2 = new c70.b();
        bVar2.g();
        um6 um6Var = (um6) a2;
        um6Var.a(bVar2.b());
        um6Var.n();
        um6Var.m(z74.k(do0Var));
        um6Var.h(jbsVar, 123);
    }
}
