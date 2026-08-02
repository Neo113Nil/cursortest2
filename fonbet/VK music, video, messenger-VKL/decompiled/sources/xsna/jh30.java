package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MsgBodiesFormatter.kt */
/* loaded from: classes2.dex */
public final class jh30 implements com.vk.im.engine.models.messages.a {
    public String b;
    public MsgTextFormat c;
    public ArrayList d;
    public long e;
    public Peer.Unknown f;
    public ArrayList g;

    @Override // com.vk.im.engine.models.messages.a
    public final boolean A4(boolean z) {
        return super.D3(AttachWall.class, z);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void Ba(MsgTextFormat msgTextFormat) {
        this.c = msgTextFormat;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final long C() {
        return this.e;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void I3(ArrayList arrayList) {
        this.g = arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void J2(Class cls, boolean z, ArrayList arrayList, boolean z2) {
        a.C1125a.e(this, cls, z, arrayList, z2);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<Attach> K0() {
        return this.d;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void P9() {
        this.b = "";
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<CarouselItem> U4() {
        return null;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final BotKeyboard V2() {
        return null;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final MsgTextFormat a4() {
        return this.c;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getBody() {
        return this.b;
    }

    @Override // xsna.vsx0
    public final Peer getFrom() {
        return this.f;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getTitle() {
        return "";
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void h3(List<Attach> list) {
        this.d = (ArrayList) list;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void i2(izs<? super NestedMsg, s3q0> izsVar, boolean z) {
        super.i2(izsVar, false);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final <T extends Attach> T l2(Class<T> cls, boolean z) {
        return (T) super.l2(AttachAudioMsg.class, false);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final Attach l4(izs<? super Attach, Boolean> izsVar, boolean z) {
        return com.vk.im.engine.models.messages.a.Q7(this, izsVar, z);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void o3(ArrayList arrayList) {
        a.C1125a.b(this, arrayList);
    }

    @Override // xsna.vsx0
    public final long ob() {
        return this.f.d;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<NestedMsg> q7() {
        return this.g;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void u8(izs izsVar, izs izsVar2) {
        a.C1125a.f(this, izsVar, izsVar2);
    }

    @Override // xsna.vsx0
    public final Peer.Type y2() {
        return this.f.c;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void m(String str) {
    }
}
