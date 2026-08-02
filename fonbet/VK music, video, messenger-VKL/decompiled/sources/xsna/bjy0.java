package xsna;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.mxy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class bjy0 extends t1z0 {
    public final duy0 b;
    public final zvy0 c;
    public final auy0 d;
    public final auy0 e;
    public final auy0 f;
    public final FrameLayout g;

    public bjy0(Context context, mxy0 mxy0Var, mxy0 mxy0Var2, mxy0.b bVar) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        this.b = new duy0(context, mxy0Var2, bVar);
        this.c = new zvy0(context);
        c1z0 c1z0Var = new c1z0(context);
        auy0 auy0Var = new auy0(context);
        this.f = auy0Var;
        auy0Var.setVisibility(8);
        float f = 3;
        auy0Var.setPadding(c1z0Var.b(f));
        auy0Var.setOnClickListener(new z1q(mxy0Var, 7));
        auy0Var.a(o0z0.a("iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAYAAACM/rhtAAAACXBIWXMAABYlAAAWJQFJUiTwAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAACBSURBVHgB7ZfBCYAwEASDlaQES7RTS7CEMw/FX8zGFUVn4H4DO+grKQEAQJWIyOXm7bLbdwROcXA6qvqOwP2LNI2qPpEun0iXT6TL/1XkWG4RIiX/tkiXP6Sv8+pfTNyFuCzGSb4jbhbjmn3ien3ien1H4KSMxYOPpqYx1QcAgDorDzK9kn6/FDUAAAAASUVORK5CYII="), true);
        auy0Var.setBackgroundColor(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        float f2 = 22;
        float b = c1z0Var.b(f2);
        auy0Var.setClipToOutline(true);
        auy0Var.setOutlineProvider(new s1z0(b));
        addView(auy0Var);
        auy0 auy0Var2 = new auy0(context);
        this.e = auy0Var2;
        auy0Var2.setVisibility(8);
        auy0Var2.setPadding(c1z0Var.b(f));
        auy0Var2.setOnClickListener(new n14(mxy0Var, 9));
        auy0Var2.a(o0z0.a("iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAYAAACM/rhtAAAACXBIWXMAABYlAAAWJQFJUiTwAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAACkSURBVHgB7dVBCoQwEETRYi5ubl4zowiNqMR0pxOh/lKheAtNAKWUUu+P5MKtBc4it+yorXnY4NYQ1W+reJFH3H8TkXmQ3XEeZBquBZmOe4IchqtBDsfdIafB3SDnwe1dIAsC+iAmVj7L7+SbO/1xZsEVBlyL3XDm3VgkK46SYUg+OOfSkWw4hNOQdNwQ3ZEeXArSi7tCIiozXOAscksppdQEfQF8gtJN+jx0ZQAAAABJRU5ErkJggg=="), true);
        auy0Var2.setBackgroundColor(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        float b2 = c1z0Var.b(f2);
        auy0Var2.setClipToOutline(true);
        auy0Var2.setOutlineProvider(new s1z0(b2));
        addView(auy0Var2);
        auy0 auy0Var3 = new auy0(context);
        this.d = auy0Var3;
        int b3 = c1z0Var.b(6);
        int b4 = c1z0Var.b(9);
        auy0Var3.f = b3;
        auy0Var3.i = b3;
        auy0Var3.g = b4;
        auy0Var3.h = b4;
        auy0Var3.a(o0z0.a("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"), true);
        auy0Var3.setBackgroundColor(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        float b5 = c1z0Var.b(24);
        auy0Var3.setClipToOutline(true);
        auy0Var3.setOutlineProvider(new s1z0(b5));
        addView(auy0Var3);
    }

    @NonNull
    public auy0 getAdChoicesButton() {
        return this.d;
    }

    @NonNull
    public duy0 getInteractiveView() {
        return this.b;
    }

    @NonNull
    public zvy0 getPostView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        c1z0 c1z0Var = new c1z0(getContext());
        FrameLayout frameLayout = this.g;
        frameLayout.layout(0, 0, i5, i6);
        if (frameLayout.getChildCount() > 0) {
            frameLayout.getChildAt(0).layout(0, 0, i5, i6);
        }
        float f = 28;
        int b = c1z0Var.b(f);
        float f2 = 10;
        int b2 = i5 - c1z0Var.b(f2);
        float f3 = 8;
        int b3 = c1z0Var.b(f3);
        this.f.layout(b2 - b, b3, b2, b + b3);
        int b4 = c1z0Var.b(f);
        int b5 = i5 - c1z0Var.b(f2);
        int b6 = c1z0Var.b(f3);
        this.e.layout(b5 - b4, b6, b5, b4 + b6);
        int b7 = c1z0Var.b(90);
        int b8 = c1z0Var.b(f);
        int b9 = c1z0Var.b(f3);
        int b10 = c1z0Var.b(7);
        this.d.layout(b9, b10, b7 + b9, b8 + b10);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Context context = getContext();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        FrameLayout frameLayout = this.g;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        if (frameLayout.getChildCount() > 0) {
            frameLayout.getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        float f = 28;
        int a = (int) tj0.a(1, f, context);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(a, 1073741824), View.MeasureSpec.makeMeasureSpec(a, 1073741824));
        int applyDimension = (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
        this.f.measure(View.MeasureSpec.makeMeasureSpec(applyDimension, 1073741824), View.MeasureSpec.makeMeasureSpec(applyDimension, 1073741824));
        this.d.measure(View.MeasureSpec.makeMeasureSpec((int) tj0.a(1, 90, context), 1073741824), View.MeasureSpec.makeMeasureSpec((int) tj0.a(1, f, context), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
