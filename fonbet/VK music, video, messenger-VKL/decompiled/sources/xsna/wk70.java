package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.dto.stickers.ugc.UgcStatus;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;

/* compiled from: NotifyContentVisibleViaBgCmd.kt */
/* loaded from: classes2.dex */
public final class wk70 extends xl6<Boolean> {
    public static final List<Integer> e = e43.l(0, 3, 6);
    public final Collection<Dialog> b;
    public final Collection<Msg> c;
    public final List<ewp0> d;

    public wk70() {
        this(null, null, null, 7);
    }

    public static void f(Attach attach, Class cls, ArrayList arrayList) {
        if (attach.getClass().equals(cls)) {
            arrayList.add(attach);
            return;
        }
        if (attach.getClass().equals(AttachWall.class)) {
            List<Attach> list = ((AttachWall) attach).o;
            if ((list instanceof List) && (list instanceof RandomAccess)) {
                List<Attach> list2 = list;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    f(list2.get(i), cls, arrayList);
                }
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    f((Attach) it.next(), cls, arrayList);
                }
            }
        }
    }

    public static void g(com.vk.im.engine.models.messages.a aVar, Class cls, ArrayList arrayList) {
        List<Attach> K0 = aVar.K0();
        if ((K0 instanceof List) && (K0 instanceof RandomAccess)) {
            List<Attach> list = K0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                f(list.get(i), cls, arrayList);
            }
        } else {
            Iterator<T> it = K0.iterator();
            while (it.hasNext()) {
                f((Attach) it.next(), cls, arrayList);
            }
        }
        List<NestedMsg> q7 = aVar.q7();
        if ((q7 instanceof List) && (q7 instanceof RandomAccess)) {
            List<NestedMsg> list2 = q7;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                g(list2.get(i2), cls, arrayList);
            }
        } else {
            Iterator<T> it2 = q7.iterator();
            while (it2.hasNext()) {
                g((NestedMsg) it2.next(), cls, arrayList);
            }
        }
    }

    public static void h(Collection collection, Class cls, ArrayList arrayList, izs izsVar) {
        if (!(collection instanceof List) || !(collection instanceof RandomAccess)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                gtx0 gtx0Var = (Msg) it.next();
                if ((gtx0Var instanceof com.vk.im.engine.models.messages.a) && ((Boolean) izsVar.invoke(gtx0Var)).booleanValue()) {
                    g((com.vk.im.engine.models.messages.a) gtx0Var, cls, arrayList);
                }
            }
            return;
        }
        List list = (List) collection;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gtx0 gtx0Var2 = (Msg) list.get(i);
            if ((gtx0Var2 instanceof com.vk.im.engine.models.messages.a) && ((Boolean) izsVar.invoke(gtx0Var2)).booleanValue()) {
                g((com.vk.im.engine.models.messages.a) gtx0Var2, cls, arrayList);
            }
        }
    }

    public static /* synthetic */ void i(Collection collection, Class cls, ArrayList arrayList) {
        h(collection, cls, arrayList, new t3v(8));
    }

    public static boolean j(com.vk.im.engine.models.messages.a aVar) {
        List<Attach> K0 = aVar.K0();
        if (!(K0 instanceof Collection) || !K0.isEmpty()) {
            Iterator<T> it = K0.iterator();
            while (it.hasNext()) {
                if (((Attach) it.next()) instanceof AttachUgcSticker) {
                    return true;
                }
            }
        }
        List<NestedMsg> q7 = aVar.q7();
        if ((q7 instanceof Collection) && q7.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = q7.iterator();
        while (it2.hasNext()) {
            if (j((NestedMsg) it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.m2w
    public final String a() {
        return "msg-attaches-updates";
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029b  */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(w2w w2wVar) {
        List<Msg> g;
        List<Msg> g2;
        List<Msg> g3;
        AttachAudioMsg a7;
        Object obj;
        Object obj2;
        Long l;
        List<UGCStickerModel> list;
        Object obj3;
        Boolean bool = Boolean.TRUE;
        Collection<Msg> collection = this.c;
        if (collection.isEmpty() && this.b.isEmpty()) {
            L.e("NotifyContentVisibleViaBgCmd", "No content to update");
            return bool;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        i(collection, AttachPoll.class, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (w2wVar.f1() - ((AttachPoll) next).e > w2wVar.getConfig().B) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Integer.valueOf(((AttachPoll) it2.next()).b));
        }
        if (arrayList4.isEmpty()) {
            L.e("NotifyContentVisibleViaBgCmd", "All polls are actual");
            g = EmptyList.b;
        } else {
            g = w2wVar.I0().o().g(arrayList4);
        }
        arrayList.addAll(g);
        ArrayList arrayList5 = new ArrayList();
        h(collection, AttachVideo.class, arrayList5, new vsq(19));
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            AttachVideo attachVideo = (AttachVideo) next2;
            if (attachVideo.n == AttachSyncState.DONE && attachVideo.getId() != 0 && fkq0.c(attachVideo.b.I0())) {
                VideoFile videoFile = attachVideo.b;
                long j = attachVideo.e;
                boolean z = videoFile.Q0() && videoFile.w9().Ab(VideoUrl.URL_240) == null && videoFile.w9().Ab(VideoUrl.HLS_URL) == null;
                boolean contains = e.contains(Integer.valueOf(videoFile.l6()));
                if (z || !contains || videoFile.isEmpty()) {
                    if (w2wVar.f1() - j > w2wVar.getConfig().D) {
                        arrayList6.add(next2);
                    }
                } else if (w2wVar.f1() - j > w2wVar.getConfig().C) {
                    arrayList6.add(next2);
                }
            }
        }
        ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            arrayList7.add(Integer.valueOf(((AttachVideo) it4.next()).g));
        }
        if (arrayList7.isEmpty()) {
            L.e("NotifyContentVisibleViaBgCmd", "All videos are actual");
            g2 = EmptyList.b;
        } else {
            g2 = w2wVar.I0().o().g(arrayList7);
        }
        arrayList.addAll(g2);
        ArrayList arrayList8 = new ArrayList();
        i(collection, AttachStory.class, arrayList8);
        ArrayList arrayList9 = new ArrayList();
        Iterator it5 = arrayList8.iterator();
        while (it5.hasNext()) {
            AttachStory attachStory = (AttachStory) it5.next();
            VideoFile videoFile2 = attachStory.b.n;
            if (videoFile2 != null && attachStory.d == AttachSyncState.DONE && videoFile2.o0() != 0) {
                gzs<s3q0> gzsVar = fkq0.a;
            }
        }
        ArrayList arrayList10 = new ArrayList(c5g.u(arrayList9, 10));
        Iterator it6 = arrayList9.iterator();
        while (it6.hasNext()) {
            arrayList10.add(Integer.valueOf(((AttachStory) it6.next()).c));
        }
        if (arrayList10.isEmpty()) {
            L.e("NotifyContentVisibleViaBgCmd", "All stories are actual");
            g3 = EmptyList.b;
        } else {
            g3 = w2wVar.I0().o().g(arrayList10);
        }
        arrayList.addAll(g3);
        ArrayList arrayList11 = new ArrayList();
        h(collection, AttachUgcSticker.class, arrayList11, new u620(this, 8));
        ArrayList arrayList12 = new ArrayList();
        Iterator it7 = arrayList11.iterator();
        while (it7.hasNext()) {
            Object next3 = it7.next();
            AttachUgcSticker attachUgcSticker = (AttachUgcSticker) next3;
            Iterator<T> it8 = this.d.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    obj = next3;
                    obj2 = null;
                    break;
                }
                obj2 = it8.next();
                obj = next3;
                if (((ewp0) obj2).b == attachUgcSticker.f.d) {
                    break;
                }
                next3 = obj;
            }
            ewp0 ewp0Var = (ewp0) obj2;
            if (ewp0Var != null && (list = ewp0Var.c) != null) {
                Iterator<T> it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it9.next();
                    if (((UGCStickerModel) obj3).c == attachUgcSticker.f.c) {
                        break;
                    }
                }
                UGCStickerModel uGCStickerModel = (UGCStickerModel) obj3;
                if (uGCStickerModel != null) {
                    l = Long.valueOf(uGCStickerModel.g);
                    if (l != null) {
                        if (attachUgcSticker.f.f == UgcStatus.DELETED) {
                        }
                        arrayList12.add(obj);
                    } else if (attachUgcSticker.f.g < l.longValue()) {
                        if (attachUgcSticker.f.f == UgcStatus.DELETED) {
                        }
                        arrayList12.add(obj);
                    }
                }
            }
            l = null;
            if (l != null) {
            }
        }
        ArrayList arrayList13 = new ArrayList(c5g.u(arrayList12, 10));
        Iterator it10 = arrayList12.iterator();
        while (it10.hasNext()) {
            arrayList13.add(Integer.valueOf(((AttachUgcSticker) it10.next()).b));
        }
        arrayList.addAll(arrayList13.isEmpty() ? EmptyList.b : w2wVar.I0().o().g(arrayList13));
        ArrayList arrayList14 = new ArrayList();
        i(collection, AttachMarket.class, arrayList14);
        ArrayList arrayList15 = new ArrayList();
        Iterator it11 = arrayList14.iterator();
        while (it11.hasNext()) {
            Object next4 = it11.next();
            if (w2wVar.f1() - ((AttachMarket) next4).v > TimeUnit.DAYS.toMillis(1L)) {
                arrayList15.add(next4);
            }
        }
        ArrayList arrayList16 = new ArrayList(c5g.u(arrayList15, 10));
        Iterator it12 = arrayList15.iterator();
        while (it12.hasNext()) {
            arrayList16.add(Integer.valueOf(((AttachMarket) it12.next()).b));
        }
        arrayList.addAll(w2wVar.I0().o().g(arrayList16));
        Collection<Msg> collection2 = collection;
        ArrayList E = g5g.E(collection2, MsgFromUser.class);
        ArrayList arrayList17 = new ArrayList();
        Iterator it13 = E.iterator();
        while (it13.hasNext()) {
            Object next5 = it13.next();
            MsgFromUser msgFromUser = (MsgFromUser) next5;
            if (!msgFromUser.cc() && (a7 = msgFromUser.a7()) != null) {
                if (a7.j3()) {
                    arrayList17.add(next5);
                }
            }
        }
        ArrayList arrayList18 = new ArrayList();
        Iterator it14 = arrayList17.iterator();
        while (it14.hasNext()) {
            AttachAudioMsg a72 = ((MsgFromUser) it14.next()).a7();
            if (a72 != null) {
                arrayList18.add(a72);
            }
        }
        if (!arrayList18.isEmpty()) {
            Iterator it15 = arrayList18.iterator();
            while (it15.hasNext()) {
                w2wVar.J0(this, new com.vk.im.engine.commands.messages.f(null, Integer.valueOf(((AttachAudioMsg) it15.next()).b), "NotifyContentVisibleViaBgCmd", false));
            }
        }
        Set C = rli0.C(new ulp0(dli0.d(new ulp0(rli0.j(rli0.j(new i5g(collection2), ode.d), new gzn(23)), new xht(16))), new ye40(4)));
        if (!C.isEmpty()) {
            w2wVar.J0(this, new exs0(C));
        }
        if (arrayList.isEmpty()) {
            return bool;
        }
        MsgIdType msgIdType = MsgIdType.LOCAL_ID;
        ArrayList arrayList19 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it16 = arrayList.iterator();
        while (it16.hasNext()) {
            arrayList19.add(Integer.valueOf(((Msg) it16.next()).b));
        }
        w2wVar.L0(this, new dj30(msgIdType, arrayList19, null, Source.NETWORK, true, "NotifyContentVisibleViaBgCmd", 4));
        return bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk70)) {
            return false;
        }
        wk70 wk70Var = (wk70) obj;
        return epx.f(this.b, wk70Var.b) && epx.f(this.c, wk70Var.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "NotifyContentVisibleViaBgCmd(dialogs=" + this.b.size() + " items, msgs=" + this.c.size() + " items)";
    }

    public wk70(Collection collection, Collection collection2, List list, int i) {
        collection = (i & 1) != 0 ? EmptyList.b : collection;
        collection2 = (i & 2) != 0 ? EmptyList.b : collection2;
        list = (i & 4) != 0 ? EmptyList.b : list;
        this.b = collection;
        this.c = collection2;
        this.d = list;
    }
}
