package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.result.ParsedResult;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.cameraui.impl.QrScannerUi;
import com.vk.channels.api.Channel;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.pk9;

/* compiled from: ReplyBarController.java */
/* loaded from: classes17.dex */
public final class h3g0 implements hx2, pk9.b, xt8, i8l {
    public Object b;

    public /* synthetic */ h3g0(Object obj) {
        this.b = obj;
    }

    @Override // xsna.pk9.b
    public void a(ArrayList arrayList) {
        CameraUIView cameraUIView = (CameraUIView) this.b;
        QrScannerUi qrScannerUi = cameraUIView.Q0;
        if (qrScannerUi == null || !qrScannerUi.g) {
            return;
        }
        if (cameraUIView.getCustomQrListener() != null) {
            ArrayList<ParsedResult> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((rne0) it.next()).a);
            }
            izs<ArrayList<ParsedResult>, s3q0> customQrListener = cameraUIView.getCustomQrListener();
            if (customQrListener != null) {
                customQrListener.invoke(arrayList2);
            }
        } else {
            cme0 cme0Var = qrScannerUi.f;
            if (cme0Var != null) {
                cme0Var.e(arrayList, true);
            }
        }
        dcn dcnVar = cameraUIView.O;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
        cameraUIView.O = null;
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        f3g0 f3g0Var = (f3g0) this.b;
        if (((ArrayList) obj).size() == 0) {
            f3g0.o(f3g0Var, false);
        } else {
            f3g0.o(f3g0Var, true);
        }
    }

    @Override // xsna.i8l
    public void c() {
        qkz qkzVar = (qkz) this.b;
        okz okzVar = qkzVar.d;
        if (okzVar != null) {
            qkzVar.g(okzVar.m, okzVar.n, qkzVar.n);
        }
    }

    @Override // xsna.pk9.b
    public void d() {
        cme0 cme0Var;
        zzs<ResultPoint[], yne0, Boolean, izs<? super Integer, s3q0>, s3q0> zzsVar;
        QrScannerUi qrScannerUi = ((CameraUIView) this.b).Q0;
        if (qrScannerUi == null || !qrScannerUi.g || (cme0Var = qrScannerUi.f) == null || (zzsVar = cme0Var.d) == null) {
            return;
        }
        zzsVar.invoke(null, null, Boolean.FALSE, null);
    }

    @Override // xsna.hx2
    public void e(@NonNull VKApiExecutionException vKApiExecutionException) {
        f3g0.o((f3g0) this.b, false);
    }

    @Override // xsna.xt8
    public ByteBuffer g(int i) {
        fxc0.p(i >= 0);
        if (((ByteBuffer) this.b).remaining() < i) {
            this.b = ByteBuffer.allocateDirect(Math.max(i, ((ByteBuffer) this.b).capacity() * 2));
        }
        ByteBuffer slice = ((ByteBuffer) this.b).slice();
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        byteBuffer.position(byteBuffer.position() + i);
        slice.limit(i);
        return slice;
    }

    public void h(long j) {
        ((wg50) this.b).a(j);
    }

    @Override // xsna.i8l
    public void handleDecodedData(ByteBuffer byteBuffer) {
        qkz qkzVar = (qkz) this.b;
        if (qkzVar.h) {
            return;
        }
        qkzVar.h = true;
        qkzVar.i();
    }

    public String i(Channel channel, boolean z) {
        Context context = (Context) this.b;
        return z ? context.getString(R.string.vkim_channels_postponed_posts_screen_title) : channel.S ? context.getString(R.string.vkim_channels_private_channel_name) : channel.d;
    }

    public void j(String str) {
        l(str, "key1");
    }

    public void k(String str) {
        l(str, "key2");
    }

    public void l(Object obj, String str) {
        try {
            ((JSONObject) this.b).put(str, obj);
        } catch (JSONException e) {
            L.i(e);
        }
    }

    public void m() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put((JSONObject) this.b);
        czk0 czk0Var = new czk0("stats.trackCustomEvents", 0);
        czk0Var.K("events", jSONArray.toString());
        rsg0.y0(czk0Var, null, null, 3).subscribe(new bnk());
    }

    public void n() {
        l(Boolean.TRUE, "unique");
    }

    public long[] o() {
        wg50 wg50Var = (wg50) this.b;
        int i = wg50Var.b;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = wg50Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            dn01 dn01Var = (dn01) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", dn01Var.a());
            bundle.putLong("event_timestamp", dn01Var.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public void q(int i) {
        ((ArrayList) this.b).add(new mm01(i, System.currentTimeMillis()));
    }

    public h3g0(int i) {
        switch (i) {
            case 9:
                this.b = new ArrayList();
                break;
            default:
                this.b = new tvb0(2);
                break;
        }
    }

    public h3g0(String str) {
        this.b = new JSONObject();
        l(str, "stat_name");
    }

    public h3g0(long[] jArr) {
        wg50 wg50Var;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            wg50Var = new wg50(copyOf.length);
            int i = wg50Var.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = wg50Var.a;
                    if (jArr2.length < length) {
                        wg50Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = wg50Var.a;
                    int i2 = wg50Var.b;
                    if (i != i2) {
                        jw5.g(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    System.arraycopy(copyOf, 0, jArr3, i, copyOf.length);
                    wg50Var.b += copyOf.length;
                }
            } else {
                alk.D("");
                throw null;
            }
        } else {
            wg50Var = new wg50();
        }
        this.b = wg50Var;
    }

    @Override // xsna.i8l
    public void f() {
    }
}
