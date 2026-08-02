package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.aue;
import xsna.cce;
import xsna.kte;
import xsna.ogb;
import xsna.wgb;
import xsna.wve;
import xsna.ybe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ci7 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ci7(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        String str;
        UserId userId;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                return xwk.d().a().m((CharSequence) obj);
            case 1:
                Throwable th = (Throwable) obj;
                int i = BonusCatalogFragment.f0;
                com.vk.metrics.eventtracking.b.a.a(th);
                h03.b(th);
                return s3q0.a;
            case 2:
                return new qi8((ViewGroup) obj);
            case 3:
                L.f("DebugMenuFeature", "test options error", (Throwable) obj);
                return s3q0.a;
            case 4:
                L.i((Throwable) obj);
                return s3q0.a;
            case 5:
                Throwable th2 = (Throwable) obj;
                if ((th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == 100) {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("MessageHistoryLoader api error", th2));
                    r6 = false;
                }
                return Boolean.valueOf(r6);
            case 6:
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (obj3 instanceof MsgFromChannel) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 7:
                wgb.b bVar = (wgb.b) obj;
                qfb qfbVar = bVar.a;
                List<dcf0> list2 = bVar.c;
                List O0 = j5g.O0(qfbVar);
                qfb qfbVar2 = bVar.a;
                LinkedHashMap linkedHashMap = qfbVar2.g;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    MsgFromChannel msgFromChannel = value instanceof MsgFromChannel ? (MsgFromChannel) value : null;
                    if (msgFromChannel == null) {
                        throw new IllegalStateException("ChannelsListLoader must provide only MsgFromChannel type messages");
                    }
                    linkedHashMap2.put(key, msgFromChannel);
                }
                ProfilesInfo profilesInfo = bVar.b;
                if (list2 == null || (list = j5g.O0(list2)) == null) {
                    list = EmptyList.b;
                }
                return new ogb.a(O0, linkedHashMap2, profilesInfo, list, bVar.d, qfbVar2.b || qfbVar2.c || list2 == null, bVar.g);
            case 8:
                Iterator it = ((List) obj).iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int i2 = ((cyo) next).c;
                    do {
                        Object next2 = it.next();
                        int i3 = ((cyo) next2).c;
                        if (i2 > i3) {
                            next = next2;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
                return ((cyo) next).a;
            case 9:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 10:
                return air.b('\'', "'", (String) obj);
            case 11:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 12:
                return s3q0.a;
            case 13:
                ybe.a aVar = (ybe.a) obj;
                List<zg5> list3 = aVar.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (zg5 zg5Var : list3) {
                    arrayList2.add(new cce.g.a(zg5Var.b, zg5Var.c));
                }
                return new cce.g(arrayList2, aVar.f);
            case 14:
                aue.b bVar2 = (aue.b) obj;
                kte kteVar = bVar2.e;
                boolean z = bVar2.h;
                Object obj4 = kteVar.a;
                UserId userId2 = kteVar.b;
                if (!(obj4 instanceof kte.c)) {
                    throw new IllegalStateException("You must provide full models to ui");
                }
                r6 = ((kte.c) obj4).b.size() > 1;
                Iterable<kte.a> iterable = (Iterable) obj4;
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next3 = it2.next();
                        if (epx.f(((kte.a) next3).a, userId2)) {
                            obj2 = next3;
                        }
                    }
                }
                kte.a aVar2 = (kte.a) obj2;
                wve.a aVar3 = aVar2 != null ? new wve.a(aVar2.a, aVar2.b, aVar2.c) : new wve.a(userId2, "", "");
                ArrayList arrayList3 = new ArrayList(c5g.u(iterable, 10));
                for (kte.a aVar4 : iterable) {
                    arrayList3.add(new wve.a(aVar4.a, aVar4.b, aVar4.c));
                }
                return new wve(r6, aVar3, arrayList3, z);
            case 15:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(0, 100, 1)));
            case 16:
                L.i((Throwable) obj);
                return s3q0.a;
            case 17:
                vwh vwhVar = (vwh) obj;
                Map<UserId, big0> map = vwhVar.k;
                yig0 yig0Var = vwhVar.j;
                big0 big0Var = map.get(yig0Var.c);
                UserId userId3 = yig0Var.c;
                if (big0Var == null || (userId = big0Var.a) == null || !fkq0.c(userId) || (str = big0Var.d) == null) {
                    str = "";
                }
                String str2 = big0Var != null ? big0Var.f : null;
                return new o4g0(userId3, vwhVar.r != null, str, str2 != null ? str2 : "");
            case 18:
                ((uzh0) obj).i();
                return s3q0.a;
            case 19:
                LinkedHashMap linkedHashMap3 = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_notifications_disable);
            case 20:
                return Optional.of((GroupsGetByIdObjectResponseDto) obj);
            case 21:
                return drm0.p0((String) obj).toString().toLowerCase(Locale.getDefault());
            case 22:
                h7d h7dVar = (h7d) obj;
                List<VideoFile> list4 = h7dVar.a;
                ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(k15.B((VideoFile) it3.next()));
                }
                h4r h4rVar = new h4r("video.get", PaginationKey.Initial.b, arrayList4.size(), false);
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    SdkVideoFile sdkVideoFile = (SdkVideoFile) it4.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append(sdkVideoFile.I0());
                    sb.append('_');
                    sb.append(sdkVideoFile.o0());
                    arrayList5.add(sb.toString());
                }
                h4rVar.i("videos", arrayList5);
                h4rVar.g(1, "extended");
                ahn.D(h4rVar);
                int i4 = 19;
                return rsg0.W(h4rVar, 7).l(new e4r(g4r.b, 0)).l(new q7(new ht(26), i4)).l(new o7(new i4h(h7dVar, i4), 14));
            case 23:
                int i5 = FriendsFragment.q0;
                return Integer.valueOf(((aus) obj).a);
            case 24:
                return ((jnt) obj).d;
            case 25:
                return ext.F0((JSONObject) obj);
            case 26:
                return new s6u(R.layout.market_loading_item, (ViewGroup) obj);
            case 27:
                return (kiu) ((it80) obj).a;
            default:
                int i6 = HighlightEditFragment.h0;
                qgi0.r((tgi0) obj, "edit_done_button");
                return s3q0.a;
        }
    }

    public /* synthetic */ ci7(Object obj, int i) {
        this.b = i;
    }
}
