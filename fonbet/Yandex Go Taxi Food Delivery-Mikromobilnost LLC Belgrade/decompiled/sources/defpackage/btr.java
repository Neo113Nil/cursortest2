package defpackage;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes4.dex */
public final class btr {
    public final FlutterJNI a;

    public btr(FlutterJNI flutterJNI) {
        this.a = flutterJNI;
    }

    public static boolean a(int i) {
        return (48 <= i && i <= 57) || i == 35 || i == 42;
    }
}
