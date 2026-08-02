package defpackage;

import android.graphics.Bitmap;
import coil3.graphics.EnumC0136DataSource;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class q06 implements pwq {
    public final Bitmap a;

    public q06(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.pwq
    public final Object a(Continuation continuation) {
        return new t9v(new w06(this.a), false, EnumC0136DataSource.MEMORY);
    }
}
