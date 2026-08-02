package xsna;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: SensorsHelper.kt */
/* loaded from: classes17.dex */
public final class fki0 extends OrientationEventListener {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Integer> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fki0(io.reactivex.rxjava3.core.r<Integer> rVar, Context context) {
        super(context, 3);
        this.a = rVar;
        enable();
        if (canDetectOrientation()) {
            return;
        }
        rVar.onNext(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (r17 < 301) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0083, code lost:
    
        if (r17 < 301) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOrientationChanged(int i) {
        int i2;
        Integer num;
        if (i == -1) {
            return;
        }
        Integer num2 = gcd0.g;
        int i3 = 3;
        if (num2 != null) {
            i2 = num2.intValue();
            boolean z = i2 == 1 && 40 <= i && i < 161;
            boolean z2 = i2 == 2 && 120 <= i && i < 241;
            boolean z3 = i2 == 3 && 200 <= i && i < 321;
            boolean z4 = i2 == 0 && ((i >= 0 && i < 81) || (280 <= i && i < 361));
            if (!z && !z2 && !z3 && !z4) {
                if (60 > i || i >= 141) {
                    if (140 > i || i >= 221) {
                        if (220 <= i) {
                        }
                        i3 = 0;
                        i2 = i3;
                    }
                    i3 = 2;
                    i2 = i3;
                }
                i3 = 1;
                i2 = i3;
            }
            num = gcd0.g;
            if (num != null && i2 == num.intValue()) {
                return;
            }
            gcd0.g = Integer.valueOf(i2);
            this.a.onNext(Integer.valueOf(i2));
        }
        if (60 > i || i >= 141) {
            if (140 > i || i >= 221) {
                if (220 <= i) {
                }
                i3 = 0;
                i2 = i3;
                num = gcd0.g;
                if (num != null) {
                    return;
                }
                gcd0.g = Integer.valueOf(i2);
                this.a.onNext(Integer.valueOf(i2));
            }
            i3 = 2;
            i2 = i3;
            num = gcd0.g;
            if (num != null) {
            }
            gcd0.g = Integer.valueOf(i2);
            this.a.onNext(Integer.valueOf(i2));
        }
        i3 = 1;
        i2 = i3;
        num = gcd0.g;
        if (num != null) {
        }
        gcd0.g = Integer.valueOf(i2);
        this.a.onNext(Integer.valueOf(i2));
    }
}
