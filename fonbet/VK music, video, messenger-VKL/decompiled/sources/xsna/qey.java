package xsna;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.auth.passport.VkPassportContract$VkSecurityInfo;
import com.vk.auth.passport.a;
import com.vk.auth.passport.c;
import com.vk.auth.passport.d;
import com.vk.auth.passport.e;
import com.vk.dto.common.data.VkAppsList;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.entries.DzenArticlesBlock;
import com.vk.dto.notifications.settings.NotificationsSettingsConfig;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import com.vk.newsfeed.posting.geo_picker.presentation.j;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vk.voip.dto.AudioDevice;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bbv0;
import xsna.nsz;
import xsna.p8c0;
import xsna.ptd0;
import xsna.tg30;
import xsna.tj50;
import xsna.ve10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qey implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qey(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.auth.passport.c aVar;
        VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo;
        switch (this.b) {
            case 0:
                return fl3.K((Cursor) obj);
            case 1:
                return nsz.b.a;
            case 2:
                return ((LocationSearchState) ((oyz) obj)).c;
            case 3:
                return new l910((Context) obj);
            case 4:
                return Boolean.valueOf(!((x410) obj).g);
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                return ve10.a.b.a;
            case 7:
                VkAppsList vkAppsList = (VkAppsList) obj;
                wmi0 wmi0Var = wmi0.a;
                wmi0Var.m("key_menu_fav_vk_apps_list", vkAppsList.b);
                wmi0Var.a("key_menu_fea_vk_apps", vkAppsList.c);
                b.d dVar = new b.d("vk_apps_featured_menu");
                dVar.b("show", "action");
                dVar.e();
                return s3q0.a;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) go20.x).setValue(bool);
                return s3q0.a;
            case 9:
                return new tg30.b(null);
            case 10:
                qgi0.r((tgi0) obj, "vk_top_bar_back_btn");
                return s3q0.a;
            case 11:
                MusicOfflineSyncServiceHelper.h("audio.getMigrationAlbumIds", (Throwable) obj);
                return s3q0.a;
            case 12:
                BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) obj;
                return new ncq0(baseUploadServerDto.e(), baseUploadServerDto.d(), null, null, null, 28);
            case 13:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 14:
                return new rym0((ViewGroup) obj);
            case 15:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 16:
                NewsfeedData newsfeedData = (NewsfeedData) obj;
                List<NewsEntry> list = newsfeedData.b;
                NewsfeedData.Info info = newsfeedData.c;
                return new os60(list, info.c, Boolean.valueOf(info.e), false);
            case 17:
                return Boolean.valueOf(((NewsEntry) obj) instanceof DzenArticlesBlock);
            case 18:
                return s3q0.a;
            case 19:
                JSONObject jSONObject = (JSONObject) obj;
                return new NotificationsSettingsConfig(jSONObject.optString("id"), jSONObject.optString("label"), jSONObject.optString("description"), jSONObject.optBoolean("is_enabled"), Boolean.valueOf(jSONObject.optBoolean("disabled_pushes")));
            case 20:
                ProfileNavigationInfo profileNavigationInfo = (ProfileNavigationInfo) obj;
                d.a aVar2 = new d.a(profileNavigationInfo.a);
                ProfileNavigationInfo.b bVar = profileNavigationInfo.b;
                ProfileNavigationInfo.Type type = bVar.c;
                String str = bVar.b;
                com.vk.auth.passport.e dVar2 = type == ProfileNavigationInfo.Type.OPEN ? new e.d(dgn0.d().getString(R.string.vk_profile_dashboard_vkpay_open_text)) : !bVar.a ? new e.c(dgn0.d().getString(R.string.vk_profile_dashboard_vkpay_bind_card)) : (type != ProfileNavigationInfo.Type.DIGITS || str.length() <= 0) ? new e.a(dgn0.d().getString(R.string.vk_profile_dashboard_vkpay_bind_card)) : new e.b(dgn0.d().getString(R.string.vk_profile_dashboard_card_mask, erm0.E0(4, str)));
                ProfileNavigationInfo.a aVar3 = profileNavigationInfo.c;
                if (aVar3.b) {
                    aVar = aVar3.a ? new c.a(dgn0.d().getString(R.string.vk_profile_dashboard_vkcombo_active_default_text)) : new c.C0412c(dgn0.d().getString(R.string.vk_profile_dashboard_vkcombo_default_text));
                } else {
                    aVar = c.b.b;
                }
                int i = a.C0411a.$EnumSwitchMapping$0[profileNavigationInfo.d.ordinal()];
                if (i == 1) {
                    vkPassportContract$VkSecurityInfo = VkPassportContract$VkSecurityInfo.NO_WARNING;
                } else if (i == 2) {
                    vkPassportContract$VkSecurityInfo = VkPassportContract$VkSecurityInfo.CRITICAL_WARNING;
                } else if (i == 3) {
                    vkPassportContract$VkSecurityInfo = VkPassportContract$VkSecurityInfo.NORMAL_WARNING;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkPassportContract$VkSecurityInfo = VkPassportContract$VkSecurityInfo.NO_WARNING;
                }
                return new wav0(aVar2, dVar2, aVar, vkPassportContract$VkSecurityInfo);
            case 21:
                if (((tr90) obj).b()) {
                    bbv0.g.getClass();
                    bbv0.a.f().e.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.PAYMENT_CONFIRMATION);
                }
                return s3q0.a;
            case 22:
                return new j.a(((tj50.a) obj).a(new qcw(14), ao8.d));
            case 23:
                return s3q0.a;
            case 24:
                p8c0.b bVar2 = (p8c0.b) obj;
                Bitmap bitmap = bVar2.c;
                File s = com.vk.core.files.a.s();
                if (kd7.m(bitmap, s)) {
                    return new p8c0.c(bVar2.a, s);
                }
                throw new IOException("Failed to save story bitmap to file");
            case 25:
                return ((PostingState.Editing) obj).d;
            case 26:
                ucc0 ucc0Var = (ucc0) obj;
                PostingAuthorUiModel b = com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.a.b(ucc0Var.a);
                List<PostingAuthor> list2 = ucc0Var.b;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.a.b((PostingAuthor) it.next()));
                }
                return new vcc0(b, arrayList, ucc0Var.c, false, null, null);
            case 27:
                return AudioDevice.NONE;
            case 28:
                qgi0.r((tgi0) obj, "product_card_top_bar_voice_search");
                return s3q0.a;
            default:
                return ptd0.c.a;
        }
    }

    public /* synthetic */ qey(Object obj, int i) {
        this.b = i;
    }
}
