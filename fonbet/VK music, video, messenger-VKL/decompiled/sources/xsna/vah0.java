package xsna;

import android.content.Context;
import android.graphics.Point;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;

/* compiled from: ScreenConcentrator.kt */
/* loaded from: classes11.dex */
public final class vah0 implements dyp<SchemeStat$TypeAppStarts> {
    public final Point a;

    public vah0() {
        Context context = e43.a;
        this.a = iah0.g(context == null ? null : context);
    }

    @Override // xsna.dyp
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        Point point = this.a;
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(Math.min(point.y, point.x)), Integer.valueOf(Math.max(point.y, point.x)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -12289, -1, 1048575);
    }
}
