package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import com.yandex.go.taxi.summary.mobilityhub.interactor.SourceDestinationStateInteractor$stateFlow$$inlined$start$1;
import com.yandex.go.taxi.summary.mobilityhub.interactor.q;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;
import kotlin.io.b;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.cache.PinCacheMode;

/* loaded from: classes6.dex */
public final class fcj0 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public fcj0(Context context, zlr0 zlr0Var) {
        this.a = context;
        this.b = null;
        this.c = zlr0Var;
        this.d = a.a(new b7p0(21, this));
        this.e = a.a(new iwq0(26));
    }

    public static String c(String str) {
        return (str == null || !evu0.y(str, "/", false)) ? "*" : str.substring(0, evu0.H(str, "/", 0, false, 6));
    }

    public k9s0 a() {
        return new k9s0(this);
    }

    public void b() {
        com.yandex.go.preorder.map.a aVar = (com.yandex.go.preorder.map.a) ((f0l0) this.c);
        aVar.getClass();
        aVar.b(new ohk0(12, aVar), false, true);
    }

    public PointF d(qzb0 qzb0Var) {
        mwb0 mwb0Var = qzb0Var.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        if (linkedHashMap != null && linkedHashMap.containsKey(mwb0Var)) {
            return (PointF) linkedHashMap.get(mwb0Var);
        }
        Map map = (Map) this.e;
        if (map != null && map.containsKey(mwb0Var)) {
            return (PointF) map.get(mwb0Var);
        }
        wub0 wub0Var = (wub0) this.b;
        mwb0 mwb0Var2 = qzb0Var.a;
        LinkedHashMap linkedHashMap2 = wub0Var.b;
        Object obj = linkedHashMap2.get(mwb0Var2);
        if (obj == null) {
            obj = ((y1c0) this.a).a(qzb0Var.c);
            if (obj != null) {
                linkedHashMap2.put(mwb0Var2, obj);
            } else {
                obj = null;
            }
        }
        return (PointF) obj;
    }

    public bov0 e() {
        return (bov0) this.a;
    }

    public SelectionOrigin f() {
        return (SelectionOrigin) this.e;
    }

    public File g() {
        Context context = (Activity) this.b;
        if (context == null) {
            context = (Context) this.a;
        }
        return new File(context.getCacheDir(), "share_plus");
    }

    public String h() {
        return (String) this.c;
    }

    public String i() {
        return (String) this.d;
    }

    public String j() {
        return (String) this.b;
    }

    public void k(Collection collection) {
        Collection<qzb0> collection2 = collection;
        int d = gw00.d(tcc.n(collection2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (qzb0 qzb0Var : collection2) {
            Pair pair = new Pair(qzb0Var.a, ((y1c0) this.c).a(qzb0Var.c));
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.d = linkedHashMap;
    }

    public void l(String str, String str2) {
        Context context = (Context) this.a;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        n(Intent.createChooser(intent, null, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((i3y) this.e).getValue()).intValue() | SelfTester_JCP.DECRYPT_CNT).getIntentSender()));
    }

    public void m(String str, String str2, List list, List list2) {
        boolean z;
        Context context = (Context) this.a;
        File g = g();
        File[] listFiles = g.listFiles();
        if (g.exists() && listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                file.delete();
            }
            g.delete();
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file2 = new File((String) it.next());
            try {
                z = cvu0.x(file2.getCanonicalPath(), g().getCanonicalPath(), false);
            } catch (IOException unused) {
                z = false;
            }
            if (z) {
                ny61.v(oyr.p("Shared file can not be located in '", g().getCanonicalPath(), "'"));
                return;
            }
            File g2 = g();
            if (!g2.exists()) {
                g2.mkdirs();
            }
            File file3 = new File(g2, file2.getName());
            b.k(file2, file3, true, 4);
            Context context2 = (Activity) this.b;
            if (context2 == null) {
                context2 = context;
            }
            arrayList.add(FileProvider.getUriForFile(context2, (String) ((i3y) this.d).getValue(), file3));
        }
        Intent intent = new Intent();
        if (arrayList.isEmpty() && str != null && !evu0.J(str)) {
            l(str, str2);
            return;
        }
        String str3 = "*/*";
        if (arrayList.size() == 1) {
            List list3 = list2;
            if (list3 != null && !list3.isEmpty()) {
                str3 = (String) kotlin.collections.a.P(list2);
            }
            intent.setAction("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) kotlin.collections.a.P(arrayList));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            if (list2 != null && !list2.isEmpty()) {
                if (list2.size() == 1) {
                    str3 = (String) kotlin.collections.a.P(list2);
                } else {
                    String str4 = (String) kotlin.collections.a.P(list2);
                    int f = scc.f(list2);
                    if (1 <= f) {
                        int i = 1;
                        while (true) {
                            if (!jl40.l(str4, list2.get(i))) {
                                if (!c(str4).equals(c((String) list2.get(i)))) {
                                    break;
                                } else {
                                    str4 = c((String) list2.get(i)).concat("/*");
                                }
                            }
                            if (i == f) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    str3 = str4;
                }
            }
            intent.setType(str3);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        intent.addFlags(1);
        Intent createChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((i3y) this.e).getValue()).intValue() | SelfTester_JCP.DECRYPT_CNT).getIntentSender());
        Context context3 = (Activity) this.b;
        if (context3 == null) {
            context3 = context;
        }
        Iterator<T> it2 = context3.getPackageManager().queryIntentActivities(createChooser, 65536).iterator();
        while (it2.hasNext()) {
            String str5 = ((ResolveInfo) it2.next()).activityInfo.packageName;
            Iterator<? extends Parcelable> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Uri uri = (Uri) it3.next();
                Context context4 = (Activity) this.b;
                if (context4 == null) {
                    context4 = context;
                }
                context4.grantUriPermission(str5, uri, 3);
            }
        }
        n(createChooser);
    }

    public void n(Intent intent) {
        ba20 ba20Var;
        Activity activity = (Activity) this.b;
        if (activity != null) {
            activity.startActivityForResult(intent, 22643);
            return;
        }
        intent.addFlags(SelfTester_JCP.IMITA);
        zlr0 zlr0Var = (zlr0) this.c;
        if (zlr0Var.b.compareAndSet(false, true) && (ba20Var = zlr0Var.a) != null) {
            ba20Var.success("dev.fluttercommunity.plus/share/unavailable");
            zlr0Var.a = null;
        }
        ((Context) this.a).startActivity(intent);
    }

    public tpr o() {
        tpr d = com.yandex.go.coroutines.b.d(new q(((com.yandex.go.route.interactor.b) this.d).k(), this), new SourceDestinationStateInteractor$stateFlow$$inlined$start$1(mct0.m, null));
        ((tt2) this.a).getClass();
        sjh sjhVar = uyj.a;
        return e.F(d, mdh.b);
    }

    public fcj0(exb0 exb0Var, y1c0 y1c0Var) {
        this.a = y1c0Var;
        this.b = exb0Var.a(PinCacheMode.TRANSIENT);
        this.c = y1c0Var;
    }

    public fcj0(zuj0 zuj0Var, a3v a3vVar, f0l0 f0l0Var, i4u i4uVar) {
        this.a = zuj0Var;
        this.b = a3vVar;
        this.c = f0l0Var;
        this.d = i4uVar;
        this.e = a.b(LazyThreadSafetyMode.NONE, new gas0(19, this));
    }

    public /* synthetic */ fcj0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public fcj0(bov0 bov0Var) {
        this.a = bov0Var;
    }
}
