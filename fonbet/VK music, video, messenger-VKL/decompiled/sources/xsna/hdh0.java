package xsna;

import android.app.Activity;
import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.voip.ui.join.directly.withpreview.JoinCallActivity;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;

/* compiled from: ScreenType.kt */
/* loaded from: classes3.dex */
public abstract class hdh0 {

    /* compiled from: ScreenType.kt */
    public static final class a extends hdh0 {
        public final Class<? extends FragmentImpl> a = JoinCallFragment.class;
        public final Class<? extends Activity> b = JoinCallActivity.class;

        public final Class<? extends Activity> a() {
            return this.b;
        }

        public final Class<? extends FragmentImpl> b() {
            return this.a;
        }
    }

    /* compiled from: ScreenType.kt */
    public static final class b extends hdh0 {
        public final Class<? extends FragmentImpl> a;

        public b(Class<? extends FragmentImpl> cls) {
            this.a = cls;
        }

        public final Class<? extends FragmentImpl> a() {
            return this.a;
        }
    }

    static {
        new b(gdh0.class);
        new b(gdh0.class);
        new Bundle();
        new b(gdh0.class);
        new Bundle();
        new b(gdh0.class);
        new Bundle();
    }
}
