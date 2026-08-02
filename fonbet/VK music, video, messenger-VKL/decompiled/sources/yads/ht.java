package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes10.dex */
public final class ht extends pt {
    public final int h;
    public final int i;
    public final int j;
    public List n;
    public List o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 108, 109, 110, 111, 112, 113, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};
    public static final int[] C = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] E = {195, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 205, 204, 236, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final kc2 g = new kc2();
    public final ArrayList l = new ArrayList();
    public gt m = new gt(0, 4);
    public int v = 0;
    public final long k = 16000000;

    public ht(String str, int i) {
        this.h = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            ji1.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        a(0);
        h();
        this.w = true;
        this.x = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[SYNTHETIC] */
    @Override // yads.pt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(nt ntVar) {
        boolean z2;
        ByteBuffer byteBuffer = ntVar.d;
        byteBuffer.getClass();
        kc2 kc2Var = this.g;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        kc2Var.a = array;
        kc2Var.c = limit;
        kc2Var.b = 0;
        boolean z3 = false;
        while (true) {
            kc2 kc2Var2 = this.g;
            int i = kc2Var2.c - kc2Var2.b;
            int i2 = this.h;
            if (i < i2) {
                if (z3) {
                    int i3 = this.p;
                    if (i3 == 1 || i3 == 3) {
                        this.n = g();
                        this.x = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            byte m = i2 == 2 ? (byte) -4 : (byte) kc2Var2.m();
            int m2 = this.g.m();
            int m3 = this.g.m();
            if ((m & 2) == 0 && (m & 1) == this.i) {
                byte b = (byte) (m2 & 127);
                byte b2 = (byte) (m3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.r;
                    if ((m & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[m2] && zArr[m3]) {
                            z2 = true;
                            this.r = z2;
                            if (z2 || (b & 240) != 16) {
                                this.s = false;
                            } else if (this.s && this.t == b && this.u == b2) {
                                this.s = false;
                            } else {
                                this.s = true;
                                this.t = b;
                                this.u = b2;
                            }
                            if (!z2) {
                                if (1 <= b && b <= 15) {
                                    this.w = false;
                                } else if ((b & 247) == 20) {
                                    if (b2 != 32 && b2 != 47) {
                                        switch (b2) {
                                            default:
                                                switch (b2) {
                                                    case 42:
                                                    case 43:
                                                        this.w = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.w = true;
                                                break;
                                        }
                                    }
                                    this.w = true;
                                }
                                if (this.w) {
                                    int i4 = b & 224;
                                    if (i4 == 0) {
                                        this.v = (b >> 3) & 1;
                                    }
                                    if (this.v == this.j) {
                                        if (i4 == 0) {
                                            int i5 = b & 247;
                                            if (i5 == 17 && (b2 & 240) == 48) {
                                                gt gtVar = this.m;
                                                char c = (char) C[b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER];
                                                if (gtVar.c.length() < 32) {
                                                    gtVar.c.append(c);
                                                }
                                            } else {
                                                int i6 = b & 246;
                                                if (i6 == 18 && (b2 & 224) == 32) {
                                                    this.m.a();
                                                    gt gtVar2 = this.m;
                                                    char c2 = (char) ((b & 1) == 0 ? D[b2 & 31] : E[b2 & 31]);
                                                    if (gtVar2.c.length() < 32) {
                                                        gtVar2.c.append(c2);
                                                    }
                                                } else if (i5 == 17 && (b2 & 240) == 32) {
                                                    gt gtVar3 = this.m;
                                                    if (gtVar3.c.length() < 32) {
                                                        gtVar3.c.append(' ');
                                                    }
                                                    boolean z5 = (b2 & 1) == 1;
                                                    gt gtVar4 = this.m;
                                                    gtVar4.a.add(new ft((b2 >> 1) & 7, gtVar4.c.length(), z5));
                                                } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                    int i7 = y[b & 7];
                                                    if ((b2 & 32) != 0) {
                                                        i7++;
                                                    }
                                                    gt gtVar5 = this.m;
                                                    if (i7 != gtVar5.d) {
                                                        if (this.p != 1 && (!gtVar5.a.isEmpty() || !gtVar5.b.isEmpty() || gtVar5.c.length() != 0)) {
                                                            gt gtVar6 = new gt(this.p, this.q);
                                                            this.m = gtVar6;
                                                            this.l.add(gtVar6);
                                                        }
                                                        this.m.d = i7;
                                                    }
                                                    boolean z6 = (b2 & AmfConstants.TYPE_TYPED_OBJECT_MARKER) == 16;
                                                    boolean z7 = (b2 & 1) == 1;
                                                    int i8 = (b2 >> 1) & 7;
                                                    gt gtVar7 = this.m;
                                                    gtVar7.a.add(new ft(z6 ? 8 : i8, gtVar7.c.length(), z7));
                                                    if (z6) {
                                                        this.m.e = z[i8];
                                                    }
                                                } else if (i5 == 23 && b2 >= 33 && b2 <= 35) {
                                                    this.m.f = b2 - 32;
                                                } else if (i6 == 20 && (b2 & 240) == 32) {
                                                    if (b2 == 32) {
                                                        a(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                a(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                int i9 = this.p;
                                                                if (i9 != 0) {
                                                                    if (b2 == 33) {
                                                                        this.m.a();
                                                                        break;
                                                                    } else {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.EMPTY_LIST;
                                                                                if (i9 == 1 || i9 == 3) {
                                                                                    h();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i9 == 1) {
                                                                                    gt gtVar8 = this.m;
                                                                                    if (!gtVar8.a.isEmpty() || !gtVar8.b.isEmpty() || gtVar8.c.length() != 0) {
                                                                                        gt gtVar9 = this.m;
                                                                                        gtVar9.b.add(gtVar9.b());
                                                                                        gtVar9.c.setLength(0);
                                                                                        gtVar9.a.clear();
                                                                                        int min = Math.min(gtVar9.h, gtVar9.d);
                                                                                        while (gtVar9.b.size() >= min) {
                                                                                            gtVar9.b.remove(0);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            gt gtVar10 = this.m;
                                            int[] iArr = B;
                                            char c3 = (char) iArr[(b & Byte.MAX_VALUE) - 32];
                                            if (gtVar10.c.length() < 32) {
                                                gtVar10.c.append(c3);
                                            }
                                            if ((b2 & 224) != 0) {
                                                gt gtVar11 = this.m;
                                                char c4 = (char) iArr[(b2 & Byte.MAX_VALUE) - 32];
                                                if (gtVar11.c.length() < 32) {
                                                    gtVar11.c.append(c4);
                                                }
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            } else if (z4) {
                                h();
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    this.r = z2;
                    if (z2) {
                    }
                    this.s = false;
                    if (!z2) {
                    }
                }
            }
        }
    }

    @Override // yads.pt
    public final qt c() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new qt(list);
    }

    @Override // yads.pt, yads.oa0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final b63 a() {
        b63 e;
        b63 a = super.a();
        if (a != null) {
            return a;
        }
        long j = this.k;
        if (j == C.TIME_UNSET) {
            return null;
        }
        long j2 = this.x;
        if (j2 == C.TIME_UNSET || this.e - j2 < j || (e = e()) == null) {
            return null;
        }
        this.n = Collections.EMPTY_LIST;
        this.x = C.TIME_UNSET;
        qt c = c();
        long j3 = this.e;
        e.c = j3;
        e.d = c;
        e.e = j3;
        return e;
    }

    @Override // yads.pt
    public final boolean f() {
        return this.n != this.o;
    }

    @Override // yads.pt, yads.oa0
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        a(0);
        this.q = 4;
        this.m.h = 4;
        h();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = C.TIME_UNSET;
    }

    public final ArrayList g() {
        int size = this.l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            o20 a = ((gt) this.l.get(i2)).a(Integer.MIN_VALUE);
            arrayList.add(a);
            if (a != null) {
                i = Math.min(i, a.j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            o20 o20Var = (o20) arrayList.get(i3);
            if (o20Var != null) {
                if (o20Var.j != i) {
                    o20Var = ((gt) this.l.get(i3)).a(i);
                    o20Var.getClass();
                }
                arrayList2.add(o20Var);
            }
        }
        return arrayList2;
    }

    public final void h() {
        this.m.b(this.p);
        this.l.clear();
        this.l.add(this.m);
    }

    @Override // yads.pt, yads.oa0
    public final void release() {
    }

    public final void a(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                ((gt) this.l.get(i3)).g = i;
            }
            return;
        }
        h();
        if (i2 == 3 || i == 1 || i == 0) {
            this.n = Collections.EMPTY_LIST;
        }
    }
}
