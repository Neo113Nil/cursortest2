package com.ybsdk.widgets.common.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.iq80;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/widgets/common/recycler/OrientationAwareRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "e", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/ybsdk/widgets/common/recycler/OrientationAwareRecyclerView$a;", ConfigConstants.CONFIG, "Lcom/ybsdk/widgets/common/recycler/OrientationAwareRecyclerView$a;", "getConfig", "()Lcom/ybsdk/widgets/common/recycler/OrientationAwareRecyclerView$a;", "setConfig", "(Lcom/ybsdk/widgets/common/recycler/OrientationAwareRecyclerView$a;)V", "", "lastX", "F", "lastY", "Companion", "a", "iq80", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrientationAwareRecyclerView extends RecyclerView {
    private static final int ANGLE_180 = 180;
    private static final iq80 Companion = new iq80();
    private static final int DEFAULT_SCROLL_ANGLE = 45;
    private a config;
    private float lastX;
    private float lastY;

    public /* synthetic */ OrientationAwareRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final a getConfig() {
        return this.config;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e) {
        RecyclerView.e layoutManager;
        if (this.config.a && (layoutManager = getLayoutManager()) != null) {
            Integer valueOf = e != null ? Integer.valueOf(e.getActionMasked()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                this.lastX = e.getX();
                this.lastY = e.getY();
            } else if (valueOf != null && valueOf.intValue() == 2) {
                double atan = (((float) Math.atan(Math.abs(e.getY() - this.lastY) / Math.abs(e.getX() - this.lastX))) / 3.141592653589793d) * 180.0d;
                Integer num = this.config.b;
                double intValue = num != null ? num.intValue() : 45;
                if (atan > intValue && !layoutManager.J()) {
                    return false;
                }
                if (atan < intValue && !layoutManager.I()) {
                    return false;
                }
            }
            return super.onInterceptTouchEvent(e);
        }
        return super.onInterceptTouchEvent(e);
    }

    public final void setConfig(a aVar) {
        this.config = aVar;
    }

    public static final class a {
        public final boolean a;
        public final Integer b;

        public a(boolean z, Integer num) {
            this.a = z;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "Config(isEnabled=" + this.a + ", scrollAngle=" + this.b + Extension.C_BRAKE;
        }

        public /* synthetic */ a(int i) {
            this(false, null);
        }

        public a() {
            this(0);
        }
    }

    public OrientationAwareRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrientationAwareRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public OrientationAwareRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.config = new a(0);
    }
}
