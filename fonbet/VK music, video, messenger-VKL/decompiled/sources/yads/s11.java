package yads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes10.dex */
public class s11 extends q30 {
    public final int d;

    public s11() {
        super(a(2008, 1));
        this.d = 1;
    }

    public static int a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static s11 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !ki.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new r11(iOException) : new s11(iOException, i2, i);
    }

    public s11(IOException iOException, int i, int i2) {
        super(iOException, a(i, i2));
        this.d = i2;
    }

    public s11(String str, int i) {
        super(a(i, 1), str);
        this.d = 1;
    }

    public s11(String str, IOException iOException, int i) {
        super(str, iOException, a(i, 1));
        this.d = 1;
    }
}
