package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.vk.log.L;
import com.vkontakte.android.audio.player.SavedTrack;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.lxn0;

/* compiled from: Database.java */
/* loaded from: classes7.dex */
public final class bwk extends SQLiteOpenHelper {
    public static volatile bwk b;
    public static final String[] c = {"key"};

    public static bwk b(Context context) {
        if (b == null) {
            synchronized (bwk.class) {
                try {
                    if (b == null) {
                        b = new bwk(context.getApplicationContext(), "databaseVerThree.db", null, 46);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(SavedTrack.d());
        ReentrantReadWriteLock reentrantReadWriteLock = r0m.a;
        lxn0.a c2 = new lxn0("sent_statistics").c("_id");
        c2.d = true;
        c2.e = true;
        sQLiteDatabase.execSQL(c2.e("key").a.a());
        sQLiteDatabase.execSQL(bfc0.a());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat("player_track"));
        sQLiteDatabase.execSQL(SavedTrack.d());
        ReentrantReadWriteLock reentrantReadWriteLock = r0m.a;
        lxn0.a c2 = new lxn0("sent_statistics").c("_id");
        c2.d = true;
        c2.e = true;
        sQLiteDatabase.execSQL(c2.e("key").a.a());
        try {
            if (i < 41) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat("saved_track"));
                sQLiteDatabase.execSQL(SavedTrack.d());
                L.l("ALTER TABLE[EXPLICIT] isOk");
            } else if (i < 46) {
                sQLiteDatabase.execSQL("ALTER TABLE saved_track ADD COLUMN legal_notice_type INTEGER;");
            }
            if (i < 27) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat("draft"));
                sQLiteDatabase.execSQL(bfc0.a());
                return;
            }
            if (i < 30) {
                sQLiteDatabase.execSQL("ALTER TABLE draft ADD COLUMN poster_background_id INTEGER");
                return;
            }
            if (i < 35) {
                String[] strArr = bfc0.c;
                for (int i3 = 0; i3 < 3; i3++) {
                    sQLiteDatabase.execSQL(strArr[i3]);
                }
                return;
            }
            if (i < 36) {
                sQLiteDatabase.execSQL("ALTER TABLE draft ADD COLUMN copyright TEXT");
                return;
            }
            if (i < 37) {
                sQLiteDatabase.execSQL("ALTER TABLE draft ADD COLUMN topic_id TEXT");
                return;
            }
            if (i < 38) {
                sQLiteDatabase.execSQL("ALTER TABLE draft ADD COLUMN paid_duration_id TEXT");
                return;
            }
            if (i < 40) {
                sQLiteDatabase.execSQL("ALTER TABLE draft ADD COLUMN grid_layout INTEGER");
                return;
            }
            if (i < 43) {
                sQLiteDatabase.execSQL("ALTER TABLE draft ADD COLUMN advertising_ord TEXT");
                return;
            }
            if (i < 44) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat("draft"));
                sQLiteDatabase.execSQL(bfc0.a());
            } else if (i < 45) {
                sQLiteDatabase.execSQL("ALTER TABLE draft ADD COLUMN images_crops TEXT;");
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }
}
