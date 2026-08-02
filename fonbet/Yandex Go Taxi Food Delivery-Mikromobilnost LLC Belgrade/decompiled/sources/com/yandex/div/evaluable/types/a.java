package com.yandex.div.evaluable.types;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.sls;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.LazyThreadSafetyMode;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes.dex */
public final class a implements Comparable {
    public final long a;
    public final TimeZone b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.div.evaluable.types.DateTime$calendar$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            Calendar calendar = Calendar.getInstance(a.this.b);
            calendar.setTimeInMillis(a.this.a);
            return calendar;
        }
    });

    public a(long j, TimeZone timeZone) {
        this.a = j;
        this.b = timeZone;
        timeZone.getRawOffset();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return jl40.r(this.a, ((a) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        Calendar calendar = (Calendar) this.c.getValue();
        return String.valueOf(calendar.get(1)) + LicenseUtility.SEPARATOR + evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf(calendar.get(2) + 1)) + LicenseUtility.SEPARATOR + evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf(calendar.get(5))) + HexString.CHAR_SPACE + evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf(calendar.get(11))) + ':' + evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf(calendar.get(12))) + ':' + evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf(calendar.get(13)));
    }
}
