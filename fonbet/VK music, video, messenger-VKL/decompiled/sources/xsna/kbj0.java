package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.ShareVmojiStoryParams;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.stat.scheme.SchemeStat$TypeShareItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SharingBridge.kt */
/* loaded from: classes.dex */
public interface kbj0 {

    /* compiled from: SharingBridge.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final int a;
        public final SchemeStat$TypeShareItem.ShareType b;
        public final Long c;
        public final UserId d;
        public final String e;
        public final Bundle f;

        public a(int i, SchemeStat$TypeShareItem.ShareType shareType, Long l) {
            this(i, shareType, l, null, null, 56);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
            Long l = this.c;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            UserId userId = this.d;
            int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str = this.e;
            return this.f.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SharingResult(requestCode=");
            sb.append(this.a);
            sb.append(", target=");
            sb.append(this.b);
            sb.append(", id=");
            sb.append(this.c);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", packageName=");
            sb.append(this.e);
            sb.append(", extra=");
            return uf3.c(sb, this.f, ')');
        }

        public a(int i, SchemeStat$TypeShareItem.ShareType shareType, Long l, UserId userId) {
            this(i, shareType, l, userId, null, 48);
        }

        public a(int i, SchemeStat$TypeShareItem.ShareType shareType, Long l, UserId userId, String str, int i2) {
            l = (i2 & 4) != 0 ? null : l;
            userId = (i2 & 8) != 0 ? null : userId;
            str = (i2 & 16) != 0 ? null : str;
            Bundle bundle = Bundle.EMPTY;
            this.a = i;
            this.b = shareType;
            this.c = l;
            this.d = userId;
            this.e = str;
            this.f = bundle;
        }
    }

    static /* synthetic */ void c(kbj0 kbj0Var, Context context, String str, boolean z, Peer peer, String str2, boolean z2, int i) {
        if ((i & 8) != 0) {
            peer = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        kbj0Var.w(context, str, z, peer, str2, z2);
    }

    static void e(kbj0 kbj0Var, Context context, Object obj, boolean z, String str, boolean z2, Peer peer, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        kbj0Var.t(context, obj, z, str, z2, peer);
    }

    static void u(kbj0 kbj0Var, Context context, VideoFile videoFile, boolean z, boolean z2, Peer peer, MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        if ((i & 32) != 0) {
            mobileOfficialAppsSharingStat$TypeEventSource = null;
        }
        kbj0Var.i(context, videoFile, z, z2, peer, mobileOfficialAppsSharingStat$TypeEventSource);
    }

    default void A(Activity activity, Attachment attachment, Peer peer) {
        e(this, activity, attachment, false, null, false, null, 32);
    }

    void B(FragmentActivity fragmentActivity, Playlist playlist, NewsEntry newsEntry);

    void C(Context context, Curator curator);

    void D(Context context, String str);

    void E(u90 u90Var, int i, Attachment attachment, boolean z);

    void b(jbs jbsVar, ApiApplication apiApplication, String str, q7j0 q7j0Var, String str2);

    void f(jbs jbsVar, Object obj, String str);

    void k(Context context, String str);

    void l(Context context, Artist artist);

    void m(jbs jbsVar, String str);

    default io.reactivex.rxjava3.core.q<a> o() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    ArrayList r();

    void t(Context context, Object obj, boolean z, String str, boolean z2, Peer peer);

    void v(Context context, String str, String str2);

    void w(Context context, String str, boolean z, Peer peer, String str2, boolean z2);

    void x(bc6 bc6Var, String str, String str2);

    void y(Context context, String str);

    default void d(a aVar) {
    }

    default void a(Context context, List<? extends Uri> list) {
    }

    default void h(Context context, MusicTrack musicTrack) {
    }

    default void n(Context context, VideoFile videoFile) {
    }

    default void z(jbs jbsVar, do0 do0Var) {
    }

    default void g(u90 u90Var, VideoFile videoFile, boolean z) {
    }

    default void j(Context context, String str, ShareVmojiStoryParams shareVmojiStoryParams) {
    }

    default void p(Context context, VideoFile videoFile, String str) {
    }

    default void s(Context context, VideoAlbum videoAlbum, boolean z) {
    }

    default void q(FragmentActivity fragmentActivity, String str, String str2, boolean z, UserProfile userProfile) {
    }

    default void i(Context context, VideoFile videoFile, boolean z, boolean z2, Peer peer, MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource) {
    }
}
