package com.yandex.go.payments.cards.pci_dss.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.yandex.go.payments.cards.pci_dss.ui.b;
import com.yandex.go.payments.cards.ui.AddCardViewImpl;
import defpackage.ba0;
import defpackage.dt5;
import defpackage.e6h0;
import defpackage.l8x;
import defpackage.mb8;
import defpackage.mp8;
import defpackage.pa0;
import defpackage.ra0;
import defpackage.rp31;
import defpackage.t8;
import defpackage.tc8;
import defpackage.tje;
import defpackage.tls;
import defpackage.va0;
import defpackage.ymu;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.a;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

/* loaded from: classes13.dex */
public final class b {
    public final ra0 a;
    public final int b;
    public final int c;
    public final Context d;
    public final AnimatedListItemInputComponent e;
    public final AnimatedListItemInputComponent f;
    public final AnimatedListItemInputComponent g;
    public final View h;
    public final KeyboardAwareRobotoEditText i;
    public final KeyboardAwareRobotoEditText j;
    public final KeyboardAwareRobotoEditText k;
    public final CreditCardTextWatcher l;
    public final AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter m;
    public final AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter n;
    public final ExpiryTextWatcher o;
    public final AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter p;

    /* JADX WARN: Type inference failed for: r2v10, types: [com.yandex.go.payments.cards.pci_dss.ui.AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.yandex.go.payments.cards.pci_dss.ui.AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.yandex.go.payments.cards.pci_dss.ui.AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter] */
    public b(AddCardViewImpl addCardViewImpl, ra0 ra0Var, int i, int i2) {
        this.a = ra0Var;
        this.b = i;
        this.c = i2;
        this.d = addCardViewImpl.getContext();
        int i3 = e6h0.card_number_input;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) ((View) rp31.d(addCardViewImpl, i3));
        this.e = animatedListItemInputComponent;
        AnimatedListItemInputComponent animatedListItemInputComponent2 = (AnimatedListItemInputComponent) ((View) rp31.d(addCardViewImpl, e6h0.expiry_date_input));
        this.f = animatedListItemInputComponent2;
        AnimatedListItemInputComponent animatedListItemInputComponent3 = (AnimatedListItemInputComponent) ((View) rp31.d(addCardViewImpl, e6h0.cvn_input));
        this.g = animatedListItemInputComponent3;
        this.h = (View) rp31.d(addCardViewImpl, e6h0.ic_cvn_help);
        this.i = animatedListItemInputComponent.getInput();
        this.j = animatedListItemInputComponent3.getInput();
        this.k = animatedListItemInputComponent2.getInput();
        this.l = new CreditCardTextWatcher();
        final tls tlsVar = new tls() { // from class: com.yandex.go.payments.cards.pci_dss.ui.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ymu ymuVar;
                ra0 ra0Var2 = b.this.a;
                String valueOf = String.valueOf((Editable) obj);
                va0 va0Var = ra0Var2.h;
                tc8 tc8Var = ra0Var2.o;
                int i4 = 0;
                for (int i5 = 0; i5 < valueOf.length(); i5++) {
                    if (Character.isDigit(valueOf.charAt(i5))) {
                        i4++;
                    }
                }
                tc8Var.getClass();
                StringBuilder sb = new StringBuilder();
                int length = valueOf.length();
                for (int i6 = 0; i6 < length; i6++) {
                    char charAt = valueOf.charAt(i6);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                tc8Var.a = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                int length2 = valueOf.length();
                for (int i7 = 0; i7 < length2; i7++) {
                    char charAt2 = valueOf.charAt(i7);
                    if (Character.isDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                }
                String sb3 = sb2.toString();
                dt5 dt5Var = sb3.length() < 8 ? dt5.b : new dt5(sb3.substring(0, 8));
                String str = dt5Var.a;
                if (!((dt5) ra0Var2.m.b).a(str) && !tc8Var.e.a.a(str)) {
                    ymu ymuVar2 = ra0Var2.m;
                    l8x l8xVar = (l8x) ymuVar2.c;
                    if (l8xVar != null) {
                        l8xVar.a(null);
                    }
                    ymuVar2.c = null;
                    ymu ymuVar3 = ra0.p;
                    if (str.length() == 8) {
                        ymuVar = new ymu(4, dt5Var, tje.N(ra0Var2.e(), null, null, new AddCardPciDssPresenter$onPanChanged$1(ra0Var2, dt5Var, null), 3));
                    } else {
                        mb8 mb8Var = mb8.e;
                        CardType.Companion.getClass();
                        ra0Var2.g(new mb8(dt5Var, false, true, mp8.a(valueOf)));
                        ymuVar = new ymu(4, dt5Var, (Object) null);
                    }
                    ra0Var2.m = ymuVar;
                }
                ((pa0) ra0Var2.a).d(!((tc8Var.a.length() == 0 ? false : tc8Var.a().f(tc8Var.a.length())) && !tc8Var.d()));
                ((ba0) va0Var.Dg()).updateCardIconVisibility(i4 > 12);
                ((ba0) va0Var.Dg()).setConfirmButtonEnabled(tc8Var.b());
                return zy11.a;
            }
        };
        this.m = new TextWatcher(tlsVar) { // from class: com.yandex.go.payments.cards.pci_dss.ui.AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter
            private final tls afterTextChanged;

            {
                this.afterTextChanged = tlsVar;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                this.afterTextChanged.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        };
        final int i4 = 0;
        final tls tlsVar2 = new tls(this) { // from class: ta0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                String obj2;
                String str;
                List W;
                int i5 = i4;
                zy11 zy11Var = zy11.a;
                b bVar = this.b;
                Editable editable = (Editable) obj;
                switch (i5) {
                    case 0:
                        ra0 ra0Var2 = bVar.a;
                        obj2 = editable != null ? editable.toString() : null;
                        str = obj2 != null ? obj2 : "";
                        tc8 tc8Var = ra0Var2.o;
                        tc8Var.d = str;
                        ((ba0) ra0Var2.h.Dg()).setConfirmButtonEnabled(tc8Var.b());
                        break;
                    default:
                        ra0 ra0Var3 = bVar.a;
                        obj2 = editable != null ? editable.toString() : null;
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        tc8 tc8Var2 = ra0Var3.o;
                        W = evu0.W(obj2, new String[]{"/"}, (r2 & 4) != 0 ? 0 : 2);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : W) {
                            String str2 = (String) obj3;
                            if (str2 != null && str2.length() != 0) {
                                arrayList.add(obj3);
                            }
                        }
                        String str3 = (String) a.S(0, arrayList);
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = (String) a.S(1, arrayList);
                        str = str4 != null ? str4 : "";
                        tc8Var2.b = str3;
                        tc8Var2.c = str;
                        ((pa0) ra0Var3.a).c(!(str3.length() != 0 && str.length() != 0) || tc8Var2.c());
                        ((ba0) ra0Var3.h.Dg()).setConfirmButtonEnabled(tc8Var2.b());
                        break;
                }
                return zy11Var;
            }
        };
        this.n = new TextWatcher(tlsVar2) { // from class: com.yandex.go.payments.cards.pci_dss.ui.AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter
            private final tls afterTextChanged;

            {
                this.afterTextChanged = tlsVar2;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                this.afterTextChanged.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        };
        this.o = new ExpiryTextWatcher();
        final int i5 = 1;
        final tls tlsVar3 = new tls(this) { // from class: ta0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                String obj2;
                String str;
                List W;
                int i52 = i5;
                zy11 zy11Var = zy11.a;
                b bVar = this.b;
                Editable editable = (Editable) obj;
                switch (i52) {
                    case 0:
                        ra0 ra0Var2 = bVar.a;
                        obj2 = editable != null ? editable.toString() : null;
                        str = obj2 != null ? obj2 : "";
                        tc8 tc8Var = ra0Var2.o;
                        tc8Var.d = str;
                        ((ba0) ra0Var2.h.Dg()).setConfirmButtonEnabled(tc8Var.b());
                        break;
                    default:
                        ra0 ra0Var3 = bVar.a;
                        obj2 = editable != null ? editable.toString() : null;
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        tc8 tc8Var2 = ra0Var3.o;
                        W = evu0.W(obj2, new String[]{"/"}, (r2 & 4) != 0 ? 0 : 2);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : W) {
                            String str2 = (String) obj3;
                            if (str2 != null && str2.length() != 0) {
                                arrayList.add(obj3);
                            }
                        }
                        String str3 = (String) a.S(0, arrayList);
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = (String) a.S(1, arrayList);
                        str = str4 != null ? str4 : "";
                        tc8Var2.b = str3;
                        tc8Var2.c = str;
                        ((pa0) ra0Var3.a).c(!(str3.length() != 0 && str.length() != 0) || tc8Var2.c());
                        ((ba0) ra0Var3.h.Dg()).setConfirmButtonEnabled(tc8Var2.b());
                        break;
                }
                return zy11Var;
            }
        };
        this.p = new TextWatcher(tlsVar3) { // from class: com.yandex.go.payments.cards.pci_dss.ui.AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter
            private final tls afterTextChanged;

            {
                this.afterTextChanged = tlsVar3;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                this.afterTextChanged.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        };
    }

    public static void b(KeyboardAwareRobotoEditText keyboardAwareRobotoEditText, AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter addCardPciDssViewHolder$AfterTextChangedWatcherAdapter, TextWatcher textWatcher) {
        keyboardAwareRobotoEditText.setShowSoftInputOnFocus(false);
        keyboardAwareRobotoEditText.setOnTouchListener(new t8(1, keyboardAwareRobotoEditText));
        if (textWatcher != null) {
            keyboardAwareRobotoEditText.addTextChangedListener(textWatcher);
        }
        keyboardAwareRobotoEditText.addTextChangedListener(addCardPciDssViewHolder$AfterTextChangedWatcherAdapter);
        keyboardAwareRobotoEditText.setText(keyboardAwareRobotoEditText.getText());
    }

    public final void a() {
        ra0 ra0Var = this.a;
        tje.N(ra0Var.e(), null, null, new AddCardPciDssPresenter$scanCard$1(ra0Var, null), 3);
    }
}
