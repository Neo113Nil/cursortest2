package xsna;

import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class scm implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
        int intValue = ((Integer) obj3).intValue();
        GroupCallInProgress groupCallInProgress = ((com.vk.im.engine.models.dialogs.b) obj2).A;
        rdi.m(sQLiteStatement, intValue, groupCallInProgress != null ? groupCallInProgress.c : null);
        return s3q0.a;
    }
}
