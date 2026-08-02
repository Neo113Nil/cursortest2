package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import defpackage.asy0;
import defpackage.atg;
import defpackage.ay11;
import defpackage.c9y;
import defpackage.dny0;
import defpackage.eix;
import defpackage.fnc;
import defpackage.hoy0;
import defpackage.jl40;
import defpackage.kk2;
import defpackage.tls;
import defpackage.tny0;
import defpackage.vry0;
import defpackage.zjy0;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        fnc fncVar;
        KeyCommand F;
        Integer valueOf;
        KeyEvent keyEvent = ((eix) obj).a;
        dny0 dny0Var = (dny0) this.receiver;
        vry0 vry0Var = dny0Var.f;
        boolean z = dny0Var.d;
        boolean z2 = true;
        if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
            atg atgVar = dny0Var.i;
            atgVar.getClass();
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                atgVar.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                valueOf = null;
            } else {
                Integer num = atgVar.a;
                if (num != null) {
                    atgVar.a = null;
                    int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                    Integer valueOf2 = Integer.valueOf(deadChar);
                    if (deadChar == 0) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        unicodeChar = valueOf2.intValue();
                    }
                    valueOf = Integer.valueOf(unicodeChar);
                } else {
                    valueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (valueOf != null) {
                fncVar = new fnc(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                if (fncVar == null) {
                    if (z) {
                        dny0Var.a(Collections.singletonList(fncVar));
                        vry0Var.a = null;
                    }
                    z2 = false;
                } else {
                    if (c9y.f(keyEvent) == 2 && (F = dny0Var.j.F(keyEvent)) != null && (!F.getEditsText() || z)) {
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.element = true;
                        zjy0 zjy0Var = new zjy0(F, dny0Var, ref$BooleanRef);
                        hoy0 hoy0Var = dny0Var.c;
                        tny0 tny0Var = new tny0(hoy0Var, dny0Var.g, dny0Var.a.d(), vry0Var);
                        zjy0Var.invoke(tny0Var);
                        boolean b = asy0.b(tny0Var.f, hoy0Var.b);
                        kk2 kk2Var = tny0Var.g;
                        if (!b || !jl40.l(kk2Var, hoy0Var.a)) {
                            dny0Var.k.invoke(hoy0.a(hoy0Var, kk2Var, tny0Var.f, 4));
                        }
                        ay11 ay11Var = dny0Var.h;
                        if (ay11Var != null) {
                            ay11Var.f = true;
                        }
                        z2 = ref$BooleanRef.element;
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }
        fncVar = null;
        if (fncVar == null) {
        }
        return Boolean.valueOf(z2);
    }
}
