package xsna;

import android.content.Context;
import com.vk.api.generated.messages.dto.MessagesChatSettingsDto;
import com.vk.api.generated.messages.dto.MessagesConversationWithMessageDto;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridUploadListFragment;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.drafts.DraftsFeedRecyclerPaginatedView;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.stat.accept.AcceptCallStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import xsna.dob;
import xsna.gfc;
import xsna.iw7;
import xsna.knb;
import xsna.q2j;
import xsna.qdd;
import xsna.sl2;
import xsna.tj50;
import xsna.v59;
import xsna.w3m;
import xsna.x0r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class md implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ md(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 onAcceptCall$lambda$1;
        Integer d;
        switch (this.b) {
            case 0:
                int i = AbstractClipsGridUploadListFragment.i0;
                return Boolean.valueOf(rl3.y0(new Integer[]{Integer.valueOf(ClipsBottomSheetOptions.REMOVE.ordinal()), Integer.valueOf(ClipsBottomSheetOptions.REMOVE_CLIP_COMMUNITY.ordinal())}).contains(Integer.valueOf(((ckd) obj).a)));
            case 1:
                onAcceptCall$lambda$1 = AcceptCallStat.onAcceptCall$lambda$1((CallEventualStatSender) obj);
                return onAcceptCall$lambda$1;
            case 2:
                return Integer.valueOf(((xu) obj).a);
            case 3:
                sl2.m.keySet().retainAll(j5g.S0((List) obj));
                sl2.q.set(sl2.b.LOADED);
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((yj40) obj) instanceof uq3);
            case 5:
                qgi0.r((tgi0) obj, "audiobookChapterName");
                return s3q0.a;
            case 6:
                return ((c860) ((icl0) obj)).a;
            case 7:
                MessagesChatSettingsDto f = ((MessagesConversationWithMessageDto) obj).d().f();
                return Boolean.valueOf(((f == null || (d = f.d()) == null) ? 0 : d.intValue()) > 0);
            case 8:
                return (iw7.a) obj;
            case 9:
                return Boolean.valueOf(((v59.b) obj).a);
            case 10:
                L.e("CallPrimaryActions", "State about to process: " + ((k9d0) obj) + ", current thread is " + Thread.currentThread().getName());
                return s3q0.a;
            case 11:
                return "'" + ((ChannelType) obj).i() + '\'';
            case 12:
                knb.c cVar = (knb.c) obj;
                DialogExt dialogExt = cVar.b;
                Msg msg = cVar.c;
                if (!cVar.e && cVar.d) {
                    r1 = true;
                }
                return new dob.e(dialogExt, msg, r1);
            case 13:
                Iterator<T> it = ((gxo) obj).a.iterator();
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
            case 14:
                return new gfc.a(((tj50.a) obj).a(zec.b, ao8.d));
            case 15:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 16:
                return new qdd.c.a((Throwable) obj);
            case 17:
                return (u2e) j5g.Y(((b4e) obj).a);
            case 18:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).f);
            case 19:
                int i4 = z5h.j1;
                qgi0.r((tgi0) obj, "InviteLinkBottomButton");
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, "priority_block_header_title");
                return s3q0.a;
            case 21:
                return Boolean.valueOf(((q2j.c) obj).f);
            case 22:
                return new w3m.b(((tj50.a) obj).a(new oj(19), ao8.d));
            case 23:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_search, (Context) obj);
            case 24:
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"DialogThemeLoader", "Default theme load next"});
                }
                return s3q0.a;
            case 25:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 26:
                qgi0.r((tgi0) obj, "PrivacySettingsForDonutLevelsTitleLevel");
                return s3q0.a;
            case 27:
                int i5 = DraftsFeedRecyclerPaginatedView.a0;
                qgi0.r((tgi0) obj, "drafts_feed_empty_state_placeholder_button");
                return s3q0.a;
            case 28:
                tj50.a aVar = (tj50.a) obj;
                int i6 = 22;
                oj ojVar = new oj(i6);
                ao8 ao8Var = ao8.d;
                int i7 = 27;
                return new d.b.a(aVar.a(ojVar, ao8Var), aVar.a(new pl2(i7), ao8Var), aVar.a(new f57(21), ao8Var), aVar.a(new zj(i7), ao8Var), aVar.a(n8p.b, ao8Var), aVar.a(new ak(i6), ao8Var), aVar.a(new c2(i7), ao8Var));
            default:
                x0r.a aVar2 = (x0r.a) obj;
                int i8 = aVar2 == null ? -1 : x0r.b.$EnumSwitchMapping$0[aVar2.ordinal()];
                if (i8 == 1) {
                    return io.reactivex.rxjava3.core.x.k(x0r.a.Loading).f(500L, TimeUnit.MILLISECONDS);
                }
                if (i8 == 2) {
                    return io.reactivex.rxjava3.core.x.k(x0r.a.Success);
                }
                if (i8 == 3) {
                    return io.reactivex.rxjava3.core.x.k(x0r.a.Error);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
