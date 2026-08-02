package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: NativeLibErrorBuilder.kt */
/* loaded from: classes5.dex */
public final class sv50 extends l5m {
    public final String h;
    public final String i;
    public final String j;

    public sv50(String str, String str2, String str3) {
        super(null, null, 3);
        this.h = str;
        this.i = str2;
        this.j = str3;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.NATIVE_LIB_ERROR.h(), null, this.h, null, this.j, null, this.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -86, 3, null);
        return super.p();
    }
}
