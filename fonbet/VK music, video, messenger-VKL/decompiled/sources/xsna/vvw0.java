package xsna;

import com.vk.voip.OKVoipEngine;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationAdaptersKt;
import xsna.a7f0;
import xsna.aww0;
import xsna.jne0;
import xsna.kne0;

/* compiled from: VoipQrCodeScannerFeature.kt */
/* loaded from: classes7.dex */
public final class vvw0 extends wk50<com.vk.voip.ui.qr.ui.a, aww0, jne0, kne0> {
    public boolean f;
    public final vg20 g;

    public vvw0(zvw0 zvw0Var, jne0.a aVar) {
        super(aVar, zvw0Var);
        this.g = new vg20();
    }

    @Override // xsna.wk50
    public final void N(aww0 aww0Var, jne0 jne0Var) {
        io.reactivex.rxjava3.core.a aVar;
        aww0 aww0Var2 = aww0Var;
        jne0 jne0Var2 = jne0Var;
        if (jne0Var2 instanceof jne0.a.c) {
            String str = ((jne0.a.c) jne0Var2).b;
            if (this.f) {
                return;
            }
            this.f = true;
            T(new kne0.a.c(str));
            return;
        }
        boolean z = jne0Var2 instanceof jne0.a.C3129a;
        kne0.a.b bVar = kne0.a.b.b;
        if (z) {
            fhw0 fhw0Var = ((jne0.a.C3129a) jne0Var2).b;
            if (this.f) {
                return;
            }
            if (!fhw0Var.isInitialized()) {
                io.reactivex.rxjava3.kotlin.c.d(fhw0Var.a(), new yqd0(this, 26), new ujm0(this, 22));
                return;
            } else {
                if (this.f) {
                    return;
                }
                this.f = true;
                T(bVar);
                return;
            }
        }
        if (jne0Var2 instanceof jne0.a.b) {
            if (this.f) {
                return;
            }
            this.f = true;
            T(bVar);
            return;
        }
        if (jne0Var2 instanceof jne0.e) {
            String str2 = ((jne0.e) jne0Var2).b;
            if (aww0Var2 instanceof aww0.f) {
                T(new kne0.d(str2));
                C(jne0.d.b);
                return;
            }
            return;
        }
        if (jne0Var2 instanceof jne0.d) {
            if (aww0Var2 instanceof aww0.e.a) {
                aww0.e.a aVar2 = (aww0.e.a) aww0Var2;
                dz2 x = yfb.x(this.g.t(aVar2.b, aVar2.c));
                ahn.D(x);
                aVar = rsg0.Z(x);
            } else if (aww0Var2 instanceof aww0.e.b) {
                String str3 = ((aww0.e.b) aww0Var2).b;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.r.getClass();
                Conversation conversation = OKVoipEngine.E.getConversation();
                if (conversation == null || (aVar = ConversationAdaptersKt.addParticipantByLinkCompletable(conversation, str3)) == null) {
                    aVar = io.reactivex.rxjava3.core.a.k(new IllegalStateException("Conversation is not ready or destroyed"));
                }
            } else {
                aVar = null;
            }
            io.reactivex.rxjava3.core.a aVar3 = aVar;
            if (aVar3 != null) {
                a7f0.a.a(this, aVar3, asu0.a.d(), new y89(1, this, vvw0.class, "onApplyQrCodeError", "onApplyQrCodeError(Ljava/lang/Throwable;)V", 0, 11), new l9b(0, this, vvw0.class, "onApplyQrCodeSuccess", "onApplyQrCodeSuccess()V", 0));
                return;
            }
            return;
        }
        if (jne0Var2 instanceof jne0.b) {
            if (aww0Var2 instanceof aww0.e) {
                T(kne0.b.b);
            }
        } else {
            if (!(jne0Var2 instanceof jne0.c)) {
                if (!(jne0Var2 instanceof jne0.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (aww0Var2 instanceof aww0.b) {
                    T(kne0.e.b);
                    return;
                }
                return;
            }
            Throwable th = ((jne0.c) jne0Var2).b;
            if (aww0Var2 instanceof aww0.e.a) {
                T(new kne0.c(th));
            } else if (aww0Var2 instanceof aww0.e.b) {
                T(new kne0.c(th));
            }
        }
    }
}
