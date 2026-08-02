package com.yandex.passport.internal.config.template;

import androidx.datastore.core.CorruptionException;
import defpackage.btq0;
import defpackage.cvu0;
import defpackage.mx11;
import defpackage.qke;
import defpackage.rbx;
import defpackage.rzo;
import defpackage.sbx;
import defpackage.uza;
import defpackage.zy11;
import java.io.FileInputStream;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.SerializationException;

/* loaded from: classes8.dex */
public final class h implements btq0 {
    public static final h a = new h();

    @Override // defpackage.btq0
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.btq0
    public final Object b(FileInputStream fileInputStream, Continuation continuation) {
        try {
            rbx rbxVar = sbx.d;
            String q = cvu0.q(rzo.R(fileInputStream));
            rbxVar.getClass();
            return (c) rbxVar.b(qke.n(c.Companion.serializer()), q);
        } catch (SerializationException e) {
            throw new CorruptionException("Unable to read UrlTemplateList.", e);
        }
    }

    @Override // defpackage.btq0
    public final Object c(Object obj, mx11 mx11Var, Continuation continuation) {
        rbx rbxVar = sbx.d;
        rbxVar.getClass();
        mx11Var.write(rbxVar.c((c) obj, qke.n(c.Companion.serializer())).getBytes(uza.a));
        return zy11.a;
    }
}
