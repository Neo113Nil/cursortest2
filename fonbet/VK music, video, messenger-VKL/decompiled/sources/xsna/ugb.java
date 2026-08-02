package xsna;

import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelFilter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.rfb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ugb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ugb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        rfb.a.b bVar;
        switch (this.b) {
            case 0:
                wgb wgbVar = (wgb) this.c;
                qfb qfbVar = (qfb) this.d;
                ChannelFilter channelFilter = wgbVar.a;
                gz9 gz9Var = wgbVar.b;
                Iterator it = qfbVar.f.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (!qfbVar.d().contains(Long.valueOf(((Channel) next).b))) {
                            i = i2;
                        }
                    } else {
                        i = -1;
                    }
                }
                ArrayList arrayList = qfbVar.f;
                if (i < 0) {
                    bVar = arrayList.isEmpty() ? new rfb.a.b(aeb.e, channelFilter, 30) : new rfb.a.b(((Channel) j5g.i0(arrayList)).s, channelFilter, 30);
                } else {
                    aeb aebVar = i == 0 ? aeb.e : ((Channel) arrayList.get(i - 1)).s;
                    int size = (arrayList.size() - i) + 2;
                    bVar = new rfb.a.b(aebVar, channelFilter, size <= 30 ? size : 30);
                }
                gz9Var.a(new dy0(4, wgbVar, bVar));
                wgbVar.g.b(bVar);
                gz9Var.a(new com.vk.movika.tools.controls.seekbar.f(3, wgbVar, bVar));
                wgbVar.b(new uf1(10, wgbVar, bVar));
                return;
            default:
                ((ArrayList) ((s140) this.c).c).remove((Pair) this.d);
                return;
        }
    }
}
