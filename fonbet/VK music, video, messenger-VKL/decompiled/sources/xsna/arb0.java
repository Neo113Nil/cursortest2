package xsna;

import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.stickers.dto.StickersPopupSettingsAutoplayDto;
import com.vk.api.generated.stickers.dto.StickersPopupSettingsDto;
import com.vk.api.generated.stickers.dto.StickersPopupSettingsFlagsDto;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.core.preference.Preference;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.dto.stickers.PopupStickersSettingsFlags;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.internal.api.GsonHolder;
import com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardState;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.photos.root.selectalbum.domain.a;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.profile.user.impl.ui.f;
import com.vk.stories.design.view.editor.SideControlPanelView;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutActivity;
import com.vk.superapp.browser.ui.a;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.atb0;
import xsna.atq0;
import xsna.kbl0;
import xsna.o4e0;
import xsna.oml0;
import xsna.rwi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class arb0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ arb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StickersPopupSettingsAutoplayDto d;
        StickersPopupSettingsFlagsDto e;
        StoryEntry storyEntry;
        int i = 11;
        boolean z = false;
        int i2 = 1;
        r6 = null;
        PopupStickersChatSettingsModel popupStickersChatSettingsModel = null;
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                if (((PostingPollDto) this.c) != null) {
                    qgi0.r(tgi0Var, "PostingSettingsStep2RemovePollButton");
                }
                return s3q0.a;
            case 1:
                atb0.b bVar = (atb0.b) obj;
                zsb0 zsb0Var = ((msb0) this.c).i1;
                zsb0 zsb0Var2 = zsb0Var != null ? zsb0Var : null;
                boolean f = epx.f(bVar.a.a(), Boolean.TRUE);
                LinearLayout linearLayout = zsb0Var2.o;
                FrameLayout frameLayout = zsb0Var2.j;
                LinearLayout linearLayout2 = zsb0Var2.i;
                View view = zsb0Var2.r;
                LinearLayout linearLayout3 = zsb0Var2.h;
                TextView textView = zsb0Var2.t;
                if (f) {
                    textView.setVisibility(0);
                    linearLayout3.setVisibility(4);
                    view.setVisibility(4);
                    linearLayout2.setVisibility(4);
                    frameLayout.setVisibility(4);
                    linearLayout.setVisibility(4);
                } else {
                    textView.setVisibility(8);
                    linearLayout3.setVisibility(0);
                    view.setVisibility(0);
                    linearLayout2.setVisibility(0);
                    frameLayout.setVisibility(0);
                    linearLayout.setVisibility(0);
                }
                return s3q0.a;
            case 2:
                myb0 myb0Var = (myb0) this.c;
                StickersPopupSettingsDto stickersPopupSettingsDto = (StickersPopupSettingsDto) obj;
                PopupStickersSettingsFlags popupStickersSettingsFlags = (stickersPopupSettingsDto == null || (e = stickersPopupSettingsDto.e()) == null) ? null : new PopupStickersSettingsFlags(e.e(), e.d());
                myb0Var.getClass();
                HashMap<UserId, kbl0> hashMap = kbl0.b;
                kbl0 b = kbl0.a.b();
                if (popupStickersSettingsFlags == null) {
                    popupStickersSettingsFlags = new PopupStickersSettingsFlags(false, false, 3, null);
                }
                b.getClass();
                Preference.H(b.a, "stickers_popup_settings_flags", GsonHolder.a().toJson(popupStickersSettingsFlags));
                if (stickersPopupSettingsDto != null && (d = stickersPopupSettingsDto.d()) != null) {
                    popupStickersChatSettingsModel = yal0.c(d);
                }
                myb0Var.f(popupStickersChatSettingsModel);
                myb0Var.b.set(true);
                return s3q0.a;
            case 3:
                NewsEntry newsEntry = (NewsEntry) this.c;
                ((wee0) newsEntry).P4((Owner) obj);
                return newsEntry;
            case 4:
                chc0 chc0Var = (chc0) this.c;
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "PostingMediaPickerToolbarTitle");
                qgi0.h(tgi0Var2, chc0Var.a);
                return s3q0.a;
            case 5:
                ((rb80) this.c).c();
                return s3q0.a;
            case 6:
                com.vk.profile.core.tabs.ui.music.c cVar = (com.vk.profile.core.tabs.ui.music.c) this.c;
                Playlist playlist = (Playlist) obj;
                j15 j15Var = (j15) cVar.t;
                if (j15Var != null) {
                    cVar.E.f(j15Var, new zb4(playlist, j15Var), null, 0);
                }
                return s3q0.a;
            case 7:
                y5e0 y5e0Var = (y5e0) this.c;
                y5e0Var.c.invoke(new o4e0.a(y5e0Var.d, false));
                return s3q0.a;
            case 8:
                Photo photo = (Photo) this.c;
                Photo photo2 = (Photo) obj;
                odg0.a.getClass();
                if (epx.f(photo.e, photo2.e) && photo.c == photo2.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                Class[] clsArr = (Class[]) this.c;
                int length = clsArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (clsArr[i3].isInstance(obj)) {
                            z = true;
                        } else {
                            i3++;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                ((pf40) this.c).invoke(new a.i(((View) obj).getHeight()));
                return s3q0.a;
            case 11:
                s8i0 s8i0Var = (s8i0) this.c;
                VKList<Narrative> vKList = (VKList) obj;
                s8i0Var.c(vKList);
                if (vKList.isEmpty() && (storyEntry = s8i0Var.e) != null) {
                    s8i0Var.a(storyEntry);
                }
                return s3q0.a;
            case 12:
                ((aji0) this.c).c.setItems((List) obj);
                return s3q0.a;
            case 13:
                mwi0 mwi0Var = (mwi0) this.c;
                if (((Boolean) obj).booleanValue()) {
                    mwi0Var.V(rwi0.c.d.a);
                }
                return s3q0.a;
            case 14:
                fdj0 fdj0Var = (fdj0) this.c;
                ((Float) obj).getClass();
                azl azlVar = fdj0Var.c;
                if (azlVar != null) {
                    return Float.valueOf(azlVar.I0(56));
                }
                throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
            case 15:
                eag0 eag0Var = (eag0) obj;
                ShortcutActivity shortcutActivity = ((ehj0) this.c).a;
                if (shortcutActivity.getSupportFragmentManager().G(R.id.vk_miniapp_container_id) == null) {
                    FragmentManager supportFragmentManager = shortcutActivity.getSupportFragmentManager();
                    androidx.fragment.app.a b2 = tk5.b(supportFragmentManager, supportFragmentManager);
                    WebApiApplication webApiApplication = eag0Var.a;
                    String str = eag0Var.b.a;
                    Intent intent = shortcutActivity.getIntent();
                    b2.f(R.id.vk_miniapp_container_id, a.C1874a.a(webApiApplication, str, intent != null ? intent.getStringExtra("ref") : null, null, 56), "shortcut_open", 1);
                    b2.k(true);
                }
                return s3q0.a;
            case 16:
                d4l0 d4l0Var = ((SideControlPanelView) this.c).v;
                if (d4l0Var != null) {
                    d4l0Var.e();
                }
                return s3q0.a;
            case 17:
                llj lljVar = (llj) this.c;
                return new llj(lljVar.a, lljVar.b, 4);
            case 18:
                ((com.vk.clips.sdk.shared.item.static_ads.c) this.c).B.a(StaticAdsItemViewEvent.i.b);
                return s3q0.a;
            case 19:
                com.vk.stickers.keyboard.page.a aVar = (com.vk.stickers.keyboard.page.a) this.c;
                return new bhy(aVar.i, aVar.m);
            case 20:
                ncl0 ncl0Var = (ncl0) this.c;
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject == null) {
                    return null;
                }
                String optString = jSONObject.optString("character_id");
                boolean optBoolean = jSONObject.optBoolean("is_promo");
                ncl0Var.d.getClass();
                y8l0.a.a(new q7w0(optString, optBoolean));
                ncl0Var.a1(true);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", 1);
                return jSONObject2;
            case 21:
                ((fpl0) this.c).e(oml0.o.a);
                return s3q0.a;
            case 22:
                smm0 smm0Var = (smm0) this.c;
                otz otzVar = (otz) obj;
                if (!smm0Var.h) {
                    StoryEntry c = otzVar.c();
                    String id = c != null ? c.getId() : null;
                    StoryEntry b3 = smm0Var.a.b();
                    if (!epx.f(id, b3 != null ? b3.getId() : null)) {
                        return io.reactivex.rxjava3.internal.operators.completable.i.b;
                    }
                }
                return new io.reactivex.rxjava3.internal.operators.completable.x(smm0Var.b(otzVar), new i3u(new ptl0(otzVar, 5), 15)).g(new qtg0(i2, smm0Var, otzVar));
            case 23:
                ((uvm0) this.c).b(true);
                return s3q0.a;
            case 24:
                iui iuiVar = (iui) obj;
                iuiVar.a = new f9h(iuiVar.a(new smf0(((i5n0) this.c).d, new rr60())), i);
                return s3q0.a;
            case 25:
                String str2 = (String) obj;
                ehn0 ehn0Var = ((hhn0) this.c).j;
                (ehn0Var != null ? ehn0Var : null).b(str2);
                return s3q0.a;
            case 26:
                return TemplatesKeyboardState.a((TemplatesKeyboardState) obj, (List) this.c);
            case 27:
                ((UserProfileAvatarsInteractor.a) this.c).f = true;
                return s3q0.a;
            case 28:
                ((ymq0) this.c).M((xaf) obj);
                return s3q0.a;
            default:
                Throwable th = (Throwable) obj;
                fpq0 fpq0Var = ((ynq0) this.c).h;
                if (fpq0Var == null) {
                    fpq0Var = null;
                }
                fpq0Var.B(new f.h(new atq0.f(null, null, th, 11)));
                return s3q0.a;
        }
    }

    public /* synthetic */ arb0(ymq0 ymq0Var, Clips clips) {
        this.b = 28;
        this.c = ymq0Var;
    }
}
