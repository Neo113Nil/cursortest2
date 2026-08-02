package xsna;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import androidx.compose.foundation.text.HandleState;
import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.us2;

/* compiled from: TextFieldSelectionManager.kt */
@b6l(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {PDF417Common.MAX_CODEWORDS_IN_BARCODE, PDF417Common.MAX_CODEWORDS_IN_BARCODE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class hho0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ gho0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho0(gho0 gho0Var, spj<? super hho0> spjVar) {
        super(2, spjVar);
        this.this$0 = gho0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hho0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hho0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0032, code lost:
    
        if (r2 == r1) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x030e, code lost:
    
        if (r3 == r1) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0310, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        CharSequence text;
        byte b;
        int i;
        byte b2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        byte b3 = 2;
        if (i2 == 0) {
            kotlin.a.a(obj);
            wfd wfdVar = this.this$0.h;
            if (wfdVar != null) {
                this.label = 1;
                a = wfdVar.a();
            }
            return s3q0.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            obj2 = obj;
            us2 us2Var = (us2) obj2;
            if (us2Var != null) {
                gho0 gho0Var = this.this$0;
                if (gho0Var.l()) {
                    us2 e = x1o0.m(gho0Var.p(), gho0Var.p().a.c.length()).e(us2Var).e(x1o0.l(gho0Var.p(), gho0Var.p().a.c.length()));
                    int length = us2Var.c.length() + qko0.f(gho0Var.p().b);
                    gho0Var.c.invoke(gho0.g(e, jgz.c(length, length)));
                    gho0Var.s(HandleState.None);
                    c3q0 c3q0Var = gho0Var.a;
                    if (c3q0Var != null) {
                        c3q0Var.f = true;
                    }
                }
                return s3q0.a;
            }
            return s3q0.a;
        }
        kotlin.a.a(obj);
        a = obj;
        nvc nvcVar = (nvc) a;
        if (nvcVar != null) {
            this.label = 2;
            byte b4 = 0;
            ClipData.Item itemAt = nvcVar.a.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null) {
                obj2 = null;
            } else if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                int length2 = annotationArr.length - 1;
                if (length2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i3];
                        if (epx.f(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            Parcel obtain = Parcel.obtain();
                            byte[] decode = Base64.decode(value, b4);
                            obtain.unmarshall(decode, b4, decode.length);
                            obtain.setDataPosition(b4);
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
                                    i = spanStart;
                                    b = b4;
                                    if (readByte == b3) {
                                        if (obtain.dataAvail() < 5) {
                                            break;
                                        }
                                        byte readByte2 = obtain.readByte();
                                        long j5 = readByte2 == 1 ? 4294967296L : readByte2 == b3 ? 8589934592L : 0L;
                                        j3 = gno0.a(j5, 0L) ? fno0.c : l2l0.n(obtain.readFloat(), j5);
                                        spanStart = i;
                                        b4 = b;
                                    } else if (readByte == 3) {
                                        if (obtain.dataAvail() < 4) {
                                            break;
                                        }
                                        b6sVar = new b6s(obtain.readInt());
                                        spanStart = i;
                                        b4 = b;
                                    } else if (readByte == 4) {
                                        if (obtain.dataAvail() < 1) {
                                            break;
                                        }
                                        byte readByte3 = obtain.readByte();
                                        u5sVar = new u5s((readByte3 != 0 && readByte3 == 1) ? (byte) 1 : b);
                                        spanStart = i;
                                        b4 = b;
                                    } else if (readByte != 5) {
                                        if (readByte == 6) {
                                            str = obtain.readString();
                                        } else if (readByte == 7) {
                                            if (obtain.dataAvail() < 5) {
                                                break;
                                            }
                                            byte readByte4 = obtain.readByte();
                                            long j6 = readByte4 == 1 ? 4294967296L : readByte4 == b3 ? 8589934592L : 0L;
                                            j4 = gno0.a(j6, 0L) ? fno0.c : l2l0.n(obtain.readFloat(), j6);
                                        } else if (readByte == 8) {
                                            if (obtain.dataAvail() < 4) {
                                                break;
                                            }
                                            et6Var = new et6(obtain.readFloat());
                                        } else if (readByte == 9) {
                                            if (obtain.dataAvail() < 8) {
                                                break;
                                            }
                                            zho0Var = new zho0(obtain.readFloat(), obtain.readFloat());
                                        } else if (readByte == 10) {
                                            if (obtain.dataAvail() < 8) {
                                                break;
                                            }
                                            int i4 = l5g.l;
                                            long readLong = obtain.readLong();
                                            long j7 = readLong & 63;
                                            if (j7 >= 16) {
                                                readLong = (readLong & (-64)) | (j7 + 1);
                                            }
                                            j2 = readLong;
                                        } else if (readByte != 11) {
                                            if (readByte == 12) {
                                                if (obtain.dataAvail() < 20) {
                                                    break;
                                                }
                                                int i5 = l5g.l;
                                                long readLong2 = obtain.readLong();
                                                long j8 = readLong2 & 63;
                                                if (j8 >= 16) {
                                                    readLong2 = (readLong2 & (-64)) | (j8 + 1);
                                                }
                                                spanStart = i;
                                                b4 = b;
                                                v4j0Var = new v4j0(readLong2, (Float.floatToRawIntBits(obtain.readFloat()) << 32) | (Float.floatToRawIntBits(obtain.readFloat()) & 4294967295L), obtain.readFloat());
                                                b3 = 2;
                                            }
                                            spanStart = i;
                                            b4 = b;
                                            b3 = 2;
                                        } else {
                                            if (obtain.dataAvail() < 4) {
                                                break;
                                            }
                                            int readInt = obtain.readInt();
                                            byte b5 = (readInt & 2) != 0 ? (byte) 1 : b;
                                            byte b6 = (readInt & 1) != 0 ? (byte) 1 : b;
                                            pdo0 pdo0Var2 = pdo0.d;
                                            pdo0 pdo0Var3 = pdo0.c;
                                            if (b5 == 0 || b6 == 0) {
                                                pdo0Var = b5 != 0 ? pdo0Var2 : b6 != 0 ? pdo0Var3 : pdo0.b;
                                            } else {
                                                List l = e43.l(pdo0Var2, pdo0Var3);
                                                Integer valueOf = Integer.valueOf(b);
                                                int size = l.size();
                                                for (int i6 = b; i6 < size; i6++) {
                                                    valueOf = Integer.valueOf(((pdo0) l.get(i6)).a | valueOf.intValue());
                                                }
                                                pdo0Var = new pdo0(valueOf.intValue());
                                            }
                                            spanStart = i;
                                            b4 = b;
                                            b3 = 2;
                                        }
                                        spanStart = i;
                                        b4 = b;
                                    } else {
                                        if (obtain.dataAvail() < 1) {
                                            break;
                                        }
                                        byte readByte5 = obtain.readByte();
                                        if (readByte5 != 0) {
                                            if (readByte5 == 1) {
                                                b2 = 65535;
                                            } else if (readByte5 == 3) {
                                                b2 = b3;
                                            } else if (readByte5 == b3) {
                                                b2 = 1;
                                            }
                                            v5sVar = new v5s(b2);
                                            spanStart = i;
                                            b4 = b;
                                        }
                                        b2 = b;
                                        v5sVar = new v5s(b2);
                                        spanStart = i;
                                        b4 = b;
                                    }
                                } else {
                                    if (obtain.dataAvail() < 8) {
                                        break;
                                    }
                                    int i7 = l5g.l;
                                    long readLong3 = obtain.readLong();
                                    long j9 = readLong3 & 63;
                                    j = j9 < 16 ? readLong3 : (readLong3 & (-64)) | (j9 + 1);
                                }
                            }
                            b = b4;
                            i = spanStart;
                            arrayList.add(new us2.d(new hik0(j, j3, b6sVar, u5sVar, v5sVar, null, str, j4, et6Var, zho0Var, null, j2, pdo0Var, v4j0Var, 49152), i, spanEnd));
                        } else {
                            b = b4;
                        }
                        if (i3 == length2) {
                            break;
                        }
                        i3++;
                        b4 = b;
                        b3 = 2;
                    }
                } else {
                    b = 0;
                }
                obj2 = new us2(text.toString(), arrayList, b);
            } else {
                obj2 = new us2(text.toString());
            }
        }
        return s3q0.a;
    }
}
