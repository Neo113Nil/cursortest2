package xsna;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Serializer.kt */
/* loaded from: classes12.dex */
public interface qmi0<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, spj<? super T> spjVar);

    Object writeTo(T t, OutputStream outputStream, spj<? super s3q0> spjVar);
}
