package xsna;

import android.text.TextUtils;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.SearchMode;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;

/* compiled from: SharingImEngineRepository.kt */
/* loaded from: classes5.dex */
public final class vbj0 implements dcj0 {
    public final f1w a;
    public final xbw b;
    public final lzv c;
    public final izv d;

    public vbj0(f1w f1wVar, xbw xbwVar, lzv lzvVar, izv izvVar) {
        this.a = f1wVar;
        this.b = xbwVar;
        this.c = lzvVar;
        this.d = izvVar;
    }

    @Override // xsna.dcj0
    public final io.reactivex.rxjava3.internal.jdk8.a a() {
        return new io.reactivex.rxjava3.internal.jdk8.a(this.b.a(), new a840(new hwi0(2), 8));
    }

    @Override // xsna.dcj0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return g(new f9f0(i, Source.NETWORK), new f9f0(i, Source.CACHE), new ubj0(0));
        }
        Source source = Source.NETWORK;
        SearchMode searchMode = SearchMode.PEERS;
        return g(new kx30(str, source, searchMode, 0, 0, null, null, false, false, null, null, 4088), new kx30(str, Source.CACHE, searchMode, 0, 0, null, null, false, false, null, null, 4088), new byo(24));
    }

    @Override // xsna.dcj0
    public final io.reactivex.rxjava3.internal.operators.single.y c(gkx0 gkx0Var, int i, Object obj, List list, Integer num) {
        return this.c.b(this, new i7j0(gkx0Var, i, true, obj, list, num)).l(new u1j0(new s6x(29), 1));
    }

    @Override // xsna.dcj0
    public final Set<UserId> d() {
        return this.a.c().j();
    }

    @Override // xsna.dcj0
    public final void e(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.d.b(this, new gl0(Peer.a.b(j)));
    }

    @Override // xsna.dcj0
    public final boolean f(String str, long j, String str2, String str3, Attachment attachment, String str4, String str5, String str6) {
        Attach b;
        List singletonList = (attachment == null || (b = ca3.b(attachment)) == null) ? EmptyList.b : Collections.singletonList(b);
        ocw ocwVar = ocw.a;
        if (!ocw.c(j, singletonList)) {
            return false;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b2 = Peer.a.b(j);
        if (str3 == null) {
            str3 = "";
        }
        Attach attach = (Attach) j5g.a0(singletonList);
        if (str4 == null) {
            str4 = "";
        }
        if (str5 == null) {
            str5 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        itg0.n(this.c.b(str, new cz30(b2, str2, str3, attach, str4, str5, str6)));
        return true;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 g(le6 le6Var, le6 le6Var2, izs izsVar) {
        AtomicReference atomicReference = new AtomicReference();
        lzv lzvVar = this.c;
        return new io.reactivex.rxjava3.internal.operators.observable.v0(io.reactivex.rxjava3.core.x.e(lzvVar.b("l4o0", le6Var2).l(new p5w(new dgt(izsVar, 1), 17)), new io.reactivex.rxjava3.internal.operators.single.d0(lzvVar.b("l4o0", le6Var).l(new vii0(new d8k(izsVar, 4), 1)), new oyh0(1), null))).U(new xq70(new n9(25, atomicReference, this), 12));
    }
}
