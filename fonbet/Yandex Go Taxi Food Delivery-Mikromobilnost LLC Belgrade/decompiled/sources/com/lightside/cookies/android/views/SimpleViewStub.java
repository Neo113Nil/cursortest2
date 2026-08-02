package com.lightside.cookies.android.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import defpackage.j38;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.xbi0;
import defpackage.z941;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u001e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010 R\"\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u001dR0\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R/\u00104\u001a\u0004\u0018\u00010\u00012\b\u0010/\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010\u0011¨\u00065"}, d2 = {"Lcom/lightside/cookies/android/views/SimpleViewStub;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "view", "Landroid/view/ViewGroup;", "parent", "Lzy11;", "replaceSelfWithView", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "setId", "(Landroid/view/View;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "visibility", "setVisibility", "(I)V", FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE, "()Landroid/view/View;", "(Landroid/view/View;)Landroid/view/View;", "replacedId", CA20Status.STATUS_USER_I, "getReplacedId", "()I", "setReplacedId", "Lkotlin/Function0;", "viewSupplier", "Lsls;", "getViewSupplier", "()Lsls;", "setViewSupplier", "(Lsls;)V", "getViewSupplier$annotations", "()V", "<set-?>", "replacedViewRef$delegate", "Lxbi0;", "getReplacedViewRef", "setReplacedViewRef", "replacedViewRef", "android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SimpleViewStub extends View {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    private int replacedId;

    /* renamed from: replacedViewRef$delegate, reason: from kotlin metadata */
    private final xbi0 replacedViewRef;
    private sls viewSupplier;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("replacedViewRef", 0, "getReplacedViewRef()Landroid/view/View;", SimpleViewStub.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{mutablePropertyReference1Impl};
    }

    public SimpleViewStub(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.replacedId = -1;
        this.replacedViewRef = new z941(0);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private final View getReplacedViewRef() {
        return (View) this.replacedViewRef.getValue(this, $$delegatedProperties[0]);
    }

    public static /* synthetic */ void getViewSupplier$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View replace$lambda$2(View view) {
        return view;
    }

    private final void replaceSelfWithView(View view, ViewGroup parent) {
        int indexOfChild = parent.indexOfChild(this);
        parent.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            parent.addView(view, indexOfChild, layoutParams);
        } else {
            parent.addView(view, indexOfChild);
        }
    }

    private final void setId(View view) {
        int i = this.replacedId;
        if (i != -1) {
            view.setId(i);
        } else if (getId() != -1) {
            view.setId(getId());
            setId(-1);
        }
    }

    private final void setReplacedViewRef(View view) {
        this.replacedViewRef.setValue(this, $$delegatedProperties[0], view);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public final int getReplacedId() {
        return this.replacedId;
    }

    public final sls getViewSupplier() {
        return this.viewSupplier;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public final View replace() {
        View view;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            ny61.r("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        sls slsVar = this.viewSupplier;
        if (slsVar == null || (view = (View) slsVar.invoke()) == null) {
            ny61.g("ViewStub must have a valid viewSupplier");
            return null;
        }
        replaceSelfWithView(view, viewGroup);
        setId(view);
        setReplacedViewRef(view);
        this.viewSupplier = null;
        return view;
    }

    public final void setReplacedId(int i) {
        this.replacedId = i;
    }

    public final void setViewSupplier(sls slsVar) {
        this.viewSupplier = slsVar;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        if (getReplacedViewRef() != null) {
            View replacedViewRef = getReplacedViewRef();
            if (replacedViewRef != null) {
                replacedViewRef.setVisibility(visibility);
                return;
            }
            return;
        }
        super.setVisibility(visibility);
        if (visibility == 0 || visibility == 4) {
            replace();
        }
    }

    public SimpleViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SimpleViewStub(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SimpleViewStub(Context context) {
        this(context, null, 0, 6, null);
    }

    public final View replace(View view) {
        this.viewSupplier = new j38(view, 3);
        return replace();
    }
}
