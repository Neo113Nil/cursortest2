package xsna;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.util.LruCache;
import com.google.gson.Gson;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetEventsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.favorites.impl.ui.folders.renaming.view.ClipsFolderNameFormField;
import com.vk.clips.interests.impl.feature.ClipsInterestsState;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.playlists.playlist_ui.model.PlaylistHeaderIconState;
import com.vk.debug.design.MockType;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONObject;
import xsna.cue;
import xsna.dob;
import xsna.knb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fj1 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ fj1(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        Map map;
        Map map2;
        switch (this.b) {
            case 0:
                return new Photo(new JSONObject(new Gson().toJson((PhotosPhotoDto) j5g.Y((List) obj))));
            case 1:
                return new bl2((RLottieDrawable) obj, 3);
            case 2:
                Throwable th = (Throwable) obj;
                L.i(th);
                h03.b(th);
                return s3q0.a;
            case 3:
                return ((bv7) obj).a;
            case 4:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    for (UIBlock uIBlock : Sb) {
                        if (uIBlock instanceof UIBlockList) {
                            ArrayList<UIBlock> Sb2 = ((UIBlockList) uIBlock).Sb();
                            if (Sb2 == null || !Sb2.isEmpty()) {
                                Iterator<T> it = Sb2.iterator();
                                while (it.hasNext()) {
                                    if (((UIBlock) it.next()).Cb() == CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS) {
                                        return Boolean.valueOf(r4);
                                    }
                                }
                            }
                        } else if (uIBlock.Cb() == CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS) {
                            return Boolean.valueOf(r4);
                        }
                    }
                }
                r4 = false;
                return Boolean.valueOf(r4);
            case 5:
                knb.c cVar = (knb.c) obj;
                return new dob.i(cVar.g, cVar.h);
            case 6:
                return Boolean.FALSE;
            case 7:
                int i = ClipsFolderNameFormField.p;
                return s3q0.a;
            case 8:
                return new ClipsInterestsViewState.a(0, ((ClipsInterestsState.a) obj).b);
            case 9:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 10:
                return PlaylistHeaderIconState.None;
            case 11:
                return cue.a.C2684a.a;
            case 12:
                b420 b420Var = (b420) obj;
                StringBuilder sb = new StringBuilder("@");
                Pattern pattern = n420.a;
                String str = b420Var.e;
                if (pattern.matcher(str).matches()) {
                    str = b420Var.b;
                }
                sb.append(str);
                return sb.toString();
            case 13:
                return Float.valueOf(((Float) obj).floatValue() / 100.0f);
            case 14:
                qgi0.r((tgi0) obj, "DescriptionTextFieldCaption");
                return s3q0.a;
            case 15:
                return ((GroupsGetAddressesResponseDto) obj).d();
            case 16:
                GroupsGetEventsResponseDto groupsGetEventsResponseDto = (GroupsGetEventsResponseDto) obj;
                List<GroupsGroupFullDto> d = groupsGetEventsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : d) {
                    UserId P0 = groupsGroupFullDto.P0();
                    String V1 = groupsGroupFullDto.V1();
                    if (V1 == null) {
                        V1 = "";
                    }
                    String y1 = groupsGroupFullDto.y1();
                    if (y1 == null) {
                        y1 = "";
                    }
                    arrayList.add(new f2h(P0, V1, y1));
                }
                return new s2h(arrayList, groupsGetEventsResponseDto.getCount());
            case 17:
                qgi0.r((tgi0) obj, "priority_block_content_list");
                return s3q0.a;
            case 18:
                return s3q0.a;
            case 19:
                List list = (List) obj;
                String str2 = (String) list.get(0);
                try {
                    failure = MockType.valueOf((String) list.get(1));
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                Object obj2 = MockType.TEXT;
                if (failure instanceof Result.Failure) {
                    failure = obj2;
                }
                MockType mockType = (MockType) failure;
                String str3 = (String) list.get(2);
                String str4 = (String) list.get(3);
                List<List> list2 = (List) list.get(4);
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (List list3 : list2) {
                    arrayList2.add(new rh90((String) list3.get(0), (String) list3.get(1)));
                }
                return new uu20(str2, mockType, str3, str4, new wow(arrayList2));
            case 20:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_show_attaches, (Context) obj);
            case 21:
                File file = (File) obj;
                String name = file.getName();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int e = on00.e(listFiles.length);
                    if (e < 16) {
                        e = 16;
                    }
                    map = new LinkedHashMap(e);
                    for (File file2 : listFiles) {
                        DialogBackground.Size.a aVar = DialogBackground.Size.Companion;
                        String name2 = file2.getName();
                        String k0 = drm0.k0(name2, BundleUtil.UNDERLINE_TAG, name2);
                        aVar.getClass();
                        map2 = DialogBackground.Size.values;
                        DialogBackground.Size size = (DialogBackground.Size) map2.get(k0.toLowerCase(Locale.ROOT));
                        if (size == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        Pair pair = new Pair(size, Uri.fromFile(file2));
                        map.put(pair.i(), pair.j());
                    }
                } else {
                    map = null;
                }
                if (map == null) {
                    map = jgp.b;
                }
                Uri uri = (Uri) rli0.n(rli0.t(new i5g(sam.e), new lbe(map, 14)));
                if (uri == null) {
                    return null;
                }
                String lastPathSegment = uri.getLastPathSegment();
                String j0 = lastPathSegment != null ? drm0.j0(lastPathSegment, BundleUtil.UNDERLINE_TAG, lastPathSegment) : null;
                return new fam(name, j0 != null ? j0 : "", uri, uri);
            case 22:
                DialogTheme dialogTheme = (DialogTheme) obj;
                LruCache<com.vk.im.engine.models.dialogs.c, DialogTheme> lruCache = mkm.a;
                mkm.a.put(dialogTheme.b, dialogTheme);
                return s3q0.a;
            case 23:
                return s3q0.a;
            case 24:
                ((vgg) obj).c();
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                L.f("GalleryChangeObserver", "Exception in GalleryChangeObserver", (Throwable) obj);
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 28:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            default:
                Location location = (Location) obj;
                return new klk(location.getLongitude(), location.getLatitude());
        }
    }
}
