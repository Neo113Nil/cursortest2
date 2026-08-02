package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import kotlin.LazyThreadSafetyMode;

/* compiled from: EmailActualizationBottomSheet.kt */
/* loaded from: classes18.dex */
public final class ubp {
    public final FragmentActivity a;
    public final String b;
    public final UserId c;
    public final pj1 d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final boolean f;
    public final Object g;
    public VkModal h;
    public VkButton i;
    public boolean j;

    public ubp() {
        throw null;
    }

    public ubp(Context context, FragmentActivity fragmentActivity, String str, String str2, UserId userId, pj1 pj1Var) {
        this.a = fragmentActivity;
        this.b = str2;
        this.c = userId;
        this.d = pj1Var;
        this.e = new io.reactivex.rxjava3.disposables.b();
        this.f = true ^ (str == null || drm0.N(str));
        this.g = msy.a(LazyThreadSafetyMode.NONE, new kbe(this, 18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final nbp a() {
        return (nbp) this.g.getValue();
    }
}
