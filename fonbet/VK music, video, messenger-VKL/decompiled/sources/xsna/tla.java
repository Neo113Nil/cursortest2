package xsna;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.SubtitleDecoderException;
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
import xsna.rkk;
import xsna.wla;

/* compiled from: Cea608Decoder.java */
/* loaded from: classes12.dex */
public final class tla extends wla {
    public final int i;
    public final int j;
    public final int k;

    @Nullable
    public List<rkk> o;

    @Nullable
    public List<rkk> p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 108, 109, 110, 111, 112, 113, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};
    public static final int[] D = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] F = {195, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 205, 204, 236, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final xi90 h = new xi90();
    public final ArrayList<a> m = new ArrayList<>();
    public a n = new a(0, 4);
    public int w = 0;
    public final long l = 16000000;

    /* compiled from: Cea608Decoder.java */
    public static final class a {
        public final ArrayList a;
        public final ArrayList b;
        public final StringBuilder c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        /* compiled from: Cea608Decoder.java */
        /* renamed from: xsna.tla$a$a, reason: collision with other inner class name */
        public static class C3756a {
            public final int a;
            public final boolean b;
            public int c;

            public C3756a(int i, boolean z, int i2) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.c = sb;
            this.g = i;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
            this.h = i2;
        }

        public final void a(char c) {
            StringBuilder sb = this.c;
            if (sb.length() < 32) {
                sb.append(c);
            }
        }

        public final void b() {
            StringBuilder sb = this.c;
            int length = sb.length();
            if (length > 0) {
                sb.delete(length - 1, length);
                ArrayList arrayList = this.a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C3756a c3756a = (C3756a) arrayList.get(size);
                    int i = c3756a.c;
                    if (i != length) {
                        return;
                    }
                    c3756a.c = i - 1;
                }
            }
        }

        @Nullable
        public final rkk c(int i) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i2));
                spannableStringBuilder.append('\n');
                i2++;
            }
            spannableStringBuilder.append((CharSequence) d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.e + this.f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            float b = i != 1 ? i != 2 ? io.reactivex.rxjava3.internal.operators.observable.n0.b(i3, 32.0f, 0.8f, 0.1f) : io.reactivex.rxjava3.internal.operators.observable.n0.b(32 - length, 32.0f, 0.8f, 0.1f) : 0.5f;
            int i5 = this.d;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.g == 1) {
                i5 -= this.h - 1;
            }
            rkk.a aVar = new rkk.a();
            aVar.a = spannableStringBuilder;
            aVar.b = null;
            aVar.c = Layout.Alignment.ALIGN_NORMAL;
            aVar.e = i5;
            aVar.f = 1;
            aVar.h = b;
            aVar.i = i;
            return aVar.a();
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (true) {
                ArrayList arrayList = this.a;
                if (i5 >= arrayList.size()) {
                    break;
                }
                C3756a c3756a = (C3756a) arrayList.get(i5);
                boolean z2 = c3756a.b;
                int i7 = c3756a.a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = tla.B[i7];
                    }
                    z = z3;
                }
                int i8 = c3756a.c;
                i5++;
                if (i8 != (i5 < arrayList.size() ? ((C3756a) arrayList.get(i5)).c : length)) {
                    if (i != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        dr.a(2, spannableStringBuilder, i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        if (i3 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                        }
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (i2 != -1 && i2 != length) {
                dr.a(2, spannableStringBuilder, i2, length, 33);
            }
            if (i6 != length && i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }
    }

    public tla(String str, int i) {
        this.i = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i != 4) {
            ahn.F("Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        i(0);
        h();
        this.x = true;
        this.y = C.TIME_UNSET;
    }

    @Override // xsna.wla
    public final xla c() {
        List<rkk> list = this.o;
        this.p = list;
        list.getClass();
        return new xla(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // xsna.wla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(wla.a aVar) {
        boolean z2;
        ByteBuffer byteBuffer = aVar.e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        xi90 xi90Var = this.h;
        xi90Var.N(array, limit);
        boolean z3 = false;
        while (true) {
            int a2 = xi90Var.a();
            int i = this.i;
            if (a2 < i) {
                if (z3) {
                    int i2 = this.q;
                    if (i2 == 1 || i2 == 3) {
                        this.o = g();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int C2 = i == 2 ? -4 : xi90Var.C();
            int C3 = xi90Var.C();
            int C4 = xi90Var.C();
            if ((C2 & 2) == 0 && (C2 & 1) == this.j) {
                byte b = (byte) (C3 & 127);
                byte b2 = (byte) (C4 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.s;
                    if ((C2 & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[C3] && zArr[C4]) {
                            z2 = true;
                            this.s = z2;
                            if (z2 || (b & 240) != 16) {
                                this.t = false;
                            } else if (this.t && this.u == b && this.v == b2) {
                                this.t = false;
                            } else {
                                this.t = true;
                                this.u = b;
                                this.v = b2;
                            }
                            if (!z2) {
                                if (1 <= b && b <= 15) {
                                    this.x = false;
                                } else if ((b & 246) == 20) {
                                    if (b2 != 32 && b2 != 47) {
                                        switch (b2) {
                                            default:
                                                switch (b2) {
                                                    case 42:
                                                    case 43:
                                                        this.x = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.x = true;
                                                break;
                                        }
                                    }
                                    this.x = true;
                                }
                                if (this.x) {
                                    int i3 = b & 224;
                                    if (i3 == 0) {
                                        this.w = (b >> 3) & 1;
                                    }
                                    if (this.w == this.k) {
                                        if (i3 == 0) {
                                            int i4 = b & 247;
                                            if (i4 == 17 && (b2 & 240) == 48) {
                                                this.n.a((char) D[b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER]);
                                            } else {
                                                int i5 = b & 246;
                                                if (i5 == 18 && (b2 & 224) == 32) {
                                                    this.n.b();
                                                    this.n.a((char) ((b & 1) == 0 ? E[b2 & 31] : F[b2 & 31]));
                                                } else if (i4 == 17 && (b2 & 240) == 32) {
                                                    this.n.a(' ');
                                                    boolean z5 = (b2 & 1) == 1;
                                                    a aVar2 = this.n;
                                                    aVar2.a.add(new a.C3756a((b2 >> 1) & 7, z5, aVar2.c.length()));
                                                } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                    int i6 = z[b & 7];
                                                    if ((b2 & 32) != 0) {
                                                        i6++;
                                                    }
                                                    a aVar3 = this.n;
                                                    if (i6 != aVar3.d) {
                                                        if (this.q != 1 && !aVar3.e()) {
                                                            a aVar4 = new a(this.q, this.r);
                                                            this.n = aVar4;
                                                            this.m.add(aVar4);
                                                        }
                                                        this.n.d = i6;
                                                    }
                                                    boolean z6 = (b2 & AmfConstants.TYPE_TYPED_OBJECT_MARKER) == 16;
                                                    boolean z7 = (b2 & 1) == 1;
                                                    int i7 = (b2 >> 1) & 7;
                                                    a aVar5 = this.n;
                                                    aVar5.a.add(new a.C3756a(z6 ? 8 : i7, z7, aVar5.c.length()));
                                                    if (z6) {
                                                        this.n.e = A[i7];
                                                    }
                                                } else if (i4 == 23 && b2 >= 33 && b2 <= 35) {
                                                    this.n.f = b2 - 32;
                                                } else if (i5 == 20 && (b2 & 240) == 32) {
                                                    if (b2 == 32) {
                                                        i(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                i(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                i(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                int i8 = this.q;
                                                                if (i8 != 0) {
                                                                    if (b2 == 33) {
                                                                        this.n.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i8 == 1 || i8 == 3) {
                                                                                    h();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i8 == 1 && !this.n.e()) {
                                                                                    a aVar6 = this.n;
                                                                                    ArrayList arrayList = aVar6.b;
                                                                                    arrayList.add(aVar6.d());
                                                                                    aVar6.c.setLength(0);
                                                                                    aVar6.a.clear();
                                                                                    int min = Math.min(aVar6.h, aVar6.d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            a aVar7 = this.n;
                                            int[] iArr = C;
                                            aVar7.a((char) iArr[(b & Byte.MAX_VALUE) - 32]);
                                            if ((b2 & 224) != 0) {
                                                this.n.a((char) iArr[(b2 & Byte.MAX_VALUE) - 32]);
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
                    this.s = z2;
                    if (z2) {
                    }
                    this.t = false;
                    if (!z2) {
                    }
                }
            }
        }
    }

    @Override // xsna.wla, xsna.a8l
    @Nullable
    /* renamed from: e */
    public final y0n0 dequeueOutputBuffer() throws SubtitleDecoderException {
        y0n0 pollFirst;
        y0n0 dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        long j = this.l;
        if (j == C.TIME_UNSET) {
            return null;
        }
        long j2 = this.y;
        if (j2 == C.TIME_UNSET || this.e - j2 < j || (pollFirst = this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = C.TIME_UNSET;
        pollFirst.i(this.e, c(), Long.MAX_VALUE);
        return pollFirst;
    }

    @Override // xsna.wla
    public final boolean f() {
        return this.o != this.p;
    }

    @Override // xsna.wla, xsna.a8l
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        i(0);
        this.r = 4;
        this.n.h = 4;
        h();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = C.TIME_UNSET;
    }

    public final ArrayList g() {
        ArrayList<a> arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            rkk c = arrayList.get(i2).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            rkk rkkVar = (rkk) arrayList2.get(i3);
            if (rkkVar != null) {
                if (rkkVar.i != i) {
                    rkkVar = arrayList.get(i3).c(i);
                    rkkVar.getClass();
                }
                arrayList3.add(rkkVar);
            }
        }
        return arrayList3;
    }

    public final void h() {
        a aVar = this.n;
        aVar.g = this.q;
        aVar.a.clear();
        aVar.b.clear();
        aVar.c.setLength(0);
        aVar.d = 15;
        aVar.e = 0;
        aVar.f = 0;
        ArrayList<a> arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void i(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            h();
            if (i2 == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList<a> arrayList = this.m;
            if (i3 >= arrayList.size()) {
                return;
            }
            arrayList.get(i3).g = i;
            i3++;
        }
    }

    @Override // xsna.wla, xsna.a8l
    public final void release() {
    }
}
