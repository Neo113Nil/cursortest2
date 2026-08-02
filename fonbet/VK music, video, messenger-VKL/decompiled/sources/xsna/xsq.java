package xsna;

import android.graphics.Bitmap;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.audio.dto.AudioPhotoSizesDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.podcast.dto.PodcastCoverObjectDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetGroupInfoResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetByIdExtendedResponseDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.superApp.dto.SuperAppGetShowcasePageResponseDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog.mvi.block.video.impl.movies.detail.description.MovieDescriptionView$MovieDescriptionState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.SimpleStoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.api.dto.widgets.InvalidWidgetInfo;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionGridWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.n9n0;
import xsna.t7z;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xsq implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xsq(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [com.vk.superapp.ui.widgets.SuperAppWidget] */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.vk.superapp.ui.widgets.SuperAppWidget] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [com.vk.api.generated.podcast.dto.PodcastCoverObjectDto] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        int i;
        int i2;
        Object failure;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        AudioPhotoSizesDto.TypeDto typeDto;
        PodcastCoverObjectDto podcastCoverObjectDto = 0;
        podcastCoverObjectDto = 0;
        podcastCoverObjectDto = 0;
        int i3 = 0;
        int i4 = 1;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 2:
                return Boolean.TRUE;
            case 3:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 4:
                return new ad90(((JSONObject) obj).getJSONObject("response"));
            case 5:
                return s3q0.a;
            case 6:
                return new y6u.d.c((e6u) obj);
            case 7:
                qgi0.r((tgi0) obj, "PlaylistBackButton");
                return s3q0.a;
            case 8:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.o);
            case 9:
                edw.c = ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                return s3q0.a;
            case 12:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 13:
                pr00 pr00Var = (pr00) obj;
                return new c.e(pr00Var.a, pr00Var.d, pr00Var.c);
            case 14:
                SuperAppGetShowcasePageResponseDto superAppGetShowcasePageResponseDto = (SuperAppGetShowcasePageResponseDto) obj;
                k720 k720Var = k720.a;
                n9n0 n9n0Var = k720.R;
                if (n9n0Var != null) {
                    q9n0 q9n0Var = n9n0Var.a;
                    rbn0.a.getClass();
                    new ykg();
                    List<AppsAppMinDto> f = superAppGetShowcasePageResponseDto.f();
                    ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ykg.d((AppsAppMinDto) it.next()));
                    }
                    List<AppsAppDto> d = superAppGetShowcasePageResponseDto.d();
                    ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                    Iterator it2 = d.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(ykg.c((AppsAppDto) it2.next()));
                    }
                    ArrayList u0 = j5g.u0(arrayList2, arrayList);
                    int e = on00.e(c5g.u(u0, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                    Iterator it3 = u0.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        linkedHashMap.put(Long.valueOf(((WebApiApplication) next).b), next);
                    }
                    List<UsersUserFullDto> i5 = superAppGetShowcasePageResponseDto.i();
                    ArrayList arrayList3 = new ArrayList(c5g.u(i5, 10));
                    Iterator it4 = i5.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(ks20.l((UsersUserFullDto) it4.next()));
                    }
                    int e2 = on00.e(c5g.u(arrayList3, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        linkedHashMap2.put(Long.valueOf(((WebUserShortInfo) next2).b.b), next2);
                    }
                    WidgetObjects widgetObjects = new WidgetObjects(linkedHashMap, linkedHashMap2, jgp.b);
                    knx0 knx0Var = new knx0(widgetObjects);
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList(0);
                    for (SuperAppShowcaseItemDto superAppShowcaseItemDto : superAppGetShowcasePageResponseDto.e()) {
                        try {
                            failure = knx0Var.i(superAppShowcaseItemDto);
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (!(failure instanceof Result.Failure)) {
                            arrayList4.add((SuperAppWidget) failure);
                        }
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            arrayList5.add(new InvalidWidgetInfo(superAppShowcaseItemDto.g(), a, InvalidWidgetInfo.Source.SUPER_APP_GET));
                        }
                    }
                    EmptySet emptySet = EmptySet.b;
                    Integer g = superAppGetShowcasePageResponseDto.g();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj4 : arrayList4) {
                        SuperAppWidget superAppWidget = (SuperAppWidget) obj4;
                        LinkedHashSet linkedHashSet = k720.w;
                        if (linkedHashSet.contains(superAppWidget.d().b)) {
                            linkedHashSet.remove(superAppWidget.d().b);
                        } else {
                            arrayList6.add(obj4);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(arrayList6);
                    LinkedHashSet linkedHashSet2 = k720.x;
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj5 : linkedHashSet2) {
                        SuperAppWidget superAppWidget2 = (SuperAppWidget) obj5;
                        String str = superAppWidget2.d().b;
                        Iterator it6 = arrayList7.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i2 = -1;
                            } else if (epx.f(((SuperAppWidget) it6.next()).d().b, str)) {
                                i2 = i6;
                            } else {
                                i6++;
                            }
                        }
                        if (i2 >= 0) {
                            arrayList7.set(i2, superAppWidget2);
                        } else {
                            arrayList8.add(obj5);
                        }
                    }
                    LinkedHashSet linkedHashSet3 = k720.y;
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj6 : linkedHashSet3) {
                        ?? r12 = (SuperAppWidget) obj6;
                        if (k720.Q(r12.d().b, arrayList7) && (r12 instanceof enx0)) {
                            SuperAppShowcaseSectionGridWidget L = k720.L(arrayList7);
                            if (L != null) {
                                String str2 = L.j.b;
                                enx0 enx0Var = (enx0) r12;
                                LinkedHashMap linkedHashMap3 = k720.z;
                                HashSet hashSet = (HashSet) linkedHashMap3.get(str2);
                                if (hashSet != null) {
                                    hashSet.add(enx0Var);
                                } else {
                                    enx0[] enx0VarArr = new enx0[1];
                                    enx0VarArr[i3] = enx0Var;
                                    hashSet = izi0.d(enx0VarArr);
                                }
                                linkedHashMap3.put(str2, hashSet);
                            }
                        } else {
                            String str3 = r12.d().b;
                            Iterator it7 = arrayList7.iterator();
                            int i7 = i3;
                            while (true) {
                                if (!it7.hasNext()) {
                                    i = -1;
                                } else if (epx.f(((SuperAppWidget) it7.next()).d().b, str3)) {
                                    i = i7;
                                } else {
                                    i7++;
                                }
                            }
                            if (i >= 0) {
                                arrayList7.set(i, ((SuperAppWidget) arrayList7.get(i)).g(r12));
                            } else {
                                arrayList9.add(obj6);
                            }
                        }
                        i3 = 0;
                    }
                    LinkedHashMap linkedHashMap4 = k720.z;
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap4.entrySet()) {
                        String str4 = (String) entry.getKey();
                        HashSet hashSet2 = (HashSet) entry.getValue();
                        Iterator it8 = arrayList7.iterator();
                        int i8 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i8 = -1;
                            } else if (!epx.f(((SuperAppWidget) it8.next()).d().b, str4)) {
                                i8++;
                            }
                        }
                        if (i8 >= 0) {
                            Parcelable parcelable = (SuperAppWidget) arrayList7.get(i8);
                            if (parcelable instanceof ctx0) {
                                arrayList7.set(i8, ((ctx0) parcelable).a(p4g.q(hashSet2)));
                            }
                        } else {
                            linkedHashMap5.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList J = k720.J(arrayList7);
                    WidgetObjects widgetObjects2 = q9n0Var.d;
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList<SuperAppWidget> arrayList11 = q9n0Var.a;
                    ArrayList arrayList12 = new ArrayList(c5g.u(arrayList11, 10));
                    for (SuperAppWidget superAppWidget3 : arrayList11) {
                        Iterator it9 = J.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                obj3 = it9.next();
                                if (epx.f(((SuperAppWidget) obj3).d().b, superAppWidget3.d().b)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        SuperAppWidget superAppWidget4 = (SuperAppWidget) obj3;
                        arrayList12.add(Boolean.valueOf(superAppWidget4 == null ? arrayList10.add(superAppWidget3) : arrayList10.add(superAppWidget4)));
                    }
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it10 = J.iterator();
                    while (it10.hasNext()) {
                        Object next3 = it10.next();
                        SuperAppWidget superAppWidget5 = (SuperAppWidget) next3;
                        Iterator it11 = arrayList11.iterator();
                        while (true) {
                            if (it11.hasNext()) {
                                obj2 = it11.next();
                                if (epx.f(((SuperAppWidget) obj2).d().b, superAppWidget5.d().b)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            arrayList13.add(next3);
                        }
                    }
                    arrayList10.addAll(arrayList13);
                    if (arrayList10.size() > 1) {
                        g5g.L(arrayList10, new p9n0());
                    }
                    k720.X(new n9n0(k720.K(new q9n0(arrayList10, j5g.u0(arrayList5, q9n0Var.b), izi0.j(q9n0Var.c, emptySet), new WidgetObjects(pn00.n(widgetObjects2.b, widgetObjects.b), pn00.n(widgetObjects2.c, widgetObjects.c), pn00.n(widgetObjects2.d, widgetObjects.d)), q9n0Var.e, q9n0Var.f, q9n0Var.g, q9n0Var.h, g, q9n0Var.j, q9n0Var.k, q9n0Var.l)), n9n0.a.b.a));
                }
                return s3q0.a;
            case 15:
                MovieDescriptionView$MovieDescriptionState movieDescriptionView$MovieDescriptionState = (MovieDescriptionView$MovieDescriptionState) obj;
                return new MovieDescriptionView$MovieDescriptionState(movieDescriptionView$MovieDescriptionState.b, movieDescriptionView$MovieDescriptionState.c, movieDescriptionView$MovieDescriptionState.d, !movieDescriptionView$MovieDescriptionState.e);
            case 16:
                ArrayList arrayList14 = new ArrayList();
                for (Object obj7 : (List) obj) {
                    if (jnj.b(((Playlist) obj7).O)) {
                        arrayList14.add(obj7);
                    }
                }
                return arrayList14;
            case 17:
                return ((Bitmap) obj).copy(Bitmap.Config.ARGB_8888, true);
            case 18:
                m1b0 m1b0Var = (m1b0) obj;
                return new ytp(m1b0Var.c, m1b0Var.d, m1b0Var.e);
            case 19:
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("response");
                PodcastsGetGroupInfoResponseDto podcastsGetGroupInfoResponseDto = (PodcastsGetGroupInfoResponseDto) GsonHolder.a().fromJson(optJSONObject2 != null ? optJSONObject2.toString() : null, PodcastsGetGroupInfoResponseDto.class);
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("podcast_cover")) != null && (optJSONArray = optJSONObject.optJSONArray("sizes")) != null) {
                    ArrayList arrayList15 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    while (i3 < length) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i3);
                        String optString = jSONObject.optString("url");
                        int optInt = jSONObject.optInt("width");
                        int optInt2 = jSONObject.optInt("height");
                        String optString2 = jSONObject.optString("type");
                        if (optString2.length() <= 0) {
                            optString2 = null;
                        }
                        if (optString2 == null || (typeDto = AudioPhotoSizesDto.TypeDto.valueOf(optString2.toUpperCase(Locale.ROOT))) == null) {
                            typeDto = AudioPhotoSizesDto.TypeDto.A;
                        }
                        arrayList15.add(new AudioPhotoSizesDto(optString, optInt, optInt2, typeDto));
                        i3++;
                    }
                    new PodcastCoverObjectDto(podcastCoverObjectDto, i4, podcastCoverObjectDto);
                    podcastCoverObjectDto = new PodcastCoverObjectDto(arrayList15);
                }
                if (podcastCoverObjectDto == 0) {
                    podcastCoverObjectDto = podcastsGetGroupInfoResponseDto.l();
                }
                return PodcastsGetGroupInfoResponseDto.a(podcastsGetGroupInfoResponseDto, null, null, null, podcastCoverObjectDto, 61439);
            case 20:
                L.i((Throwable) obj);
                return s3q0.a;
            case 21:
                return ((PostingState.Editing) obj).o;
            case 22:
                qgi0.r((tgi0) obj, "community_rebooking_extra_subtitle");
                return s3q0.a;
            case 23:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? R.raw.thumbs_down_fill_to_outline_20 : R.raw.thumbs_down_outline_to_fill_20);
            case 24:
                return new t7z.c(((Integer) obj).intValue());
            case 25:
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                h03.b(th2);
                return s3q0.a;
            case 26:
                return kpl0.a((ukl0) obj);
            case 27:
                StoriesGetByIdExtendedResponseDto storiesGetByIdExtendedResponseDto = (StoriesGetByIdExtendedResponseDto) obj;
                new j2r0();
                LinkedHashMap b = j2r0.b(storiesGetByIdExtendedResponseDto.f());
                new dqu();
                LinkedHashMap b2 = dqu.b(storiesGetByIdExtendedResponseDto.d());
                LinkedHashMap a2 = b590.a(new b590(), null, storiesGetByIdExtendedResponseDto.f(), storiesGetByIdExtendedResponseDto.d(), 3);
                List<StoriesStoryDto> e3 = storiesGetByIdExtendedResponseDto.e();
                if (e3 == null) {
                    e3 = EmptyList.b;
                }
                List<StoriesStoryDto> list = e3;
                ArrayList arrayList16 = new ArrayList(c5g.u(list, 10));
                Iterator it12 = list.iterator();
                while (it12.hasNext()) {
                    arrayList16.add(ivl0.a((StoriesStoryDto) it12.next(), a2, b, b2));
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                Iterator it13 = arrayList16.iterator();
                while (it13.hasNext()) {
                    Object next4 = it13.next();
                    UserId userId = ((StoryEntry) next4).d;
                    Object obj8 = linkedHashMap6.get(userId);
                    if (obj8 == null) {
                        obj8 = new ArrayList();
                        linkedHashMap6.put(userId, obj8);
                    }
                    ((List) obj8).add(next4);
                }
                ArrayList arrayList17 = new ArrayList(linkedHashMap6.size());
                for (Map.Entry entry2 : linkedHashMap6.entrySet()) {
                    UserId userId2 = (UserId) entry2.getKey();
                    arrayList17.add(new SimpleStoriesContainer(fkq0.d(userId2) ? new StoryOwner.User((UserProfile) b.get(userId2), null, 2, null) : new StoryOwner.Community((Group) b2.get(fkq0.a(userId2)), null, 2, null), (List) entry2.getValue(), null, false, 12, null));
                }
                return new GetStoriesResponse(arrayList17, arrayList17.size());
            case 28:
                return s3q0.a;
            default:
                return (Integer) obj;
        }
    }

    public /* synthetic */ xsq(int i, hvy hvyVar) {
        this.b = 11;
    }

    public /* synthetic */ xsq(Object obj, int i) {
        this.b = i;
    }
}
