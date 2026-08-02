package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Peer;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.sharing.core.SharingActivity;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vkontakte.android.attachments.LinkAttachment;
import xsna.bbj0;
import xsna.c70;

/* compiled from: BaseSharingBuilder.kt */
/* loaded from: classes5.dex */
public abstract class um6 implements bbj0.a {
    public final Context a;
    public AttachmentInfo c;
    public ActionsInfo d;
    public Post e;
    public UserProfile f;
    public Integer g;
    public Integer h;
    public Article i;
    public Parcelable j;
    public Integer k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String q;
    public String r;
    public String s;
    public String t;
    public Peer u;
    public MobileOfficialAppsSharingStat$TypeEventSource v;
    public final pxo0 b = new pxo0(500);
    public boolean p = true;

    public um6(Context context) {
        this.a = context;
    }

    @Override // xsna.bbj0.a
    public final um6 a(ActionsInfo actionsInfo) {
        this.d = actionsInfo;
        return this;
    }

    public final Intent b(Context context) {
        Activity h = e3m.h(context);
        Intent putExtra = d(context).putExtra("actions_info", this.d).putExtra("fullscreen", false).putExtra("hide_keyboard_on_done", this.n).putExtra("extra_is_open_from_sharing", this.o).putExtra("referer", this.q).putExtra("referer_src", this.r).putExtra("ref", this.s).putExtra("is_direct_message_action_disabled", this.l).putExtra("force_dark_theme", this.m).putExtra("with_external_apps", false).putExtra("extra_entry_point", this.t).putExtra("extra_is_open_external_chat_after_sharing", false).putExtra("extra_sharing_success_request_code", 0).putExtra("extra_show_add_comment", this.p).putExtra("owner_id", this.u);
        Integer num = this.k;
        if (num != null) {
            putExtra.putExtra("extra_accent_color", num.intValue());
        }
        Integer num2 = this.g;
        if (num2 != null) {
            putExtra.putExtra("extra_list_item_position", num2.intValue());
        }
        Integer num3 = this.h;
        if (num3 != null) {
            putExtra.putExtra("extra_data_type", num3.intValue());
        }
        MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource = this.v;
        if (mobileOfficialAppsSharingStat$TypeEventSource != null) {
            putExtra.putExtra("extra_share_source", mobileOfficialAppsSharingStat$TypeEventSource.name());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("attachment_info", this.c);
        bundle.putParcelable("post", this.e);
        bundle.putParcelable("extra_user_profile", this.f);
        bundle.putParcelable("extra_article", this.i);
        bundle.putParcelable("extra_related_object", this.j);
        SharingActivity.n0 = bundle;
        if (h == null) {
            putExtra.addFlags(268435456);
        }
        return putExtra;
    }

    @Override // xsna.bbj0.a
    public final void c() {
        e();
        if (this.b.a()) {
            return;
        }
        Context context = this.a;
        context.startActivity(b(context));
    }

    public abstract Intent d(Context context);

    public final void e() {
        if (this.d == null) {
            c70.b bVar = new c70.b();
            Peer peer = this.u;
            if (epx.f(peer != null ? Boolean.valueOf(peer.Ab(Peer.Type.GROUP)) : null, Boolean.TRUE)) {
                bVar.k(false);
            }
            this.d = bVar.b();
        }
        if (this.c == null && this.d.c.isEmpty()) {
            throw new IllegalStateException("AttachmentInfo must not be null");
        }
    }

    public final um6 f() {
        this.n = true;
        return this;
    }

    public final void g() {
        AttachmentInfo attachmentInfo = this.c;
        if (attachmentInfo == null) {
            throw new IllegalStateException("Check failed.");
        }
        if (attachmentInfo.zb() == null) {
            throw new IllegalStateException("Check failed.");
        }
        AttachmentInfo attachmentInfo2 = this.c;
        if (attachmentInfo2 != null) {
            if (attachmentInfo2.zb() == null) {
                throw new IllegalStateException("Check failed.");
            }
            String zb = attachmentInfo2.zb();
            String str = new String();
            cbj0.e(this.a, zb, SharingDataType.OTHER, false, null, str, null, new rfq(attachmentInfo2));
        }
    }

    public final void h(u90 u90Var, int i) {
        e();
        u90Var.D(b(this.a), i, null);
    }

    public final void i(String str, boolean z) {
        s(str, z);
        c();
    }

    public final void j(String str, String str2, boolean z, UserProfile userProfile) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("attachments", new LinkAttachment(str));
        bundle.putString("link", str);
        bundle.putString("photo_url", str2);
        bundle.putBoolean("my_profile", z);
        this.c = new AttachmentInfo(24, 0L, 0L, null, bundle);
        if (userProfile != null) {
            this.f = userProfile;
            boolean z2 = userProfile.k;
            k70 k70Var = c70.a;
            c70.b bVar = new c70.b();
            bVar.e(true, z2);
            bVar.b = false;
            bVar.c = false;
            this.d = bVar.b();
        } else {
            k70 k70Var2 = c70.a;
            c70.b bVar2 = new c70.b();
            bVar2.e(false, false);
            bVar2.b = false;
            bVar2.c = false;
            this.d = bVar2.b();
        }
        c();
    }

    public final void k(String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("attachments", new LinkAttachment(str));
        bundle.putString("link", str);
        bundle.putInt("type_link", 1);
        this.c = new AttachmentInfo(11, 0L, 0L, null, bundle);
        k70 k70Var = c70.a;
        c70.b bVar = new c70.b();
        if (!y501.a().g(str)) {
            bVar.k(false);
        }
        bVar.c = false;
        this.d = bVar.b();
        c();
    }

    public final um6 l(Article article) {
        this.i = article;
        return this;
    }

    public final um6 m(AttachmentInfo attachmentInfo) {
        this.c = attachmentInfo;
        return this;
    }

    public final um6 n() {
        this.p = false;
        return this;
    }

    public final um6 o(boolean z) {
        this.l = z;
        return this;
    }

    public final um6 p(String str) {
        this.t = str;
        return this;
    }

    public final um6 q(boolean z) {
        this.m = z;
        return this;
    }

    public final /* bridge */ /* synthetic */ um6 r(String str, boolean z) {
        s(str, z);
        return this;
    }

    public final void s(String str, boolean z) {
        ActionsInfo i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("attachments", new LinkAttachment(str));
        bundle.putString("link", str);
        this.c = new AttachmentInfo(11, 0L, 0L, null, bundle);
        if (z) {
            k70 k70Var = c70.a;
            c70.b bVar = new c70.b();
            bVar.b = false;
            bVar.c = false;
            bVar.k(true);
            bVar.j = str;
            i = bVar.b();
        } else {
            i = c70.i(this.u, str);
        }
        this.d = i;
        x(SharingDataType.LINK.ordinal());
    }

    public final um6 t(String str) {
        this.s = str;
        return this;
    }

    public final um6 u(Peer peer) {
        this.u = peer;
        return this;
    }

    public final um6 v(Parcelable parcelable) {
        this.j = parcelable;
        return this;
    }

    public final void w(MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource) {
        this.v = mobileOfficialAppsSharingStat$TypeEventSource;
    }

    public final um6 x(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }
}
