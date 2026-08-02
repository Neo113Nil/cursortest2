package xsna;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.vk.core.view.ArrowSendButton;
import com.vk.core.view.BottomConfirmButton;
import com.vk.core.view.search.ModernSearchView;

/* compiled from: PickerVc.kt */
/* loaded from: classes2.dex */
public final class xia0 {
    public final Activity a;
    public final a b;
    public final kkm c;
    public FrameLayout e;
    public BottomConfirmButton f;
    public EditText g;
    public ArrowSendButton h;
    public View i;
    public View j;
    public ModernSearchView k;
    public d98 l;
    public gzs<s3q0> m;
    public nh3 n;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 o = new bpn0(new x750(this, 9));
    public int p = -1;
    public final Handler q = new Handler(Looper.getMainLooper());

    public xia0(Activity activity, a aVar, kkm kkmVar) {
        this.a = activity;
        this.b = aVar;
        this.c = kkmVar;
    }

    /* compiled from: PickerVc.kt */
    public interface a {
        static {
            int i = C4007a.a;
        }

        default int o0(int i) {
            return -1;
        }

        default boolean p0() {
            return false;
        }

        default CharSequence t0() {
            return "";
        }

        /* compiled from: PickerVc.kt */
        /* renamed from: xsna.xia0$a$a, reason: collision with other inner class name */
        public static final class C4007a {
            public static final /* synthetic */ int a = 0;

            /* compiled from: PickerVc.kt */
            /* renamed from: xsna.xia0$a$a$a, reason: collision with other inner class name */
            public static final class C4008a implements a {
                @Override // xsna.xia0.a
                public final int o0(int i) {
                    return -1;
                }

                @Override // xsna.xia0.a
                public final boolean p0() {
                    return false;
                }

                @Override // xsna.xia0.a
                public final CharSequence t0() {
                    return "";
                }

                @Override // xsna.xia0.a
                public final void j() {
                }

                @Override // xsna.xia0.a
                public final void onDestroyView() {
                }

                @Override // xsna.xia0.a
                public final void q0() {
                }

                @Override // xsna.xia0.a
                public final void r0() {
                }

                @Override // xsna.xia0.a
                public final void s0() {
                }

                @Override // xsna.xia0.a
                public final void n0(float f) {
                }

                @Override // xsna.xia0.a
                public final void query(String str) {
                }
            }
        }

        default void j() {
        }

        default void onDestroyView() {
        }

        default void q0() {
        }

        default void r0() {
        }

        default void s0() {
        }

        default void n0(float f) {
        }

        default void query(String str) {
        }
    }
}
