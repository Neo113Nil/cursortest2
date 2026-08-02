package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.api.models.AuthResult;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.metrics.eventtracking.Event;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vkontakte.android.NetworkStateReceiver;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c22;
import xsna.ext;
import xsna.f360;
import xsna.moq0;
import xsna.ptq0;
import xsna.t5e;
import xsna.u6x;
import xsna.u8m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class w95 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w95(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [T, com.vk.movika.sdk.base.ui.l] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.b;
        UserProfileAction userProfileAction = null;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                ((s95) obj4).a((yg5) obj, ((Boolean) ((wh50) obj3).getValue()).booleanValue());
                ((gzs) obj2).invoke();
                return s3q0.a;
            case 1:
                List list = (List) obj4;
                com.vk.catalog2.common.ui.mvp.auto.d dVar = (com.vk.catalog2.common.ui.mvp.auto.d) obj2;
                c22.c cVar = (c22.c) obj3;
                Pair pair = (Pair) obj;
                List list2 = (List) pair.d();
                String str = (String) pair.g();
                if (list2.isEmpty()) {
                    return io.reactivex.rxjava3.core.q.T(list);
                }
                ArrayList u0 = j5g.u0(list2, list);
                if (!com.vk.catalog2.common.ui.mvp.auto.d.b(u0) && str != null && str.length() != 0) {
                    return dVar.c(new c22.c(cVar.a, str), u0);
                }
                int size = u0.size();
                Collection collection = u0;
                if (size > 220) {
                    collection = j5g.H0(u0, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                }
                return io.reactivex.rxjava3.core.q.T(collection);
            case 2:
                hhb hhbVar = (hhb) obj4;
                izs izsVar = (izs) obj2;
                c400 c400Var = (c400) obj3;
                xgl0 xgl0Var = (xgl0) obj;
                long j = hhbVar.c;
                w2w w2wVar = hhbVar.a;
                if (((Boolean) w2wVar.I0().c(new fhb(j, hhbVar))).booleanValue()) {
                    izsVar.invoke(xgl0Var);
                } else {
                    eeb eebVar = (eeb) c400Var.i.get(Long.valueOf(j));
                    if (eebVar == null) {
                        throw new IllegalStateException(("storeMissedOrExpiredChannels: failed, channel=" + j + " not found in lpInfo").toString());
                    }
                    if (!((Collection) new ChannelsInfoMergeTask(Collections.singletonList(eebVar), null, false, null, ChannelsInfoMergeTask.InfoSource.WEBSOCKET, 14).o(w2wVar)).isEmpty()) {
                        Msg msg = eebVar.b;
                        new ChannelMsgHistoryFromServerMergeTask(hhbVar.b, msg, ChannelMsgHistoryFromServerMergeTask.HistorySource.WEBSOCKET, msg == null, false).o(w2wVar);
                    }
                }
                return s3q0.a;
            case 3:
                ((h5e) obj4).b.d(t5e.c.a, (Context) obj2);
                h5e.j((VideoFile) obj3, true);
                return s3q0.a;
            case 4:
                wh50 wh50Var = (wh50) obj3;
                List b = r6l.b(wh50Var);
                wow wowVar = new wow(b);
                ((nvy) obj).e(b.size(), null, new p6l(wowVar, 0), new jai(2039820996, new q6l(wowVar, wh50Var, (wh50) obj4, (rh00) obj2), true));
                return s3q0.a;
            case 5:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                asm asmVar = (asm) obj2;
                DialogExt dialogExt = (DialogExt) obj3;
                u8m a = u8m.q.a(((Integer) obj).intValue());
                if (a != null) {
                    v8m.a = null;
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a aVar = new Event.a();
                    aVar.g("IM.DIALOG_ACTION.SUCCEED");
                    aVar.a(a, "action");
                    aVar.a(Boolean.TRUE, "from_dialogs_list");
                    bVar.k(aVar.e());
                    asmVar.f(dialogExt, a);
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 6:
                Throwable th = (Throwable) obj4;
                u6x u6xVar = (u6x) obj2;
                w6x w6xVar = (w6x) obj3;
                u6x.b bVar2 = (u6x.b) obj;
                Future<?> future = bVar2.h;
                if (future != null) {
                    future.cancel(true);
                }
                return u6x.b.a(bVar2, null, th, null, false, u6xVar.n(w6xVar), 439);
            case 7:
                yp80 yp80Var = (yp80) obj4;
                String str2 = (String) obj2;
                BrowserPerfState browserPerfState = (BrowserPerfState) obj3;
                Throwable th2 = (Throwable) obj;
                if (!(th2 instanceof VKApiExecutionException) || ((VKApiExecutionException) th2).s() != 104) {
                    com.vk.common.links.c.c(str2, browserPerfState, th2);
                    if (yp80Var != null) {
                        yp80Var.onError(th2);
                    }
                } else if (yp80Var != null) {
                    yp80Var.U();
                }
                return s3q0.a;
            case 8:
                okhttp3.d dVar2 = (okhttp3.d) obj2;
                u3j u3jVar = (u3j) obj3;
                f360.a aVar2 = (f360.a) obj;
                Iterator<f360> it = ((r9e0) obj4).d.iterator();
                while (it.hasNext()) {
                    it.next().i(dVar2, u3jVar, aVar2);
                }
                return s3q0.a;
            case 9:
                ((Ref$ObjectRef) obj4).element = new com.vk.movika.sdk.base.ui.l(22, (UserProfileDialogs) obj3, (moq0.b) obj);
                VkContextMenu vkContextMenu = (VkContextMenu) ((Ref$ObjectRef) obj2).element;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                return s3q0.a;
            case 10:
                slq0 slq0Var = (slq0) obj3;
                mh40 mh40Var = new mh40((ptq0) obj2, 17);
                switch (ptq0.b.$EnumSwitchMapping$1[((UserProfileAdapterItem.MainInfo.ActionButtons.State) obj4).ordinal()]) {
                    case 1:
                        userProfileAction = new UserProfileAction.s.c.a.h(mh40Var);
                        break;
                    case 2:
                        userProfileAction = new UserProfileAction.s.c.a.b(mh40Var);
                        break;
                    case 3:
                        userProfileAction = new UserProfileAction.s.c.a.C1694a(mh40Var);
                        break;
                    case 4:
                        userProfileAction = new UserProfileAction.s.c.a.k(mh40Var);
                        break;
                    case 5:
                        userProfileAction = new UserProfileAction.s.c.a.k(mh40Var);
                        break;
                    case 6:
                    case 7:
                        userProfileAction = new UserProfileAction.s.c.a.l(mh40Var);
                        break;
                    case 8:
                        userProfileAction = new UserProfileAction.s.c.a.d(mh40Var);
                        break;
                    case 9:
                        userProfileAction = new UserProfileAction.s.c.a.e(mh40Var);
                        break;
                    case 10:
                        userProfileAction = new UserProfileAction.s.c.a.j(mh40Var);
                        break;
                    case 11:
                        userProfileAction = new UserProfileAction.s.c.a.C1695c(mh40Var);
                        break;
                    case 12:
                        userProfileAction = new UserProfileAction.s.c.a.g(mh40Var);
                        break;
                    case 13:
                        userProfileAction = new UserProfileAction.s.c.a.i(mh40Var);
                        break;
                    case 14:
                        userProfileAction = new UserProfileAction.s.c.a.f(mh40Var);
                        break;
                    case 15:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (userProfileAction != null) {
                    slq0Var.a(userProfileAction);
                }
                return s3q0.a;
            case 11:
                ext.b bVar3 = (ext.b) obj;
                AuthResult a2 = AuthResult.a((AuthResult) obj2, null, null, null, null, System.currentTimeMillis(), null, null, 8355839);
                bVar3.d = ((xbu0) obj3).d;
                s3q0 s3q0Var = s3q0.a;
                ((pcu0) obj4).q(a2, bVar3);
                NetworkStateReceiver.c(bVar3, true);
                return s3q0.a;
            default:
                azl azlVar = (azl) obj4;
                wh50 wh50Var2 = (wh50) obj2;
                q9x q9xVar = (q9x) obj;
                if (((Boolean) ((wh50) obj3).getValue()).booleanValue() && (i = (int) (q9xVar.a >> 32)) > 0) {
                    wh50Var2.setValue(new pco(azlVar.j1(i)));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ w95(azl azlVar, wh50 wh50Var, wh50 wh50Var2) {
        this.b = 12;
        this.c = azlVar;
        this.e = wh50Var;
        this.d = wh50Var2;
    }

    public /* synthetic */ w95(wh50 wh50Var, wh50 wh50Var2, rh00 rh00Var) {
        this.b = 4;
        this.e = wh50Var;
        this.c = wh50Var2;
        this.d = rh00Var;
    }
}
