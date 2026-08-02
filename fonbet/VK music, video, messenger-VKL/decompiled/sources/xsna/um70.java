package xsna;

import android.net.Uri;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import kotlin.text.Regex;

/* compiled from: NspkUtils.kt */
/* loaded from: classes2.dex */
public final class um70 {
    public static final bpn0 a = new bpn0(new com.vk.movika.sdk.base.model.props.c(25));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NspkUtils.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BANK;
        public static final a CRC;
        public static final a CURRENCY;
        public static final a QR_TYPE;
        public static final a SUM;
        private final String title;

        static {
            a aVar = new a("QR_TYPE", 0, "type");
            QR_TYPE = aVar;
            a aVar2 = new a("SUM", 1, "sum");
            SUM = aVar2;
            a aVar3 = new a("CURRENCY", 2, BidResponsed.KEY_CUR);
            CURRENCY = aVar3;
            a aVar4 = new a("BANK", 3, "bank");
            BANK = aVar4;
            a aVar5 = new a("CRC", 4, "crc");
            CRC = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.title = str2;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String getTitle() {
            return this.title;
        }
    }

    public static boolean a(Uri uri) {
        return ((Regex) a.getValue()).f(uri.toString());
    }
}
