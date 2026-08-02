package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.DisclaimerType;

/* compiled from: DisclaimersDelegateImplOld.kt */
@ozl
/* loaded from: classes4.dex */
public final class i1n {
    public Drawable c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public final int h;
    public final Paint a = new Paint();
    public final Rect b = new Rect();
    public final Point i = new Point();

    /* compiled from: DisclaimersDelegateImplOld.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisclaimerType.values().length];
            try {
                iArr[DisclaimerType.DRUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisclaimerType.SUPPLEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisclaimerType.CREDITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisclaimerType.BANKRUPTCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisclaimerType.ENERGETICS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public i1n(Context context) {
        this.h = e3m.a(R.dimen.disclaimer_padding, context);
    }

    public static void a(View view, DisclaimerData disclaimerData, int i, int i2, Point point) {
        point.set(view.getWidth(), Math.max((int) ((view.getHeight() * disclaimerData.c) + e3m.a(R.dimen.disclaimer_strokes_offset, view.getContext()) + i + i2), (int) TypedValue.applyDimension(1, disclaimerData.d, view.getResources().getDisplayMetrics())));
    }
}
