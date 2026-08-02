package yads;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwsHeader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.emb;
import xsna.ful0;

/* loaded from: classes10.dex */
public final class xx0 implements pn0 {
    public static final nn0 d = new ful0(9);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public xx0(UUID uuid) {
        ni.a(uuid);
        ni.a("Use C.CLEARKEY_UUID instead", !jr.b.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (jr.d.equals(uuid) && d()) {
            a(mediaDrm);
        }
    }

    public static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override // yads.pn0
    public final int b() {
        return 2;
    }

    @Override // yads.pn0
    public final byte[] c() {
        return this.b.openSession();
    }

    @Override // yads.pn0
    public final k20 d(byte[] bArr) {
        return new vx0(a(this.a), bArr, mc3.a < 21 && jr.d.equals(this.a) && "L3".equals(this.b.getPropertyString("securityLevel")));
    }

    @Override // yads.pn0
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0229, code lost:
    
        if (r2 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01fb, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("QUZUVA==", 0), r7).equals(r6) == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    @Override // yads.pn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ln0 a(byte[] bArr, List list, int i, HashMap hashMap) {
        kk0 kk0Var;
        byte[] bArr2;
        String str;
        kk0 kk0Var2;
        byte[] bArr3;
        byte[] bArr4;
        short f;
        if (list != null) {
            if (jr.d.equals(this.a)) {
                if (mc3.a >= 28 && list.size() > 1) {
                    kk0 kk0Var3 = (kk0) list.get(0);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        kk0 kk0Var4 = (kk0) list.get(i3);
                        byte[] bArr5 = kk0Var4.f;
                        bArr5.getClass();
                        if (mc3.a(kk0Var4.e, kk0Var3.e) && mc3.a(kk0Var4.d, kk0Var3.d) && fm2.a(bArr5) != null) {
                            i2 += bArr5.length;
                        }
                    }
                    byte[] bArr6 = new byte[i2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        byte[] bArr7 = ((kk0) list.get(i5)).f;
                        bArr7.getClass();
                        int length = bArr7.length;
                        System.arraycopy(bArr7, 0, bArr6, i4, length);
                        i4 += length;
                    }
                    kk0Var2 = new kk0(kk0Var3.c, kk0Var3.d, kk0Var3.e, bArr6);
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    kk0 kk0Var5 = (kk0) list.get(i6);
                    byte[] bArr8 = kk0Var5.f;
                    bArr8.getClass();
                    em2 a = fm2.a(bArr8);
                    int i7 = a == null ? -1 : a.b;
                    int i8 = mc3.a;
                    if ((i8 < 23 && i7 == 0) || (i8 >= 23 && i7 == 1)) {
                        kk0Var2 = kk0Var5;
                        break;
                    }
                }
                kk0Var2 = (kk0) list.get(0);
            } else {
                kk0Var2 = (kk0) list.get(0);
            }
            UUID uuid = this.a;
            byte[] bArr9 = kk0Var2.f;
            bArr9.getClass();
            UUID uuid2 = jr.e;
            if (uuid2.equals(uuid)) {
                em2 a2 = fm2.a(bArr9);
                if (a2 != null) {
                    if (uuid.equals(a2.a)) {
                        bArr4 = a2.c;
                        if (bArr4 != null) {
                            bArr9 = bArr4;
                        }
                        kc2 kc2Var = new kc2(bArr9);
                        int d2 = kc2Var.d();
                        f = kc2Var.f();
                        short f2 = kc2Var.f();
                        if (f == 1 || f2 != 1) {
                            ji1.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                        } else {
                            short f3 = kc2Var.f();
                            Charset charset = bu.d;
                            String a3 = kc2Var.a(f3, charset);
                            if (!a3.contains("<LA_URL>")) {
                                int indexOf = a3.indexOf("</DATA>");
                                if (indexOf == -1) {
                                    ji1.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(a3.substring(0, indexOf));
                                sb.append("<LA_URL>https://x</LA_URL>");
                                String b = xsna.up.b(indexOf, a3, sb);
                                int i9 = d2 + 52;
                                ByteBuffer allocate = ByteBuffer.allocate(i9);
                                allocate.order(ByteOrder.LITTLE_ENDIAN);
                                allocate.putInt(i9);
                                allocate.putShort(f);
                                allocate.putShort(f2);
                                allocate.putShort((short) (b.length() * 2));
                                allocate.put(b.getBytes(charset));
                                bArr9 = allocate.array();
                            }
                        }
                        bArr3 = null;
                        bArr9 = fm2.a(uuid2, null, bArr9);
                    } else {
                        ji1.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + a2.a + ".");
                    }
                }
                bArr4 = null;
                if (bArr4 != null) {
                }
                kc2 kc2Var2 = new kc2(bArr9);
                int d22 = kc2Var2.d();
                f = kc2Var2.f();
                short f22 = kc2Var2.f();
                if (f == 1) {
                }
                ji1.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                bArr3 = null;
                bArr9 = fm2.a(uuid2, null, bArr9);
            } else {
                bArr3 = null;
            }
            int i10 = mc3.a;
            if (i10 >= 23 || !jr.d.equals(uuid)) {
                if (uuid2.equals(uuid)) {
                    byte[] decode = Base64.decode("QW1hem9u", 0);
                    Charset charset2 = emb.b;
                    if (new String(decode, charset2).equals(mc3.c)) {
                        String str2 = new String(Base64.decode("QUZUQg==", 0), charset2);
                        String str3 = mc3.d;
                        if (!str2.equals(str3)) {
                            if (!new String(Base64.decode("QUZUUw==", 0), charset2).equals(str3)) {
                                if (!new String(Base64.decode("QUZUTQ==", 0), charset2).equals(str3)) {
                                }
                            }
                        }
                    }
                }
                bArr3 = bArr9;
                UUID uuid3 = this.a;
                String str4 = kk0Var2.e;
                if (i10 < 26 && jr.c.equals(uuid3) && (MimeTypes.VIDEO_MP4.equals(str4) || MimeTypes.AUDIO_MP4.equals(str4))) {
                    bArr2 = bArr3;
                    str = C.CENC_TYPE_cenc;
                    kk0Var = kk0Var2;
                } else {
                    kk0Var = kk0Var2;
                    bArr2 = bArr3;
                    str = str4;
                }
            }
            em2 a4 = fm2.a(bArr9);
            if (a4 != null) {
                if (uuid.equals(a4.a)) {
                    bArr3 = a4.c;
                } else {
                    ji1.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + a4.a + ".");
                }
            }
        } else {
            kk0Var = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        UUID uuid4 = this.a;
        byte[] data = keyRequest.getData();
        if (jr.c.equals(uuid4) && mc3.a < 27) {
            Charset charset3 = bu.c;
            data = new String(data, charset3).replace('+', '-').replace('/', '_').getBytes(charset3);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && kk0Var != null && !TextUtils.isEmpty(kk0Var.d)) {
            defaultUrl = kk0Var.d;
        }
        if (mc3.a >= 23) {
            keyRequest.getRequestType();
        }
        return new ln0(defaultUrl, data);
    }

    @Override // yads.pn0
    public final void b(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // yads.pn0
    public final void c(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    public static /* synthetic */ pn0 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (pb3 unused) {
            ji1.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new zk0();
        }
    }

    public static xx0 c(UUID uuid) {
        try {
            return new xx0(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new pb3(e);
        } catch (Exception e2) {
            throw new pb3(e2);
        }
    }

    @Override // yads.pn0
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (jr.c.equals(this.a) && mc3.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, bu.c));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(ApiProtocol.PARAM_KEYS);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(StringUtils.COMMA);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K).replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString(JwsHeader.KEY_ID).replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(bu.c);
            } catch (JSONException e) {
                ji1.b("ClearKeyUtil", ji1.a("Failed to adjust response data: ".concat(new String(bArr2, bu.c)), e));
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    public static boolean d() {
        return ql2.f.a().equals(mc3.d);
    }

    @Override // yads.pn0
    public final on0 a() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new on0(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    public final void a(mn0 mn0Var, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bd0 bd0Var = ((ad0) mn0Var).a.y;
        bd0Var.getClass();
        bd0Var.obtainMessage(i, bArr).sendToTarget();
    }

    @Override // yads.pn0
    public final Map a(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // yads.pn0
    public final void a(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // yads.pn0
    public final void a(final ad0 ad0Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: xsna.yiz0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                yads.xx0.this.a(ad0Var, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // yads.pn0
    public final void a(byte[] bArr, zf2 zf2Var) {
        if (mc3.a >= 31) {
            try {
                wx0.a(this.b, bArr, zf2Var);
            } catch (UnsupportedOperationException unused) {
                ji1.d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // yads.pn0
    public final boolean a(String str, byte[] bArr) {
        if (mc3.a >= 31) {
            return wx0.a(this.b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public static UUID a(UUID uuid) {
        return (mc3.a >= 27 || !jr.c.equals(uuid)) ? uuid : jr.b;
    }
}
