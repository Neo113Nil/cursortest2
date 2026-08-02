package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.newsfeed.exceptions.PostNotFoundException;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s8w implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s8w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        wpp wppVar;
        Good good;
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                w2w w2wVar = (w2w) obj6;
                el3 el3Var = (el3) obj3;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                com.vk.im.engine.models.im_item.a meta = w2wVar.I0().j().getMeta();
                t8v t8vVar = ((s8v) obj5).a;
                Set<Long> set = t8vVar.e;
                ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.b(longValue));
                }
                wpp wppVar2 = (wpp) w2wVar.b1(obj4, new tqm(new sqm(arrayList, Source.CACHE, false, null, 0, 28)));
                Iterable iterable = wppVar2.b;
                ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new b5w(((Number) it2.next()).longValue(), ImItemType.DIALOG));
                }
                el3Var.addAll(arrayList2);
                LinkedHashMap linkedHashMap2 = t8vVar.b;
                ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
                Iterator it3 = linkedHashMap2.entrySet().iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Integer.valueOf(((lj30) ((Map.Entry) it3.next()).getValue()).c));
                }
                MsgIdType msgIdType = MsgIdType.LOCAL_ID;
                Source source = Source.CACHE;
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                Collection<Msg> values = ((wpp) w2wVar.L0(obj4, new dj30(msgIdType, arrayList3, Peer.Unknown.e, source, false, null))).c.values();
                if ((values instanceof List) && (values instanceof RandomAccess)) {
                    List list = (List) values;
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Msg msg = (Msg) list.get(i2);
                        linkedHashMap.put(new b5w(msg.c, ImItemType.DIALOG), msg);
                        i2++;
                        wppVar2 = wppVar2;
                    }
                    wppVar = wppVar2;
                } else {
                    wppVar = wppVar2;
                    for (Msg msg2 : values) {
                        linkedHashMap.put(new b5w(msg2.c, ImItemType.DIALOG), msg2);
                    }
                }
                Set<Long> set2 = t8vVar.f;
                ArrayList arrayList4 = new ArrayList(c5g.u(set2, 10));
                Iterator<T> it4 = set2.iterator();
                while (it4.hasNext()) {
                    long longValue2 = ((Number) it4.next()).longValue();
                    Serializer.c<Peer> cVar3 = Peer.CREATOR;
                    arrayList4.add(Peer.a.b(longValue2));
                }
                wpp wppVar3 = (wpp) w2wVar.L0(obj4, new gfb((List<? extends Peer>) arrayList4, Source.CACHE, false, (Object) null));
                Iterable iterable2 = wppVar3.b;
                ArrayList arrayList5 = new ArrayList(c5g.u(iterable2, 10));
                Iterator it5 = iterable2.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(new b5w(((Number) it5.next()).longValue(), ImItemType.CHANNEL));
                }
                el3Var.addAll(arrayList5);
                break;
            case 1:
                gc10 gc10Var = (gc10) obj6;
                cxo cxoVar = (cxo) obj5;
                Context context = (Context) obj4;
                cfl cflVar = (cfl) obj3;
                srg srgVar = (srg) obj2;
                ay00 ay00Var = (ay00) obj;
                if (ay00Var.q() == null) {
                    break;
                } else {
                    if (ay00Var instanceof gu00) {
                        Good good2 = cxoVar.r;
                        if (good2 != null) {
                            gu00 gu00Var = (gu00) ay00Var;
                            if (gu00Var.a == good2.b) {
                                good2.x = gu00Var.b;
                                gc10.b(cxoVar, context);
                                gc10.a(cxoVar, context);
                            }
                        }
                    } else if (ay00Var instanceof iu00) {
                        iu00 iu00Var = (iu00) ay00Var;
                        cxoVar.w -= iu00Var.b;
                        Good good3 = cxoVar.r;
                        if (good3 != null && iu00Var.a == good3.b) {
                            if (((Boolean) gc10Var.a.getValue()).booleanValue() && (good = cxoVar.r) != null) {
                                good.x = 0;
                            }
                            gc10.b(cxoVar, context);
                            gc10.a(cxoVar, context);
                        }
                    } else if (ay00Var instanceof hu00) {
                        Good good4 = cxoVar.r;
                        if (good4 != null) {
                            hu00 hu00Var = (hu00) ay00Var;
                            if (hu00Var.a == good4.b) {
                                good4.x = hu00Var.c;
                            }
                        }
                        gc10.b(cxoVar, context);
                        gc10.a(cxoVar, context);
                    } else if (ay00Var instanceof ju00) {
                        Good good5 = cxoVar.r;
                        if (good5 != null) {
                            good5.x = 0;
                        }
                        gc10.b(cxoVar, context);
                        gc10.a(cxoVar, context);
                    } else if (ay00Var instanceof fu00) {
                        cxoVar.w = 0;
                        Good good6 = cxoVar.r;
                        if (good6 != null) {
                            good6.x = 0;
                        }
                        gc10.b(cxoVar, context);
                        gc10.a(cxoVar, context);
                    } else if (ay00Var instanceof ku00) {
                        Good good7 = cxoVar.r;
                        int i3 = (good7 != null ? good7.x : 0) - 1;
                        int i4 = i3 >= 0 ? i3 : 0;
                        if (good7 != null) {
                            good7.x = i4;
                        }
                        gc10.b(cxoVar, context);
                        gc10.a(cxoVar, context);
                    } else if (ay00Var instanceof jy00) {
                        Good good8 = cxoVar.r;
                        if (good8 != null && good8.b == ((jy00) ay00Var).a.b) {
                            cflVar.invoke();
                        }
                    } else if (ay00Var instanceof hy00) {
                        srgVar.invoke(ay00Var);
                    }
                    break;
                }
                break;
            default:
                Context context2 = (Context) obj6;
                yp80 yp80Var = (yp80) obj5;
                Integer num = (Integer) obj4;
                com.vk.newsfeed.impl.fragments.a aVar = (com.vk.newsfeed.impl.fragments.a) obj3;
                String str = (String) obj2;
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    enj.q(R.string.post_not_found, 0, context2);
                    yp80Var.onError(new PostNotFoundException());
                } else if (num != null) {
                    NewsfeedRouter.E(aVar, context2, (NewsEntry) list2.get(0), null, null, num, null, str, 44);
                } else {
                    NewsfeedRouter.E(aVar, context2, (NewsEntry) list2.get(0), null, null, null, null, str, 60);
                }
                yp80Var.onSuccess();
                break;
        }
        return s3q0.a;
    }
}
