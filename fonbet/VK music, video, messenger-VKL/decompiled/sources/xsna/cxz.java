package xsna;

import android.content.Context;

/* compiled from: LocalizedText.kt */
/* loaded from: classes5.dex */
public interface cxz<T> {

    /* compiled from: LocalizedText.kt */
    public static final class a implements cxz<Object> {
        public static final a a = new a();

        @Override // xsna.cxz
        public final String a(Context context, Object obj) {
            return obj.toString();
        }

        public final String toString() {
            return "toString";
        }
    }

    String a(Context context, Object obj);
}
