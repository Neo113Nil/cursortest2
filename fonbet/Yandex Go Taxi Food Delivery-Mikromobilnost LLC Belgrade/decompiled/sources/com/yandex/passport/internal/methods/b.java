package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.credentials.CredentialProvider;
import com.yandex.passport.internal.entities.Code;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.entities.PersonProfile;
import com.yandex.passport.internal.push.PushPayload;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class b extends t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, int i) {
        super(c.b, str);
        switch (i) {
            case 2:
                super(c.c, str);
                break;
            case 3:
                super(n.c, str);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 14:
            case 15:
            case 20:
            case 21:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            default:
                break;
            case 8:
                super(c.w, str);
                break;
            case 9:
                super(c.x, str);
                break;
            case 10:
                super(n.w, str);
                break;
            case 11:
                super(n.y, str);
                break;
            case 12:
                super(n.z, str);
                break;
            case 13:
                super(c.z, str);
                break;
            case 16:
                super(c.A, str);
                break;
            case 17:
                super(c.B, str);
                break;
            case 18:
                super(c.C, str);
                break;
            case 19:
                super(c.D, str);
                break;
            case 23:
                super(c.E, str);
                break;
            case 25:
                super(n.B, str);
                break;
            case 29:
                super(n.C, str);
                break;
        }
    }

    public b(PassportUidImpl passportUidImpl) {
        super(e3.c, passportUidImpl);
    }

    public b(CredentialProvider credentialProvider) {
        super(g.C, credentialProvider);
    }

    public b(Cookie cookie) {
        super(g.B, cookie);
    }

    public b(Code code) {
        super(g.A, code);
    }

    public b(PassportEnvironmentImpl passportEnvironmentImpl) {
        super(g.G, passportEnvironmentImpl);
    }

    public b(Bundle bundle) {
        super(e3.w, bundle);
    }

    public b(PushPlatform pushPlatform) {
        super(g3.w, pushPlatform);
    }

    public b(PersonProfile personProfile) {
        super(g.I, personProfile);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z, int i) {
        super(a.y, Boolean.valueOf(z));
        switch (i) {
            case 15:
                super(a.z, Boolean.valueOf(z));
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList arrayList, int i) {
        super(d.b, arrayList);
        switch (i) {
            case 28:
                super(e3.x, arrayList);
                break;
            default:
                break;
        }
    }

    public b(PushPayload pushPayload) {
        super(g.J, pushPayload);
    }
}
