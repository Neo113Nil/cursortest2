package xsna;

import android.os.Bundle;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.json.JSONObject;

/* compiled from: StatisticsBridge.kt */
/* loaded from: classes15.dex */
public interface pyk0 {
    void a();

    void b(Object obj, String str);

    JSONObject c();

    Set<String> d();

    void e(String str, Bundle bundle);

    boolean f(String str);

    String getDeviceInfo();

    /* compiled from: StatisticsBridge.kt */
    public static final class a implements pyk0 {
        public static final /* synthetic */ a a = new a();

        @Override // xsna.pyk0
        public final JSONObject c() {
            return new JSONObject();
        }

        @Override // xsna.pyk0
        public final Set<String> d() {
            return EmptySet.b;
        }

        @Override // xsna.pyk0
        public final boolean f(String str) {
            return false;
        }

        @Override // xsna.pyk0
        public final String getDeviceInfo() {
            return new String();
        }

        @Override // xsna.pyk0
        public final void a() {
        }

        @Override // xsna.pyk0
        public final void b(Object obj, String str) {
        }

        @Override // xsna.pyk0
        public final void e(String str, Bundle bundle) {
        }
    }
}
