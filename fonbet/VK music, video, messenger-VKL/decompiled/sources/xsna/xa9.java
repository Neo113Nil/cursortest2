package xsna;

import android.content.res.ColorStateList;
import android.database.Cursor;
import android.os.Trace;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.interactive.InteractiveInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.log.L;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stickers.bridge.GiftData;
import com.vk.superapp.base.js.bridge.data.VKWebAppPermission;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.xn50;

/* compiled from: CallVmojiDelegate.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class xa9 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xa9(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02de, code lost:
    
        if (r5 == null) goto L125;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        com.vk.movika.sdk.base.model.o oVar;
        InteractiveInfo R7;
        String str;
        DialogsCounters.Type type;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                oxr0 oxr0Var = (oxr0) obj;
                com.vk.profile.community.impl.ui.profile.a aVar = (com.vk.profile.community.impl.ui.profile.a) this.receiver;
                aVar.getClass();
                aVar.C(new CommunityProfileAction.z(oxr0Var.a, oxr0Var.b));
                return s3q0.a;
            case 3:
                yax yaxVar = (yax) obj;
                ugl uglVar = (ugl) this.receiver;
                opt0 opt0Var = uglVar.e;
                Map<Integer, String> map = yaxVar.b;
                List<com.vk.movika.sdk.base.model.c> list = yaxVar.a;
                opt0Var.d = map;
                dj00 dj00Var = uglVar.w;
                if (dj00Var != null) {
                    com.vk.movika.sdk.base.model.s sVar = dj00Var.a;
                    VideoFile videoFile = uglVar.l.s;
                    String str2 = (videoFile == null || (R7 = videoFile.R7()) == null || (str = R7.e) == null) ? null : dj00Var.b.get(str);
                    Chapter a = sVar.a(str2);
                    com.vk.movika.sdk.base.asset.b bVar = new com.vk.movika.sdk.base.asset.b(sVar);
                    uglVar.y = bVar;
                    uglVar.w = dj00Var;
                    uglVar.w(ocx.a(uglVar.l, null, a, false, null, null, null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194301));
                    if (uglVar.r == null || uglVar.s().c() == null) {
                        uglVar.z = str2;
                    } else {
                        nbx s = uglVar.s();
                        mc0 mc0Var = s.g;
                        if (mc0Var != null) {
                            s.o = null;
                            ((com.vk.movika.sdk.base.ui.c) mc0Var.a).B(bVar, null, s.p, str2);
                        }
                        com.vk.movika.sdk.base.ui.c q = uglVar.q();
                        if (q != null) {
                            if (uglVar.l.a.a) {
                                q.z();
                            } else {
                                q.y();
                            }
                        }
                    }
                }
                uglVar.t = true;
                uglVar.q.e();
                if (list.isEmpty()) {
                    yaxVar = null;
                }
                dj00 dj00Var2 = uglVar.w;
                com.vk.movika.sdk.base.model.s sVar2 = dj00Var2 != null ? dj00Var2.a : null;
                if (yaxVar != null && sVar2 != null) {
                    com.vk.movika.sdk.base.ui.c q2 = uglVar.q();
                    if (q2 != null) {
                        oVar = q2.n;
                        if (oVar == null) {
                            oVar = q2.o;
                            break;
                        }
                    }
                    String uuid = UUID.randomUUID().toString();
                    com.vk.movika.sdk.base.model.u uVar = sVar2.a;
                    String str3 = uVar.a;
                    String str4 = uVar.b;
                    Integer num = uVar.c;
                    EmptySet emptySet = EmptySet.b;
                    EmptyList emptyList = EmptyList.b;
                    oVar = new com.vk.movika.sdk.base.model.o(uuid, str3, str4, num, false, emptySet, emptyList, emptyList);
                    uglVar.s().e(com.vk.movika.sdk.base.model.o.a(oVar, null, null, list, 127));
                }
                return s3q0.a;
            case 4:
                Collection collection = (Collection) obj;
                com.vk.im.engine.internal.storage.delegates.dialogs.b bVar2 = (com.vk.im.engine.internal.storage.delegates.dialogs.b) this.receiver;
                bVar2.getClass();
                if (collection.isEmpty()) {
                    return jgp.b;
                }
                Cursor d = bVar2.b.b().d(ho8.a(new StringBuilder("SELECT * FROM dialogs_history_count WHERE filter_id IN("), j5g.g0(collection, StringUtils.COMMA, null, null, 0, null, 62), ')'), null);
                HashMap hashMap = new HashMap(d.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d.moveToFirst()) {
                            while (!d.isAfterLast()) {
                                Integer valueOf = Integer.valueOf(fl3.A(d, "filter_id"));
                                DialogsCounters.Type.a aVar2 = DialogsCounters.Type.Companion;
                                int A = fl3.A(d, "filter_id");
                                aVar2.getClass();
                                DialogsCounters.Type[] values = DialogsCounters.Type.values();
                                int length = values.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        type = values[i];
                                        if (type.i() == A) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        type = null;
                                    }
                                }
                                hashMap.put(valueOf, new com.vk.im.engine.models.dialogs.d(type, fl3.A(d, "count"), fl3.A(d, "phase_id")));
                                d.moveToNext();
                            }
                        }
                        return hashMap;
                    } finally {
                        d.close();
                    }
                } finally {
                    Trace.endSection();
                }
            case 5:
                return ((t8e) this.receiver).b((Set) obj);
            case 6:
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                hxv0 hxv0Var = (hxv0) obj;
                x6y x6yVar = (x6y) this.receiver;
                fvv0 M = x6yVar.M();
                if (M != null && M.getAppId() == hxv0Var.a && hxv0Var.a().length() != 0) {
                    if (hxv0Var instanceof jxv0) {
                        jxv0 jxv0Var = (jxv0) hxv0Var;
                        x6yVar.K().q0(jxv0Var.d, jxv0Var.e);
                    } else {
                        if (!(hxv0Var instanceof ixv0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        x6yVar.K().V(((ixv0) hxv0Var).d);
                    }
                }
                return s3q0.a;
            case 8:
                yv20 yv20Var = (yv20) this.receiver;
                int i2 = yv20.f;
                yv20Var.getClass();
                zal0.m(g2v.d().a(), yv20Var.getContext(), (StickerStockItem) obj, GiftData.d, null, 56);
                return s3q0.a;
            case 9:
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b bVar3 = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b) this.receiver;
                bVar3.getClass();
                xn50.a.c(bVar3, (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.a) obj);
                return s3q0.a;
            case 10:
                return ((mm50) this.receiver).R((izs) obj);
            case 11:
                js60 js60Var = ((m170) this.receiver).a;
                return js60.a(((qz60) obj).b);
            case 12:
                L.i((Throwable) obj);
                return s3q0.a;
            case 13:
                ((ImageView) this.receiver).setImageTintList((ColorStateList) obj);
                return s3q0.a;
            case 14:
                ((com.vk.video.ui.discovery.minimizable.related_videos.k) this.receiver).l((com.vk.video.ui.discovery.minimizable.related_videos.h) obj);
                return s3q0.a;
            default:
                gxv0 gxv0Var = (gxv0) obj;
                ggu0 ggu0Var = (ggu0) this.receiver;
                mfu0 mfu0Var = ggu0Var.d;
                if (ggu0Var.e.getAppId() == gxv0Var.a) {
                    if (gxv0Var instanceof bvv0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("payload", ((bvv0) gxv0Var).b);
                        mfu0Var.r(JsApiEvent.ARTICLE_CLOSED, jSONObject);
                    } else {
                        if (!(gxv0Var instanceof swv0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<VKWebAppPermission> list2 = ((swv0) gxv0Var).b;
                        JSONObject jSONObject2 = new JSONObject();
                        List<VKWebAppPermission> list3 = list2;
                        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((VKWebAppPermission) it.next()).h());
                        }
                        jSONObject2.put(SignalingProtocol.KEY_PERMISSIONS, new JSONArray((Collection) arrayList));
                        mfu0Var.r(JsApiEvent.PERMISSION_GRANTED, jSONObject2);
                    }
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa9(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 3:
                super(1, obj, ugl.class, "onSuccessLoadHistory", "onSuccessLoadHistory(Lcom/vk/movika/impl/network/InteractiveChaptersHolder;)V", 0);
                break;
            case 6:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
                super(1, obj, x6y.class, "handleEvents", "handleEvents(Lcom/vk/superapp/browser/utils/VkUiRxStoryBoxEvent;)V", 0);
                break;
            case 11:
                super(1, obj, m170.class, "map", "map(Lcom/vk/newsfeed/common/presentation/newsfeed/NewsfeedState;)Lcom/vk/newsfeed/impl/presentation/list/NewsfeedListViewState;", 0);
                break;
            case 12:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
