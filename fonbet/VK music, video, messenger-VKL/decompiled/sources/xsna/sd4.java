package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsCheckParticipantNameResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.utils.newtork.d;
import com.vk.dto.messages.MsgIdType;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.feed.design.view.newsfeed.digest.header.FeedDigestHeader;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.geo.impl.presentation.i;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import xsna.fve;
import xsna.j7u;
import xsna.jge;
import xsna.tj50;
import xsna.vre;
import xsna.xd4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd4 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ sd4(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new xd4.a(((tj50.a) obj).a(new z13(r4), ao8.d));
            case 1:
                return s3q0.a;
            case 2:
                int i = BlacklistFragment.V;
                qgi0.r((tgi0) obj, "BLACKLIST_TOOLBAR_TEST_TAG");
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((CallsCheckParticipantNameResponseDto) obj).d());
            case 4:
                return Boolean.valueOf(((com.vk.core.utils.newtork.d) obj) instanceof d.a);
            case 5:
                return Long.valueOf(((bdb) obj).b);
            case 6:
                return String.valueOf(((Msg) obj).d);
            case 7:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? R.raw.thumbs_down_fill_to_outline_20 : R.raw.thumbs_down_outline_to_fill_20);
            case 8:
                return ((e0d) obj).b;
            case 9:
                AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.CLIP_REPOST);
                aggregateEventBuilder.w(0, "Processing the clip took more than 1 minute.");
                aggregateEventBuilder.q();
                return s3q0.a;
            case 10:
                ohe oheVar = (ohe) obj;
                Set S0 = j5g.S0(oheVar.b);
                List<jge.a> list = oheVar.a;
                List D0 = j5g.D0(new nw5(S0, r4), list);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (S0.contains(((jge.a) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g5g.y(((jge.a) it.next()).d, arrayList2);
                }
                return new Triple(D0, arrayList2, S0);
            case 11:
                return ((vre.b) obj).l;
            case 12:
                return Boolean.valueOf(((fve.b) obj).b);
            case 13:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 14:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(0, 100, 1), new k9x(-1, 1, 1)));
            case 15:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    Context context = e43.a;
                    j03.i(context != null ? context : null, (VKApiExecutionException) th);
                }
                return s3q0.a;
            case 16:
                qgi0.r((tgi0) obj, "communities_catalog_top_bar_back_icon");
                return s3q0.a;
            case 17:
                qgi0.h((tgi0) obj, "");
                return s3q0.a;
            case 18:
                qgi0.r((tgi0) obj, "test_tag_icon");
                return s3q0.a;
            case 19:
                int a = ((ery) obj).a() / 3;
                Integer valueOf = a > 0 ? Integer.valueOf(a) : null;
                return new tfu(n34.a(valueOf != null ? valueOf.intValue() : 1));
            case 20:
                h.a aVar = ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h) obj).b;
                h.a.b bVar = aVar instanceof h.a.b ? (h.a.b) aVar : null;
                if (bVar != null) {
                    return bVar.a;
                }
                return null;
            case 21:
                int i2 = FeedDigestHeader.n;
                return s3q0.a;
            case 22:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new cwl(tf3.b(viewGroup, R.layout.vkim_folder_delimiter_vh, viewGroup, false));
            case 23:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 24:
                com.vk.geo.impl.presentation.i iVar = (com.vk.geo.impl.presentation.i) obj;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                if (!(iVar instanceof i.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType = L.LogType.d;
                    ((i.a) iVar).getClass();
                    L.u(l, logType, new Object[]{"Unknown error: null"});
                }
                return s3q0.a;
            case 25:
                return new j7u.a(((tj50.a) obj).a(new amp(6), ao8.d));
            case 26:
                return GroupCallViewModel.p;
            case 27:
                L.i((Throwable) obj);
                return s3q0.a;
            case 28:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.i);
            default:
                i34 i34Var = (i34) obj;
                DialogExt a2 = i34Var.a();
                Dialog a3 = i34Var.a.a();
                PinnedMsg dc = a3 != null ? a3.dc() : null;
                Msg a4 = i34Var.b.a();
                if (a2 != null && a4 != null) {
                    o0w b = g2v.c().b();
                    Context context2 = vwv.c;
                    if (context2 == null) {
                        context2 = null;
                    }
                    aqi aqiVar = vwv.d;
                    if (aqiVar == null) {
                        aqiVar = null;
                    }
                    aqiVar.getClass();
                    a1w a1wVar = q1w.a;
                    o0w.x(b, context2, Long.valueOf((a1wVar != null ? a1wVar : null).q().b), a2.e, a2, null, new MsgListOpenAtMsgMode(MsgIdType.LOCAL_ID, a4.b), true, null, null, null, null, null, null, "audio_msg_player", null, null, null, false, null, null, null, null, null, 1073733520);
                } else if (a2 != null && dc != null) {
                    o0w b2 = g2v.c().b();
                    Context context3 = vwv.c;
                    if (context3 == null) {
                        context3 = null;
                    }
                    aqi aqiVar2 = vwv.d;
                    if (aqiVar2 == null) {
                        aqiVar2 = null;
                    }
                    aqiVar2.getClass();
                    a1w a1wVar2 = q1w.a;
                    b2.z(context3, dc, a2, (a1wVar2 != null ? a1wVar2 : null).q());
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ sd4(Object obj, int i) {
        this.b = i;
    }
}
