package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public final class bdh implements aav {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(adh adhVar, g63 g63Var) {
        int i;
        try {
            int c = adhVar.c();
            if ((c & 65496) != 65496 && c != 19789 && c != 18761) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (adhVar.d() == 255) {
                    short d = adhVar.d();
                    if (d == 218) {
                        break;
                    }
                    if (d != 217) {
                        i = adhVar.c() - 2;
                        if (d == 225) {
                            break;
                        }
                        long j = i;
                        if (adhVar.skip(j) != j) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                            break;
                        }
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        break;
                    }
                } else {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    break;
                }
            }
            i = -1;
            if (i == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            izz izzVar = (izz) g63Var;
            byte[] bArr = (byte[]) izzVar.c(i, byte[].class);
            try {
                return g(adhVar, bArr, i);
            } finally {
                izzVar.g(bArr);
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(adh adhVar) {
        try {
            int c = adhVar.c();
            if (c == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int d = (c << 8) | adhVar.d();
            if (d == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int d2 = (d << 8) | adhVar.d();
            if (d2 == -1991225785) {
                adhVar.skip(21L);
                try {
                    return adhVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (d2 == 1380533830) {
                adhVar.skip(4L);
                if (((adhVar.c() << 16) | adhVar.c()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int c2 = (adhVar.c() << 16) | adhVar.c();
                if ((c2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = c2 & 255;
                if (i == 88) {
                    adhVar.skip(4L);
                    short d3 = adhVar.d();
                    return (d3 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (d3 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                adhVar.skip(4L);
                return (adhVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((adhVar.c() << 16) | adhVar.c()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int c3 = (adhVar.c() << 16) | adhVar.c();
            if (c3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = c3 == 1635150182;
            adhVar.skip(4L);
            int i3 = d2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int c4 = (adhVar.c() << 16) | adhVar.c();
                    if (c4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (c4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(adh adhVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        if (adhVar.b(i, bArr) != i) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = a;
        boolean z = bArr != null && i > bArr2.length;
        if (z) {
            int i2 = 0;
            while (true) {
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
        }
        if (!z) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
        if (s == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (s != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        byteBuffer.order(byteOrder);
        int i3 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        int i4 = i3 + 6;
        short s2 = byteBuffer.remaining() - i4 >= 2 ? byteBuffer.getShort(i4) : (short) -1;
        for (int i5 = 0; i5 < s2; i5++) {
            int i6 = (i5 * 12) + i3 + 8;
            if ((byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1) == 274) {
                int i7 = i6 + 2;
                short s3 = byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : (short) -1;
                if (s3 < 1 || s3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int i8 = i6 + 4;
                    int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : -1;
                    if (i9 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i10 = i9 + b[s3];
                        if (i10 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i11 = i6 + 8;
                            if (i11 < 0 || i11 > byteBuffer.remaining()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i10 >= 0 && i10 + i11 <= byteBuffer.remaining()) {
                                    if (byteBuffer.remaining() - i11 >= 2) {
                                        return byteBuffer.getShort(i11);
                                    }
                                    return -1;
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.aav
    public final int a(InputStream inputStream, g63 g63Var) {
        zgf zgfVar = new zgf(19, inputStream);
        z2a1.e(g63Var, "Argument must not be null");
        return e(zgfVar, g63Var);
    }

    @Override // defpackage.aav
    public final ImageHeaderParser$ImageType b(InputStream inputStream) {
        return f(new zgf(19, inputStream));
    }

    @Override // defpackage.aav
    public final ImageHeaderParser$ImageType c(ByteBuffer byteBuffer) {
        z2a1.e(byteBuffer, "Argument must not be null");
        return f(new zch(byteBuffer));
    }

    @Override // defpackage.aav
    public final int d(ByteBuffer byteBuffer, g63 g63Var) {
        zch zchVar = new zch(byteBuffer);
        z2a1.e(g63Var, "Argument must not be null");
        return e(zchVar, g63Var);
    }
}
