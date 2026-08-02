package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.messaging.core.net.entities.SearchParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes15.dex */
public final class doc {
    public final eil0 a;
    public final x22 b;

    public doc(eil0 eil0Var, x22 x22Var) {
        this.a = eil0Var;
        this.b = x22Var;
    }

    public final void a(int i, long j, String str, String str2, String str3) {
        this.a.a("send_msg_error", b.i(new Pair(CRLReasonCodeExtension.REASON, str), new Pair("messageId", str2), new Pair("chatId", str3), new Pair("waitFor", Long.valueOf(j)), new Pair(ACSPConstants.STATUS, Integer.valueOf(i))));
    }

    public final void b(String str, Long l) {
        Pair[] pairArr = {new Pair("fileId", str), new Pair("size", l)};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            if (pair.f() != null) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((Pair) it.next());
        }
        this.a.a("file_save_error", b.s(arrayList2));
    }

    public final void c(SearchParams searchParams, int i) {
        Pair[] pairArr = {new Pair("entities", j73.L(searchParams.entities, Extension.FIX_SPACE, null, null, 62)), new Pair("chatId", searchParams.chatId), new Pair("inviteHash", searchParams.inviteHash), new Pair(ErrorResponseData.JSON_ERROR_CODE, Integer.valueOf(i))};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            Pair pair = pairArr[i2];
            if (pair.f() != null) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((Pair) it.next());
        }
        this.a.a("search_error", b.s(arrayList2));
    }

    public final void d(String str, String str2) {
        this.a.a("yadisk_upload_flow_error", b.i(new Pair("messageId", str), new Pair(CRLReasonCodeExtension.REASON, str2)));
    }
}
