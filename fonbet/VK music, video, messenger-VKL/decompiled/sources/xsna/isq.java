package xsna;

import android.content.Context;

/* compiled from: FaveToggler.kt */
/* loaded from: classes18.dex */
public interface isq {
    static /* synthetic */ void b(isq isqVar, Context context, gmq gmqVar, wzs wzsVar, wzs wzsVar2, izs izsVar, boolean z, String str, String str2, int i) {
        if ((i & 4) != 0) {
            wzsVar = null;
        }
        if ((i & 8) != 0) {
            wzsVar2 = null;
        }
        if ((i & 16) != 0) {
            izsVar = null;
        }
        if ((i & 32) != 0) {
            z = true;
        }
        if ((i & 64) != 0) {
            str = null;
        }
        if ((i & 256) != 0) {
            str2 = null;
        }
        isqVar.a(context, gmqVar, wzsVar, wzsVar2, izsVar, z, str, str2);
    }

    void a(Context context, gmq gmqVar, wzs wzsVar, wzs wzsVar2, izs izsVar, boolean z, String str, String str2);
}
