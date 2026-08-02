package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* compiled from: DialogToSublistAssociationDb.kt */
/* loaded from: classes2.dex */
public final class ylm {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogToSublistAssociationDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DIALOG_ID;
        public static final a SUBLIST_TYPE;
        private final String key;

        static {
            a aVar = new a("DIALOG_ID", 0, "dialog_id");
            DIALOG_ID = aVar;
            a aVar2 = new a("SUBLIST_TYPE", 1, "sublist_type");
            SUBLIST_TYPE = aVar2;
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

    public ylm() {
        throw null;
    }

    public ylm(tgl0 tgl0Var) {
        this.a = new sgl0("dialog_to_sublist", a.class);
        this.b = tgl0Var;
    }

    public final ArrayList a(Peer peer) {
        Cursor b = this.b.b().b(this.a.a, new String[]{a.SUBLIST_TYPE.getKey()}, a.DIALOG_ID.getKey() + " = ?", new Object[]{Long.valueOf(peer.b)});
        ArrayList arrayList = new ArrayList(b.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (b.moveToFirst()) {
                    while (!b.isAfterLast()) {
                        arrayList.add(fl3.E(b, a.SUBLIST_TYPE.getKey()));
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

    public final Collection<Peer> b(Collection<String> collection) {
        if (collection.isEmpty()) {
            return EmptyList.b;
        }
        String g0 = j5g.g0(collection, null, "(", ")", 0, new d37(11), 25);
        Cursor d = this.b.b().d("SELECT " + a.DIALOG_ID + " FROM " + this.a.a + " WHERE " + a.SUBLIST_TYPE + " in " + g0, null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        long C = fl3.C(d, a.DIALOG_ID.getKey());
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        arrayList.add(Peer.a.b(C));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                return arrayList;
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
