package defpackage;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.foundation.text.input.internal.d;
import androidx.compose.foundation.text.selection.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class pay implements fwc0 {
    public final View a;
    public final h0w b;
    public oay e;
    public j f;
    public xp31 g;
    public Rect l;
    public final c m;
    public tls c = new mtw(24);
    public tls d = new mtw(25);
    public hoy0 h = new hoy0("", asy0.b, 4);
    public eiv i = eiv.g;
    public final ArrayList j = new ArrayList();
    public final i3y k = a.b(LazyThreadSafetyMode.NONE, new yow(13, this));

    public pay(View view, tls tlsVar, h0w h0wVar) {
        this.a = view;
        this.b = h0wVar;
        this.m = new c(tlsVar, h0wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RecordingInputConnection a(EditorInfo editorInfo) {
        int i;
        k5z k5zVar;
        int i2;
        int i3;
        hoy0 hoy0Var = this.h;
        String str = hoy0Var.a.b;
        long j = hoy0Var.b;
        eiv eivVar = this.i;
        int i4 = eivVar.e;
        int i5 = eivVar.d;
        boolean z = eivVar.a;
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
                    ny61.r("invalid ImeAction");
                    return null;
                }
                i = 6;
            }
            editorInfo.imeOptions = i;
            k5zVar = eivVar.f;
            if (jl40.l(k5zVar, k5z.c)) {
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
            int i6 = asy0.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            lon.b(editorInfo, str);
            editorInfo.imeOptions |= SelfTester_JCP.DECRYPT_CFB;
            if (hyu0.a) {
            }
            lon.c(editorInfo, false);
            tls tlsVar = d.a;
            if (ftn.e()) {
            }
            RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.h, new reu(19, this), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(recordingInputConnection));
            return recordingInputConnection;
        }
        if (!z) {
            i = 0;
            editorInfo.imeOptions = i;
            k5zVar = eivVar.f;
            if (jl40.l(k5zVar, k5z.c)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(tcc.n(k5zVar, 10));
                Iterator it = k5zVar.a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((h5z) it.next()).a);
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
                        i2 = HProv.PP_SECURITY_LEVEL;
                    } else if (i5 == 8) {
                        i2 = 18;
                    } else {
                        if (i5 != 9) {
                            ny61.r("Invalid Keyboard Type");
                            return null;
                        }
                        i2 = 8194;
                    }
                    editorInfo.inputType = i2;
                    if (!z && (i2 & 1) == 1) {
                        editorInfo.inputType = 131072 | i2;
                        if (eivVar.e == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                        int i7 = eivVar.b;
                        if (i7 == 1) {
                            editorInfo.inputType = i3 | 4096;
                        } else if (i7 == 2) {
                            editorInfo.inputType = i3 | 8192;
                        } else if (i7 == 3) {
                            editorInfo.inputType = i3 | 16384;
                        }
                        if (eivVar.c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    int i62 = asy0.c;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    lon.b(editorInfo, str);
                    editorInfo.imeOptions |= SelfTester_JCP.DECRYPT_CFB;
                    if (hyu0.a || i5 == 7 || i5 == 8) {
                        lon.c(editorInfo, false);
                    } else {
                        lon.c(editorInfo, true);
                        editorInfo.setSupportedHandwritingGestures(scc.g(o9f.p(), jon.o(), o9f.x(), o9f.z(), jon.w(), jon.z(), jon.B()));
                        editorInfo.setSupportedHandwritingGesturePreviews(j73.f0(new Class[]{o9f.p(), jon.o(), o9f.x(), o9f.z()}));
                    }
                    tls tlsVar2 = d.a;
                    if (ftn.e()) {
                        ftn.a().m(editorInfo);
                    }
                    RecordingInputConnection recordingInputConnection2 = new RecordingInputConnection(this.h, new reu(19, this), this.i.c, this.e, this.f, this.g);
                    this.j.add(new WeakReference(recordingInputConnection2));
                    return recordingInputConnection2;
                }
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
                editorInfo.inputType = 131072 | i2;
                if (eivVar.e == 1) {
                }
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i622 = asy0.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            lon.b(editorInfo, str);
            editorInfo.imeOptions |= SelfTester_JCP.DECRYPT_CFB;
            if (hyu0.a) {
            }
            lon.c(editorInfo, false);
            tls tlsVar22 = d.a;
            if (ftn.e()) {
            }
            RecordingInputConnection recordingInputConnection22 = new RecordingInputConnection(this.h, new reu(19, this), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(recordingInputConnection22));
            return recordingInputConnection22;
        }
        i = 6;
        editorInfo.imeOptions = i;
        k5zVar = eivVar.f;
        if (jl40.l(k5zVar, k5z.c)) {
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
        int i6222 = asy0.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        lon.b(editorInfo, str);
        editorInfo.imeOptions |= SelfTester_JCP.DECRYPT_CFB;
        if (hyu0.a) {
        }
        lon.c(editorInfo, false);
        tls tlsVar222 = d.a;
        if (ftn.e()) {
        }
        RecordingInputConnection recordingInputConnection222 = new RecordingInputConnection(this.h, new reu(19, this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(recordingInputConnection222));
        return recordingInputConnection222;
    }
}
