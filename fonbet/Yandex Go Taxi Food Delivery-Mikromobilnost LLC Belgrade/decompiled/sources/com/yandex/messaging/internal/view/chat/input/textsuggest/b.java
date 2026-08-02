package com.yandex.messaging.internal.view.chat.input.textsuggest;

import android.text.Editable;
import android.text.TextWatcher;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.gvu0;
import defpackage.jl40;
import defpackage.nty0;
import defpackage.oet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class b {
    public final n0 a;
    public final r0 b;
    public String c;
    public final m0 d;
    public oet e;

    public b(InputTextController inputTextController) {
        n0 c = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
        this.a = c;
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.b = c2;
        this.d = new m0(e.c(c), c2, new TextSuggestInput$queryFlow$1(3, null));
        TextWatcher textWatcher = new TextWatcher() { // from class: com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestInput$textWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str;
                b bVar = b.this;
                if (s != null) {
                    bVar.getClass();
                    String obj = s.toString();
                    if (obj != null) {
                        if (evu0.J(obj)) {
                            obj = null;
                        }
                        if (obj != null) {
                            List M = evu0.M(obj);
                            ArrayList arrayList = new ArrayList();
                            Iterator it = M.iterator();
                            while (it.hasNext()) {
                                String obj2 = evu0.k0((String) it.next()).toString();
                                if (obj2.length() <= 0) {
                                    obj2 = null;
                                }
                                if (obj2 != null) {
                                    arrayList.add(obj2);
                                }
                            }
                            String X = kotlin.collections.a.X(arrayList, " ", null, null, null, 62);
                            int length = X.length();
                            oet oetVar = bVar.e;
                            if (length < oetVar.a) {
                                X = null;
                            }
                            if (X != null) {
                                str = gvu0.A0(oetVar.b, X);
                                if (jl40.l(bVar.c, str)) {
                                    bVar.c = str;
                                    com.yandex.messaging.extension.flow.c.d(bVar.a, str != null ? new nty0(str, String.valueOf(str.hashCode())) : null);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                str = null;
                if (jl40.l(bVar.c, str)) {
                }
            }
        };
        this.e = new oet(0);
        inputTextController.addTextChangedListener(textWatcher);
    }
}
