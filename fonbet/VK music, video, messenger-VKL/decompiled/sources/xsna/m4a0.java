package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.contacts.AndroidContact;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.nwb;
import xsna.xxd0;

/* compiled from: PhonebookContactModel.kt */
/* loaded from: classes2.dex */
public final class m4a0 implements txd0 {
    public final Context a;
    public final iwv b;
    public final AndroidContact c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final io.reactivex.rxjava3.subjects.d<xxd0> e;
    public final io.reactivex.rxjava3.subjects.f<uxd0> f;
    public final Object g;

    /* compiled from: PhonebookContactModel.kt */
    public static final class a implements qxb {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // xsna.qxb
        public final Integer a() {
            return null;
        }

        @Override // xsna.qxb
        public final int b() {
            return R.drawable.vk_icon_linked_24;
        }

        @Override // xsna.qxb
        public final boolean c() {
            return false;
        }

        @Override // xsna.qxb
        public final boolean d() {
            return true;
        }

        @Override // xsna.qxb
        public final boolean e() {
            return false;
        }

        @Override // xsna.qxb
        public final CharSequence f() {
            return this.a;
        }

        @Override // xsna.qxb
        public final int getId() {
            return 1;
        }
    }

    /* compiled from: PhonebookContactModel.kt */
    public static final class b implements qxb {
        public final CharSequence a;

        public b(String str) {
            this.a = str;
        }

        @Override // xsna.qxb
        public final Integer a() {
            return null;
        }

        @Override // xsna.qxb
        public final int b() {
            return R.drawable.vk_icon_phone_outline_28;
        }

        @Override // xsna.qxb
        public final boolean c() {
            return false;
        }

        @Override // xsna.qxb
        public final boolean d() {
            return true;
        }

        @Override // xsna.qxb
        public final boolean e() {
            return false;
        }

        @Override // xsna.qxb
        public final CharSequence f() {
            return this.a;
        }

        @Override // xsna.qxb
        public final int getId() {
            return 0;
        }
    }

    /* compiled from: PhonebookContactModel.kt */
    public static final class c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.vkim_invite_contact_vk) + (Integer.hashCode(R.string.vkim_phonebook_contact_not_registered_vk) * 31);
        }

        public final String toString() {
            return "TextConfig(subtitleRes=2131969810, inviteButtonRes=2131969236)";
        }
    }

    public m4a0(Context context, iwv iwvVar, AndroidContact androidContact, c cVar, g3a0 g3a0Var) {
        this.a = context;
        this.b = iwvVar;
        this.c = androidContact;
        ucp ucpVar = ucp.a;
        this.d = new io.reactivex.rxjava3.disposables.b();
        this.f = new io.reactivex.rxjava3.subjects.f<>();
        this.g = msy.a(LazyThreadSafetyMode.NONE, new so40(this, 7));
        String str = androidContact.c;
        CharSequence i = ucp.i(str);
        String string = context.getString(R.string.vkim_phonebook_contact_not_registered_vk);
        com.vk.im.ui.views.avatars.a aVar = new com.vk.im.ui.views.avatars.a(context, null, 6);
        aVar.c(str, Peer.Type.CONTACT);
        this.e = io.reactivex.rxjava3.subjects.d.O0(new xxd0.b(i, "", string, (CharSequence) "", new VerifyInfo(false, false, false, false, false, false, 63, null), false, false, false, false, false, (ImageList) null, (Drawable) aVar, (AvatarBorderType) null, (List) null, (List) null, e43.l(new nwb.k(new b(g3a0Var.a((String) j5g.X(androidContact.e))), false, false), new nwb.k(new a(context.getString(R.string.vkim_invite_contact_vk)), false, false)), false, (ImStoryState) null, (WritePermission) null, (TransitionData) null, false, 4158464));
    }

    @Override // xsna.txd0
    public final io.reactivex.rxjava3.subjects.f b() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.txd0
    public final io.reactivex.rxjava3.core.v<zxd0> f() {
        return (io.reactivex.rxjava3.core.v) this.g.getValue();
    }

    @Override // xsna.txd0
    public final io.reactivex.rxjava3.subjects.d<xxd0> getState() {
        return this.e;
    }

    @Override // xsna.txd0
    public final void t() {
        this.d.e();
    }

    @Override // xsna.txd0
    public final void d() {
    }

    @Override // xsna.txd0
    public final void e() {
    }

    @Override // xsna.txd0
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.txd0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
