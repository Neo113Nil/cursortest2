package xsna;

import android.content.Context;
import android.net.Uri;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.chats.ChatPreview;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.webapp.fragments.DonutPaymentAppFragment;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class csb implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ yp80 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ csb(Context context, Uri uri, String str, String str2, yp80 yp80Var, boolean z) {
        this.e = yp80Var;
        this.g = z;
        this.d = context;
        this.c = str;
        this.f = str2;
        this.h = uri;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj2;
                ChatPreview chatPreview = (ChatPreview) obj;
                boolean z = chatPreview.j;
                long j = chatPreview.e;
                if (!z) {
                    yp80 yp80Var = this.e;
                    if (yp80Var != null) {
                        yp80Var.B0(chatPreview.f);
                    }
                    boolean z2 = this.g;
                    Context context = this.d;
                    if (!z2 || j == 0) {
                        ChatInviteFragment.c cVar = ChatInviteFragment.T;
                        ChatInviteFragment.c.c(context, this.c, this.f, uri, j != 0, chatPreview);
                    } else {
                        ChatInviteFragment.c cVar2 = ChatInviteFragment.T;
                        ChatInviteFragment.c.a(j, context);
                    }
                    break;
                } else {
                    zk70.c(NotifyId.CHAT_DELETED_WITH_HISTORY);
                    break;
                }
            default:
                NewsfeedRouter newsfeedRouter = (NewsfeedRouter) obj2;
                p2o p2oVar = (p2o) obj;
                UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto = p2oVar.a;
                long j2 = p2oVar.b;
                if (utilsDomainResolvedTypeDto != UtilsDomainResolvedTypeDto.USER) {
                    j2 = -j2;
                }
                boolean z3 = p2oVar.c;
                long j3 = j2;
                Context context2 = this.d;
                yp80 yp80Var2 = this.e;
                if (z3) {
                    int i2 = DonutPaymentAppFragment.a0;
                    DonutPaymentAppFragment.b.a(j3, null, this.c, false).k(context2);
                    if (yp80Var2 != null) {
                        yp80Var2.onSuccess();
                    }
                } else if (utilsDomainResolvedTypeDto == UtilsDomainResolvedTypeDto.GROUP || utilsDomainResolvedTypeDto == UtilsDomainResolvedTypeDto.PAGE || utilsDomainResolvedTypeDto == UtilsDomainResolvedTypeDto.EVENT) {
                    xwk.e().m(context2, new UserId(j3), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else {
                    com.vk.common.links.c.z(context2, newsfeedRouter, "donut", this.f, yp80Var2, this.g);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ csb(Context context, NewsfeedRouter newsfeedRouter, String str, String str2, yp80 yp80Var, boolean z) {
        this.c = str;
        this.d = context;
        this.e = yp80Var;
        this.f = str2;
        this.g = z;
        this.h = newsfeedRouter;
    }
}
