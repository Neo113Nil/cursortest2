package xsna;

import com.googlecode.mp4parser.AbstractBox;
import org.mp4parser.aspectj.lang.NoAspectBoundException;

/* compiled from: RequiresParseDetailAspect.java */
/* loaded from: classes13.dex */
public final class w8g0 {
    public static final /* synthetic */ Throwable a;
    public static final /* synthetic */ w8g0 b;

    static {
        try {
            b = new w8g0();
        } catch (Throwable th) {
            a = th;
        }
    }

    public static w8g0 a() {
        w8g0 w8g0Var = b;
        if (w8g0Var != null) {
            return w8g0Var;
        }
        throw new NoAspectBoundException(a);
    }

    public static void b(o0y o0yVar) {
        Object obj = o0yVar.b;
        if (!(obj instanceof AbstractBox)) {
            throw new RuntimeException("Only methods in subclasses of " + AbstractBox.class.getName() + " can  be annotated with ParseDetail");
        }
        AbstractBox abstractBox = (AbstractBox) obj;
        if (abstractBox.isParsed()) {
            return;
        }
        abstractBox.parseDetails();
    }
}
