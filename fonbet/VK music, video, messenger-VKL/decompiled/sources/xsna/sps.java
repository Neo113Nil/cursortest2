package xsna;

import android.content.Context;
import android.util.Size;
import androidx.lifecycle.Lifecycle;
import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.ems;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sps implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sps(Context context, Post post, String str, NewsfeedAddBanTypeDto newsfeedAddBanTypeDto) {
        this.b = 2;
        this.f = context;
        this.c = post;
        this.d = str;
        this.e = newsfeedAddBanTypeDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [xsna.e5z, xsna.s630] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 moveParticipant$lambda$0;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                UserProfile userProfile = (UserProfile) obj5;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj4;
                FriendsItemSearchListVh friendsItemSearchListVh = (FriendsItemSearchListVh) obj3;
                Context context = (Context) obj2;
                Integer num = (Integer) obj;
                boolean z = false;
                Object[] objArr = userProfile.v == 2;
                if (userProfile.e0 == SocialButtonType.FOLLOW && objArr == false) {
                    z = true;
                }
                userProfile.v = 1;
                uIBlockProfile.z.b = CatalogProfileLocalState.FollowSource.Internal;
                friendsItemSearchListVh.e(uIBlockProfile);
                m3a m3aVar = friendsItemSearchListVh.b;
                if (!userProfile.z) {
                    int intValue = num.intValue();
                    if (intValue == 1 || intValue == 4) {
                        zls.o(ams.a(), context, z, 2);
                    } else if (intValue == 2) {
                        ikv0.a aVar = new ikv0.a(context);
                        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) (0 == true ? 1 : 0), 14);
                        aVar.u = new ikv0.d(context.getString(R.string.friends_catalog_snackbar_accepted), (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
                        aVar.n();
                    }
                }
                if (objArr == true) {
                    m3aVar.j(new ems.a(uIBlockProfile));
                } else {
                    m3aVar.j(new ems.e(uIBlockProfile));
                }
                return s3q0.a;
            case 1:
                Lifecycle lifecycle = (Lifecycle) obj5;
                final gzs gzsVar = (gzs) obj4;
                final ah50 ah50Var = (ah50) obj3;
                final izs izsVar = (izs) obj2;
                ?? r2 = new androidx.lifecycle.l() { // from class: xsna.s630
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                        Lifecycle.Event event2 = Lifecycle.Event.ON_PAUSE;
                        gzs gzsVar2 = gzs.this;
                        ah50 ah50Var2 = ah50Var;
                        if (event == event2 && ah50Var2.i() > 0) {
                            izsVar.invoke(new s2u0(ah50Var2.i(), ((Number) gzsVar2.invoke()).longValue()));
                        }
                        if (event != Lifecycle.Event.ON_RESUME || ah50Var2.i() <= 0) {
                            return;
                        }
                        ah50Var2.p(((Number) gzsVar2.invoke()).longValue());
                    }
                };
                lifecycle.addObserver(r2);
                return new u630(lifecycle, r2, ah50Var, izsVar, gzsVar);
            case 2:
                iuc0 iuc0Var = iuc0.b;
                iuc0.c0((Context) obj2, (Post) obj5, (UserId) obj, (String) obj4, (NewsfeedAddBanTypeDto) obj3);
                return s3q0.a;
            default:
                moveParticipant$lambda$0 = SessionRoomAdminCommandExecutorImpl.moveParticipant$lambda$0((SessionRoomAdminCommandExecutorImpl) obj5, (MoveParticipantParams) obj4, (gzs) obj3, (izs) obj2, (CallParticipant.ParticipantId) obj);
                return moveParticipant$lambda$0;
        }
    }

    public /* synthetic */ sps(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
