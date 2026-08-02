package xsna;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;

/* compiled from: Schema.java */
/* loaded from: classes.dex */
public interface m8h0<T> {
    void a(T t, T t2);

    T b();

    boolean c(T t);

    void d(T t);

    int e(androidx.datastore.preferences.protobuf.a aVar);

    void f(Object obj, androidx.datastore.preferences.protobuf.g gVar, androidx.datastore.preferences.protobuf.j jVar) throws IOException;

    boolean g(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    void h(T t, Writer writer) throws IOException;

    int i(GeneratedMessageLite generatedMessageLite);
}
