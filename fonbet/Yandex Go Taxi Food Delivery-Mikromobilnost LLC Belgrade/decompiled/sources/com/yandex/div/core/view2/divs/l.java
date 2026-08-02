package com.yandex.div.core.view2.divs;

import android.text.Editable;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import defpackage.aw5;
import defpackage.c231;
import defpackage.hzv;
import defpackage.jl11;
import defpackage.jl40;
import defpackage.tls;
import defpackage.zy11;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public final class l implements jl11 {
    public final /* synthetic */ com.yandex.div.core.util.mask.a a;
    public final /* synthetic */ hzv b;
    public final /* synthetic */ DivInputView c;
    public final /* synthetic */ String w;
    public final /* synthetic */ aw5 x;

    public l(com.yandex.div.core.util.mask.a aVar, hzv hzvVar, DivInputView divInputView, String str, aw5 aw5Var) {
        this.a = aVar;
        this.b = hzvVar;
        this.c = divInputView;
        this.w = str;
        this.x = aw5Var;
    }

    @Override // defpackage.jl11
    public final void a(Object obj) {
        c231 variable;
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        DivInputView divInputView = this.c;
        com.yandex.div.core.util.mask.a aVar = this.a;
        if (aVar != null) {
            aVar.k(str);
            String i = aVar.i();
            String str2 = this.w;
            if (str2 != null && (variable = this.x.b.getVariable(str2)) != null) {
                variable.g(i);
            }
            String i2 = aVar.i();
            divInputView.setText(i2);
            if (divInputView.isFocused()) {
                divInputView.setSelection(i2.length());
                return;
            }
            return;
        }
        hzv hzvVar = this.b;
        if (hzvVar != null) {
            if (!hzvVar.a(str)) {
                return;
            }
            hzvVar.b = str;
            hzvVar.c = str.length();
        }
        Editable text = divInputView.getText();
        if (jl40.l(text != null ? text.toString() : null, str)) {
            return;
        }
        divInputView.setText(str);
        if (divInputView.isFocused()) {
            divInputView.setSelection(str.length());
        }
    }

    @Override // defpackage.jl11
    public final void e(final tls tlsVar) {
        this.c.addAfterTextChangeAction(new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$createCallbacks$1$setViewStateChangeListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                String str;
                c231 variable;
                String obj2;
                Editable editable = (Editable) obj;
                l lVar = l.this;
                tls tlsVar2 = tlsVar;
                DivInputView divInputView = lVar.c;
                String str2 = "";
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                com.yandex.div.core.util.mask.a aVar = lVar.a;
                if (aVar != null) {
                    if (!aVar.i().equals(str)) {
                        Editable text = divInputView.getText();
                        if (text != null && (obj2 = text.toString()) != null) {
                            str2 = obj2;
                        }
                        aVar.a(str2, Integer.valueOf(divInputView.getSelectionStart()));
                        divInputView.setText(aVar.i());
                        divInputView.setSelection(aVar.d);
                        String i = aVar.i();
                        String str3 = lVar.w;
                        if (str3 != null && (variable = lVar.x.b.getVariable(str3)) != null) {
                            variable.g(i);
                        }
                    }
                    tlsVar2.invoke(aVar.h().replace(HexString.CHAR_COMMA, '.'));
                } else {
                    hzv hzvVar = lVar.b;
                    if (hzvVar != null) {
                        if (!hzvVar.b.equals(str)) {
                            if (hzvVar.a(str)) {
                                hzvVar.b = str;
                                hzvVar.c = divInputView.getSelectionStart();
                            } else {
                                divInputView.setText(hzvVar.b);
                                divInputView.setSelection(hzvVar.c);
                            }
                        }
                    }
                    tlsVar2.invoke(str);
                }
                return zy11.a;
            }
        });
    }
}
