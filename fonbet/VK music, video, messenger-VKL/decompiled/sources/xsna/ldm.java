package xsna;

import android.database.Cursor;
import android.os.Trace;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.vk.im.engine.models.dialogs.FolderType;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: DialogFolderDb.kt */
/* loaded from: classes2.dex */
public final class ldm {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;
    public final bpn0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogFolderDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FLAGS;
        public static final a ID;
        public static final a NAME;
        public static final a TYPE;
        private final String key;

        static {
            a aVar = new a("ID", 0, "id");
            ID = aVar;
            a aVar2 = new a("NAME", 1, "name");
            NAME = aVar2;
            a aVar3 = new a(CredentialProviderBaseController.TYPE_TAG, 2, "type");
            TYPE = aVar3;
            a aVar4 = new a("FLAGS", 3, "flags");
            FLAGS = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.key = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // xsna.qgl0
        public final String getKey() {
            return this.key;
        }
    }

    public ldm() {
        throw null;
    }

    public ldm(tgl0 tgl0Var) {
        this.a = new sgl0("dialog_folder", a.class);
        this.b = tgl0Var;
        this.c = new bpn0(new pff(this, 14));
    }

    public static rdm c(Cursor cursor) {
        int A = fl3.A(cursor, a.FLAGS.getKey());
        FolderType.b bVar = FolderType.Companion;
        int v = c4g0.v(A);
        bVar.getClass();
        return new rdm(fl3.A(cursor, a.ID.getKey()), fl3.E(cursor, a.NAME.getKey()), FolderType.b.b(v), A);
    }

    public final Collection<rdm> a() {
        e0w b = this.b.b();
        StringBuilder sb = new StringBuilder("SELECT ");
        sgl0 sgl0Var = this.a;
        sb.append(sgl0Var.c());
        sb.append(" FROM ");
        sb.append(sgl0Var.a);
        Cursor d = b.d(sb.toString(), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(c(d));
                        d.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final rdm b(int i) {
        Cursor d = this.b.b().d(this.a.a(a.ID, Integer.valueOf(i)), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(c(d));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                return (rdm) j5g.a0(arrayList);
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
