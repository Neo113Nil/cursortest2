package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.hints.Hint;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import com.vk.ecomm.design.compose.product_info.f;
import com.vk.ecomm.product_list.presentation.e;
import com.vk.ecomm.product_list.presentation.j;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.log.L;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.newsfeed.impl.fragments.BaseCommentsFragment;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.ad80;
import xsna.cck;
import xsna.ee80;
import xsna.fss;
import xsna.rhw0;
import xsna.zcd0;
import xsna.znc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lb6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lb6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        us2 us2Var;
        ExposedFunction invoke$lambda$8;
        PostingUserMessage postingUserMessage;
        RecyclerView.Adapter adapter;
        int i = this.b;
        FirebaseCrashlytics firebaseCrashlytics = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = BaseCommentsFragment.l0;
                ((afg) obj2).Fm((iag) obj);
                break;
            case 1:
                rjo0 rjo0Var = (rjo0) obj2;
                us2 us2Var2 = (us2) obj;
                if (rjo0Var != null) {
                    SnapshotStateList<izs<tbo0, s3q0>> snapshotStateList = rjo0Var.c;
                    if (snapshotStateList.isEmpty()) {
                        us2Var = rjo0Var.b;
                    } else {
                        tbo0 tbo0Var = new tbo0(rjo0Var.b);
                        int size = snapshotStateList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            snapshotStateList.get(i3).invoke(tbo0Var);
                        }
                        us2Var = tbo0Var.b;
                    }
                    rjo0Var.b = us2Var;
                    if (us2Var != null) {
                        break;
                    }
                }
                break;
            case 2:
                ((rcb) obj2).o.p((AvatarAction) obj);
                break;
            case 3:
                break;
            case 4:
                ((izs) obj2).invoke(((znc.a) obj).a);
                break;
            case 5:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                int i4 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.go(new fh1(9, clipsFavoriteFolderContentListFragment, ((ClipsFavoriteFolderContentListViewState.e.b) ((ClipsFavoriteFolderContentListViewState.e) obj)).a));
                break;
            case 6:
                ((izs) obj2).invoke(new cck.d((SnackBar) obj));
                break;
            case 7:
                break;
            case 8:
                hrl hrlVar = (hrl) obj2;
                hrlVar.e((ClipsInterestsViewState.d) obj);
                hrlVar.a.b();
                break;
            case 9:
                hgm hgmVar = (hgm) obj2;
                Context context = hgmVar.d;
                VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
                vkImageSimple.setImageDrawable(hgmVar.o());
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER);
                vkImageSimple.setContentDescription(null);
                vkImageSimple.setLayoutParams(egm.W(hgmVar, hgmVar.t0, hgmVar.s0, e3m.a(R.dimen.vk_ui_spacing_size_xs, context), e3m.a(R.dimen.vkim_dialog_list_item_spacing_size4_xs, context), e3m.a(R.dimen.vk_ui_spacing_size_m, context), 0, 32));
                vkImageSimple.setVisibility(0);
                ((ViewGroup) obj).addView(vkImageSimple);
                break;
            case 10:
                break;
            case 11:
                String str = (String) obj2;
                String str2 = (String) obj;
                try {
                    if (rhr.c()) {
                        firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    }
                } catch (RuntimeException e) {
                    L.i(e);
                }
                if (firebaseCrashlytics != null) {
                    firebaseCrashlytics.log(str + ": " + str2);
                }
                break;
            case 12:
                ((azr) obj2).l.a((yyr) obj);
                break;
            case 13:
                RequestUserProfile requestUserProfile = (RequestUserProfile) obj2;
                nis nisVar = (nis) obj;
                lss<fss> lssVar = nisVar.c;
                if (requestUserProfile.p0) {
                    lssVar.a(new fss.b.a(requestUserProfile));
                } else {
                    lssVar.a(new fss.d(requestUserProfile, nisVar.b.H5()));
                }
                break;
            case 14:
                invoke$lambda$8 = HandleInvocationsFromAdViewer.invoke$lambda$8((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                break;
            case 15:
                nek0 nek0Var = (nek0) obj;
                ((gzs) obj2).invoke();
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                break;
            case 16:
                ((izs) obj2).invoke(new f.e(((MarketProductCardMainInfo) obj).k));
                break;
            case 17:
                ((izs) obj2).invoke(new gs40(((MusicPickerListItem.MusicTrackItem) ((MusicPickerListItem) obj)).b, true));
                break;
            case 18:
                oz60 oz60Var = (oz60) obj2;
                break;
            case 19:
                FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                rtg0 rtg0Var = (rtg0) obj;
                PermissionHelper permissionHelper = PermissionHelper.a;
                permissionHelper.getClass();
                PermissionHelper.l(permissionHelper, fragmentActivity, PermissionHelper.b, new xk(23, fragmentActivity, rtg0Var), new bk30(rtg0Var, 8), 4);
                break;
            case 20:
                zv40 zv40Var = new zv40();
                ArrayList arrayList = zv40Var.b;
                arrayList.add((px40) obj2);
                arrayList.add((w0x) ((OnMediaAudioComponentProvider) obj).i.getValue());
                break;
            case 21:
                ((kd80) obj2).g.b(new ee80.b(((ad80.c) ((ad80) obj)).c));
                break;
            case 22:
                izs izsVar = (izs) obj2;
                ActionsAvailabilityState.Availability availability = (ActionsAvailabilityState.Availability) obj;
                PostingAction.Publish.DraftClicked draftClicked = PostingAction.Publish.DraftClicked.b;
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(draftClicked);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, draftClicked, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                break;
            case 23:
                ((izs) obj2).invoke(new zcd0.c((DonutLevel) obj));
                break;
            case 24:
                bqd0 fo = ((com.vk.ecomm.product_list.presentation.a) obj2).fo();
                vpd0 vpd0Var = ((j.b) ((com.vk.ecomm.product_list.presentation.j) obj)).a;
                fo.b(new e.d(vpd0Var.a, vpd0Var.b, vpd0Var.i));
                break;
            case 25:
                break;
            case 26:
                com.vk.im.ui.components.theme_chooser.c cVar = (com.vk.im.ui.components.theme_chooser.c) obj;
                if (((Ref$BooleanRef) obj2).element && (adapter = cVar.j.getAdapter()) != null) {
                    cVar.b(adapter);
                }
                break;
            case 27:
                lsq0 lsq0Var = (lsq0) obj2;
                lsq0Var.d0().b(((Hint) obj).b);
                lsq0Var.d0().detach();
                break;
            default:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj2;
                VkTopBar vkTopBar = (VkTopBar) obj;
                int i5 = VoipCallServiceFragment.Y;
                voipCallServiceFragment.getFeature().C(rhw0.e.b);
                Rect n = zjq.n(vkTopBar.getRightExtraRect());
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                vkTopBar.getContext();
                e.c cVar2 = new e.c(null, n, vkTopBar, l, 1);
                VkContextMenu.c.c(cVar2, R.string.voip_vkapp_services_call_by_phone, dhr0.x(R.drawable.vk_icon_hashtag_outline_24, R.attr.vk_ui_icon_accent_themed, voipCallServiceFragment.requireContext()), false, null, new v5n0(voipCallServiceFragment, 24), 28);
                VkContextMenu.c.c(cVar2, R.string.voip_vkapp_services_call_create, dhr0.x(R.drawable.vk_icon_linked_24, R.attr.vk_ui_icon_accent_themed, voipCallServiceFragment.requireContext()), false, null, new egu0(voipCallServiceFragment, 3), 28);
                cVar2.l(false);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lb6(wir wirVar, String str, String str2) {
        this.b = 11;
        this.c = str;
        this.d = str2;
    }
}
