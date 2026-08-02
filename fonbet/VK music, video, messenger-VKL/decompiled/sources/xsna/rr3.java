package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityAnswer;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityPerson;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityVideoPlaylist;
import com.vk.catalog2.common.dto.api.search.SearchEntity;
import com.vk.catalog2.common.dto.api.style.SearchEntityCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.log.L;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.SuperAppShowcaseScrollWidget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;
import xsna.q4r;
import xsna.qvq;
import xsna.w060;
import xsna.wkh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rr3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        oap aVar;
        Object uIBlockSearchEntityPerson;
        VideoAlbum videoAlbum;
        Object obj2;
        List<String> list;
        int i;
        int i2;
        switch (this.b) {
            case 0:
                mtk0 mtk0Var = (mtk0) this.c;
                izs izsVar = (izs) this.e;
                mtk0 mtk0Var2 = (mtk0) this.d;
                List list2 = (List) mtk0Var.getValue();
                ((nvy) obj).e(list2.size(), null, new vr3(list2), new jai(802480018, new wr3(list2, izsVar, mtk0Var2), true));
                return s3q0.a;
            case 1:
                return new eae((fae) ((jod) this.c).a).a(((Integer) obj).intValue(), (UserId) this.d, (VideoStatistic) this.e);
            case 2:
                qvq.m.a aVar2 = (qvq.m.a) this.c;
                q4r.a aVar3 = (q4r.a) this.d;
                l2r l2rVar = (l2r) this.e;
                L.i((Throwable) obj);
                l2r.b(aVar3, aVar2, l2rVar, aVar2.b);
                return s3q0.a;
            case 3:
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                hyg0 hyg0Var = (hyg0) obj;
                qyg0 V0 = hyg0Var.V0("DELETE FROM playlists_to_tracks WHERE uid = ? AND music_track_id = ? AND playlist_id = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    V0.D3(3, str3);
                    V0.step();
                    int p = sv1.p(hyg0Var);
                    V0.close();
                    return Integer.valueOf(p);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 4:
                bi20 bi20Var = (bi20) this.c;
                List<UIBlockAction> list3 = bi20Var.l;
                Bundle bundle = bi20Var.p;
                CatalogExtendedData catalogExtendedData = (CatalogExtendedData) this.d;
                List list4 = (List) this.e;
                CatalogSearchEntityAnswer catalogSearchEntityAnswer = (CatalogSearchEntityAnswer) obj;
                CatalogSearchEntityAnswer.EntityType entityType = catalogSearchEntityAnswer.b;
                SearchEntity searchEntity = catalogSearchEntityAnswer.c;
                int i3 = w060.b.$EnumSwitchMapping$2[entityType.ordinal()];
                UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock = null;
                if (i3 == 1) {
                    CatalogSearchEntityPerson catalogSearchEntityPerson = searchEntity instanceof CatalogSearchEntityPerson ? (CatalogSearchEntityPerson) searchEntity : null;
                    if (catalogSearchEntityPerson == null) {
                        return null;
                    }
                    UserId userId = catalogSearchEntityPerson.c;
                    List<UserId> list5 = catalogSearchEntityPerson.j;
                    if (list5 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = list5.iterator();
                        while (it.hasNext()) {
                            UserProfile userProfile = catalogExtendedData.Gb((UserId) it.next()).a;
                            if (userProfile != null) {
                                arrayList2.add(userProfile);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    rba Gb = catalogExtendedData.Gb(userId);
                    Group group = Gb.b;
                    if (group != null) {
                        aVar = new oap.b(group);
                    } else {
                        UserProfile userProfile2 = Gb.a;
                        if (userProfile2 == null) {
                            return null;
                        }
                        aVar = new oap.a(userProfile2);
                    }
                    String string = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                    com.vk.catalog2.common.dto.api.ui.a aVar4 = new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, string != null ? new SearchEntityCatalogViewStyle(string, CatalogSearchEntityAnswer.EntityType.Person) : null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168);
                    List<UIBlockAction> list6 = list3;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list6) {
                        if (obj3 instanceof UIBlockActionFollow) {
                            arrayList3.add(obj3);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (epx.f(((UIBlockActionFollow) next).g, userId)) {
                                uIBlockActionPlayVideosFromBlock = next;
                            }
                        }
                    }
                    UIBlockActionFollow uIBlockActionFollow = (UIBlockActionFollow) uIBlockActionPlayVideosFromBlock;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list6) {
                        if (obj4 instanceof UIBlockActionPlayAudiosFromBlock) {
                            arrayList4.add(obj4);
                        }
                    }
                    uIBlockSearchEntityPerson = new UIBlockSearchEntityPerson(aVar4, catalogSearchEntityPerson, aVar, uIBlockActionFollow, arrayList, (UIBlockActionPlayAudiosFromBlock) j5g.a0(arrayList4));
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CatalogSearchEntityVideoPlaylist catalogSearchEntityVideoPlaylist = searchEntity instanceof CatalogSearchEntityVideoPlaylist ? (CatalogSearchEntityVideoPlaylist) searchEntity : null;
                    if (catalogSearchEntityVideoPlaylist == null) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(catalogSearchEntityVideoPlaylist.c.b);
                    sb.append('_');
                    sb.append(catalogSearchEntityVideoPlaylist.d);
                    String sb2 = sb.toString();
                    if (sb2 != null) {
                        videoAlbum = catalogExtendedData.i.get(sb2);
                    } else {
                        catalogExtendedData.getClass();
                        videoAlbum = null;
                    }
                    if (videoAlbum == null) {
                        return null;
                    }
                    String string2 = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                    SearchEntityCatalogViewStyle searchEntityCatalogViewStyle = string2 != null ? new SearchEntityCatalogViewStyle(string2, CatalogSearchEntityAnswer.EntityType.VideoPlaylist) : null;
                    List<UIBlockAction> list7 = list3;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : list7) {
                        if (obj5 instanceof UIBlockActionPlayVideosFromBlock) {
                            arrayList5.add(obj5);
                        }
                    }
                    UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock2 = (UIBlockActionPlayVideosFromBlock) j5g.a0(arrayList5);
                    if (uIBlockActionPlayVideosFromBlock2 != null) {
                        Iterator it3 = list4.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (epx.f(((CatalogBlock) obj2).b, uIBlockActionPlayVideosFromBlock2.B)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        CatalogBlock catalogBlock = (CatalogBlock) obj2;
                        if (catalogBlock == null) {
                            Iterator it4 = list4.iterator();
                            int i4 = 0;
                            while (true) {
                                if (!it4.hasNext()) {
                                    i4 = -1;
                                } else if (!epx.f(((CatalogBlock) it4.next()).b, bi20Var.a)) {
                                    i4++;
                                }
                            }
                            catalogBlock = (i4 == -1 || list4.size() <= (i = i4 + 1)) ? null : (((CatalogBlock) list4.get(i)).c != CatalogDataType.DATA_TYPE_NONE || list4.size() <= (i2 = i4 + 2)) ? (CatalogBlock) list4.get(i) : (CatalogBlock) list4.get(i2);
                        }
                        if (catalogBlock != null && (list = catalogBlock.m.c) != null) {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator<T> it5 = list.iterator();
                            while (it5.hasNext()) {
                                Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, (String) it5.next());
                                VideoFile videoFile = Ab instanceof VideoFile ? (VideoFile) Ab : null;
                                if (videoFile != null) {
                                    arrayList6.add(videoFile);
                                }
                            }
                            uIBlockActionPlayVideosFromBlock = uIBlockActionPlayVideosFromBlock2.Rb(arrayList6);
                        }
                    }
                    UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock3 = uIBlockActionPlayVideosFromBlock;
                    com.vk.catalog2.common.dto.api.ui.a aVar5 = new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, searchEntityCatalogViewStyle, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj6 : list7) {
                        if (obj6 instanceof UIBlockActionToggleAlbumSubscription) {
                            arrayList7.add(obj6);
                        }
                    }
                    uIBlockSearchEntityPerson = new UIBlockSearchEntityVideoPlaylist(aVar5, catalogSearchEntityVideoPlaylist, (UIBlockActionToggleAlbumSubscription) j5g.a0(arrayList7), uIBlockActionPlayVideosFromBlock3, videoAlbum);
                }
                return uIBlockSearchEntityPerson;
            case 5:
                wkh0.b bVar = (wkh0.b) this.c;
                Context context = (Context) this.d;
                UserId userId2 = (UserId) this.e;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj;
                if (bVar instanceof wkh0.b.a) {
                    return qVar;
                }
                if (bVar instanceof wkh0.b.C3939b) {
                    return t7i.a(qVar, context, context.getString(fkq0.b(userId2) ? R.string.clip_author_unsubscribe_done_group : R.string.clip_author_unsubscribe_done_profile), context.getString(R.string.clip_action_progress));
                }
                throw new NoWhenBranchMatchedException();
            default:
                SuperAppShowcaseScrollWidget.Payload payload = (SuperAppShowcaseScrollWidget.Payload) this.c;
                udn0 udn0Var = (udn0) this.d;
                vdn0 vdn0Var = (vdn0) this.e;
                View view = (View) obj;
                WebAction webAction = payload.d;
                if (webAction != null) {
                    udn0Var.p.b(view.getContext(), webAction, vdn0Var, null);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ rr3(izs izsVar, wh50 wh50Var, wh50 wh50Var2) {
        this.b = 0;
        this.c = wh50Var;
        this.e = izsVar;
        this.d = wh50Var2;
    }

    public /* synthetic */ rr3(w060 w060Var, bi20 bi20Var, CatalogExtendedData catalogExtendedData, List list) {
        this.b = 4;
        this.c = bi20Var;
        this.d = catalogExtendedData;
        this.e = list;
    }
}
