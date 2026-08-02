package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.voip.VoipCallSource;
import com.vk.im.ui.fragments.im_calls_action.ImCallAction;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.phw0;

/* compiled from: ImCallsActionHandler.kt */
/* loaded from: classes2.dex */
public final class jyv {
    public final Context a;
    public final kyv b;
    public final phw0 c;

    /* compiled from: ImCallsActionHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImCallAction.values().length];
            try {
                iArr[ImCallAction.CREATE_WITH_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImCallAction.CREATE_SCHEDULED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImCallAction.GO_TO_CALLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jyv(FragmentActivity fragmentActivity, kyv kyvVar, phw0 phw0Var) {
        this.a = fragmentActivity;
        this.b = kyvVar;
        this.c = phw0Var;
    }

    public final io.reactivex.rxjava3.disposables.c a(ImCallAction imCallAction) {
        int i = a.$EnumSwitchMapping$0[imCallAction.ordinal()];
        kyv kyvVar = this.b;
        Context context = this.a;
        if (i == 1) {
            return com.vk.im.ui.calls.b.a(context, kyvVar, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_CREATE, MobileOfficialAppsCoreNavStat$EventScreen.IM));
        }
        a.m mVar = io.reactivex.rxjava3.internal.functions.a.b;
        if (i == 2) {
            this.c.e(new phw0.b(new WeakReference(context)));
            return new io.reactivex.rxjava3.disposables.f(mVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        kyvVar.q(context);
        return new io.reactivex.rxjava3.disposables.f(mVar);
    }
}
