package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: DialogToFolderAssociationDb.kt */
/* loaded from: classes2.dex */
public final class xlm {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogToFolderAssociationDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DIALOG_ID;
        public static final a FOLDER_ID;
        private final String key;

        static {
            a aVar = new a("DIALOG_ID", 0, "dialog_id");
            DIALOG_ID = aVar;
            a aVar2 = new a("FOLDER_ID", 1, "folder_id");
            FOLDER_ID = aVar2;
            a[] aVarArr = {aVar, aVar2};
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

    public xlm() {
        throw null;
    }

    public xlm(tgl0 tgl0Var) {
        this.a = new sgl0("dialog_to_folder", a.class);
        this.b = tgl0Var;
    }

    public final ArrayList a(int i) {
        Cursor b = this.b.b().b(this.a.a, new String[]{a.DIALOG_ID.getKey()}, a.FOLDER_ID.getKey() + " = ?", new Object[]{Integer.valueOf(i)});
        ArrayList arrayList = new ArrayList(b.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (b.moveToFirst()) {
                    while (!b.isAfterLast()) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        arrayList.add(Peer.a.b(fl3.C(b, a.DIALOG_ID.getKey())));
                        b.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                b.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final ArrayList b(Peer peer) {
        Cursor b = this.b.b().b(this.a.a, new String[]{a.FOLDER_ID.getKey()}, a.DIALOG_ID.getKey() + " = ?", new Object[]{Long.valueOf(peer.b)});
        ArrayList arrayList = new ArrayList(b.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (b.moveToFirst()) {
                    while (!b.isAfterLast()) {
                        arrayList.add(Integer.valueOf(fl3.A(b, a.FOLDER_ID.getKey())));
                        b.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                b.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c(int i, Collection<? extends Peer> collection) {
        if (collection.isEmpty()) {
            return;
        }
        String g0 = j5g.g0(collection, null, null, null, 0, new tjb(i, 1), 31);
        this.b.b().j("INSERT OR REPLACE INTO " + this.a.a + " (" + a.DIALOG_ID.getKey() + ", " + a.FOLDER_ID.getKey() + ") VALUES " + g0);
    }
}
