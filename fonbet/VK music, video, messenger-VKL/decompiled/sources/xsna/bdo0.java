package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: DefaultTextContextMenuDropdownProvider.android.kt */
/* loaded from: classes11.dex */
public final class bdo0 implements yzs<l5g, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ Drawable b;

    public bdo0(Drawable drawable) {
        this.b = drawable;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(l5g l5gVar, androidx.compose.runtime.a aVar, Integer num) {
        long j = l5gVar.a;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1123224187, intValue, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:247)");
            }
            ddo0.a.a(this.b, aVar2, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
