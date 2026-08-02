package xsna;

import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vkontakte.android.R;
import xsna.gs90;

/* compiled from: ProfileActions.kt */
/* loaded from: classes5.dex */
public abstract class yvu implements ProfileAction {

    /* compiled from: ProfileActions.kt */
    public static final class a extends yvu {
        public final String a;
        public final boolean b;
        public final ztu c = new ztu(R.string.voip_call_user, R.drawable.vk_icon_phone_outline_28);
        public final ProfileAction.Type d = ProfileAction.Type.CALL;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.c;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Call(uid=");
            sb.append(this.a);
            sb.append(", addBottomPadding=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class b extends yvu {
        public final String a;
        public final boolean b;
        public final ztu c = new ztu(R.string.vk_header_action_clip, R.drawable.vk_icon_logo_clips_outline_28);
        public final ProfileAction.Type d = ProfileAction.Type.CLIP;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.c;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Clip(uid=");
            sb.append(this.a);
            sb.append(", addBottomPadding=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class c extends yvu {
        public final String a;
        public final boolean b;
        public final ztu c;
        public final ProfileAction.Type d = ProfileAction.Type.FRIEND;

        public c(String str, boolean z, ztu ztuVar) {
            this.a = str;
            this.b = z;
            this.c = ztuVar;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.c;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.d;
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Friends(uid=" + this.a + ", addBottomPadding=" + this.b + ", hardcodeRes=" + this.c + ')';
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class d extends yvu {
        public final String a;
        public final boolean b;
        public final ztu c = new ztu(R.string.gift, R.drawable.vk_icon_gift_outline_28);
        public final ProfileAction.Type d = ProfileAction.Type.GIFT;

        public d(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.c;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gift(uid=");
            sb.append(this.a);
            sb.append(", showGiftArrow=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class e extends yvu {
        public final String a;
        public final boolean b;
        public final ztu c = new ztu(R.string.live, R.drawable.vk_icon_live_outline_28);
        public final ProfileAction.Type d = ProfileAction.Type.LIVE;

        public e(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.c;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Live(uid=");
            sb.append(this.a);
            sb.append(", addBottomPadding=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class f extends yvu {
        public final int a;
        public final ztu b = new ztu(R.string.user_profile_menu_memories, R.drawable.vk_icon_history_backward_outline_28);
        public final ProfileAction.Type c = ProfileAction.Type.MEMORIES;

        public f(int i) {
            this.a = i;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.b;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            fVar.getClass();
            return this.a == fVar.a;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.c;
        }

        public final int hashCode() {
            return shy.a(this.a, Boolean.hashCode(false) * 31, 31);
        }

        public final String toString() {
            return h5s.c(this.a, ", backendRes=null)", new StringBuilder("Memories(addBottomPadding=false, badgeCounter="));
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class g extends yvu {
        public final String a;
        public final int b;
        public final boolean c;
        public final gs90.a d;
        public final vv5 e;
        public final ProfileAction.Type f = ProfileAction.Type.OPEN_APP;

        public g(String str, int i, boolean z, gs90.a aVar, vv5 vv5Var) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = aVar;
            this.e = vv5Var;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return this.e;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && this.b == gVar.b && this.c == gVar.c && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e);
        }

        @Override // xsna.yvu, com.vk.profile.user.api.domain.actions.ProfileAction
        public final gs90.a getPayload() {
            return this.d;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.f;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c) + ((int) this.d.a.b)) * 31);
        }

        public final String toString() {
            return "Other(uid=" + this.a + ", badgeCounter=" + this.b + ", addBottomPadding=" + this.c + ", payload=" + this.d + ", backendRes=" + this.e + ')';
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class h extends yvu {
        public final String a;
        public final boolean b;
        public final ztu c = new ztu(R.string.vk_header_action_photos, R.drawable.vk_icon_picture_outline_28);
        public final ProfileAction.Type d = ProfileAction.Type.PHOTO;

        public h(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.c;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && this.b == hVar.b;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Photo(uid=");
            sb.append(this.a);
            sb.append(", addBottomPadding=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class i extends yvu {
        public final String a;
        public final boolean b;
        public final ztu c = new ztu(R.string.vk_header_action_post, R.drawable.vk_icon_write_square_outline_28);
        public final ProfileAction.Type d = ProfileAction.Type.POST;

        public i(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.c;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && this.b == iVar.b;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Post(uid=");
            sb.append(this.a);
            sb.append(", addBottomPadding=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class j extends yvu {
        public final String a;
        public final boolean b;
        public final int c;
        public final vv5 d;
        public final ztu e;
        public final ProfileAction.Type f = ProfileAction.Type.PROFILE_QUESTION;

        public j(String str, boolean z, int i, vv5 vv5Var, ztu ztuVar) {
            this.a = str;
            this.b = z;
            this.c = i;
            this.d = vv5Var;
            this.e = ztuVar;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.e;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return this.d;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && this.b == jVar.b && this.c == jVar.c && epx.f(this.d, jVar.d) && epx.f(this.e, jVar.e);
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.f;
        }

        public final int hashCode() {
            int a = shy.a(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31);
            vv5 vv5Var = this.d;
            return this.e.hashCode() + ((a + (vv5Var == null ? 0 : vv5Var.hashCode())) * 31);
        }

        public final String toString() {
            return "Question(uid=" + this.a + ", addBottomPadding=" + this.b + ", badgeCounter=" + this.c + ", backendRes=" + this.d + ", hardcodeRes=" + this.e + ')';
        }
    }

    /* compiled from: ProfileActions.kt */
    public static final class k extends yvu {
        public final String a;
        public final boolean b;
        public final ztu c = new ztu(R.string.story, R.drawable.vk_icon_camera_outline_28);
        public final ProfileAction.Type d = ProfileAction.Type.STORY;

        public k(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ztu a() {
            return this.c;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final vv5 b() {
            return null;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final int c() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && this.b == kVar.b;
        }

        @Override // com.vk.profile.user.api.domain.actions.ProfileAction
        public final ProfileAction.Type getType() {
            return this.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Story(uid=");
            sb.append(this.a);
            sb.append(", addBottomPadding=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    @Override // com.vk.profile.user.api.domain.actions.ProfileAction
    public gs90.a getPayload() {
        return null;
    }
}
