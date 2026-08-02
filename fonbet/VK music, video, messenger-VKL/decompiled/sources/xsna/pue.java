package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.PlaceholderState;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import com.vkontakte.android.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.huv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pue implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pue(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        List<ClickableSticker> a;
        switch (this.b) {
            case 0:
                return (ShortVideoGetPlaylistsResponseDto) obj;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1422346176, intValue, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontServicesPlaceholderKt.lambda$1422346176.<anonymous> (StorefrontServicesPlaceholder.kt:220)");
                    }
                    PlaceholderState placeholderState = PlaceholderState.Album;
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new dz(15);
                        aVar.R(x);
                    }
                    hol0.f(placeholderState, null, null, true, null, (izs) x, aVar, 199686, 22);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((zux) obj).b instanceof String);
            case 3:
                DialogActionsListView dialogActionsListView = (DialogActionsListView) obj;
                dialogActionsListView.setActionIconColor(e3m.f(R.attr.vk_ui_icon_accent_themed, dialogActionsListView.getContext()));
                return s3q0.a;
            case 4:
                Bitmap bitmap = (Bitmap) obj;
                List<nov> list = (List) obj2;
                Bitmap createBitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
                createBitmap.setHasAlpha(false);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(6);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((nov) it.next()).F0(canvas, true);
                }
                File s = com.vk.core.files.a.s();
                if (!kd7.m(createBitmap, s)) {
                    throw new IOException("ideas: failed to save story bitmap");
                }
                ArrayList arrayList = new ArrayList();
                for (nov novVar : list) {
                    if (aal0.h(novVar) && (a = aal0.a(novVar)) != null) {
                        arrayList.addAll(a);
                    }
                }
                return new huv.a(s, arrayList.isEmpty() ? null : new ClickableStickers(1080, 1920, arrayList));
            case 5:
                return new wk30((DialogTheme) obj, ((Boolean) obj2).booleanValue());
            case 6:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicPlaylist uIBlockMusicPlaylist = obj3 instanceof UIBlockMusicPlaylist ? (UIBlockMusicPlaylist) obj3 : null;
                if (uIBlockMusicPlaylist != null) {
                    return uIBlockMusicPlaylist.z;
                }
                return null;
            case 7:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(1679447454);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1679447454, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:157)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.u;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                Boolean bool = (Boolean) obj2;
                if (((VoipCallServiceBannerHandler.Restrict) obj) != VoipCallServiceBannerHandler.Restrict.NOT_RESTRICT && bool.booleanValue()) {
                    r4 = true;
                }
                return Boolean.valueOf(r4);
        }
    }

    public /* synthetic */ pue(huv huvVar) {
        this.b = 4;
    }
}
