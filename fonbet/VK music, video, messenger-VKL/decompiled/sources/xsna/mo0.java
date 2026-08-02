package xsna;

import android.os.Bundle;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.e;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.music.stickyplayer.domain.PlayerContext;
import java.util.LinkedList;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo0 implements gzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mo0(com.vk.core.fragments.e eVar, FragmentEntry fragmentEntry, boolean z) {
        this.d = eVar;
        this.e = fragmentEntry;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        boolean z2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj2;
                wh50 wh50Var = (wh50) obj;
                if (!jjc.d().a()) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (com.vk.core.utils.newtork.b.d()) {
                        boolean z3 = !z2;
                        wh50Var.setValue(Boolean.valueOf(z3));
                        izsVar.invoke(new sx40.m0(z3, PlayerContext.FULL));
                    } else {
                        izsVar.invoke(sx40.o.b);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 1:
                Integer num = (Integer) obj;
                xti0 xti0Var = ((iar) obj2).g;
                return "flush: compositeKey= " + (xti0Var != null ? xti0Var : null) + " force= " + z2 + ", batchNum= " + num;
            default:
                com.vk.core.fragments.e eVar = (com.vk.core.fragments.e) obj2;
                FragmentEntry fragmentEntry = (FragmentEntry) obj;
                FStack Ob = eVar.e.c.Ob();
                int size = Ob.c.size();
                vbs vbsVar = eVar.a;
                vbsVar.c();
                e.a aVar = eVar.d;
                if (!aVar.a(eVar.e.c.Ob().b, fragmentEntry) || eVar.e.c.Ob().c.isEmpty()) {
                    z = true;
                    eVar.e.c.Mb(fragmentEntry, new e.g(2, aVar, xas.class, "areFragmentsEquals", "areFragmentsEquals(Lcom/vk/core/fragments/FragmentEntry;Lcom/vk/core/fragments/FragmentEntry;)Z", 0));
                    FStack Ob2 = eVar.e.c.Ob();
                    FragmentEntry fragmentEntry2 = Ob2.b;
                    if (z2) {
                        eVar.L(new defpackage.g0(Ob2, fragmentEntry2, eVar, 2));
                    }
                    if (Ob2.c.isEmpty()) {
                        Bundle bundle = new Bundle(fragmentEntry.c);
                        fragmentEntry2.c.clear();
                        fragmentEntry2.c.putAll(bundle);
                        Ob2.Bb(fragmentEntry2);
                    }
                    eVar.d(Ob2.Cb(), null);
                } else {
                    FStack Ob3 = eVar.e.c.Ob();
                    LinkedList<FragmentEntry> linkedList = Ob3.c;
                    FragmentEntry fragmentEntry3 = Ob3.b;
                    FragmentEntry Cb = (linkedList.isEmpty() || epx.f(Ob3.Cb(), fragmentEntry3)) ? null : Ob3.Cb();
                    eVar.L(new defpackage.g0(Ob3, fragmentEntry3, eVar, 2));
                    if (linkedList.isEmpty()) {
                        Ob3.Bb(fragmentEntry3);
                    }
                    eVar.d(Ob3.Cb(), Cb);
                    z = true;
                }
                eVar.f(vbsVar);
                FStack Ob4 = eVar.e.c.Ob();
                eVar.I(Ob4.b, Ob != Ob4 ? z : false, size, Ob4.c.size());
                return s3q0.a;
        }
    }

    public /* synthetic */ mo0(iar iarVar, boolean z, Integer num) {
        this.d = iarVar;
        this.c = z;
        this.e = num;
    }

    public /* synthetic */ mo0(izs izsVar, wh50 wh50Var, boolean z) {
        this.c = z;
        this.d = izsVar;
        this.e = wh50Var;
    }
}
