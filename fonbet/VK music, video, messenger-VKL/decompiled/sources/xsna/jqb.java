package xsna;

import ru.ok.android.externcalls.sdk.chat.message.InboundMessage;
import xsna.xtb;

/* compiled from: ChatDelegateImpl.kt */
/* loaded from: classes11.dex */
public final class jqb implements lsb {
    public final io.reactivex.rxjava3.subjects.f<xtb> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.lsb
    public final void onNewMessage(InboundMessage inboundMessage) {
        this.a.onNext(new xtb.a(inboundMessage));
    }
}
