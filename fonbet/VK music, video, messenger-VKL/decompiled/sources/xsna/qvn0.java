package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.nvn0;

/* compiled from: TabbarSettingsGroupDelegateImpl.kt */
/* loaded from: classes11.dex */
public final class qvn0 implements pvn0 {
    public static final /* synthetic */ qcy<Object>[] h;
    public final eun0 a;
    public final gxh b;
    public final rvn0 c;
    public final h7v d;
    public final b25 e;
    public final pgn f;
    public UserId g;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(qvn0.class, "reloadingCommunityDisposable", "getReloadingCommunityDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        h = new qcy[]{mutablePropertyReference1Impl};
    }

    public qvn0(eun0 eun0Var, gxh gxhVar, rvn0 rvn0Var, h7v h7vVar, b25 b25Var) {
        this.a = eun0Var;
        this.b = gxhVar;
        this.c = rvn0Var;
        this.d = h7vVar;
        this.e = b25Var;
        pgn pgnVar = new pgn();
        this.f = pgnVar;
        io.reactivex.rxjava3.subjects.f<awd0> fVar = o1e0.a.a;
        lug0 lug0Var = new lug0(new kug0(1));
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.o0 o0Var = new io.reactivex.rxjava3.internal.operators.observable.o0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, lug0Var), new mug0(new xw50(this, 1), 1));
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = o0Var.r0(asu0Var.c()).a0(asu0Var.d()).subscribe();
        qcy<Object> qcyVar = h[0];
        pgnVar.b(subscribe);
    }

    @Override // xsna.pvn0
    public final UserId a() {
        return this.a.a();
    }

    @Override // xsna.pvn0
    public final ArrayList b() {
        UserId userId;
        ArrayList<wvn0> b = this.c.b();
        ArrayList arrayList = new ArrayList(c5g.u(b, 10));
        for (wvn0 wvn0Var : b) {
            String b2 = wvn0Var.b();
            nvn0.o.getClass();
            if (epx.f(b2, nvn0.a.a()) && (userId = this.g) != null) {
                wvn0Var = wvn0.a(wvn0Var, userId);
            }
            arrayList.add(wvn0Var);
        }
        return arrayList;
    }

    @Override // xsna.pvn0
    public final void c(UserId userId) {
        this.g = userId;
    }

    @Override // xsna.pvn0
    public final void d(j58 j58Var) {
        if (this.d.a(HintId.GROUP_MANAGED_GROUP.getId())) {
            j58Var.post(new zv4(7, this, j58Var));
        }
    }

    @Override // xsna.pvn0
    public final io.reactivex.rxjava3.core.x<List<sh00>> e(boolean z) {
        if (!z) {
            return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(xqu.h(new zqu(), this.e.c(), Collections.singletonList(GroupsFilterDto.EDITOR), e43.l(GroupsFieldsDto.CAN_POST, GroupsFieldsDto.WALL, GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.CAN_UPLOAD_STORY, GroupsFieldsDto.CAN_UPLOAD_CLIP, GroupsFieldsDto.CAN_UPLOAD_VIDEO), null, null, 56))), new ca10(new b8j0(this, 10), 28)).l(new uq80(new exi0(this, 10), 5));
        }
        ArrayList M = this.b.M();
        ArrayList arrayList = new ArrayList(c5g.u(M, 10));
        Iterator it = M.iterator();
        while (it.hasNext()) {
            Group group = (Group) it.next();
            UserId e = !fkq0.b(group.c) ? fkq0.e(group.c) : group.c;
            String str = group.d;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = group.f;
            if (str3 == null) {
                String str4 = group.e;
                if (str4 != null) {
                    str2 = str4;
                }
            } else {
                str2 = str3;
            }
            arrayList.add(new sh00(e, str, str2));
        }
        int e2 = on00.e(c5g.u(arrayList, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((sh00) next).a(), next);
        }
        return io.reactivex.rxjava3.core.x.k(j5g.O0(linkedHashMap.values()));
    }

    @Override // xsna.pvn0
    public final void f() {
        this.a.g(null);
    }

    @Override // xsna.pvn0
    public final UserId g() {
        return this.g;
    }

    @Override // xsna.pvn0
    public final void invalidate() {
        this.g = null;
        qcy<Object> qcyVar = h[0];
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.f.b;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
