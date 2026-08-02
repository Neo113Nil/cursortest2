package xsna;

import android.database.Cursor;
import android.os.Trace;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: SublistInfoDb.kt */
/* loaded from: classes2.dex */
public final class dum0 {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SublistInfoDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DESCRIPTION;
        public static final a FLAG_AND;
        public static final a FLAG_XOR;
        public static final a NAME;
        public static final a TYPE;
        private final String key;

        static {
            a aVar = new a(CredentialProviderBaseController.TYPE_TAG, 0, "type");
            TYPE = aVar;
            a aVar2 = new a("NAME", 1, "name");
            NAME = aVar2;
            a aVar3 = new a(NativeAdContent.ViewTag.AD_DESCRIPTION, 2, "description");
            DESCRIPTION = aVar3;
            a aVar4 = new a("FLAG_AND", 3, "flag_and");
            FLAG_AND = aVar4;
            a aVar5 = new a("FLAG_XOR", 4, "flag_xor");
            FLAG_XOR = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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

    public dum0() {
        throw null;
    }

    public dum0(tgl0 tgl0Var) {
        this.a = new sgl0("sublist_info", a.class);
        this.b = tgl0Var;
    }

    public static gum0 b(Cursor cursor) {
        return new gum0(fl3.E(cursor, a.TYPE.getKey()), fl3.E(cursor, a.NAME.getKey()), fl3.E(cursor, a.DESCRIPTION.getKey()), new fum0(fl3.A(cursor, a.FLAG_AND.getKey()), fl3.A(cursor, a.FLAG_XOR.getKey())));
    }

    public final Collection<gum0> a() {
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
