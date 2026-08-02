package yads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* loaded from: classes10.dex */
public final class zh2 {
    public final n93 a;
    public final lv b;
    public final a1 c;
    public final uh2 d;
    public final uf0 e;
    public final av f;

    public /* synthetic */ zh2(d4 d4Var, ov2 ov2Var, v9 v9Var, n93 n93Var, lv lvVar) {
        this(n93Var, lvVar, new a1(), new uh2(), new uf0(d4Var, ov2Var, v9Var), new av());
    }

    public final void a(th2 th2Var, uu uuVar, boolean z) {
        this.f.getClass();
        String a = av.a(uuVar);
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(CampaignEx.JSON_KEY_CLICK_URL, bc3.a(th2Var.b));
        mapBuilder.put("deeplink_package_name", th2Var.a);
        mapBuilder.put("deeplink_success", Boolean.valueOf(z));
        if (z) {
            mapBuilder.put("click_destination", a);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapBuilder.h());
        lv lvVar = this.b;
        dp2 dp2Var = dp2.w;
        fp2 a2 = lvVar.a(dp2Var, linkedHashMap);
        lvVar.d.a(a2);
        lvVar.f.a(dp2Var, a2.b, cp2.a, null);
    }

    public zh2(n93 n93Var, lv lvVar, a1 a1Var, uh2 uh2Var, uf0 uf0Var, av avVar) {
        this.a = n93Var;
        this.b = lvVar;
        this.c = a1Var;
        this.d = uh2Var;
        this.e = uf0Var;
        this.f = avVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, th2 th2Var, spj spjVar) {
        xh2 xh2Var;
        int i;
        zh2 zh2Var;
        uu uuVar;
        if (spjVar instanceof xh2) {
            xh2Var = (xh2) spjVar;
            int i2 = xh2Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xh2Var.g = i2 - Integer.MIN_VALUE;
                Object obj = xh2Var.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xh2Var.g;
                if (i != 0) {
                    kotlin.a.a(obj);
                    uu uuVar2 = new uu(th2Var);
                    try {
                        this.d.getClass();
                        Intent a = uh2.a(context, th2Var);
                        if (th2Var.e == bb0.d) {
                            uf0 uf0Var = this.e;
                            xh2Var.b = this;
                            xh2Var.c = th2Var;
                            xh2Var.d = uuVar2;
                            xh2Var.g = 1;
                            if (uf0Var.a(context, a, xh2Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            context.startActivity(a);
                        }
                        zh2Var = this;
                        uuVar = uuVar2;
                    } catch (Exception unused) {
                        zh2Var = this;
                        uuVar = uuVar2;
                        zh2Var.a.a(th2Var.g, uuVar);
                        zh2Var.a(th2Var, uuVar, false);
                        return Boolean.FALSE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uuVar = xh2Var.d;
                    th2Var = xh2Var.c;
                    zh2Var = xh2Var.b;
                    try {
                        kotlin.a.a(obj);
                    } catch (Exception unused2) {
                        zh2Var.a.a(th2Var.g, uuVar);
                        zh2Var.a(th2Var, uuVar, false);
                        return Boolean.FALSE;
                    }
                }
                zh2Var.a.a(th2Var.f, uuVar);
                zh2Var.a(th2Var, uuVar, true);
                return Boolean.TRUE;
            }
        }
        xh2Var = new xh2(this, spjVar);
        Object obj2 = xh2Var.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xh2Var.g;
        if (i != 0) {
        }
        zh2Var.a.a(th2Var.f, uuVar);
        zh2Var.a(th2Var, uuVar, true);
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0087 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, List list, spj spjVar) {
        yh2 yh2Var;
        int i;
        Activity activity;
        Iterator it;
        zh2 zh2Var;
        Context context2;
        if (spjVar instanceof yh2) {
            yh2Var = (yh2) spjVar;
            int i2 = yh2Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yh2Var.h = i2 - Integer.MIN_VALUE;
                Object obj = yh2Var.f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yh2Var.h;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Activity a = j1.a();
                    if (a != null) {
                        context = a;
                    } else {
                        this.c.getClass();
                        int i3 = 0;
                        Context context3 = context;
                        while (context3 instanceof ContextWrapper) {
                            int i4 = i3 + 1;
                            if (i3 >= 10) {
                                break;
                            }
                            if (context3 instanceof Activity) {
                                activity = (Activity) context3;
                                break;
                            }
                            context3 = ((ContextWrapper) context3).getBaseContext();
                            i3 = i4;
                        }
                        activity = null;
                        if (activity != null) {
                            context = activity;
                        }
                    }
                    it = list.iterator();
                    zh2Var = this;
                    context2 = context;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 th2Var = yh2Var.e;
                    it = yh2Var.d;
                    context2 = yh2Var.c;
                    zh2Var = yh2Var.b;
                    kotlin.a.a(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return th2Var;
                    }
                    if (it.hasNext()) {
                        th2Var = (th2) it.next();
                        yh2Var.b = zh2Var;
                        yh2Var.c = context2;
                        yh2Var.d = it;
                        yh2Var.e = th2Var;
                        yh2Var.h = 1;
                        obj = zh2Var.a(context2, th2Var, yh2Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                        if (it.hasNext()) {
                            return null;
                        }
                    }
                }
            }
        }
        yh2Var = new yh2(this, spjVar);
        Object obj2 = yh2Var.f;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yh2Var.h;
        if (i != 0) {
        }
    }
}
