package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class kt30 implements ir30 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final a f;
    public final jr30 g;
    public Msg h;
    public NestedMsg i;
    public Attach j;

    /* compiled from: ChatListPartModels.kt */
    public interface a {

        /* compiled from: ChatListPartModels.kt */
        /* renamed from: xsna.kt30$a$a, reason: collision with other inner class name */
        public static final class C3205a implements a {
            public final ImageList a;

            public C3205a(ImageList imageList) {
                this.a = imageList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3205a) && epx.f(this.a, ((C3205a) obj).a);
            }

            public final int hashCode() {
                return this.a.b.hashCode();
            }

            public final String toString() {
                return "Photo(image=" + this.a + ')';
            }
        }

        /* compiled from: ChatListPartModels.kt */
        public static final class b implements a {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("SolidColor(color="), this.a, ')');
            }
        }
    }

    public kt30(String str, String str2, String str3, String str4, a aVar, jr30 jr30Var) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = aVar;
        this.g = jr30Var;
    }

    public static kt30 c(kt30 kt30Var, jr30 jr30Var) {
        return new kt30(kt30Var.b, kt30Var.c, kt30Var.d, kt30Var.e, kt30Var.f, jr30Var);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        kt30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar));
        c.j = this.j;
        c.i = this.i;
        c.h = this.h;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        kt30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar));
        c.j = this.j;
        c.i = this.i;
        c.h = this.h;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt30)) {
            return false;
        }
        kt30 kt30Var = (kt30) obj;
        return epx.f(this.b, kt30Var.b) && epx.f(this.c, kt30Var.c) && epx.f(this.d, kt30Var.d) && epx.f(this.e, kt30Var.e) && epx.f(this.f, kt30Var.f) && epx.f(this.g, kt30Var.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + urd0.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return AdapterEntryType.TYPE_ROOM;
    }

    public final String toString() {
        return "MsgPartRoomHolderItem(roomId=" + this.b + ", title=" + this.c + ", description=" + this.d + ", joinLink=" + this.e + ", cover=" + this.f + ", timeStatus=" + this.g + ')';
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 n(oh30 oh30Var) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 u(boolean z) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d0(Boolean bool, Boolean bool2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }
}
