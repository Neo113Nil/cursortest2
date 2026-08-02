package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import com.adjust.sdk.Constants;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketActivationType;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketOrderAction;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketTappedButtonName;
import com.yandex.go.multimodal_route.interactors.i;
import com.yandex.go.multimodal_route.ui.rate_route.e;
import com.yandex.go.multimodal_route.ui.rate_route.f;
import com.yandex.go.multimodal_route.ui.rate_route.g;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Result;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.network.entities.exceptions.NetworkException;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;
import ru.rt.ebs.cryptosdk.core.networkClient.entities.INetworkClient;
import ru.rt.ebs.cryptosdk.core.networkClient.entities.NetworkClientMultipartBodyPart;
import ru.rt.ebs.cryptosdk.core.networkClient.entities.NetworkClientRequest;
import ru.rt.ebs.cryptosdk.core.networkClient.entities.NetworkClientResponse;
import ru.yandex.taxi.locationsdk.core.input_controller.internal.b;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.d;
import ru.yandex.taxi.masstransit.tickets.analyticks.MasstransitTicketsAnalytics$OrderAction;
import ru.yandex.taxi.masstransit.tickets.analyticks.MasstransitTicketsAnalytics$TicketActivationType;
import ru.yandex.taxi.masstransit.tickets.analyticks.MasstransitTicketsAnalytics$TicketTappedButtonName;
import ru.yandex.taxi.widget.c;

/* loaded from: classes15.dex */
public final class at20 implements INetworkClient, aor0, bw70, zo90 {
    public static at20 c;
    public Object a;
    public Object b;

    public at20() {
        this.a = new LongSparseArray();
        this.b = new PriorityQueue();
    }

    public static String h() {
        try {
            Process exec = Runtime.getRuntime().exec("logcat -d");
            InputStream inputStream = exec.getInputStream();
            Charset charset = uza.a;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
            try {
                String x0 = cma1.x0(bufferedReader);
                bufferedReader.close();
                bufferedReader = new BufferedReader(new InputStreamReader(exec.getErrorStream(), charset), 8192);
                try {
                    String x02 = cma1.x0(bufferedReader);
                    bufferedReader.close();
                    int waitFor = exec.waitFor();
                    if (waitFor == 0 && evu0.J(x02)) {
                        return x0;
                    }
                    return "Error reading logcat (exit code " + waitFor + "):\n" + x02;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Exception e) {
            return g8e.o("Error reading logcat: ", e.getMessage());
        }
    }

    public static boolean m(File file, ArrayList arrayList) {
        Object failure;
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                        rzo.l(fileInputStream, zipOutputStream);
                        zipOutputStream.closeEntry();
                        fileInputStream.close();
                    } finally {
                    }
                }
                zipOutputStream.close();
                failure = zy11.a;
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return !(failure instanceof Result.Failure);
    }

    public d a(b bVar, jz60 jz60Var) {
        return new d((TimestampSelector) this.b, (c7z) this.a, jz60Var, bVar);
    }

