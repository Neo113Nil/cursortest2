package xsna;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.exceptions.DisposableException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.profile.ui.community.CommunityMessagesFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rq80 implements izs {
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ yp80 e;

    public /* synthetic */ rq80(long j, long j2, Context context, yp80 yp80Var) {
        this.b = j;
        this.c = j2;
        this.d = context;
        this.e = yp80Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        long j = this.b;
        long j2 = this.c;
        Context context = this.d;
        yp80 yp80Var = this.e;
        Group group = (Group) obj;
        if (group.e()) {
            Uri.Builder appendQueryParameter = er.a(HttpRequest.DEFAULT_SCHEME).authority("m.".concat(a0a.d)).appendEncodedPath("mail").appendQueryParameter("community", String.valueOf(j));
            appendQueryParameter.appendQueryParameter("peer", String.valueOf(j2));
            appendQueryParameter.appendQueryParameter("act", "show");
            CommunityMessagesFragment.a aVar = new CommunityMessagesFragment.a(appendQueryParameter.build().toString());
            aVar.H(group.d);
            aVar.F(false, false);
            aVar.A();
            aVar.k(context);
            g2h g2hVar = new g2h(new UserId(j));
            g2hVar.b = "unread_messages";
            g2hVar.a();
            if (yp80Var != null) {
                yp80Var.onSuccess();
            }
        } else {
            cvk.u(R.string.access_error, false);
            if (yp80Var != null) {
                yp80Var.onError(new DisposableException());
            }
        }
        return s3q0.a;
    }
}
