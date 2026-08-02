package xsna;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* compiled from: ByteSourceJsonBootstrapper.java */
/* loaded from: classes12.dex */
public final class ju8 {
    public final tnv a;
    public final InputStream b;
    public final byte[] c;
    public int d;
    public int e;
    public final boolean f;
    public boolean g = true;
    public int h;

    public ju8(tnv tnvVar, InputStream inputStream) {
        this.a = tnvVar;
        this.b = inputStream;
        tnv.a(tnvVar.g);
        im8 im8Var = tnvVar.e;
        int i = im8.c[0];
        i = i <= 0 ? 0 : i;
        byte[] andSet = im8Var.a.getAndSet(0, null);
        andSet = (andSet == null || andSet.length < i) ? new byte[i] : andSet;
        tnvVar.g = andSet;
        this.c = andSet;
        this.d = 0;
        this.e = 0;
        this.f = true;
    }

    public static void c(String str) throws IOException {
        throw new CharConversionException(zr.a("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lj90 a(int i, hu8 hu8Var, cmb cmbVar, int i2) throws IOException {
        int i3;
        JsonEncoding jsonEncoding;
        Reader inputStreamReader;
        int i4;
        int i5 = this.d;
        boolean k = JsonFactory.Feature.CHARSET_DETECTION.k(i2);
        tnv tnvVar = this.a;
        byte[] bArr = this.c;
        if (k) {
            if (b(4)) {
                int i6 = this.d;
                int i7 = i6 + 2;
                i3 = 8;
                int i8 = i6 + 3;
                int i9 = (bArr[i8] & 255) | ((bArr[i7] & 255) << 8) | (bArr[i6] << 24) | ((bArr[i6 + 1] & 255) << 16);
                if (i9 == -16842752) {
                    c("3412");
                    throw null;
                }
                if (i9 == -131072) {
                    this.d = i6 + 4;
                    this.h = 4;
                    this.g = false;
                } else if (i9 == 65279) {
                    this.g = true;
                    this.d = i6 + 4;
                    this.h = 4;
                } else {
                    if (i9 == 65534) {
                        c("2143");
                        throw null;
                    }
                    int i10 = i9 >>> 16;
                    if (i10 == 65279) {
                        this.d = i7;
                        this.h = 2;
                        this.g = true;
                    } else if (i10 == 65534) {
                        this.d = i7;
                        this.h = 2;
                        this.g = false;
                    } else if ((i9 >>> 8) == 15711167) {
                        this.d = i8;
                        this.h = 1;
                        this.g = true;
                    } else {
                        if ((i9 >> 8) == 0) {
                            this.g = true;
                        } else if ((16777215 & i9) == 0) {
                            this.g = false;
                        } else {
                            if (((-16711681) & i9) == 0) {
                                c("3412");
                                throw null;
                            }
                            if ((i9 & (-65281)) == 0) {
                                c("2143");
                                throw null;
                            }
                            if ((i10 & 65280) == 0) {
                                this.g = true;
                            } else {
                                if ((i10 & 255) == 0) {
                                    this.g = false;
                                }
                                jsonEncoding = JsonEncoding.UTF8;
                            }
                            this.h = 2;
                        }
                        this.h = 4;
                    }
                }
                i4 = this.h;
                if (i4 != 1) {
                    jsonEncoding = JsonEncoding.UTF8;
                } else if (i4 == 2) {
                    jsonEncoding = this.g ? JsonEncoding.UTF16_BE : JsonEncoding.UTF16_LE;
                } else {
                    if (i4 != 4) {
                        throw new RuntimeException(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
                    }
                    jsonEncoding = this.g ? JsonEncoding.UTF32_BE : JsonEncoding.UTF32_LE;
                }
            } else {
                i3 = 8;
                if (b(2)) {
                    int i11 = this.d;
                    int i12 = (bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8);
                    if ((i12 & 65280) == 0) {
                        this.g = true;
                    } else if ((i12 & 255) == 0) {
                        this.g = false;
                    }
                    this.h = 2;
                    i4 = this.h;
                    if (i4 != 1) {
                    }
                }
                jsonEncoding = JsonEncoding.UTF8;
            }
            tnvVar.c = jsonEncoding;
        } else {
            i3 = 8;
            jsonEncoding = JsonEncoding.UTF8;
        }
        int i13 = this.d - i5;
        if (jsonEncoding == JsonEncoding.UTF8 && JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.k(i2)) {
            return new cyp0(tnvVar, i, this.b, new hu8(hu8Var, hu8Var.c, hu8Var.b.get(), JsonFactory.Feature.INTERN_FIELD_NAMES.k(i2), JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.k(i2)), this.c, this.d, this.e, i13, this.f);
        }
        JsonEncoding jsonEncoding2 = tnvVar.c;
        int h = jsonEncoding2.h();
        if (h == i3 || h == 16) {
            InputStream inputStream = this.b;
            if (inputStream == null) {
                inputStream = new ByteArrayInputStream(bArr, this.d, this.e);
            } else if (this.d < this.e) {
                inputStream = new h920(tnvVar, inputStream, this.c, this.d, this.e);
            }
            inputStreamReader = new InputStreamReader(inputStream, jsonEncoding2.i());
        } else {
            if (h != 32) {
                throw new RuntimeException(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
            }
            inputStreamReader = new ayp0(tnvVar, this.b, this.c, this.d, this.e, tnvVar.c.j());
        }
        return new w7f0(tnvVar, i, inputStreamReader, new cmb(cmbVar, i2, cmbVar.c, cmbVar.b.get()));
    }

    public final boolean b(int i) throws IOException {
        int read;
        int i2 = this.e - this.d;
        while (i2 < i) {
            InputStream inputStream = this.b;
            if (inputStream == null) {
                read = -1;
            } else {
                int i3 = this.e;
                byte[] bArr = this.c;
                read = inputStream.read(bArr, i3, bArr.length - i3);
            }
            if (read < 1) {
                return false;
            }
            this.e += read;
            i2 += read;
        }
        return true;
    }
}
