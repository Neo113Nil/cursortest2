package com.yandex.passport.internal.serialization;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import com.yandex.passport.internal.core.announcing.f;
import defpackage.asq0;
import defpackage.d6z;
import defpackage.oyr;
import defpackage.sjd;
import defpackage.yci0;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public final class a implements KSerializer {
    public static final a a = new a();
    public static final asq0 b = d6z.f("uid", new SerialDescriptor[0], new f(8));

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        asq0 asq0Var = b;
        sjd b2 = decoder.b(asq0Var);
        Environment environment = null;
        Long l = null;
        while (true) {
            int v = b2.v(asq0Var);
            if (v == -1) {
                if (environment == null || l == null) {
                    throw new SerializationException("Not found serialize Uid(" + environment + HexString.CHAR_COMMA + l + ')');
                }
                c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Success deserialize Uid(" + environment + HexString.CHAR_COMMA + l + ')', 8);
                }
                Uid uid = new Uid(environment, l.longValue());
                b2.c(asq0Var);
                return uid;
            }
            if (v == 0) {
                com.yandex.passport.common.core.a aVar = Environment.Companion;
                int h = b2.h(asq0Var, 0);
                aVar.getClass();
                environment = com.yandex.passport.common.core.a.a(h);
            } else {
                if (v != 1) {
                    yci0.m(oyr.i(v, "Unknown index "));
                    return null;
                }
                l = Long.valueOf(b2.f(asq0Var, 1));
            }
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Uid uid = (Uid) obj;
        asq0 asq0Var = b;
        yjd b2 = encoder.b(asq0Var);
        b2.e(asq0Var, 0, com.yandex.passport.internal.util.serialization.a.a, uid.getEnvironment());
        b2.s(asq0Var, 1, uid.getValue());
        b2.c(asq0Var);
    }
}
