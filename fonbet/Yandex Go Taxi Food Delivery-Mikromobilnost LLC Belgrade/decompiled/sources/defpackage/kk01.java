package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.screens.result.Required3dsPageState;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kk01 {
    public final TransferResultPageEntity a;
    public final TransferMainResultScreenParams b;
    public final ResultStatus c;
    public final mw3 d;
    public final String e;
    public final Text f;
    public final Text g;
    public final String h;
    public final List i;
    public final p39 j;
    public final v9j0 k;
    public final Required3dsPageState l;

    public kk01(TransferResultPageEntity transferResultPageEntity, TransferMainResultScreenParams transferMainResultScreenParams, ResultStatus resultStatus, mw3 mw3Var, String str, Text text, Text text2, String str2, List list, p39 p39Var, v9j0 v9j0Var, Required3dsPageState required3dsPageState) {
        this.a = transferResultPageEntity;
        this.b = transferMainResultScreenParams;
        this.c = resultStatus;
        this.d = mw3Var;
        this.e = str;
        this.f = text;
        this.g = text2;
        this.h = str2;
        this.i = list;
        this.j = p39Var;
        this.k = v9j0Var;
        this.l = required3dsPageState;
    }

    public static kk01 a(kk01 kk01Var, TransferResultPageEntity transferResultPageEntity, ResultStatus resultStatus, mw3 mw3Var, String str, Text text, Text text2, String str2, List list, p39 p39Var, v9j0 v9j0Var, Required3dsPageState required3dsPageState, int i) {
        if ((i & 1) != 0) {
            transferResultPageEntity = kk01Var.a;
        }
        TransferResultPageEntity transferResultPageEntity2 = transferResultPageEntity;
        TransferMainResultScreenParams transferMainResultScreenParams = kk01Var.b;
        if ((i & 4) != 0) {
            resultStatus = kk01Var.c;
        }
        ResultStatus resultStatus2 = resultStatus;
        mw3 mw3Var2 = (i & 8) != 0 ? kk01Var.d : mw3Var;
        String str3 = (i & 16) != 0 ? kk01Var.e : str;
        Text text3 = (i & 32) != 0 ? kk01Var.f : text;
        Text text4 = (i & 64) != 0 ? kk01Var.g : text2;
        String str4 = (i & 128) != 0 ? kk01Var.h : str2;
        kk01Var.getClass();
        List list2 = (i & 512) != 0 ? kk01Var.i : list;
        p39 p39Var2 = (i & 1024) != 0 ? kk01Var.j : p39Var;
        v9j0 v9j0Var2 = (i & 2048) != 0 ? kk01Var.k : v9j0Var;
        Required3dsPageState required3dsPageState2 = (i & 4096) != 0 ? kk01Var.l : required3dsPageState;
        kk01Var.getClass();
        return new kk01(transferResultPageEntity2, transferMainResultScreenParams, resultStatus2, mw3Var2, str3, text3, text4, str4, list2, p39Var2, v9j0Var2, required3dsPageState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk01)) {
            return false;
        }
        kk01 kk01Var = (kk01) obj;
        return jl40.l(this.a, kk01Var.a) && jl40.l(this.b, kk01Var.b) && this.c == kk01Var.c && jl40.l(this.d, kk01Var.d) && jl40.l(this.e, kk01Var.e) && jl40.l(this.f, kk01Var.f) && jl40.l(this.g, kk01Var.g) && jl40.l(this.h, kk01Var.h) && jl40.l(this.i, kk01Var.i) && jl40.l(this.j, kk01Var.j) && jl40.l(this.k, kk01Var.k) && this.l == kk01Var.l;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        mw3 mw3Var = this.d;
        int hashCode2 = (hashCode + (mw3Var == null ? 0 : mw3Var.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Text text = this.f;
        int hashCode4 = (hashCode3 + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.g;
        int hashCode5 = (hashCode4 + (text2 == null ? 0 : text2.hashCode())) * 31;
        String str2 = this.h;
        int c = unr0.c((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 961, 31, this.i);
        p39 p39Var = this.j;
        int hashCode6 = (c + (p39Var == null ? 0 : p39Var.hashCode())) * 31;
        v9j0 v9j0Var = this.k;
        int hashCode7 = (hashCode6 + (v9j0Var == null ? 0 : v9j0Var.a.hashCode())) * 31;
        Required3dsPageState required3dsPageState = this.l;
        return hashCode7 + (required3dsPageState != null ? required3dsPageState.hashCode() : 0);
    }

    public final String toString() {
        return "TransferMainResultState(resultPageEntity=" + this.a + ", screenParams=" + this.b + ", status=" + this.c + ", widgets=" + this.d + ", paymentOperationId=" + this.e + ", title=" + this.f + ", description=" + this.g + ", supportUrl=" + this.h + ", statusCustomIcon=null, divKitWidgets=" + this.i + ", cashback=" + this.j + ", required3dsEntity=" + this.k + ", required3dsPageState=" + this.l + Extension.C_BRAKE;
    }
}
