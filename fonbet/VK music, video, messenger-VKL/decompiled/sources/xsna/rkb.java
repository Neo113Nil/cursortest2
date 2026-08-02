package xsna;

import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ChannelsSuggestedListLoaderImpl.kt */
/* loaded from: classes.dex */
public final class rkb {
    public final a1w a;
    public final mkb b;
    public final v3q c;
    public final gz9 d;
    public io.reactivex.rxjava3.disposables.c e;
    public io.reactivex.rxjava3.disposables.c f;
    public int g = 2;
    public final io.reactivex.rxjava3.subjects.d<nkb> h;
    public final io.reactivex.rxjava3.internal.operators.observable.y i;

    public rkb(a1w a1wVar, mkb mkbVar, v3q v3qVar, f9w f9wVar) {
        this.a = a1wVar;
        this.b = mkbVar;
        this.c = v3qVar;
        this.d = new gz9(f9wVar);
        io.reactivex.rxjava3.subjects.d<nkb> O0 = io.reactivex.rxjava3.subjects.d.O0(new nkb(0));
        this.h = O0;
        this.i = new io.reactivex.rxjava3.internal.operators.observable.y(O0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public final nkb a(sfb sfbVar, int i) {
        List<Channel> k = sfbVar.a().k();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) k).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Channel) next).zb() == ChannelActionInProgress.NONE) {
                arrayList.add(next);
            }
        }
        List H0 = j5g.H0(arrayList, this.g);
        LinkedHashMap s = sfbVar.a().s();
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(s.size()));
        for (Map.Entry entry : s.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            MsgFromChannel msgFromChannel = value instanceof MsgFromChannel ? (MsgFromChannel) value : null;
            if (msgFromChannel == null) {
                throw new IllegalStateException("Messages from channel must be inherited from MsgFromChannel.");
            }
            linkedHashMap.put(key, msgFromChannel);
        }
        return new nkb(H0, linkedHashMap, sfbVar.b(), H0.size(), i);
    }

    public final int b() {
        Integer a = ((ChannelsCounters) vdg0.c(this.a.n(this, new peb(2, Source.CACHE)))).a().a();
        if (a != null) {
            return a.intValue();
        }
        return 0;
    }

    public final void c() {
        if (!hg1.d(this.e)) {
            this.e = io.reactivex.rxjava3.kotlin.c.f(3, this.a.l.a(), null, null, new v5(this, 17));
        }
        if (hg1.d(this.f)) {
            return;
        }
        this.f = io.reactivex.rxjava3.core.x.e(new io.reactivex.rxjava3.internal.operators.single.v(new okb(this, 0)), new io.reactivex.rxjava3.internal.operators.single.v(new pkb(this, 0))).m(this.c.c()).subscribe(new xz(new j9(this, 20), 11), new k41(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 13), 9));
    }
}
