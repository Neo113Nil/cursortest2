package com.yandex.go.shortcuts.impl.factory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bvf0;
import defpackage.eor;
import defpackage.ge6;
import defpackage.ib8;
import defpackage.jst;
import defpackage.mc6;
import defpackage.nac;
import defpackage.nc6;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pav;
import defpackage.ppr0;
import defpackage.q121;
import defpackage.syr0;
import defpackage.tyr0;
import defpackage.w511;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.coordinator.BottomSheetBottomFloatButtonBehavior;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonSingleComponent;

/* loaded from: classes13.dex */
public final class g implements syr0 {
    public final Context a;
    public final ru.yandex.taxi.widget.c b;
    public final pav c;

    public g(Context context, ru.yandex.taxi.widget.c cVar, pav pavVar) {
        this.a = context;
        this.b = cVar;
        this.c = pavVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, FormattedText formattedText, ContinuationImpl continuationImpl) {
        ShortcutBottomItemFactoryImpl$convertText$1 shortcutBottomItemFactoryImpl$convertText$1;
        int i;
        gVar.getClass();
        try {
            if (continuationImpl instanceof ShortcutBottomItemFactoryImpl$convertText$1) {
                shortcutBottomItemFactoryImpl$convertText$1 = (ShortcutBottomItemFactoryImpl$convertText$1) continuationImpl;
                int i2 = shortcutBottomItemFactoryImpl$convertText$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    shortcutBottomItemFactoryImpl$convertText$1.label = i2 - Integer.MIN_VALUE;
                    ShortcutBottomItemFactoryImpl$convertText$1 shortcutBottomItemFactoryImpl$convertText$12 = shortcutBottomItemFactoryImpl$convertText$1;
                    Object obj = shortcutBottomItemFactoryImpl$convertText$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = shortcutBottomItemFactoryImpl$convertText$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ru.yandex.taxi.widget.c cVar = gVar.b;
                        shortcutBottomItemFactoryImpl$convertText$12.L$0 = null;
                        shortcutBottomItemFactoryImpl$convertText$12.label = 1;
                        obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, shortcutBottomItemFactoryImpl$convertText$12, 30);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (CharSequence) obj;
                }
            }
            if (i != 0) {
            }
            return (CharSequence) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to convert formatted text for shortcut bottom item");
            return null;
        }
        shortcutBottomItemFactoryImpl$convertText$1 = new ShortcutBottomItemFactoryImpl$convertText$1(gVar, continuationImpl);
        ShortcutBottomItemFactoryImpl$convertText$1 shortcutBottomItemFactoryImpl$convertText$122 = shortcutBottomItemFactoryImpl$convertText$1;
        Object obj2 = shortcutBottomItemFactoryImpl$convertText$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutBottomItemFactoryImpl$convertText$122.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.yandex.go.shortcuts.impl.factory.g] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, eor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(nc6 nc6Var, ib8 ib8Var, Consumer consumer, ContinuationImpl continuationImpl) {
        ShortcutBottomItemFactoryImpl$create$3 shortcutBottomItemFactoryImpl$create$3;
        int i;
        ?? r7;
        ib8 ib8Var2;
        Consumer consumer2;
        nc6 nc6Var2;
        eor eorVar;
        Object obj;
        boolean z;
        if (continuationImpl instanceof ShortcutBottomItemFactoryImpl$create$3) {
            shortcutBottomItemFactoryImpl$create$3 = (ShortcutBottomItemFactoryImpl$create$3) continuationImpl;
            int i2 = shortcutBottomItemFactoryImpl$create$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutBottomItemFactoryImpl$create$3.label = i2 - Integer.MIN_VALUE;
                Object obj2 = shortcutBottomItemFactoryImpl$create$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutBottomItemFactoryImpl$create$3.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (nc6Var instanceof ge6) {
                        r7 = new FloatButtonSingleComponent(this.a, null, 0, 6, null);
                    } else {
                        if (!(nc6Var instanceof mc6)) {
                            if (nc6Var instanceof q121) {
                                ny61.g("There is no suitable component for ".concat(nc6Var.getClass().getName()));
                                return null;
                            }
                            w511.b();
                            return null;
                        }
                        r7 = new FloatButtonIconComponent(this.a, null, 0, 0, 14, null);
                    }
                    ViewGroup.LayoutParams layoutParams = r7.getLayoutParams();
                    CoordinatorLayout.LayoutParams layoutParams2 = layoutParams != null ? new CoordinatorLayout.LayoutParams(layoutParams) : new CoordinatorLayout.LayoutParams(-2, -2);
                    layoutParams2.setBehavior(new BottomSheetBottomFloatButtonBehavior());
                    r7.setLayoutParams(layoutParams2);
                    shortcutBottomItemFactoryImpl$create$3.L$0 = nc6Var;
                    ib8Var2 = ib8Var;
                    shortcutBottomItemFactoryImpl$create$3.L$1 = ib8Var2;
                    consumer2 = consumer;
                    shortcutBottomItemFactoryImpl$create$3.L$2 = consumer2;
                    shortcutBottomItemFactoryImpl$create$3.L$3 = r7;
                    shortcutBottomItemFactoryImpl$create$3.L$4 = r7;
                    shortcutBottomItemFactoryImpl$create$3.label = 1;
                    if (c(r7, nc6Var, shortcutBottomItemFactoryImpl$create$3) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    nc6Var2 = nc6Var;
                    eorVar = r7;
                    obj = r7;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = (eor) shortcutBottomItemFactoryImpl$create$3.L$4;
                    eorVar = (eor) shortcutBottomItemFactoryImpl$create$3.L$3;
                    consumer2 = (Consumer) shortcutBottomItemFactoryImpl$create$3.L$2;
                    ?? r6 = (Consumer) shortcutBottomItemFactoryImpl$create$3.L$1;
                    nc6 nc6Var3 = (nc6) shortcutBottomItemFactoryImpl$create$3.L$0;
                    kotlin.b.b(obj2);
                    obj = obj3;
                    nc6Var2 = nc6Var3;
                    ib8Var2 = r6;
                }
                z = obj instanceof FloatButtonIconComponent;
                if (z && (nc6Var2 instanceof mc6)) {
                    AppCompatImageView icon = ((FloatButtonIconComponent) obj).getIcon();
                    String str = ((mc6) nc6Var2).h;
                    nac nacVar = (nac) this.c.a(icon);
                    nacVar.h = new tyr0(icon, 0);
                    nacVar.b(new obv(str, null, 6, 0));
                }
                if (z) {
                    ((View) obj).setContentDescription(nc6Var2.d);
                }
                ru.yandex.taxi.design.utils.c.z(new ppr0(2, consumer2, nc6Var2), (View) obj);
                ib8Var2.accept(eorVar);
                return zy11.a;
            }
        }
        shortcutBottomItemFactoryImpl$create$3 = new ShortcutBottomItemFactoryImpl$create$3(this, continuationImpl);
        Object obj22 = shortcutBottomItemFactoryImpl$create$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutBottomItemFactoryImpl$create$3.label;
        if (i != 0) {
        }
        z = obj instanceof FloatButtonIconComponent;
        if (z) {
            AppCompatImageView icon2 = ((FloatButtonIconComponent) obj).getIcon();
            String str2 = ((mc6) nc6Var2).h;
            nac nacVar2 = (nac) this.c.a(icon2);
            nacVar2.h = new tyr0(icon2, 0);
            nacVar2.b(new obv(str2, null, 6, 0));
        }
        if (z) {
        }
        ru.yandex.taxi.design.utils.c.z(new ppr0(2, consumer2, nc6Var2), (View) obj);
        ib8Var2.accept(eorVar);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(eor eorVar, nc6 nc6Var, ContinuationImpl continuationImpl) {
        ShortcutBottomItemFactoryImpl$initText$1 shortcutBottomItemFactoryImpl$initText$1;
        int i;
        if (continuationImpl instanceof ShortcutBottomItemFactoryImpl$initText$1) {
            shortcutBottomItemFactoryImpl$initText$1 = (ShortcutBottomItemFactoryImpl$initText$1) continuationImpl;
            int i2 = shortcutBottomItemFactoryImpl$initText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutBottomItemFactoryImpl$initText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutBottomItemFactoryImpl$initText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutBottomItemFactoryImpl$initText$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if ((eorVar instanceof FloatButtonSingleComponent) && (nc6Var instanceof ge6)) {
                    ShortcutBottomItemFactoryImpl$initText$2 shortcutBottomItemFactoryImpl$initText$2 = new ShortcutBottomItemFactoryImpl$initText$2(eorVar, this, nc6Var, null);
                    shortcutBottomItemFactoryImpl$initText$1.L$0 = null;
                    shortcutBottomItemFactoryImpl$initText$1.L$1 = null;
                    shortcutBottomItemFactoryImpl$initText$1.label = 1;
                    if (bvf0.n(shortcutBottomItemFactoryImpl$initText$2, shortcutBottomItemFactoryImpl$initText$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        shortcutBottomItemFactoryImpl$initText$1 = new ShortcutBottomItemFactoryImpl$initText$1(this, continuationImpl);
        Object obj2 = shortcutBottomItemFactoryImpl$initText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutBottomItemFactoryImpl$initText$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
