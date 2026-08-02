package xsna;

import android.content.Context;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import xsna.awr0;
import xsna.dz40;
import xsna.sx40;
import xsna.we20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class kk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kk(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.c;
                CallMemberId callMemberId = (CallMemberId) this.d;
                String str = (String) this.e;
                accessibilityEvents.c("userSetReaction(" + callMemberId + "->" + str + ')');
                AccessibilityEvents.f a = accessibilityEvents.a(AccessibilityEvents.Event.REACTIONS, callMemberId);
                if (a != null) {
                    LinkedHashMap linkedHashMap = a.b;
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new HashSet();
                        linkedHashMap.put(str, obj);
                    }
                    ((Set) obj).add(callMemberId);
                }
                accessibilityEvents.f();
                return s3q0.a;
            case 1:
                dz40.d.e eVar = (dz40.d.e) this.c;
                izs izsVar = (izs) this.d;
                rg50 rg50Var = (rg50) this.e;
                if (!(eVar.c() instanceof DownloadingState.Downloading)) {
                    if (eVar.c() instanceof DownloadingState.NotLoaded) {
                        rg50Var.C(rg50Var.getIntValue() + 1);
                    }
                    izsVar.invoke(new sx40.b.j(eVar.c() instanceof DownloadingState.Downloaded));
                }
                return s3q0.a;
            case 2:
                ((qkc) this.c).i((Context) this.d, (ClickableMarketItem) this.e);
                return s3q0.a;
            case 3:
                a1w a1wVar = (a1w) this.c;
                return new com.vk.folders.impl.model.a(a1wVar, zq70.t((yj50) this.d, (String) this.e, a1wVar));
            case 4:
                return (we20.b) ((l7r0) this.c).d((ij20) this.d, (we20.a) this.e);
            case 5:
                za30 za30Var = (za30) this.c;
                nb30 nb30Var = (nb30) this.d;
                nb30 nb30Var2 = (nb30) this.e;
                Iterator it = za30Var.e.iterator();
                while (it.hasNext()) {
                    ((bb30) it.next()).b(nb30Var, nb30Var2);
                }
                return s3q0.a;
            case 6:
                UserId userId = (UserId) this.c;
                MusicTrack musicTrack = (MusicTrack) this.d;
                String str2 = (String) this.e;
                StringBuilder sb = new StringBuilder("uid=");
                sb.append(userId.b);
                sb.append("; mid=");
                sb.append(musicTrack.Fb());
                sb.append("; pid=");
                if (str2 == null) {
                    str2 = "-2147483648";
                }
                sb.append(str2);
                return sb.toString();
            default:
                ((izs) this.c).invoke(new awr0.d(((dqt0) this.d).b, p490.C((tny) ((bpf0) this.e).a)));
                return s3q0.a;
        }
    }
}
