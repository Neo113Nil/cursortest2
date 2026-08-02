package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ironsource.B5;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentPhotosDto;
import com.vk.api.generated.owners.dto.OwnersContentSectionItemDto;
import com.vk.api.generated.owners.dto.OwnersContentSectionItemNameDto;
import com.vk.api.generated.owners.dto.OwnersGetContentSectionsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetAnonUserInfoResponseDto;
import com.vk.clips.editor.voiceover.impl.ClipsEditorVoiceOverAudioRecorder;
import com.vk.core.view.components.cell.button.group.VkCellButtonGroupLayout;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.fve;
import xsna.ken;
import xsna.vre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class od3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ od3(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.view.View, android.view.ViewGroup, com.vk.core.view.components.cell.button.group.VkCellButtonGroupLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer f;
        List<PhotosPhotoDto> g;
        Image image;
        ExtendedCommunityProfile.Section.Type type;
        ?? r5 = 0;
        ArrayList arrayList = null;
        r5 = 0;
        switch (this.b) {
            case 0:
                xgl0 xgl0Var = (xgl0) obj;
                int d = xgl0Var.system().d() + 1;
                xgl0Var.system().c(d);
                xgl0Var.o().B(d);
                return s3q0.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                Throwable th = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.w, new Object[]{"Failed to get album owner info: ".concat(mnh0.A(th))});
                }
                return s3q0.a;
            case 3:
                Pair pair = (Pair) obj;
                StringBuilder sb = new StringBuilder();
                String str = (String) pair.i();
                if (str == null) {
                    str = "unknown";
                }
                sb.append(str);
                sb.append(B5.U);
                sb.append(((Number) pair.j()).intValue());
                return sb.toString();
            case 4:
                Context context = (Context) obj;
                ?? vkCellButtonGroupLayout = new VkCellButtonGroupLayout(context, null, 6);
                vkCellButtonGroupLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                for (int i = 0; i < 3; i++) {
                    VkGroupItem vkGroupItem = new VkGroupItem(context, null, 6);
                    vkGroupItem.setText("Button");
                    vkGroupItem.setOnClickListener(new o44(0));
                    vkCellButtonGroupLayout.addView(vkGroupItem, vkCellButtonGroupLayout.generateLayoutParams(null));
                }
                return vkCellButtonGroupLayout;
            case 5:
                return ((k7r) obj).getKey().e;
            case 6:
                qgi0.r((tgi0) obj, "checkout_form_field_clear_icon");
                return s3q0.a;
            case 7:
                return s3q0.a;
            case 8:
                qgi0.r((tgi0) obj, "COMMON_GRID_TOOLBAR_TITLE_TEST_TAG");
                return s3q0.a;
            case 9:
                lyd.a.e(Arrays.copyOf(new Object[]{"ClipsEditorVoiceoverDelegateImpl", "recorder state is = " + ((ClipsEditorVoiceOverAudioRecorder.State) obj)}, 2));
                return s3q0.a;
            case 10:
                ((TextView) obj).setTextSize(11.0f);
                return s3q0.a;
            case 11:
                int i2 = gne.j1;
                qgi0.r((tgi0) obj, "clips_not_interested_modal_card_tag");
                return s3q0.a;
            case 12:
                return ((vre.b) obj).o;
            case 13:
                fve.b bVar = (fve.b) obj;
                Integer num = bVar.g;
                return Boolean.valueOf(num != null && bVar.h < num.intValue());
            case 14:
                ((ikv0) obj).a();
                return s3q0.a;
            case 15:
                qgi0.r((tgi0) obj, "RemoveCoauthorsCancelButton");
                return s3q0.a;
            case 16:
                return Boolean.valueOf((boolean) ((((com.vk.photo.editor.features.colorgrading.a) obj).e == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : 0) ^ 1));
            case 17:
                pqg pqgVar = (pqg) obj;
                String str2 = pqgVar.b;
                StringBuilder sb2 = new StringBuilder();
                String str3 = pqgVar.b;
                sb2.append(str3.length());
                sb2.append(" / 4000");
                String sb3 = sb2.toString();
                int length = drm0.p0(str3).toString().length();
                return new x0h(str2, sb3, 1 <= length && length < 4001, pqgVar.c);
            case 18:
                return s3q0.a;
            case 19:
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentPhotosDto o = groupsGetContentForTabsResponseDto.o();
                if (o != null && (g = o.g()) != null) {
                    List<PhotosPhotoDto> list = g;
                    bpn0 bpn0Var = xfa0.a;
                    r5 = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r5.add(xfa0.a((PhotosPhotoDto) it.next()));
                    }
                }
                if (r5 == 0) {
                    r5 = EmptyList.b;
                }
                VKList vKList = new VKList((Collection) r5);
                GroupsTabContentPhotosDto o2 = groupsGetContentForTabsResponseDto.o();
                if (o2 != null && (f = o2.f()) != null) {
                    r7 = f.intValue();
                }
                vKList.o(r7);
                return vKList;
            case 20:
                qgi0.r((tgi0) obj, "test_tag_description");
                return s3q0.a;
            case 21:
                List<OwnersContentSectionItemDto> d2 = ((OwnersGetContentSectionsResponseDto) obj).d();
                if (d2 == null) {
                    return null;
                }
                List<OwnersContentSectionItemDto> list2 = d2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (OwnersContentSectionItemDto ownersContentSectionItemDto : list2) {
                    List<BaseImageDto> d3 = ownersContentSectionItemDto.d();
                    if (d3 != null) {
                        List<BaseImageDto> list3 = d3;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                        for (BaseImageDto baseImageDto : list3) {
                            arrayList3.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                        }
                        image = new Image(arrayList3);
                    } else {
                        image = null;
                    }
                    OwnersContentSectionItemNameDto e = ownersContentSectionItemDto.e();
                    switch (e == null ? -1 : h1i.$EnumSwitchMapping$0[e.ordinal()]) {
                        case 1:
                            type = ExtendedCommunityProfile.Section.Type.Photos;
                            break;
                        case 2:
                            type = ExtendedCommunityProfile.Section.Type.Music;
                            break;
                        case 3:
                            type = ExtendedCommunityProfile.Section.Type.Chats;
                            break;
                        case 4:
                            type = ExtendedCommunityProfile.Section.Type.Events;
                            break;
                        case 5:
                            type = ExtendedCommunityProfile.Section.Type.Files;
                            break;
                        case 6:
                            type = ExtendedCommunityProfile.Section.Type.Discussions;
                            break;
                        case 7:
                            type = ExtendedCommunityProfile.Section.Type.Articles;
                            break;
                        case 8:
                            type = ExtendedCommunityProfile.Section.Type.Narratives;
                            break;
                        case 9:
                            type = ExtendedCommunityProfile.Section.Type.Products;
                            break;
                        case 10:
                            type = ExtendedCommunityProfile.Section.Type.Services;
                            break;
                        case 11:
                            type = ExtendedCommunityProfile.Section.Type.Podcasts;
                            break;
                        default:
                            type = ExtendedCommunityProfile.Section.Type.Channel;
                            break;
                    }
                    arrayList2.add(new ExtendedCommunityProfile.Section(image, type));
                }
                return arrayList2;
            case 22:
                return Boolean.valueOf(((gdj) obj).i);
            case 23:
                tdu tduVar = (tdu) obj;
                tduVar.n(tduVar.I0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                return s3q0.a;
            case 24:
                List<BaseImageDto> d4 = ((ShortVideoGetAnonUserInfoResponseDto) obj).d();
                if (d4 != null) {
                    List<BaseImageDto> list4 = d4;
                    arrayList = new ArrayList(c5g.u(list4, 10));
                    for (BaseImageDto baseImageDto2 : list4) {
                        arrayList.add(new ImageSize(baseImageDto2.getUrl(), baseImageDto2.getWidth(), baseImageDto2.getHeight(), baseImageDto2.e(), (char) 0, false, 48, null));
                    }
                }
                return new Image(arrayList);
            case 25:
                return ((x960) obj).a();
            case 26:
                return ken.a.c.a;
            case 27:
                return new b0l0(((b0l0) obj).a());
            case 28:
                return new tfu(n34.a(((ery) obj).a()));
            default:
                h.a aVar = ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h) obj).b;
                return Boolean.valueOf((aVar instanceof h.a.C1897a) && ((h.a.C1897a) aVar).a);
        }
    }

    public /* synthetic */ od3(Object obj, int i) {
        this.b = i;
    }
}
