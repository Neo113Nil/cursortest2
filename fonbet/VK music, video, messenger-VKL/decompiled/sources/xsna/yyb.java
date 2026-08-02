package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ListItems.kt */
/* loaded from: classes2.dex */
public abstract class yyb implements hfz {

    /* compiled from: ListItems.kt */
    public static abstract class a extends yyb {
        public abstract boolean a();

        @Override // xsna.yyb, xsna.hfz
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long getItemId() {
            return Long.valueOf(c().b.b);
        }

        public abstract DialogMember c();

        public abstract tow d();

        public abstract ProfilesInfo e();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!getClass().equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(c(), aVar.c()) && a() == aVar.a() && g() == aVar.g() && f() == aVar.f();
        }

        public abstract boolean f();

        public abstract boolean g();

        public int hashCode() {
            return c().hashCode();
        }
    }

    /* compiled from: ListItems.kt */
    public static final class b extends yyb {
        public final Dialog b;
        public final Peer c;
        public final String d;
        public final ProfilesInfo e;
        public final boolean f;
        public final boolean g = true;

        public b(Dialog dialog, Peer peer, String str, ProfilesInfo profilesInfo, boolean z) {
            this.b = dialog;
            this.c = peer;
            this.d = str;
            this.e = profilesInfo;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!b.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.d, bVar.d) && this.g == bVar.g;
        }

        @Override // xsna.yyb, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return Integer.MIN_VALUE;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.d;
            return Boolean.hashCode(this.g) + hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChatHeaderItem(dialog=");
            sb.append(this.b);
            sb.append(", currentMember=");
            sb.append(this.c);
            sb.append(", customTitle=");
            sb.append(this.d);
            sb.append(", info=");
            sb.append(this.e);
            sb.append(", allowCreateCasperChat=");
            sb.append(this.f);
            sb.append(", themeSettingsAvailable=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: ListItems.kt */
    public static final class c extends yyb {
        static {
            new c();
        }

        @Override // xsna.yyb, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return -2147483645;
        }
    }

    /* compiled from: ListItems.kt */
    public static final class d extends a {
        public final DialogMember b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final ProfilesInfo f;
        public final tow g;

        public d(DialogMember dialogMember, boolean z, boolean z2, boolean z3, ProfilesInfo profilesInfo, tow towVar) {
            this.b = dialogMember;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = profilesInfo;
            this.g = towVar;
        }

        @Override // xsna.yyb.a
        public final boolean a() {
            return this.c;
        }

        @Override // xsna.yyb.a, xsna.yyb, xsna.hfz
        /* renamed from: b */
        public final Long getItemId() {
            return Long.valueOf(this.b.f.intValue());
        }

        @Override // xsna.yyb.a
        public final DialogMember c() {
            return this.b;
        }

        @Override // xsna.yyb.a
        public final tow d() {
            return this.g;
        }

        @Override // xsna.yyb.a
        public final ProfilesInfo e() {
            return this.f;
        }

        @Override // xsna.yyb.a
        public final boolean f() {
            return this.e;
        }

        @Override // xsna.yyb.a
        public final boolean g() {
            return this.d;
        }

        public final String toString() {
            return "IncognitoMemberItem(member=" + this.b + ", hasActions=" + this.c + ", isOwner=" + this.d + ", isAdmin=" + this.e + ", profiles=" + this.f + ", payload=" + this.g + ')';
        }
    }

    /* compiled from: ListItems.kt */
    public static final class e extends yyb {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            return false;
        }

        @Override // xsna.yyb, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return -2147483644;
        }
    }

    /* compiled from: ListItems.kt */
    public static final class f extends a {
        public final DialogMember b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final ProfilesInfo f;
        public final tow g;

        public f(DialogMember dialogMember, boolean z, boolean z2, boolean z3, ProfilesInfo profilesInfo, tow towVar) {
            this.b = dialogMember;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = profilesInfo;
            this.g = towVar;
        }

        @Override // xsna.yyb.a
        public final boolean a() {
            return this.c;
        }

        @Override // xsna.yyb.a
        public final DialogMember c() {
            return this.b;
        }

        @Override // xsna.yyb.a
        public final tow d() {
            return this.g;
        }

        @Override // xsna.yyb.a
        public final ProfilesInfo e() {
            return this.f;
        }

        @Override // xsna.yyb.a
        public final boolean f() {
            return this.e;
        }

        @Override // xsna.yyb.a
        public final boolean g() {
            return this.d;
        }

        public final String toString() {
            return "MemberItem(member=" + this.b + ", hasActions=" + this.c + ", isOwner=" + this.d + ", isAdmin=" + this.e + ", profiles=" + this.f + ", payload=" + this.g + ')';
        }
    }

    /* compiled from: ListItems.kt */
    public static final class g extends yyb {
        public final Dialog b;
        public final int c;
        public final boolean d;

        public g(Dialog dialog, int i, boolean z) {
            this.b = dialog;
            this.c = i;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d;
        }

        @Override // xsna.yyb, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return -2147483647;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MembersCountItem(dialog=");
            sb.append(this.b);
            sb.append(", count=");
            sb.append(this.c);
            sb.append(", isRequest=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ListItems.kt */
    public static final class i extends yyb {
        public static final i b = new i();

        @Override // xsna.yyb, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return -2147483643;
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }

    /* compiled from: ListItems.kt */
    public static final class h extends yyb implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g {
        public final AdapterEntryType b;

        public h(AdapterEntryType adapterEntryType) {
            this.b = adapterEntryType;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final boolean B() {
            return false;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final NestedMsg D0() {
            return null;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0() {
            return null;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final CharSequence K() {
            return null;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final boolean K0() {
            return false;
        }

        @Override // xsna.ol8
        public final oh30 M0() {
            return null;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final Msg Q() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            hVar.getClass();
            return this.b == hVar.b;
        }

        @Override // xsna.yyb, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return -2147483646;
        }

        public final int hashCode() {
            return bh10.a(pm0.c(this.b, Boolean.hashCode(false) * 31, 31), 28629151, 0L);
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final AdapterEntryType l() {
            return this.b;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final boolean q() {
            return false;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final y060 q0() {
            return null;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s0() {
            return null;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final int t() {
            return 0;
        }

        public final String toString() {
            return "MembersInviteItem(isBackgroundSet=false, viewType=" + this.b + ", dateMs=0, msgFromProfile=null, msgToProfile=null, memberFrom=null, memberTo=null, itemCallback=null)";
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
        public final long v() {
            return 0L;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final boolean w0() {
            return false;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        public final Attach x() {
            return null;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        @CheckResult
        public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
            return this;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        @CheckResult
        public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
            return this;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        @CheckResult
        public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g u(boolean z) {
            return this;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        @CheckResult
        public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g y(boolean z) {
            return this;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        @CheckResult
        public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g s(ProfilesInfo profilesInfo, uk30 uk30Var) {
            return this;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        @CheckResult
        public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g B0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2, uk30 uk30Var) {
            return this;
        }

        @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
        @CheckResult
        public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g H(Boolean bool, Boolean bool2, Integer num) {
            return this;
        }
    }
}
