package xsna;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class zpy0 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        try {
            return new wpy0((InputStream) obj);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
