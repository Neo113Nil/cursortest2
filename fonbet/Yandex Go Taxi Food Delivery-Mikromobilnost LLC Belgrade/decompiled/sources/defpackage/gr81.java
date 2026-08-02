package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cloudmessaging.a;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.internal.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import yads.w4;

/* loaded from: classes7.dex */
public class gr81 implements ch61, wx60, fx71, b991, pke {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public gr81(Bitmap bitmap) {
        this.a = 8;
        this.b = bitmap;
        int i = dh91.a[bitmap.getConfig().ordinal()];
        this.c = new ic91(i != 1 ? i != 2 ? 0 : 1 : 8, 1);
    }

    @Override // defpackage.ch61
    public void a(String str) {
        String a = ((jj71) this.c).a(str, b.f());
        if (a.length() > 0) {
            ((vmn0) this.b).a(a);
        }
    }

    public LinkedHashMap b(Context context) {
        a081 a081Var;
        a081 a081Var2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nl61 nl61Var = ((fe81) this.b).e;
        if (nl61Var != null) {
            Map map = nl61Var.b;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            a081 a081Var3 = a081.g;
            if (a081Var3 == null) {
                synchronized (a081.f) {
                    a081Var2 = a081.g;
                    if (a081Var2 == null) {
                        a081Var2 = new a081();
                        a081.g = a081Var2;
                    }
                }
                a081Var3 = a081Var2;
            }
            Boolean c = a081Var3.c();
            if (c != null) {
                linkedHashMap.put("age_restricted_user", c);
            }
            a081 a081Var4 = a081.g;
            if (a081Var4 == null) {
                synchronized (a081.f) {
                    a081Var = a081.g;
                    if (a081Var == null) {
                        a081Var = new a081();
                        a081.g = a081Var;
                    }
                }
                a081Var4 = a081Var;
            }
            gg81 a = a081Var4.a(context);
            Boolean bool = a != null ? a.Z : null;
            if (bool != null) {
                linkedHashMap.put("user_consent", bool);
            }
        }
        vc71 vc71Var = ((p671) ((fe81) this.b).b.c).a;
        ((fw81) this.c).getClass();
        boolean b = fw81.b(context);
        if (vc71Var != null) {
            boolean z = vc71Var.b;
            String str = vc71Var.a;
            if (!b && !z) {
                linkedHashMap.put("google_aid", str);
            }
        }
        linkedHashMap.put("gms_available", Boolean.valueOf(((c171) ((fe81) this.b).b.b).e));
        linkedHashMap.put("sdk_version", "8.0.0-beta.1");
        return linkedHashMap;
    }

    @Override // defpackage.fx71
    public void c(w4 w4Var) {
        ((Handler) this.c).post(new hos0(17, this, w4Var));
    }

    @Override // defpackage.fx71
    public void f() {
        ((Handler) this.c).post(new v191(this));
    }

    @Override // defpackage.fx71
    public void g() {
        ((Handler) this.c).post(new hos0(16, this));
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        Bundle bundle;
        a aVar = (a) this.b;
        Bundle bundle2 = (Bundle) this.c;
        aVar.getClass();
        return (task.o() && (bundle = (Bundle) task.k()) != null && bundle.containsKey("google.messenger")) ? aVar.a(bundle2).q(ykj.w, q501.y) : task;
    }

    @Override // defpackage.fx71
    public void i() {
        ((Handler) this.c).post(new hos0(16, this));
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        switch (this.a) {
            case 3:
                ((rx81) this.c).b.remove((atx0) this.b);
                return;
            case 11:
                c cVar = (c) this.b;
                atx0 atx0Var = (atx0) this.c;
                synchronized (cVar.f) {
                    cVar.e.remove(atx0Var);
                }
                return;
            default:
                com.google.android.play.core.splitinstall.internal.c cVar2 = (com.google.android.play.core.splitinstall.internal.c) this.b;
                atx0 atx0Var2 = (atx0) this.c;
                synchronized (cVar2.f) {
                    cVar2.e.remove(atx0Var2);
                }
                return;
        }
    }

    @Override // defpackage.b991
    public cr71 a(r691 r691Var) {
        cr71 j = ((cr71) this.b).j();
        j.p((String) this.c, r691Var);
        return j;
    }

    public /* synthetic */ gr81(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public gr81(rx81 rx81Var, atx0 atx0Var) {
        this.a = 3;
        this.c = rx81Var;
        this.b = atx0Var;
    }

    public gr81(vmn0 vmn0Var) {
        this.a = 0;
        jj71 jj71Var = new jj71();
        this.b = vmn0Var;
        this.c = jj71Var;
    }

    public /* synthetic */ gr81(int i) {
        this.a = i;
    }

    public gr81(cf71 cf71Var) {
        this.a = 4;
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = cf71Var;
        this.c = handler;
    }

    public gr81(fe81 fe81Var) {
        this.a = 2;
        fw81 fw81Var = new fw81();
        this.b = fe81Var;
        this.c = fw81Var;
    }
}
