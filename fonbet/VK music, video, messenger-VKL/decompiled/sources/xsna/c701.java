package xsna;

import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes13.dex */
public final class c701 implements hd01 {
    public final /* synthetic */ lyk0 a;

    public c701(lyk0 lyk0Var) {
        this.a = lyk0Var;
    }

    @Override // xsna.hd01
    public final void a(String str, String str2, Bundle bundle, long j) {
        lyk0 lyk0Var = this.a;
        if (((HashSet) lyk0Var.b).contains(str2)) {
            Bundle bundle2 = new Bundle();
            HashSet hashSet = x501.a;
            String r = yiz.r(str2);
            if (r != null) {
                str2 = r;
            }
            bundle2.putString("events", str2);
            ((j4k) lyk0Var.c).a(2, bundle2);
        }
    }
}
