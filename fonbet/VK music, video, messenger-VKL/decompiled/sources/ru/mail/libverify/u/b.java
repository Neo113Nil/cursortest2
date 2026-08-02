package ru.mail.libverify.u;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import xsna.gzs;

/* loaded from: classes9.dex */
final class b extends Lambda implements gzs<Object> {
    final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(0);
        this.a = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new JSONArray(ru.mail.libverify.q0.a.f(new ru.mail.libverify.c.a(this.a).a()));
    }
}
