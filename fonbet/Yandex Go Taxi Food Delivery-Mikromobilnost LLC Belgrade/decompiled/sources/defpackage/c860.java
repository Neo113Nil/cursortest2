package defpackage;

import android.nfc.NfcAdapter;
import android.nfc.tech.MifareClassic;
import android.util.Base64;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.fintechsdk.core.nfc.api.NfcCardType;
import com.yandex.fintechsdk.core.nfc.impl.internal.a;
import com.yandex.fintechsdk.core.nfc.impl.internal.callback.NfcReaderCallback;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.DecodeCardNumberException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes14.dex */
public final /* synthetic */ class c860 implements sls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a b;
    public final /* synthetic */ NfcCardType c;
    public final /* synthetic */ h511 w;
    public final /* synthetic */ zjy0 x;
    public final /* synthetic */ boolean y;

    public /* synthetic */ c860(a aVar, h511 h511Var, NfcCardType nfcCardType, zjy0 zjy0Var, boolean z) {
        this.b = aVar;
        this.w = h511Var;
        this.c = nfcCardType;
        this.x = zjy0Var;
        this.y = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1 A[Catch: IOException -> 0x00bb, Exception -> 0x010e, TryCatch #0 {Exception -> 0x010e, blocks: (B:17:0x007d, B:18:0x0088, B:20:0x008f, B:25:0x00b2, B:27:0x00b8, B:30:0x00c1, B:31:0x0101, B:36:0x0105, B:38:0x00c8, B:40:0x00cf, B:43:0x00da, B:45:0x00dd, B:46:0x00e5, B:48:0x00e0, B:51:0x00f2, B:52:0x00fd, B:60:0x0111, B:61:0x0119, B:63:0x011f, B:71:0x017b, B:73:0x0198, B:74:0x019d, B:77:0x0133, B:79:0x0151, B:81:0x0158, B:82:0x015e), top: B:16:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105 A[Catch: Exception -> 0x010e, TryCatch #0 {Exception -> 0x010e, blocks: (B:17:0x007d, B:18:0x0088, B:20:0x008f, B:25:0x00b2, B:27:0x00b8, B:30:0x00c1, B:31:0x0101, B:36:0x0105, B:38:0x00c8, B:40:0x00cf, B:43:0x00da, B:45:0x00dd, B:46:0x00e5, B:48:0x00e0, B:51:0x00f2, B:52:0x00fd, B:60:0x0111, B:61:0x0119, B:63:0x011f, B:71:0x017b, B:73:0x0198, B:74:0x019d, B:77:0x0133, B:79:0x0151, B:81:0x0158, B:82:0x015e), top: B:16:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8 A[Catch: IOException -> 0x00bb, Exception -> 0x010e, TryCatch #0 {Exception -> 0x010e, blocks: (B:17:0x007d, B:18:0x0088, B:20:0x008f, B:25:0x00b2, B:27:0x00b8, B:30:0x00c1, B:31:0x0101, B:36:0x0105, B:38:0x00c8, B:40:0x00cf, B:43:0x00da, B:45:0x00dd, B:46:0x00e5, B:48:0x00e0, B:51:0x00f2, B:52:0x00fd, B:60:0x0111, B:61:0x0119, B:63:0x011f, B:71:0x017b, B:73:0x0198, B:74:0x019d, B:77:0x0133, B:79:0x0151, B:81:0x0158, B:82:0x015e), top: B:16:0x007d }] */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        NfcAdapter nfcAdapter;
        String str;
        String str2;
        int i;
        int i2;
        byte[] D0;
        IOException e;
        int i3 = this.a;
        zy11 zy11Var = zy11.a;
        switch (i3) {
            case 0:
                a aVar = this.b;
                NfcCardType nfcCardType = this.c;
                h511 h511Var = this.w;
                aVar.f = new NfcReaderCallback(new th40(3, aVar, new c860(aVar, nfcCardType, h511Var, this.x, this.y), h511Var));
                AppCompatActivity appCompatActivity = (AppCompatActivity) aVar.c.get();
                if (appCompatActivity != null && (nfcAdapter = aVar.d) != null) {
                    nfcAdapter.enableReaderMode(appCompatActivity, aVar.f, 15, null);
                }
                return zy11Var;
            default:
                a aVar2 = this.b;
                MifareClassic mifareClassic = aVar2.e;
                z22 z22Var = aVar2.b;
                int[] iArr = z760.a;
                NfcCardType nfcCardType2 = this.c;
                int i4 = 1;
                if (iArr[nfcCardType2.ordinal()] == 1) {
                    char c = '\b';
                    List<Pair> g = scc.g(new Pair(4, Base64.decode("cwaPEYwT", 2)), new Pair(7, Base64.decode("rj1lo9rU", 2)), new Pair(8, Base64.decode("pz9dwdMz", 2)));
                    if (iArr[nfcCardType2.ordinal()] == 1) {
                        new uf11();
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new keo("nfc_read_card_number_start", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало чтения номера карты")));
                        if (mifareClassic == null) {
                            str2 = null;
                        } else {
                            try {
                                ArrayList arrayList = new ArrayList();
                                for (Pair pair : g) {
                                    int intValue = ((Number) pair.c()).intValue();
                                    byte[] bArr = (byte[]) pair.f();
                                    ArrayList arrayList2 = new ArrayList();
                                    char c2 = c;
                                    boolean z = false;
                                    for (int i5 = 0; i5 < 5; i5++) {
                                        try {
                                            z = mifareClassic.authenticateSectorWithKeyA(intValue, bArr);
                                        } catch (IOException e2) {
                                            e = e2;
                                            i2 = i4;
                                            sba1.j(z22Var, String.valueOf(e.getMessage()));
                                            D0 = kotlin.collections.a.D0(arrayList2);
                                            if (D0.length == 0) {
                                            }
                                            c = c2;
                                            i4 = i2;
                                        }
                                        if (z) {
                                            if (z) {
                                                D0 = kotlin.collections.a.D0(arrayList2);
                                                i2 = i4;
                                                if (D0.length == 0) {
                                                    arrayList.add(D0);
                                                }
                                                c = c2;
                                                i4 = i2;
                                            } else {
                                                int blockCountInSector = mifareClassic.getBlockCountInSector(intValue);
                                                int i6 = 0;
                                                while (i6 < blockCountInSector) {
                                                    byte[] readBlock = mifareClassic.readBlock(mifareClassic.sectorToBlock(intValue) + i6);
                                                    i2 = i4;
                                                    try {
                                                        ycc.s(arrayList2, readBlock.length == 0 ? ixn.a : new i73(0, readBlock));
                                                        i6++;
                                                        i4 = i2;
                                                    } catch (IOException e3) {
                                                        e = e3;
                                                        sba1.j(z22Var, String.valueOf(e.getMessage()));
                                                        D0 = kotlin.collections.a.D0(arrayList2);
                                                        if (D0.length == 0) {
                                                        }
                                                        c = c2;
                                                        i4 = i2;
                                                    }
                                                }
                                                i2 = i4;
                                                D0 = kotlin.collections.a.D0(arrayList2);
                                                if (D0.length == 0) {
                                                }
                                                c = c2;
                                                i4 = i2;
                                            }
                                        }
                                    }
                                    if (z) {
                                    }
                                }
                                int i7 = i4;
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        byte[] bArr2 = (byte[]) it.next();
                                        if (2 >= bArr2.length) {
                                            i = i7;
                                            str = null;
                                        } else {
                                            int i8 = 32;
                                            int i9 = 2;
                                            int i10 = 0;
                                            int i11 = 4;
                                            while (i8 > 0) {
                                                int i12 = 8 - i11;
                                                int min = Math.min(i8, i12);
                                                i10 = (i10 << min) | ((bArr2[i9] & (((i7 << i12) - 1) - ((i7 << r14) - 1))) >> (i12 - min));
                                                i8 -= min;
                                                i11 = 0;
                                                i9++;
                                            }
                                            long j = i10;
                                            if (j < 0) {
                                                j &= _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                                            }
                                            i = i7;
                                            str = String.format("%010d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, i));
                                        }
                                        if (str == null) {
                                            i7 = i;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                            } catch (Exception e4) {
                                sba1.j(z22Var, String.valueOf(e4.getMessage()));
                                str = null;
                            }
                            if (str == null) {
                                throw new DecodeCardNumberException();
                            }
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new keo("nfc_read_card_number_success", gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешное чтение номера карты: ".concat(str)))));
                            str2 = str;
                        }
                        AppCompatActivity appCompatActivity2 = (AppCompatActivity) aVar2.c.get();
                        if (appCompatActivity2 == null) {
                            return zy11Var;
                        }
                        appCompatActivity2.runOnUiThread(new pt(str2, this.w, aVar2, this.x, this.y, 1));
                        return zy11Var;
                    }
                    w511.b();
                } else {
                    w511.b();
                }
                return null;
        }
    }

    public /* synthetic */ c860(a aVar, NfcCardType nfcCardType, h511 h511Var, zjy0 zjy0Var, boolean z) {
        this.b = aVar;
        this.c = nfcCardType;
        this.w = h511Var;
        this.x = zjy0Var;
        this.y = z;
    }
}
