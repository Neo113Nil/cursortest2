package com.yandex.messaging.internal.view.input;

import android.content.res.Resources;
import com.yandex.alicekit.core.views.animator.DslAnimatorBuilder;
import com.yandex.alicekit.core.views.animator.a;
import com.yandex.messaging.internal.view.input.d;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import defpackage.d1w;
import defpackage.evu0;
import defpackage.gas0;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.ike;
import defpackage.kse;
import defpackage.sls;
import defpackage.tls;
import defpackage.uqq0;
import defpackage.x22;
import kotlin.Pair;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes15.dex */
public final class e {
    public final h3y a;
    public final x22 b;
    public final c c;
    public final ike d;
    public KeyboardAwareEmojiEditText f;
    public d1w g;
    public boolean h;
    public final i3y e = kotlin.a.a(new gas0(28, this));
    public boolean i = true;

    public e(h3y h3yVar, x22 x22Var, c cVar, kse kseVar) {
        this.a = h3yVar;
        this.b = x22Var;
        this.c = cVar;
        this.d = kseVar.c();
    }

    public final d a() {
        return (d) this.e.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r10.h == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        final int i = 0;
        final int i2 = 1;
        if (((Boolean) this.c.h.a.getValue()).booleanValue()) {
            if (!d()) {
                KeyboardAwareEmojiEditText keyboardAwareEmojiEditText = this.f;
                if (keyboardAwareEmojiEditText == null) {
                    keyboardAwareEmojiEditText = null;
                }
                if (!evu0.J(keyboardAwareEmojiEditText.getEditableText())) {
                    KeyboardAwareEmojiEditText keyboardAwareEmojiEditText2 = this.f;
                    if (keyboardAwareEmojiEditText2 == null) {
                        keyboardAwareEmojiEditText2 = null;
                    }
                    if (keyboardAwareEmojiEditText2.hasFocus()) {
                    }
                }
            }
            z = true;
            if (this.i != z) {
                return;
            }
            this.i = z;
            final d a = a();
            long j = d.y;
            final int i3 = 2;
            if (z != (a.x.getVisibility() == 0) || a.w != null) {
                if (z) {
                    DslAnimatorBuilder dslAnimatorBuilder = a.w;
                    if (dslAnimatorBuilder != null) {
                        dslAnimatorBuilder.cancel();
                    }
                    DslAnimatorBuilder dslAnimatorBuilder2 = new DslAnimatorBuilder();
                    dslAnimatorBuilder2.targets(new tls() { // from class: yzt0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            int i4 = i;
                            zy11 zy11Var = zy11.a;
                            d dVar = a;
                            hum humVar = (hum) obj;
                            switch (i4) {
                                case 0:
                                    new a(dVar.x, humVar.a).a(new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f)));
                                    break;
                                default:
                                    new a(dVar.x, humVar.a).a(new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f)));
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    dslAnimatorBuilder2.onStart(new sls() { // from class: zzt0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i;
                            zy11 zy11Var = zy11.a;
                            d dVar = a;
                            switch (i4) {
                                case 0:
                                    dVar.x.setVisibility(0);
                                    break;
                                case 1:
                                    dVar.w = null;
                                    break;
                                default:
                                    dVar.x.setVisibility(8);
                                    dVar.w = null;
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    dslAnimatorBuilder2.onEnd(new sls() { // from class: zzt0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i2;
                            zy11 zy11Var = zy11.a;
                            d dVar = a;
                            switch (i4) {
                                case 0:
                                    dVar.x.setVisibility(0);
                                    break;
                                case 1:
                                    dVar.w = null;
                                    break;
                                default:
                                    dVar.x.setVisibility(8);
                                    dVar.w = null;
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    dslAnimatorBuilder2.m139setDurationTimeleAFHzY(j);
                    dslAnimatorBuilder2.start();
                    a.w = dslAnimatorBuilder2;
                } else if (a.x.getVisibility() == 0) {
                    b bVar = a.c;
                    int i4 = b.f;
                    bVar.a(false);
                    DslAnimatorBuilder dslAnimatorBuilder3 = a.w;
                    if (dslAnimatorBuilder3 != null) {
                        dslAnimatorBuilder3.cancel();
                    }
                    DslAnimatorBuilder dslAnimatorBuilder4 = new DslAnimatorBuilder();
                    dslAnimatorBuilder4.targets(new tls() { // from class: yzt0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            int i42 = i2;
                            zy11 zy11Var = zy11.a;
                            d dVar = a;
                            hum humVar = (hum) obj;
                            switch (i42) {
                                case 0:
                                    new a(dVar.x, humVar.a).a(new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f)));
                                    break;
                                default:
                                    new a(dVar.x, humVar.a).a(new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f)));
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    dslAnimatorBuilder4.onEnd(new sls() { // from class: zzt0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i42 = i3;
                            zy11 zy11Var = zy11.a;
                            d dVar = a;
                            switch (i42) {
                                case 0:
                                    dVar.x.setVisibility(0);
                                    break;
                                case 1:
                                    dVar.w = null;
                                    break;
                                default:
                                    dVar.x.setVisibility(8);
                                    dVar.w = null;
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    dslAnimatorBuilder4.m139setDurationTimeleAFHzY(j);
                    dslAnimatorBuilder4.start();
                    a.w = dslAnimatorBuilder4;
                }
            }
            KeyboardAwareEmojiEditText keyboardAwareEmojiEditText3 = this.f;
            KeyboardAwareEmojiEditText keyboardAwareEmojiEditText4 = keyboardAwareEmojiEditText3 == null ? null : keyboardAwareEmojiEditText3;
            Resources resources = (keyboardAwareEmojiEditText3 != null ? keyboardAwareEmojiEditText3 : null).getContext().getResources();
            keyboardAwareEmojiEditText4.setPaddingRelative(keyboardAwareEmojiEditText4.getPaddingStart(), keyboardAwareEmojiEditText4.getPaddingTop(), z ? (resources.getDimensionPixelSize(gvg0.chat_input_small_button_margin) * 2) + resources.getDimensionPixelSize(gvg0.chat_input_small_button_size) + resources.getDimensionPixelSize(gvg0.chat_input_padding_right) : resources.getDimensionPixelSize(gvg0.chat_input_padding_right), keyboardAwareEmojiEditText4.getPaddingBottom());
            return;
        }
        z = false;
        if (this.i != z) {
        }
    }

    public final void c() {
        c cVar = this.c;
        g I = kotlinx.coroutines.flow.e.I(cVar.h, new StarInputController$onAttach$1(this, null));
        ike ikeVar = this.d;
        kotlinx.coroutines.flow.e.H(ikeVar, I);
        kotlinx.coroutines.flow.e.H(ikeVar, kotlinx.coroutines.flow.e.I(cVar.f, new StarInputController$onAttach$2(this, null)));
    }

    public final boolean d() {
        return ((uqq0) this.c.f.a.getValue()).a;
    }
}
