package xsna;

import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.impl.ImagePickerActivity;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.Push;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.voip.ui.notifications.incoming.d;
import com.vkontakte.android.R;
import java.io.File;
import java.text.ParseException;
import java.util.Arrays;
import xsna.egm;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sfg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sfg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$21;
        int i = this.b;
        int i2 = R.attr.vk_ui_icon_accent;
        Object obj = this.c;
        switch (i) {
            case 0:
                tfg tfgVar = (tfg) obj;
                TextView textView = tfgVar.D;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                textView.getContext();
                e.b bVar = new e.b(textView, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                bVar.l = tfgVar.F;
                break;
            case 1:
                break;
            case 2:
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) obj;
                com.vk.notifications.settings.c cVar = communityNotificationSettingsFragment.V;
                (cVar != null ? cVar : null).e0();
                communityNotificationSettingsFragment.io();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                ComposeHeaderIconShowAllBadgeVh composeHeaderIconShowAllBadgeVh = (ComposeHeaderIconShowAllBadgeVh) obj;
                int i3 = ComposeHeaderIconShowAllBadgeVh.A;
                if (!jjc.d().a()) {
                    int i4 = ComposeHeaderIconShowAllBadgeVh.A;
                    composeHeaderIconShowAllBadgeVh.b(ClickType.SHOW_ALL_CHEVRON);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            case 6:
                break;
            case 7:
                com.vk.im.ui.components.contacts.b bVar2 = (com.vk.im.ui.components.contacts.b) obj;
                bVar2.o.onNext(gdj.a(bVar2.d(), null, null, null, null, null, false, null, 1535));
                break;
            case 8:
                break;
            case 9:
                com.vk.core.compose.component.datetime.m mVar = ((com.vk.core.compose.component.datetime.d) obj).a;
                if (mVar.c()) {
                    try {
                        break;
                    } catch (ParseException unused) {
                        return null;
                    }
                }
                break;
            case 10:
                egm egmVar = (egm) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_read_out_icon);
                boolean z = egmVar.c;
                int i5 = z ? R.drawable.vk_icon_check_double_outline_16 : R.drawable.vk_icon_checks_small_outline_20;
                if (z) {
                    i2 = R.attr.vk_ui_icon_accent_themed;
                }
                omw.d(vkImageSimple, i5, i2);
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                vkImageSimple.setContentDescription(null);
                egm.b bVar3 = egmVar.m;
                vkImageSimple.setLayoutParams(egm.W(egmVar, (bVar3 != null ? bVar3 : null).i, 0, z ? 0 : cn70.b(8), 0, z ? cn70.b(6) : 0, 0, 42));
                egmVar.b.addView(vkImageSimple);
                break;
            case 11:
                vtm vtmVar = (vtm) obj;
                vtmVar.l.setVisibility(8);
                vtmVar.w.e(false);
                vtmVar.x.c(false);
                vtmVar.y.c(false);
                vtmVar.z.c(false);
                vtmVar.A.c(true);
                vtmVar.B.c(false);
                vtmVar.n.setVisibility(4);
                vtmVar.r.submitList(vtmVar.D.a);
                break;
            case 12:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) obj;
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                break;
            case 13:
                break;
            case 14:
                ((com.vk.photos.ui.editalbum.domain.c) obj).g.b(g.e.a);
                break;
            case 15:
                com.vk.im.ui.components.chat_profile.a aVar = ((b6p) obj).l;
                aVar.getClass();
                aVar.t(zxd0.j.a);
                break;
            case 16:
                float[] fArr = new float[8];
                Arrays.fill(fArr, 0, 8, ((xah0) obj).a * 4.0f);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                shapeDrawable.getPaint().setColor(e43.a.getColor(R.color.vk_black_alpha16));
                break;
            case 17:
                break;
            case 18:
                xti0 xti0Var = ((iar) obj).g;
                break;
            case 19:
                break;
            case 20:
                VkOnboardingComponent vkOnboardingComponent = (VkOnboardingComponent) ((k7m) m7m.f((bms) obj)).a(fpf0.a(VkOnboardingComponent.class));
                break;
            case 21:
                ((evs) obj).T(true);
                break;
            case 22:
                GlobalSearchFeatureCatalogRootVh globalSearchFeatureCatalogRootVh = (GlobalSearchFeatureCatalogRootVh) obj;
                break;
            case 23:
                invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21((HandleInvocationsFromAdViewer) obj);
                break;
            case 24:
                break;
            case 25:
                ImagePickerActivity imagePickerActivity = (ImagePickerActivity) obj;
                int i6 = ImagePickerActivity.p;
                imagePickerActivity.getClass();
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                if (intent.resolveActivity(imagePickerActivity.getPackageManager()) != null) {
                    qg90 i7 = vua0.i(false);
                    intent.putExtra("output", com.vk.core.files.a.N((File) i7.b));
                    imagePickerActivity.startActivityForResult(intent, ((Integer) i7.a).intValue());
                }
                break;
            case 26:
                L.A("IncomingCallNotifierInitializer", "decline");
                ((d.a) obj).c.invoke();
                break;
            case 27:
                break;
            case 28:
                int i8 = MarketEditAlbumCoverFragment.d0;
                ((MarketEditAlbumCoverFragment) obj).finish();
                break;
            default:
                Push push = (Push) obj;
                if (ine0.g(push)) {
                    ine0.p(push, null);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sfg(cyq cyqVar, xah0 xah0Var) {
        this.b = 16;
        this.c = xah0Var;
    }
}
