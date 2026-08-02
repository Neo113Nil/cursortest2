package xsna;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
/* loaded from: classes8.dex */
public final class wh90<T> {
    public final ConcurrentHashMap<List<xcy>, Result<KSerializer<T>>> a = new ConcurrentHashMap<>();
}
