package com.yandex.messaging.phonecontacts;

import android.telephony.PhoneNumberUtils;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.eae;
import defpackage.eci0;
import defpackage.fft;
import defpackage.g6u;
import defpackage.jae;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.kse;
import defpackage.nbt;
import defpackage.o430;
import defpackage.rbt;
import defpackage.sc5;
import defpackage.tpr;
import defpackage.wsr0;
import defpackage.x22;
import defpackage.xsr0;
import defpackage.zy11;
import java.util.Locale;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class a extends sc5 {
    public final x22 w;
    public final eci0 x;

    public a(rbt rbtVar, kse kseVar, fft fftVar, x22 x22Var) {
        this.w = x22Var;
        r0 c = bvf0.c("");
        g I = e.I(rbtVar.a(zy11.a), new ContactListViewModel$contactsFlow$1(this, null));
        g6u g6uVar = kseVar.e;
        tpr F = e.F(I, g6uVar);
        k5c a = ds31.a(this);
        xsr0.a.getClass();
        this.x = e.O(F, a, wsr0.b, 1);
        o430 o430Var = e3n.b;
        e.R(new m0(c, e.F(e.X(e.q(c, kp50.U(300, DurationUnit.MILLISECONDS)), new ContactListViewModel$special$$inlined$flatMapLatest$1(this, null)), g6uVar), new ContactListViewModel$uiState$1(3, null)), ds31.a(this), jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), jae.a);
        x22Var.c("contacts_list", ClidProvider.STATE, OpenList.STR_OPEN);
    }

    public static eae Y(nbt nbtVar) {
        String str = nbtVar.a;
        String str2 = nbtVar.c;
        String str3 = nbtVar.b;
        String str4 = nbtVar.d;
        if (str4 != null) {
            String formatNumber = PhoneNumberUtils.formatNumber(str4, Locale.getDefault().getCountry());
            if (formatNumber != null) {
                str4 = formatNumber;
            }
        } else {
            str4 = null;
        }
        return new eae(str, str2, str3, str4);
    }
}
