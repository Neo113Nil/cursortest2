package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: SnackbarHelper.kt */
/* loaded from: classes3.dex */
public final class w7k0 {
    public static void a(int i, int i2, Context context) {
        b(context, i2, context.getString(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Context context, int i, String str) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.o = Integer.valueOf(ikv0.e + i);
        aVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ContextWrapper contextWrapper, int i, int i2, izs izsVar) {
        ikv0.a aVar = new ikv0.a(contextWrapper);
        aVar.u = new ikv0.d(contextWrapper.getString(i), (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, contextWrapper.getString(R.string.music_player_snack_bar_cancel), izsVar);
        aVar.o = Integer.valueOf(ikv0.e + i2);
        aVar.n();
    }

    public static /* synthetic */ void d(w7k0 w7k0Var, Context context, int i) {
        w7k0Var.getClass();
        a(i, 0, context);
    }

    public static /* synthetic */ void e(w7k0 w7k0Var, ContextWrapper contextWrapper, int i, izs izsVar) {
        w7k0Var.getClass();
        c(contextWrapper, i, 0, izsVar);
    }

    public static /* synthetic */ void f(w7k0 w7k0Var, ContextWrapper contextWrapper, String str) {
        w7k0Var.getClass();
        b(contextWrapper, 0, str);
    }
}
