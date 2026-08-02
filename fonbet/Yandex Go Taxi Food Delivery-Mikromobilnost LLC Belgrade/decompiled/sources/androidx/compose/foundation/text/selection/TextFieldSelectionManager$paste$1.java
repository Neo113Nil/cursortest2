package androidx.compose.foundation.text.selection;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import androidx.compose.foundation.text.HandleState;
import defpackage.asy0;
import defpackage.ay11;
import defpackage.b3c;
import defpackage.bgr0;
import defpackage.bmt0;
import defpackage.c3c;
import defpackage.eja1;
import defpackage.eyr;
import defpackage.fmb1;
import defpackage.hk2;
import defpackage.hzr;
import defpackage.ik2;
import defpackage.izr;
import defpackage.jl40;
import defpackage.k5z;
import defpackage.kk2;
import defpackage.ldc;
import defpackage.lzr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rly0;
import defpackage.scc;
import defpackage.soy0;
import defpackage.sty0;
import defpackage.td5;
import defpackage.tse;
import defpackage.w72;
import defpackage.wls;
import defpackage.zgf;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {928, 928}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$paste$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$paste$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0045, code lost:
    
        if (r7 == r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02ab, code lost:
    
        if (r2 == r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02ad, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b3cVar;
        zy11 zy11Var;
        Object obj2;
        CharSequence text;
        CharSequence charSequence;
        int i;
        char c;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        zy11 zy11Var2 = zy11.a;
        byte b = 1;
        if (i3 == 0) {
            kotlin.b.b(obj);
            c3c c3cVar = this.this$0.h;
            if (c3cVar != null) {
                this.label = 1;
                ClipData primaryClip = ((w72) c3cVar).a.a().getPrimaryClip();
                b3cVar = primaryClip != null ? new b3c(primaryClip) : null;
            }
            return zy11Var2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = obj;
            zy11Var = zy11Var2;
            kk2 kk2Var = (kk2) obj2;
            if (kk2Var == null) {
                return zy11Var;
            }
            j jVar = this.this$0;
            if (!jVar.k()) {
                return zy11Var;
            }
            hk2 hk2Var = new hk2(fmb1.n(jVar.o(), jVar.o().a.b.length()));
            hk2Var.b(kk2Var);
            kk2 i4 = hk2Var.i();
            kk2 m = fmb1.m(jVar.o(), jVar.o().a.b.length());
            hk2 hk2Var2 = new hk2(i4);
            hk2Var2.b(m);
            kk2 i5 = hk2Var2.i();
            int length = kk2Var.b.length() + asy0.f(jVar.o().b);
            jVar.c.invoke(j.e(i5, eja1.c(length, length)));
            jVar.r(HandleState.None);
            ay11 ay11Var = jVar.a;
            if (ay11Var == null) {
                return zy11Var;
            }
            ay11Var.f = true;
            return zy11Var;
        }
        kotlin.b.b(obj);
        b3cVar = obj;
        b3c b3cVar2 = (b3c) b3cVar;
        if (b3cVar2 != null) {
            this.label = 2;
            ClipData clipData = b3cVar2.a;
            int i6 = 0;
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null) {
                zy11Var = zy11Var2;
                obj2 = null;
            } else if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                int length2 = annotationArr.length - 1;
                if (length2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i7];
                        if (jl40.l(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            i = i6;
                            zgf zgfVar = new zgf(annotation.getValue());
                            Parcel parcel = (Parcel) zgfVar.b;
                            long j = ldc.m;
                            long j2 = j;
                            long j3 = sty0.c;
                            long j4 = j3;
                            lzr lzrVar = null;
                            hzr hzrVar = null;
                            izr izrVar = null;
                            String str = null;
                            td5 td5Var = null;
                            soy0 soy0Var = null;
                            rly0 rly0Var = null;
                            bgr0 bgr0Var = null;
                            while (parcel.dataAvail() > b) {
                                byte readByte = parcel.readByte();
                                if (readByte == b) {
                                    if (parcel.dataAvail() < 8) {
                                        break;
                                    }
                                    j = zgfVar.a();
                                } else if (readByte == 2) {
                                    if (parcel.dataAvail() < 5) {
                                        break;
                                    }
                                    j3 = zgfVar.e();
                                    b = 1;
                                } else if (readByte == 3) {
                                    if (parcel.dataAvail() < 4) {
                                        break;
                                    }
                                    lzrVar = new lzr(parcel.readInt());
                                    b = 1;
                                } else if (readByte == 4) {
                                    b = 1;
                                    if (parcel.dataAvail() < 1) {
                                        break;
                                    }
                                    byte readByte2 = parcel.readByte();
                                    hzrVar = new hzr((readByte2 != 0 && readByte2 == 1) ? 1 : i);
                                } else if (readByte != 5) {
                                    if (readByte == 6) {
                                        str = parcel.readString();
                                    } else if (readByte == 7) {
                                        if (parcel.dataAvail() < 5) {
                                            break;
                                        }
                                        j4 = zgfVar.e();
                                    } else if (readByte == 8) {
                                        if (parcel.dataAvail() < 4) {
                                            break;
                                        }
                                        td5Var = new td5(parcel.readFloat());
                                    } else if (readByte == 9) {
                                        if (parcel.dataAvail() < 8) {
                                            break;
                                        }
                                        soy0Var = new soy0(parcel.readFloat(), parcel.readFloat());
                                    } else if (readByte != 10) {
                                        if (readByte != 11) {
                                            charSequence = text;
                                            if (readByte == 12) {
                                                if (parcel.dataAvail() < 20) {
                                                    break;
                                                }
                                                zy11Var2 = zy11Var2;
                                                text = charSequence;
                                                bgr0Var = new bgr0(zgfVar.a(), (Float.floatToRawIntBits(parcel.readFloat()) << 32) | (Float.floatToRawIntBits(parcel.readFloat()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), parcel.readFloat());
                                            }
                                        } else {
                                            if (parcel.dataAvail() < 4) {
                                                break;
                                            }
                                            int readInt = parcel.readInt();
                                            int i8 = (readInt & 2) != 0 ? 1 : i;
                                            int i9 = (readInt & 1) != 0 ? 1 : i;
                                            rly0 rly0Var2 = rly0.d;
                                            charSequence = text;
                                            rly0 rly0Var3 = rly0.c;
                                            if (i8 != 0 && i9 != 0) {
                                                List g = scc.g(rly0Var2, rly0Var3);
                                                Integer valueOf = Integer.valueOf(i);
                                                int size = g.size();
                                                int i10 = i;
                                                while (i10 < size) {
                                                    valueOf = Integer.valueOf(((rly0) g.get(i10)).a | valueOf.intValue());
                                                    i10++;
                                                    g = g;
                                                }
                                                rly0Var = new rly0(valueOf.intValue());
                                            } else if (i8 != 0) {
                                                rly0Var = rly0Var2;
                                            } else {
                                                if (i9 == 0) {
                                                    rly0Var3 = rly0.b;
                                                }
                                                rly0Var = rly0Var3;
                                            }
                                        }
                                        text = charSequence;
                                    } else {
                                        if (parcel.dataAvail() < 8) {
                                            break;
                                        }
                                        j2 = zgfVar.a();
                                    }
                                    b = 1;
                                } else {
                                    if (parcel.dataAvail() < 1) {
                                        break;
                                    }
                                    byte readByte3 = parcel.readByte();
                                    if (readByte3 == 0) {
                                        i2 = i;
                                    } else if (readByte3 == 1) {
                                        i2 = 65535;
                                    } else if (readByte3 == 3) {
                                        i2 = 2;
                                    } else {
                                        c = 2;
                                        i2 = readByte3 == 2 ? 1 : i;
                                        izrVar = new izr(i2);
                                        b = 1;
                                    }
                                    c = 2;
                                    izrVar = new izr(i2);
                                    b = 1;
                                }
                            }
                            charSequence = text;
                            zy11Var = zy11Var2;
                            arrayList.add(new ik2(new bmt0(j, j3, lzrVar, hzrVar, izrVar, (eyr) null, str, j4, td5Var, soy0Var, (k5z) null, j2, rly0Var, bgr0Var, 49152), spanStart, spanEnd));
                        } else {
                            charSequence = text;
                            zy11Var = zy11Var2;
                            i = i6;
                        }
                        if (i7 == length2) {
                            break;
                        }
                        i7++;
                        i6 = i;
                        zy11Var2 = zy11Var;
                        text = charSequence;
                        b = 1;
                    }
                } else {
                    charSequence = text;
                    zy11Var = zy11Var2;
                }
                obj2 = new kk2(4, charSequence.toString(), arrayList);
            } else {
                zy11Var = zy11Var2;
                obj2 = new kk2(text.toString());
            }
        }
        return zy11Var2;
    }
}
