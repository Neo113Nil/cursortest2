package com.yandex.plus.pay.ui.yb.web.internal.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.yandex.plus.pay.ui.yb.web.internal.YbWebResult;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import defpackage.ffx;
import defpackage.x40;

/* loaded from: classes2.dex */
public final class a extends x40 {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return new Intent(context, (Class<?>) PlusPayYbWebActivity.class).putExtra("arguments", (PlusPayYbWebActivity.Arguments) obj).putExtra("INSTANCE_ID", this.a);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        YbWebResult ybWebResult;
        return (intent == null || (ybWebResult = (YbWebResult) ((Parcelable) ffx.P(intent, "arguments", YbWebResult.class))) == null) ? YbWebResult.Cancel.INSTANCE : ybWebResult;
    }
}
