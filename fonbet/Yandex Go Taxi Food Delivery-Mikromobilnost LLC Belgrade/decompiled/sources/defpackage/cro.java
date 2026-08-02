package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.j;
import com.yandex.messaging.internal.storage.experiments.ExperimentsDatabaseRoom;
import java.io.File;

/* loaded from: classes15.dex */
public abstract class cro {
    public static ExperimentsDatabaseRoom a(Context context, File file) {
        j l = dai0.l(context, ExperimentsDatabaseRoom.class, file.getPath());
        l.i = true;
        l.j = RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        l.p = false;
        l.q = true;
        return (ExperimentsDatabaseRoom) l.b();
    }
}
