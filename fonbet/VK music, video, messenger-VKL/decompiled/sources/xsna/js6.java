package xsna;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.photogallery.PhotoGalleryView;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;
import xsna.l2f;
import xsna.nio0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class js6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ js6(DebugDevSettingsFragment debugDevSettingsFragment, uek uekVar) {
        this.b = 2;
        this.c = uekVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, java.lang.Boolean] */
    @Override // java.lang.Runnable
    public final void run() {
        View findFocus;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                BaseVkSearchView.P4((BaseVkSearchView) obj);
                return;
            case 1:
                l2f l2fVar = ((l2f.a) obj).f;
                if (l2fVar != null) {
                    l2fVar.n();
                    return;
                }
                return;
            case 2:
                String[] strArr = DebugDevSettingsFragment.t0;
                ((uek) obj).c();
                return;
            case 3:
                d3m.e((VkButton) obj, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 1000L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                return;
            case 4:
                ((MediaConnectionManagerImpl) obj).disconnectConfirmedCheck();
                return;
            case 5:
                ((PhotoGalleryView) obj).j.onPageSelected(0);
                return;
            case 6:
                nio0 nio0Var = (nio0) obj;
                i2x i2xVar = nio0Var.b;
                nio0Var.n = null;
                ci50<nio0.a> ci50Var = nio0Var.m;
                View view = nio0Var.a;
                if (!view.isFocused() && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    ci50Var.g();
                    return;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                nio0.a[] aVarArr = ci50Var.b;
                int i2 = ci50Var.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    nio0.a aVar = aVarArr[i3];
                    int i4 = nio0.b.$EnumSwitchMapping$0[aVar.ordinal()];
                    if (i4 == 1) {
                        ?? r9 = Boolean.TRUE;
                        ref$ObjectRef.element = r9;
                        ref$ObjectRef2.element = r9;
                    } else if (i4 == 2) {
                        ?? r92 = Boolean.FALSE;
                        ref$ObjectRef.element = r92;
                        ref$ObjectRef2.element = r92;
                    } else {
                        if (i4 != 3 && i4 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!epx.f(ref$ObjectRef.element, Boolean.FALSE)) {
                            ref$ObjectRef2.element = Boolean.valueOf(aVar == nio0.a.ShowKeyboard);
                        }
                    }
                }
                ci50Var.g();
                if (epx.f(ref$ObjectRef.element, Boolean.TRUE)) {
                    ((InputMethodManager) i2xVar.b.getValue()).restartInput(i2xVar.a);
                }
                Boolean bool = (Boolean) ref$ObjectRef2.element;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        i2xVar.c.a.b();
                    } else {
                        i2xVar.c.a.a();
                    }
                }
                if (epx.f(ref$ObjectRef.element, Boolean.FALSE)) {
                    ((InputMethodManager) i2xVar.b.getValue()).restartInput(i2xVar.a);
                    return;
                }
                return;
            case 7:
                com.vk.profile.core.cover.a aVar2 = ((UserProfileHeaderView) obj).t;
                com.vk.profile.core.cover.a aVar3 = aVar2 != null ? aVar2 : null;
                aVar3.a(aVar3.p);
                return;
            default:
                ((ru.mail.libverify.api.s) obj).B();
                return;
        }
    }

    public /* synthetic */ js6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
