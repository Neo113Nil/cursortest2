package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetActivitiesResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetActivitiesResponseItemDto;
import com.vk.api.generated.questions.dto.QuestionsDeleteFromAuthorResponseDto;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMyShelfPlayable;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.log.L;
import com.vk.profile.questions.impl.d;
import com.vk.stickers.api.models.photo.PhotoStickerStyle;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.c1x0;
import xsna.gm50;
import xsna.hn90;
import xsna.jav;
import xsna.tba0;
import xsna.w9i0;
import xsna.z0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qm90 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qm90(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        List list;
        List<CatalogBlock> list2;
        int i = this.b;
        int i2 = 10;
        int i3 = 27;
        Object obj2 = null;
        int i4 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((rm90) obj4).l.a(new hn90.c(((jn90) obj3).b));
                return s3q0.a;
            case 1:
                ((izs) obj4).invoke(((tba0.b) ((bca0) obj3).m).a);
                return s3q0.a;
            case 2:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) obj4;
                Intent intent = (Intent) obj;
                int i5 = PhotoVideoAttachActivity.g0;
                photoVideoAttachActivity.getClass();
                intent.putExtra(X3.i.b, (String) obj3);
                intent.putExtra("thumb_uid", photoVideoAttachActivity.B);
                String str2 = photoVideoAttachActivity.D;
                if (str2 != null) {
                    intent.putExtra("username", str2);
                }
                return s3q0.a;
            case 3:
                return new UIBlockMyShelfPlayable(((bi20) obj4).b(), (CatalogButtonOpenUrl) obj3, (MusicTrack) obj, null, 8, null);
            case 4:
                lj70 lj70Var = (lj70) obj4;
                ReactionSet reactionSet = (ReactionSet) obj3;
                NewsfeedGetActivitiesResponseDto newsfeedGetActivitiesResponseDto = (NewsfeedGetActivitiesResponseDto) obj;
                List<NewsfeedGetActivitiesResponseItemDto> d = newsfeedGetActivitiesResponseDto.d();
                int e = on00.e(c5g.u(d, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (NewsfeedGetActivitiesResponseItemDto newsfeedGetActivitiesResponseItemDto : d) {
                    Pair pair = new Pair(Long.valueOf(newsfeedGetActivitiesResponseItemDto.q().b), Integer.valueOf(newsfeedGetActivitiesResponseItemDto.getId()));
                    zj60 zj60Var = (zj60) lj70Var.a;
                    Pair pair2 = new Pair(pair, zj60Var.a.a(newsfeedGetActivitiesResponseItemDto.d(), reactionSet, b590.a(zj60Var.b, newsfeedGetActivitiesResponseDto.e(), null, null, 14), true));
                    linkedHashMap.put(pair2.i(), pair2.j());
                }
                return p4g.h(linkedHashMap);
            case 5:
                Context context = (Context) obj3;
                Throwable th = (Throwable) obj;
                ((Post) obj4).l.Ab(1073741824L, true);
                iuc0 iuc0Var = iuc0.b;
                if (!((o2i) iuc0.h.getValue()).d(th, true)) {
                    j03.j(context, th);
                }
                return s3q0.a;
            case 6:
                com.vk.profile.questions.impl.h hVar = (com.vk.profile.questions.impl.h) obj4;
                com.vk.profile.questions.impl.d dVar = (com.vk.profile.questions.impl.d) obj3;
                QuestionsDeleteFromAuthorResponseDto questionsDeleteFromAuthorResponseDto = (QuestionsDeleteFromAuthorResponseDto) obj;
                int id = dVar.b().getId();
                d.b bVar = new d.b(dVar.b(), dVar.a(), true);
                ArrayList arrayList = hVar.h;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                    } else if (((com.vk.profile.questions.impl.d) it.next()).b().getId() != id) {
                        i4++;
                    }
                }
                if (i4 >= 0) {
                    arrayList.set(i4, bVar);
                    hVar.i -= questionsDeleteFromAuthorResponseDto.getCount();
                    s3q0 s3q0Var = s3q0.a;
                    hVar.u7();
                }
                g5g.D(arrayList, true, new px30(dVar, i3));
                hVar.u7();
                return s3q0.a;
            case 7:
                r9i0 r9i0Var = (r9i0) obj4;
                ixi0 ixi0Var = (ixi0) obj3;
                w9i0.c cVar = (w9i0.c) obj;
                int i6 = r9i0.j1;
                gm50.a.a(r9i0Var, cVar.a, new e810(ixi0Var, 25));
                gm50.a.a(r9i0Var, cVar.b, new n3b0(ixi0Var, 9));
                gm50.a.a(r9i0Var, cVar.c, new q9i0(ixi0Var, i4));
                ixi0Var.a(null);
                return s3q0.a;
            case 8:
                dm0 dm0Var = (dm0) obj4;
                Context context2 = (Context) obj3;
                MultipickerProduct multipickerProduct = (MultipickerProduct) j5g.a0((List) obj);
                if (multipickerProduct != null && (str = i740.a(multipickerProduct).K) != null) {
                    io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new u20(str), null, null, 3);
                    asu0 asu0Var = asu0.a;
                    asu0Var.getClass();
                    y0.r0(asu0.r()).a0(asu0Var.d()).subscribe(new pmu(new tn0(i3, dm0Var, context2), 18), new jsb0(new juz(28), i2));
                }
                return s3q0.a;
            case 9:
                RequestUserProfile requestUserProfile = (RequestUserProfile) obj4;
                iii0 iii0Var = (iii0) obj3;
                if (((BaseBoolIntDto) obj) == BaseBoolIntDto.YES) {
                    requestUserProfile.q0 = true;
                    rfz.b(iii0Var.a, ne7.s(requestUserProfile), jav.d.a, null, 4);
                    cvk.u(R.string.report_sent, false);
                } else {
                    cvk.u(R.string.report_sent_error, false);
                }
                return s3q0.a;
            case 10:
                nf9.j(StoryPublishEvent.GALLERY_FILES_COUNTED, null, null, null, new nn4((JSONObject) obj, (String) obj4, (String) obj3, 6), 30);
                return s3q0.a;
            case 11:
                as80 as80Var = (as80) obj4;
                as80Var.a.d = false;
                ((ctl0) obj3).b.e(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, as80Var);
                L.i((Throwable) obj);
                return s3q0.a;
            case 12:
                PhotoStickerStyle.Companion.getClass();
                list = PhotoStickerStyle.patterns;
                c8m0 c8m0Var = new c8m0((Bitmap) obj, (PhotoStickerStyle) j5g.Y(list), true, true);
                c8m0Var.n = ((Uri) obj3).toString();
                ((e8m0) obj4).c.f(c8m0Var);
                return s3q0.a;
            case 13:
                b2r0 b2r0Var = (b2r0) obj4;
                Collection<UserStorageModel> collection = (Collection) obj3;
                SQLiteStatement g = ((e0w) obj).g("\n            REPLACE INTO users(\n                id, contact_id, domain, sex, avatar, blocked, blocked_by_me, deactivated, verified,\n                online_type, online_last_seen, online_app_id,\n                first_name_nom, last_name_nom, first_name_acc, last_name_acc, first_name_gen, last_name_gen, first_name_dat, last_name_dat,\n                can_call, is_service, is_service_account, friend_status, mobile_phone, is_closed, can_access_closed, can_be_invited_to_chats,\n                sync_time_overall, sync_time_online,\n                image_status, country, city, occupation_type, occupation_name,\n                birthday_day, birthday_month, birthday_year, can_send_friend_request, avatar_is_nft, \n                is_oauth_verified, social_button_type, can_write_private_message,is_adult)\n            VALUES(\n                ?,?,?,?,?,?,?,?,?,\n                ?,?,?,\n                ?,?,?,?,?,?,?,?,\n                ?,?,?,?,?,?,?,?,\n                ?,?,\n                ?,?,?,?,?,\n                ?,?,?,?,?,\n                ?,?,?,?)\n            ");
                try {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        ehq0.a(g, (UserStorageModel) it2.next());
                        g.executeInsert();
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    g.close();
                    b2r0Var.b.I0().v().d(collection);
                    return s3q0.a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ro.e(g, th2);
                        throw th3;
                    }
                }
            case 14:
                est0 est0Var = (est0) obj4;
                String str3 = (String) obj3;
                hda hdaVar = (hda) obj;
                Object obj5 = hdaVar.a;
                CatalogExtendedData catalogExtendedData = hdaVar.b;
                CatalogSection catalogSection = obj5 instanceof CatalogSection ? (CatalogSection) obj5 : null;
                if (catalogSection != null && (list2 = catalogSection.i) != null) {
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            CatalogBlock catalogBlock = (CatalogBlock) next;
                            if (catalogBlock.c == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS && catalogBlock.i.b != CatalogViewType.INVISIBLE) {
                                obj2 = next;
                            }
                        }
                    }
                    CatalogBlock catalogBlock2 = (CatalogBlock) obj2;
                    if (catalogBlock2 != null) {
                        LinkedHashMap z0 = est0.z0(catalogBlock2, catalogExtendedData);
                        catalogExtendedData.zb(new CatalogExtendedData(null, null, null, z0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, 7, null));
                        List<? extends VideoFile> O0 = j5g.O0(z0.values());
                        if (str3 != null) {
                            rmk0 rmk0Var = new rmk0(2);
                            rmk0Var.b(est0Var.F.toArray(new VideoFile[0]));
                            rmk0Var.b(O0.toArray(new VideoFile[0]));
                            ArrayList<Object> arrayList2 = rmk0Var.a;
                            O0 = e43.l(arrayList2.toArray(new VideoFile[arrayList2.size()]));
                        }
                        est0Var.F = O0;
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            default:
                u6x0 u6x0Var = (u6x0) obj;
                return ((w0x0) obj4).k ? new z0x0.b.C4149b(String.valueOf(u6x0Var.b.size() + ((c1x0.a) ((c1x0) obj3)).b.size()), u6x0Var.b, u6x0Var.c) : new z0x0.b.C4149b((String) u6x0Var.a, u6x0Var.b, u6x0Var.c);
        }
    }
}
