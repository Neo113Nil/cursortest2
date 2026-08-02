package com.yandex.go.scooters.misc.action_dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.scooters.misc.action_dialog.ScootersActionDialogModalView;
import defpackage.aqm0;
import defpackage.ci91;
import defpackage.cma1;
import defpackage.cqm0;
import defpackage.e230;
import defpackage.eqm0;
import defpackage.evu0;
import defpackage.fqm0;
import defpackage.g18;
import defpackage.gqm0;
import defpackage.hqm0;
import defpackage.hxj0;
import defpackage.iqm0;
import defpackage.k1b1;
import defpackage.k7x0;
import defpackage.m7h0;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.ndl0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.t1w;
import defpackage.tje;
import defpackage.umm0;
import defpackage.w130;
import defpackage.w511;
import defpackage.wjh0;
import defpackage.xpm0;
import defpackage.y71;
import defpackage.zpm0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0014¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010'\u001a\u00020\u0013H\u0014¢\u0006\u0004\b'\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/yandex/go/scooters/misc/action_dialog/ScootersActionDialogModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lcqm0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lpwy0;", "themeSwitcherProvider", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "Liqm0;", "payload", "Leqm0;", "navigator", "<init>", "(Landroid/content/Context;Lpav;Lk7x0;Lpwy0;Lru/yandex/taxi/widget/c;Liqm0;Leqm0;)V", "Lzy11;", "bindConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isCloseButtonVisible", "bindCloseButton", "(Z)V", "bindIcon", "()V", "bindImage", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcqm0;", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "onDetachedFromWindow", "Lpav;", "Lk7x0;", "Lpwy0;", "Lru/yandex/taxi/widget/c;", "Liqm0;", "Leqm0;", "Lg18;", "loadIconCancellable", "Lg18;", "loadImageCancellable", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "closeButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersActionDialogModalView extends SlideableBindingModalView<cqm0> {
    public static final int $stable = 8;
    private FloatButtonIconComponent closeButton;
    private final c formattedTextConverter;
    private final pav imageLoader;
    private g18 loadIconCancellable;
    private g18 loadImageCancellable;
    private final eqm0 navigator;
    private final iqm0 payload;
    private final k7x0 tagUrlFormatter;
    private final pwy0 themeSwitcherProvider;

    public ScootersActionDialogModalView(Context context, pav pavVar, k7x0 k7x0Var, pwy0 pwy0Var, c cVar, iqm0 iqm0Var, eqm0 eqm0Var) {
        super(context);
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.themeSwitcherProvider = pwy0Var;
        this.formattedTextConverter = cVar;
        this.payload = iqm0Var;
        this.navigator = eqm0Var;
    }

    private final void bindCloseButton(boolean isCloseButtonVisible) {
        FloatButtonIconComponent floatButtonIconComponent = this.closeButton;
        if (!isCloseButtonVisible) {
            if (floatButtonIconComponent != null) {
                removeView(floatButtonIconComponent);
            }
            this.closeButton = null;
        } else if (floatButtonIconComponent == null) {
            this.closeButton = qdb1.c(this, new hxj0(26, this.navigator));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindCloseButton$close(eqm0 eqm0Var) {
        ((y71) ((ndl0) eqm0Var).b).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00df, code lost:
    
        if (r1 == r2) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bindConfig(Continuation<? super zy11> continuation) {
        ScootersActionDialogModalView$bindConfig$1 scootersActionDialogModalView$bindConfig$1;
        ScootersActionDialogModalView$bindConfig$1 scootersActionDialogModalView$bindConfig$12;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        FormattedText formattedText2;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        xpm0 xpm0Var;
        CharSequence charSequence10;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14;
        CharSequence charSequence15;
        CharSequence charSequence16;
        xpm0 xpm0Var2;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence charSequence19;
        CharSequence charSequence20;
        CharSequence charSequence21;
        CharSequence charSequence22;
        CharSequence charSequence23;
        CharSequence charSequence24;
        CharSequence charSequence25;
        xpm0 xpm0Var3;
        CharSequence charSequence26;
        CharSequence charSequence27;
        CharSequence charSequence28;
        CharSequence charSequence29;
        CharSequence charSequence30;
        CharSequence charSequence31;
        CharSequence charSequence32;
        CharSequence charSequence33;
        CharSequence charSequence34;
        CharSequence charSequence35;
        CharSequence charSequence36;
        xpm0 xpm0Var4;
        FormattedText formattedText3;
        Object e;
        CharSequence charSequence37;
        CharSequence charSequence38;
        CharSequence charSequence39;
        CharSequence charSequence40;
        CharSequence charSequence41;
        CharSequence charSequence42;
        if (continuation instanceof ScootersActionDialogModalView$bindConfig$1) {
            scootersActionDialogModalView$bindConfig$1 = (ScootersActionDialogModalView$bindConfig$1) continuation;
            int i = scootersActionDialogModalView$bindConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scootersActionDialogModalView$bindConfig$1.label = i - Integer.MIN_VALUE;
                scootersActionDialogModalView$bindConfig$12 = scootersActionDialogModalView$bindConfig$1;
                Object obj = scootersActionDialogModalView$bindConfig$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int i2 = 1;
                CharSequence charSequence43 = null;
                switch (scootersActionDialogModalView$bindConfig$12.label) {
                    case 0:
                        b.b(obj);
                        FormattedText formattedText4 = this.payload.c;
                        if (formattedText4 != null) {
                            c cVar = this.formattedTextConverter;
                            scootersActionDialogModalView$bindConfig$12.L$0 = null;
                            scootersActionDialogModalView$bindConfig$12.label = 1;
                            obj = c.e(cVar, formattedText4, null, false, scootersActionDialogModalView$bindConfig$12, 30);
                            break;
                        } else {
                            charSequence = null;
                            formattedText = this.payload.d;
                            if (formattedText == null) {
                                c cVar2 = this.formattedTextConverter;
                                scootersActionDialogModalView$bindConfig$12.L$0 = charSequence;
                                scootersActionDialogModalView$bindConfig$12.L$1 = null;
                                scootersActionDialogModalView$bindConfig$12.label = 2;
                                Object e2 = c.e(cVar2, formattedText, null, false, scootersActionDialogModalView$bindConfig$12, 30);
                                if (e2 != coroutineSingletons) {
                                    charSequence4 = charSequence;
                                    obj = e2;
                                    charSequence3 = (CharSequence) obj;
                                    charSequence2 = charSequence4;
                                    formattedText2 = this.payload.e;
                                    if (formattedText2 != null) {
                                        c cVar3 = this.formattedTextConverter;
                                        scootersActionDialogModalView$bindConfig$12.L$0 = charSequence2;
                                        scootersActionDialogModalView$bindConfig$12.L$1 = charSequence3;
                                        scootersActionDialogModalView$bindConfig$12.L$2 = null;
                                        scootersActionDialogModalView$bindConfig$12.label = 3;
                                        Object e3 = c.e(cVar3, formattedText2, null, false, scootersActionDialogModalView$bindConfig$12, 30);
                                        if (e3 != coroutineSingletons) {
                                            charSequence8 = charSequence3;
                                            obj = e3;
                                            charSequence9 = charSequence2;
                                            charSequence7 = (CharSequence) obj;
                                            charSequence6 = charSequence8;
                                            charSequence5 = charSequence9;
                                            xpm0Var = this.payload.g;
                                            if (xpm0Var != null) {
                                                c cVar4 = this.formattedTextConverter;
                                                FormattedText formattedText5 = xpm0Var.a;
                                                scootersActionDialogModalView$bindConfig$12.L$0 = charSequence5;
                                                scootersActionDialogModalView$bindConfig$12.L$1 = charSequence6;
                                                scootersActionDialogModalView$bindConfig$12.L$2 = charSequence7;
                                                scootersActionDialogModalView$bindConfig$12.L$3 = null;
                                                scootersActionDialogModalView$bindConfig$12.label = 4;
                                                Object e4 = c.e(cVar4, formattedText5, null, false, scootersActionDialogModalView$bindConfig$12, 30);
                                                if (e4 != coroutineSingletons) {
                                                    charSequence14 = charSequence7;
                                                    obj = e4;
                                                    charSequence15 = charSequence6;
                                                    charSequence16 = charSequence5;
                                                    charSequence13 = (CharSequence) obj;
                                                    charSequence12 = charSequence14;
                                                    charSequence11 = charSequence15;
                                                    charSequence10 = charSequence16;
                                                    xpm0Var2 = this.payload.g;
                                                    if (xpm0Var2 != null) {
                                                        FormattedText formattedText6 = xpm0Var2.b;
                                                        if (formattedText6 != null) {
                                                            c cVar5 = this.formattedTextConverter;
                                                            scootersActionDialogModalView$bindConfig$12.L$0 = charSequence10;
                                                            scootersActionDialogModalView$bindConfig$12.L$1 = charSequence11;
                                                            scootersActionDialogModalView$bindConfig$12.L$2 = charSequence12;
                                                            scootersActionDialogModalView$bindConfig$12.L$3 = charSequence13;
                                                            scootersActionDialogModalView$bindConfig$12.L$4 = null;
                                                            scootersActionDialogModalView$bindConfig$12.L$5 = null;
                                                            scootersActionDialogModalView$bindConfig$12.label = 5;
                                                            Object e5 = c.e(cVar5, formattedText6, null, false, scootersActionDialogModalView$bindConfig$12, 30);
                                                            if (e5 != coroutineSingletons) {
                                                                charSequence22 = charSequence13;
                                                                obj = e5;
                                                                charSequence23 = charSequence12;
                                                                charSequence24 = charSequence11;
                                                                charSequence25 = charSequence10;
                                                                charSequence21 = (CharSequence) obj;
                                                                charSequence12 = charSequence23;
                                                                charSequence11 = charSequence24;
                                                                charSequence10 = charSequence25;
                                                                charSequence17 = charSequence10;
                                                                charSequence18 = charSequence11;
                                                                charSequence19 = charSequence12;
                                                                charSequence20 = charSequence22;
                                                                xpm0Var3 = this.payload.h;
                                                                if (xpm0Var3 != null) {
                                                                    charSequence26 = charSequence17;
                                                                    charSequence27 = charSequence18;
                                                                    charSequence28 = charSequence19;
                                                                    charSequence29 = charSequence20;
                                                                    charSequence30 = charSequence21;
                                                                    charSequence31 = null;
                                                                    xpm0Var4 = this.payload.h;
                                                                    if (xpm0Var4 != null) {
                                                                        c cVar6 = this.formattedTextConverter;
                                                                        scootersActionDialogModalView$bindConfig$12.L$0 = charSequence26;
                                                                        scootersActionDialogModalView$bindConfig$12.L$1 = charSequence27;
                                                                        scootersActionDialogModalView$bindConfig$12.L$2 = charSequence28;
                                                                        scootersActionDialogModalView$bindConfig$12.L$3 = charSequence29;
                                                                        scootersActionDialogModalView$bindConfig$12.L$4 = charSequence30;
                                                                        scootersActionDialogModalView$bindConfig$12.L$5 = charSequence31;
                                                                        scootersActionDialogModalView$bindConfig$12.L$6 = null;
                                                                        scootersActionDialogModalView$bindConfig$12.L$7 = null;
                                                                        scootersActionDialogModalView$bindConfig$12.label = 7;
                                                                        e = c.e(cVar6, formattedText3, null, false, scootersActionDialogModalView$bindConfig$12, 30);
                                                                        if (e != coroutineSingletons) {
                                                                        }
                                                                    }
                                                                    if (charSequence26 != null) {
                                                                    }
                                                                    if (this.payload.a == null) {
                                                                    }
                                                                    getBinding().h.setText(charSequence26);
                                                                    getBinding().i.setText(charSequence26);
                                                                    getBinding().h.setVisibility((!r3 || r4) ? 8 : 0);
                                                                    getBinding().i.setVisibility((r3 && r4) ? 0 : 8);
                                                                    getBinding().g.setText(charSequence27);
                                                                    getBinding().b.setText(charSequence28);
                                                                    getBinding().e.setText(k1b1.a(getContext(), charSequence29 != null ? "" : charSequence29, charSequence30, false));
                                                                    getBinding().f.setText(k1b1.a(getContext(), charSequence31 != null ? charSequence31 : "", charSequence43, false));
                                                                    getBinding().e.setDebounceClickListener(new Runnable(this) { // from class: bqm0
                                                                        public final /* synthetic */ ScootersActionDialogModalView b;

                                                                        {
                                                                            this.b = this;
                                                                        }

                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            int i3 = r2;
                                                                            ScootersActionDialogModalView scootersActionDialogModalView = this.b;
                                                                            switch (i3) {
                                                                                case 0:
                                                                                    ScootersActionDialogModalView.bindConfig$lambda$7(scootersActionDialogModalView);
                                                                                    break;
                                                                                default:
                                                                                    ScootersActionDialogModalView.bindConfig$lambda$8(scootersActionDialogModalView);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    getBinding().f.setDebounceClickListener(new Runnable(this) { // from class: bqm0
                                                                        public final /* synthetic */ ScootersActionDialogModalView b;

                                                                        {
                                                                            this.b = this;
                                                                        }

                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            int i3 = i2;
                                                                            ScootersActionDialogModalView scootersActionDialogModalView = this.b;
                                                                            switch (i3) {
                                                                                case 0:
                                                                                    ScootersActionDialogModalView.bindConfig$lambda$7(scootersActionDialogModalView);
                                                                                    break;
                                                                                default:
                                                                                    ScootersActionDialogModalView.bindConfig$lambda$8(scootersActionDialogModalView);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    bindCloseButton(this.payload.f);
                                                                    getBinding().g.setVisibility((charSequence27 != null || evu0.J(charSequence27)) ? 8 : 0);
                                                                    getBinding().b.setVisibility((charSequence28 != null || evu0.J(charSequence28)) ? 8 : 0);
                                                                    getBinding().e.setVisibility((charSequence29 != null || evu0.J(charSequence29)) ? 8 : 0);
                                                                    getBinding().f.setVisibility((charSequence31 != null || evu0.J(charSequence31)) ? 8 : 0);
                                                                    bindIcon();
                                                                    bindImage();
                                                                    return zy11.a;
                                                                }
                                                                c cVar7 = this.formattedTextConverter;
                                                                FormattedText formattedText7 = xpm0Var3.a;
                                                                scootersActionDialogModalView$bindConfig$12.L$0 = charSequence17;
                                                                scootersActionDialogModalView$bindConfig$12.L$1 = charSequence18;
                                                                scootersActionDialogModalView$bindConfig$12.L$2 = charSequence19;
                                                                scootersActionDialogModalView$bindConfig$12.L$3 = charSequence20;
                                                                scootersActionDialogModalView$bindConfig$12.L$4 = charSequence21;
                                                                scootersActionDialogModalView$bindConfig$12.L$5 = null;
                                                                scootersActionDialogModalView$bindConfig$12.label = 6;
                                                                Object e6 = c.e(cVar7, formattedText7, null, false, scootersActionDialogModalView$bindConfig$12, 30);
                                                                if (e6 != coroutineSingletons) {
                                                                    charSequence32 = charSequence21;
                                                                    obj = e6;
                                                                    charSequence33 = charSequence20;
                                                                    charSequence34 = charSequence19;
                                                                    charSequence35 = charSequence18;
                                                                    charSequence36 = charSequence17;
                                                                    charSequence31 = (CharSequence) obj;
                                                                    charSequence30 = charSequence32;
                                                                    charSequence29 = charSequence33;
                                                                    charSequence28 = charSequence34;
                                                                    charSequence27 = charSequence35;
                                                                    charSequence26 = charSequence36;
                                                                    xpm0Var4 = this.payload.h;
                                                                    if (xpm0Var4 != null && (formattedText3 = xpm0Var4.b) != null) {
                                                                        c cVar62 = this.formattedTextConverter;
                                                                        scootersActionDialogModalView$bindConfig$12.L$0 = charSequence26;
                                                                        scootersActionDialogModalView$bindConfig$12.L$1 = charSequence27;
                                                                        scootersActionDialogModalView$bindConfig$12.L$2 = charSequence28;
                                                                        scootersActionDialogModalView$bindConfig$12.L$3 = charSequence29;
                                                                        scootersActionDialogModalView$bindConfig$12.L$4 = charSequence30;
                                                                        scootersActionDialogModalView$bindConfig$12.L$5 = charSequence31;
                                                                        scootersActionDialogModalView$bindConfig$12.L$6 = null;
                                                                        scootersActionDialogModalView$bindConfig$12.L$7 = null;
                                                                        scootersActionDialogModalView$bindConfig$12.label = 7;
                                                                        e = c.e(cVar62, formattedText3, null, false, scootersActionDialogModalView$bindConfig$12, 30);
                                                                        if (e != coroutineSingletons) {
                                                                            charSequence37 = charSequence31;
                                                                            obj = e;
                                                                            charSequence38 = charSequence30;
                                                                            charSequence39 = charSequence29;
                                                                            charSequence40 = charSequence28;
                                                                            charSequence41 = charSequence27;
                                                                            charSequence42 = charSequence26;
                                                                            charSequence43 = (CharSequence) obj;
                                                                            charSequence31 = charSequence37;
                                                                            charSequence30 = charSequence38;
                                                                            charSequence29 = charSequence39;
                                                                            charSequence28 = charSequence40;
                                                                            charSequence27 = charSequence41;
                                                                            charSequence26 = charSequence42;
                                                                        }
                                                                    }
                                                                    boolean z = charSequence26 != null || evu0.J(charSequence26);
                                                                    boolean z2 = this.payload.a == null;
                                                                    getBinding().h.setText(charSequence26);
                                                                    getBinding().i.setText(charSequence26);
                                                                    getBinding().h.setVisibility((!z || z2) ? 8 : 0);
                                                                    getBinding().i.setVisibility((z && z2) ? 0 : 8);
                                                                    getBinding().g.setText(charSequence27);
                                                                    getBinding().b.setText(charSequence28);
                                                                    getBinding().e.setText(k1b1.a(getContext(), charSequence29 != null ? "" : charSequence29, charSequence30, false));
                                                                    getBinding().f.setText(k1b1.a(getContext(), charSequence31 != null ? charSequence31 : "", charSequence43, false));
                                                                    getBinding().e.setDebounceClickListener(new Runnable(this) { // from class: bqm0
                                                                        public final /* synthetic */ ScootersActionDialogModalView b;

                                                                        {
                                                                            this.b = this;
                                                                        }

                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            int i3 = r2;
                                                                            ScootersActionDialogModalView scootersActionDialogModalView = this.b;
                                                                            switch (i3) {
                                                                                case 0:
                                                                                    ScootersActionDialogModalView.bindConfig$lambda$7(scootersActionDialogModalView);
                                                                                    break;
                                                                                default:
                                                                                    ScootersActionDialogModalView.bindConfig$lambda$8(scootersActionDialogModalView);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    getBinding().f.setDebounceClickListener(new Runnable(this) { // from class: bqm0
                                                                        public final /* synthetic */ ScootersActionDialogModalView b;

                                                                        {
                                                                            this.b = this;
                                                                        }

                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            int i3 = i2;
                                                                            ScootersActionDialogModalView scootersActionDialogModalView = this.b;
                                                                            switch (i3) {
                                                                                case 0:
                                                                                    ScootersActionDialogModalView.bindConfig$lambda$7(scootersActionDialogModalView);
                                                                                    break;
                                                                                default:
                                                                                    ScootersActionDialogModalView.bindConfig$lambda$8(scootersActionDialogModalView);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    bindCloseButton(this.payload.f);
                                                                    getBinding().g.setVisibility((charSequence27 != null || evu0.J(charSequence27)) ? 8 : 0);
                                                                    getBinding().b.setVisibility((charSequence28 != null || evu0.J(charSequence28)) ? 8 : 0);
                                                                    getBinding().e.setVisibility((charSequence29 != null || evu0.J(charSequence29)) ? 8 : 0);
                                                                    getBinding().f.setVisibility((charSequence31 != null || evu0.J(charSequence31)) ? 8 : 0);
                                                                    bindIcon();
                                                                    bindImage();
                                                                    return zy11.a;
                                                                }
                                                            }
                                                        } else {
                                                            charSequence22 = charSequence13;
                                                            charSequence21 = null;
                                                            charSequence17 = charSequence10;
                                                            charSequence18 = charSequence11;
                                                            charSequence19 = charSequence12;
                                                            charSequence20 = charSequence22;
                                                            xpm0Var3 = this.payload.h;
                                                            if (xpm0Var3 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        charSequence17 = charSequence10;
                                                        charSequence18 = charSequence11;
                                                        charSequence19 = charSequence12;
                                                        charSequence20 = charSequence13;
                                                        charSequence21 = null;
                                                        xpm0Var3 = this.payload.h;
                                                        if (xpm0Var3 != null) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                charSequence10 = charSequence5;
                                                charSequence11 = charSequence6;
                                                charSequence12 = charSequence7;
                                                charSequence13 = null;
                                                xpm0Var2 = this.payload.g;
                                                if (xpm0Var2 != null) {
                                                }
                                            }
                                        }
                                    } else {
                                        charSequence5 = charSequence2;
                                        charSequence6 = charSequence3;
                                        charSequence7 = null;
                                        xpm0Var = this.payload.g;
                                        if (xpm0Var != null) {
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            }
                            charSequence2 = charSequence;
                            charSequence3 = null;
                            formattedText2 = this.payload.e;
                            if (formattedText2 != null) {
                            }
                        }
                    case 1:
                        b.b(obj);
                        charSequence = (CharSequence) obj;
                        formattedText = this.payload.d;
                        if (formattedText == null) {
                        }
                        break;
                    case 2:
                        charSequence4 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$0;
                        b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        charSequence2 = charSequence4;
                        formattedText2 = this.payload.e;
                        if (formattedText2 != null) {
                        }
                        break;
                    case 3:
                        charSequence8 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$1;
                        charSequence9 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$0;
                        b.b(obj);
                        charSequence7 = (CharSequence) obj;
                        charSequence6 = charSequence8;
                        charSequence5 = charSequence9;
                        xpm0Var = this.payload.g;
                        if (xpm0Var != null) {
                        }
                        break;
                    case 4:
                        charSequence14 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$2;
                        charSequence15 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$1;
                        charSequence16 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$0;
                        b.b(obj);
                        charSequence13 = (CharSequence) obj;
                        charSequence12 = charSequence14;
                        charSequence11 = charSequence15;
                        charSequence10 = charSequence16;
                        xpm0Var2 = this.payload.g;
                        if (xpm0Var2 != null) {
                        }
                        break;
                    case 5:
                        charSequence22 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$3;
                        charSequence23 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$2;
                        charSequence24 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$1;
                        charSequence25 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$0;
                        b.b(obj);
                        charSequence21 = (CharSequence) obj;
                        charSequence12 = charSequence23;
                        charSequence11 = charSequence24;
                        charSequence10 = charSequence25;
                        charSequence17 = charSequence10;
                        charSequence18 = charSequence11;
                        charSequence19 = charSequence12;
                        charSequence20 = charSequence22;
                        xpm0Var3 = this.payload.h;
                        if (xpm0Var3 != null) {
                        }
                        break;
                    case 6:
                        charSequence32 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$4;
                        charSequence33 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$3;
                        charSequence34 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$2;
                        charSequence35 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$1;
                        charSequence36 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$0;
                        b.b(obj);
                        charSequence31 = (CharSequence) obj;
                        charSequence30 = charSequence32;
                        charSequence29 = charSequence33;
                        charSequence28 = charSequence34;
                        charSequence27 = charSequence35;
                        charSequence26 = charSequence36;
                        xpm0Var4 = this.payload.h;
                        if (xpm0Var4 != null) {
                        }
                        if (charSequence26 != null) {
                        }
                        if (this.payload.a == null) {
                        }
                        getBinding().h.setText(charSequence26);
                        getBinding().i.setText(charSequence26);
                        getBinding().h.setVisibility((!z || z2) ? 8 : 0);
                        getBinding().i.setVisibility((z && z2) ? 0 : 8);
                        getBinding().g.setText(charSequence27);
                        getBinding().b.setText(charSequence28);
                        getBinding().e.setText(k1b1.a(getContext(), charSequence29 != null ? "" : charSequence29, charSequence30, false));
                        getBinding().f.setText(k1b1.a(getContext(), charSequence31 != null ? charSequence31 : "", charSequence43, false));
                        getBinding().e.setDebounceClickListener(new Runnable(this) { // from class: bqm0
                            public final /* synthetic */ ScootersActionDialogModalView b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = r2;
                                ScootersActionDialogModalView scootersActionDialogModalView = this.b;
                                switch (i3) {
                                    case 0:
                                        ScootersActionDialogModalView.bindConfig$lambda$7(scootersActionDialogModalView);
                                        break;
                                    default:
                                        ScootersActionDialogModalView.bindConfig$lambda$8(scootersActionDialogModalView);
                                        break;
                                }
                            }
                        });
                        getBinding().f.setDebounceClickListener(new Runnable(this) { // from class: bqm0
                            public final /* synthetic */ ScootersActionDialogModalView b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i2;
                                ScootersActionDialogModalView scootersActionDialogModalView = this.b;
                                switch (i3) {
                                    case 0:
                                        ScootersActionDialogModalView.bindConfig$lambda$7(scootersActionDialogModalView);
                                        break;
                                    default:
                                        ScootersActionDialogModalView.bindConfig$lambda$8(scootersActionDialogModalView);
                                        break;
                                }
                            }
                        });
                        bindCloseButton(this.payload.f);
                        getBinding().g.setVisibility((charSequence27 != null || evu0.J(charSequence27)) ? 8 : 0);
                        getBinding().b.setVisibility((charSequence28 != null || evu0.J(charSequence28)) ? 8 : 0);
                        getBinding().e.setVisibility((charSequence29 != null || evu0.J(charSequence29)) ? 8 : 0);
                        getBinding().f.setVisibility((charSequence31 != null || evu0.J(charSequence31)) ? 8 : 0);
                        bindIcon();
                        bindImage();
                        return zy11.a;
                    case 7:
                        charSequence37 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$5;
                        charSequence38 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$4;
                        charSequence39 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$3;
                        charSequence40 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$2;
                        charSequence41 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$1;
                        charSequence42 = (CharSequence) scootersActionDialogModalView$bindConfig$12.L$0;
                        b.b(obj);
                        charSequence43 = (CharSequence) obj;
                        charSequence31 = charSequence37;
                        charSequence30 = charSequence38;
                        charSequence29 = charSequence39;
                        charSequence28 = charSequence40;
                        charSequence27 = charSequence41;
                        charSequence26 = charSequence42;
                        if (charSequence26 != null) {
                        }
                        if (this.payload.a == null) {
                        }
                        getBinding().h.setText(charSequence26);
                        getBinding().i.setText(charSequence26);
                        getBinding().h.setVisibility((!z || z2) ? 8 : 0);
                        getBinding().i.setVisibility((z && z2) ? 0 : 8);
                        getBinding().g.setText(charSequence27);
                        getBinding().b.setText(charSequence28);
                        getBinding().e.setText(k1b1.a(getContext(), charSequence29 != null ? "" : charSequence29, charSequence30, false));
                        getBinding().f.setText(k1b1.a(getContext(), charSequence31 != null ? charSequence31 : "", charSequence43, false));
                        getBinding().e.setDebounceClickListener(new Runnable(this) { // from class: bqm0
                            public final /* synthetic */ ScootersActionDialogModalView b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = r2;
                                ScootersActionDialogModalView scootersActionDialogModalView = this.b;
                                switch (i3) {
                                    case 0:
                                        ScootersActionDialogModalView.bindConfig$lambda$7(scootersActionDialogModalView);
                                        break;
                                    default:
                                        ScootersActionDialogModalView.bindConfig$lambda$8(scootersActionDialogModalView);
                                        break;
                                }
                            }
                        });
                        getBinding().f.setDebounceClickListener(new Runnable(this) { // from class: bqm0
                            public final /* synthetic */ ScootersActionDialogModalView b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i2;
                                ScootersActionDialogModalView scootersActionDialogModalView = this.b;
                                switch (i3) {
                                    case 0:
                                        ScootersActionDialogModalView.bindConfig$lambda$7(scootersActionDialogModalView);
                                        break;
                                    default:
                                        ScootersActionDialogModalView.bindConfig$lambda$8(scootersActionDialogModalView);
                                        break;
                                }
                            }
                        });
                        bindCloseButton(this.payload.f);
                        getBinding().g.setVisibility((charSequence27 != null || evu0.J(charSequence27)) ? 8 : 0);
                        getBinding().b.setVisibility((charSequence28 != null || evu0.J(charSequence28)) ? 8 : 0);
                        getBinding().e.setVisibility((charSequence29 != null || evu0.J(charSequence29)) ? 8 : 0);
                        getBinding().f.setVisibility((charSequence31 != null || evu0.J(charSequence31)) ? 8 : 0);
                        bindIcon();
                        bindImage();
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersActionDialogModalView$bindConfig$1 = new ScootersActionDialogModalView$bindConfig$1(this, continuation);
        scootersActionDialogModalView$bindConfig$12 = scootersActionDialogModalView$bindConfig$1;
        Object obj2 = scootersActionDialogModalView$bindConfig$12.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int i22 = 1;
        CharSequence charSequence432 = null;
        switch (scootersActionDialogModalView$bindConfig$12.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindConfig$lambda$7(ScootersActionDialogModalView scootersActionDialogModalView) {
        ((y71) ((ndl0) scootersActionDialogModalView.navigator).b).r(new umm0(8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindConfig$lambda$8(ScootersActionDialogModalView scootersActionDialogModalView) {
        ((y71) ((ndl0) scootersActionDialogModalView.navigator).b).r(new umm0(7));
    }

    private final void bindIcon() {
        hqm0 hqm0Var = this.payload.a;
        if (hqm0Var instanceof fqm0) {
            getBinding().c.setImageResource(((fqm0) hqm0Var).a);
            getBinding().c.setVisibility(0);
            return;
        }
        if (!(hqm0Var instanceof gqm0)) {
            if (hqm0Var == null) {
                getBinding().c.setVisibility(8);
                return;
            } else {
                w511.b();
                return;
            }
        }
        String str = ((gqm0) hqm0Var).a;
        nac nacVar = (nac) this.imageLoader.a(getBinding().c);
        nacVar.i = new aqm0(this, 1);
        nacVar.h = new zpm0(this, 2);
        this.loadIconCancellable = nacVar.c(((m7x0) this.tagUrlFormatter).a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindIcon$lambda$0$0(ScootersActionDialogModalView scootersActionDialogModalView) {
        scootersActionDialogModalView.getBinding().c.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindIcon$lambda$0$1(ScootersActionDialogModalView scootersActionDialogModalView, Drawable drawable) {
        scootersActionDialogModalView.getBinding().c.setVisibility(0);
        return zy11.a;
    }

    private final void bindImage() {
        g18 g18Var;
        String str = this.payload.b;
        if (str != null) {
            nac nacVar = (nac) this.imageLoader.a(getBinding().d);
            nacVar.i = new aqm0(this, 0);
            nacVar.h = new zpm0(this, 1);
            g18Var = nacVar.c(((m7x0) this.tagUrlFormatter).a(str));
        } else {
            g18Var = null;
        }
        this.loadImageCancellable = g18Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindImage$lambda$0$0(ScootersActionDialogModalView scootersActionDialogModalView) {
        scootersActionDialogModalView.getBinding().d.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindImage$lambda$0$1(ScootersActionDialogModalView scootersActionDialogModalView, Drawable drawable) {
        scootersActionDialogModalView.getBinding().d.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersActionDialogModalView scootersActionDialogModalView, t1w t1wVar) {
        View cardContentView = scootersActionDialogModalView.getCardContentView();
        cardContentView.setPadding(cardContentView.getPaddingLeft(), cardContentView.getPaddingTop(), cardContentView.getPaddingRight(), t1wVar.g);
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public cqm0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(wjh0.scooters_action_dialog_modal_view, parent, false);
        int i = m7h0.buttons_container;
        if (((GoLinearLayout) cma1.O(i, inflate)) != null) {
            i = m7h0.description;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = m7h0.icon;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = m7h0.image;
                    RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) cma1.O(i, inflate);
                    if (roundedCornersImageView != null) {
                        i = m7h0.primary_button;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent != null) {
                            i = m7h0.secondary_button;
                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                            if (buttonComponent2 != null) {
                                i = m7h0.subtitle;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView2 != null) {
                                    i = m7h0.title_variant_1;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                                    if (robotoTextView3 != null) {
                                        i = m7h0.title_variant_2;
                                        RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i, inflate);
                                        if (robotoTextView4 != null) {
                                            return new cqm0((GoLinearLayout) inflate, robotoTextView, goImageView, roundedCornersImageView, buttonComponent, buttonComponent2, robotoTextView2, robotoTextView3, robotoTextView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new zpm0(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tje.N(ci91.c(this), null, null, new ScootersActionDialogModalView$onAttachedToWindow$$inlined$collectIn$1(this.themeSwitcherProvider.a(), null, this), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.loadIconCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.loadIconCancellable = null;
        g18 g18Var2 = this.loadImageCancellable;
        if (g18Var2 != null) {
            g18Var2.cancel();
        }
        this.loadImageCancellable = null;
    }
}
