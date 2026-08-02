package xsna;

import android.content.Context;
import android.database.Cursor;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.appredirects.activity.BaseLinkRedirectActivity;
import com.vk.attachpicker.impl.fragment.AttachMediaFragment;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.f5h0;
import xsna.gnd;
import xsna.gte;
import xsna.yk8;
import xsna.zze;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ bz(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                xgx0 xgx0Var = xgx0.a;
                String th = ((Throwable) obj).toString();
                xgx0Var.getClass();
                xgx0.a(th);
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                int i = AttachMediaFragment.S;
                ((ikv0) obj).a();
                return s3q0.a;
            case 3:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 4:
                qgi0.r((tgi0) obj, "trackCover");
                return s3q0.a;
            case 5:
                int i2 = BaseLinkRedirectActivity.g;
                L.g("AppRedirectResolver", (Throwable) obj);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((BaseOkResponseDto) obj).i() == BaseOkResponseDto.OK.i());
            case 7:
                Throwable th2 = (Throwable) obj;
                h03.b(th2);
                L.i(th2);
                return s3q0.a;
            case 8:
                return gnd.a.c.a;
            case 9:
                return new JSONObject(((Cursor) obj).getString(0));
            case 10:
                return s3q0.a;
            case 11:
                return ((gte.a) obj).b;
            case 12:
                return Boolean.valueOf(((zze.a) obj).d);
            case 13:
                int i3 = d2h.p1;
                return ((pno0) obj).d().toString();
            case 14:
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
                List<GroupsGroupFullDto> e = groupsGetObjectExtendedResponseDto.e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                Iterator<T> it = e.iterator();
                while (it.hasNext()) {
                    arrayList.add(dqu.a((GroupsGroupFullDto) it.next()));
                }
                return new VKList(groupsGetObjectExtendedResponseDto.getCount(), arrayList);
            case 15:
                MusicTrack musicTrack = (MusicTrack) obj;
                Context context = e43.a;
                return fai.g(context != null ? context : null, musicTrack).toString();
            case 16:
                Object obj2 = nbj.a;
                g8 g8Var = new g8(17);
                return j5g.D0(new mbj(new lbj(g8Var), g8Var), (List) obj);
            case 17:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_call_with_video);
            case 18:
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof t480) {
                    Collection<adm> collection = ((t480) sxpVar).b;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        Iterator<T> it2 = collection.iterator();
                        while (it2.hasNext()) {
                            if (((adm) it2.next()).a == DialogsCounters.Type.BUSINESS_NOTIFY_UNREAD) {
                                z = true;
                                if (((sxpVar instanceof v480) || ((v480) sxpVar).c != DialogsFilter.BUSINESS_NOTIFY) && !z) {
                                    r3 = false;
                                }
                                return Boolean.valueOf(r3);
                            }
                        }
                    }
                }
                z = false;
                if (sxpVar instanceof v480) {
                }
                r3 = false;
                return Boolean.valueOf(r3);
            case 19:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap2.keySet();
                HashSet hashSet = new HashSet();
                Iterator it3 = keySet.iterator();
                while (it3.hasNext()) {
                    long longValue = ((Number) it3.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    hashSet.add(Peer.a.b(longValue));
                }
                return hashSet;
            case 20:
                qgi0.h((tgi0) obj, "");
                return s3q0.a;
            case 21:
                pno0 pno0Var = (pno0) obj;
                kpp kppVar = opp.T;
                return Boolean.valueOf(pno0Var.d().length() == 10 && !drm0.N(pno0Var.d()));
            case 22:
                return afq.b((ExternalNpsCondition) obj);
            case 23:
                kw8 kw8Var = (kw8) obj;
                return kw8Var.e(new zkh(yk8.a.a(new wow(ajq.b), Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) - (kw8Var.getDensity() * ajq.a), Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)), 8), 13));
            case 24:
                return s3q0.a;
            case 25:
                ojt ojtVar = (ojt) obj;
                ojtVar.l = f5h0.o.a;
                ojtVar.m = new PointF(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 26:
                L.e("Profile successfully added to recents");
                return s3q0.a;
            case 27:
                return s3q0.a;
            case 28:
                ((Integer) obj).getClass();
                return null;
            default:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return io.reactivex.rxjava3.core.x.k(EmptyList.b);
                }
                z0r0 z0r0Var = new z0r0(list, crx0.n);
                ahn.D(z0r0Var);
                return rsg0.w0(z0r0Var);
        }
    }

    public /* synthetic */ bz(dqu dquVar) {
        this.b = 14;
    }
}
