package xsna;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: GalleryFilesCounter.kt */
/* loaded from: classes6.dex */
public interface m3t {

    /* compiled from: GalleryFilesCounter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final m3t STUB = new C3320a();

        /* compiled from: GalleryFilesCounter.kt */
        /* renamed from: xsna.m3t$a$a, reason: collision with other inner class name */
        public static final class C3320a implements m3t {
            @Override // xsna.m3t
            public final io.reactivex.rxjava3.core.x<JSONObject> a(Context context) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }
        }

        public final m3t getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.x<JSONObject> a(Context context);
}
