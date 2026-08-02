package xsna;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.users.UserNameCase;
import io.appmetrica.analytics.BuildConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ImCompat.kt */
/* loaded from: classes2.dex */
public final class ozv {
    public static final ozv a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final int c;
    public static final wqo0 d;

    /* compiled from: ImCompat.kt */
    public static final class a implements qtd0 {
        public final Group b;
        public final long c;

        public a(Group group) {
            this.b = group;
            this.c = -group.c.b;
        }

        @Override // xsna.qtd0
        public final UserSex B2() {
            return UserSex.UNKNOWN;
        }

        @Override // xsna.qtd0
        public final String B3() {
            return this.b.d;
        }

        @Override // xsna.qtd0
        public final boolean C6() {
            return false;
        }

        @Override // xsna.qtd0
        public final ImageList C8() {
            Group group = this.b;
            Image image = group.g;
            ImageSize imageSize = (ImageSize) ixj0.b(image != null ? image.b : null);
            String str = group.e;
            if (imageSize != null) {
                Serializer.c<ImageList> cVar = ImageList.CREATOR;
                com.vk.dto.common.im.Image image2 = imageSize.d;
                return ImageList.a.c(image2.b, image2.c, image2.d);
            }
            if (str == null || str.length() == 0) {
                return new ImageList(null, 1, null);
            }
            Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
            return ImageList.a.c(-1, -1, str);
        }

        @Override // xsna.qtd0
        public final ImageStatus E5() {
            return null;
        }

        @Override // xsna.qtd0
        public final String H5(UserNameCase userNameCase) {
            return "";
        }

        @Override // xsna.qtd0
        public final boolean H7() {
            return false;
        }

        @Override // xsna.qtd0
        public final boolean K6() {
            return false;
        }

        @Override // xsna.qtd0
        public final String La() {
            return name();
        }

        @Override // xsna.qtd0
        public final boolean N0() {
            return false;
        }

        @Override // xsna.qtd0
        public final String P5(UserNameCase userNameCase) {
            return name();
        }

        @Override // xsna.qtd0
        public final String Q2(UserNameCase userNameCase) {
            return this.b.d;
        }

