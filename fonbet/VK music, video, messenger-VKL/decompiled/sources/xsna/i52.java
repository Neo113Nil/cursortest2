package xsna;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import com.facebook.soloader.MinElf;
import java.util.ArrayList;
import xsna.us2;

/* compiled from: AndroidClipboardManager.android.kt */
/* loaded from: classes11.dex */
public final class i52 implements xfd {
    public final Context a;
    public ClipboardManager b;

    public i52(Context context) {
        this.a = context;
    }

    @Override // xsna.xfd
    public final boolean a() {
        ClipDescription primaryClipDescription = b().getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public final ClipboardManager b() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) this.a.getSystemService("clipboard");
        this.b = clipboardManager2;
        return clipboardManager2;
    }

    @Override // xsna.xfd
    public final us2 getText() {
        ClipData primaryClip = b().getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        int i = 0;
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        CharSequence text = itemAt != null ? itemAt.getText() : null;
        if (text == null) {
            return null;
        }
        if (!(text instanceof Spanned)) {
            return new us2(text.toString());
        }
        Spanned spanned = (Spanned) text;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int length = annotationArr.length - 1;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                Annotation annotation = annotationArr[i2];
                if (epx.f(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    Parcel obtain = Parcel.obtain();
                    byte[] decode = Base64.decode(value, i);
                    obtain.unmarshall(decode, i, decode.length);
                    obtain.setDataPosition(i);
                    long j = l5g.k;
                    long j2 = j;
                    long j3 = fno0.c;
                    long j4 = j3;
                    b6s b6sVar = null;
                    u5s u5sVar = null;
                    v5s v5sVar = null;
                    String str = null;
                    et6 et6Var = null;
                    zho0 zho0Var = null;
                    pdo0 pdo0Var = null;
                    v4j0 v4j0Var = null;
                    while (obtain.dataAvail() > 1) {
                        byte readByte = obtain.readByte();
                        if (readByte != 1) {
                            int i3 = 2;
                            if (readByte != 2) {
                                if (readByte != 3) {
                                    if (readByte != 4) {
                                        if (readByte != 5) {
                                            if (readByte != 6) {
                                                if (readByte != 7) {
                                                    if (readByte != 8) {
                                                        if (readByte != 9) {
                                                            if (readByte != 10) {
                                                                if (readByte != 11) {
                                                                    if (readByte == 12) {
                                                                        if (obtain.dataAvail() < 20) {
                                                                            break;
                                                                        }
                                                                        int i4 = l5g.l;
                                                                        long readLong = obtain.readLong();
                                                                        long j5 = readLong & 63;
                                                                        if (j5 >= 16) {
                                                                            readLong = (readLong & (-64)) | (j5 + 1);
                                                                        }
                                                                        v4j0Var = new v4j0(readLong, (Float.floatToRawIntBits(obtain.readFloat()) << 32) | (Float.floatToRawIntBits(obtain.readFloat()) & 4294967295L), obtain.readFloat());
                                                                    }
                                                                } else {
                                                                    if (obtain.dataAvail() < 4) {
                                                                        break;
                                                                    }
                                                                    int readInt = obtain.readInt();
                                                                    if ((readInt | 3) != 3) {
                                                                        vzw.a("The given mask=" + readInt + " is not recognized by TextDecoration.");
                                                                    }
                                                                    pdo0Var = readInt != 0 ? readInt != 1 ? readInt != 2 ? new pdo0(readInt) : pdo0.d : pdo0.c : pdo0.b;
                                                                }
                                                            } else {
                                                                if (obtain.dataAvail() < 8) {
                                                                    break;
                                                                }
                                                                int i5 = l5g.l;
                                                                long readLong2 = obtain.readLong();
                                                                long j6 = readLong2 & 63;
                                                                if (j6 >= 16) {
                                                                    readLong2 = (readLong2 & (-64)) | (j6 + 1);
                                                                }
                                                                j2 = readLong2;
                                                            }
                                                        } else {
                                                            if (obtain.dataAvail() < 8) {
                                                                break;
                                                            }
                                                            zho0Var = new zho0(obtain.readFloat(), obtain.readFloat());
                                                        }
                                                    } else {
                                                        if (obtain.dataAvail() < 4) {
                                                            break;
                                                        }
                                                        et6Var = new et6(obtain.readFloat());
                                                    }
                                                } else {
                                                    if (obtain.dataAvail() < 5) {
                                                        break;
                                                    }
                                                    byte readByte2 = obtain.readByte();
                                                    long j7 = readByte2 == 1 ? 4294967296L : readByte2 == 2 ? 8589934592L : 0L;
                                                    j4 = gno0.a(j7, 0L) ? fno0.c : l2l0.n(obtain.readFloat(), j7);
                                                }
                                            } else {
                                                str = obtain.readString();
                                            }
                                        } else {
                                            if (obtain.dataAvail() < 1) {
                                                break;
                                            }
                                            byte readByte3 = obtain.readByte();
                                            if (readByte3 != 0) {
                                                if (readByte3 == 1) {
                                                    i3 = MinElf.PN_XNUM;
                                                } else if (readByte3 != 3) {
                                                    if (readByte3 == 2) {
                                                        i3 = 1;
                                                    }
                                                }
                                                v5sVar = new v5s(i3);
                                            }
                                            i3 = 0;
                                            v5sVar = new v5s(i3);
                                        }
                                    } else {
                                        if (obtain.dataAvail() < 1) {
                                            break;
                                        }
                                        byte readByte4 = obtain.readByte();
                                        u5sVar = new u5s((readByte4 != 0 && readByte4 == 1) ? 1 : 0);
                                    }
                                } else {
                                    if (obtain.dataAvail() < 4) {
                                        break;
                                    }
                                    b6sVar = new b6s(obtain.readInt());
                                }
                            } else {
                                if (obtain.dataAvail() < 5) {
                                    break;
                                }
                                byte readByte5 = obtain.readByte();
                                long j8 = readByte5 == 1 ? 4294967296L : readByte5 == 2 ? 8589934592L : 0L;
                                j3 = gno0.a(j8, 0L) ? fno0.c : l2l0.n(obtain.readFloat(), j8);
                            }
                        } else {
                            if (obtain.dataAvail() < 8) {
                                break;
                            }
                            int i6 = l5g.l;
                            long readLong3 = obtain.readLong();
                            long j9 = readLong3 & 63;
                            j = j9 < 16 ? readLong3 : (readLong3 & (-64)) | (j9 + 1);
                        }
                    }
                    arrayList.add(new us2.d(new hik0(j, j3, b6sVar, u5sVar, v5sVar, null, str, j4, et6Var, zho0Var, null, j2, pdo0Var, v4j0Var, 49152), spanStart, spanEnd));
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                i = 0;
            }
        }
        return new us2(text.toString(), arrayList, 0);
    }
}
