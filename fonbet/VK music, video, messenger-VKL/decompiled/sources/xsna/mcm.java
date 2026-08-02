package xsna;

import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.List;
import xsna.fa90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mcm implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ mcm(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fa90 fa90Var;
        switch (this.b) {
            case 0:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue, chatSettings != null ? Boolean.valueOf(chatSettings.G) : null);
                return s3q0.a;
            case 1:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                rdi.j(sQLiteStatement2, intValue2, infoBar != null ? Boolean.valueOf(infoBar.i) : null);
                return s3q0.a;
            default:
                vya0 vya0Var = (vya0) obj;
                List list = (List) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                nsv nsvVar = (nsv) j5g.b0(intValue3, list);
                if (nsvVar == null || (fa90Var = nsvVar.c) == null) {
                    fa90Var = fa90.b.a;
                }
                int size = list.size();
                vya0Var.getClass();
                return new v3e0(intValue3, size, vya0Var.a && vya0Var.b && (fa90Var instanceof fa90.d) && ((fa90.d) fa90Var).b);
        }
    }
}
