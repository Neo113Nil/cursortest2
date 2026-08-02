package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListState;
import com.vk.core.preference.Preference;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.h;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.music.bottomsheets.audiobook.chapter.presentation.feature.AudioBookChapterMviState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.api;
import xsna.cce;
import xsna.q2j;
import xsna.qdd;
import xsna.r2j;
import xsna.tj50;
import xsna.wwh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c2 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ c2(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        r2j.i aVar;
        r2j.i bVar;
        switch (this.b) {
            case 0:
                tj50.a aVar2 = (tj50.a) obj;
                e2 e2Var = e2.b;
                ao8 ao8Var = ao8.d;
                return new api.a(aVar2.a(e2Var, ao8Var), aVar2.a(f2.b, ao8Var), aVar2.a(g2.b, ao8Var), aVar2.a(h2.b, ao8Var));
            case 1:
                return s3q0.a;
            case 2:
                return (t480) ((sxp) obj);
            case 3:
                return ue4.a((AudioBookChapterMviState) obj);
            case 4:
                ((Boolean) obj).booleanValue();
                Preference.C("text_sticker", "text_sticker");
                return s3q0.a;
            case 5:
                L.f("DebugMenuFeature", "join options error", (Throwable) obj);
                return s3q0.a;
            case 6:
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "cart_community_actions_menu");
                return s3q0.a;
            case 8:
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockProfile) {
                    ((UIBlockProfile) uIBlock).A.T = false;
                } else if (uIBlock instanceof UIBlockGroup) {
                    ((UIBlockGroup) uIBlock).y.U = false;
                }
                return uIBlock;
            case 9:
                bdb bdbVar = (bdb) obj;
                if (!bdbVar.l && bdbVar.m) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 10:
                return Long.valueOf(((bdb) obj).b);
            case 11:
                return ((com.vk.movika.sdk.base.model.f) obj).b();
            case 12:
                return new h.c(((tj50.a) obj).a(new f57(4), ao8.d));
            case 13:
                return new qdd.c.b((hda) obj);
            case 14:
                return Boolean.valueOf(((ClipsFavoriteFoldersListState.Content) obj).e == ClipsFavoriteFoldersListState.Content.LoadingState.REFRESHING);
            case 15:
                tj50.a aVar3 = (tj50.a) obj;
                int i = 12;
                wq3 wq3Var = new wq3(i);
                ao8 ao8Var2 = ao8.d;
                return new cce.e(aVar3.a(wq3Var, ao8Var2), aVar3.a(new y40(15), ao8Var2), aVar3.a(new rl2(8), ao8Var2), aVar3.a(new ci7(13), ao8Var2), aVar3.a(new x90(6), ao8Var2), aVar3.a(new y90(i), ao8Var2));
            case 16:
                return ((h7d) obj).a;
            case 17:
                return Boolean.valueOf(!(((com.vk.photo.editor.features.colorgrading.a) obj).g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            case 18:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 19:
                qgi0.c((tgi0) obj);
                return s3q0.a;
            case 20:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 21:
                return wwh.b.a;
            case 22:
                vzh vzhVar = (vzh) obj;
                yig0 yig0Var = vzhVar.y;
                return Boolean.valueOf(((yig0Var.a == null || yig0Var.d == null || yig0Var.c == null) && vzhVar.A == null) ? false : true);
            case 23:
                ((uzh0) obj).s();
                return s3q0.a;
            case 24:
                q2j.h hVar = (q2j.h) obj;
                List<SessionRoomParticipantModel> list = hVar.d;
                boolean z = !(hVar.g instanceof q2j.h.a.g);
                boolean z2 = hVar.f;
                int i2 = z2 ? R.string.voip_session_room_admin_configure_rooms_header : R.string.voip_session_room_admin_rooms_and_participants;
                boolean z3 = !z2;
                if (list.isEmpty()) {
                    aVar = r2j.i.c.a;
                } else {
                    if (hVar.f) {
                        bVar = new r2j.i.b(list);
                        return new r2j.h(i2, z3, z, z3, z2, bVar, hVar.e);
                    }
                    aVar = new r2j.i.a(hVar.c, z);
                }
                bVar = aVar;
                return new r2j.h(i2, z3, z, z3, z2, bVar, hVar.e);
            case 25:
                return s3q0.a;
            case 26:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_groups_receive_notify_disable);
            case 27:
                EducationState educationState = (EducationState) obj;
                if (educationState.d == null && educationState.b() == null && educationState.h == null) {
                    r1 = true;
                }
                return Boolean.valueOf(!r1);
            case 28:
                return i7d.a((h7d) obj);
            default:
                int i3 = FriendsFragment.q0;
                return Integer.valueOf(((aus) obj).a());
        }
    }
}
