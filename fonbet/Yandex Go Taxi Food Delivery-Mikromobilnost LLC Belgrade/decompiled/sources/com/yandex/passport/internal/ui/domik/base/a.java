package com.yandex.passport.internal.ui.domik.base;

import android.content.Context;
import android.content.DialogInterface;
import com.yandex.passport.internal.t;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.o;
import com.yandex.passport.internal.util.e;
import com.yandex.passport.internal.util.h;
import com.yandex.passport.legacy.lx.f;
import com.yandex.passport.legacy.lx.l;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                ((BaseDomikFragment) obj2).lambda$showFatalErrorDialog$0((EventError) obj, dialogInterface, i);
                break;
            default:
                h hVar = (h) obj2;
                e eVar = hVar.a;
                Objects.requireNonNull(eVar);
                hVar.b = new f(new l(new t(8, eVar))).e(new o(7, hVar, (Context) obj), new com.yandex.passport.common.util.b(11));
                break;
        }
    }
}
