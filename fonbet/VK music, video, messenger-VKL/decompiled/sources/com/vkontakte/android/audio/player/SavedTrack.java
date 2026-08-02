package com.vkontakte.android.audio.player;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.ironsource.C4583ua;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.io.File;
import java.util.HashMap;
import xsna.bg40;
import xsna.kuk;
import xsna.lxn0;

/* loaded from: classes7.dex */
public final class SavedTrack extends kuk<SavedTrack> implements Parcelable, Serializer.StreamParcelable {
    public static final Serializer.c<SavedTrack> CREATOR;
    public static final b h = new b();
    public static final String[] i = kuk.a(bg40.a(), X3.i.L, X3.i.b);
    public static final int j;
    public static final int k;
    public int e;
    public File f;
    public MusicTrack g;

    public class a extends Serializer.c<SavedTrack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SavedTrack a(@NonNull Serializer serializer) {
            SavedTrack savedTrack = new SavedTrack(SavedTrack.h);
            savedTrack.g = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
            savedTrack.e = serializer.u();
            savedTrack.f = (File) serializer.C();
            return savedTrack;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavedTrack[i];
        }
    }

    public static class b extends bg40.a<SavedTrack> {
        @Override // xsna.quk
        public final SavedTrack a() {
            return new SavedTrack();
        }
    }

    static {
        int length = bg40.a().length;
        j = length;
        k = length + 1;
        CREATOR = new a();
    }

    public SavedTrack() {
        super(h);
    }

    public static String d() {
        lxn0 lxn0Var = new lxn0("saved_track");
        lxn0.a c = lxn0Var.c("_id");
        c.d = true;
        c.e = true;
        lxn0 lxn0Var2 = c.e("artist").e("title").d("duration").e("url").d(C4583ua.b).d("oid").d("lyrics_id").e("lyrics_text").d("restriction").d("genre").d("is_explicit").d("subtitle").a;
        lxn0.a aVar = new lxn0.a(lxn0Var2, "ad_params", "BLOB");
        lxn0Var2.b.add(aVar);
        aVar.e("access_key").e("track_code").d("date").d("album_part_nubmer").d("is_focus_track").d("shared_videos_allowed").d("in_clips_favorite_allowed").d("in_clips_favorite").d("special_project_id").d("dislike_Active").d("can_download").d("legal_notice_type").d("like").d("removed_by_dislike");
        lxn0Var.c(X3.i.L).e(X3.i.b);
        return lxn0Var.a();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.i0(this.g);
        serializer.S(this.e);
        serializer.g0(this.f);
    }

    @Override // xsna.kuk
    public final void b(Cursor cursor) {
        super.b(cursor);
        this.e = cursor.getInt(j);
        this.f = new File(cursor.getString(k));
        MusicTrack musicTrack = new MusicTrack();
        this.g = musicTrack;
        musicTrack.h = cursor.getString(1);
        musicTrack.d = cursor.getString(bg40.a);
        musicTrack.f = cursor.getInt(bg40.b);
        musicTrack.i = cursor.getString(bg40.c);
        musicTrack.b = cursor.getInt(bg40.d);
        musicTrack.c = new UserId(cursor.getLong(bg40.e));
        musicTrack.n = cursor.getInt(bg40.f);
        musicTrack.o = cursor.getString(bg40.g);
        musicTrack.g = cursor.getInt(bg40.h);
        musicTrack.k = cursor.getInt(bg40.i);
        musicTrack.s = cursor.getInt(bg40.j) != 0;
        musicTrack.e = cursor.getString(bg40.k);
        byte[] blob = cursor.getBlob(bg40.l);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(blob, 0, blob.length);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        musicTrack.v = readBundle;
        musicTrack.r = cursor.getString(bg40.m);
        musicTrack.y = cursor.getString(bg40.n);
        musicTrack.z = cursor.getLong(bg40.o);
        musicTrack.A = cursor.getInt(bg40.p);
        musicTrack.B = cursor.getInt(bg40.q) != 0;
        musicTrack.F = cursor.getInt(bg40.r) != 0;
        musicTrack.L = cursor.getInt(bg40.s) != 0;
        musicTrack.M = cursor.getInt(bg40.t) != 0;
        musicTrack.N = cursor.getInt(bg40.u);
        musicTrack.P = cursor.getInt(bg40.v) != 0;
        musicTrack.R = cursor.getInt(bg40.w) != 0;
        musicTrack.Q = cursor.getInt(bg40.x);
        musicTrack.U = cursor.getInt(bg40.y) != 0;
        musicTrack.m = cursor.getInt(bg40.z) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.b.h(this, parcel);
    }
}
