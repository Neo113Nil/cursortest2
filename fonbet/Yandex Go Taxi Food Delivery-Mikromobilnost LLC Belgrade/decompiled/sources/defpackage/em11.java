package defpackage;

import com.google.gson.stream.JsonToken;
import java.net.InetAddress;

/* loaded from: classes11.dex */
public class em11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() != JsonToken.NULL) {
            return InetAddress.getByName(wdxVar.nextString());
        }
        wdxVar.B0();
        return null;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        afxVar.W(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
