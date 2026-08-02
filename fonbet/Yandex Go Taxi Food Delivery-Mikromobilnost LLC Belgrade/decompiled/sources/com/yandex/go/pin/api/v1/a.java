package com.yandex.go.pin.api.v1;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.go.pin.api.BasePinVersionController$init$1;
import com.yandex.go.pin.api.BasePinVersionController$listenState$1;
import com.yandex.go.pin.api.v1.Pin$State;
import com.yandex.go.pin.api.v1.a;
import defpackage.ah00;
import defpackage.hbp0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.x65;
import defpackage.y0c0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class a extends x65 {
    public final PinV1Component i;
    public final y0c0 j;

    public a(PinV1Component pinV1Component, y0c0 y0c0Var, ah00 ah00Var, tt2 tt2Var) {
        super(tt2Var, ah00Var);
        this.i = pinV1Component;
        this.j = y0c0Var;
        c().setVisibility(4);
        c().addOnAttachStateChangeListener(new BasePinVersionController$init$1(this));
        this.g = c.i(6.0f, c());
    }

    @Override // defpackage.x65
    public final void a() {
        final int i = 0;
        tls tlsVar = new tls(this) { // from class: x0c0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        aVar.i.setState((Pin$State) obj, true);
                        break;
                    case 1:
                        aVar.i.setPinText((CharSequence) obj);
                        break;
                    case 2:
                        aVar.i.setPinV1Style((z0c0) obj);
                        break;
                    case 3:
                        aVar.i.setAnchored(((Boolean) obj).booleanValue(), true);
                        break;
                    default:
                        aVar.i.setIdleStateDrawable((Drawable) obj);
                        break;
                }
                return zy11Var;
            }
        };
        r0 r0Var = this.f;
        y0c0 y0c0Var = this.j;
        tpr d = y0c0Var.d(r0Var);
        hbp0 hbp0Var = this.e;
        final int i2 = 3;
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(d, this, tlsVar, true, null), 3);
        final int i3 = 1;
        tls tlsVar2 = new tls(this) { // from class: x0c0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i3;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.i.setState((Pin$State) obj, true);
                        break;
                    case 1:
                        aVar.i.setPinText((CharSequence) obj);
                        break;
                    case 2:
                        aVar.i.setPinV1Style((z0c0) obj);
                        break;
                    case 3:
                        aVar.i.setAnchored(((Boolean) obj).booleanValue(), true);
                        break;
                    default:
                        aVar.i.setIdleStateDrawable((Drawable) obj);
                        break;
                }
                return zy11Var;
            }
        };
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(y0c0Var.c(), this, tlsVar2, true, null), 3);
        final int i4 = 2;
        tls tlsVar3 = new tls(this) { // from class: x0c0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i4;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.i.setState((Pin$State) obj, true);
                        break;
                    case 1:
                        aVar.i.setPinText((CharSequence) obj);
                        break;
                    case 2:
                        aVar.i.setPinV1Style((z0c0) obj);
                        break;
                    case 3:
                        aVar.i.setAnchored(((Boolean) obj).booleanValue(), true);
                        break;
                    default:
                        aVar.i.setIdleStateDrawable((Drawable) obj);
                        break;
                }
                return zy11Var;
            }
        };
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(y0c0Var.e(), this, tlsVar3, true, null), 3);
        tls tlsVar4 = new tls(this) { // from class: x0c0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.i.setState((Pin$State) obj, true);
                        break;
                    case 1:
                        aVar.i.setPinText((CharSequence) obj);
                        break;
                    case 2:
                        aVar.i.setPinV1Style((z0c0) obj);
                        break;
                    case 3:
                        aVar.i.setAnchored(((Boolean) obj).booleanValue(), true);
                        break;
                    default:
                        aVar.i.setIdleStateDrawable((Drawable) obj);
                        break;
                }
                return zy11Var;
            }
        };
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(y0c0Var.a(), this, tlsVar4, true, null), 3);
        PinV1Controller$attach$10 pinV1Controller$attach$10 = new PinV1Controller$attach$10(1, this, a.class, "updateVisibility", "updateVisibility(Z)V", 0);
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(y0c0Var.f(), this, pinV1Controller$attach$10, true, null), 3);
        final int i5 = 4;
        tls tlsVar5 = new tls(this) { // from class: x0c0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i5;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.i.setState((Pin$State) obj, true);
                        break;
                    case 1:
                        aVar.i.setPinText((CharSequence) obj);
                        break;
                    case 2:
                        aVar.i.setPinV1Style((z0c0) obj);
                        break;
                    case 3:
                        aVar.i.setAnchored(((Boolean) obj).booleanValue(), true);
                        break;
                    default:
                        aVar.i.setIdleStateDrawable((Drawable) obj);
                        break;
                }
                return zy11Var;
            }
        };
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(y0c0Var.b(), this, tlsVar5, true, null), 3);
    }

    public final View c() {
        return this.i;
    }

    public final PinV1Component d() {
        return this.i;
    }
}
