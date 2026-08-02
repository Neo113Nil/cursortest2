package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public class fo {
    public final ic2 a;

    public fo(ix1 ix1Var) {
        this.a = ix1Var;
        ix1Var.setId(2);
    }

    public void a(String str) {
        ic2 ic2Var = this.a;
        ic2Var.loadDataWithBaseURL("https://yandex.ru", ic2Var.a(str), "text/html", C.UTF8_NAME, null);
    }
}
