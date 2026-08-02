package xsna;

import com.google.common.primitives.ImmutableIntArray;
import com.ironsource.X3;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* compiled from: UnsupportedBrandsSniffFailure.java */
/* loaded from: classes12.dex */
public final class v6q0 implements lbk0 {
    public final /* synthetic */ int b;
    public final int c;
    public final Serializable d;

    public v6q0(Throwable th, int i) {
        this.b = 1;
        this.d = new StringBuilder();
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (b() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(StackTraceElement[] stackTraceElementArr, Throwable th, String str, String str2, Set set) {
        StringBuilder sb = (StringBuilder) this.d;
        if (set.contains(th)) {
            sb.append(str);
            sb.append(str2);
            sb.append("[CIRCULAR REFERENCE: ");
            sb.append(th);
            sb.append(X3.j.e);
            sb.append(System.lineSeparator());
            return true;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTraceElementArr.length - 1;
        int length2 = stackTrace.length - 1;
        while (length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTrace[length2])) {
            length--;
            length2--;
        }
        sb.append(str);
        sb.append(str2);
        sb.append(th);
        sb.append(System.lineSeparator());
        if (!b()) {
            int i = 0;
            while (true) {
                if (i > length2) {
                    int length3 = (stackTrace.length - 1) - length2;
                    if (length3 != 0) {
                        sb.append(str);
                        sb.append("\t... ");
                        sb.append(length3);
                        sb.append(" more");
                        sb.append(System.lineSeparator());
                    }
                    Throwable[] suppressed = th.getSuppressed();
                    int length4 = suppressed.length;
                    int i2 = 0;
                    while (i2 < length4) {
                        Set set2 = set;
                        if (!a(stackTrace, suppressed[i2], fo8.a(str, "\t"), "Suppressed: ", set2)) {
                            i2++;
                            set = set2;
                        }
                    }
                    Set set3 = set;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        return a(stackTrace, cause, str, "Caused by: ", set3);
                    }
                    return false;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                sb.append(str);
                sb.append("\tat ");
                sb.append(stackTraceElement);
                sb.append(System.lineSeparator());
                if (b()) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public boolean b() {
        return ((StringBuilder) this.d).length() >= this.c;
    }

    public String toString() {
        switch (this.b) {
            case 0:
                ImmutableIntArray immutableIntArray = (ImmutableIntArray) this.d;
                ArrayList arrayList = new ArrayList(immutableIntArray.d());
                for (int i = 0; i < immutableIntArray.d(); i++) {
                    int a = immutableIntArray.a(i);
                    String str = y2r0.a;
                    arrayList.add(new String(ipx.y(a), StandardCharsets.US_ASCII));
                }
                StringBuilder sb = new StringBuilder("UnsupportedBrands{major=");
                String str2 = y2r0.a;
                sb.append(new String(ipx.y(this.c), StandardCharsets.US_ASCII));
                sb.append(", compatible=");
                sb.append(arrayList);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public v6q0(int i, int[] iArr) {
        ImmutableIntArray immutableIntArray;
        this.b = 0;
        this.c = i;
        if (iArr != null) {
            ImmutableIntArray immutableIntArray2 = ImmutableIntArray.b;
            immutableIntArray = iArr.length == 0 ? ImmutableIntArray.b : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
        } else {
            immutableIntArray = ImmutableIntArray.b;
        }
        this.d = immutableIntArray;
    }
}
