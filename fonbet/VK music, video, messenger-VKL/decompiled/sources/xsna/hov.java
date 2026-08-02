package xsna;

import com.vk.core.serialize.Serializer;

/* compiled from: ISerializerCache.kt */
/* loaded from: classes.dex */
public interface hov {

    /* compiled from: ISerializerCache.kt */
    public static final class a<T> {
        public final T a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Serializer.StreamParcelable streamParcelable) {
            this.a = streamParcelable;
        }
    }

    <T extends Serializer.StreamParcelable> void a(String str, T t);

    io.reactivex.rxjava3.core.q b(String str, io.reactivex.rxjava3.core.w wVar);

    void c(String... strArr);
}
