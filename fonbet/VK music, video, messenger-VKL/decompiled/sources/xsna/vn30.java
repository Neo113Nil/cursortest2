package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class vn30 implements ir30, ol8 {
    public final jr30 b;
    public final qtd0 c;
    public final int d;
    public final AdapterEntryType e;
    public final oh30 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final ArticleDonut.Placeholder m;
    public final ImageList n;
    public final Peer o;
    public Msg p;
    public NestedMsg q;
    public Attach r;

    public vn30(jr30 jr30Var, qtd0 qtd0Var, int i, AdapterEntryType adapterEntryType, oh30 oh30Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, ArticleDonut.Placeholder placeholder, ImageList imageList, Peer peer) {
        this.b = jr30Var;
        this.c = qtd0Var;
        this.d = i;
        this.e = adapterEntryType;
        this.f = oh30Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = str;
        this.m = placeholder;
        this.n = imageList;
        this.o = peer;
    }

    public static vn30 c(vn30 vn30Var, jr30 jr30Var, qtd0 qtd0Var, oh30 oh30Var, int i) {
        return new vn30((i & 1) != 0 ? vn30Var.b : jr30Var, (i & 2) != 0 ? vn30Var.c : qtd0Var, vn30Var.d, vn30Var.e, (i & 16) != 0 ? vn30Var.f : oh30Var, vn30Var.g, vn30Var.h, vn30Var.i, vn30Var.j, vn30Var.k, vn30Var.l, vn30Var.m, vn30Var.n, vn30Var.o);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.f;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.r;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vn30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.e.Bb(this.o), null, 16380);
        c.r = this.r;
        c.q = this.q;
        c.p = this.p;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vn30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, 16382);
        c.r = this.r;
        c.q = this.q;
        c.p = this.p;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn30)) {
            return false;
        }
        vn30 vn30Var = (vn30) obj;
        return epx.f(this.b, vn30Var.b) && epx.f(this.c, vn30Var.c) && this.d == vn30Var.d && this.e == vn30Var.e && epx.f(this.f, vn30Var.f) && this.g == vn30Var.g && this.h == vn30Var.h && this.i == vn30Var.i && this.j == vn30Var.j && this.k == vn30Var.k && epx.f(this.l, vn30Var.l) && epx.f(this.m, vn30Var.m) && epx.f(this.n, vn30Var.n) && epx.f(this.o, vn30Var.o);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        qtd0 qtd0Var = this.c;
        int c = pm0.c(this.e, shy.a(this.d, (hashCode + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31, 31), 31);
        oh30 oh30Var = this.f;
        int a = urd0.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((c + (oh30Var == null ? 0 : oh30Var.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        ArticleDonut.Placeholder placeholder = this.m;
        return Long.hashCode(this.o.b) + fw3.a((a + (placeholder != null ? placeholder.hashCode() : 0)) * 31, 31, this.n.b);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.e;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        vn30 c = c(this, null, null, oh30Var, 16367);
        c.r = this.r;
        c.q = this.q;
        c.p = this.p;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        vn30 c = c(this, null, profilesInfo.Bb(this.o), null, 16381);
        c.r = this.r;
        c.q = this.q;
        c.p = this.p;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartArticleHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", profileOwner=");
        sb.append(this.c);
        sb.append(", valueNestedLevel=");
        sb.append(this.d);
        sb.append(", viewType=");
        sb.append(this.e);
        sb.append(", bubbleStyle=");
        sb.append(this.f);
        sb.append(", isAttachAvailable=");
        sb.append(this.g);
        sb.append(", isAttachBanned=");
        sb.append(this.h);
        sb.append(", isAttachProtected=");
        sb.append(this.i);
        sb.append(", isAttachPaid=");
        sb.append(this.j);
        sb.append(", isAttachDeleted=");
        sb.append(this.k);
        sb.append(", attachTitle=");
        sb.append(this.l);
        sb.append(", donutPlaceholder=");
        sb.append(this.m);
        sb.append(", imageList=");
        sb.append(this.n);
        sb.append(", attachOwnerId=");
        return eq.a(sb, this.o, ')');
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
}
