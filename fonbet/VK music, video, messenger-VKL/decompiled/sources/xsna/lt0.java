package xsna;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.api.generated.donut.dto.DonutAttachesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAvailableAttachesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsResponseDto;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.tips.Tooltip;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingBlock;
import com.vk.dto.music.Genre;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.log.L;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import kotlin.collections.EmptyList;
import xsna.e3m;
import xsna.fgg0;
import xsna.gp3;
import xsna.kb7;
import xsna.q2j;
import xsna.qie;
import xsna.tj50;
import xsna.yk8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lt0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ lt0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Optional of;
        List<DonutAttachesDto> d;
        ArrayList arrayList = null;
        arrayList = null;
        switch (this.b) {
            case 0:
                it80.b.getClass();
                return new it80((Location) obj);
            case 1:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.x1(ggjVar, yk8.a.a(e43.l(new l5g(l5g.j), new l5g(l5g.b)), Float.intBitsToFloat((int) (ggjVar.d() >> 32)), Float.intBitsToFloat((int) (ggjVar.d() >> 32)) - ggjVar.I0(32), 8), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 6, 62);
                return s3q0.a;
            case 2:
                tj50.a aVar = (tj50.a) obj;
                h0u0 e = aVar.e(yo3.b);
                zo3 zo3Var = zo3.b;
                ao8 ao8Var = ao8.d;
                return new gp3.a(e, aVar.a(zo3Var, ao8Var), aVar.a(ap3.b, ao8Var));
            case 3:
                String str = ((Genre) obj).c;
                return str != null ? str : "";
            case 4:
                i600 i600Var = (i600) obj;
                long j = i600Var.c;
                long j2 = i600Var.b;
                if (0 <= j2 && j2 < j) {
                    return io.reactivex.rxjava3.core.x.k(i600Var);
                }
                StringBuilder sb = new StringBuilder("Audio snippet is invalid! (url=");
                sb.append(i600Var.d);
                sb.append(", fromMs=");
                sb.append(j2);
                sb.append(", toMs=");
                return io.reactivex.rxjava3.core.x.i(new IllegalStateException(vu5.a(')', i600Var.c, sb)));
            case 5:
                return Boolean.valueOf(((PageLoadingState) obj).Eb());
            case 6:
                return (AttachWithImage) ca3.b((AttachmentWithMedia) obj);
            case 7:
                User user = (User) j5g.Z(((ProfilesInfo) obj).b.c.values());
                return (user == null || (of = Optional.of(user)) == null) ? Optional.empty() : of;
            case 8:
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, (String) obj, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.PREVIEW), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                return s3q0.a;
            case 9:
                return new kb7.d(((tj50.a) obj).a(xa7.b, ao8.d));
            case 10:
                qgi0.r((tgi0) obj, "clips_grid_footer_empty_button");
                return s3q0.a;
            case 11:
                int i = BonusCatalogFragment.f0;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 12:
                return Boolean.valueOf(((BookingServicesScreenState.ServiceWrapper) obj).c);
            case 13:
                return Boolean.valueOf(((Attachment) obj) instanceof FwdMessagesAttachment);
            case 14:
                return fpf0.a(((k7r) obj).getClass());
            case 15:
                ShortVideoAvailableAttachesDto d2 = ((ShortVideoGetUserSettingsResponseDto) obj).d();
                if (d2 != null && (d = d2.d()) != null) {
                    List<DonutAttachesDto> list = d;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    for (DonutAttachesDto donutAttachesDto : list) {
                        arrayList.add(new qaq0(donutAttachesDto.getId(), donutAttachesDto.getTitle(), donutAttachesDto.d()));
                    }
                }
                return arrayList == null ? EmptyList.b : arrayList;
            case 16:
                L.f("ClipsAuthorsInteractorImpl", "Failed to load groups after channel creation", (Throwable) obj);
                return s3q0.a;
            case 17:
                fgg0 fgg0Var = new fgg0((List) obj);
                ArrayList arrayList2 = new ArrayList(c5g.u(fgg0Var, 10));
                Iterator it = fgg0Var.iterator();
                while (true) {
                    ListIterator<T> listIterator = ((fgg0.a) it).b;
                    if (!listIterator.hasPrevious()) {
                        return arrayList2;
                    }
                    arrayList2.add(new qie.a.C3564a((SdkVideoFile) listIterator.previous()));
                }
            case 18:
                return new z3q0(((AdPixelStatsComponent) ((f8m) obj).a(fpf0.a(AdPixelStatsComponent.class))).Ed());
            case 19:
                int i2 = ClipsWrapperFragment.Q0;
                qgi0.r((tgi0) obj, "clips_wrapper_top_bar_back_button");
                return s3q0.a;
            case 20:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).i);
            case 21:
                Context context = (Context) obj;
                int i3 = -cn70.b(6);
                int b2 = cn70.b(256);
                e3m.a aVar2 = e3m.a;
                return new Tooltip.f(context.getColor(R.color.vk_tip_background), Integer.valueOf(context.getColor(R.color.vk_white)), Integer.valueOf(b2), 48, null, i3, 32497449);
            case 22:
                qgi0.r((tgi0) obj, "priority_block_header_title");
                return s3q0.a;
            case 23:
                return Integer.valueOf(((GroupCreationOnboardingBlock.Option) obj).e);
            case 24:
                return s3q0.a;
            case 25:
                csi0.e((nvy) obj, e43.l(new esi0("1", "Service section 1", true, e43.l(new zni0(0L, csi0.d()), new zni0(1L, csi0.d()), new zni0(2L, csi0.d()))), new esi0("2", "Service section 2", false, e43.l(new zni0(0L, csi0.d()), new zni0(1L, csi0.d()), new zni0(2L, csi0.d())))), false, true, true, null, new xx0(22));
                return s3q0.a;
            case 26:
                return Integer.valueOf(((q2j.c) obj).c);
            case 27:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(x8jVar.c, x8jVar.a, x8jVar.b, x8jVar.d, false, null, 384);
            case 28:
                Context context2 = (Context) obj;
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                VkContentBadge vkContentBadge = new VkContentBadge(context2, null, 6);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                vkContentBadge.setLayoutParams(layoutParams);
                vkContentBadge.setMode(VkContentBadge.Mode.Secondary);
                vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Overlay);
                VkBlurContentView vkBlurContentView = new VkBlurContentView(context2, null, 6);
                vkBlurContentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ScrollView scrollView = new ScrollView(context2);
                scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                LinearLayout linearLayout = new LinearLayout(context2);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                linearLayout.setGravity(17);
                linearLayout.setBackgroundResource(R.drawable.ds_demo_image_3);
                linearLayout.setPadding(0, hbh0.b(200, context2), 0, hbh0.b(200, context2));
                scrollView.addView(linearLayout);
                vkBlurContentView.addView(scrollView);
                frameLayout.addView(vkBlurContentView);
                vkContentBadge.setupBlur(vkBlurContentView);
                LinearLayout linearLayout2 = new LinearLayout(context2);
                VkText vkText = new VkText(context2, null, 6, 0);
                abg0 abg0Var = dhr0.t;
                vkText.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
                vkText.setText("This layout is scrollable! ");
                VkText vkText2 = new VkText(context2, null, 6, 0);
                vkText2.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
                vkText2.setText("View:");
                linearLayout2.addView(vkText);
                linearLayout2.addView(vkText2);
                frameLayout.addView(linearLayout2);
                frameLayout.addView(vkContentBadge);
                frameLayout.setTag(vkContentBadge);
                return frameLayout;
            default:
                Intent intent = new Intent("com.vkontakte.android.USER_COVER_CHANGED");
                Context context3 = e43.a;
                n2i0.a(context3 != null ? context3 : null, hf8.a, intent);
                return s3q0.a;
        }
    }

    public /* synthetic */ lt0(Object obj, int i) {
        this.b = i;
    }
}
