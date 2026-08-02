package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ImItemListLoaderUpdater.kt */
/* loaded from: classes2.dex */
public final class d6w implements qsz<n5w, b6w> {
    public final io.reactivex.rxjava3.core.q<b6w> a;
    public final q5w b;

    public d6w(io.reactivex.rxjava3.core.q<b6w> qVar, q5w q5wVar) {
        this.a = qVar;
        this.b = q5wVar;
    }

    @Override // xsna.qsz
    public final io.reactivex.rxjava3.core.q<b6w> a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qsz
    public final n5w b(n5w n5wVar, b6w b6wVar, drz<n5w> drzVar, boolean z) {
        n5w n5wVar2 = n5wVar;
        b6w b6wVar2 = b6wVar;
        ProfilesInfo profilesInfo = n5wVar2.c;
        d5w d5wVar = n5wVar2.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemListLoaderUpdater update " + b6wVar2});
        }
        if (b6wVar2 instanceof mpx) {
            drzVar.b("");
            return n5wVar2;
        }
        if (!(b6wVar2 instanceof e6w)) {
            if (!(b6wVar2 instanceof o8w)) {
                throw new NoWhenBranchMatchedException();
            }
            ProfilesInfo profilesInfo2 = ((o8w) b6wVar2).a;
            Serializer.c<ProfilesInfo> cVar = ProfilesInfo.CREATOR;
            ProfilesInfo profilesInfo3 = new ProfilesInfo(profilesInfo);
            profilesInfo3.Hb(profilesInfo2);
            return new n5w(d5wVar, profilesInfo3);
        }
        Set<b5w> set = ((e6w) b6wVar2).a;
        q5w q5wVar = this.b;
        int i = 22;
        k7w k7wVar = (k7w) new io.reactivex.rxjava3.internal.operators.single.r(((lzv) q5wVar.b).b(q5wVar, ((mjg) q5wVar.c).c(new g5w(set, d5wVar))), new q9(new arf(q5wVar, i), 17)).l(new com.vk.movika.sdk.base.ui.j(new u4u(3), i)).c();
        m5w m5wVar = k7wVar.a;
        if (m5wVar == ((m5w) m5w.c.getValue())) {
            return n5wVar2;
        }
        d5w d5wVar2 = m5wVar.a;
        List<a5w> list = d5wVar2.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a5w) it.next()).t3());
        }
        Set S0 = j5g.S0(arrayList);
        List<a5w> list2 = d5wVar.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            a5w a5wVar = (a5w) obj;
            if (!m5wVar.b.contains(a5wVar.t3()) && !S0.contains(a5wVar.t3())) {
                arrayList2.add(obj);
            }
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemListLoaderUpdater filteredOldList\n" + j5g.g0(arrayList2, "\n", null, null, 0, new xpt(2), 30)});
        }
        List D0 = j5g.D0(new c6w(), j5g.u0(d5wVar2.a, arrayList2));
        L.d(new sbg(D0, 26));
        Map<b5w, Msg> map = d5wVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<b5w, Msg> entry : map.entrySet()) {
            if (!S0.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap n = pn00.n(linkedHashMap, d5wVar2.b);
        Set R0 = j5g.R0(d5wVar.c);
        R0.addAll(d5wVar2.c);
        s3q0 s3q0Var = s3q0.a;
        d5w a = d5w.a(d5wVar, D0, n, R0, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        profilesInfo.Hb(k7wVar.b);
        return new n5w(a, profilesInfo);
    }
}
