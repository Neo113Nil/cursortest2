package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import defpackage.aes;
import defpackage.bes;
import defpackage.gcs;
import defpackage.i2i0;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;

/* loaded from: classes.dex */
class FragmentLayoutInflaterFactory implements LayoutInflater.Factory2 {
    private static final String TAG = "FragmentManager";
    final FragmentManager mFragmentManager;

    public FragmentLayoutInflaterFactory(FragmentManager fragmentManager) {
        this.mFragmentManager = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        final w g;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.mFragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i2i0.Fragment);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(i2i0.Fragment_android_name);
            }
            int resourceId = obtainStyledAttributes.getResourceId(i2i0.Fragment_android_id, -1);
            String string = obtainStyledAttributes.getString(i2i0.Fragment_android_tag);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = Fragment.class.isAssignableFrom(m.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        kbs.e(attributeSet.getPositionDescription(), ": Must specify unique android:id, android:tag, or have a parent with an id for ", attributeValue);
                        return null;
                    }
                    Fragment E = resourceId != -1 ? this.mFragmentManager.E(resourceId) : null;
                    if (E == null && string != null) {
                        E = this.mFragmentManager.F(string);
                    }
                    if (E == null && id != -1) {
                        E = this.mFragmentManager.E(id);
                    }
                    if (E == null) {
                        E = this.mFragmentManager.M().a(context.getClassLoader(), attributeValue);
                        E.mFromLayout = true;
                        E.mFragmentId = resourceId != 0 ? resourceId : id;
                        E.mContainerId = id;
                        E.mTag = string;
                        E.mInLayout = true;
                        FragmentManager fragmentManager = this.mFragmentManager;
                        E.mFragmentManager = fragmentManager;
                        gcs gcsVar = fragmentManager.x;
                        E.mHost = gcsVar;
                        E.onInflate((Context) gcsVar.b, attributeSet, E.mSavedFragmentState);
                        g = this.mFragmentManager.a(E);
                        if (FragmentManager.O(2)) {
                            E.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (E.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        E.mInLayout = true;
                        FragmentManager fragmentManager2 = this.mFragmentManager;
                        E.mFragmentManager = fragmentManager2;
                        gcs gcsVar2 = fragmentManager2.x;
                        E.mHost = gcsVar2;
                        E.onInflate((Context) gcsVar2.b, attributeSet, E.mSavedFragmentState);
                        g = this.mFragmentManager.g(E);
                        if (FragmentManager.O(2)) {
                            E.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    aes aesVar = bes.a;
                    bes.b(new FragmentTagUsageViolation(E, viewGroup));
                    bes.a(E).getClass();
                    E.mContainer = viewGroup;
                    g.i();
                    g.h();
                    View view2 = E.mView;
                    if (view2 == null) {
                        ny61.r(oyr.p("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (E.mView.getTag() == null) {
                        E.mView.setTag(string);
                    }
                    E.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentLayoutInflaterFactory.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view3) {
                            w wVar = g;
                            Fragment fragment = wVar.c;
                            wVar.i();
                            g.j((ViewGroup) fragment.mView.getParent(), FragmentLayoutInflaterFactory.this.mFragmentManager).i();
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view3) {
                        }
                    });
                    return E.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
