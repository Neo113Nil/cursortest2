package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.auth.main.AuthActivity;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: EnsureLoggedInHelper.java */
/* loaded from: classes7.dex */
public final class pmp {

    /* compiled from: EnsureLoggedInHelper.java */
    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            int i2 = AuthActivity.W;
            Context context = this.b;
            context.startActivity(AuthActivity.a.a(context));
        }
    }

    public static boolean a(Context context) {
        o25.a().N();
        if (o25.a().b()) {
            return true;
        }
        h7u0.a aVar = new h7u0.a(context);
        aVar.g0(R.string.auth_required_title);
        aVar.U(R.string.auth_required);
        aVar.c0(R.string.reg_continue, new a(context));
        aVar.W(R.string.close, null);
        aVar.m();
        return false;
    }
}
