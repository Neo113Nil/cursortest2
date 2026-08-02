package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import xsna.gmi0;

/* compiled from: SerialDescriptor.kt */
/* loaded from: classes8.dex */
public interface SerialDescriptor {
    boolean b();

    int c();

    String d(int i);

    List<Annotation> e(int i);

    String f();

    int g(String str);

    List<Annotation> getAnnotations();

    gmi0 getKind();

    SerialDescriptor h(int i);

    boolean i(int i);

    boolean isInline();
}
