package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class kq30 implements ir30 {
    public final a b;
    public final AdapterEntryType c;
    public Attach d;

    /* compiled from: ChatListPartModels.kt */
    public interface a {

        /* compiled from: ChatListPartModels.kt */
        /* renamed from: xsna.kq30$a$a, reason: collision with other inner class name */
        public static final class C3197a implements a {
            public final String a;

            public C3197a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3197a) && epx.f(this.a, ((C3197a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("HasDonutRestriction(url="), this.a, ')');
            }
        }

        /* compiled from: ChatListPartModels.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1169815163;
            }

            public final String toString() {
                return "IsDeleted";
            }
        }
    }

    public kq30(a aVar, AdapterEntryType adapterEntryType) {
        this.b = aVar;
        this.c = adapterEntryType;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq30)) {
            return false;
        }
        kq30 kq30Var = (kq30) obj;
        return epx.f(this.b, kq30Var.b) && this.c == kq30Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.c;
    }

    public final String toString() {
        return "MsgPartFwdChannelMessageUnavailableHolderItem(reason=" + this.b + ", viewType=" + this.c + ')';
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

    @Override // xsna.ir30
    @CheckResult
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
