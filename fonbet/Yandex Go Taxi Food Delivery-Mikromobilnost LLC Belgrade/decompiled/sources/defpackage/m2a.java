package defpackage;

import android.net.Uri;
import com.yandex.go.chargers.api.ChargersOpenReason;

/* loaded from: classes12.dex */
public final class m2a implements s2a {
    public final ChargersOpenReason a;
    public final Uri b;

    public m2a(ChargersOpenReason chargersOpenReason, Uri uri) {
        this.a = chargersOpenReason;
        this.b = uri;
    }

    @Override // defpackage.s2a
    public final ChargersOpenReason j() {
        return this.a;
    }
}
