package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes4.dex */
public final /* synthetic */ class f3f implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                if (str.startsWith(DatabaseHelper.OttTrackingTable.COLUMN_EVENT) && !str.endsWith("_")) {
                    break;
                }
                break;
            default:
                if (str.endsWith(".x") && str.startsWith("jni")) {
                    break;
                }
                break;
        }
        return true;
    }
}
