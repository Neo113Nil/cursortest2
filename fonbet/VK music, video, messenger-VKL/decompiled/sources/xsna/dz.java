package xsna;

import android.content.Context;
import android.database.Cursor;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.Peer;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.superapp.multiaccount.api.SimpleDate;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.kyj;
import xsna.ty4;
import xsna.zze;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ dz(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                zex0 zex0Var = e370.q;
                if (zex0Var != null) {
                    zex0Var.c();
                }
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((zaa0) obj).a == -185);
            case 2:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 3:
                ty4.a aVar = (ty4.a) obj;
                return Boolean.valueOf(aVar.a != aVar.b.d.a);
            case 4:
                return Boolean.valueOf(((BaseOkResponseDto) obj).i() == BaseOkResponseDto.OK.i());
            case 5:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, null, null, null, true, 7);
            case 6:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -257, 7);
            case 7:
                pqc.d.compareAndSet(true, false);
                return s3q0.a;
            case 8:
                L.e("ClipItemUtils: Original file ".concat(((Boolean) obj).booleanValue() ? "deleted" : "not deleted"));
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr = ClipVideoFileAdapter.B;
                List<ClipsDraftablePlaylist> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (ClipsDraftablePlaylist clipsDraftablePlaylist : list) {
                    arrayList.add(new SdkClipsDraftablePlaylist(clipsDraftablePlaylist.b, clipsDraftablePlaylist.c, clipsDraftablePlaylist.d, clipsDraftablePlaylist.e));
                }
                return arrayList;
            case 10:
                return fnd.c();
            case 11:
                return new JSONObject(((Cursor) obj).getString(0));
            case 12:
                return tq.h(tlo0.Companion, R.string.clips_playlist_naming_hint);
            case 13:
                long j = ((zze.a) obj).e;
                return Float.valueOf(j == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : r1.c / j);
            case 14:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "playlist_explicit_icon");
                rgi0.a(tgi0Var);
                return s3q0.a;
            case 15:
                return s3q0.a;
            case 16:
                return new z0j((ViewGroup) obj);
            case 17:
                return ((qtd0) obj).La();
            case 18:
                kyj kyjVar = (kyj) obj;
                if (kyjVar instanceof kyj.b) {
                    return fpf0.a(kyj.b.class);
                }
                if (kyjVar instanceof kyj.a) {
                    return fpf0.a(kyj.a.class);
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_dialog_option_open_my_profile);
            case 20:
                return String.valueOf(((Dialog) obj).Sb().longValue());
            case 21:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap2.keySet();
                HashSet hashSet = new HashSet();
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    hashSet.add(Peer.a.b(longValue));
                }
                return hashSet;
            case 22:
                return s3q0.a;
            case 23:
                cvk.u(R.string.audio_book_network_error, false);
                return s3q0.a;
            case 24:
                qgi0.r((tgi0) obj, "clip_edit_title");
                return s3q0.a;
            case 25:
                kpp kppVar = opp.T;
                SimpleDate.b bVar = SimpleDate.e;
                return SimpleDate.b.a(((pno0) obj).d().toString());
            case 26:
                return afq.b((ExternalNpsCondition) obj);
            case 27:
                L.g("Can't mark faves as seen ", (Throwable) obj);
                return s3q0.a;
            case 28:
                return s3q0.a;
            default:
                List list2 = (List) obj;
                int i = FriendsImportFragment.a0;
                r6m.a.getClass();
                String str = "";
                try {
                    String line1Number = r6m.g().getLine1Number();
                    if (line1Number != null) {
                        str = line1Number;
                    }
                } catch (Exception unused) {
                }
                return new FriendsImportFragment.c(str, list2);
        }
    }

    public /* synthetic */ dz(Object obj, int i) {
        this.b = i;
    }
}
