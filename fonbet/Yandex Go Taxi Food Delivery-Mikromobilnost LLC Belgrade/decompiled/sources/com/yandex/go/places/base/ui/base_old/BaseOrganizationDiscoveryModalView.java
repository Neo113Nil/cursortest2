package com.yandex.go.places.base.ui.base_old;

import android.content.Context;
import defpackage.f02;
import defpackage.i3y;
import defpackage.j65;
import defpackage.jxi;
import defpackage.ofp0;
import defpackage.sls;
import defpackage.uh6;
import defpackage.z55;
import defpackage.zo31;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@jxi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 -*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001.B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\f8\u0014X\u0094D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010&8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/yandex/go/places/base/ui/base_old/BaseOrganizationDiscoveryModalView;", "Lzo31;", "T", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Landroid/content/Context;", "context", "Lj65;", "presenter", "", "manualInit", "", "customAnchoredHeight", "", "customAnchoredHeightAsScreenPercent", "<init>", "(Landroid/content/Context;Lj65;ZLjava/lang/Integer;Ljava/lang/Float;)V", "", "screenName", "()Ljava/lang/String;", "canHandleScreenTracking", "()Z", "Lzy11;", "onAppearAnimationComplete", "()V", "Lj65;", "getPresenter", "()Lj65;", "Ljava/lang/Integer;", "Ljava/lang/Float;", "anchorHeightPercent", "F", "getAnchorHeightPercent", "()F", "anchorHeight$delegate", "Li3y;", "getAnchorHeight", "()I", "anchorHeight", "Lkotlin/Function0;", "oneShotAppearAnimationCompleteListener", "Lsls;", "getOneShotAppearAnimationCompleteListener", "()Lsls;", "setOneShotAppearAnimationCompleteListener", "(Lsls;)V", "Companion", "z55", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseOrganizationDiscoveryModalView<T extends zo31> extends SlideableBindingModalView<T> {
    private static final z55 Companion = new z55();
    private static final float MODAL_VIEW_ANCHOR_PERCENT_MULTIPLIER = 0.5f;

    /* renamed from: anchorHeight$delegate, reason: from kotlin metadata */
    private final i3y anchorHeight;
    private final float anchorHeightPercent;
    private final Integer customAnchoredHeight;
    private final Float customAnchoredHeightAsScreenPercent;
    private sls oneShotAppearAnimationCompleteListener;
    private final j65 presenter;

    public BaseOrganizationDiscoveryModalView(Context context, j65 j65Var, boolean z, Integer num, Float f) {
        super(context, z);
        this.presenter = j65Var;
        this.customAnchoredHeight = num;
        this.customAnchoredHeightAsScreenPercent = f;
        this.anchorHeightPercent = 0.5f;
        this.anchorHeight = a.b(LazyThreadSafetyMode.NONE, new f02(26, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int anchorHeight_delegate$lambda$0(BaseOrganizationDiscoveryModalView baseOrganizationDiscoveryModalView) {
        Float f = baseOrganizationDiscoveryModalView.customAnchoredHeightAsScreenPercent;
        if (f != null) {
            return (int) (ofp0.c * f.floatValue());
        }
        if (baseOrganizationDiscoveryModalView.customAnchoredHeight != null) {
            return (int) uh6.o(r0.intValue());
        }
        return (int) (baseOrganizationDiscoveryModalView.getAnchorHeightPercent() * ofp0.c);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    public final int getAnchorHeight() {
        return ((Number) this.anchorHeight.getValue()).intValue();
    }

    public float getAnchorHeightPercent() {
        return this.anchorHeightPercent;
    }

    public final sls getOneShotAppearAnimationCompleteListener() {
        return this.oneShotAppearAnimationCompleteListener;
    }

    public j65 getPresenter() {
        return this.presenter;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        sls slsVar = this.oneShotAppearAnimationCompleteListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.oneShotAppearAnimationCompleteListener = null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public abstract String getModalScreenName();

    public final void setOneShotAppearAnimationCompleteListener(sls slsVar) {
        this.oneShotAppearAnimationCompleteListener = slsVar;
    }

    public /* synthetic */ BaseOrganizationDiscoveryModalView(Context context, j65 j65Var, boolean z, Integer num, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, j65Var, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : f);
    }
}
