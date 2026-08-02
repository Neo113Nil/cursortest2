package xsna;

import kotlinx.serialization.KSerializer;

/* compiled from: PluginHelperInterfaces.kt */
/* loaded from: classes8.dex */
public interface vht<T> extends KSerializer<T> {
    KSerializer<?>[] childSerializers();

    KSerializer<?>[] typeParametersSerializers();
}
