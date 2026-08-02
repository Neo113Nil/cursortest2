package xsna;

import com.google.gson.JsonIOException;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes13.dex */
public final class x6j implements jp70<Object> {
    public final /* synthetic */ String b;

    public x6j(String str) {
        this.b = str;
    }

    @Override // xsna.jp70
    public final Object h() {
        throw new JsonIOException(this.b);
    }
}
