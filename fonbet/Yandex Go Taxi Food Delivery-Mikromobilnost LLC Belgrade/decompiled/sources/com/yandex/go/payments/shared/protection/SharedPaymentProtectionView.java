package com.yandex.go.payments.shared.protection;

import android.content.Context;
import android.view.View;
import com.yandex.go.payments.shared.protection.SharedPaymentProtectionView;
import defpackage.d82;
import defpackage.e6h0;
import defpackage.luh0;
import defpackage.nm51;
import defpackage.oxf0;
import defpackage.pwf0;
import defpackage.zxf0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/payments/shared/protection/SharedPaymentProtectionView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lnm51;", "yandexProtectionPageTexts", "<init>", "(Landroid/content/Context;Lnm51;)V", "Lzy11;", "initListeners", "()V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Loxf0;", "linkAccountClickListener", "setLinkAccountClickListener", "(Loxf0;)V", "laterClickListener", "setLaterClickListener", "onBackPressListener", "setOnBackPressListener", "onBackPressed", "Landroid/view/View;", "Lru/yandex/taxi/design/ButtonComponent;", "laterButton", "Lru/yandex/taxi/design/ButtonComponent;", "linkAccountButton", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharedPaymentProtectionView extends ModalView {
    public static final int $stable = 8;
    private final View contentView;
    private final ButtonComponent laterButton;
    private Runnable laterClickListener;
    private final ButtonComponent linkAccountButton;
    private Runnable linkAccountClickListener;
    private Runnable onBackPressListener;

    public SharedPaymentProtectionView(Context context, nm51 nm51Var) {
        super(context);
        c.q(this, luh0.shared_payment_protection, true);
        this.contentView = findViewById(e6h0.shared_payment_protection_content);
        ButtonComponent buttonComponent = (ButtonComponent) findViewById(e6h0.shared_payment_protection_later);
        this.laterButton = buttonComponent;
        ButtonComponent buttonComponent2 = (ButtonComponent) findViewById(e6h0.shared_payment_protection_link_account);
        this.linkAccountButton = buttonComponent2;
        d82 d82Var = pwf0.c;
        this.linkAccountClickListener = d82Var;
        this.laterClickListener = d82Var;
        this.onBackPressListener = d82Var;
        initListeners();
        setDismissOnBackPressed(false);
        ((RobotoTextView) findViewById(e6h0.shared_payment_protection_title)).setText(nm51Var.a);
        ((ListTextComponent) findViewById(e6h0.shared_payment_protection_description)).setText(nm51Var.b);
        buttonComponent2.setText(nm51Var.c);
        buttonComponent.setText(nm51Var.d);
    }

    private final void initListeners() {
        final int i = 0;
        this.laterButton.setDebounceClickListener(new Runnable(this) { // from class: eor0
            public final /* synthetic */ SharedPaymentProtectionView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                SharedPaymentProtectionView sharedPaymentProtectionView = this.b;
                switch (i2) {
                    case 0:
                        SharedPaymentProtectionView.initListeners$lambda$0(sharedPaymentProtectionView);
                        break;
                    default:
                        SharedPaymentProtectionView.initListeners$lambda$1(sharedPaymentProtectionView);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.linkAccountButton.setOnClickListener(new Runnable(this) { // from class: eor0
            public final /* synthetic */ SharedPaymentProtectionView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                SharedPaymentProtectionView sharedPaymentProtectionView = this.b;
                switch (i22) {
                    case 0:
                        SharedPaymentProtectionView.initListeners$lambda$0(sharedPaymentProtectionView);
                        break;
                    default:
                        SharedPaymentProtectionView.initListeners$lambda$1(sharedPaymentProtectionView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$0(SharedPaymentProtectionView sharedPaymentProtectionView) {
        sharedPaymentProtectionView.laterClickListener.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$1(SharedPaymentProtectionView sharedPaymentProtectionView) {
        sharedPaymentProtectionView.linkAccountClickListener.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContentView() {
        return this.contentView;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.onBackPressListener.run();
    }

    public final void setLaterClickListener(oxf0 laterClickListener) {
        Object obj;
        if (laterClickListener == null) {
            obj = (zxf0) pwf0.c(oxf0.class);
        } else {
            ConcurrentHashMap concurrentHashMap = pwf0.a;
            obj = laterClickListener;
        }
        this.laterClickListener = (Runnable) obj;
    }

    public final void setLinkAccountClickListener(oxf0 linkAccountClickListener) {
        Object obj;
        if (linkAccountClickListener == null) {
            obj = (zxf0) pwf0.c(oxf0.class);
        } else {
            ConcurrentHashMap concurrentHashMap = pwf0.a;
            obj = linkAccountClickListener;
        }
        this.linkAccountClickListener = (Runnable) obj;
    }

    public final void setOnBackPressListener(oxf0 onBackPressListener) {
        Object obj;
        if (onBackPressListener == null) {
            obj = (zxf0) pwf0.c(oxf0.class);
        } else {
            ConcurrentHashMap concurrentHashMap = pwf0.a;
            obj = onBackPressListener;
        }
        this.onBackPressListener = (Runnable) obj;
    }
}
