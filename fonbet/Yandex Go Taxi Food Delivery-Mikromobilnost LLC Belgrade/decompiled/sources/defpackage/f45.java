package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.a;
import com.yandex.messaging.core.net.entities.ChatMuteData;
import com.yandex.messaging.core.net.entities.ChatMutingsBucket;
import com.yandex.messaging.internal.view.timeline.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import yads.t31;
import yads.wk2;

/* loaded from: classes15.dex */
public final /* synthetic */ class f45 implements nl21, go3, dx4, pke, m071 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f45(Object obj, Object obj2, boolean z) {
        this.c = obj;
        this.a = obj2;
        this.b = z;
    }

    @Override // defpackage.nl21
    public void B(o0k o0kVar) {
        c cVar = (c) this.c;
        String str = (String) this.a;
        cVar.F0 = o0kVar.a;
        cVar.J0(str, this.b);
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        u5b u5bVar = (u5b) this.c;
        String str = (String) this.a;
        ChatMutingsBucket chatMutingsBucket = (ChatMutingsBucket) obj;
        u5bVar.b(chatMutingsBucket);
        x5b b = u5bVar.b.b.m().b(str);
        if (b == null) {
            b = new x5b(str, false, false, null);
        }
        Long l = b.d;
        boolean z = this.b;
        if (l == null) {
            b = new x5b(str, z, false, Long.valueOf(chatMutingsBucket.version));
        }
        long longValue = b.d.longValue();
        String str2 = b.a;
        boolean z2 = b.c;
        ChatMutingsBucket chatMutingsBucket2 = new ChatMutingsBucket();
        chatMutingsBucket2.version = longValue;
        HashMap hashMap = new HashMap(1);
        chatMutingsBucket2.bucketValue = hashMap;
        hashMap.put(str2, new ChatMuteData(z, z2));
        u5bVar.a.d(ChatMutingsBucket.class, new tis0(u5bVar, z, str), chatMutingsBucket2);
    }

    @Override // defpackage.m071
    public wk2 a(int i, tu71 tu71Var, int[] iArr) {
        ba71 ba71Var = (ba71) this.c;
        zu81 zu81Var = (zu81) this.a;
        ba71Var.getClass();
        aa71 aa71Var = new aa71(ba71Var);
        p481 p481Var = t31.b;
        ela1.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i3 < tu71Var.a) {
            int i4 = i;
            tu71 tu71Var2 = tu71Var;
            ml81 ml81Var = new ml81(i4, tu71Var2, i3, zu81Var, iArr[i3], this.b, aa71Var);
            int i5 = i2 + 1;
            if (objArr.length < i5) {
                objArr = Arrays.copyOf(objArr, jr71.a(objArr.length, i5));
            }
            objArr[i2] = ml81Var;
            i3++;
            i2 = i5;
            i = i4;
            tu71Var = tu71Var2;
        }
        return t31.p(i2, objArr);
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        return ((Integer) task.k()).intValue() != 402 ? task : a.a((Context) this.c, (Intent) this.a, this.b).h(new b43(1), new zgl(25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        if (r11.b == false) goto L52;
     */
    @Override // defpackage.dx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(ru.yandex.taxi.search.view.a aVar, pv0 pv0Var) {
        String str;
        Object obj;
        u2t u2tVar;
        vef vefVar = (vef) this.c;
        dye dyeVar = (dye) this.a;
        zzs zzsVar = pv0Var != null ? pv0Var.j : null;
        if (pv0Var != null) {
            k56 k56Var = pv0Var.b;
            zzs zzsVar2 = pv0Var.j;
            if (zzsVar2 != null) {
                ber berVar = vefVar.b;
                boolean z = true;
                boolean z2 = berVar.a.isEnabled() && ((aer) berVar.a.b()).c;
                boolean z3 = (pv0Var.g == null && pv0Var.i == null) ? false : true;
                if (z2 && (str = k56Var.d) != null) {
                    List list = k56Var.a;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (jl40.l(((v46) obj).e, str)) {
                                    break;
                                }
                            }
                        }
                        v46 v46Var = (v46) obj;
                        if (v46Var != null && (u2tVar = v46Var.a) != null) {
                            z = d9b1.c(u2tVar, zzsVar2);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (z3) {
                        if (k56Var.f) {
                        }
                    }
                }
            }
        }
        zzsVar = pv0Var != null ? pv0Var.a.B() : null;
        dyeVar.invoke(zzsVar);
        aVar.h(null);
    }

    public /* synthetic */ f45(Object obj, boolean z, Object obj2) {
        this.c = obj;
        this.b = z;
        this.a = obj2;
    }
}
