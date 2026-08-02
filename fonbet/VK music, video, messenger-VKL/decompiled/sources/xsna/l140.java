package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.progress.VkProgress;
import com.vk.dto.market.CharacteristicsItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.flowable.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.dug0;
import xsna.ija0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l140 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ l140(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                int i2 = MsgViewFragment.i0;
                Object Z = j5g.Z(((wpp) obj).c.values());
                r1 = Z instanceof MsgFromUser ? (MsgFromUser) Z : null;
                if (r1 != null) {
                    return r1;
                }
                throw new IllegalStateException("Message not found");
            case 1:
                VkGroupHeader vkGroupHeader = new VkGroupHeader(((ViewGroup) obj).getContext());
                vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
                vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.music_caption_global_search), null, null, null, null, null, Integer.MAX_VALUE, null, null));
                return vkGroupHeader;
            case 2:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof Contact) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((Contact) next).k5()) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            case 3:
                L.l("OKVoipAudioManager", ms9.b("doWithHeadsetCheck onError=", (Throwable) obj));
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                return new sm90((ViewGroup) obj);
            case 6:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 7:
                return new ija0.a.b(((tj50.a) obj).a(new p2u(15), ao8.d));
            case 8:
                return ((PostingState.Editing) obj).i.c;
            case 9:
                VkProgress vkProgress = new VkProgress((Context) obj, null, 0, 14, 0);
                vkProgress.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return vkProgress;
            case 10:
                NewsEntry newsEntry = (NewsEntry) j5g.a0((List) obj);
                if (newsEntry != null) {
                    return newsEntry;
                }
                throw new IllegalStateException();
            case 11:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    i = R.raw.play_to_pause_48;
                } else {
                    if (!booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.raw.pause_to_play_48;
                }
                return Integer.valueOf(i);
            case 12:
                L.f("ScreenCaptureManagerImpl", "Screen capture error", (Throwable) obj);
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                List list = (List) obj;
                Set set = (Set) j5g.a0(list);
                Set set2 = (Set) j5g.k0(list);
                if (!epx.f(set, set2) && set != null && set2 != null) {
                    Iterator it2 = izi0.g(set2, set).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            com.vk.voip.ui.c.b.getClass();
                            if (!epx.f((CallMemberId) next2, com.vk.voip.ui.c.r.a())) {
                                r1 = next2;
                            }
                        }
                    }
                    r1 = (CallMemberId) r1;
                }
                return new it80(r1);
            case 15:
                int i3 = StickersDrawingViewGroup.j0;
                ((grt0) obj).w();
                return s3q0.a;
            case 16:
                return ((qgl0) ((Enum) obj)).getKey();
            case 17:
                return Boolean.valueOf(((BaseOkResponseDto) obj).i() == 1);
            case 18:
                return Boolean.valueOf(((zif0) obj) instanceof a9n0);
            case 19:
                io.reactivex.rxjava3.core.g gVar = (io.reactivex.rxjava3.core.g) obj;
                qu50 qu50Var = new qu50(new w9l0(2), 13);
                gVar.getClass();
                int i4 = io.reactivex.rxjava3.core.g.b;
                io.reactivex.rxjava3.internal.functions.b.a(i4, "bufferSize");
                if (!(gVar instanceof io.reactivex.rxjava3.internal.fuseable.j)) {
                    return new io.reactivex.rxjava3.internal.operators.flowable.w0(gVar, qu50Var, i4);
                }
                T t = ((io.reactivex.rxjava3.internal.fuseable.j) gVar).get();
                return t == 0 ? io.reactivex.rxjava3.internal.operators.flowable.p.c : new s0.a(t, qu50Var);
            case 20:
                m1o0 m1o0Var = (m1o0) obj;
                List<a210> list2 = m1o0Var.b;
                boolean z = m1o0Var.d;
                int i5 = m1o0Var.e.b;
                return new bwx(list2, z);
            case 21:
                return Boolean.valueOf(((BaseBoolIntDto) obj).i() == BaseBoolIntDto.YES.i());
            case 22:
                return String.valueOf(((CharacteristicsItem.Value) obj).b);
            case 23:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 24:
                AlbumsRepository.a aVar = (AlbumsRepository.a) obj;
                return new Pair(aVar.a, Boolean.valueOf(aVar.b));
            case 25:
                return Boolean.valueOf(((UIBlock) obj) instanceof UIBlockFilter2D);
            case 26:
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockVideo) {
                    UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                    if (drm0.D(uIBlockVideo.K, "video/liked", false) || drm0.D(uIBlockVideo.K, "my/liked", false)) {
                        r2 = true;
                    }
                }
                return Boolean.valueOf(r2);
            case 27:
                return ((Serializer) obj).h();
            case 28:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                L.j((Throwable) obj, "Catalog");
                return s3q0.a;
            default:
                return new l7w0((ViewGroup) obj);
        }
    }
}
