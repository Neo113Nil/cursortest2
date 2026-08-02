package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.e;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPreview;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionUpdateNonActiveGroups;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.music.reactions.Reaction;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.AudioAttachListItem;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.video.ui.upload.impl.publish.presentation.author.compose.onboarding.OnboardingViewState;
import com.vk.video.ui.upload.impl.publish.presentation.author.feature.entity.AuthorState;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import xsna.dug0;
import xsna.ioa0;
import xsna.ry;
import xsna.tj50;
import xsna.z2d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class db implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ db(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<UIBlockAction> list;
        List<CatalogFilterData> list2;
        CatalogFilterData catalogFilterData;
        ArrayList arrayList = null;
        ut4 ut4Var = null;
        switch (this.b) {
            case 0:
                hfz hfzVar = (hfz) obj;
                int i = AbsFriendsAndFollowersTabFragment.X;
                mks mksVar = hfzVar instanceof mks ? (mks) hfzVar : null;
                if (mksVar != null) {
                    return mksVar.getProfile();
                }
                return null;
            case 1:
                int i2 = AbstractPollView.S;
                return ((Owner) obj).e;
            case 2:
                qgi0.r((tgi0) obj, "addingClipGroupTitle");
                return s3q0.a;
            case 3:
                return ry.a.a;
            case 4:
                ((b.d) obj).b(1, "no_google_play");
                return s3q0.a;
            case 5:
                AnimatedCounterView animatedCounterView = (AnimatedCounterView) obj;
                qcy<Object>[] qcyVarArr = AnimatedCounterView.w;
                animatedCounterView.requestLayout();
                animatedCounterView.invalidate();
                return s3q0.a;
            case 6:
                return ((zrb0) obj).a;
            case 7:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 8:
                HistoryAttach historyAttach = (HistoryAttach) obj;
                return new AudioAttachListItem((AttachAudio) historyAttach.d, historyAttach.b, historyAttach.c, AudioAttachListItem.State.EMPTY);
            case 9:
                Throwable th = (Throwable) obj;
                Context context = e43.a;
                cvk.w(j03.g(context != null ? context : null, th, R.string.default_network_error), false);
                return s3q0.a;
            case 10:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `audio_reaction`.`title` AS `title`, `audio_reaction`.`subtitle` AS `subtitle`, `audio_reaction`.`reactions` AS `reactions` FROM audio_reaction LIMIT 1");
                try {
                    if (V0.step()) {
                        String l2 = V0.l2(0);
                        String l22 = V0.l2(1);
                        String l23 = V0.isNull(2) ? null : V0.l2(2);
                        if (l23 != null) {
                            JSONArray jSONArray = new JSONArray(l23);
                            ArrayList arrayList2 = new ArrayList();
                            int length = jSONArray.length();
                            for (int i3 = 0; i3 < length; i3++) {
                                arrayList2.add(new Reaction(jSONArray.getJSONObject(i3)));
                            }
                            arrayList = arrayList2;
                        }
                        if (arrayList == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.vk.dto.music.reactions.Reaction>', but it was NULL.");
                        }
                        ut4Var = new ut4(l2, l22, arrayList);
                    }
                    V0.close();
                    return ut4Var;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 11:
                AuthorState authorState = (AuthorState) obj;
                return AuthorState.a(authorState, 0, new OnboardingViewState(authorState.e.b, false), 7);
            case 12:
                return ((tam0) obj).h.a;
            case 13:
                tj50.a aVar = (tj50.a) obj;
                t87 t87Var = t87.b;
                ao8 ao8Var = ao8.d;
                return new e.a(aVar.a(t87Var, ao8Var), aVar.a(u87.b, ao8Var), aVar.a(v87.b, ao8Var), aVar.a(w87.b, ao8Var));
            case 14:
                return Boolean.valueOf(((BookingCalendarScreenState) obj).c);
            case 15:
                int i4 = CallParticipantsFragment.W;
                return ((fjw0) obj).a;
            case 16:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 17:
                VkCheckboxItem vkCheckboxItem = new VkCheckboxItem((Context) obj, null, 6, 0);
                vkCheckboxItem.setType(VkCheckbox.Type.Square);
                return vkCheckboxItem;
            case 18:
                z2d z2dVar = (z2d) obj;
                if (z2dVar instanceof z2d.b) {
                    return new tch0(false, ioa0.a.a);
                }
                if (!(z2dVar instanceof z2d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z2d.a aVar2 = (z2d.a) z2dVar;
                return new tch0(aVar2.u.b, aVar2.C);
            case 19:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 20:
                return k9q0.v(((cqe) obj).a);
            case 21:
                qgi0.r((tgi0) obj, "AUTHOR_SUBTITLE_TEST_TAG");
                return s3q0.a;
            case 22:
                return lqe.a((ShortVideoPlaylistFullDto) obj, true);
            case 23:
                ArrayList<UIBlock> arrayList3 = ((UIBlockList) obj).y;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (obj2 instanceof UIBlockPreview) {
                        arrayList4.add(obj2);
                    }
                }
                UIBlockPreview uIBlockPreview = (UIBlockPreview) j5g.a0(arrayList4);
                if (uIBlockPreview == null || (list = uIBlockPreview.B) == null) {
                    return null;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof UIBlockActionUpdateNonActiveGroups) {
                        arrayList5.add(obj3);
                    }
                }
                UIBlockActionUpdateNonActiveGroups uIBlockActionUpdateNonActiveGroups = (UIBlockActionUpdateNonActiveGroups) j5g.a0(arrayList5);
                if (uIBlockActionUpdateNonActiveGroups == null || (list2 = uIBlockActionUpdateNonActiveGroups.z) == null || (catalogFilterData = (CatalogFilterData) j5g.a0(list2)) == null) {
                    return null;
                }
                return catalogFilterData.b;
            case 24:
                int i5 = CommunityAddressesFragment.E0;
                float f = 20;
                return Bitmap.createScaledBitmap((Bitmap) obj, iah0.a(f), iah0.a(f), true);
            case 25:
                L.i((Throwable) obj);
                return s3q0.a;
            case 26:
                qgi0.r((tgi0) obj, "COMMUNITY_DESCRIPTION_INFO_ITEM");
                return s3q0.a;
            case 27:
                return s3q0.a;
            case 28:
                L.g("Can't delete photo", (Throwable) obj);
                return s3q0.a;
            default:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_leave_dialog, (Context) obj);
        }
    }
}