        @Override // xsna.qtd0
        public final String Ra() {
            Group group = this.b;
            String str = group.h;
            if (drm0.N(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
            int i = group.p;
            if (i == 0) {
                return "club" + id();
            }
            if (i == 1) {
                return NotificationCompat.CATEGORY_EVENT + id();
            }
            if (i != 2) {
                return "";
            }
            return BuildConfig.SDK_BUILD_FLAVOR + id();
        }

        @Override // xsna.qtd0
        public final boolean W1() {
            return false;
        }

        @Override // xsna.qtd0
        public final String c5() {
            return "";
        }

        @Override // xsna.qtd0
        public final String d6(UserNameCase userNameCase) {
            return this.b.d;
        }

        @Override // xsna.btx0
        public final Number getId() {
            return Long.valueOf(this.c);
        }

        @Override // xsna.qtd0
        public final String h8() {
            return "";
        }

        @Override // xsna.qtd0
        public final String ha() {
            return I9(UserNameCase.NOM);
        }

        @Override // xsna.qtd0
        public final boolean ib() {
            return false;
        }

        @Override // xsna.qtd0
        public final long id() {
            return this.b.c.b;
        }

        @Override // xsna.qtd0
        public final boolean ja() {
            return this.b.h != null;
        }

        @Override // xsna.qtd0
        public final boolean k5() {
            return false;
        }

        @Override // xsna.qtd0
        public final boolean ka() {
            return this.b.o();
        }

        @Override // xsna.qtd0
        public final String m2() {
            String Ra = Ra();
            if (drm0.N(Ra)) {
                Ra = null;
            }
            if (Ra == null) {
                return "";
            }
            String str = "https://" + a0a.d + '/' + Ra;
            return str == null ? "" : str;
        }

        @Override // xsna.qtd0
        public final OnlineInfo mb() {
            return VisibleStatus.f;
        }

        @Override // xsna.qtd0
        public final String n6() {
            String concat;
            String Ra = Ra();
            if (drm0.N(Ra)) {
                Ra = null;
            }
            return (Ra == null || (concat = "https://vk.me/".concat(Ra)) == null) ? "" : concat;
        }

        @Override // xsna.qtd0
        public final boolean n9() {
            return this.b.n0;
        }

        @Override // xsna.qtd0
        public final String name() {
            UserNameCase.a aVar = UserNameCase.Companion;
            return this.b.d;
        }

        @Override // xsna.qtd0
        public final VerifyInfo q9() {
            return this.b.y;
        }

        @Override // xsna.qtd0
        public final boolean r5() {
            return false;
        }

        @Override // xsna.qtd0
        public final long r8() {
            return B7().b;
        }

        @Override // xsna.qtd0
        public final boolean t6() {
            return false;
        }

        @Override // xsna.qtd0
        public final Peer.Type t8() {
            return Peer.Type.GROUP;
        }

        @Override // xsna.qtd0
        public final Long v5() {
            return null;
        }
    }

    /* compiled from: ImCompat.kt */
    public static final class b implements qtd0 {
        public final UserProfile b;
        public final Peer.Type c;
        public final long d;

        public b(UserProfile userProfile, Peer.Type type) {
            this.b = userProfile;
            this.c = type;
            this.d = userProfile.c.b;
        }

        @Override // xsna.qtd0
        public final UserSex B2() {
            return this.b.i;
        }

        @Override // xsna.qtd0
        public final String B3() {
            return this.b.e;
        }

        @Override // xsna.qtd0
        public final boolean C6() {
            return this.b.H;
        }

        @Override // xsna.qtd0
        public final ImageList C8() {
            Image image = this.b.O;
            ImageSize imageSize = (ImageSize) ixj0.b(image != null ? image.b : null);
            if (imageSize == null) {
                return new ImageList(null, 1, null);
            }
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            com.vk.dto.common.im.Image image2 = imageSize.d;
            return ImageList.a.c(image2.b, image2.c, image2.d);
        }

        @Override // xsna.qtd0
        public final ImageStatus E5() {
            return this.b.R;
        }

        @Override // xsna.qtd0
        public final String H5(UserNameCase userNameCase) {
            UserProfile userProfile = this.b;
            return epx.f(userProfile.f, "DELETED") ? drm0.h0(userProfile.e, ' ') : userProfile.f;
        }

        @Override // xsna.qtd0
        public final boolean H7() {
            return this.b.G;
        }

        @Override // xsna.qtd0
        public final boolean K6() {
            return false;
        }

        @Override // xsna.qtd0
        public final String La() {
            return name();
        }

        @Override // xsna.qtd0
        public final boolean N0() {
            return this.b.z;
        }

        @Override // xsna.qtd0
        public final String P5(UserNameCase userNameCase) {
            return name();
        }

        @Override // xsna.qtd0
        public final String Q2(UserNameCase userNameCase) {
            return this.b.e;
        }

        @Override // xsna.qtd0
        public final String Ra() {
            String str = this.b.q;
            if (str != null) {
                return str;
            }
            return "id" + this.d;
        }

        @Override // xsna.qtd0
        public final boolean W1() {
            return false;
        }

        @Override // xsna.qtd0
        public final String c5() {
            return "";
        }

        @Override // xsna.qtd0
        public final String d6(UserNameCase userNameCase) {
            UserProfile userProfile = this.b;
            return epx.f(userProfile.d, "DELETED") ? drm0.l0(userProfile.e, ' ') : userProfile.d;
        }

        @Override // xsna.btx0
        public final Number getId() {
            return Long.valueOf(this.d);
        }

        @Override // xsna.qtd0
        public final String h8() {
            return "";
        }

        @Override // xsna.qtd0
        public final String ha() {
            return I9(UserNameCase.NOM);
        }

        @Override // xsna.qtd0
        public final boolean ib() {
            Boolean bool = this.b.y;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        @Override // xsna.qtd0
        public final long id() {
            return this.b.c.b;
        }

        @Override // xsna.qtd0
        public final boolean ja() {
            return this.b.q != null;
        }

        @Override // xsna.qtd0
        public final boolean k5() {
            return false;
        }

        @Override // xsna.qtd0
        public final boolean ka() {
            return this.b.G();
        }

        @Override // xsna.qtd0
        public final String m2() {
            return "https://" + a0a.d + '/' + Ra();
        }

        @Override // xsna.qtd0
        public final OnlineInfo mb() {
            return this.b.n;
        }

        @Override // xsna.qtd0
        public final String n6() {
            return "https://vk.me/" + Ra();
        }

        @Override // xsna.qtd0
        public final boolean n9() {
            return this.b.Y;
        }

        @Override // xsna.qtd0
        public final String name() {
            UserNameCase.a aVar = UserNameCase.Companion;
            return this.b.e;
        }

        @Override // xsna.qtd0
        public final VerifyInfo q9() {
            return this.b.B;
        }

        @Override // xsna.qtd0
        public final boolean r5() {
            return false;
        }

        @Override // xsna.qtd0
        public final long r8() {
            return B7().b;
        }

        @Override // xsna.qtd0
        public final boolean t6() {
            return false;
        }

        @Override // xsna.qtd0
        public final Peer.Type t8() {
            return this.c;
        }

        @Override // xsna.qtd0
        public final Long v5() {
            return null;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ozv.class, "formatter", "getFormatter()Lcom/vk/im/ui/formatters/DisplayNameFormatter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new ozv();
        c = iah0.a(64);
        d = new wqo0(new vv0(21));
    }

    public static final void a() {
        if (com.vk.core.apps.a.b()) {
            throw new IllegalStateException("Screen is forbidden for messenger");
        }
    }

    public static final String b(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        ImageList C8;
        com.vk.dto.common.im.Image Bb;
        ImageList C82;
        com.vk.dto.common.im.Image Bb2;
        ImageList imageList;
        com.vk.dto.common.im.Image Bb3;
        boolean uc = dialog.uc();
        String str = null;
        int i = c;
        String str2 = "";
        ozv ozvVar = a;
        if (uc) {
            ChatSettings Hb = dialog.Hb();
            if (Hb != null && (imageList = Hb.c) != null && (Bb3 = imageList.Bb(i, i)) != null) {
                str = Bb3.d;
            }
            if (str != null) {
                return str;
            }
            ozvVar.getClass();
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("vkchatplaceholder").authority("c").appendQueryParameter("dialog_id", String.valueOf(dialog.Sb().longValue())).appendQueryParameter("title", dialog.Hb().b);
            boolean sc = dialog.sc();
            if (sc) {
                str2 = String.valueOf(c4g0.t(dialog.hc()));
            } else if (sc) {
                throw new NoWhenBranchMatchedException();
            }
            return appendQueryParameter.appendQueryParameter("force_bg", str2).build().toString();
        }
        if (dialog.E8()) {
            Long Sb = dialog.Sb();
            ozvVar.getClass();
            qtd0 Ab = profilesSimpleInfo.Ab(Sb);
            if (Ab != null && (C82 = Ab.C8()) != null && (Bb2 = C82.Bb(i, i)) != null) {
                str = Bb2.d;
            }
            if (str != null) {
                return str;
            }
            qtd0 Ab2 = profilesSimpleInfo.Ab(dialog.Sb());
            if (Ab2 != null) {
                return new Uri.Builder().scheme("vkcontactplaceholder").authority("c").appendQueryParameter("title", Ab2.name()).build().toString();
            }
        } else {
            Long Sb2 = dialog.Sb();
            ozvVar.getClass();
            qtd0 Ab3 = profilesSimpleInfo.Ab(Sb2);
            if (Ab3 != null && (C8 = Ab3.C8()) != null && (Bb = C8.Bb(i, i)) != null) {
                str = Bb.d;
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public static StoryOwner.Owner c(qtd0 qtd0Var, boolean z) {
        if (qtd0Var.t1() || qtd0Var.Va()) {
            return new StoryOwner.Owner(d(qtd0Var, z).l0());
        }
        return null;
    }

    public static final UserProfile d(qtd0 qtd0Var, boolean z) {
        String str;
        UserProfile userProfile = new UserProfile();
        userProfile.c = new UserId(qtd0Var.G3());
        UserNameCase userNameCase = UserNameCase.NOM;
        userProfile.d = qtd0Var.d6(userNameCase);
        userProfile.f = qtd0Var.H5(userNameCase);
        userProfile.e = qtd0Var.name();
        userProfile.i = UserSex.valueOf(qtd0Var.B2().name());
        float f = 80;
        com.vk.dto.common.im.Image Bb = qtd0Var.C8().Bb(iah0.a(f), iah0.a(f));
        if (Bb == null || (str = Bb.d) == null) {
            str = "";
        }
        userProfile.h = str;
        userProfile.z = qtd0Var.N0();
        userProfile.Y = qtd0Var.n9();
        userProfile.T = z;
        return userProfile;
    }
}
