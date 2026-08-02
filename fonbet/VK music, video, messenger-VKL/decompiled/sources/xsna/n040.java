package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.im.engine.models.messages.MsgTemplate;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MsgTemplatesStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class n040 implements m040 {
    public final /* synthetic */ sgl0 b = new sgl0("message_templates", a.class);
    public final tgl0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgTemplatesStorageManagerImpl.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ID;
        public static final a NAME;
        public static final a TEXT;
        private final String key;

        static {
            a aVar = new a("ID", 0, "id");
            ID = aVar;
            a aVar2 = new a("NAME", 1, "name");
            NAME = aVar2;
            a aVar3 = new a("TEXT", 2, "text");
            TEXT = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
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

        public final int h() {
            return ordinal() + 1;
        }
    }

    public n040(tgl0 tgl0Var) {
        this.c = tgl0Var;
    }

    public static MsgTemplate b(Cursor cursor) {
        return new MsgTemplate(fl3.A(cursor, a.ID.getKey()), fl3.E(cursor, a.NAME.getKey()), fl3.E(cursor, a.TEXT.getKey()));
    }

    @Override // xsna.m040
    public final void K(MsgTemplate msgTemplate) {
        SQLiteStatement g = this.c.b().g(this.b.e());
        g.bindLong(a.ID.h(), msgTemplate.b);
        g.bindString(a.NAME.h(), msgTemplate.c);
        g.bindString(a.TEXT.h(), msgTemplate.d);
        g.executeInsert();
    }

    @Override // xsna.m040
    public final void P(int i) {
        this.c.b().f(this.b.a, a.ID.getKey() + " = ?", new Integer[]{Integer.valueOf(i)});
    }

    @Override // xsna.m040
    public final MsgTemplate l(int i) {
        Cursor d = this.c.b().d(this.b.a(a.ID, Integer.valueOf(i)), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(b(d));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                return (MsgTemplate) j5g.a0(arrayList);
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.m040
    public final void l0(ArrayList arrayList) {
        this.c.b().h(new yl0(14, this, arrayList));
    }

    @Override // xsna.m040
    public final List<MsgTemplate> u0() {
        Cursor d = this.c.b().d("SELECT * FROM " + this.b.a, null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(b(d));
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
}
