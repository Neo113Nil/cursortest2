package xsna;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IntervalsLayersDrawable.kt */
/* loaded from: classes8.dex */
public final class vox extends LayerDrawable {
    public static final /* synthetic */ int i = 0;
    public final List<wjo> b;
    public final uox c;
    public final uox d;
    public final uox e;
    public final float f;
    public final float g;
    public final ArrayList h;

    public vox(List list, uox uoxVar, uox uoxVar2, uox uoxVar3, float f, float f2) {
        super(new Drawable[]{uoxVar, new ClipDrawable(uoxVar2, 8388611, 1), new ClipDrawable(uoxVar3, 8388611, 1)});
        this.b = list;
        this.c = uoxVar;
        this.d = uoxVar2;
        this.e = uoxVar3;
        this.f = f;
        this.g = f2;
        this.h = new ArrayList();
        setId(0, R.id.background);
        setId(1, R.id.secondaryProgress);
        setId(2, R.id.progress);
        a(getBounds());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if ((r2.c <= r5.c ? 65535 : 1) <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r5.equals(r2) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        r1.remove(r0);
        r1.remove(r0);
        r1.add(r0, new xsna.wjo(java.lang.Math.min(r12.a, r5.a), java.lang.Math.max(r12.b, r5.b)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Rect rect) {
        List<wjo> list = this.b;
        if (list.isEmpty() || rect.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.h;
        arrayList.clear();
        int width = rect.width();
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            float f = width;
            float f2 = list.get(i3).a * f;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f4 = this.g;
            float f5 = f2 + (i3 > 0 ? f4 / 2.0f : 0.0f);
            float f6 = list.get(i3).b * f;
            if (i3 < e43.h(list)) {
                f3 = f4 / 2.0f;
            }
            arrayList.add(new wjo(f5, f6 - f3));
            i3++;
        }
        do {
            wjo wjoVar = (wjo) arrayList.get(i2);
            if (wjoVar.c < this.f) {
                int i4 = i2 - 1;
                wjo wjoVar2 = (wjo) j5g.b0(i4, arrayList);
                int i5 = i2 + 1;
                wjo wjoVar3 = (wjo) j5g.b0(i5, arrayList);
                if (wjoVar2 == null || wjoVar3 == null) {
                }
            } else {
                i2++;
            }
        } while (i2 <= e43.h(arrayList));
        uox uoxVar = this.c;
        uoxVar.b = arrayList;
        uoxVar.invalidateSelf();
        uox uoxVar2 = this.d;
        uoxVar2.b = arrayList;
        uoxVar2.invalidateSelf();
        uox uoxVar3 = this.e;
        uoxVar3.b = arrayList;
        uoxVar3.invalidateSelf();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        a(rect);
        super.onBoundsChange(rect);
    }
}
