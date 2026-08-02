package xsna;

import com.vk.core.compose.component.controls.SelectionControlsMiddle$TitleIconPosition;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: SelectionControlsMiddle.kt */
/* loaded from: classes17.dex */
public final class rci0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ SelectionControlsMiddle$TitleIconPosition b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public rci0(String str, SelectionControlsMiddle$TitleIconPosition selectionControlsMiddle$TitleIconPosition, long j, String str2) {
        this.a = str;
        this.b = selectionControlsMiddle$TitleIconPosition;
        this.c = j;
        this.d = str2;
    }

    public final void a(int i, androidx.compose.runtime.a aVar, q630 q630Var, boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1419480257);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1419480257, i2, -1, "com.vk.core.compose.component.controls.SelectionControlsMiddle.Companion.invoke.<no name provided>.Draw (SelectionControlsMiddle.kt:59)");
            }
            qci0.a.a(this.a, wlb0.l(M).X, wlb0.l(M).m0, wlb0.h(M).getText().p, q630Var, this.b, this.c, this.d, z, M, ((i2 << 9) & 57344) | SQLiteDatabase.OPEN_PRIVATECACHE | ((i2 << 27) & 1879048192));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k9b0(this, z, q630Var, i);
        }
    }
}
