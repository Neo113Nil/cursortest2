package xsna;

import android.widget.EditText;
import android.widget.TextView;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsSheetState;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.AudioAttachListItem;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kc4 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kc4(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        AudioAttachListItem zb;
        Pair invoke$lambda$3;
        UIBlockBadge uIBlockBadge;
        float min;
        float f;
        int i = 10;
        int i2 = 0;
        switch (this.b) {
            case 0:
                com.vk.im.ui.components.attaches_history.attaches.model.audio.c cVar = (com.vk.im.ui.components.attaches_history.attaches.model.audio.c) obj2;
                List<AudioAttachListItem> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (AudioAttachListItem audioAttachListItem : list) {
                    int i3 = cVar instanceof c.a ? ((c.a) cVar).b : -1;
                    AttachAudio attachAudio = audioAttachListItem.b;
                    long j = attachAudio.f;
                    MusicTrack musicTrack = attachAudio.b;
                    if (j != cVar.a && musicTrack.b != i3) {
                        zb = AudioAttachListItem.zb(audioAttachListItem, null, AudioAttachListItem.State.EMPTY, 7);
                    } else if (cVar instanceof c.b) {
                        zb = AudioAttachListItem.zb(audioAttachListItem, null, AudioAttachListItem.State.EMPTY, 7);
                    } else if (cVar instanceof c.d) {
                        zb = AudioAttachListItem.zb(audioAttachListItem, null, AudioAttachListItem.State.PLAYING, 7);
                    } else if (cVar instanceof c.C1142c) {
                        zb = AudioAttachListItem.zb(audioAttachListItem, null, AudioAttachListItem.State.PAUSED, 7);
                    } else {
                        if (!(cVar instanceof c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MusicTrack musicTrack2 = ((c.a) cVar).c;
                        musicTrack.U = musicTrack2.U;
                        musicTrack.l = musicTrack2.l;
                        musicTrack.b = musicTrack2.b;
                        musicTrack.c = musicTrack2.c;
                        zb = AudioAttachListItem.zb(audioAttachListItem, attachAudio, null, 14);
                    }
                    arrayList.add(zb);
                }
                return arrayList;
            case 1:
                invoke$lambda$3 = CleanupDirectory.invoke$lambda$3((Pair) obj, (File) obj2);
                return invoke$lambda$3;
            case 2:
                UIBlock uIBlock = (UIBlock) obj2;
                if ((uIBlock instanceof UIBlockHeader) && (uIBlockBadge = ((UIBlockHeader) uIBlock).C) != null) {
                    CatalogBadge Qb = uIBlockBadge.Qb();
                    if (epx.f(Qb != null ? Qb.getType() : null, "prominent")) {
                        String text = Qb.getText();
                        bpn0 bpn0Var = cqm0.a;
                        try {
                            i2 = Integer.parseInt(text);
                        } catch (Throwable unused) {
                        }
                        int i4 = i2 - 1;
                        uIBlockBadge.Rb(i4 > 0 ? new CatalogBadge(String.valueOf(i4), Qb.getType()) : null);
                    }
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1952709621, intValue, -1, "com.vk.profile.core.scheduled_clips.ComposableSingletons$CommunityScheduledClipsGridViewKt.lambda$-1952709621.<anonymous> (CommunityScheduledClipsGridView.kt:121)");
                    }
                    rrv0.d(null, null, null, null, wdi.b, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                EditText editText = (EditText) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                editText.setInputType(8194);
                editText.addTextChangedListener(new v4l((TextView) obj2));
                return null;
            case 5:
                pco pcoVar = (pco) obj;
                pco pcoVar2 = (pco) obj2;
                MapBuilder mapBuilder = new MapBuilder();
                for (DeliveryPointsSheetState deliveryPointsSheetState : DeliveryPointsSheetState.h()) {
                    float f2 = pcoVar.b;
                    float f3 = pcoVar2.b;
                    int i5 = qyl.$EnumSwitchMapping$0[deliveryPointsSheetState.ordinal()];
                    if (i5 == 1) {
                        min = Math.min(0, f3);
                    } else if (i5 == 2) {
                        min = Math.min(190, f3);
                    } else if (i5 == 3) {
                        min = Math.min(268, f3);
                    } else {
                        if (i5 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = ((pco) jw5.v(new pco(0), new pco(f2 - f3))).b;
                        mapBuilder.put(deliveryPointsSheetState, new pco(f));
                    }
                    f = f2 - min;
                    mapBuilder.put(deliveryPointsSheetState, new pco(f));
                }
                return mapBuilder.h();
            case 6:
                ((Integer) obj).getClass();
                xgx0.a.getClass();
                xgx0.b((String) obj2);
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                cc70.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                isiVar.c = new fd1(i, isiVar.a(new oqd0(sj50Var)), isiVar.a(new rjl0(sj50Var)));
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(487445721);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(487445721, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:252)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.l1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
        }
    }

    public /* synthetic */ kc4(int i) {
        this.b = 7;
    }
}
