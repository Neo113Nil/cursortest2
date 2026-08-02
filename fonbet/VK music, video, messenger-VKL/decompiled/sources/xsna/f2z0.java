package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.a520;
import xsna.f2z0;
import xsna.j7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class f2z0 extends FrameLayout implements j7z0.a {
    public final ListView b;
    public final View c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final String g;
    public final WeakReference h;
    public ImageButton i;
    public WeakReference j;
    public b520 k;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a extends BaseAdapter {
        public final ArrayList b;
        public final WeakReference c;

        public a(ArrayList arrayList, WeakReference weakReference) {
            this.b = arrayList;
            this.c = weakReference;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.b.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return this.b.get(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(final int i, View view, ViewGroup viewGroup) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: xsna.e2z0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f2z0.a aVar = f2z0.a.this;
                    ArrayList arrayList = aVar.b;
                    int i2 = i;
                    if (i2 < 0 || i2 >= arrayList.size()) {
                        return;
                    }
                    f2z0.b bVar = (f2z0.b) arrayList.get(i2);
                    a520.a aVar2 = (a520.a) aVar.c.get();
                    if (aVar2 != null && (bVar instanceof f2z0.c)) {
                        aVar2.a(((f2z0.c) bVar).a);
                    }
                }
            };
            b bVar = (b) this.b.get(i);
            if (!(bVar instanceof c)) {
                if (!(bVar instanceof d)) {
                    gu8.e(null, "AdChoicesOptionsView: Unknown subtype of AdChoicesItem - ".concat(bVar.getClass().getName()));
                    return null;
                }
                String str = ((d) bVar).a;
                boolean z = i == 0;
                Context context = viewGroup.getContext();
                TextView textView = new TextView(context);
                int a = (int) tj0.a(1, 24, context);
                int a2 = (int) tj0.a(1, 14, context);
                float f = 8;
                int a3 = (int) tj0.a(1, f, context);
                textView.setClickable(false);
                textView.setEnabled(false);
                textView.setPadding(a, a2, a, a3);
                textView.setTextColor(-9602939);
                textView.setTypeface(null, 0);
                textView.setTextSize(13.0f);
                textView.setGravity(8388611);
                textView.setLayoutParams(new RecyclerView.p(-1, -2));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-1);
                if (z) {
                    float a4 = (int) tj0.a(1, f, context);
                    gradientDrawable.setCornerRadii(new float[]{a4, a4, a4, a4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
                }
                textView.setBackground(gradientDrawable);
                textView.setText(str);
                return textView;
            }
            String str2 = ((c) bVar).a.a;
            boolean z2 = i == 0;
            Context context2 = viewGroup.getContext();
            Button button = new Button(context2);
            button.setOnClickListener(onClickListener);
            int a5 = (int) tj0.a(1, 24, context2);
            button.setPadding(a5, button.getPaddingTop(), a5, button.getPaddingBottom());
            button.setAllCaps(false);
            button.setStateListAnimator(null);
            button.setLines(1);
            button.setTextColor(-16777216);
            button.setEllipsize(TextUtils.TruncateAt.END);
            button.setTypeface(null, 0);
            button.setGravity(8388627);
            button.setLayoutParams(new RecyclerView.p(-1, -2));
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-1, -1});
            GradientDrawable gradientDrawable3 = new GradientDrawable(orientation, new int[]{-3158065, -3158065});
            if (z2) {
                float a6 = (int) tj0.a(1, 8, context2);
                float[] fArr = {a6, a6, a6, a6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                gradientDrawable2.setCornerRadii(fArr);
                gradientDrawable3.setCornerRadii(fArr);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable3);
            int[] iArr = StateSet.WILD_CARD;
            stateListDrawable.addState(iArr, gradientDrawable2);
            button.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, iArr}, new int[]{c1z0.c(-3158065), c1z0.c(-1)}), stateListDrawable, null));
            button.setText(str2);
            return button;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface b {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class c implements b {
        public final b520 a;

        public c(b520 b520Var) {
            this.a = b520Var;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class d implements b {
        public final String a;

        public d(String str) {
            this.a = str;
        }
    }

    public f2z0(Context context, ArrayList arrayList, String str, WeakReference weakReference) {
        super(context);
        this.k = null;
        this.f = new ArrayList(arrayList);
        this.g = str;
        this.h = weakReference;
        this.d = (int) tj0.a(1, 500, context);
        this.e = (int) tj0.a(1, 0.5f, context);
        ListView listView = new ListView(context);
        this.b = listView;
        listView.setSelector(R.color.transparent);
        listView.setDivider(null);
        addView(listView);
        View view = new View(context);
        this.c = view;
        view.setBackgroundColor(-5131855);
        addView(view);
    }

    @Override // xsna.j7z0.a
    public final void c(j7z0 j7z0Var, FrameLayout frameLayout) {
        frameLayout.addView(this, -1, -1);
        TranslateAnimation translateAnimation = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 512.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(true);
        this.b.startAnimation(translateAnimation);
    }

    @Override // xsna.j7z0.a
    public final void m() {
        b520 b520Var;
        WeakReference weakReference = this.j;
        if (weakReference != null) {
            weakReference.clear();
            this.j = null;
            a520.a aVar = (a520.a) this.h.get();
            if (aVar == null || (b520Var = this.k) == null) {
                return;
            }
            aVar.a(b520Var);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int measuredHeight;
        ListView listView = this.b;
        int max = Math.max((i3 - listView.getMeasuredWidth()) / 2, getPaddingLeft());
        ImageButton imageButton = this.i;
        View view = this.c;
        if (imageButton != null) {
            imageButton.layout(max, (i4 - getPaddingBottom()) - this.i.getMeasuredHeight(), this.i.getMeasuredWidth() + max, i4 - getPaddingBottom());
            paddingBottom = this.i.getTop();
            measuredHeight = view.getMeasuredHeight();
        } else {
            paddingBottom = i4 - getPaddingBottom();
            measuredHeight = view.getMeasuredHeight();
        }
        view.layout(max, paddingBottom - measuredHeight, view.getMeasuredWidth() + max, paddingBottom);
        listView.layout(max, view.getTop() - listView.getMeasuredHeight(), listView.getMeasuredWidth() + max, view.getTop());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = (Math.min(size, this.d) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.measure(makeMeasureSpec, paddingTop);
            i3 = this.i.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        View view = this.c;
        int i4 = this.e;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((paddingTop - i4) - i3, Integer.MIN_VALUE));
        setMeasuredDimension(size, size2);
    }

    @Override // xsna.j7z0.a
    public final void b(boolean z) {
    }
}
