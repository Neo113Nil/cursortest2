package xsna;

import androidx.annotation.CheckResult;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class ru30 implements ir30 {
    public final Collection<a> b;
    public final AdapterEntryType c;
    public final UserId d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public Msg j;
    public NestedMsg k;
    public Attach l;

    /* compiled from: ChatListPartModels.kt */
    public static final class a {
        public final qtd0 a;
        public final CharSequence b;

        public a(qtd0 qtd0Var, CharSequence charSequence) {
            this.a = qtd0Var;
            this.b = charSequence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Author(profile=");
            sb.append(this.a);
            sb.append(", formattedName=");
            return thl0.a(sb, this.b, ')');
        }
    }

    public ru30(Collection<a> collection, AdapterEntryType adapterEntryType, UserId userId, long j, boolean z, boolean z2, boolean z3) {
        this.b = collection;
        this.c = adapterEntryType;
        this.d = userId;
        this.e = j;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = !z && z2;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru30)) {
            return false;
        }
        ru30 ru30Var = (ru30) obj;
        return epx.f(this.b, ru30Var.b) && this.c == ru30Var.c && epx.f(this.d, ru30Var.d) && this.e == ru30Var.e && this.f == ru30Var.f && this.g == ru30Var.g && this.h == ru30Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(bh10.a(bh10.a(pm0.c(this.c, this.b.hashCode() * 31, 31), 31, this.d.b), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.c;
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        Collection<a> collection = this.b;
        ArrayList arrayList = new ArrayList();
        for (a aVar : collection) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            qtd0 Bb = profilesInfo.Bb(Peer.a.b(aVar.a.G3()));
            a aVar2 = Bb == null ? null : new a(Bb, uk30Var.f0.i(Bb));
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        ru30 ru30Var = new ru30(arrayList, this.c, this.d, this.e, this.f, this.g, this.h);
        ru30Var.l = this.l;
        ru30Var.j = this.j;
        ru30Var.k = this.k;
        return ru30Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartWallPostOwnerHolderItem(authorList=");
        sb.append(this.b);
        sb.append(", viewType=");
        sb.append(this.c);
        sb.append(", attachFromId=");
        sb.append(this.d);
        sb.append(", time=");
        sb.append(this.e);
        sb.append(", isIncoming=");
        sb.append(this.f);
        sb.append(", hasBubbleGradient=");
        sb.append(this.g);
        sb.append(", isDeletedPost=");
        return defpackage.q0.a(sb, this.h, ')');
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
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
