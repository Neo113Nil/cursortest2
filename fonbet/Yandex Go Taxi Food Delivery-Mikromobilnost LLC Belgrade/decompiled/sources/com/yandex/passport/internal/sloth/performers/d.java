package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class d implements s {
    public final Context a;

    public d(Context context) {
        this.a = context;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        Context context = this.a;
        String a = com.yandex.passport.internal.util.n.a(context);
        if (a == null) {
            a = "";
        }
        return new iqn(com.yandex.passport.internal.ui.sloth.e.b(new Pair("phoneRegionCode", a), new Pair("mcc", JSONObject.numberToString(new Integer(context.getResources().getConfiguration().mcc)))));
    }
}
