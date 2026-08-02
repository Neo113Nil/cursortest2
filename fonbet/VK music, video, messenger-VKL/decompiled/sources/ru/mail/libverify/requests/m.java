package ru.mail.libverify.requests;

import androidx.annotation.NonNull;
import java.net.MalformedURLException;
import ru.mail.libverify.j0.a;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
public final class m implements ru.mail.libverify.j0.e {

    @NonNull
    private final w a;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.EnumC2206a.values().length];
            a = iArr;
            try {
                iArr[a.EnumC2206a.UPDATE_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.EnumC2206a.PUSH_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.EnumC2206a.ATTEMPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m(@NonNull w wVar) {
        this.a = wVar;
    }

    @Override // ru.mail.libverify.j0.e
    @NonNull
    public final c a(@NonNull ru.mail.libverify.j0.a aVar) throws MalformedURLException, JsonParseException {
        int i = a.a[aVar.type.ordinal()];
        if (i == 1) {
            return new l(this.a, aVar.a());
        }
        if (i == 2) {
            return new j(this.a, aVar.a());
        }
        if (i == 3) {
            return new ru.mail.libverify.requests.a(this.a, aVar.a());
        }
        throw new IllegalArgumentException(aVar.type + " type is not supported");
    }

    @Override // ru.mail.libverify.j0.e
    @NonNull
    public final ru.mail.libverify.j0.a a(@NonNull c cVar) throws JsonParseException {
        if (cVar instanceof l) {
            a.EnumC2206a enumC2206a = a.EnumC2206a.UPDATE_SETTINGS;
            ru.mail.libverify.j0.m t = cVar.t();
            this.a.u();
            return new ru.mail.libverify.j0.a(enumC2206a, t, System.currentTimeMillis());
        }
        if (cVar instanceof j) {
            a.EnumC2206a enumC2206a2 = a.EnumC2206a.PUSH_STATUS;
            ru.mail.libverify.j0.m t2 = cVar.t();
            this.a.u();
            return new ru.mail.libverify.j0.a(enumC2206a2, t2, System.currentTimeMillis());
        }
        if (cVar instanceof ru.mail.libverify.requests.a) {
            a.EnumC2206a enumC2206a3 = a.EnumC2206a.ATTEMPT;
            ru.mail.libverify.j0.m t3 = cVar.t();
            this.a.u();
            return new ru.mail.libverify.j0.a(enumC2206a3, t3, System.currentTimeMillis());
        }
        FileLog.e("VerifyActionFactoryImpl", cVar.getClass().getName().concat(" type is not supported"));
        throw new IllegalArgumentException("Request type is not supported");
    }
}
