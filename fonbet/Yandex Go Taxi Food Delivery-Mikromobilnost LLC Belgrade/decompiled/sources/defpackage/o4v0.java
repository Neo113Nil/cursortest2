package defpackage;

import com.yandex.messaging.core.net.entities.directives.Button;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o4v0 {
    public final int a;
    public final Button b;
    public final String c;
    public final String d;
    public final Map e;
    public final String f;

    public o4v0(int i, Button button, String str, String str2, Map map, String str3) {
        this.a = i;
        this.b = button;
        this.c = str;
        this.d = str2;
        this.e = map;
        this.f = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof o4v0) {
                o4v0 o4v0Var = (o4v0) obj;
                if (this.a == o4v0Var.a && jl40.l(this.b, o4v0Var.b) && this.c.equals(o4v0Var.c) && this.d.equals(o4v0Var.d)) {
                    Map map = o4v0Var.e;
                    Map map2 = this.e;
                    if (map2 == null) {
                        if (map == null) {
                            equals = true;
                            if (equals && jl40.l(this.f, o4v0Var.f)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (map != null) {
                            equals = map2.equals(map);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
        Map map = this.e;
        int hashCode = (b + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Map map = this.e;
        String j = map == null ? "null" : nnm.j("MessageCallbackData(data=", Extension.C_BRAKE, map);
        StringBuilder sb = new StringBuilder("SuggestButton(index=");
        sb.append(this.a);
        sb.append(", buttonInfo=");
        sb.append(this.b);
        sb.append(", text=");
        g8e.D(sb, this.c, ", sendText=", this.d, ", sendData=");
        return g8e.r(sb, j, ", translatedText=", this.f, Extension.C_BRAKE);
    }
}
