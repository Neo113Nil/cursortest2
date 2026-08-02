package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class qo30 implements ir30, nl8 {
    public final boolean b;
    public final boolean c;
    public final List<CarouselItem> d;
    public final long e;
    public final int f;
    public final boolean g;
    public final AdapterEntryType h;
    public Msg i;

    public qo30(boolean z, boolean z2, List<CarouselItem> list, long j, int i, boolean z3, AdapterEntryType adapterEntryType) {
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = j;
        this.f = i;
        this.g = z3;
        this.h = adapterEntryType;
    }

    @Override // xsna.nl8
    public final int J0(Context context) {
        return e3m.a(R.dimen.msg_bubble_max_width, context);
    }

    @Override // xsna.nl8
    public final int P(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_with_avatar, context);
    }

    @Override // xsna.nl8
    public final int W(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_no_avatar, context);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        qo30 qo30Var = new qo30(uk30Var.e(this.g, this.b), this.c, this.d, this.e, this.f, this.g, this.h);
        qo30Var.i = this.i;
        return qo30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo30)) {
            return false;
        }
        qo30 qo30Var = (qo30) obj;
        return this.b == qo30Var.b && this.c == qo30Var.c && epx.f(this.d, qo30Var.d) && this.e == qo30Var.e && this.f == qo30Var.f && this.g == qo30Var.g && this.h == qo30Var.h;
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        List<CarouselItem> list = this.d;
        return this.h.hashCode() + qoy.b(shy.a(this.f, bh10.a((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31), 31, this.g);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.h;
    }

    @Override // xsna.nl8
    public final boolean q() {
        return this.b;
    }

    public final String toString() {
        return "MsgPartCarouselHolderItem(isAvatarLayout=" + this.b + ", isOutgoing=" + this.c + ", carousel=" + this.d + ", msgDialogId=" + this.e + ", cnvMsgId=" + this.f + ", msgIsIncoming=" + this.g + ", viewType=" + this.h + ')';
    }

    @Override // xsna.nl8
    public final void Z(int i) {
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
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
