package xsna;

import android.content.Context;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPopularHashtagsResponseDto;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.impl.ui.folders.list.e;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.music.Genre;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.h;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import xsna.q2j;
import xsna.vre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class zj implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ zj(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CommunityProfileContent.InitialPosition initialPosition;
        switch (this.b) {
            case 0:
                return (String) ((h2q) obj).c.getValue();
            case 1:
                return Boolean.valueOf(((sxp) obj) instanceof t480);
            case 2:
                String str = ((Genre) obj).c;
                return str != null ? str : "";
            case 3:
                return s3q0.a;
            case 4:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add((jsj) obj2);
                }
                return arrayList;
            case 5:
                return xwk.d().a().m((CharSequence) obj);
            case 6:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 7:
                L.f("DebugMenuFeature", "debug state error", (Throwable) obj);
                return s3q0.a;
            case 8:
                qgi0.r((tgi0) obj, "cart_community_title");
                return s3q0.a;
            case 9:
                return h.a.a;
            case 10:
                return s3q0.a;
            case 11:
                int i = ClipsEntryPointsFragment.i0;
                return s3q0.a;
            case 12:
                return e.b.a;
            case 13:
                return ((vre.b) obj).h;
            case 14:
                return ((ShortVideoGetPopularHashtagsResponseDto) obj).d();
            case 15:
                return ((zk10) obj).getValue().toLowerCase(Locale.ROOT);
            case 16:
                return Float.valueOf(((Float) obj).floatValue() / 100.0f);
            case 17:
                qgi0.r((tgi0) obj, "priority_block_header_action_menu_icon");
                return s3q0.a;
            case 18:
                return ((j9z) obj).a;
            case 19:
                CommunityProfileContent communityProfileContent = (CommunityProfileContent) obj;
                return Boolean.valueOf(((communityProfileContent == null || (initialPosition = communityProfileContent.g) == null) ? null : initialPosition.b) == CommunityProfileContent.InitialPosition.ScrollToContentType.SMOOTH);
            case 20:
                qgi0.r((tgi0) obj, "UnpublishedToolbarTitle");
                return s3q0.a;
            case 21:
                ((uzh0) obj).g();
                return s3q0.a;
            case 22:
                return ((q2j.g) obj).c;
            case 23:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_call_with_audio);
            case 24:
                return Boolean.valueOf(((InstantJob) obj) instanceof njm);
            case 25:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -67108865, 2097151);
            case 26:
                Serializer.c<Peer> cVar = Peer.CREATOR;
                return Peer.a.b(((User) obj).B7().b);
            case 27:
                EducationState educationState = (EducationState) obj;
                return new d.a(educationState.h, educationState.b() != null);
            case 28:
                return s3q0.a;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
        }
    }
}
