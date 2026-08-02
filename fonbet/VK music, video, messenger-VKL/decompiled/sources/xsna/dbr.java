package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.ironsource.C4583ua;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vkontakte.android.audio.file.StorageType;
import com.vkontakte.android.audio.player.SavedTrack;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.text.Regex;

/* compiled from: FileUtils.java */
/* loaded from: classes7.dex */
public final class dbr {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(StorageType storageType, StorageType storageType2, f2j0 f2j0Var) throws IOException {
        Collection collection;
        ArrayList c;
        ArrayList<SavedTrack> arrayList;
        Object obj;
        HashMap hashMap;
        int i;
        boolean z;
        byte[] marshall;
        HashMap hashMap2 = new HashMap();
        Iterator it = nzo.c(e43.a).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Regex regex = com.vk.core.files.a.a;
            if (com.vk.core.files.a.A(file.getAbsolutePath())) {
                hashMap2.put(StorageType.sdCard, file);
            } else {
                hashMap2.put(StorageType.internal, file);
            }
        }
        File file2 = (File) hashMap2.get(storageType);
        File file3 = (File) hashMap2.get(storageType2);
        if (storageType == null || file3 == null) {
            u1u0.b(f2j0Var.a);
            return;
        }
        Object obj2 = null;
        e43.a.getExternalFilesDirs(null);
        file3.mkdirs();
        File[] listFiles = file2.listFiles();
        if (listFiles == null) {
            u1u0.b(f2j0Var.a);
            return;
        }
        boolean z2 = true;
        f2j0Var.b.getActivity().runOnUiThread(new k1o(f2j0Var.a, listFiles.length, 1));
        SavedTrack.b bVar = SavedTrack.h;
        bVar.getClass();
        String[] strArr = SavedTrack.i;
        String str = strArr[SavedTrack.j];
        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null) && TextUtils.isEmpty(str) && TextUtils.isEmpty(null) && bVar.a != null) {
            synchronized (bVar) {
                try {
                    collection = bVar.b ? bVar.a.values() : null;
                } finally {
                }
            }
        } else {
            collection = null;
        }
        int i2 = 0;
        if (collection != null) {
            arrayList = new ArrayList(collection);
        } else {
            Cursor query = bVar.b().query(false, "saved_track", strArr, null, null, null, null, str, null);
            try {
                synchronized (bVar) {
                    try {
                        c = bVar.c(query);
                        if ((bVar.a != null) != false && TextUtils.isEmpty(null)) {
                            bVar.b = true;
                        }
                    } finally {
                    }
                }
                query.close();
                arrayList = c;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        HashMap hashMap3 = new HashMap();
        for (SavedTrack savedTrack : arrayList) {
            hashMap3.put(savedTrack.f, savedTrack);
        }
        int length = listFiles.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            File file4 = listFiles[i3];
            if (file4.getName().endsWith(".encoded")) {
                File file5 = new File(file3, file4.getName());
                file5.createNewFile();
                L.p("vk", file4.getAbsolutePath(), "->", file5.getAbsolutePath());
                byte[] bArr = new byte[10240];
                FileInputStream fileInputStream = new FileInputStream(file4);
                FileOutputStream fileOutputStream = new FileOutputStream(file5);
                file4.length();
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, i2, read);
                    }
                }
                fileInputStream.close();
                fileOutputStream.close();
                file4.delete();
                SavedTrack savedTrack2 = (SavedTrack) hashMap3.get(file4);
                if (savedTrack2 != null) {
                    savedTrack2.f = file5;
                    quk<T> qukVar = savedTrack2.b;
                    qukVar.getClass();
                    ContentValues contentValues = new ContentValues();
                    MusicTrack musicTrack = savedTrack2.g;
                    contentValues.put("artist", musicTrack.h);
                    contentValues.put("title", musicTrack.d);
                    contentValues.put("duration", Integer.valueOf(musicTrack.f));
                    contentValues.put("url", musicTrack.i);
                    contentValues.put(C4583ua.b, Integer.valueOf(musicTrack.b));
                    hashMap = hashMap3;
                    contentValues.put("oid", Long.valueOf(musicTrack.c.b));
                    contentValues.put("lyrics_id", Integer.valueOf(musicTrack.n));
                    contentValues.put("lyrics_text", musicTrack.o);
                    contentValues.put("restriction", Integer.valueOf(musicTrack.g));
                    contentValues.put("genre", Integer.valueOf(musicTrack.k));
                    contentValues.put("is_explicit", Integer.valueOf(musicTrack.s ? 1 : 0));
                    contentValues.put("subtitle", musicTrack.e);
                    Bundle bundle = musicTrack.v;
                    if (bundle == null) {
                        marshall = null;
                    } else {
                        Parcel obtain = Parcel.obtain();
                        bundle.writeToParcel(obtain, i2);
                        marshall = obtain.marshall();
                        obtain.recycle();
                    }
                    contentValues.put("ad_params", marshall);
                    contentValues.put("access_key", musicTrack.r);
                    contentValues.put("track_code", musicTrack.y);
                    i = i3;
                    contentValues.put("date", Long.valueOf(musicTrack.z));
                    contentValues.put("album_part_nubmer", Integer.valueOf(musicTrack.A));
                    contentValues.put("is_focus_track", Integer.valueOf(musicTrack.B ? 1 : 0));
                    contentValues.put("shared_videos_allowed", Integer.valueOf(musicTrack.F ? 1 : 0));
                    contentValues.put("in_clips_favorite_allowed", Integer.valueOf(musicTrack.L ? 1 : 0));
                    contentValues.put("in_clips_favorite", Integer.valueOf(musicTrack.M ? 1 : 0));
                    contentValues.put("special_project_id", Integer.valueOf(musicTrack.N));
                    contentValues.put("dislike_Active", Integer.valueOf(musicTrack.P ? 1 : 0));
                    contentValues.put("can_download", Integer.valueOf(musicTrack.R ? 1 : 0));
                    contentValues.put("legal_notice_type", Integer.valueOf(musicTrack.Q));
                    contentValues.put("like", Integer.valueOf(musicTrack.U ? 1 : 0));
                    contentValues.put("removed_by_dislike", Integer.valueOf(musicTrack.m ? 1 : 0));
                    String[] strArr2 = SavedTrack.i;
                    contentValues.put(strArr2[SavedTrack.j], Integer.valueOf(savedTrack2.e));
                    contentValues.put(strArr2[SavedTrack.k], savedTrack2.f.getAbsolutePath());
                    long j = savedTrack2.c;
                    if (j > 0) {
                        if (qukVar.b().update("saved_track", contentValues, "_id = ?", new String[]{Long.toString(j)}) > 0) {
                            qukVar.d(savedTrack2);
                        }
                        obj = null;
                    } else {
                        obj = null;
                        long insert = qukVar.b().insert("saved_track", null, contentValues);
                        if (insert != -1) {
                            savedTrack2.c = insert;
                            qukVar.d(savedTrack2);
                        }
                    }
                } else {
                    obj = obj2;
                    hashMap = hashMap3;
                    i = i3;
                }
                i4++;
                z = true;
                f2j0Var.b.getActivity().runOnUiThread(new ca40(f2j0Var.a, i4, 1));
            } else {
                obj = obj2;
                hashMap = hashMap3;
                i = i3;
                z = z2;
            }
            i3 = i + 1;
            obj2 = obj;
            z2 = z;
            hashMap3 = hashMap;
            i2 = 0;
        }
        u1u0.b(f2j0Var.a);
    }
}
