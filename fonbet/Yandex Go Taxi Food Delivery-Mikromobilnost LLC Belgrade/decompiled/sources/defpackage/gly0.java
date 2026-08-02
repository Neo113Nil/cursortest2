package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.CamcorderProfile;
import android.text.TextUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.yandex.xplat.common.c;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.pref.ConsoleConfig;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.logistics.care.web_view.api.CareWebViewEvent$PaymentEventType;
import ru.yandex.logistics.care.web_view.api.CareWebViewEvent$PaymentFlowFinishedEventType;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes10.dex */
public final class gly0 implements xi01, y051, ww01, r3t0, r77, am7, or8, dza, k6e, sko, co31, koo, mle0, y7p, ikp, qdr {
    public static final gly0 a = new gly0();
    public static final gly0 b = new gly0();
    public static final gly0 c = new gly0();
    public static final gly0 w = new gly0();
    public static final /* synthetic */ gly0 x = new gly0();
    public static final /* synthetic */ gly0 y = new gly0();
    public static gly0 z;

    public /* synthetic */ gly0() {
    }

    public static iho m(String str) {
        lhn lhnVar = new lhn((Map) new LinkedHashMap());
        lhnVar.c("event_type", "other");
        lhnVar.c("event_source", "error");
        lhnVar.a.put("error", new u96(true));
        lhnVar.c(CRLReasonCodeExtension.REASON, "Origin eventus id was not found");
        lhnVar.c(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, str);
        return new iho("ERROR", lhnVar);
    }

    public static iho o(String str, lhn lhnVar) {
        bzd0 bzd0Var = jho.b;
        bzd0Var.b = c.a(1) + bzd0Var.b;
        lhnVar.b(o450.a() + bzd0Var.b, "eventus_id");
        lhnVar.c("event_name", str);
        return new iho(str, lhnVar);
    }

    @Override // defpackage.qdr
    public boolean a(sdr sdrVar) {
        return sdrVar.c > sdrVar.e;
    }

    @Override // defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.r77
    public byte[] b(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.mle0
    public CharSequence c(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.o0) ? editTextPreference.a.getString(j0i0.not_set) : editTextPreference.o0;
    }

    @Override // defpackage.koo
    public loo[] createTrackSelections(joo[] jooVarArr, ip4 ip4Var, sf10 sf10Var, a9z0 a9z0Var) {
        loo[] looVarArr = new loo[jooVarArr.length];
        int i = 0;
        for (int i2 = 0; i2 < jooVarArr.length; i2++) {
            joo jooVar = jooVarArr[i2];
            looVarArr[i2] = jooVar == null ? null : new d7m(jooVar.a, jooVar.b, i, i);
        }
        return looVarArr;
    }

    @Override // defpackage.qdr
    public sdr d(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float d = sy01.d(f5, f7, f2, f3, f, true);
        float f8 = d / f5;
        float f9 = d / f7;
        return new sdr(f8, f9, f4 * f8, d, f6 * f9, d);
    }

    @Override // defpackage.k6e
    public boolean e(String[] strArr) {
        JCPPref a2 = ConsoleConfig.a(strArr);
        if (strArr.length <= 2) {
            a2.exportSubtree(System.out);
            return true;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(strArr[2]);
            try {
                a2.exportSubtree(fileOutputStream2);
                fileOutputStream2.close();
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.ikp
    public boolean f(jyq0 jyq0Var) {
        return false;
    }

    @Override // defpackage.am7
    public CamcorderProfile g(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // defpackage.y7p
    public void h(Object obj) {
        ((List) obj).clear();
    }

    public void i(Drawable drawable, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(257732500);
        int i2 = (btsVar.e(drawable) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = ljs0.m(c530.a, ake.e);
            boolean e = btsVar.e(drawable);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new s5w0(26, drawable);
                btsVar.o0(Q);
            }
            pi6.a(bb1.g(m, (tls) Q), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(this, drawable, i, 6);
        }
    }

    @Override // defpackage.am7
    public boolean j(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // defpackage.or8
    public void k(ye0 ye0Var) {
        if ((ye0Var instanceof er8) || (ye0Var instanceof dr8) || (ye0Var instanceof rq8) || (ye0Var instanceof uq8) || (ye0Var instanceof gr8) || (ye0Var instanceof yq8) || (ye0Var instanceof wq8) || (ye0Var instanceof br8) || (ye0Var instanceof xq8)) {
            return;
        }
        Object obj = null;
        if (ye0Var instanceof zq8) {
            Iterator<E> it = CareWebViewEvent$PaymentEventType.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((CareWebViewEvent$PaymentEventType) next).getValue(), ((zq8) ye0Var).b)) {
                    obj = next;
                    break;
                }
            }
            return;
        }
        if (ye0Var instanceof ar8) {
            Iterator<E> it2 = CareWebViewEvent$PaymentFlowFinishedEventType.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (jl40.l(((CareWebViewEvent$PaymentFlowFinishedEventType) next2).getValue(), ((ar8) ye0Var).b)) {
                    obj = next2;
                    break;
                }
            }
        }
    }

    public void l(final Icon icon, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2116504409);
        int i2 = (btsVar.e(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            boolean k = btsVar.k(icon) | btsVar.k(context);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = icon.loadDrawable(context);
                btsVar.o0(Q);
            }
            Drawable drawable = (Drawable) Q;
            if (drawable == null) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this, icon, i, i3) { // from class: fly0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ gly0 b;
                        public final /* synthetic */ Icon c;

                        {
                            this.a = i3;
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            Icon icon2 = this.c;
                            gly0 gly0Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    gly0Var.l(icon2, fidVar2, vng.O(49));
                                    break;
                                default:
                                    gly0Var.l(icon2, fidVar2, vng.O(49));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            i(drawable, btsVar, 48);
        } else {
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this, icon, i, i4) { // from class: fly0
                public final /* synthetic */ int a;
                public final /* synthetic */ gly0 b;
                public final /* synthetic */ Icon c;

                {
                    this.a = i4;
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    zy11 zy11Var = zy11.a;
                    Icon icon2 = this.c;
                    gly0 gly0Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            gly0Var.l(icon2, fidVar2, vng.O(49));
                            break;
                        default:
                            gly0Var.l(icon2, fidVar2, vng.O(49));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    @Override // defpackage.qdr
    public void n(RectF rectF, float f, sdr sdrVar) {
        float abs = (Math.abs(sdrVar.e - sdrVar.c) / 2.0f) * f;
        rectF.left += abs;
        rectF.right -= abs;
    }

    public /* synthetic */ gly0(Object obj) {
    }
}
