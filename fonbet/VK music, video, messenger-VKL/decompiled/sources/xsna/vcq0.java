package xsna;

import android.database.Cursor;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* compiled from: UploadStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class vcq0 implements tcq0 {
    public final tgl0 a;

    public vcq0(tgl0 tgl0Var) {
        this.a = tgl0Var;
    }

    public static ResumableAttachUploadInfo i(Cursor cursor) {
        return new ResumableAttachUploadInfo(fl3.E(cursor, "session_id"), fl3.A(cursor, "attach_local_id"), fl3.E(cursor, "target_file"), fl3.x(cursor, "target_file_removable"), fl3.x(cursor, "is_prepared"), fl3.E(cursor, "content_filename"), fl3.E(cursor, "content_type"), fl3.C(cursor, "bytes_uploaded"), fl3.C(cursor, "bytes_total"), fl3.E(cursor, ApiProtocol.KEY_UPLOAD_URL));
    }

    @Override // xsna.tcq0
    public final void a() {
        tgl0 tgl0Var = this.a;
        Integer J = fl3.J(tgl0Var.b().d("SELECT COUNT(*) FROM upload_cache", null));
        if (J == null || J.intValue() <= 1000) {
            return;
        }
        tgl0Var.b().execSQL("DELETE FROM upload_cache WHERE rowid IN (SELECT rowid FROM upload_cache ORDER BY rowid ASC LIMIT 500)");
    }

    @Override // xsna.tcq0
    public final void b(ResumableAttachUploadInfo resumableAttachUploadInfo) {
        this.a.b().h(new c4q0(resumableAttachUploadInfo, 1));
    }

    @Override // xsna.tcq0
    public final wx8 c(String str, String str2) {
        wx8 wx8Var;
        Cursor d = this.a.b().d("SELECT * FROM upload_cache WHERE file_hash = ? AND type = ?", new String[]{str, str2});
        try {
            if (d.moveToFirst()) {
                wx8Var = new wx8(fl3.C(d, "media_id"), new UserId(fl3.C(d, "owner_id")), fl3.E(d, "file_hash"), fl3.E(d, "type"), fl3.E(d, "access_key"));
            } else {
                wx8Var = null;
            }
            return wx8Var;
        } finally {
            d.close();
        }
    }

    @Override // xsna.tcq0
    public final void d(wx8 wx8Var) {
        this.a.b().i("REPLACE INTO upload_cache (file_hash, type, media_id, owner_id, access_key) VALUES (?,?,?,?,?)", new Object[]{wx8Var.a, wx8Var.b, Long.valueOf(wx8Var.d), Long.valueOf(wx8Var.c.b), wx8Var.e});
    }

    @Override // xsna.tcq0
    public final void e(int i) {
        this.a.b().execSQL("DELETE FROM resumable_upload WHERE attach_local_id = " + i);
    }

    @Override // xsna.tcq0
    public final void f(ArrayList arrayList) {
        String g0 = j5g.g0(arrayList, ", ", null, null, 0, ucq0.b, 30);
        this.a.b().execSQL("DELETE FROM resumable_upload WHERE attach_local_id IN (" + g0 + ')');
    }

    @Override // xsna.tcq0
    public final ResumableAttachUploadInfo g(int i) {
        Cursor d = this.a.b().d(lhg.a(i, "SELECT * FROM resumable_upload WHERE attach_local_id = "), null);
        try {
            return d.moveToFirst() ? i(d) : null;
        } finally {
            d.close();
        }
    }

    @Override // xsna.tcq0
    public final void h(wx8 wx8Var) {
        this.a.b().execSQL("DELETE FROM upload_cache WHERE file_hash = ? AND type = ?", new String[]{wx8Var.a, wx8Var.b});
    }
}
