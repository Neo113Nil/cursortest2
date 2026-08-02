package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.dto.user.RequestUserProfile;
import com.vkontakte.android.R;
import com.vkontakte.android.data.FriendsUtils;
import xsna.ikv0;

/* compiled from: CommonActionsDelegate.kt */
/* loaded from: classes16.dex */
public final class sgg {
    public final Context a;
    public final rj70 b;
    public final io.reactivex.rxjava3.disposables.b c;

    public sgg(Context context, rj70 rj70Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = context;
        this.b = rj70Var;
        this.c = bVar;
    }

    public final void a(RequestUserProfile requestUserProfile) {
        if (requestUserProfile.n0) {
            return;
        }
        this.b.a(false);
        FriendsUtils.a(1);
    }

    public final void b(Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(th);
        Context context = this.a;
        String g = j03.g(context, th, R.string.error);
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_24, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
        aVar.u = new ikv0.d(g, (String) null, (ikv0.d.a) null, 6);
        ikv0 b = aVar.b();
        pkv0.d(b, context, g);
        pkv0.a(b, this.c);
    }
}