    public boolean b(String str) {
        Object failure;
        n5 n5Var = (n5) this.b;
        Object obj = zy11.a;
        String format = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.US).format(new Date());
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            parentFile = new File(Extension.DOT_CHAR);
        }
        File file2 = new File(parentFile, qv10.j(System.currentTimeMillis(), "report_temp_"));
        try {
            if (!file2.mkdirs()) {
                kotlin.io.b.l(file2);
                return false;
            }
            File file3 = new File(file2, String.format("observability_report_%s.txt", Arrays.copyOf(new Object[]{format}, 1)));
            try {
                g3r.g(file3, c(format));
                failure = obj;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                kotlin.io.b.l(file2);
                return false;
            }
            File file4 = new File(file2, String.format("logcat_%s.txt", Arrays.copyOf(new Object[]{format}, 1)));
            try {
                g3r.g(file4, h());
            } catch (Throwable th2) {
                obj = new Result.Failure(th2);
            }
            if (obj instanceof Result.Failure) {
                kotlin.io.b.l(file2);
                return false;
            }
            List list = (List) n5Var.invoke();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                File file5 = (File) obj2;
                if (file5.exists() && file5.isFile()) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                kotlin.io.b.l(file2);
                return false;
            }
            boolean m = m(file, a.m0(arrayList, scc.g(file3, file4)));
            kotlin.io.b.l(file2);
            return m;
        } catch (Throwable th3) {
            kotlin.io.b.l(file2);
            throw th3;
        }
    }

    public String c(String str) {
        TreeMap treeMap = new TreeMap((Map) ((d4) this.a).invoke());
        StringBuilder sb = new StringBuilder("Mobile Observability Report\n");
        sb.append("Generated on: ".concat(str));
        sb.append("\n========================================\n\n");
        if (treeMap.isEmpty()) {
            sb.append("No environment data available\n");
        } else {
            for (Map.Entry entry : treeMap.entrySet()) {
                sb.append(((String) entry.getKey()) + Extension.COLON_SPACE + ((String) entry.getValue()));
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public MtTicketActivationType d(String str) {
        Object obj;
        Iterator it = ((w740) this.b).a.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((r640) obj).a, str)) {
                break;
            }
        }
        r640 r640Var = (r640) obj;
        if (r640Var != null) {
            return r640Var.b;
        }
        return null;
    }

    public void e(o2y0 o2y0Var, String str, String str2) {
        c4g c4gVar = (c4g) ((gyc) this.b).a;
        xvf0 b = i5m.b(dv40.a);
        xvf0 b2 = i5m.b(av40.a);
        xvf0 b3 = i5m.b(xv40.a);
        wz30 wz30Var = new wz30((y3g) c4gVar.G, 15);
        c0g c0gVar = (c0g) ((i6r) c4gVar.a);
        tt2 tt2Var = (tt2) c0gVar.z.n.get();
        q5z.h(tt2Var);
        cv40 cv40Var = (cv40) b.get();
        zu40 zu40Var = (zu40) b2.get();
        wv40 wv40Var = (wv40) b3.get();
        on2 l3 = c0gVar.l3();
        q5z.h(l3);
        com.yandex.go.multimodal_route.repositories.b bVar = new com.yandex.go.multimodal_route.repositories.b(l3);
        c b4 = c0gVar.b();
        q5z.h(b4);
        com.yandex.go.multimodal_route.ui.rate_route.mappers.a aVar = new com.yandex.go.multimodal_route.ui.rate_route.mappers.a(b4);
        zuj0 c2 = c0gVar.c();
        q5z.h(c2);
        yu40 H5 = c0gVar.H5();
        q5z.h(H5);
        g gVar = new g(tt2Var, cv40Var, zu40Var, wv40Var, bVar, aVar, c2, H5, c4gVar.b());
        cv40 cv40Var2 = (cv40) b.get();
        zu40 zu40Var2 = (zu40) b2.get();
        wv40 wv40Var2 = (wv40) b3.get();
        h3y a = i5m.a(wz30Var);
        yu40 H52 = c0gVar.H5();
        q5z.h(H52);
        f fVar = new f(cv40Var2, zu40Var2, wv40Var2, a, H52, c4gVar.b());
        Context H1 = c0gVar.H1();
        q5z.h(H1);
        d130 a2 = c4gVar.a();
        yu40 H53 = c0gVar.H5();
        q5z.h(H53);
        p2y0 p2y0Var = (p2y0) c0gVar.z.J2.get();
        q5z.h(p2y0Var);
        ysg ysgVar = (ysg) c0gVar.z.I2.get();
        q5z.h(ysgVar);
        yu40 H54 = c0gVar.H5();
        q5z.h(H54);
        ((ra00) this.a).b(new e(gVar, fVar, H1, a2, H53, new i(p2y0Var, ysgVar, H54)), new iv40(o2y0Var, str, str2));
    }

    @Override // ru.rt.ebs.cryptosdk.core.networkClient.entities.INetworkClient
    public NetworkClientResponse execute(NetworkClientRequest networkClientRequest) {
        HttpsMethod httpsMethod;
        String host = Uri.parse(networkClientRequest.getUrl()).getHost();
        if (host == null || evu0.J(host) || !((Set) this.b).contains(host)) {
            NetworkException.Companion.getClass();
            throw new NetworkException(403, "", EbsException.NOT_ALLOWED_HOST_ERROR_CODE, oyr.p("403 Not allowed host: ", host, ". Use EbsCryptoSdk.getNetworkClient().setAllowedHosts"));
        }
        qwu qwuVar = (qwu) ((h9e) this.a).b;
        int i = vp50.a[networkClientRequest.getMethod().ordinal()];
        if (i == 1) {
            httpsMethod = HttpsMethod.GET;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            httpsMethod = HttpsMethod.POST;
        }
        HttpsMethod httpsMethod2 = httpsMethod;
        axu axuVar = new axu(networkClientRequest.getUrl());
        Map f = kotlin.collections.b.f();
        Map f2 = kotlin.collections.b.f();
        Map<String, List<String>> headers = networkClientRequest.getHeaders();
        Object body = networkClientRequest.getBody();
        List<NetworkClientMultipartBodyPart> parts = networkClientRequest.getParts();
        ArrayList arrayList = new ArrayList(tcc.n(parts, 10));
        for (NetworkClientMultipartBodyPart networkClientMultipartBodyPart : parts) {
            arrayList.add(new mm40(networkClientMultipartBodyPart.getName(), networkClientMultipartBodyPart.getType(), networkClientMultipartBodyPart.getInputStream(), networkClientMultipartBodyPart.getFilename()));
        }
        ywu c2 = qwuVar.c(new xwu(httpsMethod2, axuVar, f, f2, headers, body, arrayList));
        return new NetworkClientResponse(c2.a, c2.b, c2.e);
    }

    @Override // defpackage.zo90
    public Object f(com.yandex.messaging.auth.passport.b bVar) {
        return new op90(bVar.e((wl3) this.a).a);
    }

    public MotionEvent g(na30 na30Var) {
        long j = na30Var.a;
        LongSparseArray longSparseArray = (LongSparseArray) this.a;
        PriorityQueue priorityQueue = (PriorityQueue) this.b;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j);
        longSparseArray.remove(j);
        return motionEvent;
    }

    public void i(String str) {
        xl10 xl10Var = (xl10) this.a;
        MtTicketActivationType d = d(str);
        if (d == null) {
            d = MtTicketActivationType.QR;
        }
        v740 v740Var = ((w740) this.b).a;
        String str2 = v740Var.a;
        String str3 = v740Var.c;
        pj pjVar = (pj) xl10Var.a;
        MasstransitTicketsAnalytics$TicketActivationType g = xl10.g(d);
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("activation_type", g.getEventValue());
        hashMap.put("order_id", str2);
        hashMap.put("ticket_id", str);
        if (str3 != null) {
            hashMap.put("request_id", str3);
        }
        pjVar.a.a("MasstransitTickets.ActivationTicket.ScanningQR", hashMap, 2, new HashMap());
    }

    public void j(MtTicketOrderAction mtTicketOrderAction, String str) {
        MasstransitTicketsAnalytics$OrderAction masstransitTicketsAnalytics$OrderAction;
        xl10 xl10Var = (xl10) this.a;
        v740 v740Var = ((w740) this.b).a;
        String str2 = v740Var.a;
        String str3 = v740Var.c;
        List list = v740Var.b;
        ArrayList arrayList = null;
        if (list.isEmpty()) {
            list = null;
        }
        pj pjVar = (pj) xl10Var.a;
        int i = u740.b[mtTicketOrderAction.ordinal()];
        if (i == 1) {
            masstransitTicketsAnalytics$OrderAction = MasstransitTicketsAnalytics$OrderAction.Scroll;
        } else if (i == 2) {
            masstransitTicketsAnalytics$OrderAction = MasstransitTicketsAnalytics$OrderAction.TicketPaging;
        } else if (i == 3) {
            masstransitTicketsAnalytics$OrderAction = MasstransitTicketsAnalytics$OrderAction.Deeplink;
        } else if (i == 4) {
            masstransitTicketsAnalytics$OrderAction = MasstransitTicketsAnalytics$OrderAction.CopyToClipboard;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            masstransitTicketsAnalytics$OrderAction = MasstransitTicketsAnalytics$OrderAction.Update;
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(xl10.f((r640) it.next()));
            }
        }
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str2);
        hashMap.put("action", masstransitTicketsAnalytics$OrderAction.getEventValue());
        if (str3 != null) {
            hashMap.put("request_id", str3);
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((v510) it2.next()).c);
            }
            hashMap.put("activation_type_list", arrayList2);
        }
        if (str != null) {
            hashMap.put(Constants.DEEPLINK, str);
        }
        pjVar.a.a("MasstransitTickets.Order.Action", hashMap, 2, new HashMap());
    }

    public void k(String str, MtTicketTappedButtonName mtTicketTappedButtonName) {
        MasstransitTicketsAnalytics$TicketTappedButtonName masstransitTicketsAnalytics$TicketTappedButtonName;
        xl10 xl10Var = (xl10) this.a;
        v740 v740Var = ((w740) this.b).a;
        String str2 = v740Var.a;
        String str3 = v740Var.c;
        MtTicketActivationType d = d(str);
        pj pjVar = (pj) xl10Var.a;
        int i = u740.c[mtTicketTappedButtonName.ordinal()];
        if (i == 1) {
            masstransitTicketsAnalytics$TicketTappedButtonName = MasstransitTicketsAnalytics$TicketTappedButtonName.NameRoute;
        } else if (i == 2) {
            masstransitTicketsAnalytics$TicketTappedButtonName = MasstransitTicketsAnalytics$TicketTappedButtonName.VisualCode;
        } else if (i == 3) {
            masstransitTicketsAnalytics$TicketTappedButtonName = MasstransitTicketsAnalytics$TicketTappedButtonName.HowActivate;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            masstransitTicketsAnalytics$TicketTappedButtonName = MasstransitTicketsAnalytics$TicketTappedButtonName.Activate;
        }
        MasstransitTicketsAnalytics$TicketActivationType g = d != null ? xl10.g(d) : null;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str2);
        hashMap.put("ticket_id", str);
        hashMap.put("button_name", masstransitTicketsAnalytics$TicketTappedButtonName.getEventValue());
        if (str3 != null) {
            hashMap.put("request_id", str3);
        }
        if (g != null) {
            hashMap.put("activation_type", g.getEventValue());
        }
        pjVar.a.a("MasstransitTickets.Ticket.Tapped", hashMap, 2, new HashMap());
    }

    @Override // defpackage.zo90
    public void l(Object obj) {
        ((pp90) this.b).a((op90) obj, false);
    }

    @Override // defpackage.zo90
    public String name() {
        return "getToken";
    }

    @Override // defpackage.aor0
    public void onDismiss() {
        uor0 uor0Var = (uor0) this.b;
        at20 at20Var = (at20) this.a;
        y yVar = uor0Var.a;
        yVar.getClass();
        yVar.i(at20Var, SharedPaymentsOpenReason.MENU);
    }

    @Override // ru.rt.ebs.cryptosdk.core.networkClient.entities.INetworkClient
    public void setAllowedHosts(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!evu0.J((String) obj)) {
                arrayList.add(obj);
            }
        }
        this.b = a.H0(arrayList);
    }

    public /* synthetic */ at20(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ at20(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
