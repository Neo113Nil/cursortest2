package xsna;

import android.content.Context;
import android.os.Handler;
import androidx.recyclerview.widget.m;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.view.components.rating.RatingBar$Size;
import com.vk.core.view.components.rating.VkDynamicRatingBar;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.ClipsEntry;
import com.vk.dto.shortvideo.Clips;
import com.vk.dto.user.RequestUserProfile;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.log.L;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.OneVideoPlayer;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import xsna.dw20;
import xsna.g73;
import xsna.grd;
import xsna.gss;
import xsna.r7k0;
import xsna.u8m;
import xsna.uxv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class z63 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z63(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, xsna.dw20] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair;
        List<ClipVideoFile> list;
        List<ClipVideoFile> list2;
        xy2 o;
        Set<String> putIfAbsent;
        switch (this.b) {
            case 0:
                i0q0.j(new u63((g73.a) obj, (d73) this.c, (NavigationDelegateActivity) this.d, (mq2) this.e, 0));
                return s3q0.a;
            case 1:
                f89 f89Var = (f89) this.c;
                List<? extends CallSettingsItem> list3 = (List) this.d;
                n89 n89Var = (n89) this.e;
                f89Var.d = list3;
                ((m.d) obj).b(f89Var.a);
                n89Var.run();
                return s3q0.a;
            case 2:
                av20 av20Var = (av20) this.c;
                Context context = (Context) this.d;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.e;
                av20Var.setItems((List) obj);
                grd.a aVar = new grd.a(context, tzp0.a(null, 3));
                aVar.e = true;
                ref$ObjectRef.element = ((dw20.b) dw20.a.k(aVar.a0(new ra(ref$ObjectRef, 23)), av20Var, 6)).I0("more_menu_tag");
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 3:
                ClipsEntry clipsEntry = (ClipsEntry) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                ClipsPrefetchHelper.a aVar2 = (ClipsPrefetchHelper.a) obj;
                if (aVar2 instanceof ClipsPrefetchHelper.a.C1367a) {
                    Throwable th = ((ClipsPrefetchHelper.a.C1367a) aVar2).a;
                    L.i(th);
                    new ClipsPrefetchHelper.ClipsPrefetchEventBuilder(ClipsPrefetchHelper.ClipsPrefetchEventBuilder.Event.PREFETCH_ERROR, str, str2, th).q();
                    pair = new Pair(EmptyList.b, PaginationKey.LoadedFull.b);
                } else {
                    if (!(aVar2 instanceof ClipsPrefetchHelper.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ClipsPrefetchHelper.a.b bVar = (ClipsPrefetchHelper.a.b) aVar2;
                    pair = new Pair(bVar.a, bVar.b);
                }
                List list4 = (List) pair.d();
                PaginationKey paginationKey = (PaginationKey) pair.g();
                clipsEntry.e = false;
                Clips clips = clipsEntry.j;
                if (clips != null && (list2 = clips.b) != null) {
                    list2.clear();
                }
                if (clips != null && (list = clips.b) != null) {
                    list.addAll(list4);
                }
                if (clips != null) {
                    clips.c = paginationKey.zb();
                }
                ClipsPrefetchHelper.a.b bVar2 = aVar2 instanceof ClipsPrefetchHelper.a.b ? (ClipsPrefetchHelper.a.b) aVar2 : null;
                String str3 = bVar2 != null ? bVar2.c : null;
                return str3 != null ? new ClipsEntry(str3, clipsEntry.j, clipsEntry.k, clipsEntry.l, clipsEntry.m) : clipsEntry;
            case 4:
                i8f i8fVar = (i8f) this.c;
                final z7f z7fVar = (z7f) this.d;
                Set set = (Set) this.e;
                final List list5 = (List) obj;
                i8fVar.e.getClass();
                List<n7f> list6 = z7fVar.d;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object obj2 : list6) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    if (set.contains(Integer.valueOf(i))) {
                        arrayList.add(obj2);
                    }
                    i = i2;
                }
                final Iterator it = arrayList.iterator();
                return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.j8f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        z7f z7fVar2 = z7f.this;
                        for (ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem : list5) {
                            Iterator it2 = it;
                            if (it2.hasNext()) {
                                n7f a = n7f.a((n7f) it2.next(), clipsTemplateEditorVideoItem, null, null, 27);
                                z7fVar2 = z7f.a(z7fVar2, rdi.I(a.a, a, z7fVar2.d), null, null, null, 503);
                            }
                        }
                        return z7fVar2;
                    }
                });
            case 5:
                rmh rmhVar = (rmh) this.c;
                o = rmhVar.c.o(fkq0.a((UserId) this.d), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : (String) obj, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : (String) this.e, (r32 & 8388608) != 0 ? null : "community_page");
                int i3 = 17;
                rmhVar.d.b(rsg0.W(yfb.x(o), 7).subscribe(new tf(new ay0(rmhVar, 29), i3), new ji3(new qt0(i3), 18)));
                return s3q0.a;
            case 6:
                uxv uxvVar = (uxv) this.c;
                Context context2 = (Context) this.d;
                String str4 = (String) this.e;
                int i4 = uxv.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i4 == 1) {
                    uxvVar.c.k().b(context2, str4);
                } else if (i4 == 2) {
                    uxv.a(context2, str4);
                }
                return s3q0.a;
            case 7:
                vm30 vm30Var = (vm30) this.c;
                Msg msg = (Msg) this.d;
                v3n v3nVar = (v3n) this.e;
                List list7 = (List) obj;
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.e0(Collections.singletonList(msg), list7.contains(u8m.u.b));
                }
                v3nVar.invoke();
                return s3q0.a;
            case 8:
                m060 m060Var = (m060) this.c;
                RequestUserProfile requestUserProfile = (RequestUserProfile) this.d;
                hss hssVar = (hss) this.e;
                m060Var.e.a(requestUserProfile);
                requestUserProfile.i0 = Boolean.FALSE;
                if (m060Var.b) {
                    m060Var.f.b(r7k0.a.C3598a.a, requestUserProfile, hssVar);
                }
                kss kssVar = m060Var.g;
                if (kssVar != null) {
                    kssVar.c(new gss.a(requestUserProfile.c));
                }
                return s3q0.a;
            case 9:
                dhw0 dhw0Var = (dhw0) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                OKVoipEngine.c cVar = (OKVoipEngine.c) this.e;
                StartCallParams.Builder myId = ((StartCallParams.Builder) obj).setOpponentId(ParticipantId.authorized(String.valueOf(dhw0Var.b))).setPayload(jSONObject.toString()).setWatchTogetherEnabledForAll(cVar.b.o).setMyId(ParticipantId.authorized(cVar.c));
                OKVoipEngine.d dVar = cVar.h;
                return myId.setOnPrepared(dVar.a).setOnError(dVar.b).setStartWithVideo(cVar.d).setEventListener((ConversationEventsListener) dVar.c).setFrameInterceptor((CapturedFrameInterceptor) OKVoipEngine.A).build();
            case 10:
                ks80 ks80Var = (ks80) this.c;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.d;
                wzs wzsVar = (wzs) this.e;
                String str5 = (String) obj;
                int hashCode = oneVideoPlayer.hashCode();
                Handler handler = ks80Var.d;
                if (handler.getLooper().isCurrentThread() && (putIfAbsent = ks80Var.c.putIfAbsent(Integer.valueOf(hashCode), new HashSet())) != null) {
                    putIfAbsent.add(str5);
                }
                handler.post(new l0g(ks80Var, str5, wzsVar, 2));
                return s3q0.a;
            case 11:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                wh50 wh50Var3 = (wh50) this.e;
                VkDynamicRatingBar vkDynamicRatingBar = (VkDynamicRatingBar) obj;
                vkDynamicRatingBar.setSize((RatingBar$Size) wh50Var.getValue());
                vkDynamicRatingBar.setEnabled(((Boolean) wh50Var2.getValue()).booleanValue());
                vkDynamicRatingBar.setInteractionEnabled(((Boolean) wh50Var3.getValue()).booleanValue());
                return s3q0.a;
            default:
                dhl0 dhl0Var = (dhl0) this.c;
                Collection collection = (Collection) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                synchronized (dhl0Var.g) {
                    try {
                        Collection collection2 = collection;
                        izs<T, K> izsVar = dhl0Var.c;
                        ArrayList arrayList3 = new ArrayList(c5g.u(collection2, 10));
                        Iterator it2 = collection2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(izsVar.invoke(it2.next()));
                        }
                        Map e = dhl0Var.e(arrayList3);
                        HashMap r = p4g.r(collection, dhl0Var.c);
                        dhl0Var.i.clear();
                        for (Map.Entry entry : r.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj3 = e.get(key);
                            if (!epx.f(obj3, value)) {
                                dhl0Var.i.add(value);
                                arrayList2.add(new hhl0(obj3, value));
                            }
                        }
                        if (!dhl0Var.i.isEmpty()) {
                            dhl0Var.e.invoke(dhl0Var.i);
                            Iterator it3 = dhl0Var.i.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                dhl0Var.g.put(dhl0Var.c.invoke(next), next);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return s3q0.a;
        }
    }
}
