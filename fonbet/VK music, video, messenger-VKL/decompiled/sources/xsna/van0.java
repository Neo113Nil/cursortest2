package xsna;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.log.L;
import com.vk.queuesync.sync.models.SuperAppQueueAccessException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.nnk0;

/* compiled from: SuperAppQueueObserverV2.kt */
/* loaded from: classes5.dex */
public final class van0 implements owg0 {
    public final pnk0 b;
    public volatile onk0 c;
    public volatile int d = 25000;

    /* compiled from: SuperAppQueueObserverV2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkType.values().length];
            try {
                iArr[NetworkType.MOBILE_2G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.MOBILE_3G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkType.MOBILE_FAST_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkType.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkType.MOBILE_5G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NetworkType.WIFI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public van0(rnk0 rnk0Var, ubn0 ubn0Var) {
        this.b = rnk0Var;
    }

    @Override // xsna.owg0
    public final void b(qan0 qan0Var, y2 y2Var, g06 g06Var) {
        int i;
        int i2;
        snk0 a2 = this.b.a(this.d, Uri.parse(qan0Var.b + "pushsse/getEvents/" + qan0Var.a).buildUpon().appendQueryParameter("key", qan0Var.c).appendQueryParameter("ts", String.valueOf(qan0Var.d)).build().toString());
        this.c = a2;
        while (a2.g) {
            if (Thread.interrupted()) {
                L.e("Interrupted");
                onk0 onk0Var = this.c;
                if (onk0Var != null) {
                    onk0Var.cancel();
                }
                throw new InterruptedException("Thread interrupted");
            }
            nnk0 next = a2.next();
            if (next instanceof nnk0.c) {
                L.e("onOpen");
            } else if (next instanceof nnk0.b) {
                nnk0.b bVar = (nnk0.b) next;
                String str = bVar.a;
                String str2 = bVar.c;
                String str3 = bVar.b;
                StringBuilder a3 = xe9.a("onEvent id:", str, " type:", str3, " data:");
                a3.append(str2);
                L.e(a3.toString());
                if ("ping-interval".equalsIgnoreCase(str3) && str2.length() > 0) {
                    bpn0 bpn0Var = cqm0.a;
                    try {
                        i = Integer.parseInt(str2);
                    } catch (Throwable unused) {
                        i = 0;
                    }
                    int i3 = i >= 0 ? i : 0;
                    if (i3 != 0) {
                        switch (a.$EnumSwitchMapping$0[com.vk.core.utils.newtork.b.c().d().ordinal()]) {
                            case 1:
                                i2 = 15000;
                                break;
                            case 2:
                            case 3:
                                i2 = 10000;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                i2 = 7000;
                                break;
                            default:
                                i2 = 25000;
                                break;
                        }
                        this.d = i3 + i2;
                    }
                } else if (str3 == null && str2.length() > 0) {
                    try {
                        ran0 b = ubn0.b(new JSONObject(str2));
                        fco0.c();
                        long j = b.b;
                        List<JSONObject> list = b.a;
                        pan0 pan0Var = b.c;
                        if (j != -1) {
                            g06Var.invoke(Long.valueOf(j), Boolean.valueOf(pan0Var != null));
                        }
                        if (pan0Var != null) {
                            throw new SuperAppQueueAccessException(pan0Var);
                        }
                        if (!list.isEmpty()) {
                            y2Var.invoke(list, Long.valueOf(b.b));
                        }
                    } catch (JSONException e) {
                        throw new VKApiIllegalResponseException(e);
                    }
                }
            } else if (next instanceof nnk0.d) {
                L.e("onRetryChanged:" + ((nnk0.d) next).a);
            } else {
                if (!(next instanceof nnk0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                L.e("onClosed");
            }
        }
    }
}
