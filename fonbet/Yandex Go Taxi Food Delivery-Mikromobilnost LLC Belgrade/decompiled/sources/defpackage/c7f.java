package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pin.api.entities.StartSessionState;
import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinState$PinStatusType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c7f {
    public final String a;
    public final String b;
    public final gtb1 c;
    public final Integer d;
    public final x6f e;
    public final PinTokenEntity f;
    public final Text g;
    public final StartSessionState h;

    public c7f(Integer num, PinTokenEntity pinTokenEntity, Text text, int i) {
        this("", "", b7f.a, (i & 8) != 0 ? null : num, new x6f(CreatePinState$PinStatusType.None, x6f.c), (i & 32) != 0 ? null : pinTokenEntity, text, null);
    }

    public static c7f a(c7f c7fVar, String str, String str2, gtb1 gtb1Var, x6f x6fVar, PinTokenEntity pinTokenEntity, StartSessionState startSessionState, int i) {
        if ((i & 1) != 0) {
            str = c7fVar.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = c7fVar.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            gtb1Var = c7fVar.c;
        }
        gtb1 gtb1Var2 = gtb1Var;
        Integer num = (i & 8) != 0 ? c7fVar.d : null;
        if ((i & 16) != 0) {
            x6fVar = c7fVar.e;
        }
        x6f x6fVar2 = x6fVar;
        PinTokenEntity pinTokenEntity2 = (i & 32) != 0 ? c7fVar.f : pinTokenEntity;
        Text text = c7fVar.g;
        StartSessionState startSessionState2 = (i & 128) != 0 ? c7fVar.h : startSessionState;
        c7fVar.getClass();
        return new c7f(str3, str4, gtb1Var2, num, x6fVar2, pinTokenEntity2, text, startSessionState2);
    }

    public final boolean b(int i) {
        return i == 0 ? this.a.length() == 4 : this.b.length() == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7f)) {
            return false;
        }
        c7f c7fVar = (c7f) obj;
        return jl40.l(this.a, c7fVar.a) && jl40.l(this.b, c7fVar.b) && jl40.l(this.c, c7fVar.c) && jl40.l(this.d, c7fVar.d) && jl40.l(this.e, c7fVar.e) && jl40.l(this.f, c7fVar.f) && jl40.l(this.g, c7fVar.g) && jl40.l(this.h, c7fVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        PinTokenEntity pinTokenEntity = this.f;
        int c = n.c(this.g, (hashCode2 + (pinTokenEntity == null ? 0 : pinTokenEntity.hashCode())) * 31, 31);
        StartSessionState startSessionState = this.h;
        return c + (startSessionState != null ? startSessionState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CreatePinState(codeFirstInput=", this.a, ", codeSecondInput=", this.b, ", screenState=");
        v.append(this.c);
        v.append(", errorHint=");
        v.append(this.d);
        v.append(", pinStatus=");
        v.append(this.e);
        v.append(", pinTokenEntity=");
        v.append(this.f);
        v.append(", toolbarTitle=");
        v.append(this.g);
        v.append(", startSessionState=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public c7f(String str, String str2, gtb1 gtb1Var, Integer num, x6f x6fVar, PinTokenEntity pinTokenEntity, Text text, StartSessionState startSessionState) {
        this.a = str;
        this.b = str2;
        this.c = gtb1Var;
        this.d = num;
        this.e = x6fVar;
        this.f = pinTokenEntity;
        this.g = text;
        this.h = startSessionState;
    }
}
