package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import defpackage.cvu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/room/util/CursorUtil$wrapMappedColumns$2", "Landroid/database/CursorWrapper;", "", "columnName", "", "getColumnIndex", "(Ljava/lang/String;)I", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CursorUtil$wrapMappedColumns$2 extends CursorWrapper {
    final /* synthetic */ String[] $columnNames;
    final /* synthetic */ int[] $mapping;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorUtil$wrapMappedColumns$2(Cursor cursor, String[] strArr, int[] iArr) {
        super(cursor);
        this.$columnNames = strArr;
        this.$mapping = iArr;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public int getColumnIndex(String columnName) {
        String[] strArr = this.$columnNames;
        int[] iArr = this.$mapping;
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (cvu0.t(strArr[i], columnName, true)) {
                return iArr[i2];
            }
            i++;
            i2 = i3;
        }
        return super.getColumnIndex(columnName);
    }
}
