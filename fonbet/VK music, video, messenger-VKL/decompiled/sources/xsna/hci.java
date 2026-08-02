package xsna;

import android.R;
import android.view.View;
import com.vk.im.engine.models.InfoBar;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.List;
import xsna.fa90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ hci(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fa90 fa90Var;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(882740027, intValue, -1, "com.vk.profile.tool.compose.edit.ComposableSingletons$CellKt.lambda$882740027.<anonymous> (Cell.kt:15)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-100590188, intValue2, -1, "com.vk.core.compose.component.datetime.ComposableSingletons$VkTemporalPickerKt.lambda$-100590188.<anonymous> (VkTemporalPicker.kt:157)");
                    }
                    cjo0.c(d370.N(R.string.cancel, 6, aVar2), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262142);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).j);
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                rdi.j(sQLiteStatement, intValue3, infoBar != null ? Boolean.valueOf(infoBar.k) : null);
                return s3q0.a;
            case 4:
                View view = (View) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int intValue5 = ((Integer) obj3).intValue();
                view.setPivotX(intValue4 / 2.0f);
                view.setPivotY(intValue5 / 2.0f);
                return s3q0.a;
            default:
                int intValue6 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                nsv nsvVar = (nsv) j5g.b0(intValue6, (List) obj);
                if (nsvVar == null || (fa90Var = nsvVar.c) == null) {
                    fa90Var = fa90.b.a;
                }
                boolean z = true;
                boolean z2 = ((fa90Var instanceof fa90.d) && ((fa90.d) fa90Var).b) ? false : true;
                if (((fa90Var instanceof fa90.a) || !z2) && !booleanValue) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
