package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.jns;
import xsna.mms;
import xsna.otf0;
import xsna.pf90;
import xsna.uns;
import xsna.wns;

/* compiled from: FriendsCleanupFeature.kt */
/* loaded from: classes15.dex */
public final class xms extends wk50<cos, wns, mms, jns> {
    public final vns f;
    public final tms g;
    public final gns h;
    public final qns i;
    public final f4z j;
    public final f4z k;

    public xms(pns pnsVar, vns vnsVar, tms tmsVar, gns gnsVar, qns qnsVar) {
        super(mms.e.b, pnsVar);
        this.f = vnsVar;
        this.g = tmsVar;
        this.h = gnsVar;
        this.i = qnsVar;
        this.j = new f4z();
        this.k = new f4z();
    }

    @Override // xsna.wk50
    public final void N(wns wnsVar, mms mmsVar) {
        Object obj;
        wns wnsVar2 = wnsVar;
        mms mmsVar2 = mmsVar;
        boolean z = mmsVar2 instanceof mms.e;
        jns.b.c cVar = jns.b.c.b;
        qns qnsVar = this.i;
        if (z) {
            T(cVar);
            a7f0.a.f(this, qnsVar.a(), new qcl(this, 12), new rop(this, 5), 1);
            return;
        }
        if (mmsVar2 instanceof mms.g) {
            mms.g gVar = (mms.g) mmsVar2;
            if (gVar instanceof mms.g.b) {
                T(cVar);
                a7f0.a.f(this, qnsVar.a(), new qcl(this, 12), new rop(this, 5), 1);
                return;
            } else {
                if (!(gVar instanceof mms.g.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if ((wnsVar2 instanceof wns.a) && (((wns.a) wnsVar2).c instanceof otf0.a)) {
                    T(jns.d.c.b);
                    a7f0.a.f(this, qnsVar.a(), new fgh(this, 16), new l2i(this, 13), 1);
                    return;
                }
                return;
            }
        }
        if (mmsVar2 instanceof mms.f) {
            mms.f fVar = (mms.f) mmsVar2;
            if (wnsVar2 instanceof wns.a) {
                wns.a aVar = (wns.a) wnsVar2;
                rms rmsVar = aVar.b;
                if (rmsVar.f && (aVar.c instanceof otf0.a)) {
                    if (!(fVar instanceof mms.f.b) || (aVar.d instanceof pf90.b)) {
                        T(jns.c.C3133c.b);
                        rmsVar.b.size();
                        a7f0.a.f(this, qnsVar.a(), new t1e(this, 25), new m4g(this, 23), 1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z2 = mmsVar2 instanceof nms;
        f4z f4zVar = this.j;
        if (z2) {
            nms nmsVar = (nms) mmsVar2;
            UserId userId = nmsVar.b;
            if (wnsVar2 instanceof wns.a) {
                rms rmsVar2 = ((wns.a) wnsVar2).b;
                List<UserId> list = rmsVar2.e;
                List<UsersUserFullDto> list2 = rmsVar2.b;
                if (list.contains(userId)) {
                    UserId userId2 = nmsVar.b;
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (epx.f(((UsersUserFullDto) obj).s1(), userId2)) {
                                break;
                            }
                        }
                    }
                    UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
                    a7f0.a.f(this, rsg0.w0(yfb.x(nts.d((ots) qnsVar.b, userId2, null, null, qnsVar.a, null, null, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE))), new ync(usersUserFullDto != null ? usersUserFullDto.M2() : null, this, userId2, 3), new uoh(this, 19), 1);
                    return;
                }
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (epx.f(((UsersUserFullDto) next).s1(), userId)) {
                        r4 = next;
                        break;
                    }
                }
                UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) r4;
                if (usersUserFullDto2 == null) {
                    return;
                }
                f4zVar.b(new uns.a.d(userId, usersUserFullDto2.H0() + ' ' + usersUserFullDto2.z1(), rmsVar2.g));
                return;
            }
            return;
        }
        if (mmsVar2 instanceof oms) {
            f4zVar.b(new uns.b.C3812b(((oms) mmsVar2).b));
            return;
        }
        if (mmsVar2 instanceof mms.c) {
            if (wnsVar2 instanceof wns.a) {
                rms rmsVar3 = ((wns.a) wnsVar2).b;
                f4zVar.b(new uns.a.b(rmsVar3.d, rmsVar3.g));
                return;
            }
            return;
        }
        if (!(mmsVar2 instanceof mms.b)) {
            if (!(mmsVar2 instanceof mms.d)) {
                if (!(mmsVar2 instanceof mms.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z3 = false;
                if (wnsVar2 instanceof wns.a) {
                    rms rmsVar4 = ((wns.a) wnsVar2).b;
                    if (rmsVar4.e.size() == rmsVar4.d) {
                        z3 = true;
                    }
                }
                f4zVar.b(new uns.b.a(z3, true));
                return;
            }
            mms.d dVar = (mms.d) mmsVar2;
            if (wnsVar2 instanceof wns.a) {
                Iterator<T> it3 = ((wns.a) wnsVar2).b.b.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (epx.f(((UsersUserFullDto) next2).s1(), dVar.b)) {
                        r4 = next2;
                        break;
                    }
                }
                a7f0.a.f(this, rsg0.w0(yfb.x(nts.g((ots) qnsVar.b, dVar.b, null, null, qnsVar.a, Boolean.valueOf(!dVar.c), 6))), new jy5(this, (UsersUserFullDto) r4, dVar, 4), new wze(this, 29), 1);
                return;
            }
            return;
        }
        mms.b bVar = (mms.b) mmsVar2;
        if (wnsVar2 instanceof wns.a) {
            rms rmsVar5 = ((wns.a) wnsVar2).b;
            List<UserId> list3 = rmsVar5.e;
            List<UsersUserFullDto> list4 = rmsVar5.b;
            ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList.add(((UsersUserFullDto) it4.next()).s1());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                Object next3 = it5.next();
                if (!list3.contains((UserId) next3)) {
                    arrayList2.add(next3);
                }
            }
            boolean z4 = bVar.b;
            ots otsVar = (ots) qnsVar.b;
            String str = qnsVar.a;
            Boolean valueOf = Boolean.valueOf(!z4);
            otsVar.getClass();
            tfx tfxVar = new tfx("friends.deleteBulk", new ir(21), new jr(17));
            tfx.p(tfxVar, "user_ids", arrayList2, 1L, 8);
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
            tfxVar.j("remove_fan", valueOf.booleanValue());
            a7f0.a.d(this, rsg0.Z(yfb.x(tfxVar)), null, new zkh(this, 17), new ncg(this, 22), 1);
        }
    }
}
