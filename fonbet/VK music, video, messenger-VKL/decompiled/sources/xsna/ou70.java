package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* compiled from: OfflineMusicExoDatabaseMigrator.kt */
/* loaded from: classes3.dex */
public final class ou70 {
    public static final a a = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicTrack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicTrack a(Serializer serializer) {
            return new MusicTrack(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -4, 1048575, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicTrack[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(SQLiteDatabase sQLiteDatabase) {
        HashMap hashMap = new HashMap();
        Cursor query = sQLiteDatabase.query("ExoPlayerDownloadsindex_offline_music", new String[]{"id", "data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                byte[] blob = query.getBlob(1);
                if (blob.length != 0) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                    Serializer.d dVar = new Serializer.d(new DataInputStream(new ByteArrayInputStream(blob)));
                    String H = dVar.H();
                    if (!"com.vk.dto.music.MusicTrack".equals(H)) {
                        throw new Serializer.DeserializationError(H, null);
                    }
                    hashMap.put(string, ((MusicTrack) a.a(dVar)).Fb().getBytes(StandardCharsets.UTF_8));
                }
            } finally {
            }
        }
        s3q0 s3q0Var = s3q0.a;
        query.close();
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", (byte[]) entry.getValue());
            s3q0 s3q0Var2 = s3q0.a;
            sQLiteDatabase.update("ExoPlayerDownloadsindex_offline_music", contentValues, "id = ?", new String[]{entry.getKey()});
        }
    }
}
