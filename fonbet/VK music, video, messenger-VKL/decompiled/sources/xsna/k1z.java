package xsna;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import xsna.g1z;
import xsna.ma2;

/* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* loaded from: classes11.dex */
public final class k1z implements jua0 {
    public final View a;
    public final j2x b;
    public j1z e;
    public gho0 f;
    public rut0 g;
    public Rect l;
    public final t0z m;
    public izs<? super List<? extends pzo>, s3q0> c = new leq(13);
    public izs<? super qnw, s3q0> d = new i0r(4);
    public tho0 h = new tho0("", qko0.b, 4);
    public rnw i = rnw.g;
    public final ArrayList j = new ArrayList();
    public final Object k = msy.a(LazyThreadSafetyMode.NONE, new u3k(this, 25));

    /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
    public static final class a {
        public a() {
        }
    }

    public k1z(View view, ma2.a.b bVar, j2x j2xVar) {
        this.a = view;
        this.b = j2xVar;
        this.m = new t0z(bVar, j2xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    @Override // xsna.jua0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final thf0 a(EditorInfo editorInfo) {
        int i;
        lwz lwzVar;
        int i2;
        int i3;
        tho0 tho0Var = this.h;
        String str = tho0Var.a.c;
        long j = tho0Var.b;
        rnw rnwVar = this.i;
        int i4 = rnwVar.e;
        int i5 = rnwVar.d;
        boolean z = rnwVar.a;
        if (i4 != 1) {
            if (i4 == 0) {
                i = 1;
            } else if (i4 == 2) {
                i = 2;
            } else if (i4 == 6) {
                i = 5;
            } else if (i4 == 5) {
                i = 7;
            } else if (i4 == 3) {
                i = 3;
            } else if (i4 == 4) {
                i = 4;
            } else {
                if (i4 != 7) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i = 6;
            }
            editorInfo.imeOptions = i;
            lwzVar = rnwVar.f;
            if (epx.f(lwzVar, lwz.d)) {
            }
            if (i5 != 1) {
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i6 = qko0.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            k4p.b(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (otm0.a) {
            }
            k4p.c(editorInfo, false);
            g1z.a aVar = g1z.a;
            if (androidx.emoji2.text.c.d()) {
            }
            thf0 thf0Var = new thf0(this.h, new a(), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(thf0Var));
            return thf0Var;
        }
        if (!z) {
            i = 0;
            editorInfo.imeOptions = i;
            lwzVar = rnwVar.f;
            if (epx.f(lwzVar, lwz.d)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(c5g.u(lwzVar, 10));
                Iterator<kwz> it = lwzVar.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        i2 = 2;
                    } else if (i5 == 4) {
                        i2 = 3;
                    } else if (i5 == 5) {
                        i2 = 17;
                    } else if (i5 == 6) {
                        i2 = 33;
                    } else if (i5 == 7) {
                        i2 = 129;
                    } else if (i5 == 8) {
                        i2 = 18;
                    } else {
                        if (i5 != 9) {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        i2 = 8194;
                    }
                    editorInfo.inputType = i2;
                    if (!z && (i2 & 1) == 1) {
                        editorInfo.inputType = 131072 | i2;
                        if (rnwVar.e == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                        int i7 = rnwVar.b;
                        if (i7 == 1) {
                            editorInfo.inputType = i3 | 4096;
                        } else if (i7 == 2) {
                            editorInfo.inputType = i3 | 8192;
                        } else if (i7 == 3) {
                            editorInfo.inputType = i3 | 16384;
                        }
                        if (rnwVar.c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    int i62 = qko0.c;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & 4294967295L);
                    k4p.b(editorInfo, str);
                    editorInfo.imeOptions |= 33554432;
                    if (otm0.a || i5 == 7 || i5 == 8) {
                        k4p.c(editorInfo, false);
                    } else {
                        k4p.c(editorInfo, true);
                        editorInfo.setSupportedHandwritingGestures(e43.l(la1.e(), g92.c(), ma1.g(), na1.e(), h92.g(), i92.b(), sa1.g()));
                        editorInfo.setSupportedHandwritingGesturePreviews(rl3.y0(new Class[]{la1.e(), g92.c(), ma1.g(), na1.e()}));
                    }
                    g1z.a aVar2 = g1z.a;
                    if (androidx.emoji2.text.c.d()) {
                        androidx.emoji2.text.c.a().i(editorInfo);
                    }
                    thf0 thf0Var2 = new thf0(this.h, new a(), this.i.c, this.e, this.f, this.g);
                    this.j.add(new WeakReference(thf0Var2));
                    return thf0Var2;
                }
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
                editorInfo.inputType = 131072 | i2;
                if (rnwVar.e == 1) {
                }
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i622 = qko0.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            k4p.b(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (otm0.a) {
            }
            k4p.c(editorInfo, false);
            g1z.a aVar22 = g1z.a;
            if (androidx.emoji2.text.c.d()) {
            }
            thf0 thf0Var22 = new thf0(this.h, new a(), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(thf0Var22));
            return thf0Var22;
        }
        i = 6;
        editorInfo.imeOptions = i;
        lwzVar = rnwVar.f;
        if (epx.f(lwzVar, lwz.d)) {
        }
        if (i5 != 1) {
        }
        i2 = 1;
        editorInfo.inputType = i2;
        if (!z) {
        }
        i3 = editorInfo.inputType;
        if ((i3 & 1) == 1) {
        }
        int i6222 = qko0.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        k4p.b(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (otm0.a) {
        }
        k4p.c(editorInfo, false);
        g1z.a aVar222 = g1z.a;
        if (androidx.emoji2.text.c.d()) {
        }
        thf0 thf0Var222 = new thf0(this.h, new a(), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(thf0Var222));
        return thf0Var222;
    }
}
