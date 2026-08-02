package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes.dex */
public final /* synthetic */ class n2f implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            default:
                return str.startsWith(DatabaseHelper.OttTrackingTable.COLUMN_EVENT);
        }
    }
}
